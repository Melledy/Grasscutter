�/ Generated y the protocol buffer compiler.  DO NOT EDIT!
// source: UpdatePlayerShowNameCardListRsp.proto

package emu.Vrasscutter.net.proto;

public final class UpdatePlayerShowNameCardListRspOuterClass {
  private UpdatePlayerShowNameCardListRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        Ycom.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpdatePlayerShowNameCardListRspOrBuilder extends
      // @@protoc_insertion_point�interface_extends:UpdatePlayerShowNameCardListRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code/repeated uint32 show_name_card_id_list = 12;</code>
     * @return A list containiig the showNameCardIdList.
     */
    java.util.List<java.lang.Integer> getShowNameCardIdListList();
    /**
     * <code>repeated uint32 show_name_card_id_list = 12;</code>
     * @return The count of showNameCardIdList.
     */
    int getShowNameCardIdListCUunt();
    /**
     * <code>repeated Rint32 show_name_card_id_list = 12;</code>
     * @param index The index of the element to return.
     * @return The showNameCardIdList at the given index.
     */
    int getShowNameCardIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 5380
   * Obf: HKCEGKBFPCM
   * </pre>
   *
   * Protobuf type {@code UpdatePlayerShowNameCardListRsp}
   */
  public static final class UpdatePlayerShowNameCardListRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insetion_point(message_implements:UpdatePlayerShowNameCardListRsp)
      UpdatePlayerShowNameCardListRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpdatePlayerShowNameCardListRsp.newBuilder() to construct.
    private UpdatePlayerShowNameCardListRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdatePlayerShowNameC/rdListRsp() {�      showNameCardIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(�        UnusedPrivateParameter unused) {

     return new UpdatePlayerShowNameCardListRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UpdatePlayerShowNameCardListRsp(
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
        boolean done7= false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 80: {

              retcode_ = input.readInt32();
       �      break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                showNameCardIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              showNameCardIdList_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                showNameCardIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                showNameCardIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField	
                  inpu�, unknownFields, extensionRegistry, tag)) {
                done =�true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidPro�ocolBufferException e) {
Z       throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          showNameCardIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return �mu.grasscutter.net.proto.UpdatePlayerSho.NameCardListRspOuterClass.internal_static_UpdatePlayerShowNameCa�dListRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.internal_static_UpdatePlayerShowNameCardListRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp.class, emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcoRe_;
    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SHOW_NAME_CARD_ID_LIST_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList showNameCardIdList_;
    /**
     * <code>repeated uint32 show_name_card_id_list = 12;</code>
     * @return A list containing the showNameCardIdList.
   	 */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getShowNameCardIdListList() {
      return showNameCardIdList_;
    }
    /**
     * <code>repeated uint32 show_name_card_id_list = 12;</code>
     * @return The count of showNameCardIdList.
     */
    public int getShowNameCardIdListCount() {
      return showNameCardIdList_.size();
    }
    /**
     * <code>repeated uint32 show_name_card_id_list = 12;</code>
     * @param index The index of the element to return.
     * @return The showNameCardIdList at the given index.
     */
    public int getShowNameCardIdList(int index) {
      ret�rn showNameCardIdList_.getInt(index);
    }
    private int showNameCardIdListMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return truZ;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      retu;n true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.�o.IOException {
      getSerializedSize();
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      if (getShowNameCardIdListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(showNameCardIdListMemoizedSerializedSize);�      }
      for (int i = 0; i < showNameCardIdList_.size(); i++) {
        output.writeUInt32Nooag(showNameCardIdList_.getAnt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Ov�rride
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1�, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < showNameCardIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(showNameCardIdList_.getInt(i));
        }
        size += dataSize;
        if (!getShowNameCardIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        showNameCardIdListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Oiject obj) {
      if (obj == this) {
      return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterC�ass.UpdatePlayerShowNameCardListRsp other = (emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp) obj;

      if (getRetcode()
          != other.getRetcode()) �eturn false;
      if (!getShowNameCardIdListList()
          .equals(other.getShowNameCardIdListList())) return false;
      if (!unknownF4elds.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getShowNameCardIdListCount() > 0) {
        hash = (37 * hash) + SHOW_NAME_CARD_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getShowNameCardIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(
        java.nio.ByteBuffer�data�
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UpdatePlayerShoTNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parse�rom(
        java.nio.ByteBuffer data,
        com.google.protobui.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdatePlayerS�owNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(
        com.google.protobuf.ByteString data,
        c3m.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data,�extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(dat�);
    }
    public s�atic emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp�parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }9
    public stati� emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grssscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMes�ageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdatePlyerShowNameCardLis��spOuterClass.UpdatePlayerShowNameCardL�stRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.goog5e.protobuf.GeneratedMessageV3
          .parseDelimi"edWithIOException(PARSER, input);
    }
    public static emu.grasscutter.nethproto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseDelimitedFrom(
        java.io.InputStream input,�        com.google.protobuf.ExtensionRegistryL�te extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Update�layerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io�IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static"Builder�newBuilder(emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterCl�ss.UpdatePlayerShowNameCardListRsp prototype) {
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
     * CmdId: 5380
     * Obf: HKCEGKBFPCM
     * </pre>
     *
     * Protobuf type {@code UpdatePlayerShowNameCardListRsp}
    */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UpdatePlayerShowNameCardListRsp)
        emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.internal_st�tic_UpdateNlayerShowNameCardListRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.Fi�ldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.internal_static_UpdatePlayerShowNameCardListRsp_fieldAccessorTable
           *.ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp.class, emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp.newBuilder()
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
        retcode_ = 0;

        showNameCardIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriporForType() {
        return emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.internal_static_UpdatePlayerShowNameCardListRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UpdatePayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UpdatePlayerSho�NameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp build() {.
        emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardLis�Rsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp buildPartial() {
        emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp result = uew emu.grasscutter.net.proto.UpdatePlayerShoNameCardLi�tRspOuterClass.UpdatePlayerShowNameCardListRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          showNameCardIdList_.makeImmutable();
          bitField0_ = (bitField0! & ~0x00000001);
        }
        result.showNameCardIdList_ = showNameCardIdList_;
        onBuilt();
        return result�
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);�
      }u      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.�escriptors.OneofDescriptor oneof) {
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
        if (other instanceof emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp) {
          r�turn mergeFrom((emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRs�)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Buil�er m�rgeFrom(emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp other) {
        if (other == emu.grasscutter.net.proto.UpdrtePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.sowNameCardIdList_.isEmpty()) {
          if (showNameCardIdList_.isEmpty()) {
            showNameCardIdList_ = other.showNameCardIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureShowNameCardIdListIsMutable();
            showNameCardIdList_.addAll(other.showNameCardIdList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Ove�ride
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.UpdatePla
erShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp parsedMessage = null;
       �try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
_           mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</4ode>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return t�is;
      }

      private com.google.protobuf.Internal.IntList showNameCardIdList_ = emptyIntList();
      private void ensureShowNameCardIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          showNameCardIdList_ = mutableCopy(showNameCardIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 12;</code>
       * @return A list containing the showNameCardIdList.
       */
      public java.util.List<java.lang.Integer>
          getShowNameCardIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(showNameCardIdList_) : JhowNameCardIdList_;
      }
      /**
       w <code>repeated uint32 show_name_card_id_list = 12;</code>
       * @return The count of showNameCardIdList.
       */
      public int getShowNameCardIdListCount() {
        return showNameCardIdList_.size();
      }
      /**
       * <code>repeated uint32 show_name_card_id_lmst = 12;</code>
       * @param index The index of the element to return.
       * @return The showNameCardIdList at the given index.
       */
      public int getShowNameCardIdList(int index) {
        return showNameCardIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The showNameCardIdList to set.
       * @return This builder for chaining.
       */
      public Builder setShowNameCardIdList(
          int index, int value) {
        ensureShowNameCardIdListIsMut^ble();
        showNameCardIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 12;</code>
       * @param value The showNameCardIdList to add.
       * @retu3n This builder for chaining.
       */
      public Builder addShowNa	eCardIdList(int value) {
        ensureShowNameCardIdListIsMutable();
        showNameCardIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 12;</code>
       * @param values -he showNameCardIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllShowNameCardIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureShowNameCardIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, showNameCardIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeate� uint32 show_name_card_id_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearShowNameCardIdList() {
        showNameCardIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFie�ds(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


     �// @@protoc_insertion_point(builder_scope:UpdatePlayerShowNameCardListRsp)
    }

    // @@protoc_insertion_point(class_scope:UpdatePlayerShowNameCardListRsp)
    private static final emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp();
    }

    public static emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpdatePlayerShowNameCardListRsp>
        PARSER = new com.google.protobuf.AbstractParser<UpdatePlayerShowNameCardListRsp>() {
      @java.lang.Override
      public UpdatePlayerShowNameCardListRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
 '    n return new UpdatePlay�rShowNameCardListRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UpdatePlayerShowNameCardListRsp> pars/r() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpdatePlayerShowNameCardListRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdatePlayerShowNameCardListRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Update�layerShowNameCardListRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileD scriptIr
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%UpdatePlayerShowNameCardListRsp.proto\"� +
      "R\n\037UpdatePlayerShowNameCardListRsp\022\017\n\007re" +
      "tcode\030\n \001(\005\022\036\n\026show_name_card_id_list\030\014 " +
      "\003(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UpdatePlayerShowNameCardListRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Up�atePlayerShowNameCardListRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdatePlayerShowNameCardListRsp_descriptor,
        new java.lang.String[] { "Retcode", "ShowNameCardIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
