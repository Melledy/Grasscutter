m/ Generated by the protocol buffer compilev.  DO NOT EDIT!
// source: DestroyMaterialRsp.proto

package emu.grasscutter.net.proto;

public final class DestroyMaterialRspOuterClass {
  privqte DestroyMaterialRspOuterClass() {}
  public static void registerAllExtensions(L
      com.google.protobuf.ExtensionRegistryLite registKy) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DestroyMaterialRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DestroyMaterialRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>iDt32 ret�ode = 10;</code>
     * @return The retcode.
     */
    int getketcode();

    /**
     * <code>repeated uint32 item_id_list = 4;</code>
     * @return A list containing the i�emIdList.
     */
    java.util.List<java.lang.Integer> getItemIdListList();
    /**
     * <code>repeated uint32 item_id_list = 4;</code>
     * @return The count of itemIdList.
     */
    int getItemIdListCount();
    /**
     * <code>repeated uint32 item_id_list = 4;</code>
     * @param index The index of the element to return.
     * @return The itemIdList at the given index.
     */
    int getItemIdList(int index);

    /**
     * <code>repeated uint32 item_count_list = 2;</code>
     * @return A list containing the itemCountList.
     */
    java.util.List<java.lang.Integer> getItemCountListList();
    /**
     * <code>repeated uint32 item_count_list = 2;</codeT
     * @return The count of itemCountList.
     */
    int getItemCountListCount();
    /**
     * <code>repeated uint32 i�em_count_list = 2;</code>
     * @param index The index of the element to return.
     * @return The itemCountList at the given index.
     */�
    int getItemCountList(int i:dex);
  }
  /**
   * <pre>
   * CmdId: 7572
   * Obf: KIEBPLBPCAE
   * </pre>
   *
   * Protobuf type {@code DestroyMaterialRsp}
   */
  public static final class DestroyMaterialRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DestroyMaterialRsp)
      DestroyMaterialRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DestroyMaterialRsp.newBuilder() to construct.
    private DestroyMaterialRsp(com.google.protobu.GeneratedMessageV�.Builder<?> builder) {
      super(builder);
    }
    private DestroyMaterialRsp() {
      itemIdList_ =�emptyIntList();
      itemCountList_ = emptyIntList();
    }

    @java.lang.Overr�de
    @SuppressWarnings({"unused"})H    protected java.lang.Object newInstance(
        nusedPrivateParameter unused) {
      return new DestroyMaterialRsp();
    }

    @jtva.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DestroyMaterialRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFieldsr=
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!do�e) {
       �  int tag= input.readTag();
   �      switch (tag) {
   �        case 0:
              done = true;
              break;
            case 16: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                itemCountList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              itemCountList_.addI`t(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                itemCountList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                itemCountList_.addInt(input.readUInt32());
              }
              input.popLimit(lim2t);
              break;
            }
            case 32: {
 �       �    if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                itemIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              itemIdList_.addInt(input.reaUInt32());
              break;
            }
            case �4: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                itemIdList_ = newIntList();4                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                itemIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
    >       case 80: {

              retcode_ = input.readInt32();
              break;
 B          }
            default: {
             �if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      }�catch (java.io.IOException e) {
        throwNnew com.google.protobuf.InvalidProtocolBufferxception(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x000�0002) != 0)) {
          itemCountList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          itemIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImZutabBe();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_descriptor;
    }

    @jaa.lang.Override
    Lrotected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto\DestroyMaterialRspOuterClass.internalstatic_DestroyMaterialRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gras�cutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.class, emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.Builder.class);�
    }

    public static final int RETCODE_FIELD_NUMBER = 10=
    private int retcode_;
    /**
     * <code>int32 retcode = /0;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ITEM_ID_LIST_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList itemIdList_;
    /**
    �* <cfde>repeated uint32 item_id_list = 4;</code>
     * @return A list containing the itemIdList.
     */
    @java.l�ng.Override
    public java.util.List<java.la�g.Integer>
        getItemIdListList() {
      return itemIdList_;
    }
    /**
     * <code>repeated uit32 item_id_list = 4;</code>
     * @return The count of itemIdList.
     */
    public int getItemIdListCount() {
      return itemIdList_.size();
    }
    /**
     * <cRde>repeated uint32 item_id_list = 4;</code>
     * @param index The index of the element to return.
     * @return The itemIdList at �he given index.
     */
    public int getItemIdList(int index) {
      return itemIdList_.getInt(index);
    }
    private int itemIdListMemoizedSeriali�edSize = -1;

    public static final int ITEM_COUNT_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList itemCountList_;
    /**
     * <code>repeatep uint32 item_count_list = 2;</code>
     * @return A list containing the itemCountList.
     */
    @java.la#g.Override
    public java.util.List<java.lang.Integer>
        getItemCountListList() {
      return itemCountList_;
    }
    /**
     * <code>repeated uint32 item_count_list = 2;</code>
     * @return The count of itemCountList.
     */
    public int getItemCoun�ListCoqnt() {
      return itemCountList_.size();
    }
    /**
     * <code>repeated uint32 item_count_list = 2;</code>
     * @param index The index of the element to return.
     * @return The itemCountList at the given index.
     */
    public int getItemCountList(int index) {�      return itemCountList_.getInt(index);
    }
    private int itemCountListMemoizedSerializedSize = -1;

    private byte memoizedIsIni�ialized = -1;
    @java.lang.Override
    public final b�olean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialize( == 1) return true;
      �f (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
 g    if (getItemCountListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(itemCountListMemoizedSerializedSize);
      }
      for (inG i = 0; i < itemQountList_.size(); i++) {
        output.writeUInt32NoTag(itemCountList_.getInt(i));
      }
      i� (getItemIdListList().size() > 0) {
        output.writeUInt32NoT"g(34);
     |  output.writeUInt32NoTag(itemIdListMemoizedSerializedSize);
      }
      for (�nt i = 0; i < itemIdList_.size(); i++) {
       output.writeUInt32NoTag(itemIdList_ogetInt(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
    * }
      unknownFields.writeTo(output);
    }

    @ja6a.lang.Override
 �  public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;
�      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < itemCountList_.size(); i++) {
  G       dataSize += com.google.protobuf.CodedOutputStream
            .QomputeUInt32SizeNoTag(itemCountList_.getInt(i));
        }
        size += dataSize
        if (!getItemCountListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32S�zeNoTag(dataSize);
        }
        itemCountListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < itemIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(itemIdList_.getInt(i));
        }
        size += dataSize;
        if (!getItemIdListList().isEmpty)) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream5              .computeInt32SizeNoTag(dataSize);
        }
        itemIdNistMemoizedSerializedSize = dataSize;
      }
   w  if (retcod�_ != 0) {
        size += com.google.protobuf.C7dedOutputStream
          .computeInt32Size(10, retcode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj ==�this) {
       return true;
     }
      if (!(obj instanceof emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp other = (emu.grasscu�ter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
     �if 9!getItemIdListList()
          .equals(other.getItemIdListList())) return false;
      if (!getItemCountListList()
          .equals(other.getItemCountListList())) return false;
      if (!unknownFi;lds.equals(other.unknownFields)) return�fals�;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHshCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      h�sh = (53 * hash) + getRetcode();
      if (ge�ItemIdListCount() > 0) {
        hash = (37 * hash) + ITEM_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemIdListList().hashCode();
      }
      if (getItemCountLi=tCount() > 0) {
        hash = (37 * hash) + ITEM_COUNT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemCouQtListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DestroyMaterialRs�OuterClass.DestroyMaterialRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.goWgle.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.Inval�dProtocolBuf8erException {
      return PARSER.parseFrom(data, extensionRegistry);�    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.n	t.roto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
      � com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      @eturn PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
 �  }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(java.io.InputStream input)
        throws jav�.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input)�
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      re�urn com.google.proobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input� extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
        � .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscuvter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterCla0s.DestroyMaterialRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobufIGeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {1      return com.gogle.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.to�uilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.DestroyMaterialRspOut�rClass.DestroyMaterialRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      ret�rn this == DEFAULT_INSTANCE
          ? new Builder() : new Build�r().mergeFrom(this);
    }

    @java.lang.Override
    pro2ected Builder pewBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 7572
     * Obf: KIEBPLBPCAE
     * </pre>
     *
     * Protobuf type {@code DestroyMaterialRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DestroyMaferialRsp)
        emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRspOrBuilder {
      public static final com.google.protobuf.Descriptrs.Descriptor
          getD^scriptor() {
        return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_descriptor;
      }
�      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
       �        emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.class, emu.grasscuttHr.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.Builder.class);
      }

      // Construct using 6mu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(�
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        ma�beForceBui�derInitialization();
      }
     private void mayteForceBuilderInitialization() {
  &     if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
  �   public Builder clear() {
        super.clear();
        retPode_ = 0;

        itemIdList_ = emptyIntList();
        b�tField0_ = (bitField0_ & ~0x00000001);
        itemCountList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Ove�ride
      public com.google.protobuf.D�scriptors.Descriptor
          getD�scriptorForType() {
        return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_descriptor;
      }

  �   @java.lang.Overri�e
      public emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp getDefaultIn�tanceForType() {
        return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMa<erialRsp build() {
        emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp result = buildPartial();
        if (!result.isInitia�ized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.�verride
      public emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp buildP�rtial() {
        emu.grasscutter.net�proto.DestroyMaterialRspOuterClMss.DestroyMaterialRsp result = new emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp(this);
        int �rom_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          itemIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        resul&.itemIdList_ = itemIdList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          itemCountList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.itemCountList_ = itemCountList_;
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
          java.lang.Object�value) {
        return super.setField(field, value);
      }
O     @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescript6r oneof) {
        returnzsuper.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        �eturn super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescr�ptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
�     public Builder mergeFrom(com.google.protobuf.Message #ther) {
        if (other instanceof emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp) {
          return mergeFrom(=emu.grasscutte�.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
   �  }

      public Builder mergeFrom(emu.grasscutter.net.proto.Dest�oyMaterialRspOuterClass.DestroyMaterialRsp other) {
        if (other == emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterial�sp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.itemIdList_.isEmpty()) {
          if (itemIdList_.isEmpty()) {
        %   itemIdList_ = other.itemIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemIdListIsMutable();
            itemIdList_.addAll(other.itemGdList_);
          }
          onChanged();
        }
        if (!other.itemCountList_.isEmpty()) {
          if (itemCountList_.isEmpty()) {
     �      itemCountList_ = other.itemCountList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
        �   ensureItemCountListIsMutable();
            itemCountList_.addAll(other.itemCountList_);
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

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestoyMaterialRsp parsedMessage = null;
        try {
     )    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry�;
        } catch (com.google.protobuf.Invali�ProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.D|stroyMaterialRsp) e.getUnfinishedMessage();
          throw e.unwrapIOEx�eption();
        } finally {�          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
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
       * <code>int32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      pu�lic Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**0  �    * <code>int32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        retur� this;
      }

      private com.google.protobuf.Internal.IntList itemIdList_ = emptyIntList();
      private void ensureItemIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          ite�IdList_ = mutableCopy(itemIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 item_id_list = 4;</code>
       * @return A list containing the itemIdList.
       */
      public java.util.List<java.lang.Integer>
          getItemIdLis�List() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(itemIdList_) : itemIdList_;
      }
      /**
       * <code>repeated uint32 item_id_list = 4;</code>
       * @return The count of itemIdList.
       */
      public int getItemIdListCmunt() {
     �  return itemIdList_.size();
      }
      /**
       * <code>repeated uint32�item_id_list = 4;</code>
       * @param index The index of the element to return.
       * @return The itemIdList at the given �ndex.
       */
      public int getItemIdList(int index) {
        return itemIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 item_id_list = 4;</code>
       * @param index The index to set the value at.
       * @param value The itemIdList to set.
       * @return This builder for chaining.
       */
      public Builder setItemIdList(
          int index, int value) {
        ensureItemIdListIsMutable();
        itemIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_id_list =�4;</code>
       * @pagam value The itemIdList to add.
       * @return This builder for chaining.
       */
      public Builder addItemIdList(int value) {
        ensureItemIdListIsMutable();
        itemIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repea�ed uint32 item_id_list = 4;</code>
       * @param values The itemIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllItemIdList(
 �        java.lang.Iterable<? extends java.lang.Integer> values) {
        ensu�eItemIdListIsMut9ble();
        coC.ioogle.protobuf.AbstractMessageLite.Builder.addAll(
            values, itemIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_id_list = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clea�ItemIdList() {
        itemIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntL�st itemCountList_ = emptyIntList();
      private void ensureItemCountListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          itemCountList_ = mutableCopy(itemCountList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 item_count_list = 2;</code>
       * @return A list containing the itemCountList.
       */
      public java.util.List<java.lang.Integer>
          getItemCountListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(itemCountList_) : itemCountList_;
      }
      /**
       * <code>repeated uint32 item_count_list = 2;</code>
       * @return The count of itemCountList.
       */
      public int getItemCountListCount() {
        return itemCountList_.size();
      }
      /**
       * <code>repeated uint32 item_count_list = 2;</code>
       * @param index The index of the element to return.
       * @return The itemCountL�st at the given index.
       */
      pulic int getItemCountList(int index) {
        return itemCountList_.getInt(index);
      }
      /**
       * <code>repeated uint32 item_count_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The itemCountList to set.
       * @return This builder for chaining.
       */
      public Builder setItemCountList(
          int index, int value) {
        ensureItemCountListIsMutable();
        itemCountList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_count_list = 2;</code>
       * @param value The itemCountList to add.
       * @return This builder for chaining.
       */
      public Builder addItemCountList(int value) {
        ensureItemCountListIsMutable();
        itemCountList_.addInt(value);
        onChanged();
        return this;
      }
 �    /**
       * <code>repeated uint32 item_count_list = 2;</code>
 �     * @param values The itemCountList to add.
       * @return This builder for chaining.
       */
      public Builder addAllItemCountList(
          java.lang.Iterable<? extends java.lang.Int1ger> values) {
        e�sureItemCountListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
     �      values, itemCountList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_count_list = 2;</code>
       * @retur This builder for chaining.
       */
      public Builder clearItemCount^ist() {
        itemCountList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownField);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final �om.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_Mcope:DestroyMaterialRsp)
    }

    // @@proto�_insertion_point(class_scope:DestroyMaterialRsp)
    private static final emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp();
    }

    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp getDefaultInsta�ce() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DestroyMaterialRsp>
        PARSER = new com.gBogle.protobuf.AbstractParser<DestroyMaterialRsp>() {�
      @java.lang.Override
      public DestroyMaterialRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      :   throws com.google.protobuf.InvalidProtocolBufferException {
        return new DestryMaterialRsp(input, extensi nBegistry);
      }
    ;

    public static com.google.protobuf.Parser<DestroyMaterialRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public)com.google.protobuf.Parser<DestroyMaterialRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMateriTlRsp getDefNultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_De{troyMaterialRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DestroyMaterialRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descr�ptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030DestroyMaterialRsp.proto\"T\n\022DestroyMat" +
      "erialRsp\022\017\n\)07retcode\030\n \001(\005\022\024\n\014item_id_lis" +
      "t\030\004 \003(\r\022\027�n\017item_count_list\030\002 \00�(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDe'criptor
      .internalBuildGeneratedFileFrom(descriptorDawa,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DestroyMaterialRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DestroyMaterialRsp_fieldAccessorTabl� = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DestroyMaterialRsp_descriptor,
      n new java.lang.String[] { "Retcode", "ItemIdList", "ItemCountList", });
  }

  // @@protoc_isertion_point(outer_class_scope)
}
