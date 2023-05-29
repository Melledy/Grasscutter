// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KJMKBCOLJKO.proto

package emu.grasscutter.net.proto;

public final class KJMKBCOLJKOOuterClass {
    private KJMKBCOLJKOOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface KJMKBCOLJKOOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:KJMKBCOLJKO)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 retcode = 4;</code>
         *
         * @return The retcode.
         */
        int getRetcode();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 5097
     * </pre>
     *
     * Protobuf type {@code KJMKBCOLJKO}
     */
    public static final class KJMKBCOLJKO extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:KJMKBCOLJKO)
            KJMKBCOLJKOOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use KJMKBCOLJKO.newBuilder() to construct.
        private KJMKBCOLJKO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private KJMKBCOLJKO() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new KJMKBCOLJKO();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private KJMKBCOLJKO(
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
                        case 32:
                            {
                                retcode_ = input.readInt32();
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
            return emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.internal_static_KJMKBCOLJKO_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass
                    .internal_static_KJMKBCOLJKO_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO.class,
                            emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO.Builder.class);
        }

        public static final int RETCODE_FIELD_NUMBER = 4;
        private int retcode_;
        /**
         * <code>int32 retcode = 4;</code>
         *
         * @return The retcode.
         */
        @java.lang.Override
        public int getRetcode() {
            return retcode_;
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
            if (retcode_ != 0) {
                output.writeInt32(4, retcode_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (retcode_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, retcode_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO other =
                    (emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO) obj;

            if (getRetcode() != other.getRetcode()) return false;
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
            hash = (37 * hash) + RETCODE_FIELD_NUMBER;
            hash = (53 * hash) + getRetcode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO parseFrom(
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
                emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO prototype) {
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
        /**
         *
         *
         * <pre>
         * CmdId: 5097
         * </pre>
         *
         * Protobuf type {@code KJMKBCOLJKO}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:KJMKBCOLJKO)
                emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKOOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass
                        .internal_static_KJMKBCOLJKO_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass
                        .internal_static_KJMKBCOLJKO_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO.class,
                                emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO.newBuilder()
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
                retcode_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass
                        .internal_static_KJMKBCOLJKO_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO build() {
                emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO buildPartial() {
                emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO result =
                        new emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO(this);
                result.retcode_ = retcode_;
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
                if (other instanceof emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO) {
                    return mergeFrom((emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO other) {
                if (other
                        == emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO.getDefaultInstance())
                    return this;
                if (other.getRetcode() != 0) {
                    setRetcode(other.getRetcode());
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
                emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int retcode_;
            /**
             * <code>int32 retcode = 4;</code>
             *
             * @return The retcode.
             */
            @java.lang.Override
            public int getRetcode() {
                return retcode_;
            }
            /**
             * <code>int32 retcode = 4;</code>
             *
             * @param value The retcode to set.
             * @return This builder for chaining.
             */
            public Builder setRetcode(int value) {

                retcode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 retcode = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRetcode() {

                retcode_ = 0;
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

            // @@protoc_insertion_point(builder_scope:KJMKBCOLJKO)
        }

        // @@protoc_insertion_point(class_scope:KJMKBCOLJKO)
        private static final emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO();
        }

        public static emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<KJMKBCOLJKO> PARSER =
                new com.google.protobuf.AbstractParser<KJMKBCOLJKO>() {
                    @java.lang.Override
                    public KJMKBCOLJKO parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new KJMKBCOLJKO(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<KJMKBCOLJKO> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<KJMKBCOLJKO> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.KJMKBCOLJKOOuterClass.KJMKBCOLJKO getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_KJMKBCOLJKO_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_KJMKBCOLJKO_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021KJMKBCOLJKO.proto\"\036\n\013KJMKBCOLJKO\022\017\n\007re"
                    + "tcode\030\004 \001(\005B\033\n\031emu.grasscutter.net.proto"
                    + "b\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_KJMKBCOLJKO_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_KJMKBCOLJKO_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_KJMKBCOLJKO_descriptor,
                        new java.lang.String[] {
                            "Retcode",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
