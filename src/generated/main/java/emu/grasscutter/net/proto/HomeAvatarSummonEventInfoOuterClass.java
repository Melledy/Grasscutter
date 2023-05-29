// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeAvatarSummonEventInfo.proto

package emu.grasscutter.net.proto;

public final class HomeAvatarSummonEventInfoOuterClass {
    private HomeAvatarSummonEventInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface HomeAvatarSummonEventInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:HomeAvatarSummonEventInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 event_id = 10;</code>
         *
         * @return The eventId.
         */
        int getEventId();

        /**
         * <code>uint32 LHAPBMODLNM = 15;</code>
         *
         * @return The lHAPBMODLNM.
         */
        int getLHAPBMODLNM();

        /**
         * <code>uint32 suit_id = 2;</code>
         *
         * @return The suitId.
         */
        int getSuitId();

        /**
         * <code>uint32 avatar_id = 7;</code>
         *
         * @return The avatarId.
         */
        int getAvatarId();

        /**
         * <code>uint32 guid = 5;</code>
         *
         * @return The guid.
         */
        int getGuid();

        /**
         * <code>uint32 DGEELJHENOD = 9;</code>
         *
         * @return The dGEELJHENOD.
         */
        int getDGEELJHENOD();
    }
    /**
     *
     *
     * <pre>
     * Obf: PCJALOMGBGH
     * </pre>
     *
     * Protobuf type {@code HomeAvatarSummonEventInfo}
     */
    public static final class HomeAvatarSummonEventInfo extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:HomeAvatarSummonEventInfo)
            HomeAvatarSummonEventInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use HomeAvatarSummonEventInfo.newBuilder() to construct.
        private HomeAvatarSummonEventInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private HomeAvatarSummonEventInfo() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new HomeAvatarSummonEventInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private HomeAvatarSummonEventInfo(
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
                                suitId_ = input.readUInt32();
                                break;
                            }
                        case 40:
                            {
                                guid_ = input.readUInt32();
                                break;
                            }
                        case 56:
                            {
                                avatarId_ = input.readUInt32();
                                break;
                            }
                        case 72:
                            {
                                dGEELJHENOD_ = input.readUInt32();
                                break;
                            }
                        case 80:
                            {
                                eventId_ = input.readUInt32();
                                break;
                            }
                        case 120:
                            {
                                lHAPBMODLNM_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                    .internal_static_HomeAvatarSummonEventInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                    .internal_static_HomeAvatarSummonEventInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                                    .HomeAvatarSummonEventInfo.class,
                            emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                                    .HomeAvatarSummonEventInfo.Builder.class);
        }

        public static final int EVENT_ID_FIELD_NUMBER = 10;
        private int eventId_;
        /**
         * <code>uint32 event_id = 10;</code>
         *
         * @return The eventId.
         */
        @java.lang.Override
        public int getEventId() {
            return eventId_;
        }

        public static final int LHAPBMODLNM_FIELD_NUMBER = 15;
        private int lHAPBMODLNM_;
        /**
         * <code>uint32 LHAPBMODLNM = 15;</code>
         *
         * @return The lHAPBMODLNM.
         */
        @java.lang.Override
        public int getLHAPBMODLNM() {
            return lHAPBMODLNM_;
        }

        public static final int SUIT_ID_FIELD_NUMBER = 2;
        private int suitId_;
        /**
         * <code>uint32 suit_id = 2;</code>
         *
         * @return The suitId.
         */
        @java.lang.Override
        public int getSuitId() {
            return suitId_;
        }

        public static final int AVATAR_ID_FIELD_NUMBER = 7;
        private int avatarId_;
        /**
         * <code>uint32 avatar_id = 7;</code>
         *
         * @return The avatarId.
         */
        @java.lang.Override
        public int getAvatarId() {
            return avatarId_;
        }

        public static final int GUID_FIELD_NUMBER = 5;
        private int guid_;
        /**
         * <code>uint32 guid = 5;</code>
         *
         * @return The guid.
         */
        @java.lang.Override
        public int getGuid() {
            return guid_;
        }

        public static final int DGEELJHENOD_FIELD_NUMBER = 9;
        private int dGEELJHENOD_;
        /**
         * <code>uint32 DGEELJHENOD = 9;</code>
         *
         * @return The dGEELJHENOD.
         */
        @java.lang.Override
        public int getDGEELJHENOD() {
            return dGEELJHENOD_;
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
            if (suitId_ != 0) {
                output.writeUInt32(2, suitId_);
            }
            if (guid_ != 0) {
                output.writeUInt32(5, guid_);
            }
            if (avatarId_ != 0) {
                output.writeUInt32(7, avatarId_);
            }
            if (dGEELJHENOD_ != 0) {
                output.writeUInt32(9, dGEELJHENOD_);
            }
            if (eventId_ != 0) {
                output.writeUInt32(10, eventId_);
            }
            if (lHAPBMODLNM_ != 0) {
                output.writeUInt32(15, lHAPBMODLNM_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (suitId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(2, suitId_);
            }
            if (guid_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(5, guid_);
            }
            if (avatarId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(7, avatarId_);
            }
            if (dGEELJHENOD_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(9, dGEELJHENOD_);
            }
            if (eventId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(10, eventId_);
            }
            if (lHAPBMODLNM_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(15, lHAPBMODLNM_);
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
                    emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                            .HomeAvatarSummonEventInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo
                    other =
                            (emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                                            .HomeAvatarSummonEventInfo)
                                    obj;

            if (getEventId() != other.getEventId()) return false;
            if (getLHAPBMODLNM() != other.getLHAPBMODLNM()) return false;
            if (getSuitId() != other.getSuitId()) return false;
            if (getAvatarId() != other.getAvatarId()) return false;
            if (getGuid() != other.getGuid()) return false;
            if (getDGEELJHENOD() != other.getDGEELJHENOD()) return false;
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
            hash = (37 * hash) + EVENT_ID_FIELD_NUMBER;
            hash = (53 * hash) + getEventId();
            hash = (37 * hash) + LHAPBMODLNM_FIELD_NUMBER;
            hash = (53 * hash) + getLHAPBMODLNM();
            hash = (37 * hash) + SUIT_ID_FIELD_NUMBER;
            hash = (53 * hash) + getSuitId();
            hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
            hash = (53 * hash) + getAvatarId();
            hash = (37 * hash) + GUID_FIELD_NUMBER;
            hash = (53 * hash) + getGuid();
            hash = (37 * hash) + DGEELJHENOD_FIELD_NUMBER;
            hash = (53 * hash) + getDGEELJHENOD();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .HomeAvatarSummonEventInfo
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .HomeAvatarSummonEventInfo
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .HomeAvatarSummonEventInfo
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .HomeAvatarSummonEventInfo
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .HomeAvatarSummonEventInfo
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .HomeAvatarSummonEventInfo
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .HomeAvatarSummonEventInfo
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .HomeAvatarSummonEventInfo
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .HomeAvatarSummonEventInfo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .HomeAvatarSummonEventInfo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .HomeAvatarSummonEventInfo
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .HomeAvatarSummonEventInfo
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
                emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo
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
         * Obf: PCJALOMGBGH
         * </pre>
         *
         * Protobuf type {@code HomeAvatarSummonEventInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:HomeAvatarSummonEventInfo)
                emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .HomeAvatarSummonEventInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .internal_static_HomeAvatarSummonEventInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .internal_static_HomeAvatarSummonEventInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                                        .HomeAvatarSummonEventInfo.class,
                                emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                                        .HomeAvatarSummonEventInfo.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo.newBuilder()
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
                eventId_ = 0;

                lHAPBMODLNM_ = 0;

                suitId_ = 0;

                avatarId_ = 0;

                guid_ = 0;

                dGEELJHENOD_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .internal_static_HomeAvatarSummonEventInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .HomeAvatarSummonEventInfo.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo
                    build() {
                emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo
                    buildPartial() {
                emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo
                        result =
                                new emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                                        .HomeAvatarSummonEventInfo(this);
                result.eventId_ = eventId_;
                result.lHAPBMODLNM_ = lHAPBMODLNM_;
                result.suitId_ = suitId_;
                result.avatarId_ = avatarId_;
                result.guid_ = guid_;
                result.dGEELJHENOD_ = dGEELJHENOD_;
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
                        emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                                .HomeAvatarSummonEventInfo) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                                            .HomeAvatarSummonEventInfo)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo
                            other) {
                if (other
                        == emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                                .HomeAvatarSummonEventInfo.getDefaultInstance()) return this;
                if (other.getEventId() != 0) {
                    setEventId(other.getEventId());
                }
                if (other.getLHAPBMODLNM() != 0) {
                    setLHAPBMODLNM(other.getLHAPBMODLNM());
                }
                if (other.getSuitId() != 0) {
                    setSuitId(other.getSuitId());
                }
                if (other.getAvatarId() != 0) {
                    setAvatarId(other.getAvatarId());
                }
                if (other.getGuid() != 0) {
                    setGuid(other.getGuid());
                }
                if (other.getDGEELJHENOD() != 0) {
                    setDGEELJHENOD(other.getDGEELJHENOD());
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
                emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                                            .HomeAvatarSummonEventInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int eventId_;
            /**
             * <code>uint32 event_id = 10;</code>
             *
             * @return The eventId.
             */
            @java.lang.Override
            public int getEventId() {
                return eventId_;
            }
            /**
             * <code>uint32 event_id = 10;</code>
             *
             * @param value The eventId to set.
             * @return This builder for chaining.
             */
            public Builder setEventId(int value) {

                eventId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 event_id = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEventId() {

                eventId_ = 0;
                onChanged();
                return this;
            }

            private int lHAPBMODLNM_;
            /**
             * <code>uint32 LHAPBMODLNM = 15;</code>
             *
             * @return The lHAPBMODLNM.
             */
            @java.lang.Override
            public int getLHAPBMODLNM() {
                return lHAPBMODLNM_;
            }
            /**
             * <code>uint32 LHAPBMODLNM = 15;</code>
             *
             * @param value The lHAPBMODLNM to set.
             * @return This builder for chaining.
             */
            public Builder setLHAPBMODLNM(int value) {

                lHAPBMODLNM_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 LHAPBMODLNM = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLHAPBMODLNM() {

                lHAPBMODLNM_ = 0;
                onChanged();
                return this;
            }

            private int suitId_;
            /**
             * <code>uint32 suit_id = 2;</code>
             *
             * @return The suitId.
             */
            @java.lang.Override
            public int getSuitId() {
                return suitId_;
            }
            /**
             * <code>uint32 suit_id = 2;</code>
             *
             * @param value The suitId to set.
             * @return This builder for chaining.
             */
            public Builder setSuitId(int value) {

                suitId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 suit_id = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSuitId() {

                suitId_ = 0;
                onChanged();
                return this;
            }

            private int avatarId_;
            /**
             * <code>uint32 avatar_id = 7;</code>
             *
             * @return The avatarId.
             */
            @java.lang.Override
            public int getAvatarId() {
                return avatarId_;
            }
            /**
             * <code>uint32 avatar_id = 7;</code>
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
             * <code>uint32 avatar_id = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAvatarId() {

                avatarId_ = 0;
                onChanged();
                return this;
            }

            private int guid_;
            /**
             * <code>uint32 guid = 5;</code>
             *
             * @return The guid.
             */
            @java.lang.Override
            public int getGuid() {
                return guid_;
            }
            /**
             * <code>uint32 guid = 5;</code>
             *
             * @param value The guid to set.
             * @return This builder for chaining.
             */
            public Builder setGuid(int value) {

                guid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 guid = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGuid() {

                guid_ = 0;
                onChanged();
                return this;
            }

            private int dGEELJHENOD_;
            /**
             * <code>uint32 DGEELJHENOD = 9;</code>
             *
             * @return The dGEELJHENOD.
             */
            @java.lang.Override
            public int getDGEELJHENOD() {
                return dGEELJHENOD_;
            }
            /**
             * <code>uint32 DGEELJHENOD = 9;</code>
             *
             * @param value The dGEELJHENOD to set.
             * @return This builder for chaining.
             */
            public Builder setDGEELJHENOD(int value) {

                dGEELJHENOD_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 DGEELJHENOD = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearDGEELJHENOD() {

                dGEELJHENOD_ = 0;
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

            // @@protoc_insertion_point(builder_scope:HomeAvatarSummonEventInfo)
        }

        // @@protoc_insertion_point(class_scope:HomeAvatarSummonEventInfo)
        private static final emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .HomeAvatarSummonEventInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                            .HomeAvatarSummonEventInfo();
        }

        public static emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass
                        .HomeAvatarSummonEventInfo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<HomeAvatarSummonEventInfo> PARSER =
                new com.google.protobuf.AbstractParser<HomeAvatarSummonEventInfo>() {
                    @java.lang.Override
                    public HomeAvatarSummonEventInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new HomeAvatarSummonEventInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<HomeAvatarSummonEventInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<HomeAvatarSummonEventInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.HomeAvatarSummonEventInfoOuterClass.HomeAvatarSummonEventInfo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HomeAvatarSummonEventInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HomeAvatarSummonEventInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\037HomeAvatarSummonEventInfo.proto\"\211\001\n\031Ho"
                    + "meAvatarSummonEventInfo\022\020\n\010event_id\030\n \001("
                    + "\r\022\023\n\013LHAPBMODLNM\030\017 \001(\r\022\017\n\007suit_id\030\002 \001(\r\022"
                    + "\021\n\tavatar_id\030\007 \001(\r\022\014\n\004guid\030\005 \001(\r\022\023\n\013DGEE"
                    + "LJHENOD\030\t \001(\rB\033\n\031emu.grasscutter.net.pro"
                    + "tob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_HomeAvatarSummonEventInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeAvatarSummonEventInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_HomeAvatarSummonEventInfo_descriptor,
                        new java.lang.String[] {
                            "EventId", "LHAPBMODLNM", "SuitId", "AvatarId", "Guid", "DGEELJHENOD",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
