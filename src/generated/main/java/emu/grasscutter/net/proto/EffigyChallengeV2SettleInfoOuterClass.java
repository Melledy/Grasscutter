// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EffigyChallengeV2SettleInfo.proto

package emu.grasscutter.net.proto;

public final class EffigyChallengeV2SettleInfoOuterClass {
    private EffigyChallengeV2SettleInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface EffigyChallengeV2SettleInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:EffigyChallengeV2SettleInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 GGGMOHCJPGF = 3;</code>
         *
         * @return The gGGMOHCJPGF.
         */
        int getGGGMOHCJPGF();

        /**
         * <code>bool HKKEHABACHB = 5;</code>
         *
         * @return The hKKEHABACHB.
         */
        boolean getHKKEHABACHB();

        /**
         * <code>uint32 challenge_mode_difficulty = 2;</code>
         *
         * @return The challengeModeDifficulty.
         */
        int getChallengeModeDifficulty();

        /**
         * <code>uint32 BEPLBNMJMHC = 9;</code>
         *
         * @return The bEPLBNMJMHC.
         */
        int getBEPLBNMJMHC();

        /**
         * <code>bool GELMKIJIEDG = 11;</code>
         *
         * @return The gELMKIJIEDG.
         */
        boolean getGELMKIJIEDG();

