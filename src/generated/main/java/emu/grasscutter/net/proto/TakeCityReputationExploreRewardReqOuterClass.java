// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeCityReputationExploreRewardReq.proto

package emu.grasscutter.net.proto;

public final class TakeCityReputationExploreRewardReqOuterClass {
    private TakeCityReputationExploreRewardReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface TakeCityReputationExploreRewardReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:TakeCityReputationExploreRewardReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated uint32 explore_id_list = 9;</code>
         *
         * @return A list containing the exploreIdList.
         */
        java.util.List<java.lang.Integer> getExploreIdListList();
        /**
         * <code>repeated uint32 explore_id_list = 9;</code>
         *
         * @return The count of exploreIdList.
         */
        int getExploreIdListCount();
        /**
         * <code>repeated uint32 explore_id_list = 9;</code>
         *
         * @param index The index of the element to return.
         * @return The exploreIdList at the given index.
         */
        int getExploreIdList(int index);

        /**
         * <code>uint32 city_id = 11;</code>
         *
         * @return The cityId.
         */
        int getCityId();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 2834
     * Obf: GMFGIEFMNMC
     * </pre>
     *
     * Protobuf type {@code TakeCityReputationExploreRewardReq}
     */
    public static final class TakeCityReputationExploreRewardReq
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:TakeCityReputationExploreRewardReq)
            TakeCityReputationExploreRewardReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use TakeCityReputationExploreRewardReq.newBuilder() to construct.
        private TakeCityReputationExploreRewardReq(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private TakeCityReputationExploreRewardReq() {
            exploreIdList_ = emptyIntList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new TakeCityReputationExploreRewardReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private TakeCityReputationExploreRewardReq(
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
                        case 72:
                            {
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    exploreIdList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                exploreIdList_.addInt(input.readUInt32());
                                break;
                            }
                        case 74:
                            {
                                int length = input.readRawVarint32();
                                int limit = input.pushLimit(length);
                                if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                                    exploreIdList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                while (input.getBytesUntilLimit() > 0) {
                                    exploreIdList_.addInt(input.readUInt32());
                                }
                                input.popLimit(limit);
                                break;
                            }
                        case 88:
                            {
                                cityId_ = input.readUInt32();
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
                    exploreIdList_.makeImmutable(); // C
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                    .internal_static_TakeCityReputationExploreRewardReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                    .internal_static_TakeCityReputationExploreRewardReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                                    .TakeCityReputationExploreRewardReq.class,
                            emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                                    .TakeCityReputationExploreRewardReq.Builder.class);
        }

        public static final int EXPLORE_ID_LIST_FIELD_NUMBER = 9;
        private com.google.protobuf.Internal.IntList exploreIdList_;
        /**
         * <code>repeated uint32 explore_id_list = 9;</code>
         *
         * @return A list containing the exploreIdList.
         */
        @java.lang.Override
        public java.util.List<java.lang.Integer> getExploreIdListList() {
            return exploreIdList_;
        }
        /**
         * <code>repeated uint32 explore_id_list = 9;</code>
         *
         * @return The count of exploreIdList.
         */
        public int getExploreIdListCount() {
            return exploreIdList_.size();
        }
        /**
         * <code>repeated uint32 explore_id_list = 9;</code>
         *
         * @param index The index of the element to return.
         * @return The exploreIdList at the given index.
         */
        public int getExploreIdList(int index) {
            return exploreIdList_.getInt(index);
        }

        private int exploreIdListMemoizedSerializedSize = -1;

        public static final int CITY_ID_FIELD_NUMBER = 11;
        private int cityId_;
        /**
         * <code>uint32 city_id = 11;</code>
         *
         * @return The cityId.
         */
        @java.lang.Override
        public int getCityId() {
            return cityId_;
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
            if (getExploreIdListList().size() > 0) {
                output.writeUInt32NoTag(74);
                output.writeUInt32NoTag(exploreIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < exploreIdList_.size(); i++) {
                output.writeUInt32NoTag(exploreIdList_.getInt(i));
            }
            if (cityId_ != 0) {
                output.writeUInt32(11, cityId_);
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
                for (int i = 0; i < exploreIdList_.size(); i++) {
                    dataSize +=
                            com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(
                                    exploreIdList_.getInt(i));
                }
                size += dataSize;
                if (!getExploreIdListList().isEmpty()) {
                    size += 1;
                    size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
                }
                exploreIdListMemoizedSerializedSize = dataSize;
            }
            if (cityId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, cityId_);
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
                    emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                            .TakeCityReputationExploreRewardReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                            .TakeCityReputationExploreRewardReq
                    other =
                            (emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                                            .TakeCityReputationExploreRewardReq)
                                    obj;

            if (!getExploreIdListList().equals(other.getExploreIdListList())) return false;
            if (getCityId() != other.getCityId()) return false;
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
            if (getExploreIdListCount() > 0) {
                hash = (37 * hash) + EXPLORE_ID_LIST_FIELD_NUMBER;
                hash = (53 * hash) + getExploreIdListList().hashCode();
            }
            hash = (37 * hash) + CITY_ID_FIELD_NUMBER;
            hash = (53 * hash) + getCityId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReq
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReq
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReq
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReq
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReq
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReq
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReq
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReq
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReq
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReq
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
                emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                                .TakeCityReputationExploreRewardReq
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
         * CmdId: 2834
         * Obf: GMFGIEFMNMC
         * </pre>
         *
         * Protobuf type {@code TakeCityReputationExploreRewardReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:TakeCityReputationExploreRewardReq)
                emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .internal_static_TakeCityReputationExploreRewardReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .internal_static_TakeCityReputationExploreRewardReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                                        .TakeCityReputationExploreRewardReq.class,
                                emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                                        .TakeCityReputationExploreRewardReq.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass.TakeCityReputationExploreRewardReq.newBuilder()
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
                exploreIdList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                cityId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .internal_static_TakeCityReputationExploreRewardReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                            .TakeCityReputationExploreRewardReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReq.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                            .TakeCityReputationExploreRewardReq
                    build() {
                emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                                .TakeCityReputationExploreRewardReq
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                            .TakeCityReputationExploreRewardReq
                    buildPartial() {
                emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                                .TakeCityReputationExploreRewardReq
                        result =
                                new emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                                        .TakeCityReputationExploreRewardReq(this);
                int from_bitField0_ = bitField0_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    exploreIdList_.makeImmutable();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.exploreIdList_ = exploreIdList_;
                result.cityId_ = cityId_;
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
                        emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                                .TakeCityReputationExploreRewardReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                                            .TakeCityReputationExploreRewardReq)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                                    .TakeCityReputationExploreRewardReq
                            other) {
                if (other
                        == emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                                .TakeCityReputationExploreRewardReq.getDefaultInstance()) return this;
                if (!other.exploreIdList_.isEmpty()) {
                    if (exploreIdList_.isEmpty()) {
                        exploreIdList_ = other.exploreIdList_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureExploreIdListIsMutable();
                        exploreIdList_.addAll(other.exploreIdList_);
                    }
                    onChanged();
                }
                if (other.getCityId() != 0) {
                    setCityId(other.getCityId());
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
                emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                                .TakeCityReputationExploreRewardReq
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                                            .TakeCityReputationExploreRewardReq)
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

            private com.google.protobuf.Internal.IntList exploreIdList_ = emptyIntList();

            private void ensureExploreIdListIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    exploreIdList_ = mutableCopy(exploreIdList_);
                    bitField0_ |= 0x00000001;
                }
            }
            /**
             * <code>repeated uint32 explore_id_list = 9;</code>
             *
             * @return A list containing the exploreIdList.
             */
            public java.util.List<java.lang.Integer> getExploreIdListList() {
                return ((bitField0_ & 0x00000001) != 0)
                        ? java.util.Collections.unmodifiableList(exploreIdList_)
                        : exploreIdList_;
            }
            /**
             * <code>repeated uint32 explore_id_list = 9;</code>
             *
             * @return The count of exploreIdList.
             */
            public int getExploreIdListCount() {
                return exploreIdList_.size();
            }
            /**
             * <code>repeated uint32 explore_id_list = 9;</code>
             *
             * @param index The index of the element to return.
             * @return The exploreIdList at the given index.
             */
            public int getExploreIdList(int index) {
                return exploreIdList_.getInt(index);
            }
            /**
             * <code>repeated uint32 explore_id_list = 9;</code>
             *
             * @param index The index to set the value at.
             * @param value The exploreIdList to set.
             * @return This builder for chaining.
             */
            public Builder setExploreIdList(int index, int value) {
                ensureExploreIdListIsMutable();
                exploreIdList_.setInt(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 explore_id_list = 9;</code>
             *
             * @param value The exploreIdList to add.
             * @return This builder for chaining.
             */
            public Builder addExploreIdList(int value) {
                ensureExploreIdListIsMutable();
                exploreIdList_.addInt(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 explore_id_list = 9;</code>
             *
             * @param values The exploreIdList to add.
             * @return This builder for chaining.
             */
            public Builder addAllExploreIdList(java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureExploreIdListIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, exploreIdList_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 explore_id_list = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearExploreIdList() {
                exploreIdList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }

            private int cityId_;
            /**
             * <code>uint32 city_id = 11;</code>
             *
             * @return The cityId.
             */
            @java.lang.Override
            public int getCityId() {
                return cityId_;
            }
            /**
             * <code>uint32 city_id = 11;</code>
             *
             * @param value The cityId to set.
             * @return This builder for chaining.
             */
            public Builder setCityId(int value) {

                cityId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 city_id = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCityId() {

                cityId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:TakeCityReputationExploreRewardReq)
        }

        // @@protoc_insertion_point(class_scope:TakeCityReputationExploreRewardReq)
        private static final emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                            .TakeCityReputationExploreRewardReq();
        }

        public static emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<TakeCityReputationExploreRewardReq> PARSER =
                new com.google.protobuf.AbstractParser<TakeCityReputationExploreRewardReq>() {
                    @java.lang.Override
                    public TakeCityReputationExploreRewardReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new TakeCityReputationExploreRewardReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<TakeCityReputationExploreRewardReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<TakeCityReputationExploreRewardReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.TakeCityReputationExploreRewardReqOuterClass
                        .TakeCityReputationExploreRewardReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_TakeCityReputationExploreRewardReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_TakeCityReputationExploreRewardReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n(TakeCityReputationExploreRewardReq.pro"
                    + "to\"N\n\"TakeCityReputationExploreRewardReq"
                    + "\022\027\n\017explore_id_list\030\t \003(\r\022\017\n\007city_id\030\013 \001"
                    + "(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_TakeCityReputationExploreRewardReq_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_TakeCityReputationExploreRewardReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_TakeCityReputationExploreRewardReq_descriptor,
                        new java.lang.String[] {
                            "ExploreIdList", "CityId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
