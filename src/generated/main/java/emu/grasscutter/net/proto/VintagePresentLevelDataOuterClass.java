// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintagePresentLevelData.proto

package emu.grasscutter.net.proto;

public final class VintagePresentLevelDataOuterClass {
    private VintagePresentLevelDataOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface VintagePresentLevelDataOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:VintagePresentLevelData)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 present_id = 6;</code>
         *
         * @return The presentId.
         */
        int getPresentId();

        /**
         * <code>bool is_finish = 4;</code>
         *
         * @return The isFinish.
         */
        boolean getIsFinish();

        /**
         * <code>uint32 stage_id = 5;</code>
         *
         * @return The stageId.
         */
        int getStageId();

        /**
         * <code>bool is_open = 13;</code>
         *
         * @return The isOpen.
         */
        boolean getIsOpen();
    }
    /**
     *
     *
     * <pre>
     * Obf: AEGIBHGNMDO
     * </pre>
     *
     * Protobuf type {@code VintagePresentLevelData}
     */
    public static final class VintagePresentLevelData extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:VintagePresentLevelData)
            VintagePresentLevelDataOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use VintagePresentLevelData.newBuilder() to construct.
        private VintagePresentLevelData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private VintagePresentLevelData() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new VintagePresentLevelData();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private VintagePresentLevelData(
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
                                isFinish_ = input.readBool();
                                break;
                            }
                        case 40:
                            {
                                stageId_ = input.readUInt32();
                                break;
                            }
                        case 48:
                            {
                                presentId_ = input.readUInt32();
                                break;
                            }
                        case 104:
                            {
                                isOpen_ = input.readBool();
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
            return emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                    .internal_static_VintagePresentLevelData_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                    .internal_static_VintagePresentLevelData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData
                                    .class,
                            emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData
                                    .Builder.class);
        }

        public static final int PRESENT_ID_FIELD_NUMBER = 6;
        private int presentId_;
        /**
         * <code>uint32 present_id = 6;</code>
         *
         * @return The presentId.
         */
        @java.lang.Override
        public int getPresentId() {
            return presentId_;
        }

        public static final int IS_FINISH_FIELD_NUMBER = 4;
        private boolean isFinish_;
        /**
         * <code>bool is_finish = 4;</code>
         *
         * @return The isFinish.
         */
        @java.lang.Override
        public boolean getIsFinish() {
            return isFinish_;
        }

        public static final int STAGE_ID_FIELD_NUMBER = 5;
        private int stageId_;
        /**
         * <code>uint32 stage_id = 5;</code>
         *
         * @return The stageId.
         */
        @java.lang.Override
        public int getStageId() {
            return stageId_;
        }

        public static final int IS_OPEN_FIELD_NUMBER = 13;
        private boolean isOpen_;
        /**
         * <code>bool is_open = 13;</code>
         *
         * @return The isOpen.
         */
        @java.lang.Override
        public boolean getIsOpen() {
            return isOpen_;
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
            if (isFinish_ != false) {
                output.writeBool(4, isFinish_);
            }
            if (stageId_ != 0) {
                output.writeUInt32(5, stageId_);
            }
            if (presentId_ != 0) {
                output.writeUInt32(6, presentId_);
            }
            if (isOpen_ != false) {
                output.writeBool(13, isOpen_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (isFinish_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, isFinish_);
            }
            if (stageId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(5, stageId_);
            }
            if (presentId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(6, presentId_);
            }
            if (isOpen_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(13, isOpen_);
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
                    emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData other =
                    (emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData) obj;

            if (getPresentId() != other.getPresentId()) return false;
            if (getIsFinish() != other.getIsFinish()) return false;
            if (getStageId() != other.getStageId()) return false;
            if (getIsOpen() != other.getIsOpen()) return false;
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
            hash = (37 * hash) + PRESENT_ID_FIELD_NUMBER;
            hash = (53 * hash) + getPresentId();
            hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsFinish());
            hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getStageId();
            hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsOpen());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .VintagePresentLevelData
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .VintagePresentLevelData
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .VintagePresentLevelData
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .VintagePresentLevelData
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .VintagePresentLevelData
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .VintagePresentLevelData
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .VintagePresentLevelData
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .VintagePresentLevelData
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .VintagePresentLevelData
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .VintagePresentLevelData
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .VintagePresentLevelData
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .VintagePresentLevelData
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
                emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData
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
         * Obf: AEGIBHGNMDO
         * </pre>
         *
         * Protobuf type {@code VintagePresentLevelData}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:VintagePresentLevelData)
                emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .VintagePresentLevelDataOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .internal_static_VintagePresentLevelData_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .internal_static_VintagePresentLevelData_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData
                                        .class,
                                emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData.newBuilder()
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
                presentId_ = 0;

                isFinish_ = false;

                stageId_ = 0;

                isOpen_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .internal_static_VintagePresentLevelData_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData
                    build() {
                emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData
                    buildPartial() {
                emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData result =
                        new emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData(
                                this);
                result.presentId_ = presentId_;
                result.isFinish_ = isFinish_;
                result.stageId_ = stageId_;
                result.isOpen_ = isOpen_;
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
                        emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData
                            other) {
                if (other
                        == emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData
                                .getDefaultInstance()) return this;
                if (other.getPresentId() != 0) {
                    setPresentId(other.getPresentId());
                }
                if (other.getIsFinish() != false) {
                    setIsFinish(other.getIsFinish());
                }
                if (other.getStageId() != 0) {
                    setStageId(other.getStageId());
                }
                if (other.getIsOpen() != false) {
                    setIsOpen(other.getIsOpen());
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
                emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int presentId_;
            /**
             * <code>uint32 present_id = 6;</code>
             *
             * @return The presentId.
             */
            @java.lang.Override
            public int getPresentId() {
                return presentId_;
            }
            /**
             * <code>uint32 present_id = 6;</code>
             *
             * @param value The presentId to set.
             * @return This builder for chaining.
             */
            public Builder setPresentId(int value) {

                presentId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 present_id = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearPresentId() {

                presentId_ = 0;
                onChanged();
                return this;
            }

            private boolean isFinish_;
            /**
             * <code>bool is_finish = 4;</code>
             *
             * @return The isFinish.
             */
            @java.lang.Override
            public boolean getIsFinish() {
                return isFinish_;
            }
            /**
             * <code>bool is_finish = 4;</code>
             *
             * @param value The isFinish to set.
             * @return This builder for chaining.
             */
            public Builder setIsFinish(boolean value) {

                isFinish_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_finish = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsFinish() {

                isFinish_ = false;
                onChanged();
                return this;
            }

            private int stageId_;
            /**
             * <code>uint32 stage_id = 5;</code>
             *
             * @return The stageId.
             */
            @java.lang.Override
            public int getStageId() {
                return stageId_;
            }
            /**
             * <code>uint32 stage_id = 5;</code>
             *
             * @param value The stageId to set.
             * @return This builder for chaining.
             */
            public Builder setStageId(int value) {

                stageId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 stage_id = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearStageId() {

                stageId_ = 0;
                onChanged();
                return this;
            }

            private boolean isOpen_;
            /**
             * <code>bool is_open = 13;</code>
             *
             * @return The isOpen.
             */
            @java.lang.Override
            public boolean getIsOpen() {
                return isOpen_;
            }
            /**
             * <code>bool is_open = 13;</code>
             *
             * @param value The isOpen to set.
             * @return This builder for chaining.
             */
            public Builder setIsOpen(boolean value) {

                isOpen_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_open = 13;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsOpen() {

                isOpen_ = false;
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

            // @@protoc_insertion_point(builder_scope:VintagePresentLevelData)
        }

        // @@protoc_insertion_point(class_scope:VintagePresentLevelData)
        private static final emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .VintagePresentLevelData
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData();
        }

        public static emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass
                        .VintagePresentLevelData
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<VintagePresentLevelData> PARSER =
                new com.google.protobuf.AbstractParser<VintagePresentLevelData>() {
                    @java.lang.Override
                    public VintagePresentLevelData parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new VintagePresentLevelData(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<VintagePresentLevelData> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<VintagePresentLevelData> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.VintagePresentLevelDataOuterClass.VintagePresentLevelData
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_VintagePresentLevelData_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_VintagePresentLevelData_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\035VintagePresentLevelData.proto\"c\n\027Vinta"
                    + "gePresentLevelData\022\022\n\npresent_id\030\006 \001(\r\022\021"
                    + "\n\tis_finish\030\004 \001(\010\022\020\n\010stage_id\030\005 \001(\r\022\017\n\007i"
                    + "s_open\030\r \001(\010B\033\n\031emu.grasscutter.net.prot"
                    + "ob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_VintagePresentLevelData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_VintagePresentLevelData_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_VintagePresentLevelData_descriptor,
                        new java.lang.String[] {
                            "PresentId", "IsFinish", "StageId", "IsOpen",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
