// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PHKJPHNBGHA.proto

package emu.grasscutter.net.proto;

public final class PHKJPHNBGHAOuterClass {
    private PHKJPHNBGHAOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface PHKJPHNBGHAOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:PHKJPHNBGHA)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 IOBANMKNFLE = 6;</code>
         *
         * @return The iOBANMKNFLE.
         */
        int getIOBANMKNFLE();

        /**
         * <code>repeated string MKDKIADHIKO = 10;</code>
         *
         * @return A list containing the mKDKIADHIKO.
         */
        java.util.List<java.lang.String> getMKDKIADHIKOList();
        /**
         * <code>repeated string MKDKIADHIKO = 10;</code>
         *
         * @return The count of mKDKIADHIKO.
         */
        int getMKDKIADHIKOCount();
        /**
         * <code>repeated string MKDKIADHIKO = 10;</code>
         *
         * @param index The index of the element to return.
         * @return The mKDKIADHIKO at the given index.
         */
        java.lang.String getMKDKIADHIKO(int index);
        /**
         * <code>repeated string MKDKIADHIKO = 10;</code>
         *
         * @param index The index of the value to return.
         * @return The bytes of the mKDKIADHIKO at the given index.
         */
        com.google.protobuf.ByteString getMKDKIADHIKOBytes(int index);

        /**
         * <code>uint32 AENJBCJGHLD = 14;</code>
         *
         * @return The aENJBCJGHLD.
         */
        int getAENJBCJGHLD();
    }
    /** Protobuf type {@code PHKJPHNBGHA} */
    public static final class PHKJPHNBGHA extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:PHKJPHNBGHA)
            PHKJPHNBGHAOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use PHKJPHNBGHA.newBuilder() to construct.
        private PHKJPHNBGHA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private PHKJPHNBGHA() {
            mKDKIADHIKO_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new PHKJPHNBGHA();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private PHKJPHNBGHA(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
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
                        case 48:
                            {
                                iOBANMKNFLE_ = input.readUInt32();
                                break;
                            }
                        case 82:
                            {
                                java.lang.String s = input.readStringRequireUtf8();
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    mKDKIADHIKO_ = new com.google.protobuf.LazyStringArrayList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                mKDKIADHIKO_.add(s);
                                break;
                            }
                        case 112:
                            {
                                aENJBCJGHLD_ = input.readUInt32();
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
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    mKDKIADHIKO_ = mKDKIADHIKO_.getUnmodifiableView();
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.internal_static_PHKJPHNBGHA_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass
                    .internal_static_PHKJPHNBGHA_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.class,
                            emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.Builder.class);
        }

        public static final int IOBANMKNFLE_FIELD_NUMBER = 6;
        private int iOBANMKNFLE_;
        /**
         * <code>uint32 IOBANMKNFLE = 6;</code>
         *
         * @return The iOBANMKNFLE.
         */
        @java.lang.Override
        public int getIOBANMKNFLE() {
            return iOBANMKNFLE_;
        }

        public static final int MKDKIADHIKO_FIELD_NUMBER = 10;
        private com.google.protobuf.LazyStringList mKDKIADHIKO_;
        /**
         * <code>repeated string MKDKIADHIKO = 10;</code>
         *
         * @return A list containing the mKDKIADHIKO.
         */
        public com.google.protobuf.ProtocolStringList getMKDKIADHIKOList() {
            return mKDKIADHIKO_;
        }
        /**
         * <code>repeated string MKDKIADHIKO = 10;</code>
         *
         * @return The count of mKDKIADHIKO.
         */
        public int getMKDKIADHIKOCount() {
            return mKDKIADHIKO_.size();
        }
        /**
         * <code>repeated string MKDKIADHIKO = 10;</code>
         *
         * @param index The index of the element to return.
         * @return The mKDKIADHIKO at the given index.
         */
        public java.lang.String getMKDKIADHIKO(int index) {
            return mKDKIADHIKO_.get(index);
        }
        /**
         * <code>repeated string MKDKIADHIKO = 10;</code>
         *
         * @param index The index of the value to return.
         * @return The bytes of the mKDKIADHIKO at the given index.
         */
        public com.google.protobuf.ByteString getMKDKIADHIKOBytes(int index) {
            return mKDKIADHIKO_.getByteString(index);
        }

        public static final int AENJBCJGHLD_FIELD_NUMBER = 14;
        private int aENJBCJGHLD_;
        /**
         * <code>uint32 AENJBCJGHLD = 14;</code>
         *
         * @return The aENJBCJGHLD.
         */
        @java.lang.Override
        public int getAENJBCJGHLD() {
            return aENJBCJGHLD_;
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
            if (iOBANMKNFLE_ != 0) {
                output.writeUInt32(6, iOBANMKNFLE_);
            }
            for (int i = 0; i < mKDKIADHIKO_.size(); i++) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 10, mKDKIADHIKO_.getRaw(i));
            }
            if (aENJBCJGHLD_ != 0) {
                output.writeUInt32(14, aENJBCJGHLD_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (iOBANMKNFLE_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(6, iOBANMKNFLE_);
            }
            {
                int dataSize = 0;
                for (int i = 0; i < mKDKIADHIKO_.size(); i++) {
                    dataSize += computeStringSizeNoTag(mKDKIADHIKO_.getRaw(i));
                }
                size += dataSize;
                size += 1 * getMKDKIADHIKOList().size();
            }
            if (aENJBCJGHLD_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(14, aENJBCJGHLD_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA other =
                    (emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA) obj;

            if (getIOBANMKNFLE() != other.getIOBANMKNFLE()) return false;
            if (!getMKDKIADHIKOList().equals(other.getMKDKIADHIKOList())) return false;
            if (getAENJBCJGHLD() != other.getAENJBCJGHLD()) return false;
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
            hash = (37 * hash) + IOBANMKNFLE_FIELD_NUMBER;
            hash = (53 * hash) + getIOBANMKNFLE();
            if (getMKDKIADHIKOCount() > 0) {
                hash = (37 * hash) + MKDKIADHIKO_FIELD_NUMBER;
                hash = (53 * hash) + getMKDKIADHIKOList().hashCode();
            }
            hash = (37 * hash) + AENJBCJGHLD_FIELD_NUMBER;
            hash = (53 * hash) + getAENJBCJGHLD();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA parseFrom(
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
                emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA prototype) {
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
        /** Protobuf type {@code PHKJPHNBGHA} */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:PHKJPHNBGHA)
                emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHAOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass
                        .internal_static_PHKJPHNBGHA_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass
                        .internal_static_PHKJPHNBGHA_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.class,
                                emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.newBuilder()
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
                iOBANMKNFLE_ = 0;

                mKDKIADHIKO_ = com.google.protobuf.LazyStringArrayList.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000001);
                aENJBCJGHLD_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass
                        .internal_static_PHKJPHNBGHA_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA build() {
                emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA buildPartial() {
                emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA result =
                        new emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA(this);
                int from_bitField0_ = bitField0_;
                result.iOBANMKNFLE_ = iOBANMKNFLE_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    mKDKIADHIKO_ = mKDKIADHIKO_.getUnmodifiableView();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.mKDKIADHIKO_ = mKDKIADHIKO_;
                result.aENJBCJGHLD_ = aENJBCJGHLD_;
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
                if (other instanceof emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA) {
                    return mergeFrom((emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA other) {
                if (other
                        == emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.getDefaultInstance())
                    return this;
                if (other.getIOBANMKNFLE() != 0) {
                    setIOBANMKNFLE(other.getIOBANMKNFLE());
                }
                if (!other.mKDKIADHIKO_.isEmpty()) {
                    if (mKDKIADHIKO_.isEmpty()) {
                        mKDKIADHIKO_ = other.mKDKIADHIKO_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureMKDKIADHIKOIsMutable();
                        mKDKIADHIKO_.addAll(other.mKDKIADHIKO_);
                    }
                    onChanged();
                }
                if (other.getAENJBCJGHLD() != 0) {
                    setAENJBCJGHLD(other.getAENJBCJGHLD());
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
                emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private int iOBANMKNFLE_;
            /**
             * <code>uint32 IOBANMKNFLE = 6;</code>
             *
             * @return The iOBANMKNFLE.
             */
            @java.lang.Override
            public int getIOBANMKNFLE() {
                return iOBANMKNFLE_;
            }
            /**
             * <code>uint32 IOBANMKNFLE = 6;</code>
             *
             * @param value The iOBANMKNFLE to set.
             * @return This builder for chaining.
             */
            public Builder setIOBANMKNFLE(int value) {

                iOBANMKNFLE_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 IOBANMKNFLE = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIOBANMKNFLE() {

                iOBANMKNFLE_ = 0;
                onChanged();
                return this;
            }

            private com.google.protobuf.LazyStringList mKDKIADHIKO_ =
                    com.google.protobuf.LazyStringArrayList.EMPTY;

            private void ensureMKDKIADHIKOIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    mKDKIADHIKO_ = new com.google.protobuf.LazyStringArrayList(mKDKIADHIKO_);
                    bitField0_ |= 0x00000001;
                }
            }
            /**
             * <code>repeated string MKDKIADHIKO = 10;</code>
             *
             * @return A list containing the mKDKIADHIKO.
             */
            public com.google.protobuf.ProtocolStringList getMKDKIADHIKOList() {
                return mKDKIADHIKO_.getUnmodifiableView();
            }
            /**
             * <code>repeated string MKDKIADHIKO = 10;</code>
             *
             * @return The count of mKDKIADHIKO.
             */
            public int getMKDKIADHIKOCount() {
                return mKDKIADHIKO_.size();
            }
            /**
             * <code>repeated string MKDKIADHIKO = 10;</code>
             *
             * @param index The index of the element to return.
             * @return The mKDKIADHIKO at the given index.
             */
            public java.lang.String getMKDKIADHIKO(int index) {
                return mKDKIADHIKO_.get(index);
            }
            /**
             * <code>repeated string MKDKIADHIKO = 10;</code>
             *
             * @param index The index of the value to return.
             * @return The bytes of the mKDKIADHIKO at the given index.
             */
            public com.google.protobuf.ByteString getMKDKIADHIKOBytes(int index) {
                return mKDKIADHIKO_.getByteString(index);
            }
            /**
             * <code>repeated string MKDKIADHIKO = 10;</code>
             *
             * @param index The index to set the value at.
             * @param value The mKDKIADHIKO to set.
             * @return This builder for chaining.
             */
            public Builder setMKDKIADHIKO(int index, java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureMKDKIADHIKOIsMutable();
                mKDKIADHIKO_.set(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated string MKDKIADHIKO = 10;</code>
             *
             * @param value The mKDKIADHIKO to add.
             * @return This builder for chaining.
             */
            public Builder addMKDKIADHIKO(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureMKDKIADHIKOIsMutable();
                mKDKIADHIKO_.add(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated string MKDKIADHIKO = 10;</code>
             *
             * @param values The mKDKIADHIKO to add.
             * @return This builder for chaining.
             */
            public Builder addAllMKDKIADHIKO(java.lang.Iterable<java.lang.String> values) {
                ensureMKDKIADHIKOIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, mKDKIADHIKO_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated string MKDKIADHIKO = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMKDKIADHIKO() {
                mKDKIADHIKO_ = com.google.protobuf.LazyStringArrayList.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }
            /**
             * <code>repeated string MKDKIADHIKO = 10;</code>
             *
             * @param value The bytes of the mKDKIADHIKO to add.
             * @return This builder for chaining.
             */
            public Builder addMKDKIADHIKOBytes(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);
                ensureMKDKIADHIKOIsMutable();
                mKDKIADHIKO_.add(value);
                onChanged();
                return this;
            }

            private int aENJBCJGHLD_;
            /**
             * <code>uint32 AENJBCJGHLD = 14;</code>
             *
             * @return The aENJBCJGHLD.
             */
            @java.lang.Override
            public int getAENJBCJGHLD() {
                return aENJBCJGHLD_;
            }
            /**
             * <code>uint32 AENJBCJGHLD = 14;</code>
             *
             * @param value The aENJBCJGHLD to set.
             * @return This builder for chaining.
             */
            public Builder setAENJBCJGHLD(int value) {

                aENJBCJGHLD_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 AENJBCJGHLD = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAENJBCJGHLD() {

                aENJBCJGHLD_ = 0;
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

            // @@protoc_insertion_point(builder_scope:PHKJPHNBGHA)
        }

        // @@protoc_insertion_point(class_scope:PHKJPHNBGHA)
        private static final emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA();
        }

        public static emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<PHKJPHNBGHA> PARSER =
                new com.google.protobuf.AbstractParser<PHKJPHNBGHA>() {
                    @java.lang.Override
                    public PHKJPHNBGHA parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new PHKJPHNBGHA(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<PHKJPHNBGHA> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<PHKJPHNBGHA> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_PHKJPHNBGHA_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_PHKJPHNBGHA_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021PHKJPHNBGHA.proto\"L\n\013PHKJPHNBGHA\022\023\n\013IO"
                    + "BANMKNFLE\030\006 \001(\r\022\023\n\013MKDKIADHIKO\030\n \003(\t\022\023\n\013"
                    + "AENJBCJGHLD\030\016 \001(\rB\033\n\031emu.grasscutter.net"
                    + ".protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_PHKJPHNBGHA_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PHKJPHNBGHA_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_PHKJPHNBGHA_descriptor,
                        new java.lang.String[] {
                            "IOBANMKNFLE", "MKDKIADHIKO", "AENJBCJGHLD",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
