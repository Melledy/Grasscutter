// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonEntryToBeExploreNotify.proto

package emu.grasscutter.net.proto;

public final class DungeonEntryToBeExploreNotifyOuterClass {
    private DungeonEntryToBeExploreNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface DungeonEntryToBeExploreNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:DungeonEntryToBeExploreNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 dungeon_entry_config_id = 13;</code>
         *
         * @return The dungeonEntryConfigId.
         */
        int getDungeonEntryConfigId();

        /**
         * <code>uint32 OEODHMHLAMF = 14;</code>
         *
         * @return The oEODHMHLAMF.
         */
        int getOEODHMHLAMF();

        /**
         * <code>uint32 scene_id = 2;</code>
         *
         * @return The sceneId.
         */
        int getSceneId();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 3398
     * Obf: GCJHDKBBIEO
     * </pre>
     *
     * Protobuf type {@code DungeonEntryToBeExploreNotify}
     */
    public static final class DungeonEntryToBeExploreNotify
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:DungeonEntryToBeExploreNotify)
            DungeonEntryToBeExploreNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use DungeonEntryToBeExploreNotify.newBuilder() to construct.
        private DungeonEntryToBeExploreNotify(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private DungeonEntryToBeExploreNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new DungeonEntryToBeExploreNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private DungeonEntryToBeExploreNotify(
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
                                sceneId_ = input.readUInt32();
                                break;
                            }
                        case 104:
                            {
                                dungeonEntryConfigId_ = input.readUInt32();
                                break;
                            }
                        case 112:
                            {
                                oEODHMHLAMF_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                    .internal_static_DungeonEntryToBeExploreNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                    .internal_static_DungeonEntryToBeExploreNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                                    .DungeonEntryToBeExploreNotify.class,
                            emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                                    .DungeonEntryToBeExploreNotify.Builder.class);
        }

        public static final int DUNGEON_ENTRY_CONFIG_ID_FIELD_NUMBER = 13;
        private int dungeonEntryConfigId_;
        /**
         * <code>uint32 dungeon_entry_config_id = 13;</code>
         *
         * @return The dungeonEntryConfigId.
         */
        @java.lang.Override
        public int getDungeonEntryConfigId() {
            return dungeonEntryConfigId_;
        }

        public static final int OEODHMHLAMF_FIELD_NUMBER = 14;
        private int oEODHMHLAMF_;
        /**
         * <code>uint32 OEODHMHLAMF = 14;</code>
         *
         * @return The oEODHMHLAMF.
         */
        @java.lang.Override
        public int getOEODHMHLAMF() {
            return oEODHMHLAMF_;
        }

        public static final int SCENE_ID_FIELD_NUMBER = 2;
        private int sceneId_;
        /**
         * <code>uint32 scene_id = 2;</code>
         *
         * @return The sceneId.
         */
        @java.lang.Override
        public int getSceneId() {
            return sceneId_;
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
            if (sceneId_ != 0) {
                output.writeUInt32(2, sceneId_);
            }
            if (dungeonEntryConfigId_ != 0) {
                output.writeUInt32(13, dungeonEntryConfigId_);
            }
            if (oEODHMHLAMF_ != 0) {
                output.writeUInt32(14, oEODHMHLAMF_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (sceneId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(2, sceneId_);
            }
            if (dungeonEntryConfigId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(13, dungeonEntryConfigId_);
            }
            if (oEODHMHLAMF_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(14, oEODHMHLAMF_);
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
                    emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                            .DungeonEntryToBeExploreNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                            .DungeonEntryToBeExploreNotify
                    other =
                            (emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                                            .DungeonEntryToBeExploreNotify)
                                    obj;

            if (getDungeonEntryConfigId() != other.getDungeonEntryConfigId()) return false;
            if (getOEODHMHLAMF() != other.getOEODHMHLAMF()) return false;
            if (getSceneId() != other.getSceneId()) return false;
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
            hash = (37 * hash) + DUNGEON_ENTRY_CONFIG_ID_FIELD_NUMBER;
            hash = (53 * hash) + getDungeonEntryConfigId();
            hash = (37 * hash) + OEODHMHLAMF_FIELD_NUMBER;
            hash = (53 * hash) + getOEODHMHLAMF();
            hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getSceneId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotify
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
                emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                                .DungeonEntryToBeExploreNotify
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
         * CmdId: 3398
         * Obf: GCJHDKBBIEO
         * </pre>
         *
         * Protobuf type {@code DungeonEntryToBeExploreNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:DungeonEntryToBeExploreNotify)
                emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .internal_static_DungeonEntryToBeExploreNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .internal_static_DungeonEntryToBeExploreNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                                        .DungeonEntryToBeExploreNotify.class,
                                emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                                        .DungeonEntryToBeExploreNotify.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass.DungeonEntryToBeExploreNotify.newBuilder()
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
                dungeonEntryConfigId_ = 0;

                oEODHMHLAMF_ = 0;

                sceneId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .internal_static_DungeonEntryToBeExploreNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                            .DungeonEntryToBeExploreNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotify.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                            .DungeonEntryToBeExploreNotify
                    build() {
                emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                                .DungeonEntryToBeExploreNotify
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                            .DungeonEntryToBeExploreNotify
                    buildPartial() {
                emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                                .DungeonEntryToBeExploreNotify
                        result =
                                new emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                                        .DungeonEntryToBeExploreNotify(this);
                result.dungeonEntryConfigId_ = dungeonEntryConfigId_;
                result.oEODHMHLAMF_ = oEODHMHLAMF_;
                result.sceneId_ = sceneId_;
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
                        emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                                .DungeonEntryToBeExploreNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                                            .DungeonEntryToBeExploreNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                                    .DungeonEntryToBeExploreNotify
                            other) {
                if (other
                        == emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                                .DungeonEntryToBeExploreNotify.getDefaultInstance()) return this;
                if (other.getDungeonEntryConfigId() != 0) {
                    setDungeonEntryConfigId(other.getDungeonEntryConfigId());
                }
                if (other.getOEODHMHLAMF() != 0) {
                    setOEODHMHLAMF(other.getOEODHMHLAMF());
                }
                if (other.getSceneId() != 0) {
                    setSceneId(other.getSceneId());
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
                emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                                .DungeonEntryToBeExploreNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                                            .DungeonEntryToBeExploreNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int dungeonEntryConfigId_;
            /**
             * <code>uint32 dungeon_entry_config_id = 13;</code>
             *
             * @return The dungeonEntryConfigId.
             */
            @java.lang.Override
            public int getDungeonEntryConfigId() {
                return dungeonEntryConfigId_;
            }
            /**
             * <code>uint32 dungeon_entry_config_id = 13;</code>
             *
             * @param value The dungeonEntryConfigId to set.
             * @return This builder for chaining.
             */
            public Builder setDungeonEntryConfigId(int value) {

                dungeonEntryConfigId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 dungeon_entry_config_id = 13;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearDungeonEntryConfigId() {

                dungeonEntryConfigId_ = 0;
                onChanged();
                return this;
            }

            private int oEODHMHLAMF_;
            /**
             * <code>uint32 OEODHMHLAMF = 14;</code>
             *
             * @return The oEODHMHLAMF.
             */
            @java.lang.Override
            public int getOEODHMHLAMF() {
                return oEODHMHLAMF_;
            }
            /**
             * <code>uint32 OEODHMHLAMF = 14;</code>
             *
             * @param value The oEODHMHLAMF to set.
             * @return This builder for chaining.
             */
            public Builder setOEODHMHLAMF(int value) {

                oEODHMHLAMF_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 OEODHMHLAMF = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearOEODHMHLAMF() {

                oEODHMHLAMF_ = 0;
                onChanged();
                return this;
            }

            private int sceneId_;
            /**
             * <code>uint32 scene_id = 2;</code>
             *
             * @return The sceneId.
             */
            @java.lang.Override
            public int getSceneId() {
                return sceneId_;
            }
            /**
             * <code>uint32 scene_id = 2;</code>
             *
             * @param value The sceneId to set.
             * @return This builder for chaining.
             */
            public Builder setSceneId(int value) {

                sceneId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 scene_id = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSceneId() {

                sceneId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:DungeonEntryToBeExploreNotify)
        }

        // @@protoc_insertion_point(class_scope:DungeonEntryToBeExploreNotify)
        private static final emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                            .DungeonEntryToBeExploreNotify();
        }

        public static emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<DungeonEntryToBeExploreNotify> PARSER =
                new com.google.protobuf.AbstractParser<DungeonEntryToBeExploreNotify>() {
                    @java.lang.Override
                    public DungeonEntryToBeExploreNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new DungeonEntryToBeExploreNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<DungeonEntryToBeExploreNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<DungeonEntryToBeExploreNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.DungeonEntryToBeExploreNotifyOuterClass
                        .DungeonEntryToBeExploreNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_DungeonEntryToBeExploreNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_DungeonEntryToBeExploreNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n#DungeonEntryToBeExploreNotify.proto\"g\n"
                    + "\035DungeonEntryToBeExploreNotify\022\037\n\027dungeo"
                    + "n_entry_config_id\030\r \001(\r\022\023\n\013OEODHMHLAMF\030\016"
                    + " \001(\r\022\020\n\010scene_id\030\002 \001(\rB\033\n\031emu.grasscutte"
                    + "r.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_DungeonEntryToBeExploreNotify_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_DungeonEntryToBeExploreNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_DungeonEntryToBeExploreNotify_descriptor,
                        new java.lang.String[] {
                            "DungeonEntryConfigId", "OEODHMHLAMF", "SceneId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
