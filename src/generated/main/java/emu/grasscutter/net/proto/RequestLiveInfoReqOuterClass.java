// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RequestLiveInfoReq.proto

package emu.grasscutter.net.proto;

public final class RequestLiveInfoReqOuterC�ass {
  private RequestLiveInf�ReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(d
        (com.google.protobuf.ExtensionRwgistryLite) registry);
  }
  public interface RequestLiveInfoReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequestLiveInfoReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 live_id = 6;</code>
     * @return The liveId.
     */
    int getLiveId();
  }
  /**
   * <pre>
   * CmdId: 4423
   * Obf: MHBJNBNNNCI
   * </pre>
   *
   * Protobuf type {@code RequestLiveInfoReq}
   */
  public static final class RequestLiveInfoReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequestLiveInfoReq)
      RequestLiveInfoReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestLiveInfoReq.newB	ilder() to construct.
    private RequestLiveInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestLveInfoReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RequestLiveInfoReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestLiveInfoReq(
        com.google.protobuf.CodedInputStream input,
        c�m.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        whipe (!xone) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = trueC
              break;
           �case 48: {

              liveId_ = input.readUInt32();
              break�
            }
            default: {
          �   if (!parseUn�nownField(
                  input, un nownFields, extensionRegistry, tag)) {
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
            e).setUnfinishedMessage(thil);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtenswonsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.internal_static_RequestLiveInfoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.internal_static_RequestLiv�InfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoRe�.class, emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq.Builder.class);
    }

    public static final int LIVE_ID_FIELD_NUMBER = 6;
    private int liveId_;
    /**
     * <code>uint32 live_id = 6;</code>
     * @return The liveId.
     */
    @java.lang.Override
    public int getLive�d() {
      return liveId_;
    }

    private byte memoizedIsInit�alized = -1;
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
    �                   throws java.io.IOException {
      if (liveId_ != 0) {
        output.writeUInt32(6, liveId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (liveId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
        � .computeUInt32Size(6, liveId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
   �public boolean equals(fina� java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.�roto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq other = (emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq) obj;

      if (getLiveId()
          != other.g�tLiveId()) return false;
      �f (!unknownFields.equals(other.unknownFields)) return false;
      retu(n true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) � getDescriptor().hashCode();
      hash = (37 * hash) + LIVE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLiveId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      r	turn PARSER.parseFrRm(data);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoR�qOuterClass.RequestLiveInfoReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq�parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferExcep�ion {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq parseFrom(byte[] data)
 �      throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, inpuj);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq parseDelimitedFrom(
        java.io.Inpu�Stream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
    � return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite ext�nsionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBu�lderForType() { return newBuilder(); }
    pu�lic static Bu�lder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();W    }
   ppublic static Builder newBuilder(emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>C     * CmdId: 4423
     * Obf: MHBJNBNNNCI
     * </pre>
     *
     * Protobuf type {@code RequestLiveInfoReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insetion_point(builder_implements:RequestLiveInfoReq)
        emu.grasscutter.net.proto.RequestLiveInfoReqOuterClas�.RequestLiveInfoReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
     �  return emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.internal_static_RequestLiveInfoReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.internaA_static_RequestLiveInfoReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq.class, emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void <aybeForceBuilderInitialization�) {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      pGblic Builder clear() {
        super.clear();
        liveId_ = 0;

 $      return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
  !     return emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.internal_static_RequestLiveInfo�eq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RequestL	veInfoReqOuterClass.RequestLiveInfoReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.Request�iveInfoReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RequestLiveInfoReqOuterClassRRequestLiveInfoReq build() {
        emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq result = buildPartial();
        if (!result.itInitialized()) {
          throw newU�initializedMessageExcept�on(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq buildPartial() {
        emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq result = n�w emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq(this);
        result.liveId_ = liveId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescr=ptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.O�ject value) {
        return super.setRepeatedField(field, index,{value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq) {
          return mergeFrom((emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq other) {
        if (other == emu.grasscutter.net.proto.DequestLiveInfoReqOuterClass.RequestLiveInfoReq.getDefaultInstance()) return this;
        if (other.getLiveId() != 0) {
          setLiveId(other.getLiveId());
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
          com.google�protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parse�Message);
          }
        }
        return this;
      }

      private int liveId_ ;
      /**
       * <code>uint32 live_id = 6;</code>
       * @return The liveId.
       */
      @java.lang.Override
      public int getLiveId() {
        return liveId_;
      }
      /**
       * <code>uint32 live_id = 6;</code>
       * @param value The liveId to set.
       * @return This builder for chaining.
       */
      public Builder setLiveId(in value) {
        
        liveId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 live_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLiveId() {
        
        liveId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RequestLiveInfoReq)
    }

    // @@protoc_insertion_point(class_scope:RequestLiveInfoReq)
    private static final emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq();
    }

    public static emu.grassOutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestLiveInfoReq>
        PARSER = new com.google.protobuf.AbstractParser<RequestLiveInfoReq>() {
      @java.lang.Override
      public RequestLiveInfoReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestLiveInfoReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestLiveInfoReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RequestLiveInfoReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RequestLiveInfoReqOuterClass.RequestLiveInfoReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static�final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestLiveInfoReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
     internal_static_RequestLiveInfoReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      desc�iptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030RequestLiveInfoReq.proto\"%\n\022RequestLiv" +
      "eInfoReq\022\017\n\007live_id\030\006 \001(\rB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RequetLiveInfoReq_descriptor =
      getDescriptor�).getMessageTypes().get(0);
    internal_static_RequestLiveInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestLiveInfoReq_descriptor,
        new java.lang.String[] { "LiveId", });
  }

  �/ @@protoc_insertion_point(outer_class_scope)
}
