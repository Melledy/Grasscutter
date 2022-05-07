package emu.grasscutter.command.handler;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.function.Consumer;

@Builder
@Getter
public final class HandlerContext {

    @NotNull
    @Singular("content")
    private SortedMap<String, Object> content;
    @Nullable
    private Consumer<Object> messageConsumer;
    @Nullable
    private Consumer<Object> resultConsumer;
    @Nullable
    private Consumer<Throwable> errorConsumer;

    /**
     * Get a required argument from the context.
     * @param name argument name
     * @param clazz type of the argument
     * @return the argument if it exists
     * @throws NoSuchElementException if argument associated with such a key doesn't exist
     * @throws IllegalArgumentException if casting to given type failed
     */
    @SuppressWarnings("unchecked")
    public <T> T getRequired(@NotNull String name, Class<T> clazz)
            throws NoSuchElementException, IllegalArgumentException {
        // no such data
        Object result = content.get(name);
        if (result == null) {
            throw new NoSuchElementException("%s not found in context.".formatted(name));
        }

        // convert to given type
        if (Primitive2BoxedType.getOrDefault(clazz, clazz).isAssignableFrom(result.getClass())) {
            return (T) result;
        }
        // cast failed
        throw new IllegalArgumentException(
                "Cannot cast from %s to %s."
                        .formatted(result.getClass().getSimpleName(), clazz.getSimpleName())
        );
    }

    /**
     * Get an optional argument from the context.
     * @param name argument name
     * @param defaultValue default value of this argument
     * @return the argument, or the default value if such argument is not found
     */
    @SuppressWarnings("unchecked")
    public <T> T getOptional(@NotNull String name, T defaultValue) throws IllegalArgumentException {
        try {
            return (T) getRequired(name, defaultValue.getClass());
        } catch (NoSuchElementException ignored) {
            return defaultValue;
        }
    }

    /**
     * <p>Pass the result so that others can display.</p>
     * <b>Notice: </b><p>Code under this will NOT be executed.</p>
     * @param result the result of this handler
     */
    public void returnWith(Object result) throws HandlerSuccess {
        if (resultConsumer != null) {
            resultConsumer.accept(result);
        }
        throw new HandlerSuccess();
    }

    /**
     * <p>Report an error to the callback. The following code will be executed.</p>
     * <p>You do <b>NOT</b> need this before an error is thrown. It will be called automatically.</p>
     * @param error the error
     */
    public void errorAndContinue(Throwable error) {
        if (errorConsumer != null) {
            errorConsumer.accept(error);
        }
    }

    public void notify(Object message) {
        if (messageConsumer != null) {
            messageConsumer.accept(message);
        }
    }

    private static final Map<Class<?>, Class<?>> Primitive2BoxedType = new HashMap<>();
    static {
        Primitive2BoxedType.put(boolean.class, Boolean.class);
        Primitive2BoxedType.put(byte.class, Byte.class);
        Primitive2BoxedType.put(short.class, Short.class);
        Primitive2BoxedType.put(char.class, Character.class);
        Primitive2BoxedType.put(int.class, Integer.class);
        Primitive2BoxedType.put(long.class, Long.class);
        Primitive2BoxedType.put(float.class, Float.class);
        Primitive2BoxedType.put(double.class, Double.class);
    }
}
