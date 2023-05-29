// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NpcTalkRsp.proto

package emu.grasscutter.net.proto;

public final class NpcTalkRspOuterClass {
    private NpcTalkRspOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface NpcTalkRspOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:NpcTalkRsp)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 entity_id = 15;</code>
         *
         * @return The entityId.
         */
        int getEntityId();

        /**
         * <code>uint32 cur_talk_id = 1;</code>
         *
         * @return The curTalkId.
         */
        int getCurTalkId();

        /**
         * <code>int32 retcode = 9;</code>
         *
         * @return The retcode.
         */
        int getRetcode();

        /**
         * <code>uint32 npc_entity_id = 11;</code>
         *
         * @return The npcEntityId.
         */
        int getNpcEntityId();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 596
     * Obf: OAFFPIJPBBM
     * </pre>
     *
     * Protobuf type {@code NpcTalkRsp}
     */
    public static final class NpcTalkRsp extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:NpcTalkRsp)
            NpcTalkRspOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use NpcTalkRsp.newBuilder() to construct.
        private NpcTalkRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private NpcTalkRsp() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new NpcTalkRsp();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private NpcTalkRsp(
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
                                curTalkId_ = input.readUInt32();
                                break;
                            }
                        case 72:
                            {
                                retcode_ = input.readInt32();
                                break;
                            }
                        case 88:
                            {
                                npcEntityId_ = input.readUInt32();
                                break;
                            }
                        case 120:
                            {
                                entityId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.NpcTalkRspOuterClass.internal_static_NpcTalkRsp_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.NpcTalkRspOuterClass
                    .internal_static_NpcTalkRsp_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp.class,
                            emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp.Builder.class);
        }

        public static final int ENTITY_ID_FIELD_NUMBER = 15;
        private int entityId_;
        /**
         * <code>uint32 entity_id = 15;</code>
         *
         * @return The entityId.
         */
        @java.lang.Override
        public int getEntityId() {
            return entityId_;
        }

        public static final int CUR_TALK_ID_FIELD_NUMBER = 1;
        private int curTalkId_;
        /**
         * <code>uint32 cur_talk_id = 1;</code>
         *
         * @return The curTalkId.
         */
        @java.lang.Override
        public int getCurTalkId() {
            return curTalkId_;
        }

        public static final int RETCODE_FIELD_NUMBER = 9;
        private int retcode_;
        /**
         * <code>int32 retcode = 9;</code>
         *
         * @return The retcode.
         */
        @java.lang.Override
        public int getRetcode() {
            return retcode_;
        }

        public static final int NPC_ENTITY_ID_FIELD_NUMBER = 11;
        private int npcEntityId_;
        /**
         * <code>uint32 npc_entity_id = 11;</code>
         *
         * @return The npcEntityId.
         */
        @java.lang.Override
        public int getNpcEntityId() {
            return npcEntityId_;
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
            if (curTalkId_ != 0) {
                output.writeUInt32(1, curTalkId_);
            }
            if (retcode_ != 0) {
                output.writeInt32(9, retcode_);
            }
            if (npcEntityId_ != 0) {
                output.writeUInt32(11, npcEntityId_);
            }
            if (entityId_ != 0) {
                output.writeUInt32(15, entityId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (curTalkId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(1, curTalkId_);
            }
            if (retcode_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(9, retcode_);
            }
            if (npcEntityId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, npcEntityId_);
            }
            if (entityId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(15, entityId_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp other =
                    (emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp) obj;

            if (getEntityId() != other.getEntityId()) return false;
            if (getCurTalkId() != other.getCurTalkId()) return false;
            if (getRetcode() != other.getRetcode()) return false;
            if (getNpcEntityId() != other.getNpcEntityId()) return false;
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
            hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
            hash = (53 * hash) + getEntityId();
            hash = (37 * hash) + CUR_TALK_ID_FIELD_NUMBER;
            hash = (53 * hash) + getCurTalkId();
            hash = (37 * hash) + RETCODE_FIELD_NUMBER;
            hash = (53 * hash) + getRetcode();
            hash = (37 * hash) + NPC_ENTITY_ID_FIELD_NUMBER;
            hash = (53 * hash) + getNpcEntityId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
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
                emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp prototype) {
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
         * CmdId: 596
         * Obf: OAFFPIJPBBM
         * </pre>
         *
         * Protobuf type {@code NpcTalkRsp}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:NpcTalkRsp)
                emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRspOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.NpcTalkRspOuterClass.internal_static_NpcTalkRsp_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.NpcTalkRspOuterClass
                        .internal_static_NpcTalkRsp_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp.class,
                                emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp.newBuilder()
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
                entityId_ = 0;

                curTalkId_ = 0;

                retcode_ = 0;

                npcEntityId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.NpcTalkRspOuterClass.internal_static_NpcTalkRsp_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp build() {
                emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp buildPartial() {
                emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp result =
                        new emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp(this);
                result.entityId_ = entityId_;
                result.curTalkId_ = curTalkId_;
                result.retcode_ = retcode_;
                result.npcEntityId_ = npcEntityId_;
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
                if (other instanceof emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp) {
                    return mergeFrom((emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp other) {
                if (other == emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp.getDefaultInstance())
                    return this;
                if (other.getEntityId() != 0) {
                    setEntityId(other.getEntityId());
                }
                if (other.getCurTalkId() != 0) {
                    setCurTalkId(other.getCurTalkId());
                }
                if (other.getRetcode() != 0) {
                    setRetcode(other.getRetcode());
                }
                if (other.getNpcEntityId() != 0) {
                    setNpcEntityId(other.getNpcEntityId());
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
                emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int entityId_;
            /**
             * <code>uint32 entity_id = 15;</code>
             *
             * @return The entityId.
             */
            @java.lang.Override
            public int getEntityId() {
                return entityId_;
            }
            /**
             * <code>uint32 entity_id = 15;</code>
             *
             * @param value The entityId to set.
             * @return This builder for chaining.
             */
            public Builder setEntityId(int value) {

                entityId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 entity_id = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEntityId() {

                entityId_ = 0;
                onChanged();
                return this;
            }

            private int curTalkId_;
            /**
             * <code>uint32 cur_talk_id = 1;</code>
             *
             * @return The curTalkId.
             */
            @java.lang.Override
            public int getCurTalkId() {
                return curTalkId_;
            }
            /**
             * <code>uint32 cur_talk_id = 1;</code>
             *
             * @param value The curTalkId to set.
             * @return This builder for chaining.
             */
            public Builder setCurTalkId(int value) {

                curTalkId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 cur_talk_id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCurTalkId() {

                curTalkId_ = 0;
                onChanged();
                return this;
            }

            private int retcode_;
            /**
             * <code>int32 retcode = 9;</code>
             *
             * @return The retcode.
             */
            @java.lang.Override
            public int getRetcode() {
                return retcode_;
            }
            /**
             * <code>int32 retcode = 9;</code>
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
             * <code>int32 retcode = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRetcode() {

                retcode_ = 0;
                onChanged();
                return this;
            }

            private int npcEntityId_;
            /**
             * <code>uint32 npc_entity_id = 11;</code>
             *
             * @return The npcEntityId.
             */
            @java.lang.Override
            public int getNpcEntityId() {
                return npcEntityId_;
            }
            /**
             * <code>uint32 npc_entity_id = 11;</code>
             *
             * @param value The npcEntityId to set.
             * @return This builder for chaining.
             */
            public Builder setNpcEntityId(int value) {

                npcEntityId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 npc_entity_id = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearNpcEntityId() {

                npcEntityId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:NpcTalkRsp)
        }

        // @@protoc_insertion_point(class_scope:NpcTalkRsp)
        private static final emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp();
        }

        public static emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<NpcTalkRsp> PARSER =
                new com.google.protobuf.AbstractParser<NpcTalkRsp>() {
                    @java.lang.Override
                    public NpcTalkRsp parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new NpcTalkRsp(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<NpcTalkRsp> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<NpcTalkRsp> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.NpcTalkRspOuterClass.NpcTalkRsp getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_NpcTalkRsp_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_NpcTalkRsp_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\020NpcTalkRsp.proto\"\\\n\nNpcTalkRsp\022\021\n\tenti"
                    + "ty_id\030\017 \001(\r\022\023\n\013cur_talk_id\030\001 \001(\r\022\017\n\007retc"
                    + "ode\030\t \001(\005\022\025\n\rnpc_entity_id\030\013 \001(\rB\033\n\031emu."
                    + "grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_NpcTalkRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_NpcTalkRsp_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_NpcTalkRsp_descriptor,
                        new java.lang.String[] {
                            "EntityId", "CurTalkId", "Retcode", "NpcEntityId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
