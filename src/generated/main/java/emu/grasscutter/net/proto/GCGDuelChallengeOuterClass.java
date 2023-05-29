// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDuelChallenge.proto

package emu.grasscutter.net.proto;

public final class GCGDuelChallengeOuterClass {
    private GCGDuelChallengeOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface GCGDuelChallengeOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:GCGDuelChallenge)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 challenge_id = 11;</code>
         *
         * @return The challengeId.
         */
        int getChallengeId();

        /**
         * <code>uint32 cur_progress = 3;</code>
         *
         * @return The curProgress.
         */
        int getCurProgress();

        /**
         * <code>uint32 total_progress = 5;</code>
         *
         * @return The totalProgress.
         */
        int getTotalProgress();
    }
    /**
     *
     *
     * <pre>
     * Obf: MCEHDANFECI
     * </pre>
     *
     * Protobuf type {@code GCGDuelChallenge}
     */
    public static final class GCGDuelChallenge extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:GCGDuelChallenge)
            GCGDuelChallengeOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use GCGDuelChallenge.newBuilder() to construct.
        private GCGDuelChallenge(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GCGDuelChallenge() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new GCGDuelChallenge();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GCGDuelChallenge(
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
                                curProgress_ = input.readUInt32();
                                break;
                            }
                        case 40:
                            {
                                totalProgress_ = input.readUInt32();
                                break;
                            }
                        case 88:
                            {
                                challengeId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.GCGDuelChallengeOuterClass
                    .internal_static_GCGDuelChallenge_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.GCGDuelChallengeOuterClass
                    .internal_static_GCGDuelChallenge_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge.class,
                            emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge.Builder.class);
        }

        public static final int CHALLENGE_ID_FIELD_NUMBER = 11;
        private int challengeId_;
        /**
         * <code>uint32 challenge_id = 11;</code>
         *
         * @return The challengeId.
         */
        @java.lang.Override
        public int getChallengeId() {
            return challengeId_;
        }

        public static final int CUR_PROGRESS_FIELD_NUMBER = 3;
        private int curProgress_;
        /**
         * <code>uint32 cur_progress = 3;</code>
         *
         * @return The curProgress.
         */
        @java.lang.Override
        public int getCurProgress() {
            return curProgress_;
        }

        public static final int TOTAL_PROGRESS_FIELD_NUMBER = 5;
        private int totalProgress_;
        /**
         * <code>uint32 total_progress = 5;</code>
         *
         * @return The totalProgress.
         */
        @java.lang.Override
        public int getTotalProgress() {
            return totalProgress_;
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
            if (curProgress_ != 0) {
                output.writeUInt32(3, curProgress_);
            }
            if (totalProgress_ != 0) {
                output.writeUInt32(5, totalProgress_);
            }
            if (challengeId_ != 0) {
                output.writeUInt32(11, challengeId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (curProgress_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, curProgress_);
            }
            if (totalProgress_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(5, totalProgress_);
            }
            if (challengeId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, challengeId_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge other =
                    (emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge) obj;

            if (getChallengeId() != other.getChallengeId()) return false;
            if (getCurProgress() != other.getCurProgress()) return false;
            if (getTotalProgress() != other.getTotalProgress()) return false;
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
            hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getChallengeId();
            hash = (37 * hash) + CUR_PROGRESS_FIELD_NUMBER;
            hash = (53 * hash) + getCurProgress();
            hash = (37 * hash) + TOTAL_PROGRESS_FIELD_NUMBER;
            hash = (53 * hash) + getTotalProgress();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge parseFrom(
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
                emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge prototype) {
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
         * Obf: MCEHDANFECI
         * </pre>
         *
         * Protobuf type {@code GCGDuelChallenge}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:GCGDuelChallenge)
                emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallengeOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.GCGDuelChallengeOuterClass
                        .internal_static_GCGDuelChallenge_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.GCGDuelChallengeOuterClass
                        .internal_static_GCGDuelChallenge_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge.class,
                                emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge.newBuilder()
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
                challengeId_ = 0;

                curProgress_ = 0;

                totalProgress_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.GCGDuelChallengeOuterClass
                        .internal_static_GCGDuelChallenge_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge build() {
                emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge buildPartial() {
                emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge result =
                        new emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge(this);
                result.challengeId_ = challengeId_;
                result.curProgress_ = curProgress_;
                result.totalProgress_ = totalProgress_;
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
                        instanceof emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge other) {
                if (other
                        == emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge
                                .getDefaultInstance()) return this;
                if (other.getChallengeId() != 0) {
                    setChallengeId(other.getChallengeId());
                }
                if (other.getCurProgress() != 0) {
                    setCurProgress(other.getCurProgress());
                }
                if (other.getTotalProgress() != 0) {
                    setTotalProgress(other.getTotalProgress());
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
                emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int challengeId_;
            /**
             * <code>uint32 challenge_id = 11;</code>
             *
             * @return The challengeId.
             */
            @java.lang.Override
            public int getChallengeId() {
                return challengeId_;
            }
            /**
             * <code>uint32 challenge_id = 11;</code>
             *
             * @param value The challengeId to set.
             * @return This builder for chaining.
             */
            public Builder setChallengeId(int value) {

                challengeId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 challenge_id = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearChallengeId() {

                challengeId_ = 0;
                onChanged();
                return this;
            }

            private int curProgress_;
            /**
             * <code>uint32 cur_progress = 3;</code>
             *
             * @return The curProgress.
             */
            @java.lang.Override
            public int getCurProgress() {
                return curProgress_;
            }
            /**
             * <code>uint32 cur_progress = 3;</code>
             *
             * @param value The curProgress to set.
             * @return This builder for chaining.
             */
            public Builder setCurProgress(int value) {

                curProgress_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 cur_progress = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCurProgress() {

                curProgress_ = 0;
                onChanged();
                return this;
            }

            private int totalProgress_;
            /**
             * <code>uint32 total_progress = 5;</code>
             *
             * @return The totalProgress.
             */
            @java.lang.Override
            public int getTotalProgress() {
                return totalProgress_;
            }
            /**
             * <code>uint32 total_progress = 5;</code>
             *
             * @param value The totalProgress to set.
             * @return This builder for chaining.
             */
            public Builder setTotalProgress(int value) {

                totalProgress_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 total_progress = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearTotalProgress() {

                totalProgress_ = 0;
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

            // @@protoc_insertion_point(builder_scope:GCGDuelChallenge)
        }

        // @@protoc_insertion_point(class_scope:GCGDuelChallenge)
        private static final emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge();
        }

        public static emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<GCGDuelChallenge> PARSER =
                new com.google.protobuf.AbstractParser<GCGDuelChallenge>() {
                    @java.lang.Override
                    public GCGDuelChallenge parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GCGDuelChallenge(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<GCGDuelChallenge> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GCGDuelChallenge> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GCGDuelChallenge_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GCGDuelChallenge_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\026GCGDuelChallenge.proto\"V\n\020GCGDuelChall"
                    + "enge\022\024\n\014challenge_id\030\013 \001(\r\022\024\n\014cur_progre"
                    + "ss\030\003 \001(\r\022\026\n\016total_progress\030\005 \001(\rB\033\n\031emu."
                    + "grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_GCGDuelChallenge_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GCGDuelChallenge_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_GCGDuelChallenge_descriptor,
                        new java.lang.String[] {
                            "ChallengeId", "CurProgress", "TotalProgress",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
