// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageMarketNpcEventFinishNotify.proto

package emu.grasscutter.net.proto;

public final class VintageMarketNpcEventFinishNotifyOuterClass {
    private VintageMarketNpcEventFinishNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface VintageMarketNpcEventFinishNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:VintageMarketNpcEventFinishNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 LGCEBJNOBAM = 13;</code>
         *
         * @return The lGCEBJNOBAM.
         */
        int getLGCEBJNOBAM();

        /**
         * <code>repeated uint32 unlock_strategy_list = 10;</code>
         *
         * @return A list containing the unlockStrategyList.
         */
        java.util.List<java.lang.Integer> getUnlockStrategyListList();
        /**
         * <code>repeated uint32 unlock_strategy_list = 10;</code>
         *
         * @return The count of unlockStrategyList.
         */
        int getUnlockStrategyListCount();
        /**
         * <code>repeated uint32 unlock_strategy_list = 10;</code>
         *
         * @param index The index of the element to return.
         * @return The unlockStrategyList at the given index.
         */
        int getUnlockStrategyList(int index);

        /**
         * <code>uint32 LJIOMIABKJC = 4;</code>
         *
         * @return The lJIOMIABKJC.
         */
        int getLJIOMIABKJC();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 24968
     * Obf: ELIGGGIBOGD
     * </pre>
     *
     * Protobuf type {@code VintageMarketNpcEventFinishNotify}
     */
    public static final class VintageMarketNpcEventFinishNotify
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:VintageMarketNpcEventFinishNotify)
            VintageMarketNpcEventFinishNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use VintageMarketNpcEventFinishNotify.newBuilder() to construct.
        private VintageMarketNpcEventFinishNotify(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private VintageMarketNpcEventFinishNotify() {
            unlockStrategyList_ = emptyIntList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new VintageMarketNpcEventFinishNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private VintageMarketNpcEventFinishNotify(
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
                        case 32:
                            {
                                lJIOMIABKJC_ = input.readUInt32();
                                break;
                            }
                        case 80:
                            {
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    unlockStrategyList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                unlockStrategyList_.addInt(input.readUInt32());
                                break;
                            }
                        case 82:
                            {
                                int length = input.readRawVarint32();
                                int limit = input.pushLimit(length);
                                if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                                    unlockStrategyList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                while (input.getBytesUntilLimit() > 0) {
                                    unlockStrategyList_.addInt(input.readUInt32());
                                }
                                input.popLimit(limit);
                                break;
                            }
                        case 104:
                            {
                                lGCEBJNOBAM_ = input.readUInt32();
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
                    unlockStrategyList_.makeImmutable(); // C
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                    .internal_static_VintageMarketNpcEventFinishNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                    .internal_static_VintageMarketNpcEventFinishNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                                    .VintageMarketNpcEventFinishNotify.class,
                            emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                                    .VintageMarketNpcEventFinishNotify.Builder.class);
        }

        public static final int LGCEBJNOBAM_FIELD_NUMBER = 13;
        private int lGCEBJNOBAM_;
        /**
         * <code>uint32 LGCEBJNOBAM = 13;</code>
         *
         * @return The lGCEBJNOBAM.
         */
        @java.lang.Override
        public int getLGCEBJNOBAM() {
            return lGCEBJNOBAM_;
        }

        public static final int UNLOCK_STRATEGY_LIST_FIELD_NUMBER = 10;
        private com.google.protobuf.Internal.IntList unlockStrategyList_;
        /**
         * <code>repeated uint32 unlock_strategy_list = 10;</code>
         *
         * @return A list containing the unlockStrategyList.
         */
        @java.lang.Override
        public java.util.List<java.lang.Integer> getUnlockStrategyListList() {
            return unlockStrategyList_;
        }
        /**
         * <code>repeated uint32 unlock_strategy_list = 10;</code>
         *
         * @return The count of unlockStrategyList.
         */
        public int getUnlockStrategyListCount() {
            return unlockStrategyList_.size();
        }
        /**
         * <code>repeated uint32 unlock_strategy_list = 10;</code>
         *
         * @param index The index of the element to return.
         * @return The unlockStrategyList at the given index.
         */
        public int getUnlockStrategyList(int index) {
            return unlockStrategyList_.getInt(index);
        }

        private int unlockStrategyListMemoizedSerializedSize = -1;

        public static final int LJIOMIABKJC_FIELD_NUMBER = 4;
        private int lJIOMIABKJC_;
        /**
         * <code>uint32 LJIOMIABKJC = 4;</code>
         *
         * @return The lJIOMIABKJC.
         */
        @java.lang.Override
        public int getLJIOMIABKJC() {
            return lJIOMIABKJC_;
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
            getSerializedSize();
            if (lJIOMIABKJC_ != 0) {
                output.writeUInt32(4, lJIOMIABKJC_);
            }
            if (getUnlockStrategyListList().size() > 0) {
                output.writeUInt32NoTag(82);
                output.writeUInt32NoTag(unlockStrategyListMemoizedSerializedSize);
            }
            for (int i = 0; i < unlockStrategyList_.size(); i++) {
                output.writeUInt32NoTag(unlockStrategyList_.getInt(i));
            }
            if (lGCEBJNOBAM_ != 0) {
                output.writeUInt32(13, lGCEBJNOBAM_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (lJIOMIABKJC_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(4, lJIOMIABKJC_);
            }
            {
                int dataSize = 0;
                for (int i = 0; i < unlockStrategyList_.size(); i++) {
                    dataSize +=
                            com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(
                                    unlockStrategyList_.getInt(i));
                }
                size += dataSize;
                if (!getUnlockStrategyListList().isEmpty()) {
                    size += 1;
                    size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
                }
                unlockStrategyListMemoizedSerializedSize = dataSize;
            }
            if (lGCEBJNOBAM_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(13, lGCEBJNOBAM_);
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
                    emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                            .VintageMarketNpcEventFinishNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                            .VintageMarketNpcEventFinishNotify
                    other =
                            (emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                                            .VintageMarketNpcEventFinishNotify)
                                    obj;

            if (getLGCEBJNOBAM() != other.getLGCEBJNOBAM()) return false;
            if (!getUnlockStrategyListList().equals(other.getUnlockStrategyListList())) return false;
            if (getLJIOMIABKJC() != other.getLJIOMIABKJC()) return false;
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
            hash = (37 * hash) + LGCEBJNOBAM_FIELD_NUMBER;
            hash = (53 * hash) + getLGCEBJNOBAM();
            if (getUnlockStrategyListCount() > 0) {
                hash = (37 * hash) + UNLOCK_STRATEGY_LIST_FIELD_NUMBER;
                hash = (53 * hash) + getUnlockStrategyListList().hashCode();
            }
            hash = (37 * hash) + LJIOMIABKJC_FIELD_NUMBER;
            hash = (53 * hash) + getLJIOMIABKJC();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotify
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
                emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                                .VintageMarketNpcEventFinishNotify
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
         * CmdId: 24968
         * Obf: ELIGGGIBOGD
         * </pre>
         *
         * Protobuf type {@code VintageMarketNpcEventFinishNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:VintageMarketNpcEventFinishNotify)
                emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .internal_static_VintageMarketNpcEventFinishNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .internal_static_VintageMarketNpcEventFinishNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                                        .VintageMarketNpcEventFinishNotify.class,
                                emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                                        .VintageMarketNpcEventFinishNotify.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass.VintageMarketNpcEventFinishNotify.newBuilder()
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
                lGCEBJNOBAM_ = 0;

                unlockStrategyList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                lJIOMIABKJC_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .internal_static_VintageMarketNpcEventFinishNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                            .VintageMarketNpcEventFinishNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotify.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                            .VintageMarketNpcEventFinishNotify
                    build() {
                emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                                .VintageMarketNpcEventFinishNotify
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                            .VintageMarketNpcEventFinishNotify
                    buildPartial() {
                emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                                .VintageMarketNpcEventFinishNotify
                        result =
                                new emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                                        .VintageMarketNpcEventFinishNotify(this);
                int from_bitField0_ = bitField0_;
                result.lGCEBJNOBAM_ = lGCEBJNOBAM_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    unlockStrategyList_.makeImmutable();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.unlockStrategyList_ = unlockStrategyList_;
                result.lJIOMIABKJC_ = lJIOMIABKJC_;
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
                        emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                                .VintageMarketNpcEventFinishNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                                            .VintageMarketNpcEventFinishNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                                    .VintageMarketNpcEventFinishNotify
                            other) {
                if (other
                        == emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                                .VintageMarketNpcEventFinishNotify.getDefaultInstance()) return this;
                if (other.getLGCEBJNOBAM() != 0) {
                    setLGCEBJNOBAM(other.getLGCEBJNOBAM());
                }
                if (!other.unlockStrategyList_.isEmpty()) {
                    if (unlockStrategyList_.isEmpty()) {
                        unlockStrategyList_ = other.unlockStrategyList_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureUnlockStrategyListIsMutable();
                        unlockStrategyList_.addAll(other.unlockStrategyList_);
                    }
                    onChanged();
                }
                if (other.getLJIOMIABKJC() != 0) {
                    setLJIOMIABKJC(other.getLJIOMIABKJC());
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
                emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                                .VintageMarketNpcEventFinishNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                                            .VintageMarketNpcEventFinishNotify)
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

            private int lGCEBJNOBAM_;
            /**
             * <code>uint32 LGCEBJNOBAM = 13;</code>
             *
             * @return The lGCEBJNOBAM.
             */
            @java.lang.Override
            public int getLGCEBJNOBAM() {
                return lGCEBJNOBAM_;
            }
            /**
             * <code>uint32 LGCEBJNOBAM = 13;</code>
             *
             * @param value The lGCEBJNOBAM to set.
             * @return This builder for chaining.
             */
            public Builder setLGCEBJNOBAM(int value) {

                lGCEBJNOBAM_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 LGCEBJNOBAM = 13;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLGCEBJNOBAM() {

                lGCEBJNOBAM_ = 0;
                onChanged();
                return this;
            }

            private com.google.protobuf.Internal.IntList unlockStrategyList_ = emptyIntList();

            private void ensureUnlockStrategyListIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    unlockStrategyList_ = mutableCopy(unlockStrategyList_);
                    bitField0_ |= 0x00000001;
                }
            }
            /**
             * <code>repeated uint32 unlock_strategy_list = 10;</code>
             *
             * @return A list containing the unlockStrategyList.
             */
            public java.util.List<java.lang.Integer> getUnlockStrategyListList() {
                return ((bitField0_ & 0x00000001) != 0)
                        ? java.util.Collections.unmodifiableList(unlockStrategyList_)
                        : unlockStrategyList_;
            }
            /**
             * <code>repeated uint32 unlock_strategy_list = 10;</code>
             *
             * @return The count of unlockStrategyList.
             */
            public int getUnlockStrategyListCount() {
                return unlockStrategyList_.size();
            }
            /**
             * <code>repeated uint32 unlock_strategy_list = 10;</code>
             *
             * @param index The index of the element to return.
             * @return The unlockStrategyList at the given index.
             */
            public int getUnlockStrategyList(int index) {
                return unlockStrategyList_.getInt(index);
            }
            /**
             * <code>repeated uint32 unlock_strategy_list = 10;</code>
             *
             * @param index The index to set the value at.
             * @param value The unlockStrategyList to set.
             * @return This builder for chaining.
             */
            public Builder setUnlockStrategyList(int index, int value) {
                ensureUnlockStrategyListIsMutable();
                unlockStrategyList_.setInt(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 unlock_strategy_list = 10;</code>
             *
             * @param value The unlockStrategyList to add.
             * @return This builder for chaining.
             */
            public Builder addUnlockStrategyList(int value) {
                ensureUnlockStrategyListIsMutable();
                unlockStrategyList_.addInt(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 unlock_strategy_list = 10;</code>
             *
             * @param values The unlockStrategyList to add.
             * @return This builder for chaining.
             */
            public Builder addAllUnlockStrategyList(
                    java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureUnlockStrategyListIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, unlockStrategyList_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 unlock_strategy_list = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearUnlockStrategyList() {
                unlockStrategyList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }

            private int lJIOMIABKJC_;
            /**
             * <code>uint32 LJIOMIABKJC = 4;</code>
             *
             * @return The lJIOMIABKJC.
             */
            @java.lang.Override
            public int getLJIOMIABKJC() {
                return lJIOMIABKJC_;
            }
            /**
             * <code>uint32 LJIOMIABKJC = 4;</code>
             *
             * @param value The lJIOMIABKJC to set.
             * @return This builder for chaining.
             */
            public Builder setLJIOMIABKJC(int value) {

                lJIOMIABKJC_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 LJIOMIABKJC = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLJIOMIABKJC() {

                lJIOMIABKJC_ = 0;
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

            // @@protoc_insertion_point(builder_scope:VintageMarketNpcEventFinishNotify)
        }

        // @@protoc_insertion_point(class_scope:VintageMarketNpcEventFinishNotify)
        private static final emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                            .VintageMarketNpcEventFinishNotify();
        }

        public static emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<VintageMarketNpcEventFinishNotify> PARSER =
                new com.google.protobuf.AbstractParser<VintageMarketNpcEventFinishNotify>() {
                    @java.lang.Override
                    public VintageMarketNpcEventFinishNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new VintageMarketNpcEventFinishNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<VintageMarketNpcEventFinishNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<VintageMarketNpcEventFinishNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.VintageMarketNpcEventFinishNotifyOuterClass
                        .VintageMarketNpcEventFinishNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_VintageMarketNpcEventFinishNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_VintageMarketNpcEventFinishNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\'VintageMarketNpcEventFinishNotify.prot"
                    + "o\"k\n!VintageMarketNpcEventFinishNotify\022\023"
                    + "\n\013LGCEBJNOBAM\030\r \001(\r\022\034\n\024unlock_strategy_l"
                    + "ist\030\n \003(\r\022\023\n\013LJIOMIABKJC\030\004 \001(\rB\033\n\031emu.gr"
                    + "asscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_VintageMarketNpcEventFinishNotify_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_VintageMarketNpcEventFinishNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_VintageMarketNpcEventFinishNotify_descriptor,
                        new java.lang.String[] {
                            "LGCEBJNOBAM", "UnlockStrategyList", "LJIOMIABKJC",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
