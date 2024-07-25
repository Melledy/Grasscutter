// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ElectroherculesBattleSelectDifficultyRsp.proto

package emu.grasscutter.net.proto;

public final class ElectroherculesBattleSelectDifficultyRspOuterClass {
  private ElectroherculesBattleSelectDifficultyRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ElectroherculesBattleSelectDifficultyRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ElectroherculesBattleSelectDifficultyRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 diffculty = 3;</code>
     * @return The diffculty.
     */
    int getDiffculty();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 stage_id = 12;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 gallery_id = 1;</code>
     * @return The galleryId.
     */
    int getGalleryId();
  }
  /**
   * <pre>
   * CmdId: 2828
   * Obf: GOOLHDCAIKG
   * </pre>
   *
   * Protobuf type {@code ElectroherculesBattleSelectDifficultyRsp}
   */
  public static final class ElectroherculesBattleSelectDifficultyRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ElectroherculesBattleSelectDifficultyRsp)
      ElectroherculesBattleSelectDifficultyRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ElectroherculesBattleSelectDifficultyRsp.newBuilder() to construct.
    private ElectroherculesBattleSelectDifficultyRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ElectroherculesBattleSelectDifficultyRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ElectroherculesBattleSelectDifficultyRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ElectroherculesBattleSelectDifficultyRsp(
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
            case 8: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 16: {

              retcode_ = input.readInt32();
              break;
            }
            case 24: {

              diffculty_ = input.readUInt32();
              break;
            }
            case 96: {

              stageId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.internal_static_ElectroherculesBattleSelectDifficultyRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.internal_static_ElectroherculesBattleSelectDifficultyRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp.class, emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp.Builder.class);
    }

    public static final int DIFFCULTY_FIELD_NUMBER = 3;
    private int diffculty_;
    /**
     * <code>uint32 diffculty = 3;</code>
     * @return The diffculty.
     */
    @java.lang.Override
    public int getDiffculty() {
      return diffculty_;
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 12;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 12;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 1;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 1;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
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
      if (galleryId_ != 0) {
        output.writeUInt32(1, galleryId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (diffculty_ != 0) {
        output.writeUInt32(3, diffculty_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(12, stageId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, galleryId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (diffculty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, diffculty_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, stageId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp other = (emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp) obj;

      if (getDiffculty()
          != other.getDiffculty()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
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
      hash = (37 * hash) + DIFFCULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDiffculty();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp prototype) {
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
     * CmdId: 2828
     * Obf: GOOLHDCAIKG
     * </pre>
     *
     * Protobuf type {@code ElectroherculesBattleSelectDifficultyRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ElectroherculesBattleSelectDifficultyRsp)
        emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.internal_static_ElectroherculesBattleSelectDifficultyRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.internal_static_ElectroherculesBattleSelectDifficultyRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp.class, emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp.newBuilder()
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
        diffculty_ = 0;

        retcode_ = 0;

        stageId_ = 0;

        galleryId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.internal_static_ElectroherculesBattleSelectDifficultyRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp build() {
        emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp buildPartial() {
        emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp result = new emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp(this);
        result.diffculty_ = diffculty_;
        result.retcode_ = retcode_;
        result.stageId_ = stageId_;
        result.galleryId_ = galleryId_;
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
        if (other instanceof emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp other) {
        if (other == emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp.getDefaultInstance()) return this;
        if (other.getDiffculty() != 0) {
          setDiffculty(other.getDiffculty());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
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
        emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int diffculty_ ;
      /**
       * <code>uint32 diffculty = 3;</code>
       * @return The diffculty.
       */
      @java.lang.Override
      public int getDiffculty() {
        return diffculty_;
      }
      /**
       * <code>uint32 diffculty = 3;</code>
       * @param value The diffculty to set.
       * @return This builder for chaining.
       */
      public Builder setDiffculty(int value) {
        
        diffculty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 diffculty = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearDiffculty() {
        
        diffculty_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 12;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 12;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 1;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 1;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ElectroherculesBattleSelectDifficultyRsp)
    }

    // @@protoc_insertion_point(class_scope:ElectroherculesBattleSelectDifficultyRsp)
    private static final emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp();
    }

    public static emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ElectroherculesBattleSelectDifficultyRsp>
        PARSER = new com.google.protobuf.AbstractParser<ElectroherculesBattleSelectDifficultyRsp>() {
      @java.lang.Override
      public ElectroherculesBattleSelectDifficultyRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ElectroherculesBattleSelectDifficultyRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ElectroherculesBattleSelectDifficultyRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ElectroherculesBattleSelectDifficultyRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ElectroherculesBattleSelectDifficultyRspOuterClass.ElectroherculesBattleSelectDifficultyRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ElectroherculesBattleSelectDifficultyRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ElectroherculesBattleSelectDifficultyRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.ElectroherculesBattleSelectDifficultyR" +
      "sp.proto\"t\n(ElectroherculesBattleSelectD" +
      "ifficultyRsp\022\021\n\tdiffculty\030\003 \001(\r\022\017\n\007retco" +
      "de\030\002 \001(\005\022\020\n\010stage_id\030\014 \001(\r\022\022\n\ngallery_id" +
      "\030\001 \001(\rB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ElectroherculesBattleSelectDifficultyRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ElectroherculesBattleSelectDifficultyRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ElectroherculesBattleSelectDifficultyRsp_descriptor,
        new java.lang.String[] { "Diffculty", "Retcode", "StageId", "GalleryId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
