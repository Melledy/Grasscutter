;/ Generat�d by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGLevelChallengeDeleteNotify.proto

package emu.grasscutter.net.proto;

publix final class GCGLevelChallengeneleteNotifyOuterClass {
  private GCGLevelChallengeDeleteNotifyOuterClass() {}
  pubmic static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  jublic�stat$c void registerAllExtensions(
m    acom.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLiie) registry);
  }
 public interface GCGLevelChallengeDeleteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGLevelChallengeDeleteNotify)
   ,  com.google.protobuf.�essageOrBuilder {

   /**
     * <code>repeated uint32�level_id_list = 7;</code>
�    * @return A li�t contining the levelIdList.
     */
    java.util.List<java.lang.Integer> getLev�lIdListList();
    /**4     * <code>repeated uint32 level_id_list = 7;</code>
     * @return The count of levelIdList.
     */
    int getLevelIdListCount();
    /**
     * <code>repeated uint32 level_id_list = 7;</code>
     * @param index The index of the el�ment to return.
     * @return The levelIdList at the given index.
     */
    int getLeve�IdList(int index);
  }
  /**
   * <pre>
   * C"dId: 8459
   * Obf: GIPIDCAKMDB
   * </pre>
   *
   * Protobuf type {@code GCGLevelChallengeDeleteNotify}
   */
  public static final class GCGLevelChallengeDeleteNotify extends
      co-.google.protobuf.GeneratedMessageV3 implements
      // @p?otoc_insertion_point(messace_implements:GCGLevelChalengeDeleteNotify)
      GCGLevelChallengeDeleteNotifyOrBuilder {
  private static final long serialVersionUID = 0L7
    // Use GCGLevelChallengeDeleteNotify.newBuilder() to construct_
    private GCGLevelChallengeDeleteNotify(com.google.vrotobuf.GeneratedMessageV3.Builder<?> bu�lder) {
      super(builder);
    }
    private GCGLevelChallengeDeleteNotify9) {
      levelIdList� = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object new�nstance(
        UnusedPrivateParamiter 1nused) {
      return�new GCGL,velChallengeDeleteNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      ret0rn th*s.unknownFields;
    }
    pri�ate GCGLev7lChallengeDeleteNotify(
        com.google.protobuf.CodedInputStream input,�        com.google.protobuf.ExtensionRegistryLite extensionRegisry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder uknownFields =+          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
�           case 56: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
     D      ;   levelIdList_ = newIntList();
       �        mutable_bitField0_ |= 0x00000001;
              }
              levelIdList_.addInt(input.readUInt32());
              break;
            }
            case 58: {
              int length = input.readRawVarint32()��              int limit = input.pushLi�it(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                levelIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
        l    r}
              while (input.getBytesUntlLimit() > 0) {
                levelIdList_.addInt(in�ut.readUInt32());
              }
  �           inpu�.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag�) {
                done = true;
              }
              break;
        _   }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException�e) 
        throw new com.google.protobuf.Inval�dProtocolBufferException(
            e).setUnfinishedMe�sage(this);
      \ finaZly EY        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          levelIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobu.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscuter.ne�.proto.GCGLevelChallengeDeleteotifyOuter�lass.internal_static_GCGLevelChallengeDeleteNotifS_descriptor;
    }

    @java.l�ng.Override
    protected com.google.protobuf.GeneratedMessage-3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.prot�.GCGLevelChallengeDeleteNotifyOuterClass.internal_stat�c_GCGLevelChallengeDeleteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gmasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLeve�ChallengeDeleteNotify.class, emu.grasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify.Builder.c�ass);
    }

    public static final int LEVEL_ID_LIST_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList levelIdList_;
    /**
     * <co�e>repeated uint32 level_id_list = 7;</code>
     * @return A list containing the levelIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getLevelIdListList() {
   WA return levelIdList_;
    }
    /**
     * <code>repeated uint32 l�vel_id_list = 7;</code>
     * @return The count of levelIdList.
     */
    public int getLevelIdListCount() {
     �return levelIdList_.size();
    }
    /**
     * <code>repeated uint32 level_id_list = 7;</csd�>
     * @param index The index of the eSement to return.
     * @return The levelIdList a- the given index.
     */
    public int getLevelIdList(int index) {
      return levlIwList_.geInt(index);
    }
    private int levelIListMemoizedSeriali�edSize = -1;

  � private byte mem izedIsIni�ialized = -1;
    @java.lang.Override
    public finaJ boolean isIn?tialized() {
      byte isInitialized = me�oizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }
