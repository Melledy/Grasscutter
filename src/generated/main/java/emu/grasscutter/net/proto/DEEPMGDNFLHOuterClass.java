// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DEEPMGDNFLH.proto

package emu.grasscutter.net.proto;

public final class DEEPMGDNFLHOuterClass {
    private DEEPMGDNFLHOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface DEEPMGDNFLHOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:DEEPMGDNFLH)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>float JNEKCJANDGG = 4;</code>
         *
         * @return The jNEKCJANDGG.
         */
        float getJNEKCJANDGG();

        /**
         * <code>float JPLABPDDDAA = 11;</code>
         *
         * @return The jPLABPDDDAA.
         */
        float getJPLABPDDDAA();

        /**
         * <code>bool LACELNHKONE = 7;</code>
         *
         * @return The lACELNHKONE.
         */
        boolean getLACELNHKONE();

        /**
         * <code>uint32 EEPFLJEMMLD = 14;</code>
         *
         * @return The eEPFLJEMMLD.
         */
        int getEEPFLJEMMLD();

        /**
         * <code>float HNGHMNBGHLG = 10;</code>
         *
         * @return The hNGHMNBGHLG.
         */
        float getHNGHMNBGHLG();

        /**
         * <code>uint32 OEEFMKOMJBK = 15;</code>
         *
         * @return The oEEFMKOMJBK.
         */
        int getOEEFMKOMJBK();
    }
    /** Protobuf type {@code DEEPMGDNFLH} */
    public static final class DEEPMGDNFLH extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:DEEPMGDNFLH)
            DEEPMGDNFLHOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use DEEPMGDNFLH.newBuilder() to construct.
        private DEEPMGDNFLH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private DEEPMGDNFLH() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new DEEPMGDNFLH();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private DEEPMGDNFLH(
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
                        case 37:
                            {
                                jNEKCJANDGG_ = input.readFloat();
                                break;
                            }
                        case 56:
                            {
                                lACELNHKONE_ = input.readBool();
                                break;
                            }
                        case 85:
                            {
                                hNGHMNBGHLG_ = input.readFloat();
                                break;
                            }
                        case 93:
                            {
                                jPLABPDDDAA_ = input.readFloat();
                                break;
                            }
                        case 112:
                            {
                                eEPFLJEMMLD_ = input.readUInt32();
                                break;
                            }
                        case 120:
                            {
                                oEEFMKOMJBK_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.internal_static_DEEPMGDNFLH_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass
                    .internal_static_DEEPMGDNFLH_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH.class,
                            emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH.Builder.class);
        }

        public static final int JNEKCJANDGG_FIELD_NUMBER = 4;
        private float jNEKCJANDGG_;
        /**
         * <code>float JNEKCJANDGG = 4;</code>
         *
         * @return The jNEKCJANDGG.
         */
        @java.lang.Override
        public float getJNEKCJANDGG() {
            return jNEKCJANDGG_;
        }

        public static final int JPLABPDDDAA_FIELD_NUMBER = 11;
        private float jPLABPDDDAA_;
        /**
         * <code>float JPLABPDDDAA = 11;</code>
         *
         * @return The jPLABPDDDAA.
         */
        @java.lang.Override
        public float getJPLABPDDDAA() {
            return jPLABPDDDAA_;
        }

        public static final int LACELNHKONE_FIELD_NUMBER = 7;
        private boolean lACELNHKONE_;
        /**
         * <code>bool LACELNHKONE = 7;</code>
         *
         * @return The lACELNHKONE.
         */
        @java.lang.Override
        public boolean getLACELNHKONE() {
            return lACELNHKONE_;
        }

        public static final int EEPFLJEMMLD_FIELD_NUMBER = 14;
        private int eEPFLJEMMLD_;
        /**
         * <code>uint32 EEPFLJEMMLD = 14;</code>
         *
         * @return The eEPFLJEMMLD.
         */
        @java.lang.Override
        public int getEEPFLJEMMLD() {
            return eEPFLJEMMLD_;
        }

        public static final int HNGHMNBGHLG_FIELD_NUMBER = 10;
        private float hNGHMNBGHLG_;
        /**
         * <code>float HNGHMNBGHLG = 10;</code>
         *
         * @return The hNGHMNBGHLG.
         */
        @java.lang.Override
        public float getHNGHMNBGHLG() {
            return hNGHMNBGHLG_;
        }

        public static final int OEEFMKOMJBK_FIELD_NUMBER = 15;
        private int oEEFMKOMJBK_;
        /**
         * <code>uint32 OEEFMKOMJBK = 15;</code>
         *
         * @return The oEEFMKOMJBK.
         */
        @java.lang.Override
        public int getOEEFMKOMJBK() {
            return oEEFMKOMJBK_;
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
            if (jNEKCJANDGG_ != 0F) {
                output.writeFloat(4, jNEKCJANDGG_);
            }
            if (lACELNHKONE_ != false) {
                output.writeBool(7, lACELNHKONE_);
            }
            if (hNGHMNBGHLG_ != 0F) {
                output.writeFloat(10, hNGHMNBGHLG_);
            }
            if (jPLABPDDDAA_ != 0F) {
                output.writeFloat(11, jPLABPDDDAA_);
            }
            if (eEPFLJEMMLD_ != 0) {
                output.writeUInt32(14, eEPFLJEMMLD_);
            }
            if (oEEFMKOMJBK_ != 0) {
                output.writeUInt32(15, oEEFMKOMJBK_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (jNEKCJANDGG_ != 0F) {
                size += com.google.protobuf.CodedOutputStream.computeFloatSize(4, jNEKCJANDGG_);
            }
            if (lACELNHKONE_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(7, lACELNHKONE_);
            }
            if (hNGHMNBGHLG_ != 0F) {
                size += com.google.protobuf.CodedOutputStream.computeFloatSize(10, hNGHMNBGHLG_);
            }
            if (jPLABPDDDAA_ != 0F) {
                size += com.google.protobuf.CodedOutputStream.computeFloatSize(11, jPLABPDDDAA_);
            }
            if (eEPFLJEMMLD_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(14, eEPFLJEMMLD_);
            }
            if (oEEFMKOMJBK_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(15, oEEFMKOMJBK_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH other =
                    (emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH) obj;

            if (java.lang.Float.floatToIntBits(getJNEKCJANDGG())
                    != java.lang.Float.floatToIntBits(other.getJNEKCJANDGG())) return false;
            if (java.lang.Float.floatToIntBits(getJPLABPDDDAA())
                    != java.lang.Float.floatToIntBits(other.getJPLABPDDDAA())) return false;
            if (getLACELNHKONE() != other.getLACELNHKONE()) return false;
            if (getEEPFLJEMMLD() != other.getEEPFLJEMMLD()) return false;
            if (java.lang.Float.floatToIntBits(getHNGHMNBGHLG())
                    != java.lang.Float.floatToIntBits(other.getHNGHMNBGHLG())) return false;
            if (getOEEFMKOMJBK() != other.getOEEFMKOMJBK()) return false;
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
            hash = (37 * hash) + JNEKCJANDGG_FIELD_NUMBER;
            hash = (53 * hash) + java.lang.Float.floatToIntBits(getJNEKCJANDGG());
            hash = (37 * hash) + JPLABPDDDAA_FIELD_NUMBER;
            hash = (53 * hash) + java.lang.Float.floatToIntBits(getJPLABPDDDAA());
            hash = (37 * hash) + LACELNHKONE_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getLACELNHKONE());
            hash = (37 * hash) + EEPFLJEMMLD_FIELD_NUMBER;
            hash = (53 * hash) + getEEPFLJEMMLD();
            hash = (37 * hash) + HNGHMNBGHLG_FIELD_NUMBER;
            hash = (53 * hash) + java.lang.Float.floatToIntBits(getHNGHMNBGHLG());
            hash = (37 * hash) + OEEFMKOMJBK_FIELD_NUMBER;
            hash = (53 * hash) + getOEEFMKOMJBK();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH parseFrom(
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
                emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH prototype) {
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
        /** Protobuf type {@code DEEPMGDNFLH} */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:DEEPMGDNFLH)
                emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLHOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass
                        .internal_static_DEEPMGDNFLH_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass
                        .internal_static_DEEPMGDNFLH_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH.class,
                                emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH.newBuilder()
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
                jNEKCJANDGG_ = 0F;

                jPLABPDDDAA_ = 0F;

                lACELNHKONE_ = false;

                eEPFLJEMMLD_ = 0;

                hNGHMNBGHLG_ = 0F;

                oEEFMKOMJBK_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass
                        .internal_static_DEEPMGDNFLH_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH build() {
                emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH buildPartial() {
                emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH result =
                        new emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH(this);
                result.jNEKCJANDGG_ = jNEKCJANDGG_;
                result.jPLABPDDDAA_ = jPLABPDDDAA_;
                result.lACELNHKONE_ = lACELNHKONE_;
                result.eEPFLJEMMLD_ = eEPFLJEMMLD_;
                result.hNGHMNBGHLG_ = hNGHMNBGHLG_;
                result.oEEFMKOMJBK_ = oEEFMKOMJBK_;
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
                if (other instanceof emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH) {
                    return mergeFrom((emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH other) {
                if (other
                        == emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH.getDefaultInstance())
                    return this;
                if (other.getJNEKCJANDGG() != 0F) {
                    setJNEKCJANDGG(other.getJNEKCJANDGG());
                }
                if (other.getJPLABPDDDAA() != 0F) {
                    setJPLABPDDDAA(other.getJPLABPDDDAA());
                }
                if (other.getLACELNHKONE() != false) {
                    setLACELNHKONE(other.getLACELNHKONE());
                }
                if (other.getEEPFLJEMMLD() != 0) {
                    setEEPFLJEMMLD(other.getEEPFLJEMMLD());
                }
                if (other.getHNGHMNBGHLG() != 0F) {
                    setHNGHMNBGHLG(other.getHNGHMNBGHLG());
                }
                if (other.getOEEFMKOMJBK() != 0) {
                    setOEEFMKOMJBK(other.getOEEFMKOMJBK());
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
                emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private float jNEKCJANDGG_;
            /**
             * <code>float JNEKCJANDGG = 4;</code>
             *
             * @return The jNEKCJANDGG.
             */
            @java.lang.Override
            public float getJNEKCJANDGG() {
                return jNEKCJANDGG_;
            }
            /**
             * <code>float JNEKCJANDGG = 4;</code>
             *
             * @param value The jNEKCJANDGG to set.
             * @return This builder for chaining.
             */
            public Builder setJNEKCJANDGG(float value) {

                jNEKCJANDGG_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>float JNEKCJANDGG = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearJNEKCJANDGG() {

                jNEKCJANDGG_ = 0F;
                onChanged();
                return this;
            }

            private float jPLABPDDDAA_;
            /**
             * <code>float JPLABPDDDAA = 11;</code>
             *
             * @return The jPLABPDDDAA.
             */
            @java.lang.Override
            public float getJPLABPDDDAA() {
                return jPLABPDDDAA_;
            }
            /**
             * <code>float JPLABPDDDAA = 11;</code>
             *
             * @param value The jPLABPDDDAA to set.
             * @return This builder for chaining.
             */
            public Builder setJPLABPDDDAA(float value) {

                jPLABPDDDAA_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>float JPLABPDDDAA = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearJPLABPDDDAA() {

                jPLABPDDDAA_ = 0F;
                onChanged();
                return this;
            }

            private boolean lACELNHKONE_;
            /**
             * <code>bool LACELNHKONE = 7;</code>
             *
             * @return The lACELNHKONE.
             */
            @java.lang.Override
            public boolean getLACELNHKONE() {
                return lACELNHKONE_;
            }
            /**
             * <code>bool LACELNHKONE = 7;</code>
             *
             * @param value The lACELNHKONE to set.
             * @return This builder for chaining.
             */
            public Builder setLACELNHKONE(boolean value) {

                lACELNHKONE_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool LACELNHKONE = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLACELNHKONE() {

                lACELNHKONE_ = false;
                onChanged();
                return this;
            }

            private int eEPFLJEMMLD_;
            /**
             * <code>uint32 EEPFLJEMMLD = 14;</code>
             *
             * @return The eEPFLJEMMLD.
             */
            @java.lang.Override
            public int getEEPFLJEMMLD() {
                return eEPFLJEMMLD_;
            }
            /**
             * <code>uint32 EEPFLJEMMLD = 14;</code>
             *
             * @param value The eEPFLJEMMLD to set.
             * @return This builder for chaining.
             */
            public Builder setEEPFLJEMMLD(int value) {

                eEPFLJEMMLD_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 EEPFLJEMMLD = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEEPFLJEMMLD() {

                eEPFLJEMMLD_ = 0;
                onChanged();
                return this;
            }

            private float hNGHMNBGHLG_;
            /**
             * <code>float HNGHMNBGHLG = 10;</code>
             *
             * @return The hNGHMNBGHLG.
             */
            @java.lang.Override
            public float getHNGHMNBGHLG() {
                return hNGHMNBGHLG_;
            }
            /**
             * <code>float HNGHMNBGHLG = 10;</code>
             *
             * @param value The hNGHMNBGHLG to set.
             * @return This builder for chaining.
             */
            public Builder setHNGHMNBGHLG(float value) {

                hNGHMNBGHLG_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>float HNGHMNBGHLG = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearHNGHMNBGHLG() {

                hNGHMNBGHLG_ = 0F;
                onChanged();
                return this;
            }

            private int oEEFMKOMJBK_;
            /**
             * <code>uint32 OEEFMKOMJBK = 15;</code>
             *
             * @return The oEEFMKOMJBK.
             */
            @java.lang.Override
            public int getOEEFMKOMJBK() {
                return oEEFMKOMJBK_;
            }
            /**
             * <code>uint32 OEEFMKOMJBK = 15;</code>
             *
             * @param value The oEEFMKOMJBK to set.
             * @return This builder for chaining.
             */
            public Builder setOEEFMKOMJBK(int value) {

                oEEFMKOMJBK_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 OEEFMKOMJBK = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearOEEFMKOMJBK() {

                oEEFMKOMJBK_ = 0;
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

            // @@protoc_insertion_point(builder_scope:DEEPMGDNFLH)
        }

        // @@protoc_insertion_point(class_scope:DEEPMGDNFLH)
        private static final emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH();
        }

        public static emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<DEEPMGDNFLH> PARSER =
                new com.google.protobuf.AbstractParser<DEEPMGDNFLH>() {
                    @java.lang.Override
                    public DEEPMGDNFLH parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new DEEPMGDNFLH(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<DEEPMGDNFLH> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<DEEPMGDNFLH> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.DEEPMGDNFLHOuterClass.DEEPMGDNFLH getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_DEEPMGDNFLH_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_DEEPMGDNFLH_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021DEEPMGDNFLH.proto\"\213\001\n\013DEEPMGDNFLH\022\023\n\013J"
                    + "NEKCJANDGG\030\004 \001(\002\022\023\n\013JPLABPDDDAA\030\013 \001(\002\022\023\n"
                    + "\013LACELNHKONE\030\007 \001(\010\022\023\n\013EEPFLJEMMLD\030\016 \001(\r\022"
                    + "\023\n\013HNGHMNBGHLG\030\n \001(\002\022\023\n\013OEEFMKOMJBK\030\017 \001("
                    + "\rB\033\n\031emu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_DEEPMGDNFLH_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DEEPMGDNFLH_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_DEEPMGDNFLH_descriptor,
                        new java.lang.String[] {
                            "JNEKCJANDGG",
                            "JPLABPDDDAA",
                            "LACELNHKONE",
                            "EEPFLJEMMLD",
                            "HNGHMNBGHLG",
                            "OEEFMKOMJBK",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
