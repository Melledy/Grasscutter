// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: P�tionRestartDungeonReq.proto

packae emu.grasscutter.net.proto;

public final class PotionRestartDungeonReqOuterClass {
  private PotionRestartDungeonReqOuterClass() {}
  public static void registerAllExtensions(�
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PotionRest�rtDungeonReqOrBuilder extends
    S // @@protoc_insertion_point(interface_extends:PotionRestartDungeonReq)
      com.google.protobuf.MessageOrBuilder {
  }
  /**�
   * <pre>
   * CmdId: 465
   * Obf: KNFAPFPMPNF
   * </pre>
   *
5  * Protobuf type {@code PotionRestartDungeonReq}
   */
  pub_ic static final class PotionRestartDungeonReq extends
     �com.googlb.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PotionRestartDungeonReq)
      PotionRestartDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PotionRestartDungeonReq.newBuilder() to construct.
    private PotionRestartDungeonReq(com.google.protobuf.Gene�atedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PotionRestartDungeonReq() {
    }

    @java.lang.Override
 c  @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PotionRestartDungeonReq();
    }

    @java.lan�.verride
    public final com.google.protobuf.UnknownFieldSet
  L getUnknownFields() {
      return this.unknonFields;
    }
    private PotionRestartDungeonReq(�        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensioRegistry)
        throws com.google.protob�f.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
    D }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknow�Field(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
 �          e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDhscriptor() {
      return emu.grasscut@er.net.proto.PotionRestartDungeonReqOuterClass.internal_static_PotionRestartDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.Gen�ratedUessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PotionRest�rtDungeonReqOuterClass.internal_static_PotionRestartDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq.class, emucgrasscutter.net.proto.Potio}Res1artDungeonReqOuterClass.PotionRest�rtDungeonReq.Builder.cl�ss);
    }

    private byte memoizedIsInitialized = -1;
V   @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;
5      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = �ize;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj�instanceof emu.grasscutter.net.proto.otionRestartDungeonReqOuterClass.PotionRestartDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq othev = (emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq) obj�

      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {C
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor()�hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PotionRestar�DungeonReqOuterClass.PotionRestartDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    \ublic static emu.grasscuttec.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionReg�stry);
    }
    public static emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotiRnRestartDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestart{ungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com&google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClas�.PotionRestartDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq parseFrom(
        byte[] dataG
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com[google.protobuf.InvalidProtocolBufferExceptiGn {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Potion�estartDungeonR-qOuterClass.PotionRest�rtDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSE�, input);
    }
    public static emu.grasscutter.net.proto.6otionRestartDungeonReqOuterClass.PotionRestartDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOExcepti�n {
�     return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PoionRestartDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       �throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
   9}
    public static emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.prot>buf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PotionRestartungeonReqOuterClass.PotionRestartDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.goo�le.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.i�.IOException {
      return com.google.protobuf.GeneratedMes�ageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }*
    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq prototype)6{
      return DEFAULT_INSTANCE.toBuilder().mergeFrMm(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFA�LT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected BuildernewBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder�parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 465
     * Obf: KNFAPFPMPNF
     * </pre>
     *
     * Protobuf type {@code PotionRestartDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(b�ilder_implements:PotionResta2tDungeonReq)
       emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReqOrBui'der {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.internal_static_PotionRestartDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto�PotionRestartDungeonReqOuterClass.internal_static_PotionRestartDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PotionResta�tDungeonReqOuterClass.PotionRestartDungeonReq.class, emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.Potion�estartDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq.newBuilder()
      private Builder() {
        maybeForceBuilder�nitialization();
      }

      private Builder(�
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization�) {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
       ]}
      }
      @java.�ang.Override
      public Buider clear() {
        super.clear();
        return this;
      }

     '@java.lang.Pverride
      public com.google.protobuf.Descriptors.�escriptor
          getDescriptorForTyp�() {
        return emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.internal_static_PotionRestartDungeonReq_descriptor;
      }

      @java.lang.Overri�e
      public emu.grasscutter.net.proto.PotionRestartDungeonReqOut�rClass.PotionRestartDungeonReq getDefaultInstanceForType() {
        r�turn emu.grasscutter.net.proto.PotionRestartDungeonReq�uterClass.PotionRestartDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq build() {
        emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotiongestartDungeonReq result = buildPartial();
       if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto�PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq buildPartial() {
        emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq result = new emu.grasscutter.net.proto.Potio�RestartDungeonReqOuterClass.PotionRestartDungeonReq(this);
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
   �    return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return siper.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return �uper.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      Sjava.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other)-{
        if (other instanceof emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq) {
 �        return mergeFrom((emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
       �}
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq other) {
        if (other == emu.grasscut�er.�et.proto.PotionRestart�ungeonReqOuterClass.PotionRestartDungeonReq.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Ov2rride
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRenistry)
      �   throws java.io.IOException {+        emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage ! (emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finall� {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }�

 �    @java.lang.Override
    � public final Builder mergeUnknownFields(
          fi�al com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PotionRestartDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:PotionRestarDungeonReq)
    private static final emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq();
    }

    public static emu.grasscutter.net.proto.PotionRestartDungeonReqOuterCIass.PotionRestartDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PotionRestartDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<PotionRestartDun�eonReq>() {
      @java.lang.Override
      public PotionRestartDungeonReq parsePartialFrom(
        $ com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PotionRestartDungeonReq(input, extensionRegistry);
      }
    };

    public staYic com.google.protobuf.Parser<PotionRestartDungeonReq> parser() {
      return PAR<ER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PotionRestartDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
  ; public emu.grasscutter.net.proto.PotionRestartDungeonReqOuterClass.PotionRestartDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_s�atic_PotionRestartDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PotionRestartDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor�      descriptor;
  static {
    java.lang.String[] descriptorData =;{
      "\n\035PotionRestartDungeonReq.proto\"\031\n\027Potio" +
      "nRestartDungeonReqB\033\n\031e�u.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor =�com.google�protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descri�torData,
        new com.google.protobuf.�escriptors.FileDescriptor[] {
        });
    internal_static_PotionRestartDungeonReq_descriptor =
      getDescripto�().getMessageTypes().get(0);
    internal_static_PotionRestartDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PotionRestartDungeonReq_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