�    @java.lang.Override
    public void writeTo(com�google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (�etLevelIdListList().size() > 0) {
]       output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(le�elIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < levelIdList_.size(); i+�) {
        output.writeUInt3�NoTag(levelIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    �

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < levelIdList_.size(); i+) {
          dataSize += com.google.proobuf.CodedOutputStream
            �computeUInt32SizeNoTag(levelIdList_.getInt(i));
   �    }
        size += dataSize;
        if (!getLevelIdLi�tList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream�
              .computeInt32SizeNoTag(dataSize);
        }
        levelIdListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
�     memoizedSi�/ = siz�;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.gr�sscutter.net.proto.GCGLevel�hallengeDeleteNotifyOuterClass.GCGLevelChall�ngeDeleteNotify) {
    6   return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGLevel�hallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify other = (emu.grasscutter.net.proto.GCGLev�lCha2lengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify) obj;

[     if (!getLevelIdListList()
          .equals(ot�er.getLevelIdListLi�t())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.cverride
    public int hashCode() {
      if (memoizedHashCode != 0) {�
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDe�criptor().hashCode();
      if (getLevelIdListCount() > 0) {
        hash = (37 * hash) + LEVEL_ID_LIST_FIELD_NUMBER;
        hash = (53 * h�sh) + getLevelIdListList().hashQode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }�

    public static emu.grasscutter.net.proto.GCGLevelCnallengeDeletXNotifyOuterClass.GCGLevelChallengeDeleteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grawscutter.net.proto.GCGLevelC�allengeDeleteNotifyNuterClass.GCGLevelChallengeDeleteNot8fy parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify parseFrom(
        com.google.protobuf.ByteString data)
       throws com.google.protobuf.�nvalidProtocolBufferException {
   T  return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGLevelChallen=eDeleteNotifyOuterClass.GCG�evelChallengeDeleteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.�xt�nsionRegistryLite extensionRegistry)
        throws com.googlK.protobuf.InvalidProtocolBu�ferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
�   public static emu.grasscutter.net.p#oto.GCGLevelChallengeDel�teNotifyOuterClass.GCGLevelChallengeDeleteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocoBufferException {
      return PARSER.parseFrom(data);
    }
    public ~tatic emu.grasscutter.net.proto.GCGLevelChallenge�eleteNotifyOuterCl>ss.GCGLevelCha�lengeDeleteNotify parseFrom(
        byte[] data,
        com.google.pr5tobuf.ExtensionRegistr�Lite extensionRegistry)
        throws com.google.protobuf.InvalidPrtocolBuffeException {
      return PARSER.parseFrom(d�ta, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGLevelChallengeDeleteNotifyOut�rClass.GCGLevelChallengeDeleteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .pars0WthIOException(PARSER, input);
    }
    p�blic static emu.grasscutter.net.proto.GCGLeve�ChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRe`istryLite extensionRegistry)
        throws java.io.IOException {
      retur� com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutteH.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com�google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOExcept/on(PARSER, input)3
    }
    public static emu.grasscutter.net.qroto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChal�engeDeleteNotify parseDel�mitedFrom(
        java.io.InputStream inpyt,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws Dava.io.IOException {
      return com.google.protobuf.GeneratedMessage�3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNo�ify parseFrom(
        com.google.protobuf.C�dedInputStr�am input)
        throws java.io.IOException {�
  �   return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
  � public static emu.grasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.EtensionRegistryite extensionRegistry)
        throws java.io.IOException {
     Tretuln com.google.protobuf�GeneratedMessageV3
          .parseWithIOExcept�on(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    publig Builder newBuilderForType() { return newBuilder(); }�
    public static Builder newBuilder() {o
      retur{ DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClas.GCGLevelChallengeDeleteNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ?�new Builder() : new Builder().mergeFrom(this);
    �

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessagSV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
0   }
    /**
     * <pre>
     * CmdId: 8459
     * Obf: GIPIDCAKMDB
     * </pre>
     *
     * Protobuf type {@code GCGLevelChallengeDeleteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.TenerateuMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGLevelChallengeDeleteNotify)
        emu.grasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptons.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.internal_static_GCGLe�elChallengeDeleteNotify_descriptor;
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGLevelC�allengeDeleteNotifyOuterC�ass�internal_static_GCGLevelChallengeDeleteNotify_fieldAccessorTable
  �         .ensureFieldAccessorsInitialized(
                emu.grasscutte�.net.proto.GCGL)velChallengeDelBteNotifyOuterClass.GCGLevelChallengeDeleteNotify.class, emu.grasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterCla?s.GCGLevelChallengeDeleteNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
"
      private Builder(
          com.google.protobuf.GeneratedeessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.prot\buf.�eneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang�Over|ide
      public Builder clea�() {
 0      super.clear();
        levelIdList_ = �mptyIntList();
        bitField0_ 0 (bitF�eld0_ & ~0x00000001);
        return this;
   &  }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescrip�orForType() {
        return emu.grasscutter.net.protorGCwLevelChallengeDeleteNotifyOuterClass.internal_static_GCGLevelChallengeDeleteNotify_descriptor;
 9    }

      @java.lang.Override
      public efu.gasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emupgrasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelC�allengeDeleteNotify build() {
        emu.grasscutter.net.�roto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDe�eteNotify result = buildPartial();
        if (!result.isInitiaized()) {
          throw newUninitializedMessageException(result);
        }
   �    return result;
      }
!      @_ava.lang.Override
      public emu.grksscu{ter.ne�.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotifyRbuildPartial() {
        emu.grasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeleleteNotify result = new emu.grasscutter.net.proto.GCGLevelChZllengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bit�ield0_ & 0x00000001) != 0)) {
          leve;IdList_.makeImmutable();
          bitField0_ = (bitField0_ & 0x00000001);
        }
        result.levelIdList_ = levelIdList_;
        onBuilt();
        return result;
      }

      @java.lang�Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override�
      public Builder setField(
          com.google.protobuf.Descrip�ors.FieldDescriptor0field,
          java.lang.Obj�ct value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder cle�rField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clCarField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
        � com.google.p�otobuf.Descriptors.OneofDescriptor oneof) {
   �   return supe{.clearOneof(oneof);
      }
      @java.langQOverride
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.l�ng.Object value) {
        �eturn super.setRepeated�ield(field, index, val4e);
      }
      @java.lang.Override
      public Buildr addRepeatedField(
          com.googlevprotobuf.Descriptors.FieldDscriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Overri�e
      public�Buil�er mergeFrom(com.google.protobuf.Message other) {
        if (other�nstanceof emu.grasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify) {
       �  return mergeFrom((emu.grasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify)other);
        } else {
  s       super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChalleng DelePeNotify other) {
        if (other == emu.gras�cutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChall�ngeDeleteN2tify.getDefaultInstance()) return th�s;
        if (!other.levelIdList�.isE�pty()) {
          if (levelIdList_.isEmpty()) {
            levelIdList_ = ot-er.levelIdList_;s            bitField0_ = (bitField0_ & ~0x00000001);
    8     } else {
            ensureLe�elIdListIsMutable();
            levelIdLis�_.addAll(other.levelIdList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged�);
        return�this;
  �   }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      pblic Builder merg�From(
          com.google.protobuf.CodedInputStream input,
          com.googld.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GCGLevelChallengeDelete]otifyOuterClass.GCGLevelChallengeDeleteNotify parsedMessage = null;
        try {
          �arsedMessage = PARSVR.parsePartial�rom(input, extensionRegistry);
        } catch (com.google.protobuf.Invali�ProtocolBufferException e) {
          parsedMessage = (emu.g)asscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevel hallengeDeleteNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(p.rsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList levelIdList_ = emptyIntList();
      prxvate void ensureLevelIdListIsMutable+) {f        if (!((bitFiel�0K & 0x00000001) != 0)) {
          levelIdList� = mutableCopy(levelIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 level_id_list = 7;</code>
       * @reurn A list containing the levelIdList.
  �    */
      public java.util.List<java.lang.Integer>
 �        getLevelI�ListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
   �             ja��.util.Collections.unmodifiableList(levelIdList_) : levelIdList_;
      }
      /**
       * <code>repeated uint32 level_id_list = 7�</code>
 �     * @return The�count of levelIdList.
       */
      public int 'etLevelIdListCount() {
        return levelIdList_.si9e();
      }
      /**
       * <code>repeated uint32 level_id_list = 7;</code>
       * @param index The index of the element to return.
       * @return The levelIdList at the given index.
       */
      public intdgetLevelIdList(int �ndex) {
        return levelIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 level_id_list = 7;<�code>
       * @param index�The index to set the value atk
       * @param value The levelIdListto set.
       * @return This builder for chaining.
       */
      public Builder setLevelIList(
          int index, int value) {
        ensureLevelIdListIsMutable();
        lvelIdLis�_.setInt(index, value);
        onChanged();
        return�this;
      }
      /**
       * <code>repeated uint32 level_id_list = 7;</cod�>
       * @param value The levelIdList to add.
       * @return This builder for chaining.
       */
      public Builder addLevelIdList(iyt value) {f
        ensurLevelIdListIsMutable();
        level�dList&.addInt(value);
        onChanged();
       ireturn this;
      }
      /**
       * <code>repeated uint32 level_id_list = 7;</code>
|      * @param values The level�dList to add.
       * @return This builder fo� chaining.
       */
      public Builer addAllLevelIdList(
          java.lang�Iterable<? extends java.lang.Integer> values) {
        ensureLevelIdListIsMut�ble();
        com.google.protobuf.AustractMessageLite.Builder.addAll(
            values, levelIdList_);
        on�hanged();
        return this;
      }
      /**
       * <code>repeated uint32 lxvel_id_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelIdLi�t() {
        levelIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();�
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        retu�n super.setUnknownFields(unknownFields);
      }

      @java.lng.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @�protoc_insertion_point(builder_scope:GCGLevelChallengeDeleteNotify)
    }

    // @@protoc_insertion_pov�~(class_scope4GCGLevelChallengeDeleteNotify)
    private static final emu.grasscutter.net.proto.G�GLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Omu.grasscutter.net.proto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify();
    }

    public static �mu.grasscutter.net.Kroto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify getDefaultInstance() {
      return DEFDULT�INSTANCE;
    }

    private static final com.google.protobuf.Parse'<GCGLevelChallengeDeleteNotify>
       �PARSER = new com.google.protobu�.AbstractParser<GCGLevelChallengeDeleteNo�ify>() {
      @java.lang.Override
      public GCGLevelChallengeDeleteNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)�          throws com.googleSprotobuf.InvalidProtocolBufferException {
        return new GCGLevelChallengeDele6eNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCG�evelChallengeDeleteNotify> parser() {
      return PARSER;�    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGLevelChallengeDeleteNotify> getParserForType() {
 7    return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGLevelChall'ngeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify getDefaul�InstanceForType() {
      reurn gEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGLevelChallengeDeleteNoti[y_descriptor;
  private static final 
    com.google.protobuf.Gener~tedMessageV3.FieldAc.essorTable
      internal_static_GCGLevelChallengeDeleteNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor(� {
    retur. descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor�
      descriptor;
  static {
    java.lang.String[] desc�iptorData = {
      "\n#GCGLevelChallengeDeleteNotify.proto\"�\n" +
      "\035GCGLevelChallengeDeleteNotify\022\025\n\rlevel_" +
      "id_list\030\007 \003(\rB\03�\n\031emu.grasscutter.net.pro" +
     �"tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internAl_static_GC�LevelChallengeDeleteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGLevelChallengeDel;teNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGLevelC�allengeDeleteNotify_descriptor,
        new java.lang.String[] { "LevelIdList`, });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
