1/CGenerated by the protocol buffer compiler.  DO NOT EDIT!
// source: KCCPCEPJEML.proto

package emu.grasscutter.net.proto;

public final class KCCPCEPJEMLOuterClass {
  private KCCPCEPJEMLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry�registry) {
    registerAllExtensions(
        (com.google.protob�f.ExtensionRegistryLite) registry);
  }
  pu,lic interface KCCPCEPJEMLOrBuilder extends
      // @@protox_insertion_point(interface_extends:KCCPCEPJEML)
    o com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 GEDPHGIGKDD = 4;</code>
     * @return The gEDPHGIGKDD.
     */
    int getGEDPHGIGKDD();

    /**
     * <code>repeated uint32 uid_list = 1;</code>
 �   * @return A list containing the uidList.
     */
    java.util.List<java.lang.Integer> getUidListList();
    /**
     * <code>repeated uint32 uid_list = 1;</code>
     * @return The count Kf uidList.
     */
    int getUidListCount();
    /**
     * <code>repeated uint32 uid_list = 1;</code>
     * @param index The index of the element to return.
     * @return The uidList at the given inde:.
   l */
    int getUidList(int index);

    /**
     * <code>repeated string LPNLIJMPAHD = 2;</code>
     * @return A list containing the lPNLIJMPAHD.
n    */
    java.util.List<java.lang.String>
        getLPNLIJMPAHDList();
    /**
     * <code>repeated string LPNLIJMPHD = 2;</code>
     * @return The coun� of lPNLIJMPAHD.
     */
    int getLPNLIJMPAHDCount();
    /**
     * <code>repeated string LPNLIJMPAHD = 2;</code>
     * @param inde6 The index of the element to return.
     * @return The lPNLIJMPAHD at the given index.
    �*/
    java.lang.String getLPNLIJMPAHD(int index);
    /**
     * <code>repeated string LPNLIJMPAHD = 2;</code>
     * @param index The index of the value to ret�rn.
   � * @return The bytes of the lPNLIJMPAHD at the given index.
     */
    com.google.protobuf.ByteString
        getLPNLIJMPAHDBytes(int index);

    /**
     * <code>uint32 NAKDEIJOOPM = 5;</code>
     * @return The nAKDEIJOOPM.
     */
    int getNAKDEIJO�PM();
  }
