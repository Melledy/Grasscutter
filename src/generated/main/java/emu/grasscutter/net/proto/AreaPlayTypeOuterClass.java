// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AreaPlayType.proto

package emu.grasscutter.net.proto;

public final class AreaPlayTypeOuterClass {
    private AreaPlayTypeOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }
    /**
     *
     *
     * <pre>
     * Obf: KAJOBPDKGLN
     * </pre>
     *
     * Protobuf enum {@code AreaPlayType}
     */
    public enum AreaPlayType implements com.google.protobuf.ProtocolMessageEnum {
        /** <code>AREA_PLAY_NONE = 0;</code> */
        AREA_PLAY_NONE(0),
        /** <code>AREA_PLAY_CLIMATE = 1;</code> */
        AREA_PLAY_CLIMATE(1),
        /** <code>AREA_PLAY_REGIONAL_PLAY = 2;</code> */
        AREA_PLAY_REGIONAL_PLAY(2),
        UNRECOGNIZED(-1),
        ;

        /** <code>AREA_PLAY_NONE = 0;</code> */
        public static final int AREA_PLAY_NONE_VALUE = 0;
        /** <code>AREA_PLAY_CLIMATE = 1;</code> */
        public static final int AREA_PLAY_CLIMATE_VALUE = 1;
        /** <code>AREA_PLAY_REGIONAL_PLAY = 2;</code> */
        public static final int AREA_PLAY_REGIONAL_PLAY_VALUE = 2;

        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static AreaPlayType valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static AreaPlayType forNumber(int value) {
            switch (value) {
                case 0:
                    return AREA_PLAY_NONE;
                case 1:
                    return AREA_PLAY_CLIMATE;
                case 2:
                    return AREA_PLAY_REGIONAL_PLAY;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<AreaPlayType> internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<AreaPlayType> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<AreaPlayType>() {
                    public AreaPlayType findValueByNumber(int number) {
                        return AreaPlayType.forNumber(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalStateException(
                        "Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return emu.grasscutter.net.proto.AreaPlayTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }

        private static final AreaPlayType[] VALUES = values();

        public static AreaPlayType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private AreaPlayType(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:AreaPlayType)
    }

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\022AreaPlayType.proto*V\n\014AreaPlayType\022\022\n\016"
                    + "AREA_PLAY_NONE\020\000\022\025\n\021AREA_PLAY_CLIMATE\020\001\022"
                    + "\033\n\027AREA_PLAY_REGIONAL_PLAY\020\002B\033\n\031emu.gras"
                    + "scutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
