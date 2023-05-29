// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LanternProjectionLevelInfo.proto

package emu.grasscutter.net.proto;

public final class LanternProjectionLevelInfoOuterClass {
    private LanternProjectionLevelInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface LanternProjectionLevelInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:LanternProjectionLevelInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bool BHFCMBEMGIN = 2;</code>
         *
         * @return The bHFCMBEMGIN.
         */
        boolean getBHFCMBEMGIN();

        /**
         * <code>uint32 id = 1;</code>
         *
         * @return The id.
         */
        int getId();

        /**
         * <code>bool is_finished = 13;</code>
         *
         * @return The isFinished.
         */
        boolean getIsFinished();

        /**
         * <code>bool OEBMEKDJDIO = 5;</code>
         *
         * @return The oEBMEKDJDIO.
         */
        boolean getOEBMEKDJDIO();

        /**
         * <code>uint32 min_finish_time = 10;</code>
         *
         * @return The minFinishTime.
         */
        int getMinFinishTime();
    }
    /**
     *
     *
     * <pre>
     * Obf: FCGKNGEPNDI
     * </pre>
     *
     * Protobuf type {@code LanternProjectionLevelInfo}
     */
    public static final class LanternProjectionLevelInfo
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:LanternProjectionLevelInfo)
            LanternProjectionLevelInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use LanternProjectionLevelInfo.newBuilder() to construct.
        private LanternProjectionLevelInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private LanternProjectionLevelInfo() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new LanternProjectionLevelInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private LanternProjectionLevelInfo(
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
                                id_ = input.readUInt32();
                                break;
                            }
                        case 16:
                            {
                                bHFCMBEMGIN_ = input.readBool();
                                break;
                            }
                        case 40:
                            {
                                oEBMEKDJDIO_ = input.readBool();
                                break;
                            }
                        case 80:
                            {
                                minFinishTime_ = input.readUInt32();
                                break;
                            }
                        case 104:
                            {
                                isFinished_ = input.readBool();
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
            return emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                    .internal_static_LanternProjectionLevelInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                    .internal_static_LanternProjectionLevelInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                                    .LanternProjectionLevelInfo.class,
                            emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                                    .LanternProjectionLevelInfo.Builder.class);
        }

        public static final int BHFCMBEMGIN_FIELD_NUMBER = 2;
        private boolean bHFCMBEMGIN_;
        /**
         * <code>bool BHFCMBEMGIN = 2;</code>
         *
         * @return The bHFCMBEMGIN.
         */
        @java.lang.Override
        public boolean getBHFCMBEMGIN() {
            return bHFCMBEMGIN_;
        }

        public static final int ID_FIELD_NUMBER = 1;
        private int id_;
        /**
         * <code>uint32 id = 1;</code>
         *
         * @return The id.
         */
        @java.lang.Override
        public int getId() {
            return id_;
        }

        public static final int IS_FINISHED_FIELD_NUMBER = 13;
        private boolean isFinished_;
        /**
         * <code>bool is_finished = 13;</code>
         *
         * @return The isFinished.
         */
        @java.lang.Override
        public boolean getIsFinished() {
            return isFinished_;
        }

        public static final int OEBMEKDJDIO_FIELD_NUMBER = 5;
        private boolean oEBMEKDJDIO_;
        /**
         * <code>bool OEBMEKDJDIO = 5;</code>
         *
         * @return The oEBMEKDJDIO.
         */
        @java.lang.Override
        public boolean getOEBMEKDJDIO() {
            return oEBMEKDJDIO_;
        }

        public static final int MIN_FINISH_TIME_FIELD_NUMBER = 10;
        private int minFinishTime_;
        /**
         * <code>uint32 min_finish_time = 10;</code>
         *
         * @return The minFinishTime.
         */
        @java.lang.Override
        public int getMinFinishTime() {
            return minFinishTime_;
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
            if (id_ != 0) {
                output.writeUInt32(1, id_);
            }
            if (bHFCMBEMGIN_ != false) {
                output.writeBool(2, bHFCMBEMGIN_);
            }
            if (oEBMEKDJDIO_ != false) {
                output.writeBool(5, oEBMEKDJDIO_);
            }
            if (minFinishTime_ != 0) {
                output.writeUInt32(10, minFinishTime_);
            }
            if (isFinished_ != false) {
                output.writeBool(13, isFinished_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(1, id_);
            }
            if (bHFCMBEMGIN_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, bHFCMBEMGIN_);
            }
            if (oEBMEKDJDIO_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(5, oEBMEKDJDIO_);
            }
            if (minFinishTime_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(10, minFinishTime_);
            }
            if (isFinished_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(13, isFinished_);
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
                    emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                            .LanternProjectionLevelInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo
                    other =
                            (emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                                            .LanternProjectionLevelInfo)
                                    obj;

            if (getBHFCMBEMGIN() != other.getBHFCMBEMGIN()) return false;
            if (getId() != other.getId()) return false;
            if (getIsFinished() != other.getIsFinished()) return false;
            if (getOEBMEKDJDIO() != other.getOEBMEKDJDIO()) return false;
            if (getMinFinishTime() != other.getMinFinishTime()) return false;
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
            hash = (37 * hash) + BHFCMBEMGIN_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getBHFCMBEMGIN());
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + getId();
            hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsFinished());
            hash = (37 * hash) + OEBMEKDJDIO_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getOEBMEKDJDIO());
            hash = (37 * hash) + MIN_FINISH_TIME_FIELD_NUMBER;
            hash = (53 * hash) + getMinFinishTime();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .LanternProjectionLevelInfo
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .LanternProjectionLevelInfo
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .LanternProjectionLevelInfo
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .LanternProjectionLevelInfo
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .LanternProjectionLevelInfo
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .LanternProjectionLevelInfo
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .LanternProjectionLevelInfo
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .LanternProjectionLevelInfo
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .LanternProjectionLevelInfo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .LanternProjectionLevelInfo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .LanternProjectionLevelInfo
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .LanternProjectionLevelInfo
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
                emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo
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
         * Obf: FCGKNGEPNDI
         * </pre>
         *
         * Protobuf type {@code LanternProjectionLevelInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:LanternProjectionLevelInfo)
                emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .LanternProjectionLevelInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .internal_static_LanternProjectionLevelInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .internal_static_LanternProjectionLevelInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                                        .LanternProjectionLevelInfo.class,
                                emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                                        .LanternProjectionLevelInfo.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo.newBuilder()
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
                bHFCMBEMGIN_ = false;

                id_ = 0;

                isFinished_ = false;

                oEBMEKDJDIO_ = false;

                minFinishTime_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .internal_static_LanternProjectionLevelInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                            .LanternProjectionLevelInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .LanternProjectionLevelInfo.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                            .LanternProjectionLevelInfo
                    build() {
                emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                            .LanternProjectionLevelInfo
                    buildPartial() {
                emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo
                        result =
                                new emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                                        .LanternProjectionLevelInfo(this);
                result.bHFCMBEMGIN_ = bHFCMBEMGIN_;
                result.id_ = id_;
                result.isFinished_ = isFinished_;
                result.oEBMEKDJDIO_ = oEBMEKDJDIO_;
                result.minFinishTime_ = minFinishTime_;
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
                        emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                                .LanternProjectionLevelInfo) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                                            .LanternProjectionLevelInfo)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo
                            other) {
                if (other
                        == emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                                .LanternProjectionLevelInfo.getDefaultInstance()) return this;
                if (other.getBHFCMBEMGIN() != false) {
                    setBHFCMBEMGIN(other.getBHFCMBEMGIN());
                }
                if (other.getId() != 0) {
                    setId(other.getId());
                }
                if (other.getIsFinished() != false) {
                    setIsFinished(other.getIsFinished());
                }
                if (other.getOEBMEKDJDIO() != false) {
                    setOEBMEKDJDIO(other.getOEBMEKDJDIO());
                }
                if (other.getMinFinishTime() != 0) {
                    setMinFinishTime(other.getMinFinishTime());
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
                emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                                            .LanternProjectionLevelInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private boolean bHFCMBEMGIN_;
            /**
             * <code>bool BHFCMBEMGIN = 2;</code>
             *
             * @return The bHFCMBEMGIN.
             */
            @java.lang.Override
            public boolean getBHFCMBEMGIN() {
                return bHFCMBEMGIN_;
            }
            /**
             * <code>bool BHFCMBEMGIN = 2;</code>
             *
             * @param value The bHFCMBEMGIN to set.
             * @return This builder for chaining.
             */
            public Builder setBHFCMBEMGIN(boolean value) {

                bHFCMBEMGIN_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool BHFCMBEMGIN = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearBHFCMBEMGIN() {

                bHFCMBEMGIN_ = false;
                onChanged();
                return this;
            }

            private int id_;
            /**
             * <code>uint32 id = 1;</code>
             *
             * @return The id.
             */
            @java.lang.Override
            public int getId() {
                return id_;
            }
            /**
             * <code>uint32 id = 1;</code>
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
             * <code>uint32 id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearId() {

                id_ = 0;
                onChanged();
                return this;
            }

            private boolean isFinished_;
            /**
             * <code>bool is_finished = 13;</code>
             *
             * @return The isFinished.
             */
            @java.lang.Override
            public boolean getIsFinished() {
                return isFinished_;
            }
            /**
             * <code>bool is_finished = 13;</code>
             *
             * @param value The isFinished to set.
             * @return This builder for chaining.
             */
            public Builder setIsFinished(boolean value) {

                isFinished_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_finished = 13;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsFinished() {

                isFinished_ = false;
                onChanged();
                return this;
            }

            private boolean oEBMEKDJDIO_;
            /**
             * <code>bool OEBMEKDJDIO = 5;</code>
             *
             * @return The oEBMEKDJDIO.
             */
            @java.lang.Override
            public boolean getOEBMEKDJDIO() {
                return oEBMEKDJDIO_;
            }
            /**
             * <code>bool OEBMEKDJDIO = 5;</code>
             *
             * @param value The oEBMEKDJDIO to set.
             * @return This builder for chaining.
             */
            public Builder setOEBMEKDJDIO(boolean value) {

                oEBMEKDJDIO_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool OEBMEKDJDIO = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearOEBMEKDJDIO() {

                oEBMEKDJDIO_ = false;
                onChanged();
                return this;
            }

            private int minFinishTime_;
            /**
             * <code>uint32 min_finish_time = 10;</code>
             *
             * @return The minFinishTime.
             */
            @java.lang.Override
            public int getMinFinishTime() {
                return minFinishTime_;
            }
            /**
             * <code>uint32 min_finish_time = 10;</code>
             *
             * @param value The minFinishTime to set.
             * @return This builder for chaining.
             */
            public Builder setMinFinishTime(int value) {

                minFinishTime_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 min_finish_time = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMinFinishTime() {

                minFinishTime_ = 0;
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

            // @@protoc_insertion_point(builder_scope:LanternProjectionLevelInfo)
        }

        // @@protoc_insertion_point(class_scope:LanternProjectionLevelInfo)
        private static final emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .LanternProjectionLevelInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                            .LanternProjectionLevelInfo();
        }

        public static emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass
                        .LanternProjectionLevelInfo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<LanternProjectionLevelInfo> PARSER =
                new com.google.protobuf.AbstractParser<LanternProjectionLevelInfo>() {
                    @java.lang.Override
                    public LanternProjectionLevelInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new LanternProjectionLevelInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<LanternProjectionLevelInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<LanternProjectionLevelInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.LanternProjectionLevelInfoOuterClass.LanternProjectionLevelInfo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_LanternProjectionLevelInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_LanternProjectionLevelInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n LanternProjectionLevelInfo.proto\"\200\001\n\032L"
                    + "anternProjectionLevelInfo\022\023\n\013BHFCMBEMGIN"
                    + "\030\002 \001(\010\022\n\n\002id\030\001 \001(\r\022\023\n\013is_finished\030\r \001(\010\022"
                    + "\023\n\013OEBMEKDJDIO\030\005 \001(\010\022\027\n\017min_finish_time\030"
                    + "\n \001(\rB\033\n\031emu.grasscutter.net.protob\006prot"
                    + "o3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_LanternProjectionLevelInfo_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_LanternProjectionLevelInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_LanternProjectionLevelInfo_descriptor,
                        new java.lang.String[] {
                            "BHFCMBEMGIN", "Id", "IsFinished", "OEBMEKDJDIO", "MinFinishTime",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
