// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RedeemLegendaryKeyReq.proto

package emu.grasscutter.net.proto;

public final class RedeemLegendaryKeyReqOuterClass {
    private RedeemLegendaryKeyReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface RedeemLegendaryKeyReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:RedeemLegendaryKeyReq)
            com.google.protobuf.MessageOrBuilder {}
    /**
     *
     *
     * <pre>
     * CmdId: 480
     * Obf: ELJILKEDOIG
     * </pre>
     *
     * Protobuf type {@code RedeemLegendaryKeyReq}
     */
    public static final class RedeemLegendaryKeyReq extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:RedeemLegendaryKeyReq)
            RedeemLegendaryKeyReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use RedeemLegendaryKeyReq.newBuilder() to construct.
        private RedeemLegendaryKeyReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private RedeemLegendaryKeyReq() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new RedeemLegendaryKeyReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private RedeemLegendaryKeyReq(
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
            return emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass
                    .internal_static_RedeemLegendaryKeyReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass
                    .internal_static_RedeemLegendaryKeyReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq.class,
                            emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                                    .Builder.class);
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
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
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
                    emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq other =
                    (emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq) obj;

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
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
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
                emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq prototype) {
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
         * CmdId: 480
         * Obf: ELJILKEDOIG
         * </pre>
         *
         * Protobuf type {@code RedeemLegendaryKeyReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:RedeemLegendaryKeyReq)
                emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass
                        .internal_static_RedeemLegendaryKeyReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass
                        .internal_static_RedeemLegendaryKeyReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                                        .class,
                                emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq.newBuilder()
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
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass
                        .internal_static_RedeemLegendaryKeyReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                    build() {
                emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                    buildPartial() {
                emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq result =
                        new emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq(
                                this);
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
                        emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq other) {
                if (other
                        == emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                                .getDefaultInstance()) return this;
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
                emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
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

            // @@protoc_insertion_point(builder_scope:RedeemLegendaryKeyReq)
        }

        // @@protoc_insertion_point(class_scope:RedeemLegendaryKeyReq)
        private static final emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass
                        .RedeemLegendaryKeyReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq();
        }

        public static emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<RedeemLegendaryKeyReq> PARSER =
                new com.google.protobuf.AbstractParser<RedeemLegendaryKeyReq>() {
                    @java.lang.Override
                    public RedeemLegendaryKeyReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new RedeemLegendaryKeyReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<RedeemLegendaryKeyReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<RedeemLegendaryKeyReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.RedeemLegendaryKeyReqOuterClass.RedeemLegendaryKeyReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_RedeemLegendaryKeyReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_RedeemLegendaryKeyReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\033RedeemLegendaryKeyReq.proto\"\027\n\025RedeemL"
                    + "egendaryKeyReqB\033\n\031emu.grasscutter.net.pr"
                    + "otob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_RedeemLegendaryKeyReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_RedeemLegendaryKeyReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_RedeemLegendaryKeyReq_descriptor, new java.lang.String[] {});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
