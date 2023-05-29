// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MpPlayOwnerCheckRsp.proto

package emu.grasscutter.net.proto;

public final class MpPlayOwnerCheckRspOuterClass {
    private MpPlayOwnerCheckRspOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface MpPlayOwnerCheckRspOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:MpPlayOwnerCheckRsp)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 wrong_uid = 4;</code>
         *
         * @return The wrongUid.
         */
        int getWrongUid();

        /**
         * <code>uint32 mp_play_id = 11;</code>
         *
         * @return The mpPlayId.
         */
        int getMpPlayId();

        /**
         * <code>bool is_skip_match = 8;</code>
         *
         * @return The isSkipMatch.
         */
        boolean getIsSkipMatch();

        /**
         * <code>int32 retcode = 12;</code>
         *
         * @return The retcode.
         */
        int getRetcode();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 1831
     * Obf: OAKGFIPBBDH
     * </pre>
     *
     * Protobuf type {@code MpPlayOwnerCheckRsp}
     */
    public static final class MpPlayOwnerCheckRsp extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:MpPlayOwnerCheckRsp)
            MpPlayOwnerCheckRspOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use MpPlayOwnerCheckRsp.newBuilder() to construct.
        private MpPlayOwnerCheckRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private MpPlayOwnerCheckRsp() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new MpPlayOwnerCheckRsp();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private MpPlayOwnerCheckRsp(
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
                                wrongUid_ = input.readUInt32();
                                break;
                            }
                        case 64:
                            {
                                isSkipMatch_ = input.readBool();
                                break;
                            }
                        case 88:
                            {
                                mpPlayId_ = input.readUInt32();
                                break;
                            }
                        case 96:
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
            return emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass
                    .internal_static_MpPlayOwnerCheckRsp_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass
                    .internal_static_MpPlayOwnerCheckRsp_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp.class,
                            emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp.Builder
                                    .class);
        }

        public static final int WRONG_UID_FIELD_NUMBER = 4;
        private int wrongUid_;
        /**
         * <code>uint32 wrong_uid = 4;</code>
         *
         * @return The wrongUid.
         */
        @java.lang.Override
        public int getWrongUid() {
            return wrongUid_;
        }

        public static final int MP_PLAY_ID_FIELD_NUMBER = 11;
        private int mpPlayId_;
        /**
         * <code>uint32 mp_play_id = 11;</code>
         *
         * @return The mpPlayId.
         */
        @java.lang.Override
        public int getMpPlayId() {
            return mpPlayId_;
        }

        public static final int IS_SKIP_MATCH_FIELD_NUMBER = 8;
        private boolean isSkipMatch_;
        /**
         * <code>bool is_skip_match = 8;</code>
         *
         * @return The isSkipMatch.
         */
        @java.lang.Override
        public boolean getIsSkipMatch() {
            return isSkipMatch_;
        }

        public static final int RETCODE_FIELD_NUMBER = 12;
        private int retcode_;
        /**
         * <code>int32 retcode = 12;</code>
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
            if (wrongUid_ != 0) {
                output.writeUInt32(4, wrongUid_);
            }
            if (isSkipMatch_ != false) {
                output.writeBool(8, isSkipMatch_);
            }
            if (mpPlayId_ != 0) {
                output.writeUInt32(11, mpPlayId_);
            }
            if (retcode_ != 0) {
                output.writeInt32(12, retcode_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (wrongUid_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(4, wrongUid_);
            }
            if (isSkipMatch_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(8, isSkipMatch_);
            }
            if (mpPlayId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, mpPlayId_);
            }
            if (retcode_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(12, retcode_);
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
                    instanceof emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp other =
                    (emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp) obj;

            if (getWrongUid() != other.getWrongUid()) return false;
            if (getMpPlayId() != other.getMpPlayId()) return false;
            if (getIsSkipMatch() != other.getIsSkipMatch()) return false;
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
            hash = (37 * hash) + WRONG_UID_FIELD_NUMBER;
            hash = (53 * hash) + getWrongUid();
            hash = (37 * hash) + MP_PLAY_ID_FIELD_NUMBER;
            hash = (53 * hash) + getMpPlayId();
            hash = (37 * hash) + IS_SKIP_MATCH_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsSkipMatch());
            hash = (37 * hash) + RETCODE_FIELD_NUMBER;
            hash = (53 * hash) + getRetcode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
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
                emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp prototype) {
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
         * CmdId: 1831
         * Obf: OAKGFIPBBDH
         * </pre>
         *
         * Protobuf type {@code MpPlayOwnerCheckRsp}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:MpPlayOwnerCheckRsp)
                emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRspOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass
                        .internal_static_MpPlayOwnerCheckRsp_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass
                        .internal_static_MpPlayOwnerCheckRsp_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp.class,
                                emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp.newBuilder()
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
                wrongUid_ = 0;

                mpPlayId_ = 0;

                isSkipMatch_ = false;

                retcode_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass
                        .internal_static_MpPlayOwnerCheckRsp_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp build() {
                emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                    buildPartial() {
                emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp result =
                        new emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp(this);
                result.wrongUid_ = wrongUid_;
                result.mpPlayId_ = mpPlayId_;
                result.isSkipMatch_ = isSkipMatch_;
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
                if (other
                        instanceof
                        emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp other) {
                if (other
                        == emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                                .getDefaultInstance()) return this;
                if (other.getWrongUid() != 0) {
                    setWrongUid(other.getWrongUid());
                }
                if (other.getMpPlayId() != 0) {
                    setMpPlayId(other.getMpPlayId());
                }
                if (other.getIsSkipMatch() != false) {
                    setIsSkipMatch(other.getIsSkipMatch());
                }
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
                emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp parsedMessage =
                        null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int wrongUid_;
            /**
             * <code>uint32 wrong_uid = 4;</code>
             *
             * @return The wrongUid.
             */
            @java.lang.Override
            public int getWrongUid() {
                return wrongUid_;
            }
            /**
             * <code>uint32 wrong_uid = 4;</code>
             *
             * @param value The wrongUid to set.
             * @return This builder for chaining.
             */
            public Builder setWrongUid(int value) {

                wrongUid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 wrong_uid = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearWrongUid() {

                wrongUid_ = 0;
                onChanged();
                return this;
            }

            private int mpPlayId_;
            /**
             * <code>uint32 mp_play_id = 11;</code>
             *
             * @return The mpPlayId.
             */
            @java.lang.Override
            public int getMpPlayId() {
                return mpPlayId_;
            }
            /**
             * <code>uint32 mp_play_id = 11;</code>
             *
             * @param value The mpPlayId to set.
             * @return This builder for chaining.
             */
            public Builder setMpPlayId(int value) {

                mpPlayId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 mp_play_id = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMpPlayId() {

                mpPlayId_ = 0;
                onChanged();
                return this;
            }

            private boolean isSkipMatch_;
            /**
             * <code>bool is_skip_match = 8;</code>
             *
             * @return The isSkipMatch.
             */
            @java.lang.Override
            public boolean getIsSkipMatch() {
                return isSkipMatch_;
            }
            /**
             * <code>bool is_skip_match = 8;</code>
             *
             * @param value The isSkipMatch to set.
             * @return This builder for chaining.
             */
            public Builder setIsSkipMatch(boolean value) {

                isSkipMatch_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_skip_match = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsSkipMatch() {

                isSkipMatch_ = false;
                onChanged();
                return this;
            }

            private int retcode_;
            /**
             * <code>int32 retcode = 12;</code>
             *
             * @return The retcode.
             */
            @java.lang.Override
            public int getRetcode() {
                return retcode_;
            }
            /**
             * <code>int32 retcode = 12;</code>
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
             * <code>int32 retcode = 12;</code>
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

            // @@protoc_insertion_point(builder_scope:MpPlayOwnerCheckRsp)
        }

        // @@protoc_insertion_point(class_scope:MpPlayOwnerCheckRsp)
        private static final emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp();
        }

        public static emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<MpPlayOwnerCheckRsp> PARSER =
                new com.google.protobuf.AbstractParser<MpPlayOwnerCheckRsp>() {
                    @java.lang.Override
                    public MpPlayOwnerCheckRsp parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new MpPlayOwnerCheckRsp(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<MpPlayOwnerCheckRsp> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<MpPlayOwnerCheckRsp> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.MpPlayOwnerCheckRspOuterClass.MpPlayOwnerCheckRsp
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_MpPlayOwnerCheckRsp_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_MpPlayOwnerCheckRsp_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\031MpPlayOwnerCheckRsp.proto\"d\n\023MpPlayOwn"
                    + "erCheckRsp\022\021\n\twrong_uid\030\004 \001(\r\022\022\n\nmp_play"
                    + "_id\030\013 \001(\r\022\025\n\ris_skip_match\030\010 \001(\010\022\017\n\007retc"
                    + "ode\030\014 \001(\005B\033\n\031emu.grasscutter.net.protob\006"
                    + "proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_MpPlayOwnerCheckRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MpPlayOwnerCheckRsp_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_MpPlayOwnerCheckRsp_descriptor,
                        new java.lang.String[] {
                            "WrongUid", "MpPlayId", "IsSkipMatch", "Retcode",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
