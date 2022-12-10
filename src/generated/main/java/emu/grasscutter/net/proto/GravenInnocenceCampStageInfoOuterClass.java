// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GravenInnocenceCampStageInfo.proto

package emu.grasscutter.net.proto;

public final class GravenInnocenceCampStageInfoOuterClass {
  private GravenInnocenceCampStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GravenInnocenceCampStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GravenInnocenceCampStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_open = 11;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>bool is_finished = 6;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 level_id = 7;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 stage_id = 3;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * Protobuf type {@code GravenInnocenceCampStageInfo}
   */
  public static final class GravenInnocenceCampStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GravenInnocenceCampStageInfo)
      GravenInnocenceCampStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GravenInnocenceCampStageInfo.newBuilder() to construct.
    private GravenInnocenceCampStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GravenInnocenceCampStageInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GravenInnocenceCampStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GravenInnocenceCampStageInfo(
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
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 24: {

              stageId_ = input.readUInt32();
              break;
            }
            case 48: {

              isFinished_ = input.readBool();
              break;
            }
            case 56: {

              levelId_ = input.readUInt32();
              break;
            }
            case 88: {

              isOpen_ = input.readBool();
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
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.internal_static_GravenInnocenceCampStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.internal_static_GravenInnocenceCampStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo.class, emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo.Builder.class);
    }

    public static final int IS_OPEN_FIELD_NUMBER = 11;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 11;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 6;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 6;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 7;
    private int levelId_;
    /**
     * <code>uint32 level_id = 7;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 3;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 3;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (stageId_ != 0) {
        output.writeUInt32(3, stageId_);
      }
      if (isFinished_ != false) {
        output.writeBool(6, isFinished_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(7, levelId_);
      }
      if (isOpen_ != false) {
        output.writeBool(11, isOpen_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, stageId_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isFinished_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, levelId_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isOpen_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo other = (emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo prototype) {
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
     * Protobuf type {@code GravenInnocenceCampStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GravenInnocenceCampStageInfo)
        emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.internal_static_GravenInnocenceCampStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.internal_static_GravenInnocenceCampStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo.class, emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

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
        super.clear();
        isOpen_ = false;

        isFinished_ = false;

        levelId_ = 0;

        stageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.internal_static_GravenInnocenceCampStageInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo build() {
        emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo buildPartial() {
        emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo result = new emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo(this);
        result.isOpen_ = isOpen_;
        result.isFinished_ = isFinished_;
        result.levelId_ = levelId_;
        result.stageId_ = stageId_;
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
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo) {
          return mergeFrom((emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo other) {
        if (other == emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 11;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 11;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 6;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 6;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 7;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 7;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 3;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 3;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GravenInnocenceCampStageInfo)
    }

    // @@protoc_insertion_point(class_scope:GravenInnocenceCampStageInfo)
    private static final emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo();
    }

    public static emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GravenInnocenceCampStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<GravenInnocenceCampStageInfo>() {
      @java.lang.Override
      public GravenInnocenceCampStageInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GravenInnocenceCampStageInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GravenInnocenceCampStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GravenInnocenceCampStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GravenInnocenceCampStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GravenInnocenceCampStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"GravenInnocenceCampStageInfo.proto\"h\n\034" +
      "GravenInnocenceCampStageInfo\022\017\n\007is_open\030" +
      "\013 \001(\010\022\023\n\013is_finished\030\006 \001(\010\022\020\n\010level_id\030\007" +
      " \001(\r\022\020\n\010stage_id\030\003 \001(\rB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GravenInnocenceCampStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GravenInnocenceCampStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GravenInnocenceCampStageInfo_descriptor,
        new java.lang.String[] { "IsOpen", "IsFinished", "LevelId", "StageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
