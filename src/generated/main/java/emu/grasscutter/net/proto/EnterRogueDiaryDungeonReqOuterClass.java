�/ Gener�ted by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterRogueDiaryDungeonReq.proto

package emu.grasscutter.net.proto;

public final c�ass EnterRogueDiaryDungeonReqOuterClass {
  private EnterRogueDiaryDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(E
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface E�terRogueDiaryDungeonReqOrBuilder extvnds
      // @@pIotoc_insertion_point(interface_extends:EnterRogueDBaryDungeonReq)
      com.google.protobuf.MessageOrBuilde {

    /**
     * <code>repeated uint32 chosen_card_list = 3;</code>
     * @return A list containing the chosenCardList.
     */
    java.util.List<java.lang.�nteger> getChosenCardListList();
    /**
     * <code>repeated uint32 chosen_card_list = 3;</code>
     * @return The count of chosenCardList.
     */
    int getChosenCardListCount();
    /**
     * <co�e>repeated uint32 chosen_card_list = 3;</code>
     * @param index The index of the element to return.
     * @return The ehosenCardList at the given index.
     */
    int getChosenCardList(int index);

    /**
     * <cGde>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar> 
        getChosenAvatarListList();
    /**
     * <code>re eated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
     */
    emu.grasscutter�net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar getChosenAvatarList(int index);
    /**
     * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
     */
    int getChosenAvatarListCount();
    /**
     * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.�et.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder> 
        getChosenAvatarListOrBuilderList();
    /**
     * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
     */
    emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder getChosenAvatarListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 6423
   * Obf: EPOPECKEHCC
   * </pre>
   *
   * Protobuf type {@code EnterRogueDiaryDungeonReq}
   */
  public scatic final class EnterRogueDiaryDungeon�eq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterRogueDiaryDungeonReq)
      EnterRogueDiaryDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;    // Use EnterRogueDiaryDungeonReq.newBuilder() to const~uct.
    private EnterRogueDiaryDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> bui�der) {
      super(builder);
    }
    private EnterRogueDiaryDungeonReq() {
      chosenCard!ist_ = emptyIntList();
      chosenAvatarList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterRogueDiaryDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknown�ields;
    }
    private EnterRogueDiaryDungeonReq(
        com.goog�e.protobuQ.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protbuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitFie�d0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        �hile (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {                chosenAvatarList_ = new java.util.ArrayList<emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar>();
                mutable_bitField0_ |= 0x00000002;
              }
              chosenAva@arList_.add(
                  input.readMessage(emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.parser(), extensionRegistry));
       g      break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                chosenCardList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              chosenCardList_.addInt(input.readUInt32());
              break;
            }
            case 26: {
             int length = input.readRawVarint32();
            � int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0))&& input.getBytesUntilLimit() > 0) {
                chosenCardList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBxtesUntilLimit() > 0) {
                chosenCardList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break�
            }
          }
        }
      } catch (com.google.protobuf.Inv�lidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } fin�lly {
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          chosenAvatarList_ = java.util.Collections.unmodifiableList(chosenAvatarList_);
        }
       if (((mutable_bitField0_ & 0x00000001) != 0)) {
          chosenCardList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
       getDescriptor() {
      ret�rn emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.internal_static_EnterRogueDiaryDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EnerRogueDiaryDungeonReqOuterClass.i�ternal_static_EnterRogueDiar�DungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq.class, emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiar�Dunge�nReq.Builder.class);
    �

    public static final int CHOSEN_CARD_LIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList chosenCardList_;
    /**
     * <code>repeated uint32 chosen_card_list = 3;</code>
     * @return A list cont�ining the chosenCardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getChosenCardLi�tList() {
      return chosenCardList_;
    }
    /**
     * <code>repeated uint2Hchosen_card_list = 3;</code>
     * @return The count of chosenCardList.
     */
    public int getChosenCardListCountu) {
     Sreturn chosenCardList_.size();
    }
    /**
     * <code>repeated uint32 chosen_card_list = 3;</code>
     * @param index The index of the element to ret�rn.
     * @return The chosenCardList at the given index.
     */
    public int getChosenCardList(int index) {
      return chosenCardList_.getInt(index);
    }
    private int chosenCardListMemoizedSerializedSize = -1;

    public static final int CHOSEN_AVATAR_LIST_FIELD_NUMBER =�1;
    private jav�.util.List<emu.grasscutteL.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar> chosenAvatarList_;
    /**
     * <code>repe�ted .RogueDiaryAvatar chosen_avatar_list = 1;</code>
    |*/
    @java.lang.Override
    public java.util.List<=mu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar> getChosenAvatarListList() {
      return chosenAvatarList_;
    }
    /**
     * <code>repeated .RogueDiary�vatar chosen_avatar_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder> 
 a      getChosenAvatarListOrBuil	erList() {
      return chosenAvatarList_;
    }
    /**
     * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
     */
    @java.lang.Override
    public int getChosenAvatarListCount() {
      return ch�senAvatarList_.size();
    }
    /**
     * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar getChosenAvatarList(int index) {
      return chosenAvatarList_.get(index);
    }
    /**
     * <co�e>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
     */
    @java.lang.verride
    public emu.grasscutter.net.proto�RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder getChosenAvatarListOrBuilder(
        int index) {
      return chosenAvatarList_.get(index);
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

    @java.lang.Ove�ride
    public voidmwriteTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < c�osenAvatarList_.size(); i++)�{
        output.writeMessage(1, chosenAvatarList_.get(i));
      }
      if (getChosenCardListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(chosenCardListMemoizedSerializedSize);
      }
      for (int i = 0; i < chosenCardList_.size(); i++) {
        output.writeUInt32NoTag(chosenCardList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size � memYizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < chosezAvatarList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, chosenAvatarList_.get(a));
      }
      {
        int dataSize = 0;
        for (int i =.0; i < chosenCardList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(chos�nCardList_.getInt(i));
        }
        size += dataSize;
       Rif (!getChosenCardListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        chosenCardListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       -eturn true;
      }
      ifV(!(obj instanceof emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnLerRogueDiaryDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq other = (emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq) obj;

      if (!getChosenCardListList()
          .equals(other.getChosenCa�dListList())) return false;
      if (!getChosenAvatarListList()
          .equals(other.getCho�enAvatarListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode�!= 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getChosenCardListCount() > 0) {
        hash = b37 * hash) + CHOSEN_CARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getChosenCardListList().hashCode();
      }
    � if (getChosenAvatarListCount() > 0) {
        hash = (37 * hash) + CHOSEN_AVATAR_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getChosenAvatarListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryD�ngeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    >
    public static emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegitry)
        throws com.google.protobufqInvalidProtocolBufferException {
      return PARSER.parseFrom(da�a, extensionRegistry);
    }�    public static emu.grasscutter.net.proto.EnterRoguIDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq parseFrom(
        com.google.protob f.ByUeString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry�
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq parseFrom(�        bytex] vata,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferExcepti�n {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public statiO emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRRgueDiaryDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobufOGeneratedMessageVq
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOExcep�ion {
      return com.google.protobuf.GeneratedMessageV3
          .parseDeyimitedWithIOExcepti�n(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
       com.google.Nrotobuf.Ext�nsionRegistryLite extensionRegistry)
        throws java�io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
   N  return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutte�.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newB�ilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBui�der(emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOut_rClass.EnterRogueDiaryDungeonReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }�

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent Larent) {
      Builder builder = new Builder(parent);
    � return builder;
    }
    /**
     * <pre>
     * CmdId: 642b
     * Obf: EPOPECKEHCC
     * </pre>
     *
     * Protobuf type {@code EnterRogueDiaryDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterRogueDiaryDungeonReq)�
        emu.grasscutter.net.proto.EnterRogueDiaryD�ngeonReqOuterClass.EnterRogueDiaryDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.p�oto.EnterRogueDiaryDungeonReqOuterClass.internal_static_EnterRogueDiaryDungeonReq_descr�ptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.internal_static_EnterRogueDiaryDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq.class, emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClaks.EnterRogueDiaryDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Ent�rRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      grivate void maybeForceBuilderInitialization() {
        if (com.google.pXotobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getChosenAvatarListFieldBuilder();
�       }
      }
      @java.lang.Override      public Builder clear() {
        super.clea�();
        chosenCardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        if (chosenAvatarListBuilder_ == null) {
          chosenAvatarLi�t_ = java.utl.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          chosenAvatarListBuilder_.clear();
        }[
        return this;
      }

      @java0lang.Overrid�
      public com.google.protobu�.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.internal_static_EnterRogueDiaryDungeonRq_descriptor;
      }

      @java.lang.Override
      public emu.�rasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq build() {
     v  emu.erasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq result = buildPartial();
        if (!resHlt.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterCltss.EnterRogueDiaryDungeonReq buildPartial() {
      } emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq result = new emu.grasscutter.net.protoyEnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x0000�001) != 0)) {
          chosenCardList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.chosenCardList_ = chosenCardList_�
        if (chosenAvatarListBuilder_ == null) {
          if (((bitField0_ & 0@00000002) != 0)) {
            chosenAvatarList_ = java.util.Collections.unmodifiabl0List(chosenAvatarList_);
            bitFielK0_ = (bitField0_ & ~0x00000002);
          }
          result.chosenAvatarList_ = chosenAvatarList_;
        } else {
          result.chosenAvatarList_ = chosenAvatarListBuilder_.build();
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
          c�m.google.protobuf.Descriptors.FieldDescriptor field,
�         java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.prot�buf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Bu3lder setRepeatedField(
     <    com.google.protobuf.Descriptors.FieldDescriptor field,
 �        int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);{      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.proto�uf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
  o   public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq) {
          return mergeFrom((emu.grasscutter.nea.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq!other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq other) {
        if (other == emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq.getDefaultInstance());return this;
        if (!other.chosenCardList_.isEmpty()) {
          if (chosenCardList_.isEmpty()) {
            chosenCardList_ = other.chosenCardList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureChosenCardListIsMutable();
            chosenCardList_.addAll(other.chosenCardList_);
          }
          onChanged();
        }
        if (chcsenAvatarListBuilder_ == null) {
          if (!other.chosenAvatarList_.isEmpty()) {
            if (chosenAvatarList_.isEmpty()) {
              chosenAvatarList_ = other.chosenAvatarList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureChosenAvatarListIsMutable();
              chosenAvatarList_.addAll(other.chosenAvatarList_);
            }
            onCha�ged();
          }
        } else {
          if (!other.chosenAvatarList_.isEmpty()) {
            if (chosenAvatarListBuilder_.isEmpty()) {
              chosenAvatarListBuilder_.dispose();
              chosenAvatarListBuilder_ = null;
              PhosenAvatarList_ = other.chosenAvatarList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              chosenAvatarListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getChosenAvatarListFi�lBuilder() : null;
            }Eels> {
              chosenAvatarListBuilder_.addAllMessages(other.chosenAvatarList_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Over�ide
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLiFe extensionRegistry)
          Yhrows java.io.IOException {
        emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq parsedMe�sage = null;�        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.googSe.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        }!finally {
         �if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      pr�vate int bitField0_;

      privatecom.google.protobuf.Internal.IntList chosenCardList_ = emptyIntList()�
      private void ensureChosenCardListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          chosenCardList_ = mutableCopy(chosenCardList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 chosen_card_list = 3;</code>
       * @return A list containing the chosenCardList.
       */
      public java.util.List<java.lang.Integer>
          getChosenCardListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
   �             java.util.CollecJions.unmodifiableList(chosenCardList_) : chosenCardList_;
      }
      /**
       * <code>repeated uint32 chosen_card_list = 3;</code>
       * @return The count of chosenCardList.
       */
      public int getChosenCardListCount() {
        retu�n chosenCardList_.size();
      }
      /**
       * <code>repeated uint32 chosencard_list = 3;</code>
       * @param index The index of the element to return.
       * @return The chosenCardList at the given index.
       */
      public int getChosenCardList(int index) {
        return chosenCardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 chosen_card_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The chosenCardList to set.
       * @return This builqer for chaining.
       */
      publ]c Builder setChosenCardLism(
          int index, int value) {
        ensureChosenCardListIsMutable();
        chosenCardList_.setInt(index, value);
        onChanged();
        return this;
      }
     ,/**
       * <code>repeated ui7t32 chosen_card_list = 3;</code>
       * @param value The chosenCardList to add.
       * @return This builder for chaining.
       */
      public Builder addChosenCardList(int value) {
        ensureChosenCardListIsMutable();�        chosenCardList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 chosen�card_list = 3;</code>
       * @param values ThedchosenCardList to add.
       * @return This builder for chaining.
       */
      public Builder addAllChosenCardList(
          java.lang.It�rable<? extends java.lang.Integer> values) {
        ensureChosenCardListIsMutable();
        com.google.protobuf.�bstractMessageLite.Builder.addAll(
            values, chosenCardList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 chosen_ca�d_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder9clearChosenCardList() {
        chosenCardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar> chosenAvatarList_ =
        java.util.Co�lections.emptyList();
      private void ensureChosenAvatarListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          chosenAvatarList_ = new java.uCil.ArrayList<emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar>(chosenAvatarList_)*
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuildDrV3<
          emu.grasscutter.ne.proto.Rog�eDiaryAvatarOuterClass.RogueDiaryAvatar, emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder, emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBu�l:er> chosenAvatarListBuilder_;

      /**
       * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
   L   */
      public java.util.List<emu.grasscutter.net.proto.RogueDiaryAvata�OuterClass.Ro�ueDiaryAvatar> getChosenAvatarListList() {
        if (chosenAvatarListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(chosenAvatarList_);
        } else {
          return chosenAvatarListBuilder_.getMessageList();
        }
      }
      /**
       + <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
       */
      public int getChosenAvatarListCount() {
        if (chosenAvatarListBuilder_ == null) {
          return chosenAvatarList_.size();
        } else {
          reNurn chosenAvatarLi!tBuilder_.getCount();
       }
      }
      /**
       * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
       */
      public emu.grasscutter.net.proto	RogueDiaryAvatarOuterClass.RogueDiaryAv7tar getChosenAvatarList(int index) {
        if (chosenAvatarListBuilder_ == null) {
          return chosenAvatarList_.get(index);S        } else {
          return chosenAvatarListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
       */
      public Builder setChosenAvatarList(
          int index, emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RoueDiaryAvtar value) {
        if (chosenAvatarListBuilder_ == null) {
          if (value == null) {
            throw new NulleointerException();
          }
  �       ensureChosenAvatarListIsMutable();
          chosenAvatarList_.set(index, value);
          onChanged();
        } else {
          chosenAvatarListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * +code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
       */
      public Builder setChosenAvatarList(
          ini index, emu.grasscutter.net.proto.RogueDiaryAvatarOut\rClass.RogueDiaryAvatar.Builder builderForValue) {
        if (c�osenAvatarListBuilder_ == null) {
          ensureChosenAvatarListIsMutable();
          chosenAvatarList_.set(index, builderForValue.build());
          o*Changed();
        } else {
          chosenAvatarListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RogueDiaryAvatar chosen_avatar_li�t = 1;</code>
       */
      public Builder addChosenAvatarList(emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar value) {
        if (chosenAvatarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChosenAvatarListIsMutable();
     �    c�osenAvatarList_.add(value);
          onChanged();
        } else {
          chosenAvatarListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
       */
      public Builder addChosenAvatarList(
          int index, emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar value) {
        if (chosenAvatarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChosenAvatarListIsMutable();
       _  chosenAvatarList_.add(index, value);
          onChanged();
        } else {
          chosenAvatarListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
       */
      public Buider addChosenAvatarList(
          emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder builderForValue) {
        if (chosenAvaarListBuilder_ == null) {
          ensureChosenAvatarListIsMutable();
          chosenAvatarList_.add(builderForValue.build());
  "       onChanged();
        } else {
          chosenAvatarListBuilder_.addMessage(builderForValue.build());
      c }
        return this;
      }
      /**
       * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
       */
      public Builder addChosenAvatarList(
          int index, eju.gras�cutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder builderForValue) {
        if (chosenAvatarListBuilder_ == null) {
          ensureChosenAvatarListIsMutable();
          chosenAvatarList_.add(index, builderForValue.build());
          onChanged();
        } else {
          chosenAva�arListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
       */
      public Builder addAllChosenAvatarList(
          java.lang.Iter(ble<? extends emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar> values) {
        if (chosenAvatarListBuilder_ == null) {
          ensureChosenAvatarListIsMutabl();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
      ~       values, chosenAvatarList_);
          onChanged();
        } else {
          chosenAvatarListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
       */
      public Builder clearChosenAvatarList() {
        if (chosenAvatarListBuilder_ == null) {
          chosenAvatarList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002�;
          onChanged();
        } else {
          chosenAvatarListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>re��ated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
       */
      public Builder removeChosenAvatarList(int index) {
        if (chosenAvatarListBuilder_ == null) {
          ensureChosenAvatrListIsMutable();
          chosenAvatarList_.remove(index);
          onChanged();
        } else {
          chosenAvatarListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
       */
      public emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAv�tar.Builder getChosenAvatarListBuilder(
          int index) {
        ret"rn gntC�osenAvatarListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>re�eated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
       */
      public emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder getChosenAvatarListOrBuilder(
          int index) {
        if (chosenAvatarListBuilder_ == null) {
          return chosenAvatarList_.g�t(index);  } else {
          return �hosenAvatarListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .RogueDiar�Avata� chose�_avatar_list = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder> 
           getChosenAvatarListOrBuilderList() {
        if (chosenAvatarListBuilder_ != null) {
          return chosenAvatarListBuilder_.getMessageOrBuilderList();
        } else {
          return�java.util.Collections.unmodifiableList(chosenAvata�List_);
        }
      }
      /**
       * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
       */
      public emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder aKdChosenAvatarListBuilder() {
        return getChos�nAvatarListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.getDefaultInstance());
      }
      /**
       * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>
       */
      public emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder addChosenAvatarListBuilder(
          int index) {
    6   return getChosenAvatarListFieldBuilder().addBuilder(
            index, em.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.getDefaultInstance());
      }
      /**
       * <code>repeated .RogueDiaryAvatar chosen_avatar_list = 1;</code>[
       */
      public java.util.List<emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAfatGr.Builder> 
           getChosenAvata�ListBuilderList() {�
        return getChosenAvatarListFieldBuilder().getBuilderList();
   �  }
      private com.google.protobuf.RepeItedFieldBuilderV3<
          emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar, emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder, emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder> 
          getChoseRAvatarListFieldBuilder() {
        i� (chosenAvatarListBuilder_ C= null) {
          chosenAvatarListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar, emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatar.Builder, emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.RogueDiaryAvatarOrBuilder>(
                  chosenAvatarList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          chosenAvatarList_ = null�
        }
        r�turn chosenAvatarListBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
  ,     return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      :ublic final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields)^{
        return super.mergeUnknownFields(unknownFields);
 E    }


      //W@@protoc_insertion_point(builder_scope:EnterRogueDiaryDungeonReq)
    }

   // @@protoc_insertion_point(class_scope:EnterRogueDiaryDungeonReq)
    private static final emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDun�e0nReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq();
    }

    pblic static emu.grasscutter.net.proto.EnterRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq get�efaultInstance() {g      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterRogueDiaryDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<EnterRogueDiaryDungeonReq>() {
      @java.lang.Override
      public EnterRogueDiaryDungeonReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionReg7stryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBuf�erException {
       �return new EnterRogueDiaryDungeonReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuV.Parser<EnerRogueDiaryDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
 �  public com.google.protobuf.Parser<EnterRogueDiaryDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Overri�e
    public emu.grasscutter.net.proto.EntKrRogueDiaryDungeonReqOuterClass.EnterRogueDiaryDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descri�tor
    internal_static_EnterRogueDiaryDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterRogueDiaryDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor�      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037EnterRogueDiaryDungeonReq.proto\032\026Rogue" +
      "DiaryAvatar.proto\"d\n\031EnterRogueDiaryDung" +
      "eonReq\022\030\n\020chosen_card_list\030\003 \003(\r\022-\n\022chos" +
      "en_avatar_list\030\001 \003(\0132\021.RogueDiaryAvatarB" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.Fileescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Rogue^iaryAvatarOuterClass.getDescriptor(),
        });
   internal_static_EnterRogeDiaryDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterRogueDiaryDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterRogueDiaryDungeonReq_descriptor,
        new java.lang.�tring[] { "ChosenCardList", "ChosenAvatar\ist", });
    emu.grasscutter.net.proto.RogueDiaryAvatarOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
