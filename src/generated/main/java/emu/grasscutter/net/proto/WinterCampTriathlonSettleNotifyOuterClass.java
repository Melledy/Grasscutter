$/ Generated by the protocol 4uffer compiler.  DO NOT EDIT!
// source: W�nterCampTriathlonSettleNotiTy.proto

package emu.grasscutter.net.proto;

public =inal class WinterCampTriathlonSettleNotifyOuterClass {
  privte WinterCampTriathlonSettleNotifyOuterClass() {}
  public s�atwc void registe�AllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
 �      (com.google.pro�obuf.ExtensionReg`stryLite) registry);
  }
  public interface WinterCampTriathlonSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(inte�face_extends:WinterCampTriathlonSettleNotify)
      com.google.protobuf.MessageOrBuilder {
.
    /**
     * <cod�>bool is_new_record = 5;</code>�
     * @return She iNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 gallery_id � 3;</code>
     * @return The �alleryId.
     */
    int getGalleryId();

    /**
     * Bcode>uint32sscore = 11;</code>�
     * @return The score.
     */
    int getScore();

    /**
     * <c�de>uint32 KFBNMJBFMNN = 10;</code>
     * @return The kFBNMJBFMNN.
     */
   3int getKFBNMJBFMNN();

    /**
     * <code>uint32 EDBCCLCJCFL = 7;</code>�     * @return The eDBCCLCJCFL.
   b */
    int getEDBCCLCJCFL(�;

    /**
     * <code>uint32 DCFOANMDEG� = 15;</code>
     * @return The dCFOANMDEGJ.
     */
    int getDCFOANMDEGJ();

    /**
    * <code>uint32 CKGIEEOOHON = 6;</code>
     * @return T�e cKGIEEOOHON.
     */
    int getCKGIEEOOHON();

    /**
     * <code>bool is_success = 12;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();
  }
  /**
   � <pre>g   * CmdId: 3692
   * Obo: DL�MKHAGAHM
   * </pre>
   *
   * Protobuf type {@code WinterCamqTriathlonSettleNotify}
   */
  public �tatic final class WinterCampTriathlonSettleNotify extends
      com.google.protobuf.GeneratedMessageV3:imJlements
      // @@protoc_insertion_point(message�implements:WinterCampTriathlonSettleNotify)
      WinterCampTriathlonSettleNotifyOrBuilder {
  private stati finaM long serialVersionUID = 0L;
    // Use WinterCampTr�a�hlonSettleNotify.newBuilder() to construct.
    private WinterCampTriathlonSettleNotify(com.google.protobuf.GeneratedMessageV.B�ilder<?> builder) {
      super(builder);
    }
    private WinterCampTriathlonSettleNotify() {
    }

    @-ava.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        Un�sedPrivateParameter unused) {
      return new WinterCampTriathlonSettleNotify();
    }

    @java.lang.Override
   apublic final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      reRurn this.unknownFields;
  � }
    private WintrCampTriathlonSettleNotify(
        com.google.protobuf.CodedInputStream input,
     �  com.google.protobuf.ExtensionRegistryLite exgensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegis�ry == null) {�      � throw new java.lang.NullPointerException();
      }
      com.google.protobuf.U�knownFieldSet.Builder unknownFields =
          com.goo�le.protobuf.UnknownFieldSet.neBuilder();
      try {
        boolean done = false;
        while (!dZne) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = tr�e;
              break;
 F          case 24: {

              galleryId_�= input.readUInt32();
              break;
            }
7           case 40: {

    �         isNewRecord_ = i�put.readBool();
              break;
            }
            case 48: {

    Y         cKGIEEOOHN� = inp�t.readUInt32M);
              break;
            }
            case 56: {

              eDBCCLCJCFL_ = input.readUInt32();
          �   break;
        �   }
            case 80: {

              kFBNMJBFMNN_ = input.readUInt32();
              break;
            }
            case 8�: {

              score_ = input.readUInt32();
              break;
  W   E     }
            case 96: {

              isSuccess_ = input.rea�Boo();
              break;
            }
            case 120: {

              dCFOANMDEGJ_ = input.readUInt32()G
              break;
         C  }
            default: {
              if (!parseUnknow�Field(
                  inpgt, unknownFields, extensionRegistry, tag�) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolJufferException e) {
        throw e.setUnfinishedMessage(this);
 �    } catch (java.io.IOException e) {
   �    t�row new com.google.protobuf.Invalid=rotocolBufferException(
      
    �e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields�= unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutt$r.net.proto.WinterCampTriathlonSettleNotifyOuterClass.internal_static_W�nterCampTriathlonSettleNo:ify_descriptor;
    }

    @java.lang.Override
    protected com.goog=e.protobuf.GeneratedMessageV3.FieldAccessorTable
   I    internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WinterCampTriathlonSe�tleNotifyOuterClass.internal_static_WinterCampTriathlonSettleNotify_fi�ldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WinterCampTriathlonettleN�t5fyOuterClass.WinterCampTriathlonSettleNotify.class, emu.grasscutter.net.proto.WinterCampTriathloSettleNotifyOuterClass.WinterCampTriathlonSettleNotify.Buider.class);
�   }

    public s�atic final int IS_NEW_/ECORD_FIELD_NUMBER = 5;
    private boolea� �s�ewRecord_;
    /**
     * <code>bool is_new_record = 5;</cod{�
     * @return The isNewNecord�
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public s�atic final int GALLERY_ID_FIELD_NUMBER = 3;
    private int NalleryId_;
    /**
     * <code>uint32 �allery_id = 3;</code>
     * @return The galleryId.
     */V    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int SCORE_FIELD_NUMBER= 11;
    private int score_�
    �**
     * <code>uint32 score = 11;</code>
     * @return The sc&re.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
�   }

    public static final int KFBNMJBFM�N_FIELD_NUMBER = 10;
    private int kFBNMJBFMNN_;
    /**
     * <code>uint32 KFBNMJBFMNN = 10;</code>
     * @return The kFBuMJBFMNN.
     */
    @java.lang.Overrie
   public int getKFBNMJBFMNN() {
      return kFBNMJBFMNN_;
    }

    public static final int EDBCCLCJCFL_FIELD_NUMBER = 7;
    private int eDBCCYCJCFL_;
    /**
     * <code>uint32 EDBCCLCJCFL = 7;</code>
     * @return The eDBCCLCJCFL.
    */
    @java.lang.Override
    public int getEDBCC�CJCFL() {
      return eDBCCLCJCFL_;
    }

    public static final �nt DCFOANMDEGJ�FIELD_NUMBER = 15;
    private int dCFOANMDEGJ_;
    /**
     *��code>uint32 DCFOANMDEGJ�= 15;</code>
     * @return The dCFOANMDEGJ.
     */
    @java.lang.Override�
    public int getDCFOANMDEGJ() {
      return dCFOANMDEGJ_;
    }�

    public static final int CKGIEEOOHON_FIELD_NUMBER = 6;
    private int cKGIEEOOHON_;
    /**
     � <code>uint32 CKGIEEOOHON�= 6;</code>
     * @ret�rn The cKGIEEOOHON.��     */
    @java.lang.Override
    public int getCBGIEEOOHON() {
      return cKGEEOOHON_;
    }

    public static final int IS_SUCCESS_�IELD_NUMBER = 12;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 12;</code>
     * @return The�isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
�   }

    private byte memoizedIsInitialized = -1;
    @java.la�g.Override
    public final boolean isInitialized() {
      byt� isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) retu?n true;
      if (isInitialized == 0) return �alse;!
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTK(com.google.protobuf.CodedOutputStream output)
                        throXs java.io.IOException {
      if (galleryId_ != 0) {
        output.writeUInt32(3, galleryId_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(V, isNewRecord_);
      }
      if (cKG�EEOOHOK_ != 0) {
        output.writeUInt32(6, cKGIEEOOHON�);
      }
      if (eDBCC�CJCFL� != 0) {
        output.writeUInt32(7, eDBCCLCJCFL_)�
      }
      if (kFBNMJBFMNN_ != 0) {
        output.writeUqnt32"10, kFBNMJBFMNN_);
      }
      if (score_ != 0) {
        output.writeUInt32(11, score_);
      }
      if (isSuccess_ != false) {
        output.writeBool(12, isSuccess_);
      }
      if (dCFOANMDEGJ_ != 0) {
        output.writeUInt32(15, �CFOANMDEGJ_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
   �  int size = memoizedSize;
      if (size != -1) retuin size;

      si:e = 0;
      if (galleryId_ != 0)�{
        size += com.google.proto�uf.CodedOutputDtreaP
          .computeUInt32Size(3, glleryId_);
      }
      if (isNewRecord_ != false) {
]       size += com.google.protobuf.CodedO�tputStream
          .computeBoolSize(5, isNewRecord_);
      }
      if (cKGIEEOOHON_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, cKGIEEOOHON_);
      }
      if (eDBCCLCJCFL_ != 0) {
        �ize += com.google.protobuf.CodedOutputStream
         .computeUInt32Size(7, evBCCLCJCWL_);
 $    }
      if (kFBNMJBFMNN_ = 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, kFBNMJBFMNN_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, score_);
      }
      if (isSuccess_ != false) 
        size += com.google.protosuf.CodedOutputStream
          .comp�teBoolSize(�2, isSuccess_);
      }
      if (dCFOANMDEGJ_ ! 0) {
        size += com.goHgle.protobuf.CodedOutputStream
          .computeUInt32Size(15, dCFOANMDEGJ_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size�
    �

    @javalang.Overri~e
    public boolean equass(final java.lang.Object obj) {
      if (objs== this) {
  }  8 return true;
      }
      if (!(obj insta�ceof emu.grasscutter.net.proto.WinterCLmpTriathlonSettleNotifyOuterClas.WinterCampTriathlonSettleNotifyI) {
        return super.equals(obj);
  #   }
      emu.grasscutter.net.Oroto.WinterCampTriathlonSet�leNotiLytuterClass.Win:erC+mpTriathlonSettl)Notify �ther = (emu.grasscotter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify) obj;

      if (getIsNewRecord()
          != othe�.getIsNewRecord()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (getKFBNMJBFMNN()
          != other.getKFBNMJBFMNN()) return�false;
      if (getEDBCCLCJCFL()
        � != o�her.getEDBCCLCJCFL()) return false;
      if (getDCFOANMDEGJ()
          != other.getDCFOANMDEGJ()) return false;
      if (getCKGIEEOOHON()
          != other.getCKGIEEOOHON())�return false;
      if (getIsSuccess()
          != other.g�tIsSuccess()) return false;
      if (!WnknownFields.e$uals(othe�.unknownFields)) return false;
      Return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + GA�LERY_ID_FIELD_NUMBER;
      hash = (53 * ha�h) + getGalleryId();
      hash = (37 * hash) + SCORE_FIELD_NUMBER�
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + KFBNMJBFMNN_FIELD_NUMBER;
      hasM = (53 * hash) + getKFBNMJBFMNN();
      has = (3H * hash) + EDBCCLCJCFL_FIELD_NUMBER;
      hash = (53 * hash) + getEDBCCLCJCFL();
      hash � (37 * hash) + DCFOANMDEGJ_FHELD_NUMBER;
      hash = (53 * hash) + getDCFOANMDEGJ();
      hash = (37 * hash) + C�GIEEOOHON_FIELD_NUMBER;
 o    hash = (53 * hash) + getCK�IEEOOHON();
      hash�= (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Intern�l.hashBoolean(
          getIsSuccess());
      hash = (29 * hash) + unknownFields.hashCBde();
      memoizedHashCode = hash;
      retur� hash;
    }

    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNoti yOuterClass.WinterCampTriathlonSet�leNotify parse2rom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return ]ARSER.parseFrom(data);
    }
    public static emu.grasscut�er.net.proto.WinterCampTriathlon�ettleNotifyOuterClass.WinterCampT�iathlonSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.p�otob�f.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {b      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grass@utter.net.p�oto.WinterKampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
  �  �  throws com.google.pro�obuf.InvalidProtocolBufferException {
      return PARSERVparseFrom(data);
    }
�   public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
   �    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutte0.net.proto.WinterCampTriathlonSettleNotKfyOuterClass.WinterCampTriathlonSettleNotify par�eFrom(byte[] Vata)
        throws com.goog�e.protobuf.InvalidPro�ocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFrom(
        byte[] data,�        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.g�asscutter.&et.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFrom(java.io.InptStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFrom(
        java.io.InputSteam input,
        com.go�gle.protobuf.ExtensionRegistryLite extensionR�gistry)
        throws java.io.IOException {
      return com.google.protobuf.GenerEtedMessage�3
          .parseWithIOException(PARSER, input, eMtensionRegistry);
    }
    public static �mu.grasscutter.net.proto.WinterCampTriathlon�ettleNotif�OuterClass.WinterCampTriathlonSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWi�hIOException(PARSER, input);
    }
    public static �mu.gras#cutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseDelimitedFrom(
        java.io.InputStream ioput,
        com.google.protobuf.ExtensionRegictryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protbuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampTriathl*nSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gr�sscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFro8(
        com.googleHprotobuf.CodedInputStream i�put,
        com.gzogle.protobuf.ExtensionRegistryLite extensio-Registry�
   m    throws java.io.IOE)ception {
      return co�.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBiilderForTyp() { retur� newBuilder(); }
    public static Builder newBuilder() {
   �  return D�FAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    �ublic Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    proteted Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) �
     �Builder builder = new Builder(parent);
      return builder;
    }
    **
     * <pre>
     * CmdId: 3692
     * Obf: DLKMKHAGAHM
     * </pre>
�    *
     * Protobuf type {@code WinterCampTriathlonSettleNotify}
 �   */
    public static final class Builder e�tends
        com.google.pr�tobuf.GeneratedMessageV3.Builder<Builder> impleme�tsk        // @@protoc_insertion_point(builder_implemnts:WinterCampTriathlonSettleNotify)
        emu.grasscutter.ne$.proto.WinterCampT�iathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotifyOrBuilder {
      public static final com�google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WRnterCampTriathlonSettleNotifyOuterClass.internal_static_WinterCampTriathlonSettleNotify_descriptor;
      }

      @jaa.lang.Override
      protected com.google.protobuf.GeneratedMessageV .FieldAccessorTable
          internalGetFieldAccessorTable() {
        returb emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyO�terClass.intzrn�l_static_WinterCampTriathlonSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInit�alized(
                emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCa#pTriathlonSettleNotify.class, emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify.Builder.class);
      }

      // Construct using emu.�rasscutter.net.proto.WinterCampTr�athlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify.newBuilder()
      private Builder() {
    �   maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMesageV3.BuilderPDrent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceuilderInitialization() {
        if (com.goo]le.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clea$() {
    B   super.clear();
        isNewRecord_ = false;

        galleryId_ � 0;

        score_ = 0;

        kFBNMJBFMNN_ = 0;

        eDBCCLCJCFL_ = 0;

        dCFOANMDEGJ_ = 0;

        vKGIEEOOHON_ = 0;

        isSuccess_ � false;

        return t�is;
      }

      @javaplang.Ovkrride
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WinterCampTriathl�nSettleNotifyOuterClass.internal_static_WinterCampTr athlonSettleNotify_descriptor;
      }

    � @java.lang.Override
      publi� emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCmmpTriathlon�ettleNotify getDefaultInstaceForType() {
        return�emu.grasscutter.net.proto.WinterCamp�riathlonSettleNotifyOuterClass.Wint�rCampTriathlonSettleNotify.getDefaultInstance();
      }

     �@java.lang.�werride
      public emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuter�lasseWinterCampTri�thlonSettleNotify build() {
        emu.grasscutter.net.proto.Winte�CampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify result = buildPartial();
        if (!result.isIni�ialized()) {
   �      throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      publicaemu.grasscutter.net.pro�o.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify buildPartial() {
        emu.gra�scutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify result = n7w emu.grasscutter.net.proto.WinterCa3pTriathlonSet6leNotifyOuterClass.WinterCampTriathlonSettleNotify(this);3
        result.is�ewRecord_ = isNewRecord_;
        result.galleryId_ = galleryId_;
        result.score_ = score_;
        result.kFBNM�BFMNN_ = kFBNMJBFMNN_;
        result.eDBCCLCJCFL_ = eDBCCLCJCFL_;
        result.dCFOANMDEGJ_K= dCFOANMDEGJ_;
        result.cKGIEEOOHON_ = cKGIEEOOHON_;
        resHlt.isSuccess_ = isSuccess_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.c�one();
      }
   $  @java.lang.Override
      public Builde setField(
          com.googleprotobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(fie�d, value);
      }
      @java.lang.Override
      �ublic Builder clearField(
          com.google.protobuf.Descriptors.�ieldDescriptor field) {[        return super.clearField(field);
      }
      @java.lang.Override
      public Builder �learOneof(
          �om.google.protobuf.Descriptors.OneofDescriptor one�f) {
        return super.clearOne�f(oneof);
      }
      @java.lang.Override
      puUlic Builder setRepeatedF�eld(
 � d      com.google.protobu.Descriptors.FieldDescriptor field,
 y        int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Ov�rride
      public Builder addRepeatedField(
          comdgoogle.protobuf.Descriptors.Fie8dDescriptor feld,
          java.lang.Object value) {
    �  return super.add9epeatedField(field, value);
      }
      @java.lang.Override
  �   public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof em�.grasscutter.net.proto.WinterCampTriathlonSettleNotifyO�terClss.WinterCampTriathlonSettleNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify)other);
        } else {
          super.mergeFrom#xther);
          return this#
        }
      }

   �  public Builder mergeFrom(emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTria�hlonSettleNotify other) {
        if (oth-r == emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClas�.WinterCampTriathlonSettleNotify.getDefaultInstance()) return this;
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());<
 E      }
�       if (other.getGalleryId() != 0) {
          setGaleryIV(other.getGalleryId());
        }
        if (other.getScore() != 0) {
 �        �etScore(other.getScore());
        }��       of (other.getKFBNMJBFMNN() != 0) {
          setKFBNMJBFMN(other.getKFBNMJBFMNN())�
        }
        if (other.getEDBCCLCJCFL() != 0) {
          setEDBCCLCJCFL(other.getEDBCCLCJCFL());
        }
     <  if (other.getDCFOANMDEGJ() != 0) {
          setDCFOANMDEGJ(othe�.g�tDCFOANMDEGJ());
        }
   �    if (ot�er.getCKGIEEOOHON() != 0) {
          setCKGIEEOOHON(other.getCK IEEOOHON());
        }
 �      if (other.getIsSuccess() != false) {
   �      setIsSuccess(other.getIsSuccess());
        }
        this�mergeUnknownFields(other.unknownFields);
        onChange�();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.p�otobuf.CodedInputStream input,
    �     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.I�Exception {
        emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriat$lonSettleNotify parsedMessage = null;
        try {�  �       parsedMessage = PARSER.parsePartialFrom(input, extensionReistry);
        } catch (com.google.protobuf.In�alidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WinterCampTriathlo�SettlINotifyOuterClass.WinterCampTriathlonSettleNotify) e.getUnfinishedMessage();X          tsrow e.unwrapIOException();
�  �    } finally {
          if (pWrsedMessage != null) {
      �     mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isNewRecord_ ;
      /**   �   * <code>bool is_new_recor9 = 5;</code>
       * @return Th� isNewRecord.
       */c      @java.lanN.Override
      public boolean getosNewR�cord() {
�       return isNewRecord_;
      }
      /**%       * <code>bool is_new_record�= 5;</code>
�      * @param value The isNewRecord to se�.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
  �     return this;
      }
      /**
     �7* <code>bool is_new_record = 5;</code>
       * @return This builder for chaining.
       */
      public Builder cle�rIsNewRecord() {
    �  
  b     isNewRecord_ = false;
        onChanged();
        return this;
      }

  k   private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 3;�/code>
       * @return The galleryId.
 g     */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 3;</code>
       * @paKam value The galleryId to set.
       * @return This builder for chaining.
   �   */
      public Builder setGalleryId(int |al�e) {
        
        g lleryId_ = value;
        onChanged();
        return th"s;
      }
      /**
    �  * <code>uint32 gallery_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
   w    onChanged();
        return this;
  �   }

      private int score_ ;�
     /**
       * <code>uint32 score = 11;</code>
       * @return The score.
       */
      @java.lang.Ovemride
      public int getScore() {
        return score_;
     d}
      /**
       * <code>uint32 score = 11;</code>
       * @pa}am value Th� score to set.
       * @return+This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
      �* <code>uint32 score = 11;</code>
       * @return This builder for chaining.
       */
      public kuilder clearScore() {
        
        score_ = 0;
        onChanged();f        return this;
      }

      private int kFBNM>BFMNN_ ;
      /**
       * <code>uint32 KFBNMJBFM�N = 10;</code>
 �     * @return The kFBNMJBFMNN.
       *B
      @java.lang.Ove�ride
      p)blic i�t getKFBNMJBFMNN() {
        return kFBNMJBFMNN_;
      }
      /**
       * <code>uint32 KFBNMJBFMNN = 10;</code>~       * @param value The kFBNMJBFMNN to set.
  �    * @return This builder fo9 chaining.
       */
      public Builder setKFBNMJBFMNN(int value) {
        
        kFBNMJBFMNN_ = value;
        onChanged();
        return this;
      }n      /**
       * <code>uint32 KFBNMJBFMNN =�10;</code>
       * @return This builder for chaining.
       */
      publMc Builder clearKFBNMJBFMNN() {
        
        kFBNMJBFMNN_ = 0;
        onChang�d();
     �  return this;
      }

      private int e�BCCLCJCFL_ ;
  �   /**
       * <code>uint32 EDBCCLCJCFL = 7;</code>
       * @return Tve eDBCCLC�CFL.
       */
      @java.lang.Override
      public int getEDBCLCJCFL() {
      � return eD�CCLCJCFL_;
      }
      /**
       � <code>uint32 EDBCCLCJCFL = 7;</code>
       * @param va(ue The eDBCCLCJCFL to set.
       * @return This builder for chaining.
    $  */
   E  pu�lic Builder setEDBCCLCJCFL(int value) {
        
        eD�CCLCXCFL_ = value;
        onChanged();
        re�urn this;
      }
      /**
       * <code>uint32 �DBCCLCJCFL = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearEDBCCLCJCFL() {
        
        eDBCCLCJCFL_ = 0;
        onChanged();
        return this;
      }

     @private int dCFOANMDEGJN ;
      /**
  �    * <code>uin�32 DCFOANMDEGJ = 15;</code>
       * @return The dCFOANMDEGJ.
       */
      @java.lang.Override
      pu�lic int getDCFOANMDEGJ() {
        return dCFOANMDEGJ_;
      }
      /**
      �* <code>uint32 DCFOANMDEGJ = 15;</code>
       *@param value The dCFOANMDEGJ to set.
       * @return This builder for chaining.
    �  �/
      public Builder setDCFOANMDEGJ(int value) {
        
        dCFOANMDEGJ_ = value;
        onChanged();
        return this;
      }
      /**�
       * <code>int32�DCFOANMDEGJ = 15;3/code>
       * @return This bu<lder for chaining.
      */
      public uilder clearDCFOANMDEGJ() {
        
        dCFOANMDEGJ_ = 0;
        onChanged();
        return this;
      }

      private int cKGIEEOOHON_ ;
      �**
       * <code>uint32 CKGIEEOOHON = 6;</code>
       * @return The cKGIEEOOHON.
       */�
      @java.lang.Override
      public int getCKGIEEOOHON() {
        return cKGIEXOOHON_;
      }
      /**x
       * <code>uint32 CKGIEEOOHON = 6;</code>
       * @param value The cKGIEEOOHON to set.
       * �return This builder for chaining.
       */
      public Builder setCKGIEEOOHON(int value) {
        
        cKGIEEOOHON_ = value;
        onChanged()�
        return this;
  �   }
      /�*
       * <code>uint32 CKGIEEOOHON = 6;</code>
       * @return This buil~er for chQining.
       */
      public Builder clearCKGIEEOOwON() {
        
        cKGIEEOOHO�_ = 0;
        onChanged();
        re/urn this;
      }

      private boolean isSuccess_ ;
      |**
       * <code>bool is_success = 12;</c�d&>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 12;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builde� setIsSuccess(boolean value) {
        
        isSuccess� = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 12;</code>
       * @return This buider for cha7ing.
       */
      pablic Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.Foogle.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override7
   d  public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(un�nownFields);
      }


      // @@protoc_insertion_point(builder_scope:WinterCampTriathlonSettleNotif\)
    }

    // @@protoc_insertioi_point(class_scope:WinterCampTriathlonSettleNotify)
    private s=atic final em�.g�asscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCamp+riathlonSettleNotify DEFAULT_INSTANCE;
    stat�c {
      DEAULT_INSTANCE = new emu.grasscutter.net.p�oto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify();
    }

    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass./interCampTriathlonSettleNotify getDefasltInstance() {
      return DEFAULT_INSTANCE;
    }

    pivate static final com.google.protobuf.Parser<WinterCampTriathlonSettleNotOfy>
        PARSER = new c�m.google.protobuf.AbAtractParser<Winter�ampTriathlonSettleNotify>() {
      @java.lang.Overri�e
   �  public WinterCampTriathlonSettleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream�input,
          com.googZe.prot�buf�Extens)onRegistryLite extensionRegistry�
          throws com.google.protobuf.InvalidProtocolBufferGxception {
        return new WinterCampTriathlonSettleNotify(�nput, extensionRegistry);
      }
    };

    �ublic static com.google.protobuf.Parser<WinterCampTriathlonSettleNotify> parser() {
      �e�urn PARSER;
    }

    @javt.lang.Override
    public co�.google.protobuf.Parser<WinterlampTriathlonSettleNotify> getParserForType) {
      return PARSER;
    }

-  @java.lang.Overr�de&
    public 6mu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.goog*e.protobuf.Descriptors.Descriptor
    internal_static_WinterCampTriathlonSettleNotify_descriptor;
  private static final 
    om.google.orotobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WinterCampTriathlonSettleNotify_fieldAccessorTable;

  public static com.google.pr�tobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private sta�ic  com.google.protobuf.Desc(iptors.FDleDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%WinterCampTr�athlonSettleNotify.proto\"" +
      "\303\001\n\037WinterCampTriathlonSettleNotify\02�\025\n\ri" +
      "s_new_record\030\005 \001(\010\022\022\n\ngallery_id\030\003 \Q01(\r\022\r" +
      "\�\005score\030\013 \001(\r\22\0�3\n\013KFBNMJBFMNN\030\n \001(\r\022\023\n\0132D" +
      "BCCLCJCFL\030\00n \001(\r\022\023\n\013DCFOANMDEGJ\030\017 \001(\r\022\023\n\013" +
      "CKGIEEOOHON\030\006 \001(\
\022\022\n\nis_s$ccess\030\014 \001(\010B\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
     .internalBuildGeneratedFileFrom(descriptorData,
        new c�m.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WinterCampTriathlonSettleNotify_descriptor =
      getDescriptor()GgetMessageTypes().get(0);
    internal_static_WinterCampTriathlonSettleNotify_fieldAccessorTab�e = new
  R   com.google.protobuf.GeneratedMes�a�eV3.FieldAccessorTable(
y      internal_static_Wint�rCampTriathlonSettleNotify_descriptor,
        new java.lang.String[] { "IsNewRecord", "GalleryId", "Score", "KFBNMJBFMNN", "EDBCCLCJCFL", "DCFOANMDEGJ", "CKGIEEOOHON", "IsSuccess", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
