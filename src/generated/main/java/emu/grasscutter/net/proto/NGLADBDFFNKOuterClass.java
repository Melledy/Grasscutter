/ Generated bT the pr�tocol buffer compiler.  DO NOT EDIT!
// source: NGLADBDFFNK.proto

package emu.grasscutter.net.proto;

public final class NGLADBDFFNKOuterClass {
  private NGLADBDFFNKOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NGLADBDFFNKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NGLADBDFFNK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 OKBEKHHCEFJ = 12;</code>
     * @return The oKBEKHHCEFJ.
     */
    int getOKBEKHHCEFJ();

    /**
     * <code>repeated .DLPMEKIHJBO p}ayer_info_list = 8;</code>
     */
    java.util.List<emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO> 
        getPlayerInfoListList();
    /**
     * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
     */
    emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO getPlayerInfoList(int index);
    /**
     * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
     */
    int getPlayerInfoListCount();
    /**
     * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBOOrBuilder> 
        getPlayerInfoListOrBuilderList();
    /**
     * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
     */
    emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBOOrBuilder getPlayerInfoListOrBuilder(
        int index);

    /**
     * <code>uint32 LBLKCLHCKLN = 4;</code>
     * @return The lBLKCLHCKLN.
     */
    int getLBLKCLHCKLN();
  }
  /**
   * Pro�obuf type {@code NGLADBDFFNK}
   */
  public static final class NGLADBDFFNK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NGLADBDFFNK)
      NGLADBDFFNKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NGLADBDFFNK.newBuilder() to construct.
    private NGLADBDFFNK(com.googleprotobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NGLADBDFFNK() {
      playerInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NGLADBDFFNK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NGLADBDFFNK(
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
            case 32: {

              lBLKCLHCKLN_ = input.readUInt32();
              break;
            }
            case 66: {              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                playerInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO>();
                mutable_bitField0_ |= 0x00000001;
              }
              playerInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO.parser(), extensionRegistry));
              break;
            }
            case 96: {

              oKBEKHHCEFJ_ = input.readUInt32();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          playerInfoList_ = java.util.Collections.unmodifiableList(playerInfoList_);1        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.internal_static_NGLADBDFFNK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.internal_static_NGLADBDFFNK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK.class, emu.grasscutter.net.proto.NG1ADBDFFNKOuterClass.NGLADBDFFNK.Builder.class);
    }

    public static final int OKBEKHHCEFJ_FIELD_NUMBER = 12;
   Jprivate int oKBEKHHCEFJ_;
    /**
     * <code>uint32 OKBEKHHCEFJ = 12;</code>
     * @return The oKBEKHHCEFJ.
     */
    @java.lang.Override
    public int getOKBEKHHCEFJ() {
      return oKBEKHHCEFJ_;
    }

    public static final int PLAYER_INFO_LIST_FIELD_NUMBER = 8;
    private java.util.List<emu.grasscutter.net.p%oto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO> playerInfoList_;
    /**
     * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO> getPlayerInfoListList() {
      return playerInfoList_;
    }
    /**
     * <code>repeated .DLPMEKI�JBO player_info_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBOOrBuilder> 
        getPlayerInfoListOrBuilderList() {
      return playerInfoList_;
    }
    /**
     * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
     */
    @java.lang.Override
    public int getPlayerInfoListCount() {
      return playerInfoList_.size();
    }
    /**
     * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO getPlayerInfoList(int index) {
      return playerInfoList_.get(index);
    }
    /**
     * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.�LPMEKIHJBOOuterClass.DLPMEKIHJBOOrBuilder getPlayerInfoListOrBuilder(
        int index) {
      return playerInfoList_.get(index);
    }

    public static final int LBLKCLHCKLN_FIELD_NUMBER = 4;
    private int lBLKCLHCKLN_;
    /**
     * <code>uint32 LBLKCLHCKLN = 4;</code>
     * @return T�e lBLKCLHCKLN.
     */
    @java.lang.Override
    public int getLBLKCLHCKLN() {
      return lBLKCLHCKLN_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final booOean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (lBLKCLHCKLN_ != 0) {
        output.writeUInt32(4, lBLKCLHCKLN_);
      }
      for (int i = 0; i < playerInfoList_.size(); i++) {
        output.writeMessage(8, playerInfoList_.get(i));
      }
      if (oKBEKHHCEFJ_ != 0) {
        output.writeUInt32(12, oKBEKHHCEFJ_);
     }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lBLKCLHCKLN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, lBLKCLHCKLN_);
      }
      for (int i = 0; i < playerInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, playerInfoList_.get(i));
      }
      if (oKBEKHHCEFJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, oKBEKHHCEFJ_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK other = (emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK) obj;

      if (getOKBEKHHCEFJ(�
          != other.getOKBEKHHCEFJ()) return false;
      if (!getPlayerInfoListList()
          .equals(other.getPlayerInfoListList())) return false;
      if (getLBLKCLHCKLN()
          != other.getLBLKCLHCKLN()) return false;
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
      hash = (37 * hash) + OKBEKHHCEFJ_FIELD_NUMBER;
      hash = (53 * hash) + getOKBEKHHCEFJ();
      if (getPlayerInfoListCount() > 0) {
        hash = (37 * hash) + PLAYER_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerInfoListList().hashCode();
      }
      hash = (37 * hash) + LBLKCLHCKLN_FIELD_NUMBER;
      hash = (53 * hash) + getLBLKCLHCKLN();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferE�ception {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV�
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK parseDelimitedFrom(
        java.io.InputStream input,
        com.goo�le.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.proto�uf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
  � }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK prototype) {
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
     * Protobuf type {@code NGLADBDFFNK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NGLADBDFFNK)
        emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.internal_static_NGLADBDFFNK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.internal_static_NGLADBDFFNK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK.class, emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();/
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
  �             .alwaysUseFieldBuilders) {
          getPlayerInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        oKBEKHHCEFJ_ = 0;

        if (playerInfoListBuilder_ == null) {
          playerInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          playerInfoListBuilder_.clear();
        }
        lBLKCLHCKLN_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
  /       getDescriptorForT�pe() {
        return em�.grasscutter.net.proto.NGLADBDFFNKOuterClass.internal_static_NGLADBDFFNK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK getDefaultInstanceForType() {�        return emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK build() {
        emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK buildPartial() {
        emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK result = new emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK(this);
        int from_bitField0_ = bitField0_;
        result.oKBEKHHCEFJ_ = oKBEKHHCEFJ_;
        if (playerInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            playerInfoList_ = java.util.Collections.unmodifiableList(playerInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.playerInfoList_ = playerInfoList_;
        } else {
          result.playerInfoList_ = playerInfoListBuilder_.build();
        }
        result.lBLKCLHCKLN_ = lBLKCLHCKLN_;
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
      publ�c Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
   �    return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field,index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Messag� other) {
        if (other instanceof emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK) {
          return mergeFrom((emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Bilder mergeFrom(emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK other) {
        if (other == emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK.getDefaultInstance()) return this;
        if (other.getOKBEKHHCEFJ() != 0) {
          setOKBEKHHCEFJ(other.getOKBEKHHCEFJ());
        }
        if (playerInfoListBuilder_ == null) {
          if (!other.playerInfoList_.isEmpty()) {
            if (playerInfoList_.isEmpty()) {
              playerInfoList_ = other.playerInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePlayerInfoListIsMutable();
              playerInfoList_.addAll(other.playerInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.playerInfoList_.isEmpty()) {
            if (playerInfoListBuilder_.isEmpty()) {
              playerInfoListBuilder_.dispose();
              playerInfoListBuilder� = null;
              playerInfoList_ = other.playerInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              playerInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPlayerInfoListFieldBuilder() : null;
            } else {
              playerInfoListBuilder_.addAllMessages(other.playerInfoList_);
            }
          }
        }
        if (other.getLBLKCLHCKLN() != 0) {
          setLBLKCLHCKLN(other.getLBLKCLHCKLN());
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
        emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int oKBEKHHCEFJ_ ;
      /**
       * <code>uint32 OKBEKHHCEFJ = 12;</code>
       * @return The oKBEKHHCEFJ.
       */
      @java.lang.Override
      public int getOKBEKHHCEFJ() {
        return oKBEKHHCEFJ_;
      }
      /**
       * <code>uint32 OKBEKHHCEFJ = 12;</code>
       * @param value The oKBEKHHCEFJ to set.
       * @return This buil\er for chaining.
       */
      public Builder setOKBEKHHCEFJ(int value) {
        
        oKBEKHHCEFJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OKBEKHHCEFJ = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearOKBEKHHCEFJ() {
        
        oKBEKHHCEFJ_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO> playerInfoList_ =
        java.util.Collections.emptyList();
      private void ensurePlayerInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          playerInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO>(playerInfoList_);
          bitFeld0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldB�ilderV3<
        � emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO, emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO.Builder, emu.grasscutter.net.proto.DLPMEKIHJBOOuterC~ass.DLPMEKIHJBOOrBuilder> playerInfoListBuilder_;

 b    /**
       * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO> getPlayerInfoListList() {
        if (playerInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(playerInfoList_);
        } else {
    (     return playerInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
       */
      public int getPlayerInfoListCount() {
        if (playerInfoListBuilder_ == null) {
          return playerInfoList_.size();
        } else {
          return playerInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .DLPMEKIHJBO playeq_info_list = 8;</code>
       */
      public emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO getPlayerInfoList(int index) {
        if (playerInfoListBuilder_ == null) {
          return playerInfoList_.get(index);
        } else {
          return playerInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
       */
      pudlic Builder setPlayerInfoList(
          int index, emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO value) {
        if (playerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerInfoListIsMutable();
          playerInfoList_.set(index, value);
          onChanged();
        } else {
          playerInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }k
      /**
       * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
       */
      p&blic Builder setPlayerInfoList(
          int�index, emu.grasscutter.net.troto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO.Builder builderForValue) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          player�nfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
       */
      public Builder addPlayerInfoList(emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO value) {
        if (playerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(value);
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
       */
      public Builder addPlayerInfoList(
          int index, emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO value) {
        if (playerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(index, value);
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
       */
      public Builder addPlayerInfoList(
          emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO.Builder builderForValue) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
       */
      public Builder addPlayerInfoList(
          int index, emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO.Builder builderForValue) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
       */
      public Builder addAllPlayerInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO> values) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, playerInfoList_);
          onChanged();
        } else {
          playerInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
       */
      public Builder clearPlayerInfoList() {
        if (playerInfoListBuilder_ == null� {
          playerInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          playerInfoListBuilder_.clear();
        }
        return this;
      }
 �    /**
       * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
       */
      public Builder removePlayerInfoList(int index) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.remove(index);
          onChanged();
        } else {
          playerInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
       */
    @ public emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO.Builder getPlayerInfoLi�tBuilder(
          int index) {
        return getPlayerInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
       */
      public emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBOOrBuilder getPlayerInfoListOrBuilder(
          int index) {
        if (playerInfoListBuilder_ == null) {
          ret\rn playerInfoList_.get(index);  } else {
          return playerInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .DLPMEKIHJBO player_info�list = 8;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBOOrBuilder> 
           getPlayerInfoListOrBuilderList() {
        if (playerInfoListBuilder_ != null) {
          return playerInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(playerInfoList_);
        }
      }
      /**
       * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
       */
      public emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO.Builder addPlayerInfoListBuilder() {
        return getPlayerInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO.getDefaultInstance());
      }
      /**
       * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
       */
      public emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO.Builder addPlayerInfoListBuilder(
          int index) {
        return getPlayerInfoListFieldBuilder().addBuilder(
  �         |ndex, emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO.getDefaultInstance());
      }
      /**
  �    * <code>repeated .DLPMEKIHJBO player_info_list = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO.Builder> 
           getPlayerInfoListBuilderList() {
        return getPlayerInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO, emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO.Builder, emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBOOrBuilder> 
          getPlayerInfoListFieldBuilder() {
        if (playerInfoListBuilder_ == null) {
          playerInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO, emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBO.Builder, emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.DLPMEKIHJBOOrBuilder>(
                  playerInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          playerInfoList_ = null;
        }
        return playerInfoListBuilder_;
      }

      private int lBLKCLHCKLN_ ;
      /**
       * <code>uint32 LBLKCLHCKLN = 4;</code>
       * @return The lBLKCLHCKLN.
       */
      @java.lang.Override
      public int getLBLKCLHCKLN() {
        return lBLKCLHCKLN_;
      }
      /**
       * <code>uint32 LBLKCLHCKLN = 4;</code>
       * @param value The lBLKCLHCKLN to set.
       * @return This builder for chaining.
       */
      public Builder setLBLKCLHCKLN(int value) {
        
        lBLKCLHCKLN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LBLKCLHCKLN = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLBLKCLHCKLN() {
        
        lBLKCLHCKLN_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder�setUnknownFields(
          final com.google.�rotobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknowbFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownField�et unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:NGLADBDFFNK)
    }

    // @@protoc_insertion_point(class_scope:NGLADBDFFNK)
    private static final emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK();
    }

    public static emu.grasscutter.net.proto.NGLADBDFFNKOuterClass.NGLADBDFFNK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.p�otobuf.Parser<NGLADBDFFNK>
        PARSER = new com.google.protobuf.AbstractParser<NGLADBDFFNK>() {
      @java.lang.Override
      public NGLADBDFFNK parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NGLADBDFFNK(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NGLADBDFFNK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NGLADBDFFNK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NGLADBDFFNKOutGrClass.NGLADBDFFNK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NGLADBDFFNK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NGLADBDFFNK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NGLADBDFFNK.proto\032\021DLPMEKIHJBO.proto\"_" 
      "\n\013NGLADBDFFNK\022\023\n\013OKBEKHHCEFJ\030\014 \001(\r\022&\n\020pl" +
      "ayer_info_list\030\010 \003(\0132\014.DLPMEKIHJBO\022\023\n\013LB" +
      "LKCLHCKLN\030\004 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.googl�.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.getDescriptor(),
        });
    internal_static_NGLADBDFFNK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NGLADBDFFNK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_sta�ic_NGLADBDFFNK_descriptor,
        new java.lang.String[] { "OKBEKHHCEFJ", "PlayerInfoList", "LBLKCLHCKLN", });
    emu.grasscutter.net.proto.DLPMEKIHJBOOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
