// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LBBNONAEBGL.proto

package emu.grasscutter.net.proto;

public final class LBBNONAEBGLOuterClass {
    private LBBNONAEBGLOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface LBBNONAEBGLOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:LBBNONAEBGL)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 JBMGPDFNGDN = 8;</code>
         *
         * @return The jBMGPDFNGDN.
         */
        int getJBMGPDFNGDN();

        /**
         * <code>uint64 CGADJLAJMHE = 7;</code>
         *
         * @return The cGADJLAJMHE.
         */
        long getCGADJLAJMHE();
    }
    /** Protobuf type {@code LBBNONAEBGL} */
    public static final class LBBNONAEBGL extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:LBBNONAEBGL)
            LBBNONAEBGLOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use LBBNONAEBGL.newBuilder() to construct.
        private LBBNONAEBGL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private LBBNONAEBGL() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new LBBNONAEBGL();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private LBBNONAEBGL(
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
                        case 56:
                            {
                                cGADJLAJMHE_ = input.readUInt64();
                                break;
                            }
                        case 64:
                            {
                                jBMGPDFNGDN_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.internal_static_LBBNONAEBGL_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.LBBNONAEBGLOuterClass
                    .internal_static_LBBNONAEBGL_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL.class,
                            emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL.Builder.class);
        }

        public static final int JBMGPDFNGDN_FIELD_NUMBER = 8;
        private int jBMGPDFNGDN_;
        /**
         * <code>uint32 JBMGPDFNGDN = 8;</code>
         *
         * @return The jBMGPDFNGDN.
         */
        @java.lang.Override
        public int getJBMGPDFNGDN() {
            return jBMGPDFNGDN_;
        }

        public static final int CGADJLAJMHE_FIELD_NUMBER = 7;
        private long cGADJLAJMHE_;
        /**
         * <code>uint64 CGADJLAJMHE = 7;</code>
         *
         * @return The cGADJLAJMHE.
         */
        @java.lang.Override
        public long getCGADJLAJMHE() {
            return cGADJLAJMHE_;
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
            if (cGADJLAJMHE_ != 0L) {
                output.writeUInt64(7, cGADJLAJMHE_);
            }
            if (jBMGPDFNGDN_ != 0) {
                output.writeUInt32(8, jBMGPDFNGDN_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (cGADJLAJMHE_ != 0L) {
                size += com.google.protobuf.CodedOutputStream.computeUInt64Size(7, cGADJLAJMHE_);
            }
            if (jBMGPDFNGDN_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(8, jBMGPDFNGDN_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL other =
                    (emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL) obj;

            if (getJBMGPDFNGDN() != other.getJBMGPDFNGDN()) return false;
            if (getCGADJLAJMHE() != other.getCGADJLAJMHE()) return false;
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
            hash = (37 * hash) + JBMGPDFNGDN_FIELD_NUMBER;
            hash = (53 * hash) + getJBMGPDFNGDN();
            hash = (37 * hash) + CGADJLAJMHE_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getCGADJLAJMHE());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL parseFrom(
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
                emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL prototype) {
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
        /** Protobuf type {@code LBBNONAEBGL} */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:LBBNONAEBGL)
                emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGLOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.LBBNONAEBGLOuterClass
                        .internal_static_LBBNONAEBGL_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.LBBNONAEBGLOuterClass
                        .internal_static_LBBNONAEBGL_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL.class,
                                emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL.newBuilder()
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
                jBMGPDFNGDN_ = 0;

                cGADJLAJMHE_ = 0L;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.LBBNONAEBGLOuterClass
                        .internal_static_LBBNONAEBGL_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL build() {
                emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL buildPartial() {
                emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL result =
                        new emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL(this);
                result.jBMGPDFNGDN_ = jBMGPDFNGDN_;
                result.cGADJLAJMHE_ = cGADJLAJMHE_;
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
                if (other instanceof emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL) {
                    return mergeFrom((emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL other) {
                if (other
                        == emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL.getDefaultInstance())
                    return this;
                if (other.getJBMGPDFNGDN() != 0) {
                    setJBMGPDFNGDN(other.getJBMGPDFNGDN());
                }
                if (other.getCGADJLAJMHE() != 0L) {
                    setCGADJLAJMHE(other.getCGADJLAJMHE());
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
                emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int jBMGPDFNGDN_;
            /**
             * <code>uint32 JBMGPDFNGDN = 8;</code>
             *
             * @return The jBMGPDFNGDN.
             */
            @java.lang.Override
            public int getJBMGPDFNGDN() {
                return jBMGPDFNGDN_;
            }
            /**
             * <code>uint32 JBMGPDFNGDN = 8;</code>
             *
             * @param value The jBMGPDFNGDN to set.
             * @return This builder for chaining.
             */
            public Builder setJBMGPDFNGDN(int value) {

                jBMGPDFNGDN_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 JBMGPDFNGDN = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearJBMGPDFNGDN() {

                jBMGPDFNGDN_ = 0;
                onChanged();
                return this;
            }

            private long cGADJLAJMHE_;
            /**
             * <code>uint64 CGADJLAJMHE = 7;</code>
             *
             * @return The cGADJLAJMHE.
             */
            @java.lang.Override
            public long getCGADJLAJMHE() {
                return cGADJLAJMHE_;
            }
            /**
             * <code>uint64 CGADJLAJMHE = 7;</code>
             *
             * @param value The cGADJLAJMHE to set.
             * @return This builder for chaining.
             */
            public Builder setCGADJLAJMHE(long value) {

                cGADJLAJMHE_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint64 CGADJLAJMHE = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCGADJLAJMHE() {

                cGADJLAJMHE_ = 0L;
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

            // @@protoc_insertion_point(builder_scope:LBBNONAEBGL)
        }

        // @@protoc_insertion_point(class_scope:LBBNONAEBGL)
        private static final emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL();
        }

        public static emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<LBBNONAEBGL> PARSER =
                new com.google.protobuf.AbstractParser<LBBNONAEBGL>() {
                    @java.lang.Override
                    public LBBNONAEBGL parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new LBBNONAEBGL(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<LBBNONAEBGL> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<LBBNONAEBGL> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.LBBNONAEBGLOuterClass.LBBNONAEBGL getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_LBBNONAEBGL_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_LBBNONAEBGL_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021LBBNONAEBGL.proto\"7\n\013LBBNONAEBGL\022\023\n\013JB"
                    + "MGPDFNGDN\030\010 \001(\r\022\023\n\013CGADJLAJMHE\030\007 \001(\004B\033\n\031"
                    + "emu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_LBBNONAEBGL_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_LBBNONAEBGL_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_LBBNONAEBGL_descriptor,
                        new java.lang.String[] {
                            "JBMGPDFNGDN", "CGADJLAJMHE",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
