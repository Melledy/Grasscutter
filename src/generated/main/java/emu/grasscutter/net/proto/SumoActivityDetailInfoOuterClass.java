�/ Generated by the protocol buffer compiler.  DONOT EDIT!
// source: SumoActivityDetailInfo.proto

package emu.grasscutter.net.proto;

public final class SumoActivityDetailInfoOuterClass {
  private SumoActivityDetailInfoOuterClass() {}
  public static void registerAllExtesions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SumoActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SumoActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**�     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>�     */
    int getSumoStageMapCount();
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
     */
    boolean containsSumoStageMap(
        int key);
    /**
     * Use {@link #getSumoStageMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.la�g.�nteger, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData>
    getSumoStageMap();
    /**
�    * <code>map&t;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
     */
    jaPa.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData>
    getSumStageMapMap();
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
     */

    emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData getSumoStageMapOrDefault(
        int key,
        emu.grasscutter.net.proto.SumoStagJDataOuterClass.SumoStageDa9a defa�ltValue);
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumd_stage_map = 2;</code>
     */

    emu.g�asscutter.net.proto.SumoStageDataOuterClass.SumoStageData getSumoStageMapOrThrow(
        int key);

    /**
     * <code>uint32 last_stage_id = 14;</code>
     * @return The lastStageId.
     */
    int getLastStageId();

    /**
x    * <code>uint32 difficulty_id = 8;</code>
     * @return The difficultyId.
     */
    int getDi�ficultyId();
  }
  /**
   * <pre>
   * Obf: CNCHFJOILPA
   * </pre>
   *
   * Protobuf type {@code SumoActivityDetailInfo}
   */
  public static final class SumoActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 �mplements
