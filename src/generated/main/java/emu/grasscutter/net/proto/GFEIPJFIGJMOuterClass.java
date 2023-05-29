// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GFEIPJFIGJM.proto

package emu.grasscutter.net.proto;

public final class GFEIPJFIGJMOuterClass {
    private GFEIPJFIGJMOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface GFEIPJFIGJMOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:GFEIPJFIGJM)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 music_basic_id = 4;</code>
         *
         * @return The musicBasicId.
         */
        int getMusicBasicId();

        /**
         * <code>uint64 ugc_guid = 8;</code>
         *
         * @return The ugcGuid.
         */
        long getUgcGuid();

        /**
         * <code>bool is_save_score = 12;</code>
         *
         * @return The isSaveScore.
         */
        boolean getIsSaveScore();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 21199
     * </pre>
     *
     * Protobuf type {@code GFEIPJFIGJM}
     */
    public static final class GFEIPJFIGJM extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:GFEIPJFIGJM)
            GFEIPJFIGJMOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use GFEIPJFIGJM.newBuilder() to construct.
        private GFEIPJFIGJM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GFEIPJFIGJM() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new GFEIPJFIGJM();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GFEIPJFIGJM(
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
                                musicBasicId_ = input.readUInt32();
                                break;
                            }
                        case 64:
                            {
                                ugcGuid_ = input.readUInt64();
                                break;
                            }
                        case 96:
                            {
                                isSaveScore_ = input.readBool();
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
            return emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.internal_static_GFEIPJFIGJM_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass
                    .internal_static_GFEIPJFIGJM_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM.class,
                            emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM.Builder.class);
        }

        public static final int MUSIC_BASIC_ID_FIELD_NUMBER = 4;
        private int musicBasicId_;
        /**
         * <code>uint32 music_basic_id = 4;</code>
         *
         * @return The musicBasicId.
         */
        @java.lang.Override
        public int getMusicBasicId() {
            return musicBasicId_;
        }

        public static final int UGC_GUID_FIELD_NUMBER = 8;
        private long ugcGuid_;
        /**
         * <code>uint64 ugc_guid = 8;</code>
         *
         * @return The ugcGuid.
         */
        @java.lang.Override
        public long getUgcGuid() {
            return ugcGuid_;
        }

        public static final int IS_SAVE_SCORE_FIELD_NUMBER = 12;
        private boolean isSaveScore_;
        /**
         * <code>bool is_save_score = 12;</code>
         *
         * @return The isSaveScore.
         */
        @java.lang.Override
        public boolean getIsSaveScore() {
            return isSaveScore_;
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
            if (musicBasicId_ != 0) {
                output.writeUInt32(4, musicBasicId_);
            }
            if (ugcGuid_ != 0L) {
                output.writeUInt64(8, ugcGuid_);
            }
            if (isSaveScore_ != false) {
                output.writeBool(12, isSaveScore_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (musicBasicId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(4, musicBasicId_);
            }
            if (ugcGuid_ != 0L) {
                size += com.google.protobuf.CodedOutputStream.computeUInt64Size(8, ugcGuid_);
            }
            if (isSaveScore_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(12, isSaveScore_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM other =
                    (emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM) obj;

            if (getMusicBasicId() != other.getMusicBasicId()) return false;
            if (getUgcGuid() != other.getUgcGuid()) return false;
            if (getIsSaveScore() != other.getIsSaveScore()) return false;
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
            hash = (37 * hash) + MUSIC_BASIC_ID_FIELD_NUMBER;
            hash = (53 * hash) + getMusicBasicId();
            hash = (37 * hash) + UGC_GUID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getUgcGuid());
            hash = (37 * hash) + IS_SAVE_SCORE_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsSaveScore());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM parseFrom(
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
                emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM prototype) {
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
         * CmdId: 21199
         * </pre>
         *
         * Protobuf type {@code GFEIPJFIGJM}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:GFEIPJFIGJM)
                emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJMOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass
                        .internal_static_GFEIPJFIGJM_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass
                        .internal_static_GFEIPJFIGJM_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM.class,
                                emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM.newBuilder()
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
                musicBasicId_ = 0;

                ugcGuid_ = 0L;

                isSaveScore_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass
                        .internal_static_GFEIPJFIGJM_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM build() {
                emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM buildPartial() {
                emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM result =
                        new emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM(this);
                result.musicBasicId_ = musicBasicId_;
                result.ugcGuid_ = ugcGuid_;
                result.isSaveScore_ = isSaveScore_;
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
                if (other instanceof emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM) {
                    return mergeFrom((emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM other) {
                if (other
                        == emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM.getDefaultInstance())
                    return this;
                if (other.getMusicBasicId() != 0) {
                    setMusicBasicId(other.getMusicBasicId());
                }
                if (other.getUgcGuid() != 0L) {
                    setUgcGuid(other.getUgcGuid());
                }
                if (other.getIsSaveScore() != false) {
                    setIsSaveScore(other.getIsSaveScore());
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
                emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int musicBasicId_;
            /**
             * <code>uint32 music_basic_id = 4;</code>
             *
             * @return The musicBasicId.
             */
            @java.lang.Override
            public int getMusicBasicId() {
                return musicBasicId_;
            }
            /**
             * <code>uint32 music_basic_id = 4;</code>
             *
             * @param value The musicBasicId to set.
             * @return This builder for chaining.
             */
            public Builder setMusicBasicId(int value) {

                musicBasicId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 music_basic_id = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMusicBasicId() {

                musicBasicId_ = 0;
                onChanged();
                return this;
            }

            private long ugcGuid_;
            /**
             * <code>uint64 ugc_guid = 8;</code>
             *
             * @return The ugcGuid.
             */
            @java.lang.Override
            public long getUgcGuid() {
                return ugcGuid_;
            }
            /**
             * <code>uint64 ugc_guid = 8;</code>
             *
             * @param value The ugcGuid to set.
             * @return This builder for chaining.
             */
            public Builder setUgcGuid(long value) {

                ugcGuid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint64 ugc_guid = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearUgcGuid() {

                ugcGuid_ = 0L;
                onChanged();
                return this;
            }

            private boolean isSaveScore_;
            /**
             * <code>bool is_save_score = 12;</code>
             *
             * @return The isSaveScore.
             */
            @java.lang.Override
            public boolean getIsSaveScore() {
                return isSaveScore_;
            }
            /**
             * <code>bool is_save_score = 12;</code>
             *
             * @param value The isSaveScore to set.
             * @return This builder for chaining.
             */
            public Builder setIsSaveScore(boolean value) {

                isSaveScore_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_save_score = 12;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsSaveScore() {

                isSaveScore_ = false;
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

            // @@protoc_insertion_point(builder_scope:GFEIPJFIGJM)
        }

        // @@protoc_insertion_point(class_scope:GFEIPJFIGJM)
        private static final emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM();
        }

        public static emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<GFEIPJFIGJM> PARSER =
                new com.google.protobuf.AbstractParser<GFEIPJFIGJM>() {
                    @java.lang.Override
                    public GFEIPJFIGJM parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GFEIPJFIGJM(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<GFEIPJFIGJM> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GFEIPJFIGJM> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.GFEIPJFIGJMOuterClass.GFEIPJFIGJM getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GFEIPJFIGJM_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GFEIPJFIGJM_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021GFEIPJFIGJM.proto\"N\n\013GFEIPJFIGJM\022\026\n\016mu"
                    + "sic_basic_id\030\004 \001(\r\022\020\n\010ugc_guid\030\010 \001(\004\022\025\n\r"
                    + "is_save_score\030\014 \001(\010B\033\n\031emu.grasscutter.n"
                    + "et.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_GFEIPJFIGJM_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GFEIPJFIGJM_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_GFEIPJFIGJM_descriptor,
                        new java.lang.String[] {
                            "MusicBasicId", "UgcGuid", "IsSaveScore",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
