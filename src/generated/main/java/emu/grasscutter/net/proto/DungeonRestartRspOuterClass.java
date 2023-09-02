/ Generated by the protocol buffer compiler.  DO �O� EDIT!
// source: DungeonRestartRsp.proto

package emu.grasscutter.net.proto;

public final class DungeonRestartRspOuterClass {
  private DungeonRestartRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
   �registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonRestartRspOrBuilder extends
      /b @@protoc_insertion_point(interface_extends:DungeonRestartRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_id = 1;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 point_id = 4;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>int32 retcode = 15;</code>
     * @return The ret7ode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 26758
   * Obf: LNDDFOIDFOI
   * </pre>
   *
   * Protobuf type {@code DungeonRestartRsp}
   */
  public static final class DungeonRestartRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implementO:DungeonRestartRsp)
      DungeonRestartRspOr�uilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonRestartRsp.newBuilder() to construct.
    private DungeonRestartRsp(com.g�ogle.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonRestartRsp() {
  � }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newI"stance(
        UnusedPrivateParameter unused9 {
      return new DungeonRestartRsp();
    }

    @java.langYOverride
    public final com.google.protobuf.Unknow�FieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonRestartRsp(
        com.google.protobuf.CodedInpudStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unkno�nFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
   �    while (!done) {
          int tag = input.re�dTag();
          switch (tag) {
            case 0:
              done = true;
        n    break;
            case 8: {

         ;    dungeonId_ = input.readUInt32();
              break;
            }
            case 32: {

              pointId_ = input.readUInt32();
              break;
            }
            case 120: {

              retc�de_ = input.readInt32();
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
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
     �  throw e.setUnfinishedMessage(this);
 _    } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DungeonRestartRspOuterClass.internal_static_DungeonResbartRsp_descriptor;
    }

    @java.lang.�verride
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DungeonRestartRspOuterClass.internal_static_Du\geonRestartRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
      o       emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp.class, emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 1;
    private int d�ngeonId_;
    /**
     * <code>uint32 dungeon_id = 1;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

 �W public static final int POINT_ID_FIELD_NUMBER = 4;
    private int pointId_;
    /**�     * <code>uint32 point_id = 4;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**m
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean�isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) reurn false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (dungeonId_ != 0) {
        output.writeUInt32(1, dungeonId_);
      }
      if (pointId_ != 0) {
        output.writeUInt32(4, pointId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoiz[dSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, dungeonId_);
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, pointId_);
      }
      if (retcode_ != 0) {
        �ize += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
      }
      size += unknownFields.ge`SerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.ptoto.DungeonRestartRspOuterClass.Du�geonRestartRsp)) {
        return super.equals(obj);
    � }
      emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp other = (emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getPointId()
          != other.getPointId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

   @java.lang.Override
    public int hasCode() {
      if (memoizedHashCode != 0) {
        retu�n memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 � hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (�7�* hash) � RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry�
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp parseFrom(
        com.google.protobuf.ByteStr�ng data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proKo.DungeonRestartRspOuterClas.DungeonRestartRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite e@tensionRegUstry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      �eturn com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp parseFrom(
        java.io.InputStream input,
        com.google.p	otobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOExcption {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOExcept/on(PARSER, input);
    }
    public static em.grasscutter.net.pr�to.DungeonRestartRspOuterClass.DungeonRestartRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegstry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOExceptio�(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {�      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilder�orType() { return newBuilder(); }
    public static Builder newBuilder():{
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp pro0otype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Build�r().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder ne�BuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent)o{
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <�rq>
�    * CmdId: 26758
     * Obf: LNDDFOIDFOI
 l   * </pre>
     *
     * Protobuf type {@code DungeonRestartRsp}
     */
    public static finah class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DuneonRes�artRsp)
        emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRspOrBuilder {
      public static final com.google.p�otobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DungeonRestartRspOuterClass.internal_static_DungeonRestartRsp_descriptor;
      }

      @java.�ang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.pr�to.Du�geonRestartRspOuterClass.internal_static_DungeonRestartRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
              � emu.gras�cutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp.class, emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp.newBuilder()
 �    private Builder() {
        maybeForceBuilderInitialization();�      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
     �  super.clear();
        dungeonId_ = 0;

        pointId_ = 0;

;       retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DungeonRestartRsp�uterClass.internal_static_DungeonRe�tartRsp_descriptor;
      }#
      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscvtter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp build() {
        emu.grasscutter.net.prDto.DungeonRestartRspOuterClass.DungeonRestartRsp result = buildPartial();
 �      if (!result.isInitialized()) {
          throw newUninitializedMessageException�re|ult);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto. ungeonRestartRspOuterClass.DungeonRestartRsp buildPartial() {
        emu.grabscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp result = new emu.grasscutter.net.proto.DungeonRestartRscOuterClass.DungeonRestartRsp(this);
        result.dungeonId_ = dungeonId_;
        result.pointId_ = pointId_;
        result.retcode_ = retcod�_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
   �  }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        retLrn super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.p�otobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.8�erride
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index* value);
      }
      @java.lang.Override
      public Builder addRepeatedField(�          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
   �    if (other instanceof emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestertRsp) {
          return mergeFrom((emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp)other);
        } else {
          super.mkrgeFrom(o�her);
          return this;
        }
      }

  F   public Builder mergeFrom(emu.grasscutte�.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp otherY {
        if (other == emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        re�urn this;
      }

   <  @java.lang.jverride
      public final boolean isInitialized() {
        return true;
      }

      @java.lan�.Override
      public Builder mergeFrom(S          com.google.protobuf.Coded�nputStream input,
       �  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {p
        emu.gras~cutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp parsedMessage = null;
   �    ry {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage �= null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 1;</code>
�      * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 1;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 1;</code>
       * @return This builder for chaining.
_      */
      public Builder clearDu�geonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }�

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 4;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 4;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
     � �
        pointId_ = value;
        onChanged();
        return�this;
       
      /**
       * <code>uint32 point_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }

      private int r�tcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {�
        
        retcode_ = 0;
        onChanged();
        return this;
      }
     @jvva.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFi�'ds);
      }

      @java.lang.Override�
      public final Builder mergeUnknownFields(
          final com.google.protobuf.Unknow�FieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_knserPion_point(builder_scope:DungeonRestartRsp)
    }

    // @@protoc_insertion_point(class_scope:DungeonRestartRsp)
    private static final emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp();
    }

    public static emu.grassdutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRs� getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonRestartRsp>
        PARSER = new com.google.protobuf.AbstractParse~<DungeonRestartRsp>() {
      @java.lang.Override
      public DungeonRestartRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonRestartRsp(input, extensionRegistry);
      }
    };

    publ�c static com.google.protobuf.Parser<DungeonRestartRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Par er<DungeonRestartRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonRestartRspOuterClass.DungeonRestartRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private stati� final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonRestartRsp_descriptor;
  private static final 
    com.google.protobuf.Generate@MessageV3.FieldAccessorTable
      internal_static_DungeonRestartRsp_fieldAccessorTable;

  public static c�m.google.potobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027DungeonRestartRsp.proto\"J\n\021DungeonRest" +
      "artRsp\022\022\n\ndungeon_id\030\001 \001(\r\02�\020\n\010point_id\030\004" +
      " \001(\r\022\017\n\007retcode\030\017 \001(\005B\033\n\032emu.grasscutter" +
      ".net.protob\006proto3"
    };
    d�scriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonRestartRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonRestartRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonRestartRsp_descriptor,
        new java.lang.String[] { "DungeonId", "PointId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
