// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HostPlayerNotify.proto

package emu.grasscutter.net.proto;

public final class HostPlayerNotifyOuterClass {
    private HostPlayerNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface HostPlayerNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:HostPlayerNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 host_peer_id = 8;</code>
         *
         * @return The hostPeerId.
         */
        int getHostPeerId();

        /**
         * <code>uint32 host_uid = 3;</code>
         *
         * @return The hostUid.
         */
        int getHostUid();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 302
     * Obf: DGNMEHADJDI
     * </pre>
     *
     * Protobuf type {@code HostPlayerNotify}
     */
    public static final class HostPlayerNotify extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:HostPlayerNotify)
            HostPlayerNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use HostPlayerNotify.newBuilder() to construct.
        private HostPlayerNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private HostPlayerNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new HostPlayerNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private HostPlayerNotify(
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
                        case 24:
                            {
                                hostUid_ = input.readUInt32();
                                break;
                            }
                        case 64:
                            {
                                hostPeerId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.HostPlayerNotifyOuterClass
                    .internal_static_HostPlayerNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.HostPlayerNotifyOuterClass
                    .internal_static_HostPlayerNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify.class,
                            emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify.Builder.class);
        }

        public static final int HOST_PEER_ID_FIELD_NUMBER = 8;
        private int hostPeerId_;
        /**
         * <code>uint32 host_peer_id = 8;</code>
         *
         * @return The hostPeerId.
         */
        @java.lang.Override
        public int getHostPeerId() {
            return hostPeerId_;
        }

        public static final int HOST_UID_FIELD_NUMBER = 3;
        private int hostUid_;
        /**
         * <code>uint32 host_uid = 3;</code>
         *
         * @return The hostUid.
         */
        @java.lang.Override
        public int getHostUid() {
            return hostUid_;
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
            if (hostUid_ != 0) {
                output.writeUInt32(3, hostUid_);
            }
            if (hostPeerId_ != 0) {
                output.writeUInt32(8, hostPeerId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (hostUid_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, hostUid_);
            }
            if (hostPeerId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(8, hostPeerId_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify other =
                    (emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify) obj;

            if (getHostPeerId() != other.getHostPeerId()) return false;
            if (getHostUid() != other.getHostUid()) return false;
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
            hash = (37 * hash) + HOST_PEER_ID_FIELD_NUMBER;
            hash = (53 * hash) + getHostPeerId();
            hash = (37 * hash) + HOST_UID_FIELD_NUMBER;
            hash = (53 * hash) + getHostUid();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parseFrom(
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
                emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify prototype) {
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
         * CmdId: 302
         * Obf: DGNMEHADJDI
         * </pre>
         *
         * Protobuf type {@code HostPlayerNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:HostPlayerNotify)
                emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.HostPlayerNotifyOuterClass
                        .internal_static_HostPlayerNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.HostPlayerNotifyOuterClass
                        .internal_static_HostPlayerNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify.class,
                                emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify.newBuilder()
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
                hostPeerId_ = 0;

                hostUid_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.HostPlayerNotifyOuterClass
                        .internal_static_HostPlayerNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify build() {
                emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify buildPartial() {
                emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify result =
                        new emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify(this);
                result.hostPeerId_ = hostPeerId_;
                result.hostUid_ = hostUid_;
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
                        instanceof emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify other) {
                if (other
                        == emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify
                                .getDefaultInstance()) return this;
                if (other.getHostPeerId() != 0) {
                    setHostPeerId(other.getHostPeerId());
                }
                if (other.getHostUid() != 0) {
                    setHostUid(other.getHostUid());
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
                emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int hostPeerId_;
            /**
             * <code>uint32 host_peer_id = 8;</code>
             *
             * @return The hostPeerId.
             */
            @java.lang.Override
            public int getHostPeerId() {
                return hostPeerId_;
            }
            /**
             * <code>uint32 host_peer_id = 8;</code>
             *
             * @param value The hostPeerId to set.
             * @return This builder for chaining.
             */
            public Builder setHostPeerId(int value) {

                hostPeerId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 host_peer_id = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearHostPeerId() {

                hostPeerId_ = 0;
                onChanged();
                return this;
            }

            private int hostUid_;
            /**
             * <code>uint32 host_uid = 3;</code>
             *
             * @return The hostUid.
             */
            @java.lang.Override
            public int getHostUid() {
                return hostUid_;
            }
            /**
             * <code>uint32 host_uid = 3;</code>
             *
             * @param value The hostUid to set.
             * @return This builder for chaining.
             */
            public Builder setHostUid(int value) {

                hostUid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 host_uid = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearHostUid() {

                hostUid_ = 0;
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

            // @@protoc_insertion_point(builder_scope:HostPlayerNotify)
        }

        // @@protoc_insertion_point(class_scope:HostPlayerNotify)
        private static final emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify();
        }

        public static emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<HostPlayerNotify> PARSER =
                new com.google.protobuf.AbstractParser<HostPlayerNotify>() {
                    @java.lang.Override
                    public HostPlayerNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new HostPlayerNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<HostPlayerNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<HostPlayerNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HostPlayerNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HostPlayerNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\026HostPlayerNotify.proto\":\n\020HostPlayerNo"
                    + "tify\022\024\n\014host_peer_id\030\010 \001(\r\022\020\n\010host_uid\030\003"
                    + " \001(\rB\033\n\031emu.grasscutter.net.protob\006proto"
                    + "3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_HostPlayerNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HostPlayerNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_HostPlayerNotify_descriptor,
                        new java.lang.String[] {
                            "HostPeerId", "HostUid",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
