// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HEPFNIPELBP.proto

package emu.grasscutter.net.proto;

public final class HEPFNIPELBPOuterClass {
    private HEPFNIPELBPOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface HEPFNIPELBPOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:HEPFNIPELBP)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 OJMDKDFBOAM = 9;</code>
         *
         * @return The oJMDKDFBOAM.
         */
        int getOJMDKDFBOAM();
    }
    /** Protobuf type {@code HEPFNIPELBP} */
    public static final class HEPFNIPELBP extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:HEPFNIPELBP)
            HEPFNIPELBPOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use HEPFNIPELBP.newBuilder() to construct.
        private HEPFNIPELBP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private HEPFNIPELBP() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new HEPFNIPELBP();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private HEPFNIPELBP(
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
                        case 72:
                            {
                                oJMDKDFBOAM_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.internal_static_HEPFNIPELBP_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.HEPFNIPELBPOuterClass
                    .internal_static_HEPFNIPELBP_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP.class,
                            emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP.Builder.class);
        }

        public static final int OJMDKDFBOAM_FIELD_NUMBER = 9;
        private int oJMDKDFBOAM_;
        /**
         * <code>uint32 OJMDKDFBOAM = 9;</code>
         *
         * @return The oJMDKDFBOAM.
         */
        @java.lang.Override
        public int getOJMDKDFBOAM() {
            return oJMDKDFBOAM_;
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
            if (oJMDKDFBOAM_ != 0) {
                output.writeUInt32(9, oJMDKDFBOAM_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (oJMDKDFBOAM_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(9, oJMDKDFBOAM_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP other =
                    (emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP) obj;

            if (getOJMDKDFBOAM() != other.getOJMDKDFBOAM()) return false;
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
            hash = (37 * hash) + OJMDKDFBOAM_FIELD_NUMBER;
            hash = (53 * hash) + getOJMDKDFBOAM();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP parseFrom(
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
                emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP prototype) {
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
        /** Protobuf type {@code HEPFNIPELBP} */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:HEPFNIPELBP)
                emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBPOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.HEPFNIPELBPOuterClass
                        .internal_static_HEPFNIPELBP_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.HEPFNIPELBPOuterClass
                        .internal_static_HEPFNIPELBP_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP.class,
                                emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP.newBuilder()
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
                oJMDKDFBOAM_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.HEPFNIPELBPOuterClass
                        .internal_static_HEPFNIPELBP_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP build() {
                emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP buildPartial() {
                emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP result =
                        new emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP(this);
                result.oJMDKDFBOAM_ = oJMDKDFBOAM_;
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
                if (other instanceof emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP) {
                    return mergeFrom((emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP other) {
                if (other
                        == emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP.getDefaultInstance())
                    return this;
                if (other.getOJMDKDFBOAM() != 0) {
                    setOJMDKDFBOAM(other.getOJMDKDFBOAM());
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
                emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int oJMDKDFBOAM_;
            /**
             * <code>uint32 OJMDKDFBOAM = 9;</code>
             *
             * @return The oJMDKDFBOAM.
             */
            @java.lang.Override
            public int getOJMDKDFBOAM() {
                return oJMDKDFBOAM_;
            }
            /**
             * <code>uint32 OJMDKDFBOAM = 9;</code>
             *
             * @param value The oJMDKDFBOAM to set.
             * @return This builder for chaining.
             */
            public Builder setOJMDKDFBOAM(int value) {

                oJMDKDFBOAM_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 OJMDKDFBOAM = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearOJMDKDFBOAM() {

                oJMDKDFBOAM_ = 0;
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

            // @@protoc_insertion_point(builder_scope:HEPFNIPELBP)
        }

        // @@protoc_insertion_point(class_scope:HEPFNIPELBP)
        private static final emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP();
        }

        public static emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<HEPFNIPELBP> PARSER =
                new com.google.protobuf.AbstractParser<HEPFNIPELBP>() {
                    @java.lang.Override
                    public HEPFNIPELBP parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new HEPFNIPELBP(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<HEPFNIPELBP> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<HEPFNIPELBP> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.HEPFNIPELBPOuterClass.HEPFNIPELBP getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HEPFNIPELBP_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HEPFNIPELBP_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021HEPFNIPELBP.proto\"\"\n\013HEPFNIPELBP\022\023\n\013OJ"
                    + "MDKDFBOAM\030\t \001(\rB\033\n\031emu.grasscutter.net.p"
                    + "rotob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_HEPFNIPELBP_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HEPFNIPELBP_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_HEPFNIPELBP_descriptor,
                        new java.lang.String[] {
                            "OJMDKDFBOAM",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
