// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlessingAcceptGivePicReq.proto

package emu.grasscutter.net.proto;

public final class BlessingAcceptGivePicReqOuterClass {
    private BlessingAcceptGivePicReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface BlessingAcceptGivePicReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:BlessingAcceptGivePicReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 uid = 2;</code>
         *
         * @return The uid.
         */
        int getUid();

        /**
         * <code>uint32 index = 15;</code>
         *
         * @return The index.
         */
        int getIndex();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 2132
     * Obf: OCOOFMPCFPB
     * </pre>
     *
     * Protobuf type {@code BlessingAcceptGivePicReq}
     */
    public static final class BlessingAcceptGivePicReq extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:BlessingAcceptGivePicReq)
            BlessingAcceptGivePicReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use BlessingAcceptGivePicReq.newBuilder() to construct.
        private BlessingAcceptGivePicReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private BlessingAcceptGivePicReq() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new BlessingAcceptGivePicReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private BlessingAcceptGivePicReq(
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
                        case 16:
                            {
                                uid_ = input.readUInt32();
                                break;
                            }
                        case 120:
                            {
                                index_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                    .internal_static_BlessingAcceptGivePicReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                    .internal_static_BlessingAcceptGivePicReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq
                                    .class,
                            emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq
                                    .Builder.class);
        }

        public static final int UID_FIELD_NUMBER = 2;
        private int uid_;
        /**
         * <code>uint32 uid = 2;</code>
         *
         * @return The uid.
         */
        @java.lang.Override
        public int getUid() {
            return uid_;
        }

        public static final int INDEX_FIELD_NUMBER = 15;
        private int index_;
        /**
         * <code>uint32 index = 15;</code>
         *
         * @return The index.
         */
        @java.lang.Override
        public int getIndex() {
            return index_;
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
                output.writeUInt32(2, uid_);
            }
            if (index_ != 0) {
                output.writeUInt32(15, index_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (uid_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(2, uid_);
            }
            if (index_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(15, index_);
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
            if (!(obj
                    instanceof
                    emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq other =
                    (emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq)
                            obj;

            if (getUid() != other.getUid()) return false;
            if (getIndex() != other.getIndex()) return false;
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
            hash = (37 * hash) + UID_FIELD_NUMBER;
            hash = (53 * hash) + getUid();
            hash = (37 * hash) + INDEX_FIELD_NUMBER;
            hash = (53 * hash) + getIndex();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .BlessingAcceptGivePicReq
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .BlessingAcceptGivePicReq
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .BlessingAcceptGivePicReq
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .BlessingAcceptGivePicReq
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .BlessingAcceptGivePicReq
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .BlessingAcceptGivePicReq
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .BlessingAcceptGivePicReq
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .BlessingAcceptGivePicReq
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .BlessingAcceptGivePicReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .BlessingAcceptGivePicReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .BlessingAcceptGivePicReq
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .BlessingAcceptGivePicReq
                parseFrom(
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
                emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq
                        prototype) {
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
         * CmdId: 2132
         * Obf: OCOOFMPCFPB
         * </pre>
         *
         * Protobuf type {@code BlessingAcceptGivePicReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:BlessingAcceptGivePicReq)
                emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .BlessingAcceptGivePicReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .internal_static_BlessingAcceptGivePicReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .internal_static_BlessingAcceptGivePicReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                                        .BlessingAcceptGivePicReq.class,
                                emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                                        .BlessingAcceptGivePicReq.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq.newBuilder()
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
                uid_ = 0;

                index_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .internal_static_BlessingAcceptGivePicReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq
                    build() {
                emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq
                    buildPartial() {
                emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq
                        result =
                                new emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                                        .BlessingAcceptGivePicReq(this);
                result.uid_ = uid_;
                result.index_ = index_;
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
                        instanceof
                        emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                                            .BlessingAcceptGivePicReq)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq
                            other) {
                if (other
                        == emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq
                                .getDefaultInstance()) return this;
                if (other.getUid() != 0) {
                    setUid(other.getUid());
                }
                if (other.getIndex() != 0) {
                    setIndex(other.getIndex());
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
                emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                                            .BlessingAcceptGivePicReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int uid_;
            /**
             * <code>uint32 uid = 2;</code>
             *
             * @return The uid.
             */
            @java.lang.Override
            public int getUid() {
                return uid_;
            }
            /**
             * <code>uint32 uid = 2;</code>
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
             * <code>uint32 uid = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearUid() {

                uid_ = 0;
                onChanged();
                return this;
            }

            private int index_;
            /**
             * <code>uint32 index = 15;</code>
             *
             * @return The index.
             */
            @java.lang.Override
            public int getIndex() {
                return index_;
            }
            /**
             * <code>uint32 index = 15;</code>
             *
             * @param value The index to set.
             * @return This builder for chaining.
             */
            public Builder setIndex(int value) {

                index_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 index = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIndex() {

                index_ = 0;
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

            // @@protoc_insertion_point(builder_scope:BlessingAcceptGivePicReq)
        }

        // @@protoc_insertion_point(class_scope:BlessingAcceptGivePicReq)
        private static final emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .BlessingAcceptGivePicReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                            .BlessingAcceptGivePicReq();
        }

        public static emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass
                        .BlessingAcceptGivePicReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<BlessingAcceptGivePicReq> PARSER =
                new com.google.protobuf.AbstractParser<BlessingAcceptGivePicReq>() {
                    @java.lang.Override
                    public BlessingAcceptGivePicReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new BlessingAcceptGivePicReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<BlessingAcceptGivePicReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<BlessingAcceptGivePicReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.BlessingAcceptGivePicReqOuterClass.BlessingAcceptGivePicReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_BlessingAcceptGivePicReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_BlessingAcceptGivePicReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\036BlessingAcceptGivePicReq.proto\"6\n\030Bles"
                    + "singAcceptGivePicReq\022\013\n\003uid\030\002 \001(\r\022\r\n\005ind"
                    + "ex\030\017 \001(\rB\033\n\031emu.grasscutter.net.protob\006p"
                    + "roto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_BlessingAcceptGivePicReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BlessingAcceptGivePicReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_BlessingAcceptGivePicReq_descriptor,
                        new java.lang.String[] {
                            "Uid", "Index",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
