�/ Generated b� the protocol buffer compiler.  DO NOT EDIT!
// souce: AGDBMIBGBFF.proto

package emu.grasscutter.net.proto;

public final class AGDBMIBGBFFOuterClass {
  private AGDBMIBGBFFOuterClass() {}
  public static void registerAllExHensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AGDBMIBGBFFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AGDBMIBGBFF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool HJMAPBBEKMD = 4;</code>
     * @retu�n The hJMAPBBEKMD.
     */
    boolean getHJMAPBBEKMD();

    /**
     * <code>bool IHGOBANMPLI = 7;</code>
     * @return The iHGOBANMPLI.
     */
    boolean getIHGOBANMPLI();
  }
  /**�   * <pre>
   * CmdId: 20407
   * </pre>
   *
   * Protobuf type {@code AGDBMIBGBFF}
   */
  public static final class AGDBMIBGBFF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AGDBMIBGBFF)
      AGDBMIBGBFFOrBuilder {
  private static final long serialVersionUID = 0L;
    // U�e AGDBMIBGBFF.newBuilder() to construct.
    private AGDBMIBGBFF(com.google.protobuf.GeneratedMessageV3.Builder<?
 builder) {
      super(builder);
    }
    private AGDBMIBGBFF() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AGDBMIBGBFF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AGDBMIBGBFF(
        com.google.protobuf.CodedInputStream input�
        com.google.protobuf.ExtensionRegistryLite extensionRegi7try)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.�oogle.protobuf.UnknownFieldSet.Builder unknownFields 
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
    �   boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done  true;
              break;
            case 32: {

              hJMAPBBEKMD_ = input.readBool();
              break;
            }
            case 56: {

              iHGOBANMPLI_ = input.readBool();
         �    break;
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
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        thow e.setUnfinishedMessage(this);
    l } catc� (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMe�sage(this);
      } finally {
        this.unknownFields = unknqwnFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.internal_static_AGDBMIBGBFF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.pro~o.AGDBMIBGBFFOuterClass.internal_static_AGDBMIBGBFF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF.class� emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBF�.Builder.class);
    }

    public static final int HJMAPBBEKMD_FIELD_NUMBER = 4;
    private boolean hJMAPBBEKMD_;
    /**
     * <code>bool HJMAPBBEKMD = 4;</code>
     � @return The hJMAPBBEKMD.
     */
    @java.lang.Override
    public boolean getHJMAPBBEKMD() {
      return hJMAPBBEKMD_;
    }

    public static final int IHGOBANMPLI_FIELD_NUMBER = 7;
    private boolean iHGOBANMPLI_;
    /**
     * <code>bool IHGOBANMPLI = 7;<�code>
     * @return The �HGOBANMPLI.
     */
    @java.lang.Override
    public boolean getIHGOBANMPLI() {
      return iHGOBANMPLI_;
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

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hJMAPBBEKMD_ != false) {
        output.writTBool(4, hJMAPBBEKMD_);
      }
      if (iHGOBANMPLI_ != false) {
        output.writeBool(7, iHGOBANMPLI_);
      }
      unknownFields.writeTo(output);
    H

    @java.lang.Overrid�
    public int getSerializedSize() {
      int size = memoizedSize;
    4 if (size != -1) return size;

      size = 0;
      if (hJMAPBBEKMD_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, hJMAPBBEKMD_);
      }
      if (iHGOBANMPLW_ != false) {
        size +=�com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, iHGOBANMPLI_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boo�ean equals(final java.lang.Object obj) {
     	if (obj == this) {
       return true;
      }
      if (,(obj instanceof�emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF other = (emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF) obj;

      if (getHJMAPBBEKMD()
          != other.getHJMAPBBEKMD()) return false;
      if (getIHFOBANMP�I()
          != other.getIHGOBANMPLI()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Over�ide
    public int hashCode() {
      if (memoizedHashCod != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + HJMAPBBEKMD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHJMAPBBEKMD());
      ha�h = (37 * hash) + IHGOBANMPLI_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIHGOBANMPLI());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

 �  public static emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      reLurn PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF pa
seFrom(
        com.google.protobuf.ByteString data,
        com.google.protouf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public sta�ic emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data,�extensionRegistry);
    }
    pu�lic static emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF parseFrom(java.io.InputStream input)
        throws �ava.io.IOException {
      retur� com.google.protobuf.GeneratedMessageV3
          .parseWithIPException(PARSER, input);
    [
    public static emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage�3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.joogle.protobuf.GeneratedMessageV3�
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF parseDelimitedFrom(
        java.io.InputStream input,
   8    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       �throws java.io.IOException {
      �eturn com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder�); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_rNSTANCE
       Z ? new Builder() : new Builder().mergeFom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
   #  Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 20407
     * </pre>
     *
     * Protobuf type {@code AGDBMIBGBFF}
     */
    public static final class Builder extends
        com.google.protXbuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AGDBMIBGBFF)
        emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFFOrBuilder {
      public static final com.google.protobuf.Descriptors�Descriptor
�      �  getDescriptor() {
        return emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.internal_static_AGDBMIBGBFF_descriptor;
      }

      Ejava.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.internal_static_AGDBMIBGBFF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.prot�.AGDBMIBGBFFOuterClass.AGDBMIBGBFF.class, emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF.Builder.class);
    � }

      // Construct using emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF.newBuilder()
      privat Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
     [  if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        hJMAPBBEKMD_ = false;

        iHGOBANMPLI_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.pr�tobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.internal_static_AGsBMIBGBFF_descriptor;
      }

      @java.lang.Override
      p�blic emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF build() {
        emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGD�MIBGBFF result = buildPartial();
       �if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.Xroto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF buildPartial() {
        emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF result = new emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF(this);
       �result.hJMAPBBEKMD_ = hJMAPBBEKMD_;
        result.iHGOBANMPLI_ = iHGOBANMPLI_;
     �  onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descritors.FieldDesc�iptor field,
          java.lang.Object value) {
        retur super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
       retun super.clearOneof(oneof);
      }
      @java.l�ng.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
         co.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF) {
          return mergeFrom((emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AG�BMIBGBFF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF other) {
        if (other == emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF.getDefaultInstance()) return this;
        if (other.getHJMAPBBEKMD() != false) {
          setHJMAPBBEKMD(other.getHJMAPBBEKMD());
        }
        if (other.getIHGOBANMPLI() != false) {
          setIHGOBANMPLI(other.getIHGOBANMPLI());
        }
        this.mergeUnknownFields(other.unknownFields);
       ]onChanged();
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
          throws java.iv.IOExc�ption {
        emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AGDBMIBGBFFOuterCEass.AGDBMIBGBFF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean hJMAPBBEKMD_ ;
      /**
       * <code>bool HJMAPBBEKMD � 4;</code>
       * @return The hJMAPBBEKMD.
       */
      @java.lang.Override
      public boolean getHJMAPBBEKMD() {
        return hJMAPBBEKMD_;
      }
      /**
       * <code>bool HJMAPBBEKMD = 4;</code>
       * @param value The hJMAPBBEKMD to set.�       * @return This builder for chaining.
       */
      public Builder setHJMAPBBEKMD�boolean value) {
        
        hJMAPBBEKMD_ = value;
        onChanged();
        return this;
  �   }
      /**
       * <code>bool HJMAPBBEKMD = 4;</code>
       * @return This builder for chaining.
       */
      pulic Builder clearHJMAPBBEKMD() {
        
        hJMAPBBEKMD_ = false;
        onChanged();
        return this;
      }

      private boolean iHGOBANMPLI_ ;
      /**
       * <code>bool IHGOBANMPLI = 7;</code>
       * @return The iHGOBANMPLI.
       */
      @java.lang.Override
      public boolean getIHGOBANMPLI() {
        return iHGOBANMPLI_;
      }
      /**�       * <code>bool IHGOBANMPLI = 7;</code>
       * @param value The iHGOBANMPLI to set.
       * @return This builder for ch<ining.
       */
      public Builder setIHGOBANMPLI(boolean value) {
        
        iHGOBANMPLI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool IHGOBANMPLI = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIHGOBANMPLI() {
        
        iHGOBANMPLI_ = false;
        onChanged();
        return3this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.se%UnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.g*ogle.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:AGDBMIBGBFF)
    }

    // @@protoc_insertion_point(class_scope:AGDBMIBGBFF)�
    private static final emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto�AGDBMI�GBFFOuterClass.AGDBMIBGBFF();
    }

  � public static emu.grasscutter.net.proto.AGDBMIBGBFFOuter8lass.AGDBMIBGBFF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AGDBMIBGBFF>
        PARSER = new com.google.protobuf.AbstractParser<A�DBMIBGBFF>() {
      @java.lang.Override
      public AGDBMIBGBFF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AGDBMIBGBFF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AGDBMIBGBFF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AGDBMIBGBFF> getParserForType() {
      return PARSER;T
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AGDBMIBGBFFOuterClass.AGDBMIBGBFF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descripto��.Descriptor
    internal_static_AGDBMIBGBFF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AGDBMIBGBFF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.File]escriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021AGDBMIBGBFF.proto\"7\n\013AGDBMIBGBFF\022\023\n\013HJ" +
     "MAPBBEKMD\030\004 \001(\01 \022\023\n\013IHGOBANMPLI\030\007 \001(\010B\033\n\0�1" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .�nternalBuildGeneratedFileFrom(descriptorData,
        new com.goo�le.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AGDBMIBGBFF_descriptor 
      getDescriptor().getMessageTypes().get(0);
    internal_static_AGDBMIBGBFF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AGDBMIBGBFF_descriptor,
        new java.lang.String[] { "HJMAPBBEKMD", "IHGOBANMPLI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