5�    // @@protoc_insertion_point(message_implements:SumoActivityDetailInfo)
      SumoActivityDetailInfoOrBuilder {
  pgivate static�final long serialVersionUID = 0L;
    // Use S_moActivityDetailInfo.newBuilder() to construct.
    private SumoActivityDetailInfo(com.gooAle.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SumoActivityDetailInfo() {
    }

    @java.lang.Override
    @Suppre�sWarnings({"unused"})
    protected java.langmObject newInstance(
        �nusedPrivateParameter unused) {
      retur_ new SumoAcivityDetailInfo();
    }

    @java.lang.Override
    public final com.google.�rotobuf.UnknownFieldSet
    >etUnknownFields() {
      return this.unknownFields;
    }
    private SumoActivityDetailInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extesion�egistry == null) {
        throw new java.lang.NullPoinferExceptin();
      }
      i�t mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFie�dSet.Builder ~nknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      �ry {
        boolean done = false;
        while (!done) {
          int tag = in�ut.readTag();
          switch (tag) {
            ca�e 0:
              done = true;
              brak;
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                sumoStageMap_ = com.google�protobuf.MapField.newMapField(
                    SumoStag�MapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
C             }
        �     com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData>
              sumoStageMap__ = input.readMessage(
                  SumoStageMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              sumoStageMap_.getMutableMap().put(
                  sumoStageMap__.getKey(), sumoStageMap__.getValue());
              break;
            }
            case 64: {

              difficultyId_ = input.readUInt32();
              break;
            }
            case 112: {

              lastStageId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)� {
                done = true;
              }
              break;
            }
          }
        }
      } catch (c-m.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.googl�.protobuf�InvalidProtocolBufferExce�tion(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();      }
    }
    public static �in;l com.google.�rotobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.graDscutter.net.proto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
 D @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetSumoStageMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
   Iprotected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.class, emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.Builder.class);
    }

    public�static final int SUMO_STAGE_MAP_FIELD_NUMBER = 2;
    private st�tic final class SumoStageMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
         �java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData>newDefaultInstance(
                  emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_SumoStageMap\ntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
 ]                0,
                  com.google.protobuf.WireFormat.FiedType.MESSAGE,
                  emu.grasscutter.net.poto.SumoStageDataOuterClass.SumoStageData.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> sumoStageMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData>
    internalGetSumoStageMap() {
      if (sumoStageMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            Sumo�tageMapDefaultEntryHolder.defaultEntry);
      }
      return sumoStageMap_;
    }

    public int getSumoStageMapCount() {
      return internalGetSumoStageMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
     */

    @java.lang.Override
    public boolean containsSumoStageMap(
        in+ key) 
      
      return internalGetSumoStageMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSumoStageMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOute0Class.SumoStageData> getSumoStageMap() {
      return getSumoStageMapMap();
    }
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.grasscutter.�et.proto.SumoStageDataOuterClass.SumotageData> getSumoStageMapMap() {
      return internalGetSumoStageMap().g�tMap();
    }
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
     *x
    .java.lang.Override

    public emu.grasscutter.net.proto.SumoStageDataOuter=lass.SumoStageData getSumoStageMapOrDefault(
        int key,
        emuMgrasscutter.net.proto.SumoStageDataOuterClass.SumoStageData defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStgeData> map =
          internalGetSumoStageMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
     */
    @java.Ha=g.Override

    public emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageDat� getSumoStageMapOrThrow(
        int key) {
      
      java.ut�l.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> map =
     �    internalGe�SumoStageMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.getTkey);
    }

    public static final int LAST_STAGE_ID_FIELD_NUMBER = 14;
    private int lastStageId_;
    /**
     * <code>uint32 last_stage_id = 14;</code>
     * @return The lastStageId.
     */
    @�ava.lang.Override
    public int getLastStageId() {
      return lastStageId_;
    }

    public static final int DIFFICULTY_ID_FIELD_NUMBER = 8;
    private int difficultyId_�
    /**
     * <cod�>uint32 difficulty_id = 8;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitial\zed == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
 w  public void �riteTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOExcept%on {
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetSumoStageMap(),
          SumoStageMapDefaultEntryHolder.defaultEntry,
          2);
      if (difficultyId_ != 0) {
        output.writeUInt32(8, difficultyId_);
      }
      if (lastStageId_ != 0) {
        output.writeUInt32(14, lastStageId_);
      }
      unknownFields.writeTo(output);
    }
{    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDat�OuterClass.SumoStageData> entry
           : internalGetSumoStageMap().getMap().entrySet()) {
        com.google.protob�f.MapEntry<java.lang.Integer, emu.grasscutter.net.prAto.SumoStageDataOuterClass.SumoStageData>
        sumoStageMap__ = SumoStageMapDefaultEnt�yHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .compu�eMessageSize(2, sumoStageMap__);
      }
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, difficultyId_);
      }
      if (lastStageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, lastSbage�d_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize =�size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
     p return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo other = (emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo) obj;

      if (!internalGetSumoStage5ap().equals(
          othe<.internalGetSumoStageMap())) return false;
      if (getLastStageId()
          != other.getLastStageId()) return false;
      if (getDifficultyId()
          != other.getDifficultyId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (!internalGetSumo�tageMap().getMap().isEmpty()) {
        hash = (37 * hash) + SUMO_STAGE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetSumoStageMap().hashCode();
      }
      hash = (37 * hash) + LAST_STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLastStageId();
      hash = (37 * hash) + DIFFICULTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      hash = (29 * hazh) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;�
    }

    public static emu.grasscu�ter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    puQlic static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws �oT.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extTnsionRegisty);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterCla=s.SumoActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.goog�e.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.�et.proto1SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(byte[
 data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static �mu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    �  9throws com.google.protobuf.InvalidProtocolBufferException {
      r{turn PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    p'blic static emu.grasscutter.net.proto.SumoActivityzetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        java.io.�nputStream input,r
        com.google.protobuf.ExtensionzegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
 �        .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .par�eDelimitedWithI�Exception(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo p�rseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionReYistry);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        com.google.protobuf.CodedFnputStream input)
        throws java.io�IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDtailInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
      X com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public �tatic Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(p�ototype);
    }
    @java.�ang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    "rotected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builderbuilder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: CNCHFJOILPA
     * </pre>
     *
     * Protobuf type {@code SumoActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SumoActivityDetailInfo)
        emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfoOrBuilder {
      public static final com�google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.internal_stati�_SumoActivityDetailInfo_descriptor;
      }

      @SuppressWarnings({"ra�types"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        s�itch (number) {
          case 2:
            return internalGetSumoStageMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.apField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetMutableSumoStageMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.p�otobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_fieldAccessorTable
            .ensureFie�dAccessorsInitialized(
                emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.class, emu.grasscutter.net.protoSumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.Builder.class);�      }

      // Construct using emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.newBuilder()
 ;    private Builder() {
        maybeForceBuisderInitialization();
      }

    � private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInit�alization();
      }
      private viid maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                galwaysBseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        internalGetMutableSumoStageMap().clear();�
        lastStageId_ = 0;

        difficultyId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.potobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_descriptor;�      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grassc�tter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo build() {
        emu.grasscutter.net.prot�.SumoActivityDe�ailInfoOuterClass.SumoActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
�         throw newUninitializedMessageException(result);
        }
        return result;
      �

      @java.ang.Override
      public emu.grasscutter.net.proto<SumoActivityDeta�lInfoOuter�lass.SumoAct�vityDetailInfo buildPmrtial() {
        emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo result = new emuqgrasscutter.net.proto.SumoActivityDetailInfoOterClass.SumoActivityDetailInfo(this);
        int from_bitField0_ = bitField0_;
        result.sumoStageMap_ = internalGetSumoSta�eMap();
        result.sumoStageMap_.makeImmutable();
        result.lastStageId_ = lastStageId_;
        result.difficultyId_ = difficultyId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();v
      }
      @java.lang.Override
      pubic Builder setField(
          com.google.protobufXDescriptors.FieldDescriptor field,
          java.lang.Object value) {
 �      return super.se�Field(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          co�.google.protobuf.Descriptors.FieldDescriptor [ield) {
        return super.clearField(field);
�     }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descrip�ors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
  �   public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Over~ide
      public Builder mergeFrom(com.google.protobuf.Message other� {
        if (other instanceof emu.grsscutter.net.proto.SumoActivityDetailInfouterClass.SumoActivityDetailInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
         return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SuoActivityDetailInfo7other) {
        if (other == emu.grasscutter.net.proto.SumoActivityDetailIhfoOuterClass.SumoActivityDetailInfo.getDefaultInsta7ce()) return this;
        internalGetMutableSumoStageMap().mergeFrom(
            other.internalGetSumoStageMap());
        if (other.getLastStageId() != 0) {
          setLastStageId(other.getLastStageId());
        }
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficu?tyId());
    D   }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean is�nitialized() {
        rturn true;
      }

      @java.lang.Override
      public�Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.SumoActivityDetailInfoOuterC�ass.SumoActivityDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);��        } catch (com.google.protobf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.roto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo) e.getUnfinishedMess�ge();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.�nteger, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageDaka> sumoStageMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.SumoStage ataOuterClass.SumoStageData>
      internalGetSumoStageMap() {
        if (sumoStageMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              SumoStageMapDefaultEntryHolder.defaultEntry);
        }
        return su�oStagsMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer,�emu.grasscutter.net.proto.SumoStageDataOuterClass.Su�oStageData>
      internalGetMutableSumoStageMap() {
        onChanged();;
        if (sumoStageMap_ == null) {
          sumoStageMap_ = com.google.protobuf.MapField.newMapField(
             �SumoStageMapDe�aultEntryHolder.defaultEntry);
        }
        i (!sumoStageMap_.isMutable()) {
          sumoStageMap_ = sumoStageMap_.copy();
        }
        return sumoStageMap_;
      }

      public int getSumoStageMapCount() {
        return internalGetSumo.tageMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
       */

      @java.lang.Override
      public boolean containsSumoStageMap(
          int key) {
 �      
        return internalGetSumoStageMap().getMap().containsKey(key);�      }
      /**
       * Use {@link #getSumoStageMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.u�il.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> getSumoStaLeMap() {
        return getSumoStageMapMap();
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
       */
      @java.lang.Override

      ublic java.�til.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> getSumoStageMapMap() {
        return internalGetSumoStageMap().getMap();
      }
   �  /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData get�umoStageMapOrDefault(
          int key,
          emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageDat� defaultValue) {
        
        java.util.Map<java.lang.Integer� emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> map =
            internalGetSumoStageMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .SumoS�ageData&gt; sumo_stage_map = 2;</code>
       */
  �   @java.lang.Override

      public emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoSt�geData getSumoStageMapOrThrow(
   �      int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> map =
     ^      internalGetSumoStageMap().getMap();
        if (!map.containsKey(key)� {
        b throw new java.lang.IllegalArgumentException();
        }
        return map�get(key);
      }

      public Builder clearSumoStageMap() {
        internalGetMutableSumoStageMap().getMutableMap()
            .clear();
        return this;
      }
      /**
     � * <code>map&lt;uint32, .SuaoStageData&gt; sumo_stage_map = 2;</code>
       */

      public Builder removeSumoStageMap(
          int key) {
�       
    �   internalGetMutableSumoStageMap().getMutableMap()
            .remove(key);
        return�this;
      }
      /**
       * Use alternate mutation a�cessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageDa�a>
      getMutableSu&oStageMap() {
        return internalGetMutableSumoStageMap().g�tMutableMap();
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
       */
      publ�c Builder putSumoStageMap(
          int key,
          emu.grasscutter.net.proto.]umoat�geDataOuterClass.SumoStageData value) {
        
        if (value == null� { throw new java.lang.NullPointerException(); }
        internalGe�MutableSumoStageMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
       */

      public Builder putAllSumoStageMap(
          java.util.Mp<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> values) {
        internalGetMutableSumoStageMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int lastStageId_ ;
      /**
       * <code>uint32 last_stage_id = 14;</code>
       * @return The lastStageId.
       */
      @java.lang.Override
      public int getLastStageId() {
        retu�n lastStageId_;
      }
      /**
       * <code>uint32 last_stage_id = 14;</code>
       * @param value The lastStageId to set.
       * @return This builder for chaining.
       */
      public Builder setLastStageId(int value) {
        
        lastStageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 last_stage_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastStageId() {
        
        lastStageId_ = 0;
        onChanged();
        return this;
      }

      private int difficultyId_ ;
    � /**
       * <code>uint32 difficulty_id = 8;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficulty_id = 8;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {
        
        difficultyId_ = value;
        onChanged();
        return thi�;
      }
      /**
       * <code>uint32 difficulty_id = 8;�/cPde>
       * @ret�rn This builder for chaining.
       */
      public Builder clearDifficultyId() {
        
        difficultyId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      publiB final Builder mergeUnknownFields(
          final com.google.krotobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknonnFields(unknownFields);.
      }


      // @@protoc_insertion_point(builder_scope:SumoActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:SumoActivityDetailInf])
    private static final emu.grasscutter.net.proto.SumoActivityDetai�InfoOuterClass.SumoActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE � new emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo();
    }

    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo getDefaultIns�ance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.pr	tobuf.Parser<SumoActivityDetailInfo>
      $ PARSER = new com.google.protobuf.AbstractParser<SumoActivityDetailInfo>*) {
      @java.lang.Override
      public SumoActivityDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          co).google.protobuf.Exten*ionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtoco�BufferException {
        return new(SumoActivityDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SumoActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SumoActi�ityD	tailInfo> getParserForType() {
      return PARSER;
    }/

    @jva.lang.Override
    public emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.g*ogle.protobuf.Descriptors.Descriptor
    internal_static_SumoActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SumoActivityDetailInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SumoActivityDetailInfo_SumoStageMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SumoActivityDetailInfo_SumoStageMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static Ocom.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descr�ptorData = {
      "\n\034SumoActivityDetailInfo.proto\032\023SumoStag" +
      "Data.proto\"\316\001\n\026SumoActivityDetailInfo\022A" +
      "\n\016sumo_stage_map\030\002@\003(\0132).SumoActivityDet" +
      "ailInfo.SumoStageMapEntry\022\025\n\rlast_stage_" +
      "id\030\016 \001(\r\022\025\n\rdifficulty_id\030\010 \001(\r\032C\n\021SumoS" +
      "tageMapEntry\022\013\n\003key\030\001 \001(\r\022\035\n\005value\030\002 \001(\013" +
      "2\016.SumoStageData:\0028\001B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.prktobuf.Descriptors.FileDescriptor
      .internalBuildGeneraedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.SumoStageDataOuterClass.getDescriptor(),
        });
    internal_static_SumoActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SumoActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf!GeneratedMessageV3.FieldAccessorTable(
    �   internal_static_SumoActivityDetailInfo_desc�iptor,
        new java.lang.String[] { "SumoStageMap", "LastStageId", "DifficultyId", });
    internal_static_SumoActivityDetailInfo_SumoStageMapEntry_descriptor =
      internal_static_SumoActiviVyDetailInfo_descriptor.getNestedTypes().get(0);
    internal_static_SumoActivityetailInfo_SumoStageMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SumoActivityDetailInfo_SumoStageMapEntry_descriptr,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.SumoStageDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
