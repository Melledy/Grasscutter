// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MDENGHHCBCE.proto

package emu.grasscutter.net.proto;

public final class MDENGHHCBCEOuterClass {
    private MDENGHHCBCEOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface MDENGHHCBCEOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:MDENGHHCBCE)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.Vector target_pos = 8;</code>
         *
         * @return Whether the targetPos field is set.
         */
        boolean hasTargetPos();
        /**
         * <code>.Vector target_pos = 8;</code>
         *
         * @return The targetPos.
         */
        emu.grasscutter.net.proto.VectorOuterClass.Vector getTargetPos();
        /** <code>.Vector target_pos = 8;</code> */
        emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getTargetPosOrBuilder();

        /**
         * <code>.Vector CFCFIMJNNHA = 5;</code>
         *
         * @return Whether the cFCFIMJNNHA field is set.
         */
        boolean hasCFCFIMJNNHA();
        /**
         * <code>.Vector CFCFIMJNNHA = 5;</code>
         *
         * @return The cFCFIMJNNHA.
         */
        emu.grasscutter.net.proto.VectorOuterClass.Vector getCFCFIMJNNHA();
        /** <code>.Vector CFCFIMJNNHA = 5;</code> */
        emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCFCFIMJNNHAOrBuilder();
    }
    /** Protobuf type {@code MDENGHHCBCE} */
    public static final class MDENGHHCBCE extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:MDENGHHCBCE)
            MDENGHHCBCEOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use MDENGHHCBCE.newBuilder() to construct.
        private MDENGHHCBCE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private MDENGHHCBCE() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new MDENGHHCBCE();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private MDENGHHCBCE(
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
                        case 42:
                            {
                                emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
                                if (cFCFIMJNNHA_ != null) {
                                    subBuilder = cFCFIMJNNHA_.toBuilder();
                                }
                                cFCFIMJNNHA_ =
                                        input.readMessage(
                                                emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(),
                                                extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(cFCFIMJNNHA_);
                                    cFCFIMJNNHA_ = subBuilder.buildPartial();
                                }

                                break;
                            }
                        case 66:
                            {
                                emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
                                if (targetPos_ != null) {
                                    subBuilder = targetPos_.toBuilder();
                                }
                                targetPos_ =
                                        input.readMessage(
                                                emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(),
                                                extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(targetPos_);
                                    targetPos_ = subBuilder.buildPartial();
                                }

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
            return emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.internal_static_MDENGHHCBCE_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.MDENGHHCBCEOuterClass
                    .internal_static_MDENGHHCBCE_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE.class,
                            emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE.Builder.class);
        }

        public static final int TARGET_POS_FIELD_NUMBER = 8;
        private emu.grasscutter.net.proto.VectorOuterClass.Vector targetPos_;
        /**
         * <code>.Vector target_pos = 8;</code>
         *
         * @return Whether the targetPos field is set.
         */
        @java.lang.Override
        public boolean hasTargetPos() {
            return targetPos_ != null;
        }
        /**
         * <code>.Vector target_pos = 8;</code>
         *
         * @return The targetPos.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.VectorOuterClass.Vector getTargetPos() {
            return targetPos_ == null
                    ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                    : targetPos_;
        }
        /** <code>.Vector target_pos = 8;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getTargetPosOrBuilder() {
            return getTargetPos();
        }

        public static final int CFCFIMJNNHA_FIELD_NUMBER = 5;
        private emu.grasscutter.net.proto.VectorOuterClass.Vector cFCFIMJNNHA_;
        /**
         * <code>.Vector CFCFIMJNNHA = 5;</code>
         *
         * @return Whether the cFCFIMJNNHA field is set.
         */
        @java.lang.Override
        public boolean hasCFCFIMJNNHA() {
            return cFCFIMJNNHA_ != null;
        }
        /**
         * <code>.Vector CFCFIMJNNHA = 5;</code>
         *
         * @return The cFCFIMJNNHA.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.VectorOuterClass.Vector getCFCFIMJNNHA() {
            return cFCFIMJNNHA_ == null
                    ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                    : cFCFIMJNNHA_;
        }
        /** <code>.Vector CFCFIMJNNHA = 5;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCFCFIMJNNHAOrBuilder() {
            return getCFCFIMJNNHA();
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
            if (cFCFIMJNNHA_ != null) {
                output.writeMessage(5, getCFCFIMJNNHA());
            }
            if (targetPos_ != null) {
                output.writeMessage(8, getTargetPos());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (cFCFIMJNNHA_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getCFCFIMJNNHA());
            }
            if (targetPos_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(8, getTargetPos());
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
            if (!(obj instanceof emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE other =
                    (emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE) obj;

            if (hasTargetPos() != other.hasTargetPos()) return false;
            if (hasTargetPos()) {
                if (!getTargetPos().equals(other.getTargetPos())) return false;
            }
            if (hasCFCFIMJNNHA() != other.hasCFCFIMJNNHA()) return false;
            if (hasCFCFIMJNNHA()) {
                if (!getCFCFIMJNNHA().equals(other.getCFCFIMJNNHA())) return false;
            }
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
            if (hasTargetPos()) {
                hash = (37 * hash) + TARGET_POS_FIELD_NUMBER;
                hash = (53 * hash) + getTargetPos().hashCode();
            }
            if (hasCFCFIMJNNHA()) {
                hash = (37 * hash) + CFCFIMJNNHA_FIELD_NUMBER;
                hash = (53 * hash) + getCFCFIMJNNHA().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE parseFrom(
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
                emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE prototype) {
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
        /** Protobuf type {@code MDENGHHCBCE} */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:MDENGHHCBCE)
                emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCEOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.MDENGHHCBCEOuterClass
                        .internal_static_MDENGHHCBCE_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.MDENGHHCBCEOuterClass
                        .internal_static_MDENGHHCBCE_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE.class,
                                emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE.newBuilder()
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
                if (targetPosBuilder_ == null) {
                    targetPos_ = null;
                } else {
                    targetPos_ = null;
                    targetPosBuilder_ = null;
                }
                if (cFCFIMJNNHABuilder_ == null) {
                    cFCFIMJNNHA_ = null;
                } else {
                    cFCFIMJNNHA_ = null;
                    cFCFIMJNNHABuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.MDENGHHCBCEOuterClass
                        .internal_static_MDENGHHCBCE_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE build() {
                emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE buildPartial() {
                emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE result =
                        new emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE(this);
                if (targetPosBuilder_ == null) {
                    result.targetPos_ = targetPos_;
                } else {
                    result.targetPos_ = targetPosBuilder_.build();
                }
                if (cFCFIMJNNHABuilder_ == null) {
                    result.cFCFIMJNNHA_ = cFCFIMJNNHA_;
                } else {
                    result.cFCFIMJNNHA_ = cFCFIMJNNHABuilder_.build();
                }
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
                if (other instanceof emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE) {
                    return mergeFrom((emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE other) {
                if (other
                        == emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE.getDefaultInstance())
                    return this;
                if (other.hasTargetPos()) {
                    mergeTargetPos(other.getTargetPos());
                }
                if (other.hasCFCFIMJNNHA()) {
                    mergeCFCFIMJNNHA(other.getCFCFIMJNNHA());
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
                emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private emu.grasscutter.net.proto.VectorOuterClass.Vector targetPos_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.VectorOuterClass.Vector,
                            emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder,
                            emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>
                    targetPosBuilder_;
            /**
             * <code>.Vector target_pos = 8;</code>
             *
             * @return Whether the targetPos field is set.
             */
            public boolean hasTargetPos() {
                return targetPosBuilder_ != null || targetPos_ != null;
            }
            /**
             * <code>.Vector target_pos = 8;</code>
             *
             * @return The targetPos.
             */
            public emu.grasscutter.net.proto.VectorOuterClass.Vector getTargetPos() {
                if (targetPosBuilder_ == null) {
                    return targetPos_ == null
                            ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                            : targetPos_;
                } else {
                    return targetPosBuilder_.getMessage();
                }
            }
            /** <code>.Vector target_pos = 8;</code> */
            public Builder setTargetPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
                if (targetPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    targetPos_ = value;
                    onChanged();
                } else {
                    targetPosBuilder_.setMessage(value);
                }

                return this;
            }
            /** <code>.Vector target_pos = 8;</code> */
            public Builder setTargetPos(
                    emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
                if (targetPosBuilder_ == null) {
                    targetPos_ = builderForValue.build();
                    onChanged();
                } else {
                    targetPosBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /** <code>.Vector target_pos = 8;</code> */
            public Builder mergeTargetPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
                if (targetPosBuilder_ == null) {
                    if (targetPos_ != null) {
                        targetPos_ =
                                emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(targetPos_)
                                        .mergeFrom(value)
                                        .buildPartial();
                    } else {
                        targetPos_ = value;
                    }
                    onChanged();
                } else {
                    targetPosBuilder_.mergeFrom(value);
                }

                return this;
            }
            /** <code>.Vector target_pos = 8;</code> */
            public Builder clearTargetPos() {
                if (targetPosBuilder_ == null) {
                    targetPos_ = null;
                    onChanged();
                } else {
                    targetPos_ = null;
                    targetPosBuilder_ = null;
                }

                return this;
            }
            /** <code>.Vector target_pos = 8;</code> */
            public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getTargetPosBuilder() {

                onChanged();
                return getTargetPosFieldBuilder().getBuilder();
            }
            /** <code>.Vector target_pos = 8;</code> */
            public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getTargetPosOrBuilder() {
                if (targetPosBuilder_ != null) {
                    return targetPosBuilder_.getMessageOrBuilder();
                } else {
                    return targetPos_ == null
                            ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                            : targetPos_;
                }
            }
            /** <code>.Vector target_pos = 8;</code> */
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.VectorOuterClass.Vector,
                            emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder,
                            emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>
                    getTargetPosFieldBuilder() {
                if (targetPosBuilder_ == null) {
                    targetPosBuilder_ =
                            new com.google.protobuf.SingleFieldBuilderV3<
                                    emu.grasscutter.net.proto.VectorOuterClass.Vector,
                                    emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder,
                                    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                                    getTargetPos(), getParentForChildren(), isClean());
                    targetPos_ = null;
                }
                return targetPosBuilder_;
            }

            private emu.grasscutter.net.proto.VectorOuterClass.Vector cFCFIMJNNHA_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.VectorOuterClass.Vector,
                            emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder,
                            emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>
                    cFCFIMJNNHABuilder_;
            /**
             * <code>.Vector CFCFIMJNNHA = 5;</code>
             *
             * @return Whether the cFCFIMJNNHA field is set.
             */
            public boolean hasCFCFIMJNNHA() {
                return cFCFIMJNNHABuilder_ != null || cFCFIMJNNHA_ != null;
            }
            /**
             * <code>.Vector CFCFIMJNNHA = 5;</code>
             *
             * @return The cFCFIMJNNHA.
             */
            public emu.grasscutter.net.proto.VectorOuterClass.Vector getCFCFIMJNNHA() {
                if (cFCFIMJNNHABuilder_ == null) {
                    return cFCFIMJNNHA_ == null
                            ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                            : cFCFIMJNNHA_;
                } else {
                    return cFCFIMJNNHABuilder_.getMessage();
                }
            }
            /** <code>.Vector CFCFIMJNNHA = 5;</code> */
            public Builder setCFCFIMJNNHA(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
                if (cFCFIMJNNHABuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    cFCFIMJNNHA_ = value;
                    onChanged();
                } else {
                    cFCFIMJNNHABuilder_.setMessage(value);
                }

                return this;
            }
            /** <code>.Vector CFCFIMJNNHA = 5;</code> */
            public Builder setCFCFIMJNNHA(
                    emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
                if (cFCFIMJNNHABuilder_ == null) {
                    cFCFIMJNNHA_ = builderForValue.build();
                    onChanged();
                } else {
                    cFCFIMJNNHABuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /** <code>.Vector CFCFIMJNNHA = 5;</code> */
            public Builder mergeCFCFIMJNNHA(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
                if (cFCFIMJNNHABuilder_ == null) {
                    if (cFCFIMJNNHA_ != null) {
                        cFCFIMJNNHA_ =
                                emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(cFCFIMJNNHA_)
                                        .mergeFrom(value)
                                        .buildPartial();
                    } else {
                        cFCFIMJNNHA_ = value;
                    }
                    onChanged();
                } else {
                    cFCFIMJNNHABuilder_.mergeFrom(value);
                }

                return this;
            }
            /** <code>.Vector CFCFIMJNNHA = 5;</code> */
            public Builder clearCFCFIMJNNHA() {
                if (cFCFIMJNNHABuilder_ == null) {
                    cFCFIMJNNHA_ = null;
                    onChanged();
                } else {
                    cFCFIMJNNHA_ = null;
                    cFCFIMJNNHABuilder_ = null;
                }

                return this;
            }
            /** <code>.Vector CFCFIMJNNHA = 5;</code> */
            public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getCFCFIMJNNHABuilder() {

                onChanged();
                return getCFCFIMJNNHAFieldBuilder().getBuilder();
            }
            /** <code>.Vector CFCFIMJNNHA = 5;</code> */
            public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCFCFIMJNNHAOrBuilder() {
                if (cFCFIMJNNHABuilder_ != null) {
                    return cFCFIMJNNHABuilder_.getMessageOrBuilder();
                } else {
                    return cFCFIMJNNHA_ == null
                            ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                            : cFCFIMJNNHA_;
                }
            }
            /** <code>.Vector CFCFIMJNNHA = 5;</code> */
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.VectorOuterClass.Vector,
                            emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder,
                            emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>
                    getCFCFIMJNNHAFieldBuilder() {
                if (cFCFIMJNNHABuilder_ == null) {
                    cFCFIMJNNHABuilder_ =
                            new com.google.protobuf.SingleFieldBuilderV3<
                                    emu.grasscutter.net.proto.VectorOuterClass.Vector,
                                    emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder,
                                    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                                    getCFCFIMJNNHA(), getParentForChildren(), isClean());
                    cFCFIMJNNHA_ = null;
                }
                return cFCFIMJNNHABuilder_;
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

            // @@protoc_insertion_point(builder_scope:MDENGHHCBCE)
        }

        // @@protoc_insertion_point(class_scope:MDENGHHCBCE)
        private static final emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE();
        }

        public static emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<MDENGHHCBCE> PARSER =
                new com.google.protobuf.AbstractParser<MDENGHHCBCE>() {
                    @java.lang.Override
                    public MDENGHHCBCE parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new MDENGHHCBCE(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<MDENGHHCBCE> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<MDENGHHCBCE> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.MDENGHHCBCEOuterClass.MDENGHHCBCE getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_MDENGHHCBCE_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_MDENGHHCBCE_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021MDENGHHCBCE.proto\032\014Vector.proto\"H\n\013MDE"
                    + "NGHHCBCE\022\033\n\ntarget_pos\030\010 \001(\0132\007.Vector\022\034\n"
                    + "\013CFCFIMJNNHA\030\005 \001(\0132\007.VectorB\033\n\031emu.grass"
                    + "cutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
                        });
        internal_static_MDENGHHCBCE_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MDENGHHCBCE_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_MDENGHHCBCE_descriptor,
                        new java.lang.String[] {
                            "TargetPos", "CFCFIMJNNHA",
                        });
        emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
