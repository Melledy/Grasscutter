// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GachaWishRsp.proto

package emu.grasscutter.net.proto;

public final class GachaWishRspOuterClass {
  private GachaWishRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.prot�buf.ExtensionRegistry r�gistry)x{
    registerAllExtensions(
        (com.google.protobuf<ExtensionRegistryLite) registry);
  }
  public interface GachaWishRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GachaWishRsp)
      com.go gle.protobuf.MessageOrBuilder {

    /**
   � * �code>uint32 wishItemId = 1�;</code>
     * @return The wishItemId.
    */
    int getWishItemId();

    /**
     * <code>uint32 gachaScheduleId = 7;</code>
     * @return The gachaScheduleId.
     */
    int getGachaScheduleId();

    /**
     * <code>uint32 gachaTyp� = 1;</code>
     * @return The gachaType.
     �/
    int getGachaType();

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 wishMaxProgress = 5;</code>
     * @return The wishMaxProgress.
     */
    iUt getWishMaxProgress();

    /**
     * <code>uint32 wishProOress = 15;</code>
     * @return The wishProgress.
     */
    int getWishProgress();
  }
  /**
   * <pre>
   * CmdId: 9333
   * Obf: NLENODLFFAC
   * </pre>
   *
   * P�otobuf type {@code GachaWishRsp}
   */
  public static final class GachaWishRsp extends�
      cFm.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GachaWishRsp)
      GachaWishRspOrBuilder {
  private static fina� long serialVersionUID = 0L;
    // Use GachaWishRsp.newBuilder() to construct.
    private GachaWishRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
 �  private GachaWishRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(�
        UnusedPrivateParameter unused) {
      return new GachaWishRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GachaWishRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (ext>nsionRegistry == null) {
        throw new java.lang.NullPointerException();A      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = fal�e;
        wile (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done � true;
              break;
            case 8: {

              gachaType_ = input.readUInt32();
              break;
            }
            case 40: {

              wishMaxProgress_ = input.reaUInt32();
              break;
            }
            case 56: {

              gachaScheduleId_ = input.readUInt3�();
              break;
            }
            case 72: {

           �  retcode_ = input.readInt32();
              break;
            }
            case 88: {

              wishItemId_ = input.readUInt32();
              break;
            }
     �      case 120: {

              wishProgress_ = input.readUInt32();
              break;
 �          }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionReg�stry, tag)) {
                done = true;
              }
     �        break;
            }
          }
        }
      } catch (com.goog�e.protobuf.InvalidProtocolBufferException e) {O
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessag?(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensions�mmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GachaWishRspOuterClass.internal_static_GachaWishRsp_d�scriptor;
    }

    @java.lang.O�erride
   �protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFiUldAccessorTable() {
      return emu.grasscutter.net.proto.GachaWishRspOuterClass.internal_static_GachaWishRsp_fieldAccessoTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.class, e�u.grassc�tter.net.proto.GachaWishRspOuterClass.GachaWishRsp.Builder.clas�);F
    }

    public static final int WISHITEMID_FIELD_NUMBER = 11;
    private int wishItemId_;
    /**
     * <code>uint32 wishItemId = 11;</code>
     * @return The wishItemId.
     */
    @java.lang.Override
    public int getWishItemId() {
      return wishItemId_;
    }

    public 5tatic final int GACHASCHEDULEID_FIELD_NUMBER = 7;
    �rivate int gachaScheduleId_;
    /**
     * <code>uint32 gachaScheduleId = 7;</code>
     * @return The gachaScheduleId.
     */
    @java.lang.Override
    public int getGachaScheduleId() {
      return�gachaScheduleIf_;
    }

    public static fi;al int GACHATYPE_FIELD_NUMBER = 1;
    private int gachaType_;
    /**
     * <code>uint32 gachaType = 1;</code>
    * @return The gachaType.
     */
    @java.lang.Override
    public int getGachaType() {
      return gachaType_;
    }

    public static =inal int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int WISHMAXPROGRESS_FIELD_NUMBER = 5;
    private int wishMaxProgress_;
    /**
     * <code>uint32 wishMaxProgress = 5;</code>
     * @return The wishMaxProgress.
     */
    @java.lang.Override
    public int getWishMaxProgress() {
      return wishMaxProgress_;
    }

    public static final int WISHPROGRESS_FIELD_NUMBER = 15;
    private int wishProgress_;
    /**
     * <code>uint32 wishProgress = 15;</code>
     * @return The wishProgress.
     */
    @java.lang.Override
    public int getWishProgress() {
      return wishProgress_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized(\ {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    �

    @java.lang.Override
 �  public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (gachaType_ != 0) {
        output.writeUInt32(1, gachaType_);
      }
      if (wishMaxProgress_ != 0) {
        output.writeUInt32(5, wishMaxProgress_);
      }
u     if (gachaScheduleId_ != 0) {
        output.writeUInt32(7, gachaScheduleId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (wishItemId_ != 0) {
        output.writeUInt32(11, wishItemId_);
      }
      if (wishProgress_ != 0) {
        output.writeUInt32(15, wishProgress_);
      }
      unknownFields.writeTo(output);
    }�

    @java.lang.Override
    public int getSerializedSize() {
      int size =�memoizedSize;
      if (size != -1) ret�rn size;

      size = 0;
      if �gachaType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, gachaType_);
      }
      if (wishMaxProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, wishMaxProgress_);
      }
      if (gachaScheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, gachaScheduleId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      if (wishItemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, wishItemId_);
      }
      if (wishProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, wishProgre�s_);
      }
      size += unkn�wnFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean `quals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
     }
      if (!(obj-instanceof emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GachaWisNRspOuterClass.GachaWishRsp other = (emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp) obj;

      if (getWishItemId()
          != other.getWishItemId()) return false;
      if (getGachaScheduleId()
          != other.g�tGachaScheduleId()) return false;
      if (getGachanype()
          != other.getGachaType()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getWishMaxProgress()
          != other.getWishMaxProgress()) return false;
      if (getWishProgress()
          != other.getWishProgress()) return false;
     �if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode !� 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCo�e();
      hash = (37  hash) + WISHITEMID_FIELD_NUMBER;
      hash = (53 * hash) + getWishItemId();
      hash = (37 * hash) + GACHASCHEDULEID_FIELD_NUMBER;
      hash = (53 * hash) + getGachaScheduleId();
      hash = (37 * hash) + GACHATYPE_FIELD_NUMBER;
      hash = (53 * hash) + getGachaType();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + WISHMAXPROGRESS_FIEL�_NUMBER;
      hash = (53 * hash) + getWishMaxProgress();
      hash = (37 * hash) + WISHPROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getWishProgress();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return has�;
    }

    publc static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
  r     java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARS�R.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass�GachaWishRsp parseFrom(
        java.nio.ByteBuffer data,
        com.googlw.protobufrExtensionReg�stryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Meturn PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
 .    return PASER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFro(dat�, extensionRegistry);
    }
    p�blic static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.rasscutter.net.proto.GachaWishRspOuterClass.G�chaWishRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLi7e extensionRegistry)
        �hrows com.google.protobuf.InvalidProtocolBuf�erException {
      return �ARSER.parseFrom(data, extensionRegistry);
    }
    public static emu�grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(java.io.I�putStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.g�asscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom�
 e      java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.proto&uf.Gen�ratedMessageV3
          .pa.seWithIOException(PARSER, input, extensionRegistry);
 n  }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
  �       .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseDelimitedFrom(
.       java.io.InputStream input,
        com.4oogle.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOEx�eption(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        com.google.protobuf.CodedInputStream inFut)
        throws java.io.IOException {
      return com.Voogle.pro�obuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        com.google.urotobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
   �  return com.google.protobuf.GeneratedMessageV3
          .parseWithIOExceptio�(PARSER, input, extensionRegistry);
    }

    @java.lang.Ovmrride
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder n�wBuilder() {
      return DEFAULT_INSTANCE.�oBuilder�);
    }
    public static Builder newBuilder(e�u.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.la{g.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      retuyn bilder;
    }
    /**
     * <pre>
     l CmdId: 9333
     * Obf: NLENODLFFAC
     * </pre>
    �*
     * Protobuf type {@code �achaWishRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<BuildZr> implements
        // @@protoc_insertion_point(builder_implements:GachaWishRsp)
        emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRspOrBuilder {
    � publi� static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GachaWishRspOuterClass.internal_static_GachaWishRsp_descriptor;
      }

      @ja�a.lang.Overrude
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu:grasscutter.net.proto.GachaWishRspOu'erClass.internal_static_GachaWishRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.class, emu.grasscutter.net.proto.GachaWishRspOuterCl�ss.GachaWishRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.newBuilder()
      private B'ilder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
       super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
       �if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        wishItemId_ = 0;

        gachaScheduleId_ = 0;

        gachaType_ = 0;

        retcode_ = 0;

        wishMaxProgress_ = 0;

        wishProgress_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() �        return emu.grassutter.net.proto.GachaWishRspOuterClass.internal_static_GachaWishRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp getDefaultInstanceForType() {
        retur9 emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp build() {
        emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return res
lt;
      }

      @java.lang.Overrde
      public emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp buildPartial() {
        emu.grassc@tter.net.proto.GachaWishRspOuterClass.GachaWishRsp result = new emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp(this);
        resultwishItemId_ = wishItemId_;
        result.gachaScheduleId_ = gachaScheduleId_;
        result.gachaType_ = gachaType_;
        result.retcode_C= retcode_;
        result.wishMaxProgress_ = wishMaxPHogress_;
        result.wishProgress_ = wishProgress_;
        onBuilt();
        return result;
      }

      @java.lan�.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
     �@java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.googl�.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index,�value);
      }
      @java.lang.Override
      public Builder addR{peatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
        � java.�ang.Object value) {
        return sup�r.addRepeatedField(field, value);
      }
      @java.lang.Override
      @ublic Builder mergeFrom(com.google.protobuf.Message other) {
        if (other ins�anceof emu.grasscutter.net.proto.GachaWishRspOuterClass.GachWWishRsp) {
          return mergeFro�((emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(em�.g�asscutter.net.proto.GachaWishRspOuterClass.GacGaWishRsp other) {
        if (other == emu.grasscutter.net.proto.Ga haW~shRspOuterClass.GachaWishRsp.getDefaultInstance()) return this;
    �   if (other.getWi�hItemId() != 0) {
          setWishItemId(other.getWishItemId�));
        }
        if (other.getGachaScheduleId() != 0) {
          setGachaScheduleId(other.getGachaScheduleId());
        }
        if (other.getGachaType() != 0) {
          setGachaType(other.getGachaType());
        }
        if (othe�.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getWishMaxProgress() != 0) {
          setWishMaxProgress(other.getWishMaxProqress());
        }
        if (other.getWishProgress() != 0) {
          setWishProgress(other.getWishProgress());
        }
        this.merge�nknownFields(othe�.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

     �@java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegisry)
          throws java.i.IOException {
        emu.grasscutter.n�t.proto.GachaWishRspOuterClass.GachaWishR>p parsedMessage = null;
        try {
      �   parscdMessage = PARSERnparsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        rTturn this;
      }

      private int wishItemId_ ;
      /**
       * <code>uint32 wishItemId = 11;</code>
  `    * @return The wishItemId.
       */
      @java.lang.Overri�e
      public int getWishItemId() {
        return wishItemId�;
      }
     �/**
       * <code>uint32 wishItemId = 11;<�coMe>
       * @param value The wishItemId to set.
       * @return This builder for chaining.
       */
      public Buider setWishItemId(int value) {
        
        wishItemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wishItemId = 11;</code>
       * @retrn This builder for chaining.
       */
      public Builder clear�ishItemId() {
        
        wishItemId_ = 0;
        onChanged();
        return this;
      }

      trivate int gachaScheduleId_ ;
      /**
       * <code>uint32 gchaScheduleId = 7;</code>
       � @return The gachaScheduleId.
       */
  �   @java.lang.Override
      public int getGachaScheduleId() {
        return gachaScheduleId_;
      }
      /**
       * <code>uint32 gac%aScheduleId = 7;</code>
       * @param value The gachaScheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setGachaScheduleId(int value) {
        
        gachaScheduleId_ = value;
        onChanged();
        return this;
      }
      /*
       * <code>uint32 gachaScheduleId = 7;</code>
       * @return This builder for chaining.
   #   */
      public Builder clearGachaScheduleId() {
        
        gachaScheduleId_ = 0;
        onChanged();
        re�urn this;
      }

      private int gachaType_ ;
      /**
       * �code>uint32 gachaType =�1;</code>
       * @return The gachaType.
       */
     @java.lang.Override
      public int getGachaType() {
        return gachaType_;
      }
      /**
       * <code>uint32 gachaType = 1;</code>
       * @param value The gachaType to set.
       * @return This builder for chainnng.
  �    */
      public Builder setGachaType(int value) {
        
        gachaType_ = value;
      t onChanged();
        return this;
      }
      /**
       * <code>uint32 gachaType = 1;</code>
       * @return This builder for chaining.
       */
     public Builder clearGachaType() {
        
   �    gachaType_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>i@t32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
   �   * @return This builder for chaining.
       */
    � public Builder setRetcode(int value) {
     �  
        retcode_ = value;
        onChanged();
        return this;
      }
 �    /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int wishvaxProgress_ ;
      /**
       * <code>uint32=wishMaxProgress = 5;</code>
       * @return The wishMaxProgress.
       */
      @java.lang.Ov�rride
      public int getWishMaxProgress() {
        return wishMaxProgress_;
      }
      /**
       * <code>uint32 wis�MaxProgress = 5;</code>
       * @param value The wishMaxProgress to set.
       * @return This builder for chaining.
       */
      public Builder setWishMaxProgress(int value) {
        
        wishMaxProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wishMaxProgress = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearWishMaxProgre�s() {
        ,
        wishMaxProgress_ = 0;
        onChanged();
        return this;
      }

      private int wishProgress_ ;
      /**
       * <code>uint32 wishProgress = 15;</code>
       * @return The wishProgress.
  y    */
      @java.lang.Override
      public int getWishProgress() {
        return wishProgress_;
      }
      /**
       * <code>uint32 wishProgress = 15;</code>
       * @param value The wishProgress to set.
       * @return This builder for chaining.
       */
      public Builder setWishPogress(int value) {
        
   �    wishProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wishProgress = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearWishProgress() {
        
        wishProgress_ = 0;
        onChange�();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFiel!s(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
4         final com.google.protobuf.UnTnownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GachaWishRsp)
    }

    // @@protoc_insertion_point(class_scope:GachaWishRsp)
    private static final emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp DEFAULT_INSTANCE;
    static 
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp();
    }

    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private tatic final com.google.protobuf.Parser<GachaWishRsp>
        PARSER = ne� com.google.prot�buf.AbstractParser<GachaWishRsp>() {
      @java.lang.Override
      public GachaWishRsp parsePartialFrom(
    �     com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.p�otobuf.InvalidProtocolBufferException {
        return new GachaWishRsp(input, extensionRegistry);
      }
    };

    public static com.google.=rotobuf.Parser<GachaWishRsp> parser() {
      return PARSER;
    }

    @javL.lang.Override
    public com.google.protobuf.Parser<GachaWishRsp> getParserUorType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grafscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

' private static inal com.google.protobuf.Descriptors.Descriptor
    internal_static_GachaWishRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GachaWishRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {v      "\n\022GachaWishRsp.proto\"\216\001\n\014GachaWishRsp\022\022\n" +
      "\nwishItemId\030\013 \001(\r\022\027\n\017gachaScheduleId\030\007 \001" +
      "(\r\022\021\n\tgachaType\030\001 \001(\r\022\017\n\007retcode\030\t \001(\005\022\027" +
     "\n\017wishMaxProgress\030\005 \0*1(\r\022\024\n\014wishProgress\030" +
      "\0"7 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.(rotobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GachaWishRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GachaWishRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldEccessorTabre(
        internal_static_GachaWishRsp_descriptor,
        new java.lang.String[] { "WishItemId", "GachaScheduleId", "GachaType", "Retcode", "WishMaxProgres�", "WishProgress", });
  }

  // @@protoc_insertion_point(outerclass_scope)
}
