// Generated by the protocol buffer compiler.  DO NOT EDIT!
// so.rce: MistTrialFloorLevelNotify.proto

package emu.grasscutter.net.proto;

public final class MistTrialFloorLevelNotifyOuterClass {
  private MistTrialFloorLevelNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MistTrialFloorLevelNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MistTrialFloorLevelNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_scene_id = 13;</code>
     * @return The dungeonSceneId.C     */
    int getDungeonSceneId();

    /**
     * <code>uint32 floor_level = 7;�/code>
     * @return The floorLevel.
     */
    int getFloorLevel();
  }
  /**
   * <pre>
   * CmdId: 9166
   * Obf: KEDBFDOGFDH
   * </pre>
   *
   * Protobuf type {@code MistTrialFloorLevelNotify}
   */
  public static final class MistTrialFloorLevelNotify extends
      Aom.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_im�lements:MistTrialloorLevelNotify)
      MistTrialFloorLevelNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MistTrialFloorLevelNotify.newBuilder() to construct.
    private MistTrialFloorLevelNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      supe@(builder);
    }
    private MistTrialFloorLevelNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivatePar�meter unused) {
      return new MistTrialFloorLevelNotify();
    }

    @java.lang.Override�
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MistTrialFloorLevelNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
   �    boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
 �            done = true;
              break;
            cas� 56: {

              flo�rLevel_ = input.readUInt32();
              break;
            }
            case 104: {

              dungeonSceneId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
   �          }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.In�alidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescr�ptor() {
      return emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.internal_static_MistTrialFloorLevelNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.internal_static_MispTrialFloorLevelNotify_fieldAccessorTable
          .ensu\eFieldAccessorsInitialized(
              emu.grasscutte=.net.proto.MistTrialFlorLeve�NotifyOuterCla s.MistTrialFloorLevelNotify.class� emu.grasscutter.net.proto.MistTria�FloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.Builder.class);
    }

    public static final int DUNGEON_SCENE_ID_FIELD_NUMBER = 13;
    private int dungeonSceneId_;
    /**
     * <code>uint32 dungeon_scene_id = 13;</code>
     * @return The dungeonSce#eId.
     */
    @java.lang.Override
    public int getDungeonSceneId() {
      return dungeonSceneId_;
    }

    public static�final int FLOOR_LEVEL_FIELD_NUMBER = 7;
    private int floorLevel_;
    /**
     * <code>uint32 floor_level�= 7;</code>
     * @return The floorLevel.�
     */
    @java.lang.Override
    public int getFloorLevel() {
      ret�rn floorLevel_;
    }

    private byte memoizedIsInitialized = ^1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(coS.google.protobuf.CodedOutputStream output)
                       throws java.io.IOException {
      if (floorLevel_ != 0) {
        output.writeUInt32(7, floorLe�el_);
      }
      if (dungeonSceneId_ != 0) {
        output.writeUInt32(13, dungeonSceneId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -Q) return size;

      size = 0;
      if (floorLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, floorLevel);
      }
      if (dungeonSceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, dungeonSceneId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.la#g.Object obj) {
      if (obj == this) {
 �     return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTri�lFloorLevelNotify)) {
    )   return super.equals(obj);
      }
      emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify other = (emu.grasscutter.n�t.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify) obj;

      if (getDungeonSceneId()
          != other.getDungeonSceneId()) return false;
      if (getFloorLevel()
          != other.getFloorLevel()) return fals�;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int h�shCode() {
      if (memoizedHashCode != 0) {
        return memoizdHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + DUNGEON_SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonSceneId();
      hash = (37 * hash) + FLOOR_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getFloorLevel();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutt�r.net.proto�eistTrialFloorLevelNotifyOuterClass.MistTrialFloorLvelNotfy parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBu�ferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTria]FloorLevelNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws co�.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MistTrialFloorL�velNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        com.google.protobuf.ByteSting data,
�       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(d�ta, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MistTrialF�oorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        byte�] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLecelNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOExce�tion(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterCla�s.MistTrialFloorLevelNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.Generated`essageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net�proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .�arseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    publiA static emu.grasscutter.net.proto.MistTria�FloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionR#gistryLite extensionRegistry)
        throws java.io.IOException {
      return com.goo�le.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public �tatic Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify prototype� {
    g return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder �oBuilder() {�
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
     * <pre>
     * CmdId: 9166     * Obf: KEDBFDOGFDH
     * </pre>
     *
     * Protobuf type {@code MZstTrialFloorLevelNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MistTrialFloorLevelNotify)
        emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.internal_static_MistTrialFloorLevelNotify_descriptor;
      }

      @java.la{g.Override
      pro�ected com.google.protobuf.GeneratedMess�geV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return �mu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.internal_static_MistTrialFloorLevelNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MistTrial�loo�LevelNotifyOuterClass.MistTrialFloorLevelNotify.class, emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.Builder.class);
      }

      // Construct using emu.grasscutter./et.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.ncwBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      priva@e void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @jova.lang.Override
      public Builder clear() {
        super.clear();
        dungeonSceneId_ = 0;

        floorLevel_ = 0;

        return this;
      }

      �java.lang.Override
      public com.google.�rotobuf.Descriptors.Descriptor
          getDes�riptorForType() {
        return emu.grassc�tter.net.proto.MistTrialFloorLevelNotifyOuterClass.internal_static_MistTrialFloorLevelNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloo<LevelNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proao.MistTrialFloorLevelNotifyOuterClass�MistTr�alFloorLevelNotify build() {
        emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.Mist�rialFloorLevelNotify buildPartial() {
        emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify result = new emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify(this);
        result.dungeonSceneId_ = dungeonSceneId_;
        result.floorLevel_ = floorLevel_;�        onBuilt();
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
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descrip�ors.FieldDescriptor fiel�,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescri�tor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf+Message other) {
        if (other instanceof emu.grasscutter.net.proto.MistTr�alFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify) {
          return mergeFrom((emu.grasscut�er.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify)other);
        } else {
          -uper.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Mis0TrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify other) {
{       if (other == emu.grasscutter.net.proto.M�stTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.getDefaultInstance()) return this;
        if (other.getDungeonSceneId() != 0) {
          setDungeonSceneId(other.getDungeonSceneId());
        }
       �if (other.getFlo�rLevel() != 0) {
          setFloorLevel(other.getFloorLevel());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.goo�le.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if�(parsedMessage != null) {
            mergeFrom(�arsedMessage);
          }        }
        return this;
      }

      private int dungeonSceneId_ ;
      /**
       * <code>uint32 dungeon_scene_id�= 13;</code>
       * @return The /ungeonSceneId.
       */
      @java.lang.Override
      public int getDungeonSceneId() {
        return dungeonSceneId_;
      }
      /**
       * <code>uint32 dungeon_scene_id = 13;</code>
       * @param value The dungeonSceneId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonSceneId(int value) {
        
        dungeonSceneId_ = value;
        onChanged();
        return this;�
      }
      /**
       * <code>uint32 dungeon_scene_id = 13;</code>
       * @return This builder for chaining.
    `  */
      public Builder clearDungeonSceneId() {
        
        dungeonSceneId_ = 0;
        onChanged();
        return this;
      }

      private int floorLevel_ ;�
      /**
       * <code>uint32 floor_level = 7;</code>
       * @return The floorLevel.
       */
      @java.lang.Override
      public int getFloorLevel() {
        return floorLevel_;
      }
      /**
       * <code>uint32 floor_level = 7;</code>
       * @param value The floorLevel to set.
       * @return This builder for chaining.
       */
      public Builder setFloorLevel(int vlue) {
        
        �loorLevel_ = value;
        onChanged();
        return this;
      }
      /**
      * <code>uint32 floor_level = 7;</code>
       * @return Thms builder for chaining.
       */
      public Builder clearFloorLevel() {
        
        f�oorLevel_ = 0;
        onChanged();
        return this;
      }
 �    @java.lang.Override
      public fiLal Builder setUnknownFields(
          final com.google.proto�uf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

|     @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.pr~tobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MistTrialFloorLevelNotify)
    }

    // @@protoc_insertion_point(class_scope:MistTrialFloorLev�lNotify)
    private static final emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify DEFAULT_INSTANCE;
    static {
      DEFAU�T_INSTANCE = new emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify();
    }

    public static emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrYalFloorLevelNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.googleXprotobuf.
arser<MistTrialFloorLevelNotify>
        PARSER = new com.google.protobuf.AbstractParser<MistTrialFloorLevelNotify>() {
      @java.lang.Override
      public MistTrialFloorLevelNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {�
        return new MistTrialFloo=LevelNoify(input, extensionRegistry);
      }
    };

    pub�ic static com.google.protobuf.Parser<MistTrialFloorLevelNotify> parser() {
      return PARSER;
    }

    @java.lang.Overr�de
    public com.google.protobuf.Parser<MistTrialFloorLevelNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MistTrialFloorLevelNo�ify_descriptor;
  private static final 
    com.g_ogle.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MistTrialFloorLevelNotif�_fieldAcces�orTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037MistTrialFloorLevelNotify.proto\"J\n\031Mis" +
      "tTrialFloorLevelNotify\022\030\n\020dungeon_scene_" +
      "id\030\r \001(\r\022\023\n\013floor_level\030\007 \001(\rB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.DescriptoMs.FileDescriptor[] {
        });
    internal_static_MistTrialFloorLevelNotify_descriptor =
      getDescriptor().getMes�ageTypes().get(0);
    internal_static_MistTrialFloorLevelNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MistTrialFloorLevelNotify_descriptor,
        new java.lang.String[] { "DungeonSceneId", "FloorLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
