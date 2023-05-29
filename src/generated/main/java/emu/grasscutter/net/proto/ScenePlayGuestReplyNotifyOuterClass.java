// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayGuestReplyNotify.proto

package emu.grasscutter.net.proto;

public final class ScenePlayGuestReplyNotifyOuterClass {
    private ScenePlayGuestReplyNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface ScenePlayGuestReplyNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:ScenePlayGuestReplyNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 play_id = 8;</code>
         *
         * @return The playId.
         */
        int getPlayId();

        /**
         * <code>bool is_agree = 9;</code>
         *
         * @return The isAgree.
         */
        boolean getIsAgree();

        /**
         * <code>uint32 guest_uid = 10;</code>
         *
         * @return The guestUid.
         */
        int getGuestUid();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 4437
     * Obf: GOIBIFGMAME
     * </pre>
     *
     * Protobuf type {@code ScenePlayGuestReplyNotify}
     */
    public static final class ScenePlayGuestReplyNotify extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:ScenePlayGuestReplyNotify)
            ScenePlayGuestReplyNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ScenePlayGuestReplyNotify.newBuilder() to construct.
        private ScenePlayGuestReplyNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ScenePlayGuestReplyNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new ScenePlayGuestReplyNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ScenePlayGuestReplyNotify(
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
                        case 64:
                            {
                                playId_ = input.readUInt32();
                                break;
                            }
                        case 72:
                            {
                                isAgree_ = input.readBool();
                                break;
                            }
                        case 80:
                            {
                                guestUid_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                    .internal_static_ScenePlayGuestReplyNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                    .internal_static_ScenePlayGuestReplyNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                                    .ScenePlayGuestReplyNotify.class,
                            emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                                    .ScenePlayGuestReplyNotify.Builder.class);
        }

        public static final int PLAY_ID_FIELD_NUMBER = 8;
        private int playId_;
        /**
         * <code>uint32 play_id = 8;</code>
         *
         * @return The playId.
         */
        @java.lang.Override
        public int getPlayId() {
            return playId_;
        }

        public static final int IS_AGREE_FIELD_NUMBER = 9;
        private boolean isAgree_;
        /**
         * <code>bool is_agree = 9;</code>
         *
         * @return The isAgree.
         */
        @java.lang.Override
        public boolean getIsAgree() {
            return isAgree_;
        }

        public static final int GUEST_UID_FIELD_NUMBER = 10;
        private int guestUid_;
        /**
         * <code>uint32 guest_uid = 10;</code>
         *
         * @return The guestUid.
         */
        @java.lang.Override
        public int getGuestUid() {
            return guestUid_;
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
            if (playId_ != 0) {
                output.writeUInt32(8, playId_);
            }
            if (isAgree_ != false) {
                output.writeBool(9, isAgree_);
            }
            if (guestUid_ != 0) {
                output.writeUInt32(10, guestUid_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (playId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(8, playId_);
            }
            if (isAgree_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(9, isAgree_);
            }
            if (guestUid_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(10, guestUid_);
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
                    emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                            .ScenePlayGuestReplyNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass.ScenePlayGuestReplyNotify
                    other =
                            (emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                                            .ScenePlayGuestReplyNotify)
                                    obj;

            if (getPlayId() != other.getPlayId()) return false;
            if (getIsAgree() != other.getIsAgree()) return false;
            if (getGuestUid() != other.getGuestUid()) return false;
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
            hash = (37 * hash) + PLAY_ID_FIELD_NUMBER;
            hash = (53 * hash) + getPlayId();
            hash = (37 * hash) + IS_AGREE_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsAgree());
            hash = (37 * hash) + GUEST_UID_FIELD_NUMBER;
            hash = (53 * hash) + getGuestUid();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .ScenePlayGuestReplyNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .ScenePlayGuestReplyNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .ScenePlayGuestReplyNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .ScenePlayGuestReplyNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .ScenePlayGuestReplyNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .ScenePlayGuestReplyNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .ScenePlayGuestReplyNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .ScenePlayGuestReplyNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .ScenePlayGuestReplyNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .ScenePlayGuestReplyNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .ScenePlayGuestReplyNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .ScenePlayGuestReplyNotify
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
                emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass.ScenePlayGuestReplyNotify
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
         * CmdId: 4437
         * Obf: GOIBIFGMAME
         * </pre>
         *
         * Protobuf type {@code ScenePlayGuestReplyNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:ScenePlayGuestReplyNotify)
                emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .ScenePlayGuestReplyNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .internal_static_ScenePlayGuestReplyNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .internal_static_ScenePlayGuestReplyNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                                        .ScenePlayGuestReplyNotify.class,
                                emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                                        .ScenePlayGuestReplyNotify.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass.ScenePlayGuestReplyNotify.newBuilder()
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
                playId_ = 0;

                isAgree_ = false;

                guestUid_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .internal_static_ScenePlayGuestReplyNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass.ScenePlayGuestReplyNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .ScenePlayGuestReplyNotify.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass.ScenePlayGuestReplyNotify
                    build() {
                emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass.ScenePlayGuestReplyNotify
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass.ScenePlayGuestReplyNotify
                    buildPartial() {
                emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass.ScenePlayGuestReplyNotify
                        result =
                                new emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                                        .ScenePlayGuestReplyNotify(this);
                result.playId_ = playId_;
                result.isAgree_ = isAgree_;
                result.guestUid_ = guestUid_;
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
                        emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                                .ScenePlayGuestReplyNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                                            .ScenePlayGuestReplyNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass.ScenePlayGuestReplyNotify
                            other) {
                if (other
                        == emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                                .ScenePlayGuestReplyNotify.getDefaultInstance()) return this;
                if (other.getPlayId() != 0) {
                    setPlayId(other.getPlayId());
                }
                if (other.getIsAgree() != false) {
                    setIsAgree(other.getIsAgree());
                }
                if (other.getGuestUid() != 0) {
                    setGuestUid(other.getGuestUid());
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
                emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass.ScenePlayGuestReplyNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                                            .ScenePlayGuestReplyNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int playId_;
            /**
             * <code>uint32 play_id = 8;</code>
             *
             * @return The playId.
             */
            @java.lang.Override
            public int getPlayId() {
                return playId_;
            }
            /**
             * <code>uint32 play_id = 8;</code>
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
             * <code>uint32 play_id = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearPlayId() {

                playId_ = 0;
                onChanged();
                return this;
            }

            private boolean isAgree_;
            /**
             * <code>bool is_agree = 9;</code>
             *
             * @return The isAgree.
             */
            @java.lang.Override
            public boolean getIsAgree() {
                return isAgree_;
            }
            /**
             * <code>bool is_agree = 9;</code>
             *
             * @param value The isAgree to set.
             * @return This builder for chaining.
             */
            public Builder setIsAgree(boolean value) {

                isAgree_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_agree = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsAgree() {

                isAgree_ = false;
                onChanged();
                return this;
            }

            private int guestUid_;
            /**
             * <code>uint32 guest_uid = 10;</code>
             *
             * @return The guestUid.
             */
            @java.lang.Override
            public int getGuestUid() {
                return guestUid_;
            }
            /**
             * <code>uint32 guest_uid = 10;</code>
             *
             * @param value The guestUid to set.
             * @return This builder for chaining.
             */
            public Builder setGuestUid(int value) {

                guestUid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 guest_uid = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGuestUid() {

                guestUid_ = 0;
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

            // @@protoc_insertion_point(builder_scope:ScenePlayGuestReplyNotify)
        }

        // @@protoc_insertion_point(class_scope:ScenePlayGuestReplyNotify)
        private static final emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .ScenePlayGuestReplyNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                            .ScenePlayGuestReplyNotify();
        }

        public static emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass
                        .ScenePlayGuestReplyNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ScenePlayGuestReplyNotify> PARSER =
                new com.google.protobuf.AbstractParser<ScenePlayGuestReplyNotify>() {
                    @java.lang.Override
                    public ScenePlayGuestReplyNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new ScenePlayGuestReplyNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<ScenePlayGuestReplyNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ScenePlayGuestReplyNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.ScenePlayGuestReplyNotifyOuterClass.ScenePlayGuestReplyNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ScenePlayGuestReplyNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ScenePlayGuestReplyNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\037ScenePlayGuestReplyNotify.proto\"Q\n\031Sce"
                    + "nePlayGuestReplyNotify\022\017\n\007play_id\030\010 \001(\r\022"
                    + "\020\n\010is_agree\030\t \001(\010\022\021\n\tguest_uid\030\n \001(\rB\033\n\031"
                    + "emu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_ScenePlayGuestReplyNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ScenePlayGuestReplyNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ScenePlayGuestReplyNotify_descriptor,
                        new java.lang.String[] {
                            "PlayId", "IsAgree", "GuestUid",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
