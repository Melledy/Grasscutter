// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FireWorkInstance.proto

package emu.grasscutter.net.proto;

public final class FireWorkInstanceOuterClass {
    private FireWorkInstanceOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface FireWorkInstanceOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:FireWorkInstance)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.FireWorkType type = 1;</code>
         *
         * @return The enum numeric value on the wire for type.
         */
        int getTypeValue();
        /**
         * <code>.FireWorkType type = 1;</code>
         *
         * @return The type.
         */
        emu.grasscutter.net.proto.FireWorkTypeOuterClass.FireWorkType getType();

        /**
         * <code>int32 value = 2;</code>
         *
         * @return The value.
         */
        int getValue();
    }
    /** Protobuf type {@code FireWorkInstance} */
    public static final class FireWorkInstance extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:FireWorkInstance)
            FireWorkInstanceOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use FireWorkInstance.newBuilder() to construct.
        private FireWorkInstance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private FireWorkInstance() {
            type_ = 0;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new FireWorkInstance();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private FireWorkInstance(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            {
                                int rawValue = input.readEnum();

                                type_ = rawValue;
                                break;
                            }
                        case 16:
                            {
                                value_ = input.readInt32();
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.FireWorkInstanceOuterClass
                    .internal_static_FireWorkInstance_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.FireWorkInstanceOuterClass
                    .internal_static_FireWorkInstance_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance.class,
                            emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance.Builder.class);
        }

        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;
        /**
         * <code>.FireWorkType type = 1;</code>
         *
         * @return The enum numeric value on the wire for type.
         */
        @java.lang.Override
        public int getTypeValue() {
            return type_;
        }
        /**
         * <code>.FireWorkType type = 1;</code>
         *
         * @return The type.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.FireWorkTypeOuterClass.FireWorkType getType() {
            @SuppressWarnings("deprecation")
            emu.grasscutter.net.proto.FireWorkTypeOuterClass.FireWorkType result =
                    emu.grasscutter.net.proto.FireWorkTypeOuterClass.FireWorkType.valueOf(type_);
            return result == null
                    ? emu.grasscutter.net.proto.FireWorkTypeOuterClass.FireWorkType.UNRECOGNIZED
                    : result;
        }

        public static final int VALUE_FIELD_NUMBER = 2;
        private int value_;
        /**
         * <code>int32 value = 2;</code>
         *
         * @return The value.
         */
        @java.lang.Override
        public int getValue() {
            return value_;
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (type_
                    != emu.grasscutter.net.proto.FireWorkTypeOuterClass.FireWorkType.FireWorkType_ODJKANKMPPJ
                            .getNumber()) {
                output.writeEnum(1, type_);
            }
            if (value_ != 0) {
                output.writeInt32(2, value_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (type_
                    != emu.grasscutter.net.proto.FireWorkTypeOuterClass.FireWorkType.FireWorkType_ODJKANKMPPJ
                            .getNumber()) {
                size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, type_);
            }
            if (value_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, value_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance other =
                    (emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance) obj;

            if (type_ != other.type_) return false;
            if (getValue() != other.getValue()) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + TYPE_FIELD_NUMBER;
            hash = (53 * hash) + type_;
            hash = (37 * hash) + VALUE_FIELD_NUMBER;
            hash = (53 * hash) + getValue();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /** Protobuf type {@code FireWorkInstance} */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:FireWorkInstance)
                emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstanceOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.FireWorkInstanceOuterClass
                        .internal_static_FireWorkInstance_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.FireWorkInstanceOuterClass
                        .internal_static_FireWorkInstance_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance.class,
                                emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                type_ = 0;

                value_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.FireWorkInstanceOuterClass
                        .internal_static_FireWorkInstance_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance build() {
                emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance buildPartial() {
                emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance result =
                        new emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance(this);
                result.type_ = type_;
                result.value_ = value_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other
                        instanceof emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance other) {
                if (other
                        == emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance
                                .getDefaultInstance()) return this;
                if (other.type_ != 0) {
                    setTypeValue(other.getTypeValue());
                }
                if (other.getValue() != 0) {
                    setValue(other.getValue());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int type_ = 0;
            /**
             * <code>.FireWorkType type = 1;</code>
             *
             * @return The enum numeric value on the wire for type.
             */
            @java.lang.Override
            public int getTypeValue() {
                return type_;
            }
            /**
             * <code>.FireWorkType type = 1;</code>
             *
             * @param value The enum numeric value on the wire for type to set.
             * @return This builder for chaining.
             */
            public Builder setTypeValue(int value) {

                type_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>.FireWorkType type = 1;</code>
             *
             * @return The type.
             */
            @java.lang.Override
            public emu.grasscutter.net.proto.FireWorkTypeOuterClass.FireWorkType getType() {
                @SuppressWarnings("deprecation")
                emu.grasscutter.net.proto.FireWorkTypeOuterClass.FireWorkType result =
                        emu.grasscutter.net.proto.FireWorkTypeOuterClass.FireWorkType.valueOf(type_);
                return result == null
                        ? emu.grasscutter.net.proto.FireWorkTypeOuterClass.FireWorkType.UNRECOGNIZED
                        : result;
            }
            /**
             * <code>.FireWorkType type = 1;</code>
             *
             * @param value The type to set.
             * @return This builder for chaining.
             */
            public Builder setType(emu.grasscutter.net.proto.FireWorkTypeOuterClass.FireWorkType value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                type_ = value.getNumber();
                onChanged();
                return this;
            }
            /**
             * <code>.FireWorkType type = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearType() {

                type_ = 0;
                onChanged();
                return this;
            }

            private int value_;
            /**
             * <code>int32 value = 2;</code>
             *
             * @return The value.
             */
            @java.lang.Override
            public int getValue() {
                return value_;
            }
            /**
             * <code>int32 value = 2;</code>
             *
             * @param value The value to set.
             * @return This builder for chaining.
             */
            public Builder setValue(int value) {

                value_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 value = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearValue() {

                value_ = 0;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:FireWorkInstance)
        }

        // @@protoc_insertion_point(class_scope:FireWorkInstance)
        private static final emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance();
        }

        public static emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<FireWorkInstance> PARSER =
                new com.google.protobuf.AbstractParser<FireWorkInstance>() {
                    @java.lang.Override
                    public FireWorkInstance parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new FireWorkInstance(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<FireWorkInstance> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<FireWorkInstance> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.FireWorkInstanceOuterClass.FireWorkInstance
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_FireWorkInstance_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_FireWorkInstance_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\026FireWorkInstance.proto\032\022FireWorkType.p"
                    + "roto\">\n\020FireWorkInstance\022\033\n\004type\030\001 \001(\0162\r"
                    + ".FireWorkType\022\r\n\005value\030\002 \001(\005B\033\n\031emu.gras"
                    + "scutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.FireWorkTypeOuterClass.getDescriptor(),
                        });
        internal_static_FireWorkInstance_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FireWorkInstance_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_FireWorkInstance_descriptor,
                        new java.lang.String[] {
                            "Type", "Value",
                        });
        emu.grasscutter.net.proto.FireWorkTypeOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
