// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IKCGHEKPMHI.proto

package emu.grasscutter.net.proto;

public final class IKCGHEKPMHIOuterClass {
    private IKCGHEKPMHIOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface IKCGHEKPMHIOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:IKCGHEKPMHI)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 dungeon_id = 5;</code>
         *
         * @return The dungeonId.
         */
        int getDungeonId();

        /**
         * <code>bool GEFPKPGFGIG = 10;</code>
         *
         * @return The gEFPKPGFGIG.
         */
        boolean getGEFPKPGFGIG();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 22622
     * </pre>
     *
     * Protobuf type {@code IKCGHEKPMHI}
     */
    public static final class IKCGHEKPMHI extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:IKCGHEKPMHI)
            IKCGHEKPMHIOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use IKCGHEKPMHI.newBuilder() to construct.
        private IKCGHEKPMHI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private IKCGHEKPMHI() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new IKCGHEKPMHI();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private IKCGHEKPMHI(
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
                        case 40:
                            {
                                dungeonId_ = input.readUInt32();
                                break;
                            }
                        case 80:
                            {
                                gEFPKPGFGIG_ = input.readBool();
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
            return emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.internal_static_IKCGHEKPMHI_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass
                    .internal_static_IKCGHEKPMHI_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI.class,
                            emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI.Builder.class);
        }

        public static final int DUNGEON_ID_FIELD_NUMBER = 5;
        private int dungeonId_;
        /**
         * <code>uint32 dungeon_id = 5;</code>
         *
         * @return The dungeonId.
         */
        @java.lang.Override
        public int getDungeonId() {
            return dungeonId_;
        }

        public static final int GEFPKPGFGIG_FIELD_NUMBER = 10;
        private boolean gEFPKPGFGIG_;
        /**
         * <code>bool GEFPKPGFGIG = 10;</code>
         *
         * @return The gEFPKPGFGIG.
         */
        @java.lang.Override
        public boolean getGEFPKPGFGIG() {
            return gEFPKPGFGIG_;
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
            if (dungeonId_ != 0) {
                output.writeUInt32(5, dungeonId_);
            }
            if (gEFPKPGFGIG_ != false) {
                output.writeBool(10, gEFPKPGFGIG_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (dungeonId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(5, dungeonId_);
            }
            if (gEFPKPGFGIG_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(10, gEFPKPGFGIG_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI other =
                    (emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI) obj;

            if (getDungeonId() != other.getDungeonId()) return false;
            if (getGEFPKPGFGIG() != other.getGEFPKPGFGIG()) return false;
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
            hash = (37 * hash) + GEFPKPGFGIG_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getGEFPKPGFGIG());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI parseFrom(
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
                emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI prototype) {
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
         * CmdId: 22622
         * </pre>
         *
         * Protobuf type {@code IKCGHEKPMHI}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:IKCGHEKPMHI)
                emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHIOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass
                        .internal_static_IKCGHEKPMHI_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass
                        .internal_static_IKCGHEKPMHI_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI.class,
                                emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI.newBuilder()
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

                gEFPKPGFGIG_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass
                        .internal_static_IKCGHEKPMHI_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI build() {
                emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI buildPartial() {
                emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI result =
                        new emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI(this);
                result.dungeonId_ = dungeonId_;
                result.gEFPKPGFGIG_ = gEFPKPGFGIG_;
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
                if (other instanceof emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI) {
                    return mergeFrom((emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI other) {
                if (other
                        == emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI.getDefaultInstance())
                    return this;
                if (other.getDungeonId() != 0) {
                    setDungeonId(other.getDungeonId());
                }
                if (other.getGEFPKPGFGIG() != false) {
                    setGEFPKPGFGIG(other.getGEFPKPGFGIG());
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
                emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI)
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
             * <code>uint32 dungeon_id = 5;</code>
             *
             * @return The dungeonId.
             */
            @java.lang.Override
            public int getDungeonId() {
                return dungeonId_;
            }
            /**
             * <code>uint32 dungeon_id = 5;</code>
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
             * <code>uint32 dungeon_id = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearDungeonId() {

                dungeonId_ = 0;
                onChanged();
                return this;
            }

            private boolean gEFPKPGFGIG_;
            /**
             * <code>bool GEFPKPGFGIG = 10;</code>
             *
             * @return The gEFPKPGFGIG.
             */
            @java.lang.Override
            public boolean getGEFPKPGFGIG() {
                return gEFPKPGFGIG_;
            }
            /**
             * <code>bool GEFPKPGFGIG = 10;</code>
             *
             * @param value The gEFPKPGFGIG to set.
             * @return This builder for chaining.
             */
            public Builder setGEFPKPGFGIG(boolean value) {

                gEFPKPGFGIG_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool GEFPKPGFGIG = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGEFPKPGFGIG() {

                gEFPKPGFGIG_ = false;
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

            // @@protoc_insertion_point(builder_scope:IKCGHEKPMHI)
        }

        // @@protoc_insertion_point(class_scope:IKCGHEKPMHI)
        private static final emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI();
        }

        public static emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<IKCGHEKPMHI> PARSER =
                new com.google.protobuf.AbstractParser<IKCGHEKPMHI>() {
                    @java.lang.Override
                    public IKCGHEKPMHI parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new IKCGHEKPMHI(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<IKCGHEKPMHI> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<IKCGHEKPMHI> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.IKCGHEKPMHIOuterClass.IKCGHEKPMHI getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_IKCGHEKPMHI_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_IKCGHEKPMHI_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021IKCGHEKPMHI.proto\"6\n\013IKCGHEKPMHI\022\022\n\ndu"
                    + "ngeon_id\030\005 \001(\r\022\023\n\013GEFPKPGFGIG\030\n \001(\010B\033\n\031e"
                    + "mu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_IKCGHEKPMHI_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_IKCGHEKPMHI_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_IKCGHEKPMHI_descriptor,
                        new java.lang.String[] {
                            "DungeonId", "GEFPKPGFGIG",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