        /**
         * <code>uint32 GPNIFILAEFP = 10;</code>
         *
         * @return The gPNIFILAEFP.
         */
        int getGPNIFILAEFP();
    }
    /**
     *
     *
     * <pre>
     * Obf: ALFLMNNNMIO
     * </pre>
     *
     * Protobuf type {@code EffigyChallengeV2SettleInfo}
     */
    public static final class EffigyChallengeV2SettleInfo
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:EffigyChallengeV2SettleInfo)
            EffigyChallengeV2SettleInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use EffigyChallengeV2SettleInfo.newBuilder() to construct.
        private EffigyChallengeV2SettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private EffigyChallengeV2SettleInfo() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new EffigyChallengeV2SettleInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private EffigyChallengeV2SettleInfo(
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
                                challengeModeDifficulty_ = input.readUInt32();
                                break;
                            }
                        case 24:
                            {
                                gGGMOHCJPGF_ = input.readUInt32();
                                break;
                            }
                        case 40:
                            {
                                hKKEHABACHB_ = input.readBool();
                                break;
                            }
                        case 72:
                            {
                                bEPLBNMJMHC_ = input.readUInt32();
                                break;
                            }
                        case 80:
                            {
                                gPNIFILAEFP_ = input.readUInt32();
                                break;
                            }
                        case 88:
                            {
                                gELMKIJIEDG_ = input.readBool();
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
            return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                    .internal_static_EffigyChallengeV2SettleInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                    .internal_static_EffigyChallengeV2SettleInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                                    .EffigyChallengeV2SettleInfo.class,
                            emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                                    .EffigyChallengeV2SettleInfo.Builder.class);
        }

        public static final int GGGMOHCJPGF_FIELD_NUMBER = 3;
        private int gGGMOHCJPGF_;
        /**
         * <code>uint32 GGGMOHCJPGF = 3;</code>
         *
         * @return The gGGMOHCJPGF.
         */
        @java.lang.Override
        public int getGGGMOHCJPGF() {
            return gGGMOHCJPGF_;
        }

        public static final int HKKEHABACHB_FIELD_NUMBER = 5;
        private boolean hKKEHABACHB_;
        /**
         * <code>bool HKKEHABACHB = 5;</code>
         *
         * @return The hKKEHABACHB.
         */
        @java.lang.Override
        public boolean getHKKEHABACHB() {
            return hKKEHABACHB_;
        }

        public static final int CHALLENGE_MODE_DIFFICULTY_FIELD_NUMBER = 2;
        private int challengeModeDifficulty_;
        /**
         * <code>uint32 challenge_mode_difficulty = 2;</code>
         *
         * @return The challengeModeDifficulty.
         */
        @java.lang.Override
        public int getChallengeModeDifficulty() {
            return challengeModeDifficulty_;
        }

        public static final int BEPLBNMJMHC_FIELD_NUMBER = 9;
        private int bEPLBNMJMHC_;
        /**
         * <code>uint32 BEPLBNMJMHC = 9;</code>
         *
         * @return The bEPLBNMJMHC.
         */
        @java.lang.Override
        public int getBEPLBNMJMHC() {
            return bEPLBNMJMHC_;
        }

        public static final int GELMKIJIEDG_FIELD_NUMBER = 11;
        private boolean gELMKIJIEDG_;
        /**
         * <code>bool GELMKIJIEDG = 11;</code>
         *
         * @return The gELMKIJIEDG.
         */
        @java.lang.Override
        public boolean getGELMKIJIEDG() {
            return gELMKIJIEDG_;
        }

        public static final int GPNIFILAEFP_FIELD_NUMBER = 10;
        private int gPNIFILAEFP_;
        /**
         * <code>uint32 GPNIFILAEFP = 10;</code>
         *
         * @return The gPNIFILAEFP.
         */
        @java.lang.Override
        public int getGPNIFILAEFP() {
            return gPNIFILAEFP_;
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
            if (challengeModeDifficulty_ != 0) {
                output.writeUInt32(2, challengeModeDifficulty_);
            }
            if (gGGMOHCJPGF_ != 0) {
                output.writeUInt32(3, gGGMOHCJPGF_);
            }
            if (hKKEHABACHB_ != false) {
                output.writeBool(5, hKKEHABACHB_);
            }
            if (bEPLBNMJMHC_ != 0) {
                output.writeUInt32(9, bEPLBNMJMHC_);
            }
            if (gPNIFILAEFP_ != 0) {
                output.writeUInt32(10, gPNIFILAEFP_);
            }
            if (gELMKIJIEDG_ != false) {
                output.writeBool(11, gELMKIJIEDG_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (challengeModeDifficulty_ != 0) {
                size +=
                        com.google.protobuf.CodedOutputStream.computeUInt32Size(2, challengeModeDifficulty_);
            }
            if (gGGMOHCJPGF_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, gGGMOHCJPGF_);
            }
            if (hKKEHABACHB_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(5, hKKEHABACHB_);
            }
            if (bEPLBNMJMHC_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(9, bEPLBNMJMHC_);
            }
            if (gPNIFILAEFP_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(10, gPNIFILAEFP_);
            }
            if (gELMKIJIEDG_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(11, gELMKIJIEDG_);
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
                    emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                            .EffigyChallengeV2SettleInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo
                    other =
                            (emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                                            .EffigyChallengeV2SettleInfo)
                                    obj;

            if (getGGGMOHCJPGF() != other.getGGGMOHCJPGF()) return false;
            if (getHKKEHABACHB() != other.getHKKEHABACHB()) return false;
            if (getChallengeModeDifficulty() != other.getChallengeModeDifficulty()) return false;
            if (getBEPLBNMJMHC() != other.getBEPLBNMJMHC()) return false;
            if (getGELMKIJIEDG() != other.getGELMKIJIEDG()) return false;
            if (getGPNIFILAEFP() != other.getGPNIFILAEFP()) return false;
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
            hash = (37 * hash) + GGGMOHCJPGF_FIELD_NUMBER;
            hash = (53 * hash) + getGGGMOHCJPGF();
            hash = (37 * hash) + HKKEHABACHB_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getHKKEHABACHB());
            hash = (37 * hash) + CHALLENGE_MODE_DIFFICULTY_FIELD_NUMBER;
            hash = (53 * hash) + getChallengeModeDifficulty();
            hash = (37 * hash) + BEPLBNMJMHC_FIELD_NUMBER;
            hash = (53 * hash) + getBEPLBNMJMHC();
            hash = (37 * hash) + GELMKIJIEDG_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getGELMKIJIEDG());
            hash = (37 * hash) + GPNIFILAEFP_FIELD_NUMBER;
            hash = (53 * hash) + getGPNIFILAEFP();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfo
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfo
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfo
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfo
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfo
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfo
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfo
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfo
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfo
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfo
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
                emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo
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
         * Obf: ALFLMNNNMIO
         * </pre>
         *
         * Protobuf type {@code EffigyChallengeV2SettleInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:EffigyChallengeV2SettleInfo)
                emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .internal_static_EffigyChallengeV2SettleInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .internal_static_EffigyChallengeV2SettleInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                                        .EffigyChallengeV2SettleInfo.class,
                                emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                                        .EffigyChallengeV2SettleInfo.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo.newBuilder()
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
                gGGMOHCJPGF_ = 0;

                hKKEHABACHB_ = false;

                challengeModeDifficulty_ = 0;

                bEPLBNMJMHC_ = 0;

                gELMKIJIEDG_ = false;

                gPNIFILAEFP_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .internal_static_EffigyChallengeV2SettleInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                            .EffigyChallengeV2SettleInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfo.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                            .EffigyChallengeV2SettleInfo
                    build() {
                emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                            .EffigyChallengeV2SettleInfo
                    buildPartial() {
                emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo
                        result =
                                new emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                                        .EffigyChallengeV2SettleInfo(this);
                result.gGGMOHCJPGF_ = gGGMOHCJPGF_;
                result.hKKEHABACHB_ = hKKEHABACHB_;
                result.challengeModeDifficulty_ = challengeModeDifficulty_;
                result.bEPLBNMJMHC_ = bEPLBNMJMHC_;
                result.gELMKIJIEDG_ = gELMKIJIEDG_;
                result.gPNIFILAEFP_ = gPNIFILAEFP_;
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
                        emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                                .EffigyChallengeV2SettleInfo) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                                            .EffigyChallengeV2SettleInfo)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                                    .EffigyChallengeV2SettleInfo
                            other) {
                if (other
                        == emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                                .EffigyChallengeV2SettleInfo.getDefaultInstance()) return this;
                if (other.getGGGMOHCJPGF() != 0) {
                    setGGGMOHCJPGF(other.getGGGMOHCJPGF());
                }
                if (other.getHKKEHABACHB() != false) {
                    setHKKEHABACHB(other.getHKKEHABACHB());
                }
                if (other.getChallengeModeDifficulty() != 0) {
                    setChallengeModeDifficulty(other.getChallengeModeDifficulty());
                }
                if (other.getBEPLBNMJMHC() != 0) {
                    setBEPLBNMJMHC(other.getBEPLBNMJMHC());
                }
                if (other.getGELMKIJIEDG() != false) {
                    setGELMKIJIEDG(other.getGELMKIJIEDG());
                }
                if (other.getGPNIFILAEFP() != 0) {
                    setGPNIFILAEFP(other.getGPNIFILAEFP());
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
                emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                                            .EffigyChallengeV2SettleInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int gGGMOHCJPGF_;
            /**
             * <code>uint32 GGGMOHCJPGF = 3;</code>
             *
             * @return The gGGMOHCJPGF.
             */
            @java.lang.Override
            public int getGGGMOHCJPGF() {
                return gGGMOHCJPGF_;
            }
            /**
             * <code>uint32 GGGMOHCJPGF = 3;</code>
             *
             * @param value The gGGMOHCJPGF to set.
             * @return This builder for chaining.
             */
            public Builder setGGGMOHCJPGF(int value) {

                gGGMOHCJPGF_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 GGGMOHCJPGF = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGGGMOHCJPGF() {

                gGGMOHCJPGF_ = 0;
                onChanged();
                return this;
            }

            private boolean hKKEHABACHB_;
            /**
             * <code>bool HKKEHABACHB = 5;</code>
             *
             * @return The hKKEHABACHB.
             */
            @java.lang.Override
            public boolean getHKKEHABACHB() {
                return hKKEHABACHB_;
            }
            /**
             * <code>bool HKKEHABACHB = 5;</code>
             *
             * @param value The hKKEHABACHB to set.
             * @return This builder for chaining.
             */
            public Builder setHKKEHABACHB(boolean value) {

                hKKEHABACHB_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool HKKEHABACHB = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearHKKEHABACHB() {

                hKKEHABACHB_ = false;
                onChanged();
                return this;
            }

            private int challengeModeDifficulty_;
            /**
             * <code>uint32 challenge_mode_difficulty = 2;</code>
             *
             * @return The challengeModeDifficulty.
             */
            @java.lang.Override
            public int getChallengeModeDifficulty() {
                return challengeModeDifficulty_;
            }
            /**
             * <code>uint32 challenge_mode_difficulty = 2;</code>
             *
             * @param value The challengeModeDifficulty to set.
             * @return This builder for chaining.
             */
            public Builder setChallengeModeDifficulty(int value) {

                challengeModeDifficulty_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 challenge_mode_difficulty = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearChallengeModeDifficulty() {

                challengeModeDifficulty_ = 0;
                onChanged();
                return this;
            }

            private int bEPLBNMJMHC_;
            /**
             * <code>uint32 BEPLBNMJMHC = 9;</code>
             *
             * @return The bEPLBNMJMHC.
             */
            @java.lang.Override
            public int getBEPLBNMJMHC() {
                return bEPLBNMJMHC_;
            }
            /**
             * <code>uint32 BEPLBNMJMHC = 9;</code>
             *
             * @param value The bEPLBNMJMHC to set.
             * @return This builder for chaining.
             */
            public Builder setBEPLBNMJMHC(int value) {

                bEPLBNMJMHC_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 BEPLBNMJMHC = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearBEPLBNMJMHC() {

                bEPLBNMJMHC_ = 0;
                onChanged();
                return this;
            }

            private boolean gELMKIJIEDG_;
            /**
             * <code>bool GELMKIJIEDG = 11;</code>
             *
             * @return The gELMKIJIEDG.
             */
            @java.lang.Override
            public boolean getGELMKIJIEDG() {
                return gELMKIJIEDG_;
            }
            /**
             * <code>bool GELMKIJIEDG = 11;</code>
             *
             * @param value The gELMKIJIEDG to set.
             * @return This builder for chaining.
             */
            public Builder setGELMKIJIEDG(boolean value) {

                gELMKIJIEDG_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool GELMKIJIEDG = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGELMKIJIEDG() {

                gELMKIJIEDG_ = false;
                onChanged();
                return this;
            }

            private int gPNIFILAEFP_;
            /**
             * <code>uint32 GPNIFILAEFP = 10;</code>
             *
             * @return The gPNIFILAEFP.
             */
            @java.lang.Override
            public int getGPNIFILAEFP() {
                return gPNIFILAEFP_;
            }
            /**
             * <code>uint32 GPNIFILAEFP = 10;</code>
             *
             * @param value The gPNIFILAEFP to set.
             * @return This builder for chaining.
             */
            public Builder setGPNIFILAEFP(int value) {

                gPNIFILAEFP_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 GPNIFILAEFP = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGPNIFILAEFP() {

                gPNIFILAEFP_ = 0;
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

            // @@protoc_insertion_point(builder_scope:EffigyChallengeV2SettleInfo)
        }

        // @@protoc_insertion_point(class_scope:EffigyChallengeV2SettleInfo)
        private static final emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                            .EffigyChallengeV2SettleInfo();
        }

        public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<EffigyChallengeV2SettleInfo> PARSER =
                new com.google.protobuf.AbstractParser<EffigyChallengeV2SettleInfo>() {
                    @java.lang.Override
                    public EffigyChallengeV2SettleInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new EffigyChallengeV2SettleInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<EffigyChallengeV2SettleInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<EffigyChallengeV2SettleInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass
                        .EffigyChallengeV2SettleInfo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_EffigyChallengeV2SettleInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_EffigyChallengeV2SettleInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n!EffigyChallengeV2SettleInfo.proto\"\251\001\n\033"
                    + "EffigyChallengeV2SettleInfo\022\023\n\013GGGMOHCJP"
                    + "GF\030\003 \001(\r\022\023\n\013HKKEHABACHB\030\005 \001(\010\022!\n\031challen"
                    + "ge_mode_difficulty\030\002 \001(\r\022\023\n\013BEPLBNMJMHC\030"
                    + "\t \001(\r\022\023\n\013GELMKIJIEDG\030\013 \001(\010\022\023\n\013GPNIFILAEF"
                    + "P\030\n \001(\rB\033\n\031emu.grasscutter.net.protob\006pr"
                    + "oto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_EffigyChallengeV2SettleInfo_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_EffigyChallengeV2SettleInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_EffigyChallengeV2SettleInfo_descriptor,
                        new java.lang.String[] {
                            "GGGMOHCJPGF",
                            "HKKEHABACHB",
                            "ChallengeModeDifficulty",
                            "BEPLBNMJMHC",
                            "GELMKIJIEDG",
                            "GPNIFILAEFP",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
