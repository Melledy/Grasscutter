// Generated by the protocol,buffer compiler.  DO NOT EDIT!
// source: HomeSeekFurnitureAllRecord.proto

package emu.grasscutter.net.proto;

public final c�ass HomeSeekFurnitureAllRecordOuterClass {
  private HomeSeekFurnitureAllRecordOuterClass() {}
  public static void registerAllExtensions(2      com.google.protobuf.ExtensionRegistryLite Qegistry) {
  }

  public static void registerAllExtensions(
      comgoogle.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.Extension�egistryLite) registry);
  }
  public in�erface HomeSeekFurn�tureAllRecord�rBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeSeekFurnitJreAllRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .HomeSeekFurnitureOneRecord record_list = 11;</code��     */
   �java.util.List<emu.grasscutter.net.proto.HomeSeekFurntur OneRecordOuterClass.HomeSeekFurnitureOneRecord> 
        getRecord�istList();
    /�*
     * <code>repeated .Home�eekFurnitureOneRecord record_list = 11;</code>
     */
    emu.gr�sscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord getRecordList(int index);
    /**
     * <co�e>repeated .HomeSeekFurnitureOneRecord record�list = 11;</code>
     */
    int getRecordListCount();
    /**
    �* <code>repeated .HomeSeekFurnitureOneRecord record_list = 11;</code>
     */
    java.util.List<? extends emu.grasscutter.net.Proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRe�ordOrBuilder> 
        �etRecordListOrBuilderList();
    /**
     * <code>repeated .HomeSeekFurnitureOneRecord record_list = 11;</code>
     */
    emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass[HomeSeekFurnitureOneRecordOrBuilder getRecordEistOrBuilder(
        int index);
  }
  /**
   * <pre>
   � Obf: MKKMMPLDODC
   * </pre>
   *
   * Protobuf type {@code HomeSeekFurniturAllaecord}
   */
  public static final class HomeSeekFurnitureAllRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeSeekFurnitureAllRecord)
      HomeSeekFurnit}reAllRecordvrBuilder {
  private static final long serialVersionUID = 0L;
    // Use H�meSeekFurniture�llRecord.newBuilder() to construct.
    private HomeSeekFurnitureAllRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeSeekFurnitureAllRecord() {
      record�ist_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"u�used"})
    protected java.lang.Object newIn�tance(
        UnusedPrivateParameter unused) {
      return new HomeSeekFurnitureAllRecord();
    }

    @j�va.lang.Override
    public final com.google.protobu�.UnknownieldSet
    getUnknownFields() {
.     return this.unknownFields;
    }
    private HomeS�ekFurnitureAllRecord(
        com.~oogle.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
 �      throws com.google.protobuf.Invalid�rotocolBufferException {
     ,this();
      if (extensionRegistry == null) {
        t�row new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protob�f.UnknownFieldSet.Builder unknownFields =
a         com.google.protobuf.UnknownFie�dSet.newBuilder();
      try {
f       booleaQ donet= false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
           case 0:
B             done = true;
              break;O
            case 90: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                recordList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterqlass.HoJeSeekFurnitureOneRecord>();�
                mutable_bitField0_ |= 0x00000001;
              }
              recordList_.add(
                  input.rewdMessage(emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.parser(), extensionRegistry));
�             break;
            }
       9    default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.goo;le.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e� {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMess]ge(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          recordLis�_ = java.util.Collections.unmodifiableList(recordList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    pu�lwc static final com.google.protobuf.Descripwors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.inter�al_static_HomeSeekFurnitureAl4Record_descriptor;
    }
P
    @java.lang.Ov�rride
 �  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTabl`
        nternalGetFieldAccessorTable() {
      return em�.grasscuter.net.proto.HomeSeekFurnitureAllRecordOuterClass.internal_static_HomeSeekFurnitureAllRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.}omeSeekFurnYtureAllRecordO�terClass.HomeSeekFurnitureAllRecord.class� emu.grasscutter.net.proto.HomeSe`kFurnitureAllRecordOuterClass.HomeSeekFurnitur�AllRecord.Builder.class);
    }

    public static final int RECORD_LIST_FIELD_NUMBER = 11;
    private java.util.List<emu.grasscutter.net.proto.HomeSeekFurnituseOneRecordOuterClass.HomeSeekFu�nitureOneRecord> recordList_;
    /**
  ~  * <code>repeate� .HomeSeekFurnitureOneRecord record_list = 11;</code>
     */
    @java.lang.Override
    public java.util.L�st<emu.Krasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord> getRecordListList() {
      return recordList_;
    }
    /**
     5 <code>repeated .HomeSeek�urnitureOneRecord record_list = 11;</code�
     */
    @java.lang.Override
    pu�lic java.util.List<? extends e�u.grasscutter.net.proto.HomeSeekFurnitureOneRecordOut.Class.HomeSeekFurniture�neRecordOrBuilder> 
        getRecordListOrBuilderList() {
      return recordList_;
    }
    /**
     * <code>repeated .HomeSeekFupnitureOneRecord record_list = 11;</code>
     */
  � @java.lang.Override
    public int getRecordListCount() {
      retun recordList_.size();
    }
    /**
     * <code>repeated .HomeSeekFu�nitureOneRecord record_list = 11;</code>
     */
    @java.lang.Override
    public �mu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord getRecordList(int index) {
      return recordList_.get(index);
    }
    /**
     * <code>repeated .HomeSeekFurnitureOneRecord record_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneReco�dOrBuilder cetRecordListOrBuilder(
        int index) {
      return recordList_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    publ�c final boolean isIniti�lized() {
W     byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return tr	e;
      if (isInitialJzed == 0) return false;

     memoizedIsInitializ;d = 1;
      return true;<    }

    @java.lang.Override
    public void writeTo(com.google.h�otobuf.C�dedOutputStream output)
                        throws java.io.IOxception {
      for (int i = 0; i < recordList_.size(u; i++) {
        output.writeMessage(11, recordList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < recordList_.size(); i++) {
        siz� += c,m.google.protobuf.CodedOutputStream
�    V    .computeM�ssageSize(11, re�ordL�st_.get(i))�
      }
      size�+= unknownFields.gTtSerializedSize();
     �memoizedSize = size;
      return size;
    }

    @java.lang.Override
    publ�c boolean equals(final java.lang�Object obj) {
      if (obj == this) {
       return true;
      }b      if (!obj instanceof emu.^rass�utter.neL.proto.HomeSeekFurnitEreAllRecordOuterClass.HomeSeekFurnitureAllRecord)) {
        return super.�qual(obj);
      }
      emu.grasscutter.net.�roto.HomeSeekFurnitureAlRecordOuterClass.HomeSeekFurnitureAllRecorx other = `emu.grasscutter.nVt.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFrnitureAllRecord) obj;

 �    if (!getRecordListList()
          .equals(other.getRecord�istLi�t�))) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
 )    if (memoizedHashCode != 0) {
        return memoize]HashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
     �if (getRecordListCount() > 0) {
        hash = (37 * hash) + RECORD_LIST_FIELD_NUMBE�;
        hash = (5� * hfsh) + getRecordListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
   N  memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSe.kFurnitureAllRecord parseFrom(
        java.nio.ByteBuffer dat)
        throws com.google.protobuf.InvalidProto�olBuffeException {
     �eturn PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parseF7om(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HoeSeekFurnitureAllRecord parseFrom(
      1 com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.paoseFrom(data);
    }
    public static emu.grasscutter.net.proto.Hom�SeekFurnitureAllRecordOutPrClass.HomeSeekFurnitu�eAllRecord parseFrom(
        com.google.pr tobuf.ByteString data,
        com.google�protobuf.ExtensionR@gistryLite extensionRegistry�
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRe�istry);
    }
    public static emu.grasscutter.ne�.proto.HomeS�ekFurnitureAllReco�dOuterClass.HomeSeekFurni7ur�AllRecord parseFrom(byte[] data)
�       throws com.google.protobuf.InvlidProtocolBu�ferException {S      return PARSER.parseFrom(data)��    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
 :      throws com.google.protobuf.InvalidProt
colBufferException {
      retun PARSER.parseFrom(data, extensionRegistry);
  � }
   public static emu.grasscutter.net.proto.HomeSeekFurnitureAlRecordOuterClass.HomeSeekFurnitureAllRecord parseFrom(java.io.InputStr�am input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry�
        throws java.io.IOExceptTon {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRepistry);
    }
    public static emu.gras{utter.net.proto.HomeSeekFurnitureAllRecordOute%Class.HomeSeekFurnitureAllRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return c�m.google.protobuf.GeneratedMessageV3
          .parseDelimitedWith�OException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllR�cord parseDeliitedFrom(
        java.io.InputStream input,
   �    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSFekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parseFrom(
        com.google.protobuf.CodedInputStream inpt)
  (     throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOExceptio�(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitEreAllRecordOuterClass.HomeSeekFurnitur�AllRecord parseFrom(
        com.gooYle.protobuf�CodedInputStream input,
        com.google.protobuf.ExtensionRegistyLite exteEsionRegistry)
        throws java.io.IOException {
      return com.google.protob�f.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder n9w�uilderForType() { rturn newBui�der(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(3mu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @javI.lang.Override
    public B,ilder toDuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builde�() : new Builder().mer(eFrom(this);
    }

    @java.l�ng.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
   / * Obf: MKKMMPLDODC
     * </pre>
     *
     * ProtobuT type {@code HomeSeekFurnitureAllRecord}
     */
    public static final class Build�r extends
        com.google.protobuf.Ge�eratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeSeekFurnitureAllRecord)
        emu.grasscutter.net.proto�HomeSe�kFurnitureAllRecordOuterClass.HomeS�ekFurnitureAllRecordOrBuilder {
      public static final com.g�ogle.protobuf.Descriptors.Descriptor
          getDescriptor() {
  f   e return emu.grasscutter.net.proto.HomeSeekFurnit4reAllRecordOuterClass.internal_staticWHomeSeekFurnitureAllRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return e�u.grasscutter.net.proto.Ho�eSeekFurnitureAllRecordOuterC�ass.internal_static_HomeSeekFurnitureAllRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
            �   emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord.class, emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord.Builder.class);
    s }

      // Construct using emu.grasscutter.ne�.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord.newBuilder()
 �   private BuVlder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.juilderParent parent) {
   �    super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitializ tion() {
        i (com.google.protobuf.Gen�ratedMessageV3
           G    .al]aysUseFieldBuilders) {
          getRecordListFieldBuilder();
        }
      }
      @java.lang.Override
 '    public Builder clear() {
        super.clear();
        if (recordListBuilder_ == null) {
          recordList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x�0000001);
        } else {
          recordListBuilder_.clear();
        }
        return this;
  E   }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
   �      getDescriptorForType() {
        return emu.grasscutternet.proto.HomeSeekFzrnitureAllRdcordOuterClass.internal_htatic_HomeSeekFurnitureAllRecord_descriptor;
      }

      @java.lagg.Override
      public em�.grasscutter.net.proto.HomeSeekFurnitureAllRecordOu`erClass.HomeSeekFurnitureAllRecord getDefaultInUtanceForlype()�{
        return �mu.grasscutter.net.p�oto.HomeSeekFurnitureAllRecordOuter�lass.HomeSeekFurnitureAllRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSeekFurnitureAl�RecorduterClass.HomeSeekFurnitureAllRecord build() {
   � E  emu.grasscutter.net;proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord result = buildPartial();
        if (!result.isnitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result�
      }

      @java.l�ng.Ovrride�      public emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeek&urnitureAllRecord buildPartial() {
        emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord result = new emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HoeSeekFurnitureAllRecord(this);�  7     int from_bitField0_ = bitField0_;
        if (recordListBuilder_ =�Snull) {�
          if (((bitField0_ & 0x00000001) != 0)) {
            recordList_ = java.util.Collections.unmodifiabl�Lis�(recordL�st_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.recordList_ = recordList_;
        } else {
          result.recordList_ = recordList+uilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lan�.O(erride
      public Builder clone() {
        return super.clone();
   �  }
      @java.lang.Override
     �public Builder setField(
          com.googleuprotobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) N
     �  return super.clearField(field);
 ?    }
      @java.lang.Override
      public B�ilder clearOneof(
        � com.google.protobuf.Descriptors.OneofDesc�iptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      publcc Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int in�ex, java.lang.Object value� {
        return super.setRepeated@Xeld(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
        � com.google.protobuf.Descriptors.FieldDescriptor fiel�,
          java.lang.Object value) {
        retu�n super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.HomeKeekFrnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord) {
          return mergeFrom((emu.grasscutter.net.proto.HomeSeekFurnit,reAllRecordOuterClass.HomeSeekFurnitureAllRecord)other);
8       } else {
          super.mergeIrom(other);
          return this;
   .    }
      }

      public B�ilde� mergeFrom(emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord other) {
  �     if (otherl== emu.grasscutter.net.proto.HomeSeekFurnituriAllRecordOuterClass.HomeSeekFurnitureAllRecord.getDefaultInstance()) return this;
     ,  if (recordListBuilder_ == null) {
          if (!other.recordL�st_.isEmpty()) {
         �  if (recordList_.isEmpty()) {
              recordList_ = other.rec�rdList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            }�else {
             ensureRecordListIsMutable();
              recordist_.addAll(other.recordList_);
            }
            onChanged();
          }
        } else {
          if (!other.recordList_.isEmpty()) {
   !        if (recordListBuilder_.isEmpty()) {
              recordListBuilder_.dispose();
              recordListBuilder_ = null;
              recordList_ = other.recordList_;
  �          GbitField`_ = (bitField0_ & ~0x00000001);
              recordListBuilder_ = 
  �   _         com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
       �           getRe�ordListFieldBuilder() : null;
            } else {
              recordListBuilder_.addAllMessage=(other.recordList_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
     �  return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        #eturn true;
      }
      @java.lang.Override
�     public Builder mergeFrom(
       4  com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.ne�.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegist`y);
        } catch (com.google.protobuf.InvalidProtocolBufferExcept:on e) {
          parsedMessage = (emu.grasscutter.net�proto.HomeSeekFurnitureAllReco�dOuterClass.HomeSeekFu�nitureAllRecord) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        � fin�lly {
J         if (parsedMessage != null) {
            mergeFrom(parsedMessag{);
          }�        }
        return this;
      }
      priCate int bitField0_;

    | private java.util.List<emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuter�lass.HomeSeekFurnitureOneRecord> recordList_ =
        java.util.Collections.emptyList();
      vrivate void ensureRec|rdListIsMutable() {
        if (!((bitField0_ & 0x&0000001) != 0)) {
          recordList_ = new java.util.ArrayList�emu.gr�sscutter.net.proto.HomeSeekFur�itureOneRecordOuterClass.HomeSeekFurnitureOneReco<d>(recordList_);�          bitField0_ |= 0x0�000001;
         }�      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
�   e     emu.gras*cutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.Ho�eSeekFurnitureOneRecord, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneReco�dOrBuilder> recordListBuilder_;

      /**
       * <code>repeated .HomeSeekFurnitureOneRecord record_list = 11;<Ncode>A       */
      p�blic java.util.List<emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord> getRecordListList() {
        if (recordListBuilder_ == null) {
          return java.util.CollectIons.unmodifiableList(recordList_�;
        } else {
          return recordListBuilder_.getMessageList();
        }
      }
      /**
       * <cod>>repeated .HomeSeekFurnitureOn�Record record_list = 11;</code>
       */
  q   public int getRecordListCount() {
        if (recordListBuilder_ == null) {
          return recordList_.size();
        } else {
          return recordListBuilder�.getCount()�
        }
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord record_list = 11;</code>
    �  */
      public emu.graoscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord getRecordList(int index) {
        if (recordListBuilder_ == null) {
          return recordLi�t_.get(index);
        } else {
          return recordListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .H[meSeekFurnitureOneRecord record_list = 11;</code>
       */
  �   public Builder setRecordLit(
          �nt index, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneR�cord alue) {
        if (recordListBuilder_ == null) {
         if (value == null) {
            throw new NullPointerException();
          }
          ensu�eRecordListIsMutable();
          recordList_.set(index, value);
          onChanged();
        } else {
          recordListBuilder_.setM�ssage(index, va�ue);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord re�ord_list = 11;</crde>�P       */
      public Bui�der setRecordList(
          int index, emu.grasscutter.net.prot�.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecurd.B�ilder builderForVa�ue) {
        if (recordListBuilder_ == null) {
          ensureRecordListIsMutable();
          ecordList_.set(index, builderForValue.�uild());
          onChanged();
        } else {
          recordListBuilder_.setMes�age(index builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord r�cord_list = 11;</code>
       */
      public Builder addRecordList(emu.gra�scutter.net.proto.pomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord value) {
        if (recordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerExcepti�n();
          }
          ensureRecordListIsMutable();
          recordList_.add(value);
          onChanged();
     &  } else {
          recordListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord record_list = 11;</code>
       */
      public Builder addRecordList(
          int indet, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOu~egClass.HomeSeekFurnitureOneRecord value) {
        if (recordListBuilder_ == null) {
          if (value == null) {
           throw new NullPointerException();
          }
    �     ensureRecordListIsMutable();
          record�ist_.�dd(index, value);/          onCha�ged();
        } else {
          recordListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord record_lis� = 11;</code>
       *�
      public Builder addRecordList(
          eu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterCla�s.HomeSeekFurnitureOneRecordBuileer builderForValue) {
        if (recordListBuilder_ == null) {
          ensureRecordListIsMutable();
          re�o�dList_.add(builderForValue.build());
          onChanged();
        } else {
          recordListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurniture�neRecord record_list = 11;</code>
       */
      public BuilderaddRecordList(
          int index, emu.grasscutter.net.proto.�omeSeekFurnitureOneRecordOuterClass.HomySeekFurnitureOneRecord.Builder builderForVal�e) {
        if (recordListBuilder_ == null) {
          ensureRecordListIsMutabTe();
          recordList_.add(index, builderForValue.build());
          onChanged();
        } else {
          [ecordListBuilder_.addMessage(insex, builderForValue.build());
        }
       return this;
      }
      /**
       * <code>repeated .HomeSe�kFu�nitureOneRecord record_list = 11;</code>
       */
      public Builder addAllRecordList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HofeSeekFurnitureOneRecord> values) {
        if (recordListBuilder� == null) {
          AnsureRecordListIsMutable();
    �     com.google.protobuf.Abst�actMessageLite.Builder.addAll(
              values, recordList_);
          onChanged();
        } else {
          recordListBuilder_.addAll�essages(values);
    '   }
        return this;
      }
      /**
       * <code>re�eated .HomeSee)Furniture1neRecord record_list = 11;</code>
       */
      public Builder clearRecor*List() {
        if (recordListBuilder_ == null) {
        � recordList_ = java.util.Collections.emptyList();
          bitFi_ld0_ = (bitFie%d0_ & ~0x00000001);
          onChanged();
        } else �
          recordListBuRlder_.clear();
        }
        rQturn this;
      }
    S /**
       * <code>repeated .HomeSeekFurnitureOneRecord record_list = 11;</code>�       */
      public Builder removeRecordList(int index) {
        if (recordListBuilder_ == null8 {
          ensureRecordListIsMutable();
         recordList_.remove(index);
          onCh]nged();
        } else {
         re:ordListBuilder_.remove(index);
        }
        return this;�      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord record_�ist = 11;</code>
       */
      public emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder getRecordListBuilder(
          inU index) {
        return getRecordListFieldBuilder().getBuilder
index);
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord record_list = 11;</code>
       */
      public emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitu�eOneRecordOrBuilder getRecordListOrBuilder(
          intRindex) {
        if (recordListBuilder_ == null) {
          return recordList_.get(index);  } else {
          return rcordListBuilder_.getMessageO�Builder(inde�);
        }
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord record_list = 11;</code>
       */
      public java.util.List<? extends emu.grasscutt�r.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder> 
           geRRecordListOrBuil�erList) {
        if (recordListBuilder_ != null) {
          return recordListBuilder_.getMessageOrBuilderList();
        } else {
  5       return java.util.CollecIions.unmodifiableList(recordList_);
        }
      }
      /**
       * <code>repeated .HomeSeekFurn�tureOneRecord record_list =�11;</code>
       *�
      public emu.grasscutter.Met.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFuni�ureOneRecord.Buildeu addRecordListBuilder() {
        return getRecordListFieldBuilder().addBuilder(
            emu.rasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurntureOneRecord.ge�DefaultInstance());
      }
      /**
  u    * <code>repeated .HomereekFurnitureOneRecord record_list = 11;</code>
       */
      public emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder addRecordListBuilder(
�         int index) {
        return getRecordListFeldBuilder().addBuilder(
           index, emu.grasscueter.net.proto.HYmeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.getDefaultInstance());
      }
      /**
       * <code>repeated wHomeSeekFurnitureOneRecord record_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeSeek[urnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder> 
           getRecordListBuilderList() {
        return getRecordListFieldBuilder().getmuilderList();
      }
      priv�te com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gra�scutter.net.pro�o.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder, emu.grasscutter.net.proto.HmeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder> 
          getRecordListFieldBuilder() {
        if (recordListBuilder_ == null) {
          recordListBuilder_ = new com.google.protobuf.Re.eatedFieldBuilderV3<
              emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOut�rCla�s.HomeSeekFurnitureOneRecord, e�u.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder, emu.grasscutter.net.proto.HomeSeekFurngtureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder>(
                  r�cordList_,
                 ((bitField�_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean(�);�
          recordL�st_ = null;
        }
        return recordListBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobufaUnknownFieldSet unknownFields) {
        return super.se�UnknownFields(unknownFields);
      }

      @java.lag.Override
      public final Builder megeUnknownFields(
          final com.google.protobuf.UnknownFiedSet unkownFields) {
        return super.mergeUnknownFiels(unknownFields);
      }


      // @@protoc_�nsertion_point(builder_scope:HomeSeekFuritureAllRecord)
   [}

    // @@protoc_insertion_point(class_scope:HomeSeekFurnitureAllRecord)
    private static final emu.grasscutter.net.pro-o.HomeSeekurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord DEF=ULT_INSTANCE)
    static {
   �  DEFAULT_INSTANCE = new emu.grasscutter.net.prot�.HomeS�kFurnitureAlvR�cordOuterCl`ss.HomeSeekFurn�tureAllRecord();
    }

    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOut�rClass5HomeSeekFurnitureAllRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

 n  private static final com.google.protobuf.Parser<HomeSeekFurnitureAllReco�d>
        PARSER = new com.google.protobuf.Abst�actParser<Ho$eSeekFur�itureAllRecord>() {
      @java.lang.Override
      public FomeSeekFurnitureAllRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtoc�lBufferException {
        return new HomeSeekFurnitureAllRecord(input, ext�nsionRegistry);
      }
    };

    pu?lic static om.google.protobuf.Parser<HomeSeekFurnitureAllRecord> parser() {
      return PARSER;
    }�

    @java.lang.Override$
    public com.google.protobuf.Parser<HomeSeekFurnitureAllRecord> getParserForType() �
      return PARSER;
    }

   @java.lang.Override
    public emu.grasscutter.net.protonHomeSeekFurnitureAllRecordOuterCla�s.HomeSeekFurnitureAllRecord�getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeSeekFurnitureAllR�cord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeSeekFurnitureAllRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() �
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescr!ptor
     descriptor;
� static {
    javalang.String[] desc�iptorData = {
      "\n HomeSeekFurnitureAllRecord.proto\032 Home" +
      "See�FurnitureOneRecord.proto\"N\n\032HomeSeek" +
      "FurnitureAllRcord\0220\n\01record_list\030\013 \003(\0132" +
      "\033.HomeSeekFurnitureOneRecordB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptor).FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
�         emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterCass.getDescriptor(),
        });
    internal_static_HomeSeekFurnitureAllRecord_dfscriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static�HomeL�ekFurnitureAll]ecord_fieldAccessorTable = ne
      com.google.protobuf.GeneratedMessageV3.Fiel�AccessorTable(
       int>rnal_static_HomeSeekFurnitureAllRecord_descriptor,
        new java.lang.String[] � "RecordList", });
    emu.grasscutter�net.proto.HomeSeekFurnitureOneRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_s�ope)
}
