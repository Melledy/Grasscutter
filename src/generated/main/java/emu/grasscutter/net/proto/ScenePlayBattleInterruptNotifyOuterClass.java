// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayBattleInterruptNotify.proto

package emu.grasscutter.net.proto;

public final class ScenePlayBattleInterruptNotifyOuterClass {
    private ScenePlayBattleInterruptNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface ScenePlayBattleInterruptNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:ScenePlayBattleInterruptNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 interrupt_state = 3;</code>
         *
         * @return The interruptState.
         */
        int getInterruptState();

        /**
         * <code>uint32 play_type = 10;</code>
         *
         * @return The playType.
         */
        int getPlayType();

        /**
         * <code>uint32 play_id = 11;</code>
         *
         * @return The playId.
         */
        int getPlayId();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 4414
     * Obf: DMLMFFCPOKO
     * </pre>
     *
     * Protobuf type {@code ScenePlayBattleInterruptNotify}
     */
    public static final class ScenePlayBattleInterruptNotify
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:ScenePlayBattleInterruptNotify)
            ScenePlayBattleInterruptNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ScenePlayBattleInterruptNotify.newBuilder() to construct.
        private ScenePlayBattleInterruptNotify(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ScenePlayBattleInterruptNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new ScenePlayBattleInterruptNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ScenePlayBattleInterruptNotify(
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
                        case 24:
                            {
                                interruptState_ = input.readUInt32();
                                break;
                            }
                        case 80:
                            {
                                playType_ = input.readUInt32();
                                break;
                            }
                        case 88:
                            {
                                playId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                    .internal_static_ScenePlayBattleInterruptNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                    .internal_static_ScenePlayBattleInterruptNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                                    .ScenePlayBattleInterruptNotify.class,
                            emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                                    .ScenePlayBattleInterruptNotify.Builder.class);
        }

        public static final int INTERRUPT_STATE_FIELD_NUMBER = 3;
        private int interruptState_;
        /**
         * <code>uint32 interrupt_state = 3;</code>
         *
         * @return The interruptState.
         */
        @java.lang.Override
        public int getInterruptState() {
            return interruptState_;
        }

        public static final int PLAY_TYPE_FIELD_NUMBER = 10;
        private int playType_;
        /**
         * <code>uint32 play_type = 10;</code>
         *
         * @return The playType.
         */
        @java.lang.Override
        public int getPlayType() {
            return playType_;
        }

        public static final int PLAY_ID_FIELD_NUMBER = 11;
        private int playId_;
        /**
         * <code>uint32 play_id = 11;</code>
         *
         * @return The playId.
         */
        @java.lang.Override
        public int getPlayId() {
            return playId_;
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
            if (interruptState_ != 0) {
                output.writeUInt32(3, interruptState_);
            }
            if (playType_ != 0) {
                output.writeUInt32(10, playType_);
            }
            if (playId_ != 0) {
                output.writeUInt32(11, playId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (interruptState_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, interruptState_);
            }
            if (playType_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(10, playType_);
            }
            if (playId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, playId_);
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
                    emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                            .ScenePlayBattleInterruptNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                            .ScenePlayBattleInterruptNotify
                    other =
                            (emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                                            .ScenePlayBattleInterruptNotify)
                                    obj;

            if (getInterruptState() != other.getInterruptState()) return false;
            if (getPlayType() != other.getPlayType()) return false;
            if (getPlayId() != other.getPlayId()) return false;
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
            hash = (37 * hash) + INTERRUPT_STATE_FIELD_NUMBER;
            hash = (53 * hash) + getInterruptState();
            hash = (37 * hash) + PLAY_TYPE_FIELD_NUMBER;
            hash = (53 * hash) + getPlayType();
            hash = (37 * hash) + PLAY_ID_FIELD_NUMBER;
            hash = (53 * hash) + getPlayId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotify
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
                emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                                .ScenePlayBattleInterruptNotify
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
         * CmdId: 4414
         * Obf: DMLMFFCPOKO
         * </pre>
         *
         * Protobuf type {@code ScenePlayBattleInterruptNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:ScenePlayBattleInterruptNotify)
                emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .internal_static_ScenePlayBattleInterruptNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .internal_static_ScenePlayBattleInterruptNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                                        .ScenePlayBattleInterruptNotify.class,
                                emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                                        .ScenePlayBattleInterruptNotify.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify.newBuilder()
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
                interruptState_ = 0;

                playType_ = 0;

                playId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .internal_static_ScenePlayBattleInterruptNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                            .ScenePlayBattleInterruptNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotify.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                            .ScenePlayBattleInterruptNotify
                    build() {
                emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                                .ScenePlayBattleInterruptNotify
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                            .ScenePlayBattleInterruptNotify
                    buildPartial() {
                emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                                .ScenePlayBattleInterruptNotify
                        result =
                                new emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                                        .ScenePlayBattleInterruptNotify(this);
                result.interruptState_ = interruptState_;
                result.playType_ = playType_;
                result.playId_ = playId_;
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
                        emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                                .ScenePlayBattleInterruptNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                                            .ScenePlayBattleInterruptNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                                    .ScenePlayBattleInterruptNotify
                            other) {
                if (other
                        == emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                                .ScenePlayBattleInterruptNotify.getDefaultInstance()) return this;
                if (other.getInterruptState() != 0) {
                    setInterruptState(other.getInterruptState());
                }
                if (other.getPlayType() != 0) {
                    setPlayType(other.getPlayType());
                }
                if (other.getPlayId() != 0) {
                    setPlayId(other.getPlayId());
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
                emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                                .ScenePlayBattleInterruptNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                                            .ScenePlayBattleInterruptNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int interruptState_;
            /**
             * <code>uint32 interrupt_state = 3;</code>
             *
             * @return The interruptState.
             */
            @java.lang.Override
            public int getInterruptState() {
                return interruptState_;
            }
            /**
             * <code>uint32 interrupt_state = 3;</code>
             *
             * @param value The interruptState to set.
             * @return This builder for chaining.
             */
            public Builder setInterruptState(int value) {

                interruptState_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 interrupt_state = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearInterruptState() {

                interruptState_ = 0;
                onChanged();
                return this;
            }

            private int playType_;
            /**
             * <code>uint32 play_type = 10;</code>
             *
             * @return The playType.
             */
            @java.lang.Override
            public int getPlayType() {
                return playType_;
            }
            /**
             * <code>uint32 play_type = 10;</code>
             *
             * @param value The playType to set.
             * @return This builder for chaining.
             */
            public Builder setPlayType(int value) {

                playType_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 play_type = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearPlayType() {

                playType_ = 0;
                onChanged();
                return this;
            }

            private int playId_;
            /**
             * <code>uint32 play_id = 11;</code>
             *
             * @return The playId.
             */
            @java.lang.Override
            public int getPlayId() {
                return playId_;
            }
            /**
             * <code>uint32 play_id = 11;</code>
             *
             * @param value The playId to set.
             * @return This builder for chaining.
             */
            public Builder setPlayId(int value) {

                playId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 play_id = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearPlayId() {

                playId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:ScenePlayBattleInterruptNotify)
        }

        // @@protoc_insertion_point(class_scope:ScenePlayBattleInterruptNotify)
        private static final emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                            .ScenePlayBattleInterruptNotify();
        }

        public static emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ScenePlayBattleInterruptNotify> PARSER =
                new com.google.protobuf.AbstractParser<ScenePlayBattleInterruptNotify>() {
                    @java.lang.Override
                    public ScenePlayBattleInterruptNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new ScenePlayBattleInterruptNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<ScenePlayBattleInterruptNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ScenePlayBattleInterruptNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.ScenePlayBattleInterruptNotifyOuterClass
                        .ScenePlayBattleInterruptNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ScenePlayBattleInterruptNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ScenePlayBattleInterruptNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n$ScenePlayBattleInterruptNotify.proto\"]"
                    + "\n\036ScenePlayBattleInterruptNotify\022\027\n\017inte"
                    + "rrupt_state\030\003 \001(\r\022\021\n\tplay_type\030\n \001(\r\022\017\n\007"
                    + "play_id\030\013 \001(\rB\033\n\031emu.grasscutter.net.pro"
                    + "tob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_ScenePlayBattleInterruptNotify_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_ScenePlayBattleInterruptNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ScenePlayBattleInterruptNotify_descriptor,
                        new java.lang.String[] {
                            "InterruptState", "PlayType", "PlayId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
