// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HideAndSeekSelectSkillReq.proto

package emu.grasscutter.net.proto;

public final class HideAndSeekSelectSkillReqOuterClass {
    private HideAndSeekSelectSkillReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface HideAndSeekSelectSkillReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:HideAndSeekSelectSkillReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated uint32 skill_list = 2;</code>
         *
         * @return A list containing the skillList.
         */
        java.util.List<java.lang.Integer> getSkillListList();
        /**
         * <code>repeated uint32 skill_list = 2;</code>
         *
         * @return The count of skillList.
         */
        int getSkillListCount();
        /**
         * <code>repeated uint32 skill_list = 2;</code>
         *
         * @param index The index of the element to return.
         * @return The skillList at the given index.
         */
        int getSkillList(int index);
    }
    /**
     *
     *
     * <pre>
     * CmdId: 8721
     * Obf: OKJFNECHCNL
     * </pre>
     *
     * Protobuf type {@code HideAndSeekSelectSkillReq}
     */
    public static final class HideAndSeekSelectSkillReq extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:HideAndSeekSelectSkillReq)
            HideAndSeekSelectSkillReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use HideAndSeekSelectSkillReq.newBuilder() to construct.
        private HideAndSeekSelectSkillReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private HideAndSeekSelectSkillReq() {
            skillList_ = emptyIntList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new HideAndSeekSelectSkillReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private HideAndSeekSelectSkillReq(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
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
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    skillList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                skillList_.addInt(input.readUInt32());
                                break;
                            }
                        case 18:
                            {
                                int length = input.readRawVarint32();
                                int limit = input.pushLimit(length);
                                if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                                    skillList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                while (input.getBytesUntilLimit() > 0) {
                                    skillList_.addInt(input.readUInt32());
                                }
                                input.popLimit(limit);
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
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    skillList_.makeImmutable(); // C
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                    .internal_static_HideAndSeekSelectSkillReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                    .internal_static_HideAndSeekSelectSkillReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                                    .HideAndSeekSelectSkillReq.class,
                            emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                                    .HideAndSeekSelectSkillReq.Builder.class);
        }

        public static final int SKILL_LIST_FIELD_NUMBER = 2;
        private com.google.protobuf.Internal.IntList skillList_;
        /**
         * <code>repeated uint32 skill_list = 2;</code>
         *
         * @return A list containing the skillList.
         */
        @java.lang.Override
        public java.util.List<java.lang.Integer> getSkillListList() {
            return skillList_;
        }
        /**
         * <code>repeated uint32 skill_list = 2;</code>
         *
         * @return The count of skillList.
         */
        public int getSkillListCount() {
            return skillList_.size();
        }
        /**
         * <code>repeated uint32 skill_list = 2;</code>
         *
         * @param index The index of the element to return.
         * @return The skillList at the given index.
         */
        public int getSkillList(int index) {
            return skillList_.getInt(index);
        }

        private int skillListMemoizedSerializedSize = -1;

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
            getSerializedSize();
            if (getSkillListList().size() > 0) {
                output.writeUInt32NoTag(18);
                output.writeUInt32NoTag(skillListMemoizedSerializedSize);
            }
            for (int i = 0; i < skillList_.size(); i++) {
                output.writeUInt32NoTag(skillList_.getInt(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            {
                int dataSize = 0;
                for (int i = 0; i < skillList_.size(); i++) {
                    dataSize +=
                            com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(skillList_.getInt(i));
                }
                size += dataSize;
                if (!getSkillListList().isEmpty()) {
                    size += 1;
                    size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
                }
                skillListMemoizedSerializedSize = dataSize;
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
                    emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                            .HideAndSeekSelectSkillReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass.HideAndSeekSelectSkillReq
                    other =
                            (emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                                            .HideAndSeekSelectSkillReq)
                                    obj;

            if (!getSkillListList().equals(other.getSkillListList())) return false;
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
            if (getSkillListCount() > 0) {
                hash = (37 * hash) + SKILL_LIST_FIELD_NUMBER;
                hash = (53 * hash) + getSkillListList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .HideAndSeekSelectSkillReq
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .HideAndSeekSelectSkillReq
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .HideAndSeekSelectSkillReq
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .HideAndSeekSelectSkillReq
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .HideAndSeekSelectSkillReq
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .HideAndSeekSelectSkillReq
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .HideAndSeekSelectSkillReq
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .HideAndSeekSelectSkillReq
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .HideAndSeekSelectSkillReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .HideAndSeekSelectSkillReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .HideAndSeekSelectSkillReq
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .HideAndSeekSelectSkillReq
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
                emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass.HideAndSeekSelectSkillReq
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
         * CmdId: 8721
         * Obf: OKJFNECHCNL
         * </pre>
         *
         * Protobuf type {@code HideAndSeekSelectSkillReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:HideAndSeekSelectSkillReq)
                emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .HideAndSeekSelectSkillReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .internal_static_HideAndSeekSelectSkillReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .internal_static_HideAndSeekSelectSkillReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                                        .HideAndSeekSelectSkillReq.class,
                                emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                                        .HideAndSeekSelectSkillReq.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass.HideAndSeekSelectSkillReq.newBuilder()
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
                skillList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .internal_static_HideAndSeekSelectSkillReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass.HideAndSeekSelectSkillReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .HideAndSeekSelectSkillReq.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass.HideAndSeekSelectSkillReq
                    build() {
                emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass.HideAndSeekSelectSkillReq
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass.HideAndSeekSelectSkillReq
                    buildPartial() {
                emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass.HideAndSeekSelectSkillReq
                        result =
                                new emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                                        .HideAndSeekSelectSkillReq(this);
                int from_bitField0_ = bitField0_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    skillList_.makeImmutable();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.skillList_ = skillList_;
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
                        emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                                .HideAndSeekSelectSkillReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                                            .HideAndSeekSelectSkillReq)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass.HideAndSeekSelectSkillReq
                            other) {
                if (other
                        == emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                                .HideAndSeekSelectSkillReq.getDefaultInstance()) return this;
                if (!other.skillList_.isEmpty()) {
                    if (skillList_.isEmpty()) {
                        skillList_ = other.skillList_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureSkillListIsMutable();
                        skillList_.addAll(other.skillList_);
                    }
                    onChanged();
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
                emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass.HideAndSeekSelectSkillReq
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                                            .HideAndSeekSelectSkillReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private com.google.protobuf.Internal.IntList skillList_ = emptyIntList();

            private void ensureSkillListIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    skillList_ = mutableCopy(skillList_);
                    bitField0_ |= 0x00000001;
                }
            }
            /**
             * <code>repeated uint32 skill_list = 2;</code>
             *
             * @return A list containing the skillList.
             */
            public java.util.List<java.lang.Integer> getSkillListList() {
                return ((bitField0_ & 0x00000001) != 0)
                        ? java.util.Collections.unmodifiableList(skillList_)
                        : skillList_;
            }
            /**
             * <code>repeated uint32 skill_list = 2;</code>
             *
             * @return The count of skillList.
             */
            public int getSkillListCount() {
                return skillList_.size();
            }
            /**
             * <code>repeated uint32 skill_list = 2;</code>
             *
             * @param index The index of the element to return.
             * @return The skillList at the given index.
             */
            public int getSkillList(int index) {
                return skillList_.getInt(index);
            }
            /**
             * <code>repeated uint32 skill_list = 2;</code>
             *
             * @param index The index to set the value at.
             * @param value The skillList to set.
             * @return This builder for chaining.
             */
            public Builder setSkillList(int index, int value) {
                ensureSkillListIsMutable();
                skillList_.setInt(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 skill_list = 2;</code>
             *
             * @param value The skillList to add.
             * @return This builder for chaining.
             */
            public Builder addSkillList(int value) {
                ensureSkillListIsMutable();
                skillList_.addInt(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 skill_list = 2;</code>
             *
             * @param values The skillList to add.
             * @return This builder for chaining.
             */
            public Builder addAllSkillList(java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureSkillListIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, skillList_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 skill_list = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSkillList() {
                skillList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
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

            // @@protoc_insertion_point(builder_scope:HideAndSeekSelectSkillReq)
        }

        // @@protoc_insertion_point(class_scope:HideAndSeekSelectSkillReq)
        private static final emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .HideAndSeekSelectSkillReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                            .HideAndSeekSelectSkillReq();
        }

        public static emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass
                        .HideAndSeekSelectSkillReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<HideAndSeekSelectSkillReq> PARSER =
                new com.google.protobuf.AbstractParser<HideAndSeekSelectSkillReq>() {
                    @java.lang.Override
                    public HideAndSeekSelectSkillReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new HideAndSeekSelectSkillReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<HideAndSeekSelectSkillReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<HideAndSeekSelectSkillReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.HideAndSeekSelectSkillReqOuterClass.HideAndSeekSelectSkillReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HideAndSeekSelectSkillReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HideAndSeekSelectSkillReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\037HideAndSeekSelectSkillReq.proto\"/\n\031Hid"
                    + "eAndSeekSelectSkillReq\022\022\n\nskill_list\030\002 \003"
                    + "(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_HideAndSeekSelectSkillReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HideAndSeekSelectSkillReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_HideAndSeekSelectSkillReq_descriptor,
                        new java.lang.String[] {
                            "SkillList",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
