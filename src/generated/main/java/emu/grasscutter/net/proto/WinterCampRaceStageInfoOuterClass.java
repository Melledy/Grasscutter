// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WinterCampRaceStageInfo.proto

package emu.grasscutter.net.proto;

public final class WinterCampRaceStageInfoOuterClass {
    private WinterCampRaceStageInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface WinterCampRaceStageInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:WinterCampRaceStageInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.Vector pos = 7;</code>
         *
         * @return Whether the pos field is set.
         */
        boolean hasPos();
        /**
         * <code>.Vector pos = 7;</code>
         *
         * @return The pos.
         */
        emu.grasscutter.net.proto.VectorOuterClass.Vector getPos();
        /** <code>.Vector pos = 7;</code> */
        emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();

        /**
         * <code>uint32 open_time = 2;</code>
         *
         * @return The openTime.
         */
        int getOpenTime();

        /**
         * <code>uint32 max_score = 15;</code>
         *
         * @return The maxScore.
         */
        int getMaxScore();

        /**
         * <code>uint32 id = 11;</code>
         *
         * @return The id.
         */
        int getId();
    }
    /**
     *
     *
     * <pre>
     * Obf: EGJNNEHKJCO
     * </pre>
     *
     * Protobuf type {@code WinterCampRaceStageInfo}
     */
    public static final class WinterCampRaceStageInfo extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:WinterCampRaceStageInfo)
            WinterCampRaceStageInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use WinterCampRaceStageInfo.newBuilder() to construct.
        private WinterCampRaceStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private WinterCampRaceStageInfo() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new WinterCampRaceStageInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private WinterCampRaceStageInfo(
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
                                openTime_ = input.readUInt32();
                                break;
                            }
                        case 58:
                            {
                                emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
                                if (pos_ != null) {
                                    subBuilder = pos_.toBuilder();
                                }
                                pos_ =
                                        input.readMessage(
                                                emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(),
                                                extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(pos_);
                                    pos_ = subBuilder.buildPartial();
                                }

                                break;
                            }
                        case 88:
                            {
                                id_ = input.readUInt32();
                                break;
                            }
                        case 120:
                            {
                                maxScore_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                    .internal_static_WinterCampRaceStageInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                    .internal_static_WinterCampRaceStageInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo
                                    .class,
                            emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo
                                    .Builder.class);
        }

        public static final int POS_FIELD_NUMBER = 7;
        private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
        /**
         * <code>.Vector pos = 7;</code>
         *
         * @return Whether the pos field is set.
         */
        @java.lang.Override
        public boolean hasPos() {
            return pos_ != null;
        }
        /**
         * <code>.Vector pos = 7;</code>
         *
         * @return The pos.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
            return pos_ == null
                    ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                    : pos_;
        }
        /** <code>.Vector pos = 7;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
            return getPos();
        }

        public static final int OPEN_TIME_FIELD_NUMBER = 2;
        private int openTime_;
        /**
         * <code>uint32 open_time = 2;</code>
         *
         * @return The openTime.
         */
        @java.lang.Override
        public int getOpenTime() {
            return openTime_;
        }

        public static final int MAX_SCORE_FIELD_NUMBER = 15;
        private int maxScore_;
        /**
         * <code>uint32 max_score = 15;</code>
         *
         * @return The maxScore.
         */
        @java.lang.Override
        public int getMaxScore() {
            return maxScore_;
        }

        public static final int ID_FIELD_NUMBER = 11;
        private int id_;
        /**
         * <code>uint32 id = 11;</code>
         *
         * @return The id.
         */
        @java.lang.Override
        public int getId() {
            return id_;
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
            if (openTime_ != 0) {
                output.writeUInt32(2, openTime_);
            }
            if (pos_ != null) {
                output.writeMessage(7, getPos());
            }
            if (id_ != 0) {
                output.writeUInt32(11, id_);
            }
            if (maxScore_ != 0) {
                output.writeUInt32(15, maxScore_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (openTime_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(2, openTime_);
            }
            if (pos_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(7, getPos());
            }
            if (id_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, id_);
            }
            if (maxScore_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(15, maxScore_);
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
                    emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo other =
                    (emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo) obj;

            if (hasPos() != other.hasPos()) return false;
            if (hasPos()) {
                if (!getPos().equals(other.getPos())) return false;
            }
            if (getOpenTime() != other.getOpenTime()) return false;
            if (getMaxScore() != other.getMaxScore()) return false;
            if (getId() != other.getId()) return false;
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
            if (hasPos()) {
                hash = (37 * hash) + POS_FIELD_NUMBER;
                hash = (53 * hash) + getPos().hashCode();
            }
            hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
            hash = (53 * hash) + getOpenTime();
            hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
            hash = (53 * hash) + getMaxScore();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + getId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .WinterCampRaceStageInfo
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .WinterCampRaceStageInfo
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .WinterCampRaceStageInfo
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .WinterCampRaceStageInfo
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .WinterCampRaceStageInfo
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .WinterCampRaceStageInfo
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .WinterCampRaceStageInfo
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .WinterCampRaceStageInfo
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .WinterCampRaceStageInfo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .WinterCampRaceStageInfo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .WinterCampRaceStageInfo
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .WinterCampRaceStageInfo
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
                emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo
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
         * Obf: EGJNNEHKJCO
         * </pre>
         *
         * Protobuf type {@code WinterCampRaceStageInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:WinterCampRaceStageInfo)
                emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .WinterCampRaceStageInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .internal_static_WinterCampRaceStageInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .internal_static_WinterCampRaceStageInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo
                                        .class,
                                emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo.newBuilder()
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
                if (posBuilder_ == null) {
                    pos_ = null;
                } else {
                    pos_ = null;
                    posBuilder_ = null;
                }
                openTime_ = 0;

                maxScore_ = 0;

                id_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .internal_static_WinterCampRaceStageInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo
                    build() {
                emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo
                    buildPartial() {
                emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo result =
                        new emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo(
                                this);
                if (posBuilder_ == null) {
                    result.pos_ = pos_;
                } else {
                    result.pos_ = posBuilder_.build();
                }
                result.openTime_ = openTime_;
                result.maxScore_ = maxScore_;
                result.id_ = id_;
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
                        emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo
                            other) {
                if (other
                        == emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo
                                .getDefaultInstance()) return this;
                if (other.hasPos()) {
                    mergePos(other.getPos());
                }
                if (other.getOpenTime() != 0) {
                    setOpenTime(other.getOpenTime());
                }
                if (other.getMaxScore() != 0) {
                    setMaxScore(other.getMaxScore());
                }
                if (other.getId() != 0) {
                    setId(other.getId());
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
                emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.VectorOuterClass.Vector,
                            emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder,
                            emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>
                    posBuilder_;
            /**
             * <code>.Vector pos = 7;</code>
             *
             * @return Whether the pos field is set.
             */
            public boolean hasPos() {
                return posBuilder_ != null || pos_ != null;
            }
            /**
             * <code>.Vector pos = 7;</code>
             *
             * @return The pos.
             */
            public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
                if (posBuilder_ == null) {
                    return pos_ == null
                            ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                            : pos_;
                } else {
                    return posBuilder_.getMessage();
                }
            }
            /** <code>.Vector pos = 7;</code> */
            public Builder setPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
                if (posBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    pos_ = value;
                    onChanged();
                } else {
                    posBuilder_.setMessage(value);
                }

                return this;
            }
            /** <code>.Vector pos = 7;</code> */
            public Builder setPos(
                    emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
                if (posBuilder_ == null) {
                    pos_ = builderForValue.build();
                    onChanged();
                } else {
                    posBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /** <code>.Vector pos = 7;</code> */
            public Builder mergePos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
                if (posBuilder_ == null) {
                    if (pos_ != null) {
                        pos_ =
                                emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(pos_)
                                        .mergeFrom(value)
                                        .buildPartial();
                    } else {
                        pos_ = value;
                    }
                    onChanged();
                } else {
                    posBuilder_.mergeFrom(value);
                }

                return this;
            }
            /** <code>.Vector pos = 7;</code> */
            public Builder clearPos() {
                if (posBuilder_ == null) {
                    pos_ = null;
                    onChanged();
                } else {
                    pos_ = null;
                    posBuilder_ = null;
                }

                return this;
            }
            /** <code>.Vector pos = 7;</code> */
            public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPosBuilder() {

                onChanged();
                return getPosFieldBuilder().getBuilder();
            }
            /** <code>.Vector pos = 7;</code> */
            public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
                if (posBuilder_ != null) {
                    return posBuilder_.getMessageOrBuilder();
                } else {
                    return pos_ == null
                            ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                            : pos_;
                }
            }
            /** <code>.Vector pos = 7;</code> */
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.VectorOuterClass.Vector,
                            emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder,
                            emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>
                    getPosFieldBuilder() {
                if (posBuilder_ == null) {
                    posBuilder_ =
                            new com.google.protobuf.SingleFieldBuilderV3<
                                    emu.grasscutter.net.proto.VectorOuterClass.Vector,
                                    emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder,
                                    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                                    getPos(), getParentForChildren(), isClean());
                    pos_ = null;
                }
                return posBuilder_;
            }

            private int openTime_;
            /**
             * <code>uint32 open_time = 2;</code>
             *
             * @return The openTime.
             */
            @java.lang.Override
            public int getOpenTime() {
                return openTime_;
            }
            /**
             * <code>uint32 open_time = 2;</code>
             *
             * @param value The openTime to set.
             * @return This builder for chaining.
             */
            public Builder setOpenTime(int value) {

                openTime_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 open_time = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearOpenTime() {

                openTime_ = 0;
                onChanged();
                return this;
            }

            private int maxScore_;
            /**
             * <code>uint32 max_score = 15;</code>
             *
             * @return The maxScore.
             */
            @java.lang.Override
            public int getMaxScore() {
                return maxScore_;
            }
            /**
             * <code>uint32 max_score = 15;</code>
             *
             * @param value The maxScore to set.
             * @return This builder for chaining.
             */
            public Builder setMaxScore(int value) {

                maxScore_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 max_score = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMaxScore() {

                maxScore_ = 0;
                onChanged();
                return this;
            }

            private int id_;
            /**
             * <code>uint32 id = 11;</code>
             *
             * @return The id.
             */
            @java.lang.Override
            public int getId() {
                return id_;
            }
            /**
             * <code>uint32 id = 11;</code>
             *
             * @param value The id to set.
             * @return This builder for chaining.
             */
            public Builder setId(int value) {

                id_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 id = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearId() {

                id_ = 0;
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

            // @@protoc_insertion_point(builder_scope:WinterCampRaceStageInfo)
        }

        // @@protoc_insertion_point(class_scope:WinterCampRaceStageInfo)
        private static final emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .WinterCampRaceStageInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo();
        }

        public static emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass
                        .WinterCampRaceStageInfo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<WinterCampRaceStageInfo> PARSER =
                new com.google.protobuf.AbstractParser<WinterCampRaceStageInfo>() {
                    @java.lang.Override
                    public WinterCampRaceStageInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new WinterCampRaceStageInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<WinterCampRaceStageInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<WinterCampRaceStageInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.WinterCampRaceStageInfoOuterClass.WinterCampRaceStageInfo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_WinterCampRaceStageInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_WinterCampRaceStageInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\035WinterCampRaceStageInfo.proto\032\014Vector."
                    + "proto\"a\n\027WinterCampRaceStageInfo\022\024\n\003pos\030"
                    + "\007 \001(\0132\007.Vector\022\021\n\topen_time\030\002 \001(\r\022\021\n\tmax"
                    + "_score\030\017 \001(\r\022\n\n\002id\030\013 \001(\rB\033\n\031emu.grasscut"
                    + "ter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
                        });
        internal_static_WinterCampRaceStageInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WinterCampRaceStageInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_WinterCampRaceStageInfo_descriptor,
                        new java.lang.String[] {
                            "Pos", "OpenTime", "MaxScore", "Id",
                        });
        emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
