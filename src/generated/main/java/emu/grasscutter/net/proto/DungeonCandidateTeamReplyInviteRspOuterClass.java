// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonCandidateTeamReplyInviteRsp.proto

package emu.grasscutter.net.proto;

public final class DungeonCandidateTeamReplyInviteRspOuterClass {
  private DungeonCandidateTeamReplyInviteRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonCandidateTeamReplyInviteRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonCandidateTeamReplyInviteRsp)
      com.google.protobuf.MessageOrBuilder {

  � /**
     * <code>uint32 dungeon_id = 14;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>bool is_trans_point = 2;</code>
     * @return The isTransPoint.
     */
    boolean getIsTransPoint();

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 3761
   * Obf: KABOLDJAOOI
   * </pre>
   *
   * Protobuf type {@code DungeonCandidateTeamReplyInviteRsp}
   */
  public static final class DungeonCandidateTeamReplyInviteRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonCandidateTeamReplyInviteRsp)
      DungeonCandidateTeamReplyInviteRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonCandidateTeamReplyInviteRsp.newBuilder() to construct.
    private DungeonCandidateTeamReplyInviteRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonCandidateTeamReplyInviteRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonCandidateTeamReplyInviteRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonCandidateTeamReplyInviteRsp(
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
            case 16: {

              isTransPoint_ = input.readBool();
              break;
            }
            case 24: {

              retcode_ = input.readInt32();
              break;
            }
            case 112: {

              dungeonId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.internal_static_DungeonCandidateTeamReplyInviteRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.internal_static_DungeonCandidateTeamReplyInviteRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp.class, emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 14;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 14;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int IS_TRANS_POINT_FIELD_NUMBER = 2;
    private boolean isTransPoint_;
    /**
     * <code>bool is_trans_point = 2;</code>
     * @return The isTransPoint.
     */
    @java.lang.Override
    public boolean getIsTransPoint() {
      return isTransPoint_;
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      retur� retcode_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (isTransPoint_ != false) {
        output.writeBool(2, isTransPoint_);
      }
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
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
      if (isTransPoint_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isTransPoint_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      if (dungeonId_ != 0) {
        size += c�m.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, dungeonId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp other = (emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getIsTransPoint()
          != other.getIsTransPoint()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + IS_TRANS_POINT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTransPoint());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRsp�uterClass.DungeonCandidateTeamReplyInviteRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSE�.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp parseDelimitedFrom(
        java.io.InputStream input,
   8    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
 �  public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 3761
     * Obf: KABOLDJAOOI
     * </pre>
     *
     * Protobuf type {@code DungeonCandidateTeamReplyInviteRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonCandidateTeamReplyInviteRsp)
        emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.internal_static_DungeonCandidateTeam�eplyInviteRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.internal_static_DungeonCandidateTeamReplyInviteRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp.class, emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        dungeonId_ = 0;

        isTransPoint_ = false;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.internal_static_DungeonCandidateTeamReplyInviteRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp build() {
        emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp buildPartial() {
        emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp result = new emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp(this);
        result.dungeonId_ = dungeonId_;
        result.isTransPoint_ = isTransPoint_;
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp) {
          return mergeFrom((emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp other) {
        if (other == emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp.getDefaultInstance()) return this;
    z   if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getIsTransPoint() != false) {
          setIsTransPoint(other.getIsTransPoint());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 14;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 14;</code>
       * @para� value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private boolean isTransPoint_ ;
      /**
       * <code>bool is_trans_point = 2;</code>
       * @return The isTransPoint.
       */
      @java.lang.Override
      public boolean getIsTransPoint() {
        return isTransPoint_;
      }
      /**
       * <code>bool is_trans_point = 2;</code>
       * @param value The isTransPoint to set.
       * @return This builder for chaining.
       */
      public Builder setIsTransPoint(boolean value) {
        
        isTransPoint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_trans_point = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTransPoint() {
        
        isTransPoint_ = false;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonCandidateTeamReplyInviteRsp)
    }

    // @@protoc_insertion_point(class_scope:DungeonCandidateTeamReplyInviteRsp)
    private static final emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp();
    }

    public static emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp getDefaultInstance() {
      return DEOAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonCandidateTeamReplyInviteRsp>
        PARSER = new com.google.protobuf.AbstractParser<DungeonCandidateTeamReplyInviteRsp>() {
      @java.lang.Override
      public DungeonCandidateTeamReplyInviteRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws�com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonCandidateTeamReplyInviteRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DungeonCandidateTeamReplyInviteRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonCandidateTeamReplyInviteRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonCandidateTeamReplyInviteRspOuterClass.DungeonCandidateTeamReplyInviteRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonCandidateTeamReplyInviteRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldATcessorTable
      internal_static_DungeonCandidateTeamReplyInviteRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(DungeonCandidateTeamReplyInviteRsp.pro" +
      "to\"a\n\"DungeonCandidateTeamReplyInviteRsp" +
      "\022\022\n\ndungeon_id\030\016 \001(\r\022\026\n\016is_trans_point\030\002" +
      " \001(\010\022\017\n\007retcode\030\003 \001(\005B\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonCandidateTeamReplyInviteRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonCandidateTeamReplyInviteRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonCandidateTeamReplyInviteRsp_descriptor,
        new java.lang.String[] { "DungeonId", "IsTransPoint", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