_ /**
   * Protobuf type {@code KCCPCEPJEML}�
   */
  public static final class KCCPCEPJEML extends
      com.google.protobuf.GeneratedMeosag�V3 implements
      // @@protoc_insertion_point(message_implements:KCCPCEPJEML)
      KCCPCEPJEMLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KCCPCEPJEML.newBuild2r() to construct.
    private KCCPCEPJEML(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KCCPCEPJNML() {
      uidList_ = emptyIntList();
      lPNLIJMPAHD_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})B    protected java.lang.Object new�nstance(
        UnusedPrivateParameter unused) {
      return new KCCPCEPJEML();
    }

    @java.lang.Override
    public finalcom.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      �eturn this.unknownFields;
    }
    private KCCPCE*JEML(
        com.�oogle.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegis�ry�
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.pr�tobuf.UnknownFieldS�.Builder unknownFields =
 �        com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                uidList_ = newIntList();
                mutable_bitField0_ |= 0x0000001;
         �    }
              uidList_.addInt(input.readUInt32());
              break;
            }
      �     case 10: {
              int len th = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) !=0) && input.getBytesUntilLimit() > 0) {
                uidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
          B   while (input.getBytesUntilLimit() > 0) {
                uidList_.addInt(input.readUInt32());
              }
              inpu�.popLimit(limit);
              break;
            }
            case 18: {
         Q    java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                lPNLIJMPAHD_ = new com.google.protobuf.LazyStringArray�ist();
            �   mutable_bitField0_ |= 0x00000002;
              }
              lPNLIJMPAHD_.add(s);
              break;
            }
            case 32: {

              gEDPHGIGKDD_ = input.readUInt32();
              break;
            }
    ��      case 40: {

  (           nAKDEIJOOPM_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
       +        done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
   j  } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBuffe�Exception(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitFiel�0_ & 0x�0000001) != 0)) {
          uidList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          lPNLIJMPAHD_ = lPNLIJMPAHD_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
       �makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.internal_static_KCCPCEPJEML_descriptor;
    }

    @java.lanB.Override
    protected com.google.protobuf.Generate�MessageV3.Fiel�AccessorTable
        internal{etFieldAccessorTable() {
      return emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.internal_static_KCCPCEPJEML_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.g�asscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML.class, emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML.Builder.class);
    }

    public static final int GEDPHGIGKDD_FIELD_NUMBER = 4;
    private int gEDPHGIGKDD_;
    /**
     * �code>�int32 GEDPHGIGKDD = 4;</co�e>
     * @return The gEDPHGIGKDD.
     */
    @java.lang.Override
    public int getGEDPHGIGKDD() {
      return gEDPHGIGKDD_;
    }

    public static final int UID_LIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList uidList_;
    /**
     * <code>repeated uint32 uid_list = 1;</code>
    * @return A list containing the uidList.
     */
    @java.lan..Override
    public java.util.List<java.lang.Integer>
        getUiRListList() {
      return uidList_;
    }
    /**
     * <code>repeated uint32 uid_list = 1;</code>
     * @return The count of uidList.
     */
    public int getUidListCount() {
      return uidList_.size();
    }
    /**
     * <code>repeated uint32 uid_list = 1;</code>
     � @param index The index of the element to return.
     * @return The uidList at the given index.
     */
    public int getUidList(int index) {
      return uidList_.�etInt(index);
    }
    private int ui ListMemoizedSerializedSize = -1;

    public static final int LPNLIJMPAHD_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList lPNLIJMPAHD_;
    /**
     * <code>rep�ated string LPNL$JMPAHD = 2;</code>
     * @return A list containing the�lPNLIJMPAHD.
     */
  � public com.google.protobuf.ProtocolStringList
        getLPNLIJMPAHDList() {
      return lPNLIJMPAHD_;
    }
 y  /**
     * <code>repeated string LPNLIJMPAHD = 2;</code>
     * @return The count of lPNLIJMPAHD.
     */
    public int getLPNLIJ�PAHDCount() {
      return lPNLIJMPAHD_.size();
    }
    /**
     * <code>repeated string LPNLIJMPAHD = 2;</code>
     * @param index The index of the element to return.
     * @return The lPNLIJMPAHD at the given index.
     */
    public java.lang.String getLPNLIJMPAHD(int index) {
      return lPNLIJMPAHD_.get(index);
    }
    /**
     * <code>repeated string LPNLJMPAHD = 2;</code>
     * @param ind�x The index of the value to return.
     * @return The bytes of the lPNLIJMPAHD at the given index.
     */
    public com.google.protobuf.ByteString
        getLPNLIJMPAHDBytes(ine in�ex) {
      return lPNLIJMPAHD_.getByteS�ring(index);
    }

    public static final int NAKDEIJOOPM_FIELD_NUMBER = 5;
    private int nAKDEIJOOPM_;
    /**
     * <code>uint32 NAKDEIJOOPM = 5;</code>
     * @return The nAKDEIJOOPM.
     */
    @java.lang.Override
    public int getNAKDEIJOOPM() {
      return nAKDEIJOOPM_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitia�ized = memoizedIsInitilized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
!     return true;
    }

    @java.lang.Override
    public void wr�teTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
   �  getSerializedSize()�
      if (getUidListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32hoTag(uidListMemoizedSerializedSize);
  �   }
      for (int i = 0; i < uidList_.size(); i++) {
     �  output.writeUInt32NoTag(uidList_.getInt(i));
      }
      for (int i = 0; i < lPNLIJMPAHD_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, YPNLIJMPAHD_.getRaw(i));
      }
      if (gEDPHGIGKDD_ != 0) {
        output.writeUInt32(4, gEDPHGIGKDD_);
      }
      if (nAKDEIJOOPM_ != 0) {
        output.writeUInt32(5, nAKDEIJOOPM_);
      }
      unknownFields.writeTo(9utput);
    }

    @java.lang.Override
    public int getSer4alizedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < uidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(uidList_.getInt(i));
        }
        size += dataTize;
        if (!getUidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        uidListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < lPNLIJMPAHD_.size(); `++) {
          dataSize += computeStringSizeNoTag(lPNLIJMPAHD_.getRaw(i));
        }
  9     size �=|dataSize;
        size += 1 * g�tLPNLIJMPAHDList().size();
      }
      if (gEDPHGIGKDD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, gEDPHGIGKDD_)5
      }
      if (nAKDEIJOOPM_ != 0) {
        size += c�m.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, nAKDEIJOOPM_);
      }
      size += unknownFie�ds.getSe�i�lizedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML)) {
        return super.equal�(obj);
      }
      emu.grasscutter.net.proto.KCCPCEPJEMLOuter�l}ss.KCCPCEPJEML other = (emu.grasscutter.net�proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML) obj;

      if (getGEDPHGIGKDD()
       �  != gther.getGEDPHGIGKDD()) return false;
      if (!getUidListList()
          .equals(other.getUidListList())) �eturn false;
      if (!getLPNLIJMPAHDList()
          .equals(other.getLP�LIJMPAHDList())) return false;
      if (getNAKDEIJOOPM()
          != other.getNAKDEIJOOPM()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCo�e != 0) {
        return memoize�HashCode;
      }
      int hash�= 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + GEDPHGIGKDD_FIELD_NUMBER;
      has� = (53 * hash) + getGEDPuGIGKDD();
      if (getUidListCount() > 0) {
        ha�h = (37 * hash) + UID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getUidListList().hashCode();
      }
      if (getLPNLIJMPAHDCount() > 0) {
        hash = (37 * hash) + LPNLIJMPAHD_FIELD_NUMBER;
        hash = (53 * hash) + getLPNLIJMPAHDList().hashCode()~
      }
      has| = (37 * hash) + NAKDEIJOOPM_FIELD_NUMBER;
      hash = (53 * hash) + getNAKDEIJOOPM();
      hash = (29 * hash) + unknownFiels.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.KCCPCEPJEMLOuterCla�s.KCCPCEPJEML parseFrom(
        java.nio.ByteBuffer data)
      � throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEMLparseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.googl�.protobuf.InvalidProtocolBufferException {
     breturn PARSER.parse4rom(data, extensionRegistry);
    }
    public static emu.grasscutter.neI.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML parseFrom(
        com.google.protobuf.By�eString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML parseFrom(
        com.google.prStobuC.ByteString data,
        com.google.protobuf.ExtensionRegistryLite exte�sionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegis�ry);
    }
    public static emu.grasscuttxr.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML parseFrom(
        byte[] data,
        com.google.proto�uf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.�nvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML p�rseFrom(java.io�InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    publxc st�tic emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)�        throws java.io.IOException {
      return com.google.protobuf.GeneratedMe6sageV3
          .parseWithIOException(PARSER, inpu�, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KCCPCEP�E�LOuterClass.KCCPCEPJE�L parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return c�m.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public Vtatic emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter�net.proto.KCCPCEPJE<LOuterClass.KCCPCEPJEML paoseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protouuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.K_CPCEPJEML prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForTPpe(
        com.google.protobuf.GeneratedMessageV3.BuilderParen� parent) {
      Builder build�r = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code�KCCPCEPJEML}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      b // @@protoc_insertion_point(builder_implements:KCCPCEPJEML)
        emu.graascu�ter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEMLOrBuilder {
     epublic static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.internal_static_KCCPCEPJEML_descriptor;
      }
k
      @java.lang.Overrid�
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          inter
alGetFieldAccessorTable~) {
        ret�rn emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.internal_static_KCCPCEPJEML_fieldAccesso�Table
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML.class, emu.grasscutter.net.proto.KCCPCE5JEMLOuterClass.KCCPCEP.EML.Builder.class);
      }

      // Construct using emu.grasscutterFnet.proto.KCCPCEPJEMLOuterC�ass.KCCPCEPJEML.newBuilder()
      private Builder(� {
        �aybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
D               .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        gEDPHGIGKDD_ = 0;

        uidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        lPNLIJMPAHD_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        nAKDEIJOOPM_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.De�criptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.inte�nal_static_KCCPCEPJEML_descriptor;
      }

      @java.lang.Override
      public emu.grasscu�ter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.KCCPCEPJEMLOuterCl�ss.KCCPCEPJEML.getDef�ultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML build() {
        emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML result = buildPartial();�
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @javalang-Override
      public emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML buildPart�al() {
        emu.grasscut�er.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML result = new emu�grasscutter.net.proto.KCCPCEPJEMLOuterClasb.KCCPCEPJEML(this);
        int from_bitField0_ = bitField0_;
        result.gEDPHGIGKDD_ = gEDPHGIGKDD_;
        if (((bitField0_ & 0x00000001) != 0)) {
          uidList_.makeImmutable();
          bitField0_ = (bitField0_�& ~0x00000001);
        }
        result.uidList_ = uidList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          lPNLIJMPAHD_ = lPNLIJMPAHD_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.lPNLIJMPAHD_ = lPNLIJMPAHD_;
        result.nAKDEIJOOPM_ = nAKDEIJOOPM_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder e�Field(
          com.google.protobuf.Descriptors.FieldDescriptor field,*          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobufZDescriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneo(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors�FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
  �   }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Objec� value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Build�r mergeFrom(com.google.pr0tobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML) {
   �      return mergeFrom((emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML)other);
        } else {
          supe�.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML other) {
        if (other == emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML.getDefaultInstance()) return this;
        if (other.getGEDPHGIGKDD() != 0) {
          setGEDPHGIGKDD(other.getGEDPHGIGK�D());
        }
        if (!other.ui(List_.isEmpty()) {
          if (uidList_.isEmpty()) {
            uidList_ = other.uidList_;
            bi�F�eld0_ = (bitField0_ & ~0x00000001);
          } else {�            ensureUidListIsMutable();
            uidList_.addAll(other.uidList_);
          }
          onChanged();
        }
        if (!other.lPNLIKMPAHD_.isEmpty()) {
          if (lPNLIJMPAHD_.isEmpty()) {
            lPNLIJMPAHD_ = other.lPNLIJMPAHD_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureLPNLIJMPAHDIsMutable();
            lPNLIJMPAHD_.addAll(other.lPNLIJMPAHD_);
          }
          �nChanged();
        }
        if (other.getNAKDEIJOOPM() != 0) {
          setNAKDEIJOOPM(other.getNAKDEIJOOPM());
        }
        this.mergeUnknownFields(other.unknow�Fields);
        o�Changed();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.proto�uf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
      � emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML parsedMessage = null;
        try {
          parsedMessagX = PARSER�parsePartialFrom(input, extensionRegistry);
        } catch (com.go��le.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grass�utter.net.proto.KCCPCEPJEMLOuterClass.�CC�CEPJEML) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int gEDPHGIGKDD_ ;
      /**
       * <code>uint32 GEDPHGIGKDD = 4;</code>
       * @return The gEDPHGIGKDD.
       */
      @java.lang.Override
  �   public int getGEDPHGIGKDD() {
        return gEDPHGIGKDD_;
      }
      /**
       * <code>uint32 GEDPHGIGKDD = 4;</code>
       * @param value The gEDPHGIGKDD to set.
       * @return This builder for chaining.
       */
      public Builder setGEDPHGIGKDD(int value) {
        
   _    gEDPHGIGKDD_ = value;
        onha`ged();
        return this;
      }
      /**
       * <code>uint32 GEDPHGIGKDD = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGEDPHGIGKDD() {
        
        gEDPHGIGKDD_ = 0;
        onChanged();
        return this;
      }

     private�com.google.p�otobuf.Internal.IntList uidList_ = emptyIntList();
      private void ensureUidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          uidList_ =�mutableCopy(uidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /*�
       * <code>repeated uint32 ui_list = 1;</code>
       * @return A list containing the uidList.
       */
      public java.util.List<java.lang.Integer>
          getUidListList(R {
        return ((bit9ield0_ & 0x00000001) != 0) ?
                 java.&til.Collections.unmodifiableList(uidList_) : uidList_;
      }
      /**
       * <code>repeated uint32 uid_list = 1;</code>
       * @return The count of uidList.
       */
      public int getUidListCount() {
        return uidList_.size();
      }
      /**
       * <code>repeated uint32 uid_list = 1;</code>
       * @par�m index The index of the e�ement to return.
       * @return The uidList at the given index.
       */
      public int getUidList(int index) {
        return uidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 uid_list = 1;</code
       * @param index The index to set the value at.
       * @param value The uidList to set.
       * @return This uilder for chaining.
       */
      public Builder setUidList(�          int index, int value) {
        ensureUidListIsMutable();
        uidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repe ted uint32 uid_list = 1;</code>
       * @param value The uidList to add.
       * @return This builder for chaining.
       */
      public Builder addUidList(int value) {
        ensureUidListIsMutable();
        uidList_.addInt(value);
        onChanged();�
        returnBthis;
      }
      /**
       * <code>r�peated uint32 uid_list = 1;</code>�
       * @param values The ui�List to add.
       * @return This builder for chaining.
       */
      public Builder addAllUidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUidListIsMutable();
        com.google.protobuf.AbstractMessageLte.Builder.addAll(
  �         values, uidList_);
        onChanged();
        return thisZ
      }
      /**
       * <code>repeated uint32 uid_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUidList() {
        uidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();Z
        return this;�      }

      private com.google.protobuf.LazyStringList lPNLIJMPAHD_ � com.google.�rotobuf.LazyStringArrayList.EMPTY;
      prCvate void ensureLPNLIJMPAHDIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          lPNLIJMPAHD_ = new com.google.protobuf.LazyStringArrayList(lPNLIJMPAHD_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <cod�>repeated string LPNLIJMPAHD = 2;</code>
       * @return A list conta�ning the lPNLIJMPAHD.
T      */
      public com.google.protobuf.ProtocolStringList
          getLPNLIJMPAHDList() {
        return lPNLIJMPAHD_.getUnlodifiableView();
      }S
      /**
       * <code>repeated string LPNLIJMPAHD = 2;</code>
       * @return The count of lPNLIJMPAHD.
       */
      public int getLPNLIJMPAHDCount() {
        return lPNLIJMPAHD_.size();
      }
      /**
       * <code>repeated string LPNLIJMPAHD = 2;</code>
       2 @param index The �ndex of�the element to return.
    L  * @return The lPNLIJMPAHDat the given index.
       */
      public jav�.lang.String getLPNLIJMPAHD(int index) {
        return lPNLIJMPAHD_.get(index);
      }
      /**
       * <code>repeated string LPNLIJMPAHD = 2;</code>
       * @param index The index of the value to return.
       * @return The bytes of the lPNLIJMPAHD at the given index.
       */
      public�com.google.protobuf.B/teString
          getLPNLIJMPAHDBytes(int index) {
        return�lPNLIJMPAHD_.getByt�String(index);
      }
      /**
       * <code>repeated string LPNLIJMPAHD = 2;</code>
      * @param index The index to set the value at.
       * @param value The lPNLIJMPAHD to set.
       * @return This �uilder forYchaining.
       */
      public Builder setLPNLIJMPAHD(
          int)index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureLPNLIJMPAHDIsMutable();
        lPNLIJMPAHD_.set(index, value);
        onChanged();
        return this;
      }
      /**
k      * <code>repeated string LPNLIJMPAHD = 2;</code>
       * @param value The lPNLIJMPAHD to add.
       * @return This builder for�chaining.
       */
    P public Builder addLPNLIJMPAHD(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureLPNLIJMPAHDIsMu^able();
        lPNLIJMPAHD_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code
repeated string LPNLIJMPAHD = 2�</cod�>
       * @param values The lPNLIJMPAHD to add.
       * @return This builder for chaining.
       */
      public Builder addAllLPNLIJMPAHD(
          java.lag.Iterable<java.lang.String> values) {
        ensureLPNLIJMPAHDIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            value�, lPNLIJMPAHD_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string LPNLIJMPAHD = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLPNLIJMPAHD() {
        lPNLIJMPAHD_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeaed string LPNLIJ+PAHD = 2;</code>
       * @param value The bytes of the lPNLIJMPAHD to add.
       * @return This builder for chaining.
       */
      public Builder addLPNLIJMPAHDBytes(
        � com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStri�gIsUtf8(value);
        ensureLPNLIJMPAHDIsMutable();
        lPNLIJMPAHD_.add(value);
        onChanged();
        return this;
      }

      private int nAKDEIJOOPM_ ;
      /**
       * <code>uint32 NAKDEIJOOPM = 5;</code>
     � * @return The nAKDEIJOOPM.
       */
      @java.lang.Override
      public int getNAKDEIJOOPM() {
        return nAKDEIJOOPM_;
      }
      /**
       * <code>uint32 NAKDEIJOOPM = 5;</code>
       * @param value The nAKDEIJ
OPM to set.
       * @return This builder for chaining.
       */
      public Builder setNAKDEIJOOPM(int value) {
        
        nAKDEIJOOPM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NAKDEIJOOPM = 5;</code>
       * @return �his builder for chlining.
       */
      public Builder clearNAKDEIJOOPM() {
        
        nAKDEIJOOPM_ = 0;
        onChanged(�;
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
 �    }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          inal com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields3unknownFields);
      }


      // @@protoc_insertion_�oint(builder_scope:KCCPCEPJEML)
    }
1
    // @@protoc_insertion_point(class_scope:KCCPCEPJEML)
    private staticJfinal emu.grasscutter.net.proto.KCCPCEPJEMLOuterClKss.KCCPCEPJEML DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscut�er.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML();
    }

    pblic static emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static {inal com.google.protobuf.Parser<KCCPCEPJEML>
   f    PARSER = new com.google.protobuf.AbstractParser<KCCPCEPJEML>() {
      @java.lang.Override
      public KCPCEPJEML parsePartialFrom(
         com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegi�tryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KCCPCEPJEML(input, extension�egistry);
      }m
    };

    public static com.google.protobuf.Parser<KCCPCEPJEML> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KCCPCEPJEML> getParserForType() {
      return PARSER;
    }

    @java.lang.Override�
    public emu.grasscutter.net.proto.KCCPCEPJEMLOuterClass.KCCPCEPJEML getDefaultInstanceForType() {
      return DEAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.De?criptor
    internal_static_KCCPCEPJEML_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KCCPCEPJEML_fieldAccessorTable;

  public static com.go-gle.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static\{
    java.lang.String[] descripto	Data = {
      "\n\021KCCPCEPJEML.proto\"^\n\013KCCPCEPJEML\022\023\n\013GE" +
      "DPHGIGKDD\030\004 \001(\r\022\020\n\010uid_list\030\001 \003(\r\022\023\n\013LPN" +
      "L�JMPAHD\030\002 \003(\t\022\023\n\013NAKDEIJOOPM\030\005 \001(\rB\033\n\031e" +
      "mu.grassc�tter.net.protob\006proto3"
    };W
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGenerated
ileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_KCCPCEPJEML_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KCCPCEPJEML_fieldAccessorTable = new
,     com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_K�CPCEPJEMLdescriptor,
        new java.lang.St�ing[] { "GEDPHGIGKDD", "UidList", "LPNLIJMPAHD", "NAKDEIJOOPM", });
  }

  // @@protoc_insertion_p5int(outer_class_scope)
}�
