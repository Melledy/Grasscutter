// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GIFCAAMOIHO.proto

package emu.grasscutter.net.proto;

public final class GIFCAAMOIHOOuterClass {
    private GIFCAAMOIHOOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface GIFCAAMOIHOOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:GIFCAAMOIHO)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bool is_accept = 15;</code>
         *
         * @return The isAccept.
         */
        boolean getIsAccept();

        /**
         * <code>uint32 uid = 7;</code>
         *
         * @return The uid.
         */
        int getUid();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 9272
     * </pre>
     *
     * Protobuf type {@code GIFCAAMOIHO}
     */
    public static final class GIFCAAMOIHO extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:GIFCAAMOIHO)
            GIFCAAMOIHOOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use GIFCAAMOIHO.newBuilder() to construct.
        private GIFCAAMOIHO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GIFCAAMOIHO() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new GIFCAAMOIHO();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GIFCAAMOIHO(
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
                        case 56:
                            {
                                uid_ = input.readUInt32();
                                break;
                            }
                        case 120:
                            {
                                isAccept_ = input.readBool();
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
            return emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.internal_static_GIFCAAMOIHO_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass
                    .internal_static_GIFCAAMOIHO_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO.class,
                            emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO.Builder.class);
        }

        public static final int IS_ACCEPT_FIELD_NUMBER = 15;
        private boolean isAccept_;
        /**
         * <code>bool is_accept = 15;</code>
         *
         * @return The isAccept.
         */
        @java.lang.Override
        public boolean getIsAccept() {
            return isAccept_;
        }

        public static final int UID_FIELD_NUMBER = 7;
        private int uid_;
        /**
         * <code>uint32 uid = 7;</code>
         *
         * @return The uid.
         */
        @java.lang.Override
        public int getUid() {
            return uid_;
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
            if (uid_ != 0) {
                output.writeUInt32(7, uid_);
            }
            if (isAccept_ != false) {
                output.writeBool(15, isAccept_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (uid_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(7, uid_);
            }
            if (isAccept_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(15, isAccept_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO other =
                    (emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO) obj;

            if (getIsAccept() != other.getIsAccept()) return false;
            if (getUid() != other.getUid()) return false;
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
            hash = (37 * hash) + IS_ACCEPT_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsAccept());
            hash = (37 * hash) + UID_FIELD_NUMBER;
            hash = (53 * hash) + getUid();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO parseFrom(
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
                emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO prototype) {
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
         * CmdId: 9272
         * </pre>
         *
         * Protobuf type {@code GIFCAAMOIHO}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:GIFCAAMOIHO)
                emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHOOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass
                        .internal_static_GIFCAAMOIHO_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass
                        .internal_static_GIFCAAMOIHO_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO.class,
                                emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO.newBuilder()
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
                isAccept_ = false;

                uid_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass
                        .internal_static_GIFCAAMOIHO_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO build() {
                emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO buildPartial() {
                emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO result =
                        new emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO(this);
                result.isAccept_ = isAccept_;
                result.uid_ = uid_;
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
                if (other instanceof emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO) {
                    return mergeFrom((emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO other) {
                if (other
                        == emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO.getDefaultInstance())
                    return this;
                if (other.getIsAccept() != false) {
                    setIsAccept(other.getIsAccept());
                }
                if (other.getUid() != 0) {
                    setUid(other.getUid());
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
                emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private boolean isAccept_;
            /**
             * <code>bool is_accept = 15;</code>
             *
             * @return The isAccept.
             */
            @java.lang.Override
            public boolean getIsAccept() {
                return isAccept_;
            }
            /**
             * <code>bool is_accept = 15;</code>
             *
             * @param value The isAccept to set.
             * @return This builder for chaining.
             */
            public Builder setIsAccept(boolean value) {

                isAccept_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_accept = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsAccept() {

                isAccept_ = false;
                onChanged();
                return this;
            }

            private int uid_;
            /**
             * <code>uint32 uid = 7;</code>
             *
             * @return The uid.
             */
            @java.lang.Override
            public int getUid() {
                return uid_;
            }
            /**
             * <code>uint32 uid = 7;</code>
             *
             * @param value The uid to set.
             * @return This builder for chaining.
             */
            public Builder setUid(int value) {

                uid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 uid = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearUid() {

                uid_ = 0;
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

            // @@protoc_insertion_point(builder_scope:GIFCAAMOIHO)
        }

        // @@protoc_insertion_point(class_scope:GIFCAAMOIHO)
        private static final emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO();
        }

        public static emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<GIFCAAMOIHO> PARSER =
                new com.google.protobuf.AbstractParser<GIFCAAMOIHO>() {
                    @java.lang.Override
                    public GIFCAAMOIHO parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GIFCAAMOIHO(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<GIFCAAMOIHO> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GIFCAAMOIHO> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.GIFCAAMOIHOOuterClass.GIFCAAMOIHO getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GIFCAAMOIHO_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GIFCAAMOIHO_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021GIFCAAMOIHO.proto\"-\n\013GIFCAAMOIHO\022\021\n\tis"
                    + "_accept\030\017 \001(\010\022\013\n\003uid\030\007 \001(\rB\033\n\031emu.grassc"
                    + "utter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_GIFCAAMOIHO_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GIFCAAMOIHO_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_GIFCAAMOIHO_descriptor,
                        new java.lang.String[] {
                            "IsAccept", "Uid",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
