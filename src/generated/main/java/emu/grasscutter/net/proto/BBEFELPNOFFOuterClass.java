// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BBEFELPNOFF.proto

package emu.grasscutter.net.proto;

public final class BBEFELPNOFFOuterClass {
    private BBEFELPNOFFOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface BBEFELPNOFFOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:BBEFELPNOFF)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 dungeon_id = 14;</code>
         *
         * @return The dungeonId.
         */
        int getDungeonId();

        /**
         * <code>.AFCLGCNDDBH BPPDFFHHANO = 3;</code>
         *
         * @return Whether the bPPDFFHHANO field is set.
         */
        boolean hasBPPDFFHHANO();
        /**
         * <code>.AFCLGCNDDBH BPPDFFHHANO = 3;</code>
         *
         * @return The bPPDFFHHANO.
         */
        emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH getBPPDFFHHANO();
        /** <code>.AFCLGCNDDBH BPPDFFHHANO = 3;</code> */
        emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBHOrBuilder getBPPDFFHHANOOrBuilder();

        /**
         * <code>uint32 IFMFKDKLKDE = 7;</code>
         *
         * @return The iFMFKDKLKDE.
         */
        int getIFMFKDKLKDE();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 9231
     * </pre>
     *
     * Protobuf type {@code BBEFELPNOFF}
     */
    public static final class BBEFELPNOFF extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:BBEFELPNOFF)
            BBEFELPNOFFOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use BBEFELPNOFF.newBuilder() to construct.
        private BBEFELPNOFF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private BBEFELPNOFF() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new BBEFELPNOFF();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private BBEFELPNOFF(
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
                        case 26:
                            {
                                emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH.Builder subBuilder =
                                        null;
                                if (bPPDFFHHANO_ != null) {
                                    subBuilder = bPPDFFHHANO_.toBuilder();
                                }
                                bPPDFFHHANO_ =
                                        input.readMessage(
                                                emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH.parser(),
                                                extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(bPPDFFHHANO_);
                                    bPPDFFHHANO_ = subBuilder.buildPartial();
                                }

                                break;
                            }
                        case 56:
                            {
                                iFMFKDKLKDE_ = input.readUInt32();
                                break;
                            }
                        case 112:
                            {
                                dungeonId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.internal_static_BBEFELPNOFF_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.BBEFELPNOFFOuterClass
                    .internal_static_BBEFELPNOFF_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF.class,
                            emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF.Builder.class);
        }

        public static final int DUNGEON_ID_FIELD_NUMBER = 14;
        private int dungeonId_;
        /**
         * <code>uint32 dungeon_id = 14;</code>
         *
         * @return The dungeonId.
         */
        @java.lang.Override
        public int getDungeonId() {
            return dungeonId_;
        }

        public static final int BPPDFFHHANO_FIELD_NUMBER = 3;
        private emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH bPPDFFHHANO_;
        /**
         * <code>.AFCLGCNDDBH BPPDFFHHANO = 3;</code>
         *
         * @return Whether the bPPDFFHHANO field is set.
         */
        @java.lang.Override
        public boolean hasBPPDFFHHANO() {
            return bPPDFFHHANO_ != null;
        }
        /**
         * <code>.AFCLGCNDDBH BPPDFFHHANO = 3;</code>
         *
         * @return The bPPDFFHHANO.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH getBPPDFFHHANO() {
            return bPPDFFHHANO_ == null
                    ? emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH.getDefaultInstance()
                    : bPPDFFHHANO_;
        }
        /** <code>.AFCLGCNDDBH BPPDFFHHANO = 3;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBHOrBuilder
                getBPPDFFHHANOOrBuilder() {
            return getBPPDFFHHANO();
        }

        public static final int IFMFKDKLKDE_FIELD_NUMBER = 7;
        private int iFMFKDKLKDE_;
        /**
         * <code>uint32 IFMFKDKLKDE = 7;</code>
         *
         * @return The iFMFKDKLKDE.
         */
        @java.lang.Override
        public int getIFMFKDKLKDE() {
            return iFMFKDKLKDE_;
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
            if (bPPDFFHHANO_ != null) {
                output.writeMessage(3, getBPPDFFHHANO());
            }
            if (iFMFKDKLKDE_ != 0) {
                output.writeUInt32(7, iFMFKDKLKDE_);
            }
            if (dungeonId_ != 0) {
                output.writeUInt32(14, dungeonId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (bPPDFFHHANO_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getBPPDFFHHANO());
            }
            if (iFMFKDKLKDE_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(7, iFMFKDKLKDE_);
            }
            if (dungeonId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(14, dungeonId_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF other =
                    (emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF) obj;

            if (getDungeonId() != other.getDungeonId()) return false;
            if (hasBPPDFFHHANO() != other.hasBPPDFFHHANO()) return false;
            if (hasBPPDFFHHANO()) {
                if (!getBPPDFFHHANO().equals(other.getBPPDFFHHANO())) return false;
            }
            if (getIFMFKDKLKDE() != other.getIFMFKDKLKDE()) return false;
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
            hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
            hash = (53 * hash) + getDungeonId();
            if (hasBPPDFFHHANO()) {
                hash = (37 * hash) + BPPDFFHHANO_FIELD_NUMBER;
                hash = (53 * hash) + getBPPDFFHHANO().hashCode();
            }
            hash = (37 * hash) + IFMFKDKLKDE_FIELD_NUMBER;
            hash = (53 * hash) + getIFMFKDKLKDE();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF parseFrom(
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
                emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF prototype) {
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
         * CmdId: 9231
         * </pre>
         *
         * Protobuf type {@code BBEFELPNOFF}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:BBEFELPNOFF)
                emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFFOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.BBEFELPNOFFOuterClass
                        .internal_static_BBEFELPNOFF_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.BBEFELPNOFFOuterClass
                        .internal_static_BBEFELPNOFF_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF.class,
                                emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF.newBuilder()
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
                dungeonId_ = 0;

                if (bPPDFFHHANOBuilder_ == null) {
                    bPPDFFHHANO_ = null;
                } else {
                    bPPDFFHHANO_ = null;
                    bPPDFFHHANOBuilder_ = null;
                }
                iFMFKDKLKDE_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.BBEFELPNOFFOuterClass
                        .internal_static_BBEFELPNOFF_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF build() {
                emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF buildPartial() {
                emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF result =
                        new emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF(this);
                result.dungeonId_ = dungeonId_;
                if (bPPDFFHHANOBuilder_ == null) {
                    result.bPPDFFHHANO_ = bPPDFFHHANO_;
                } else {
                    result.bPPDFFHHANO_ = bPPDFFHHANOBuilder_.build();
                }
                result.iFMFKDKLKDE_ = iFMFKDKLKDE_;
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
                if (other instanceof emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF) {
                    return mergeFrom((emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF other) {
                if (other
                        == emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF.getDefaultInstance())
                    return this;
                if (other.getDungeonId() != 0) {
                    setDungeonId(other.getDungeonId());
                }
                if (other.hasBPPDFFHHANO()) {
                    mergeBPPDFFHHANO(other.getBPPDFFHHANO());
                }
                if (other.getIFMFKDKLKDE() != 0) {
                    setIFMFKDKLKDE(other.getIFMFKDKLKDE());
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
                emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int dungeonId_;
            /**
             * <code>uint32 dungeon_id = 14;</code>
             *
             * @return The dungeonId.
             */
            @java.lang.Override
            public int getDungeonId() {
                return dungeonId_;
            }
            /**
             * <code>uint32 dungeon_id = 14;</code>
             *
             * @param value The dungeonId to set.
             * @return This builder for chaining.
             */
            public Builder setDungeonId(int value) {

                dungeonId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 dungeon_id = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearDungeonId() {

                dungeonId_ = 0;
                onChanged();
                return this;
            }

            private emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH bPPDFFHHANO_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH,
                            emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH.Builder,
                            emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBHOrBuilder>
                    bPPDFFHHANOBuilder_;
            /**
             * <code>.AFCLGCNDDBH BPPDFFHHANO = 3;</code>
             *
             * @return Whether the bPPDFFHHANO field is set.
             */
            public boolean hasBPPDFFHHANO() {
                return bPPDFFHHANOBuilder_ != null || bPPDFFHHANO_ != null;
            }
            /**
             * <code>.AFCLGCNDDBH BPPDFFHHANO = 3;</code>
             *
             * @return The bPPDFFHHANO.
             */
            public emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH getBPPDFFHHANO() {
                if (bPPDFFHHANOBuilder_ == null) {
                    return bPPDFFHHANO_ == null
                            ? emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH.getDefaultInstance()
                            : bPPDFFHHANO_;
                } else {
                    return bPPDFFHHANOBuilder_.getMessage();
                }
            }
            /** <code>.AFCLGCNDDBH BPPDFFHHANO = 3;</code> */
            public Builder setBPPDFFHHANO(
                    emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH value) {
                if (bPPDFFHHANOBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bPPDFFHHANO_ = value;
                    onChanged();
                } else {
                    bPPDFFHHANOBuilder_.setMessage(value);
                }

                return this;
            }
            /** <code>.AFCLGCNDDBH BPPDFFHHANO = 3;</code> */
            public Builder setBPPDFFHHANO(
                    emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH.Builder builderForValue) {
                if (bPPDFFHHANOBuilder_ == null) {
                    bPPDFFHHANO_ = builderForValue.build();
                    onChanged();
                } else {
                    bPPDFFHHANOBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /** <code>.AFCLGCNDDBH BPPDFFHHANO = 3;</code> */
            public Builder mergeBPPDFFHHANO(
                    emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH value) {
                if (bPPDFFHHANOBuilder_ == null) {
                    if (bPPDFFHHANO_ != null) {
                        bPPDFFHHANO_ =
                                emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH
                                        .newBuilder(bPPDFFHHANO_)
                                        .mergeFrom(value)
                                        .buildPartial();
                    } else {
                        bPPDFFHHANO_ = value;
                    }
                    onChanged();
                } else {
                    bPPDFFHHANOBuilder_.mergeFrom(value);
                }

                return this;
            }
            /** <code>.AFCLGCNDDBH BPPDFFHHANO = 3;</code> */
            public Builder clearBPPDFFHHANO() {
                if (bPPDFFHHANOBuilder_ == null) {
                    bPPDFFHHANO_ = null;
                    onChanged();
                } else {
                    bPPDFFHHANO_ = null;
                    bPPDFFHHANOBuilder_ = null;
                }

                return this;
            }
            /** <code>.AFCLGCNDDBH BPPDFFHHANO = 3;</code> */
            public emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH.Builder
                    getBPPDFFHHANOBuilder() {

                onChanged();
                return getBPPDFFHHANOFieldBuilder().getBuilder();
            }
            /** <code>.AFCLGCNDDBH BPPDFFHHANO = 3;</code> */
            public emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBHOrBuilder
                    getBPPDFFHHANOOrBuilder() {
                if (bPPDFFHHANOBuilder_ != null) {
                    return bPPDFFHHANOBuilder_.getMessageOrBuilder();
                } else {
                    return bPPDFFHHANO_ == null
                            ? emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH.getDefaultInstance()
                            : bPPDFFHHANO_;
                }
            }
            /** <code>.AFCLGCNDDBH BPPDFFHHANO = 3;</code> */
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH,
                            emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH.Builder,
                            emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBHOrBuilder>
                    getBPPDFFHHANOFieldBuilder() {
                if (bPPDFFHHANOBuilder_ == null) {
                    bPPDFFHHANOBuilder_ =
                            new com.google.protobuf.SingleFieldBuilderV3<
                                    emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH,
                                    emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBH.Builder,
                                    emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.AFCLGCNDDBHOrBuilder>(
                                    getBPPDFFHHANO(), getParentForChildren(), isClean());
                    bPPDFFHHANO_ = null;
                }
                return bPPDFFHHANOBuilder_;
            }

            private int iFMFKDKLKDE_;
            /**
             * <code>uint32 IFMFKDKLKDE = 7;</code>
             *
             * @return The iFMFKDKLKDE.
             */
            @java.lang.Override
            public int getIFMFKDKLKDE() {
                return iFMFKDKLKDE_;
            }
            /**
             * <code>uint32 IFMFKDKLKDE = 7;</code>
             *
             * @param value The iFMFKDKLKDE to set.
             * @return This builder for chaining.
             */
            public Builder setIFMFKDKLKDE(int value) {

                iFMFKDKLKDE_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 IFMFKDKLKDE = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIFMFKDKLKDE() {

                iFMFKDKLKDE_ = 0;
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

            // @@protoc_insertion_point(builder_scope:BBEFELPNOFF)
        }

        // @@protoc_insertion_point(class_scope:BBEFELPNOFF)
        private static final emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF();
        }

        public static emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<BBEFELPNOFF> PARSER =
                new com.google.protobuf.AbstractParser<BBEFELPNOFF>() {
                    @java.lang.Override
                    public BBEFELPNOFF parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new BBEFELPNOFF(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<BBEFELPNOFF> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<BBEFELPNOFF> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.BBEFELPNOFFOuterClass.BBEFELPNOFF getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_BBEFELPNOFF_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_BBEFELPNOFF_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021BBEFELPNOFF.proto\032\021AFCLGCNDDBH.proto\"Y"
                    + "\n\013BBEFELPNOFF\022\022\n\ndungeon_id\030\016 \001(\r\022!\n\013BPP"
                    + "DFFHHANO\030\003 \001(\0132\014.AFCLGCNDDBH\022\023\n\013IFMFKDKL"
                    + "KDE\030\007 \001(\rB\033\n\031emu.grasscutter.net.protob\006"
                    + "proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.getDescriptor(),
                        });
        internal_static_BBEFELPNOFF_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BBEFELPNOFF_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_BBEFELPNOFF_descriptor,
                        new java.lang.String[] {
                            "DungeonId", "BPPDFFHHANO", "IFMFKDKLKDE",
                        });
        emu.grasscutter.net.proto.AFCLGCNDDBHOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
