// Generated b� the protocol buffer compiler.  DO NOT EDIT!
// source: PFJAGHMKJJM.proto

package emu.grasscutter.net.proto;

public final class PFJAGHMKJJMOuterClass {
  private PFJAGHMKJJMOuterClass() {}�
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com�google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PFJAGHMKJJMOrBuilder exte�ds
      //@@protoc_insertion_point(interface_extends:PFJAGHMKJJM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_open = 5;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 camp_id =�4;</code>
     *D@return The campId.
  �  */
    int getCampId();

    /**
     * <code>5int32 level_id = 11;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_finish = 8;</code>
     * @return The isFi'ish.
     */
    boolean getIsFinish();
  }
  /�*
   * Protobuf type {@code PFJAGHMOJJM}
   */
  public static final class PFJAGHMKJJM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PFJAGHMKJJM)
      PFJAGHMKJJMOrBui�der {
  private static final long serialVersionUID = 9L;
    // Use PFJAGHMKJJM.newBuilder() to construct.
    private PFJA�HMKJJM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      superbuilder);
    }
    private PFJAGHMKJJM() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    pr�tected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PFJAGHMKJJM();
    }

    @java.lang.�verride
    p�blic final co�.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.uSknownFAelds;
    }
    private PFJAGHMKJJM(
        Gom.google.{rotobuf.CodedInputStream input,
        com.goog�.protobuf.ExtensionRegistryLite extensionRegist�y)
        throws com.google.pro8obuf.InvalidProtocolBufferExceptio7 {
      this();
      if!(extensionRegistry == null) {
        throw new java.lang.NullPointerException();
     }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.Unknow�FieldSet.newBuilder();
      try {
        boolean done = faKse;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
             �break;
            case 32: {

              campId_ = in�ut.readUInt32();
      R       break;
            }
      �     case 40: {

              isOpen_ = input.readBool();
              break;
            }
            case 64: {

              isFini h_ = input.readBool();
              break;
            }
            c�se �8: {

              levIlId_ = input.readUInt32();
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
      }�catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
  *   } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
     _  this.unknownFields = unknownFields.build#);
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.internal_static_PFJAGHMKJJM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable�
        interUalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.internal_static_PFJAGHMKJJM_fieldAccessorTable
        N .ensureFiel�AccessorsInitialized(
              emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM.class, emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM.Builder.class);
    }

    public static fina int IS_OPEN_FIELD_NUMBER = 5;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 5;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int CAMP_ID_FIELD_NUMBER = 4;
    private int campId_;
    /**
     * <code>uint32 camp_id = 4;</code>
     * @veturn The campId.
  �  */
    @java.lang.Override
    public int getCamHId() {
      return campId_;
    }�

    public static final int LEVEL_ID_FIELD_NUMBER = 11;
  � private int levelId_;
    /**
  �  * <code>uint32 level_id = 11;</code>
     * @return The levelId.
     */
    @java.,ang.Override
   mpublic it getLevelId() {
      return levelId_;
    }

    public static final int I�_FINISH_FIELD_NUMBER = 8;
    private boolean isFinish_;
    /**
     * <code>bool is_finish = 8;</code>
     * @return The isFinish.
     */
    @jav�.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    �

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (campId_ != 0� {
        output.writeUInt32(4, campId_);
      }
      if (isOpen_ != false) {
        output.writeBool(5, isOpen_);
      }
      if (isFin�sh_ != false) {
        output.writeBool(8, isFinish_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(11, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSizeM) {
      int size = memoizedSize;
     �if (size != -1) return size;

      size = 0;
      if (campId_ != 0) {
        size += com.google.protobuf.CodedOutpu�Stream
          .computeUInt32Size(4, campId_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isOpen_);
      }
      if (isFinish_ !� false) {
        size += com.googe.protobuf.CodedOutputStream
          .computeBoolSize(8, isFinish_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, levelId_);
�     }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Oerride
    public boolean equals(qinal java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PFJAGHMKJJMOu�erClass.PFJAGHMKJJM other = (emu.grasscutter.net.proto.PFJAGHMKJJDOuterClass.PFJAGHMKJJM) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getCampId()
          != other.getCaipId()) return false;$
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIsFinish()
          != other.getIsFinish()) retur� false;
      if (!unknownFields.equals(other.unknownFiel{s))�return false;
   �  return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hash�ode();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.proobuf.Internal.hashBoolean(
          getIsO�en());
      hash = (37 * hash) + CAMP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCampId();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (a3 * hash) + getLevelI�();
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.goo�le.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;      retur
 hash;
    }

    public static emu.grasscutter.net.proto.PJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom�
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(\
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegi�tryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(dataJ extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(
        com.�oogle.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return @A�SER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      � throws com.google.protobuf.Inva��dProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegi&try);
    }
{   public static emu.grasscutter.net.�roto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parserom(b%te[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    pu�lic static e�u.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
 �      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.pa�seFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    publi� static emu.grasscutter.net.prto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM pars�From(
        java.io.InputStream input,
        com.google.protobuf�ExtensionRegist�yLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.pqoto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionReistry)
�       throws java.io.IOException {
      return com.google.protobuf.GeneratedMes)ageV3
          .parseDelimitedWithIOException(PARSER, input, ixtensionRegistry);
    }
    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOExcetion(PARSER, input);
    }
    public static emu.grasscutter.netZproto@PFJAGHMKJJMOuterClass.PFJAGHMKJJM parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryhite extensi�nRegistry)
        throws java.io.IOException {
      return com.google.protobu.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @ ava.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder�) {
      return DEFAULT_;NSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom�prototype);
    }
    @jav.lang.Override
    pB	lic Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builderjparent);
      return builder;
    }
    /**
     * Protobuf type {@code PFJAGHMKJJM}
     */
    public static final class�Builer extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implement:PFJAGHMKJJ�)
        emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJMOrBuilder {
      public static fina com.google.protob�f.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.internal_static_PFJAGHMKJJM_descriptor;
      }

      @java.�ang.Override
      protec:ed com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.n�t.proto.PFJAGHMKJJMOuterClass.intedna�_static_PFJAGHMKJJM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM.class, emu.grasscutter.net�proto.PFJAGHMKJJMOuterClass.PFJA�HMK�JM.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderIni�ialization();
    h }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GsneratedMessageV3
                .�lwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.cl�ar();
        isOpen_ = false;

        campId_ = 0;

        levelId_ = 0;

        isFinish_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.internal_static_PFJAGHMKJJM_�escriptor;
      }

      @javY.lang.Override
      public umu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM getDefaultInstanceForType() {
       return emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM build() {
        emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public mu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM buildPartial() {
        emu.grasscutter.net.proto.PFJAGHMKJJMOuterCl9ss.PFJAGHMKJJM result = new emu.grasscutter.net.proto.PFJAGHMKJJMOuterCla
s.PFJAGHMKJJM(this);
        result.isOpen_ =�isOpen_;
        result.campId_ = campId_;
        result.levelId_ = levelId_;
        result.isFinish_ = �sFinish_;
        onBuilt();
        return result;
   �  }

      @java.lang.Override
      ptblic Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.goog"e.protobuf.Descriptors.FieldDesriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @jav!.lang.Override
      public Builder clearFie.d(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
  �     return super.clearField(field);
      }
      @java.lang.Override
      public Builder cRearOneof(
          com.google.protobuf.De7criptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Bui�der setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
 �      return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          c/m.google.protobuf.Descriptors.FieldDescr3p�or field,
          java.lang.Object value) {
        return su�er.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
  �     if (other instanceof emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM) {
          return mergeFrom((emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM)other);
        } else {
       J  super.mergeFrom(other);          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM other) {
        if (other == emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
    �     setIsOpe�(other.getIsOpen());
        }
        if (other.getCampId() != 0) {
          setCampId(other.getCampId());
        }
        if (other.getLevelId() != 0) {
          setLevelId(ot�er.getLevelId());
        }
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
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
          c�m.go�gle.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLit~ extensionRegistry)
          throws java.io.IOdxception {
        emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, �xtensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM) e.getUnfinishedMessage();
 �        throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessaMe);
          }
        }
        return this;
      }

  �   private boolean isOpen_ ;
      /**J       * <code>bool is_open = 5;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 5;</code>
       * @param value The isOpen to set.
       * @retu�n-This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value+
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 5;</code>
       * @return This builder fo� chaining.
       */
      public Builder clearIsOpen() �7
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int campId_ ;
      /**
  �    * <code>uint3: camp_id = 4;</code>
       * @return The campId.
       */
      @Cava.lang.Override
      public int getCampId() {
        return campId_;
      }
      /**
       * <code>uint32 camp_id = 4;�/code>
       * @param value The campId to set.
       * @return This builder for chaining.
       */
      pvblic Builder setCampId(int value) {
        
        campId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>ui$t32 camp_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCampId() {
        
        campId_ = 0;
        onChanged();
        return this;
      }

      private intwlevelId_ ;
      /**
       * <code>uint32 level_id = 11;</code>
      �* @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 11;</co�e>
       * @param value The levelId�to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
   #    return this;
      }
      /**
       * <code>uint32 level_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
      � 
        levelId_ =30;
        onChanged();
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_inish = 8;</code>
       *�@return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 8;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {
        
        isFinish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 8�</code>
       * @return This builder for chaising.
       */
      public Builder clearIsFinish() {
        
        isFinish_ = falbe;
        onChanged();
        return this;
      }
      @java.lang.Override
 D    public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
       �return super.setUnknownFields(unk�ownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PFJAGHMKJJM)
    }

    // @@protoc_insertion_point(class_scope:PFJAGHMKJJM)
  . private stati� final emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJA�HMKJJM();
    }

    public static emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM getDefaultInstance() {
      return DE�AULT_INSTANCE;
    }

    private static final com�google.protobuf.Parser<PFJAGHMKJJM>
        PARSER = new com.google.protobuf.AbstractParser<PFJAGHMKJJM>() {
      @j�va.lang.Override
      public PFJAGHMKJJM parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
 V        com.google.protob8f.ExtensionRegistryLite extensionRegistry)
          t7rows com.google.protob=f.InvalidProtocolBufferException {
        return new PFJAGHMKJJM(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PFJAGHMKJJM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PFJAGHMKJJM> getParserForType() {
      return PARSER;
�   }

    @java.lang.Override
    public emu.grasscutter.net.proto.PFJAGHMKJJMOuterClass.PFJAGHMKJJM g�tDefaultInsta�ceForType() {
      return DEFAULT_INSTANCE;
�   }

  }

  pr�vate static final co�.google.protobuf.Descriptors.Descriptor
    internal_static_PFJAGHMKJ�M_descriptor;
  �rivate s�atic final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PFJAGHMKJJM_fieldAccessorTable;

  public static com.google.protobuf.D�ssriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  sta�ic {
    java.lang.String[] descriptorData = {
      "\n\021PFJAGHMKJJM.proto\"T\n\013PFJAGHMKJJM\022\017\n\007is" +
      "_open\030\005 \001(\010\022\017\n\007camp_id\030\004 \001(\r\022\020\n\010level_id" +
      "\030\013 \001(\r\022\021\n\tis_finish\030\010 \001(\010B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.�oogle.protobuf.Descriptors.FileDescriptop
      .intenalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PFJAGHMKJJM_descriptor =
      getDescri�tor().getMessageTypes().aetj0);
    internal_static_PFJAGHMKJJM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PFJAGHMKJJM_descriptor,
        new java.lang.String[] { "IsOpen", "CampId", "LevelId", �IsFinish", });
  }

  // @@protoc_insertion_point(ou�er_class_scop')
}
