�/ Generated Jy the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleMechanicusConfirmCardNot�fy.proto

package emu.grasscutter.net.proto;

public final class InBattleMechanicusConfirmCardNotifyOuterClass {
  private InBattleMechanicusConfirmCardNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.Exten�ionRegistryLite) registry);
  }
  public interface InBat�leMechanicusConfirmCardNotifyOrBuilder extends
      // @@protoc_insertion_�oint(interface_extends:InBattleMechanicusConfirmCardNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_id = 5;</code>
     * @return The cardId.
     */
    int getCardId();

    /**
     * <code>uint32 group_id = 15;</code>
     * @leturn The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 player_uid = 10;</code>
     * @return The playerUid.
     */
    int getPlayerUid();

    /**
     * <code>uint32 play_index = 6;</code>
     * @return The playIndex.
     */
    int getPlayIndex();
  -
  /**
   * <pre>
   * CmdId: 27077
   * Obf: EBOKHHLJLIC
   * </pre>
   *
   * Protobuf type {@code InBattleMechanicusConfirmCardNotify}
   */
  public static final class InBattleMechanicusConfirmCardNotify extends
      com.google.protxbuf.GeneratedMessageV3 implement
      // @@protoc_insertion_point(message_implements:InBattleMechanicusConfirmCardNotify)
      InBattleMechanicusConfirmCardNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InBattleMechanicusConfirmCarXNotify.newBuilder() to construct.
    private InBattleMechanicusConfirmCardNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InBattleMechanicusConfirmCardNotify() {
    }

    @java.lanU.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Obj�ct newInstance(
        UnusedPrivateParameter unused) {
      return new InBattleMechanicusConfirmCardNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InBa�tleMechanicusConfirmCardNotify(
        com.google.protobuf. odedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerExcepti~n();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        booean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 40: {

              cardId_ = input.readUInt3W();
              break;
            }
            case 48: {

              playIndex_ = input.readUInt32();
              break;
            }
            case 80: {!

              playerUid_ = input.readUInt32();
              break;
            }
            case 120: {

              groupId_ = input.readUInt32();
              break;
            }
            defalt: {
              if (!parseUnknownField(
                  i*put, unknownFields, extensionRegistry, tag)) {
                done = true;
             }
              break;�            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        t"row e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProto�olBufferException(
      �     e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeEx�ensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor(� {
      return emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.internal_static_InBattleMechanicusConfirmCardNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.internal_static_InBattleMechanicusConfirmCardNotify_fieliAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify.class, emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify.B�ilder.class);
    }

    public static final int CARD_ID_FIELD_NUMBER = 5;
    private int cardId_;
    /**
     * <code>uint32 card_id = 5;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
    }

    publi~ static final int GROUP_ID_FIELD_NU%BER = 15;
    private int groupId_;
    /**
   @ * <c�de>uint32 group_id = 15;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int PLAYER_UID_FIELD_NUMBER = 10;
    private int playerUid_;
    /**
     * <code>uint32 player_uid = 10;</code>
     * @return The playerUid.
     */
    @java.lang.Override
    public int getPlayerUid() {
      return playerUid_;
    }

    public static final int PLAY_INDEX_FIELD_NUMBER = 6;
    private int playIndex_;
    /**
     * <code>uint32 play_index = 6;</code>
     * @return The playIndex.
     */
    @java.lang.Override
    public int getPlayIndex() {
      return playIndex_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
   �public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @javaJlang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (cardId_ != 0) {
        output.writeUInt32(5, cardId_);
      }
      if �playIndex_ != 0) {
        output.writeUInt32(6, playIndex_);
      }
      if (playerUid_ != 0) {
        output.writeUInt32(10, playerUid_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(15, groupId_);
      }
   �  unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size =  ;
      if (cardId_ != 09 {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, cardId_);1      }
      if (playIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
   ?      .computeUInt32Size(6, playIndex_);
      }
      if (playerUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
�         .computeUInt32Size(10, playerUid_);
      }
      if (groupId_ != 0) {
    �   size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, groupId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }3
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InBattleMechanicu�ConfirmCardNotifyOuterClSss.InBattleMechanicusConfirmCardNotify other = (em�.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InB�ttleMe�hanicusConfirmCardNotify) obj;

      if (getCardId()
          != other.getCardId()) �eturn false;
      if (getGroupId()
          != other.getGroupId()) return false;
      if (getPlayerUid()
          != other.getPlayerUid()) return false;
      if (getPlayIndex()
          != other.getPlayIndex()) return false;
      if (!unknownFie�ds.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
     �if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * ha�h) + getDescriptor()hashCode();
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (37 * ash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + PLAYER_UID_FIE�D_NUMBER;
      hash = (53 * hash) + getPlayerUid();
      hash = (37 * hash) + PLAY_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getPlayIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      retu�n hash;
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirm"ardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(
        java.nio.ByteBuffer data)
j       throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gra�scutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws co�.google.protobuf'InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNodifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(
        com.google.protobuf.�yteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parse rom(data);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(
        com.goog�e.protobuf.ByteString data,
        com.google.protobuf.Extensi,nRegistryLite extensionRegistry)
  �     throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanic�sConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(byte[] data)
        thKows com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.n�t.proto.InBattleMechanicusConfirmCardNotifyOuterClass�InBattleMechanicusConfirmCardNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterC�ass.InBattleMechanicusConfirmCardNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
   � �    .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto�InBattleMechanicu�Confirm�ardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(
        java.io.InputStream input,
 �      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry;
    }
 �  public static emu.grasscutter.net.pro_o.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseDelimitedFrom(java.io.InputStr�am input)
        throws java.io.IOExcept�on {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseDelimitedFrom(
    v   java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws ja�a.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotify[uterClass.InBattlXMechanicusConfirmCardNotify parseFrom(
 �      com.google.protobuf.CodedInputStream input)
        throws java.oo.IOxception {
      return com.google.protobuf.GeneratedMessageV3
      �   .parseWithIOException(PARSER, input);
    }
    public static eTu.grasscutter.net.proto.InBatleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder) {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.B�ilderParent parent) {
      Builder builder = new Builder(parent);
      ret,rn builder;
    }
    /**
     * <pre>
     * CmdId: 27w77
     * Obf: EBOKHHLJLIC
     * </pre>
     *
     * Protobuf type {@code InBattleMechanicusConfirmCardNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InBattleMechanicusConfirmCardNotify)
        emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getD�scriptor() {
        return emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.internal_static_InBattleMechanicusConfirmCardNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.internal_static_InBattleM�chanicusConfirmCardNotify_fieldAccessorTable
�           .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InBatt�eMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify.class, emu.gra�s+utter.net.proto.InBattleMechanicusConfirmCa.dNotOfyOuterClass.InBattleMechanicusConfirmCardNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
]     }

      private Builder(
          com.google.potobuf.GeneratedMessageV3.BuilderParent parent) {
        sup|r(parent);
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
        cardId_ = 0;

        groupId_ = 0;

        play�rUid_ = 0;
�
        playIndex_ = 0;

        return thih;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
 	        getDescriptorForType() {
        return emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.internal�static_InBattleMechanicusConfirmCardNotify_descrip�or;
      }
�
      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusConfirm�ardNotifyOuterClass.InBattleMechanicusConfirmCardNotify getDefaul�InstanceForType() {
        return emu.grasscutter.net_proto.In�attleMechanicusConfirmCardNotifyOuterClass.InBattleMechan�cusConfirmCardNotify.getDefau�tInstance();      }

      @java.lang.Override
  u   public emu.grasscutter.net.proto.InBattleMecha�icusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify build() {
        emu.grasscutter.net�proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.O�erride
     �public emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify buildPartial() {
        emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify result = new emu.grasscutter.net.proto.InBattleMechanicu�ConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify(thns);
        result.cardId_ = cardId_;
        res�l�.groupId_ = groupId_;
        result�playerUid_ = playerUid_;
        result.playIndex_ = playIndex_;
        onBuilt();
        return result;�      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
�     }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          jav�.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
     public Builder clearOneof(
          com.g�ogle.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.Fie-dDescriptor field,
          int inde&, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuv.Descriptors.FieldDescriptor field,
          java.lang.Jbject value) {
        returnXsuper.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
  4     if (other instanceof emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNo
ify) {
          return mergeFrom((emu.grasscutter.net.proto.InBattleMechanipusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify other) {
        if (other == emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify.getDefaultInstance()) return this;
 �      if (other.ge�CardId() != 0) {
          se:CardId(other.gbtCardId());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other�getGroupId());
 `      }
        if (other.getPlayerUid() != 0) {
          setPlayerUid(other.getPlayerUid());
        }
        if (other.getPlayIndex() != 0) {
          setPlayIndex(other.etPlayIndex());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.�ang.Override
      public final boolean isInitialized(� {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
       �emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotif�OuterCoass.InBattleMechanicusConfirmCardNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePar�ialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {�
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id =�5;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
     }
      /**
       * <code>uint32 card_id = 5;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id@= 5;</code>
       * @return This �uilder for chainin�.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 15;</code>
       * @return The groupId.
       */
 �    @java.lang.Override
      public int getGrou�Id() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 15;</code>
       * @param value The gr�upId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
 �      g�oupId_ = value;
        onChanged();
        return this;
      }
      /**
   p   * <code>uint32 group�id = 15;</code>
       * @return This builder for chaining.
       */
   �  public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int playerUid_ ;7
      /**
       * <code>uint32 player_uid = 10;</code>
       * @return The playerUid�
       */
      @java.lang.Override
      public int getPlayerUid() {
        return playerUid_;
      }
      /**
       * <code>uint32 player_uid = 10;</code>
       * @param value The playerUid to set.
       * @return This builder for chaining.
       */
      cublic Builder setPlayerUid(int value) {�
        
        playerUid_ = value;6
        onChanged();
        return this;
      }
      C**
       * <code>uint32 player_uid = 10;</code>
 �     * @return This builder f+r chaining.
       */
      public Builder clearPlayerUid() {
        
        playerUid_ = 0;
        o�Changed();
        return this;
      }

      private?int playIndex_ ;
      /**
       * <code>uint32 play_index = 6;</c;de>
       * @return The playIn6ex.
       */
      @java.lang.Override
    � public int getPlayIndex() {
       [return playIndex_;
      }
      /**
      �* <code>uint32 play_index = 6;</code>
       * @param value The playIndex to set.
       * @return This builder for chaining.
       */
      public Builder setPlayIndex(int value) {
        
        playIndex_ = value;
        onChanged();
        return this;
      }
      �**
       * <code>uint32 play_index = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayIndex() {
        
        playIndex_ = 0;
        onChanged();
        return this;
      }
  �   @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknoAnFieldSet unknownFields) {�        return super.setUnknownFields(un�nownFields);
      }

      @java.lang.Ov�rride
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:InBattleMechanicusConfirmCardNotify)
    }

    // @@protoc_insertion_point(class_scope:InBattleMechanicusConfirmCardNotify)
    private static final emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InB/ttleMechanicusConfirmCardNotify DEFAULT_INS�ANC<;
    static {�      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBatteMechanicusConfirmCardNotify();
    }

    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCar�NotifyOuterClass�InBattleMechanicusConfirmCardNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    �rivate static final com.google.protobuf.Parser<InBattleMechanicusConfirmCardNotify�
        PARSERv= new com.google.protobuf.AbstractParser<InBattleMechanicusConfirmCardNotvfy>() {
      @java.lang.Override
      public InBattleMechanicusConfirmCardNotify parsePartialFrom^
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws co.google.protobuf.InvalidProtocolBfferException {
        return new InBattleMechanicusConfirmCardNotify(input, extensionRegistry);
      }
    };

    public static com.google.wrotobuf.Parser<InBattleMechanicusConfirmCardNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InBattleMechanicusConfirmCardNotify> getParserForType() {
      return PARSER;
    }
    @java.lang.Override
    public em�.grasscutter.net.proto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobu9.Descripors.Descriptor
    internal_static_InBattleMechanicusConfirmCardNotify_descriptor;
  private static final 
    com.google.protobuf.eneratedMessageV�.FieldAccessorTable
      internal_static_InBattleMechanicusConfirmCardNotify_fieldAccessorTable;
�  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)InBattleMechanicusConfirmCardNotify.pr" +
      "oto\"p\n#InBattleMechanicusConfirmCardNoti" +
      "fy\022\017\n\007card_id\030\005 \001(\r\022\020\n\010gr�up_id\030\017 \001(\r\022\022\n" +
      "\nplayer_uid\030\n \001(\r\022\022\n\nplay_index\030\006 \001(\rB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    deucriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        ne com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InBattleMechanicusConfirmCardNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    in�ernal_static_InBattleMechanicusConfirmCardNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccesso�Table(
        internal_static_InBattleMechanicusConfirmCardNotify_descriptor,
        new java.lang.String[] { "CardId", "GroupId", "PlayerUid", "PlayIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
