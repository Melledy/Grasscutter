// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FurnitureMakeData.proto

package emu.grasscutter.net.proto;

public final class FurnitureMakeDataOuterClass {
    private FurnitureMakeDataOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface FurnitureMakeDataOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:FurnitureMakeData)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 index = 11;</code>
         *
         * @return The index.
         */
        int getIndex();

        /**
         * <code>fixed32 accelerateTime = 9;</code>
         *
         * @return The accelerateTime.
         */
        int getAccelerateTime();

        /**
         * <code>uint32 make_id = 12;</code>
         *
         * @return The makeId.
         */
        int getMakeId();

        /**
         * <code>fixed32 begin_time = 5;</code>
         *
         * @return The beginTime.
         */
        int getBeginTime();

        /**
         * <code>uint32 avatar_id = 4;</code>
         *
         * @return The avatarId.
         */
        int getAvatarId();

        /**
         * <code>uint32 durTime = 8;</code>
         *
         * @return The durTime.
         */
        int getDurTime();
    }
    /**
     *
     *
     * <pre>
     * Obf: GEJHMMOBDLD
     * </pre>
     *
     * Protobuf type {@code FurnitureMakeData}
     */
    public static final class FurnitureMakeData extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:FurnitureMakeData)
            FurnitureMakeDataOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use FurnitureMakeData.newBuilder() to construct.
        private FurnitureMakeData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private FurnitureMakeData() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new FurnitureMakeData();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private FurnitureMakeData(
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
                                avatarId_ = input.readUInt32();
                                break;
                            }
                        case 45:
                            {
                                beginTime_ = input.readFixed32();
                                break;
                            }
                        case 64:
                            {
                                durTime_ = input.readUInt32();
                                break;
                            }
                        case 77:
                            {
                                accelerateTime_ = input.readFixed32();
                                break;
                            }
                        case 88:
                            {
                                index_ = input.readUInt32();
                                break;
                            }
                        case 96:
                            {
                                makeId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.FurnitureMakeDataOuterClass
                    .internal_static_FurnitureMakeData_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.FurnitureMakeDataOuterClass
                    .internal_static_FurnitureMakeData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData.class,
                            emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData.Builder
                                    .class);
        }

        public static final int INDEX_FIELD_NUMBER = 11;
        private int index_;
        /**
         * <code>uint32 index = 11;</code>
         *
         * @return The index.
         */
        @java.lang.Override
        public int getIndex() {
            return index_;
        }

        public static final int ACCELERATETIME_FIELD_NUMBER = 9;
        private int accelerateTime_;
        /**
         * <code>fixed32 accelerateTime = 9;</code>
         *
         * @return The accelerateTime.
         */
        @java.lang.Override
        public int getAccelerateTime() {
            return accelerateTime_;
        }

        public static final int MAKE_ID_FIELD_NUMBER = 12;
        private int makeId_;
        /**
         * <code>uint32 make_id = 12;</code>
         *
         * @return The makeId.
         */
        @java.lang.Override
        public int getMakeId() {
            return makeId_;
        }

        public static final int BEGIN_TIME_FIELD_NUMBER = 5;
        private int beginTime_;
        /**
         * <code>fixed32 begin_time = 5;</code>
         *
         * @return The beginTime.
         */
        @java.lang.Override
        public int getBeginTime() {
            return beginTime_;
        }

        public static final int AVATAR_ID_FIELD_NUMBER = 4;
        private int avatarId_;
        /**
         * <code>uint32 avatar_id = 4;</code>
         *
         * @return The avatarId.
         */
        @java.lang.Override
        public int getAvatarId() {
            return avatarId_;
        }

        public static final int DURTIME_FIELD_NUMBER = 8;
        private int durTime_;
        /**
         * <code>uint32 durTime = 8;</code>
         *
         * @return The durTime.
         */
        @java.lang.Override
        public int getDurTime() {
            return durTime_;
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
            if (avatarId_ != 0) {
                output.writeUInt32(4, avatarId_);
            }
            if (beginTime_ != 0) {
                output.writeFixed32(5, beginTime_);
            }
            if (durTime_ != 0) {
                output.writeUInt32(8, durTime_);
            }
            if (accelerateTime_ != 0) {
                output.writeFixed32(9, accelerateTime_);
            }
            if (index_ != 0) {
                output.writeUInt32(11, index_);
            }
            if (makeId_ != 0) {
                output.writeUInt32(12, makeId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (avatarId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(4, avatarId_);
            }
            if (beginTime_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeFixed32Size(5, beginTime_);
            }
            if (durTime_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(8, durTime_);
            }
            if (accelerateTime_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeFixed32Size(9, accelerateTime_);
            }
            if (index_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, index_);
            }
            if (makeId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(12, makeId_);
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
                    instanceof emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData other =
                    (emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData) obj;

            if (getIndex() != other.getIndex()) return false;
            if (getAccelerateTime() != other.getAccelerateTime()) return false;
            if (getMakeId() != other.getMakeId()) return false;
            if (getBeginTime() != other.getBeginTime()) return false;
            if (getAvatarId() != other.getAvatarId()) return false;
            if (getDurTime() != other.getDurTime()) return false;
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
            hash = (37 * hash) + INDEX_FIELD_NUMBER;
            hash = (53 * hash) + getIndex();
            hash = (37 * hash) + ACCELERATETIME_FIELD_NUMBER;
            hash = (53 * hash) + getAccelerateTime();
            hash = (37 * hash) + MAKE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getMakeId();
            hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
            hash = (53 * hash) + getBeginTime();
            hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
            hash = (53 * hash) + getAvatarId();
            hash = (37 * hash) + DURTIME_FIELD_NUMBER;
            hash = (53 * hash) + getDurTime();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData parseFrom(
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
                emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData prototype) {
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
         * Obf: GEJHMMOBDLD
         * </pre>
         *
         * Protobuf type {@code FurnitureMakeData}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:FurnitureMakeData)
                emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.FurnitureMakeDataOuterClass
                        .internal_static_FurnitureMakeData_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.FurnitureMakeDataOuterClass
                        .internal_static_FurnitureMakeData_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData.class,
                                emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData.newBuilder()
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
                index_ = 0;

                accelerateTime_ = 0;

                makeId_ = 0;

                beginTime_ = 0;

                avatarId_ = 0;

                durTime_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.FurnitureMakeDataOuterClass
                        .internal_static_FurnitureMakeData_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData build() {
                emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData
                    buildPartial() {
                emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData result =
                        new emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData(this);
                result.index_ = index_;
                result.accelerateTime_ = accelerateTime_;
                result.makeId_ = makeId_;
                result.beginTime_ = beginTime_;
                result.avatarId_ = avatarId_;
                result.durTime_ = durTime_;
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
                        instanceof emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData other) {
                if (other
                        == emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData
                                .getDefaultInstance()) return this;
                if (other.getIndex() != 0) {
                    setIndex(other.getIndex());
                }
                if (other.getAccelerateTime() != 0) {
                    setAccelerateTime(other.getAccelerateTime());
                }
                if (other.getMakeId() != 0) {
                    setMakeId(other.getMakeId());
                }
                if (other.getBeginTime() != 0) {
                    setBeginTime(other.getBeginTime());
                }
                if (other.getAvatarId() != 0) {
                    setAvatarId(other.getAvatarId());
                }
                if (other.getDurTime() != 0) {
                    setDurTime(other.getDurTime());
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
                emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData parsedMessage =
                        null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int index_;
            /**
             * <code>uint32 index = 11;</code>
             *
             * @return The index.
             */
            @java.lang.Override
            public int getIndex() {
                return index_;
            }
            /**
             * <code>uint32 index = 11;</code>
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
             * <code>uint32 index = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIndex() {

                index_ = 0;
                onChanged();
                return this;
            }

            private int accelerateTime_;
            /**
             * <code>fixed32 accelerateTime = 9;</code>
             *
             * @return The accelerateTime.
             */
            @java.lang.Override
            public int getAccelerateTime() {
                return accelerateTime_;
            }
            /**
             * <code>fixed32 accelerateTime = 9;</code>
             *
             * @param value The accelerateTime to set.
             * @return This builder for chaining.
             */
            public Builder setAccelerateTime(int value) {

                accelerateTime_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>fixed32 accelerateTime = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAccelerateTime() {

                accelerateTime_ = 0;
                onChanged();
                return this;
            }

            private int makeId_;
            /**
             * <code>uint32 make_id = 12;</code>
             *
             * @return The makeId.
             */
            @java.lang.Override
            public int getMakeId() {
                return makeId_;
            }
            /**
             * <code>uint32 make_id = 12;</code>
             *
             * @param value The makeId to set.
             * @return This builder for chaining.
             */
            public Builder setMakeId(int value) {

                makeId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 make_id = 12;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMakeId() {

                makeId_ = 0;
                onChanged();
                return this;
            }

            private int beginTime_;
            /**
             * <code>fixed32 begin_time = 5;</code>
             *
             * @return The beginTime.
             */
            @java.lang.Override
            public int getBeginTime() {
                return beginTime_;
            }
            /**
             * <code>fixed32 begin_time = 5;</code>
             *
             * @param value The beginTime to set.
             * @return This builder for chaining.
             */
            public Builder setBeginTime(int value) {

                beginTime_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>fixed32 begin_time = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearBeginTime() {

                beginTime_ = 0;
                onChanged();
                return this;
            }

            private int avatarId_;
            /**
             * <code>uint32 avatar_id = 4;</code>
             *
             * @return The avatarId.
             */
            @java.lang.Override
            public int getAvatarId() {
                return avatarId_;
            }
            /**
             * <code>uint32 avatar_id = 4;</code>
             *
             * @param value The avatarId to set.
             * @return This builder for chaining.
             */
            public Builder setAvatarId(int value) {

                avatarId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 avatar_id = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAvatarId() {

                avatarId_ = 0;
                onChanged();
                return this;
            }

            private int durTime_;
            /**
             * <code>uint32 durTime = 8;</code>
             *
             * @return The durTime.
             */
            @java.lang.Override
            public int getDurTime() {
                return durTime_;
            }
            /**
             * <code>uint32 durTime = 8;</code>
             *
             * @param value The durTime to set.
             * @return This builder for chaining.
             */
            public Builder setDurTime(int value) {

                durTime_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 durTime = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearDurTime() {

                durTime_ = 0;
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

            // @@protoc_insertion_point(builder_scope:FurnitureMakeData)
        }

        // @@protoc_insertion_point(class_scope:FurnitureMakeData)
        private static final emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData();
        }

        public static emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<FurnitureMakeData> PARSER =
                new com.google.protobuf.AbstractParser<FurnitureMakeData>() {
                    @java.lang.Override
                    public FurnitureMakeData parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new FurnitureMakeData(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<FurnitureMakeData> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<FurnitureMakeData> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.FurnitureMakeDataOuterClass.FurnitureMakeData
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_FurnitureMakeData_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_FurnitureMakeData_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\027FurnitureMakeData.proto\"\203\001\n\021FurnitureM"
                    + "akeData\022\r\n\005index\030\013 \001(\r\022\026\n\016accelerateTime"
                    + "\030\t \001(\007\022\017\n\007make_id\030\014 \001(\r\022\022\n\nbegin_time\030\005 "
                    + "\001(\007\022\021\n\tavatar_id\030\004 \001(\r\022\017\n\007durTime\030\010 \001(\rB"
                    + "\033\n\031emu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_FurnitureMakeData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FurnitureMakeData_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_FurnitureMakeData_descriptor,
                        new java.lang.String[] {
                            "Index", "AccelerateTime", "MakeId", "BeginTime", "AvatarId", "DurTime",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
