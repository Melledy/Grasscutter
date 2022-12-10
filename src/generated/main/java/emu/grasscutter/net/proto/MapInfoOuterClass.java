// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MapInfo.proto

package emu.grasscutter.net.proto;

public final class MapInfoOuterClass {
  private MapInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MapInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MapInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 minx = 1;</code>
     * @return The minx.
     */
    int getMinx();

    /**
     * <code>int32 maxx = 2;</code>
     * @return The maxx.
     */
    int getMaxx();

    /**
     * <code>int32 minz = 3;</code>
     * @return The minz.
     */
    int getMinz();

    /**
     * <code>int32 maxz = 4;</code>
     * @return The maxz.
     */
    int getMaxz();

    /**
     * <code>repeated .CellInfo cells = 5;</code>
     */
    java.util.List<emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo> 
        getCellsList();
    /**
     * <code>repeated .CellInfo cells = 5;</code>
     */
    emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo getCells(int index);
    /**
     * <code>repeated .CellInfo cells = 5;</code>
     */
    int getCellsCount();
    /**
     * <code>repeated .CellInfo cells = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.CellInfoOuterClass.CellInfoOrBuilder> 
        getCellsOrBuilderList();
    /**
     * <code>repeated .CellInfo cells = 5;</code>
     */
    emu.grasscutter.net.proto.CellInfoOuterClass.CellInfoOrBuilder getCellsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code MapInfo}
   */
  public static final class MapInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MapInfo)
      MapInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MapInfo.newBuilder() to construct.
    private MapInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MapInfo() {
      cells_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MapInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MapInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 8: {

              minx_ = input.readInt32();
              break;
            }
            case 16: {

              maxx_ = input.readInt32();
              break;
            }
            case 24: {

              minz_ = input.readInt32();
              break;
            }
            case 32: {

              maxz_ = input.readInt32();
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                cells_ = new java.util.ArrayList<emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              cells_.add(
                  input.readMessage(emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          cells_ = java.util.Collections.unmodifiableList(cells_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MapInfoOuterClass.internal_static_MapInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MapInfoOuterClass.internal_static_MapInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo.class, emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo.Builder.class);
    }

    public static final int MINX_FIELD_NUMBER = 1;
    private int minx_;
    /**
     * <code>int32 minx = 1;</code>
     * @return The minx.
     */
    @java.lang.Override
    public int getMinx() {
      return minx_;
    }

    public static final int MAXX_FIELD_NUMBER = 2;
    private int maxx_;
    /**
     * <code>int32 maxx = 2;</code>
     * @return The maxx.
     */
    @java.lang.Override
    public int getMaxx() {
      return maxx_;
    }

    public static final int MINZ_FIELD_NUMBER = 3;
    private int minz_;
    /**
     * <code>int32 minz = 3;</code>
     * @return The minz.
     */
    @java.lang.Override
    public int getMinz() {
      return minz_;
    }

    public static final int MAXZ_FIELD_NUMBER = 4;
    private int maxz_;
    /**
     * <code>int32 maxz = 4;</code>
     * @return The maxz.
     */
    @java.lang.Override
    public int getMaxz() {
      return maxz_;
    }

    public static final int CELLS_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo> cells_;
    /**
     * <code>repeated .CellInfo cells = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo> getCellsList() {
      return cells_;
    }
    /**
     * <code>repeated .CellInfo cells = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.CellInfoOuterClass.CellInfoOrBuilder> 
        getCellsOrBuilderList() {
      return cells_;
    }
    /**
     * <code>repeated .CellInfo cells = 5;</code>
     */
    @java.lang.Override
    public int getCellsCount() {
      return cells_.size();
    }
    /**
     * <code>repeated .CellInfo cells = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo getCells(int index) {
      return cells_.get(index);
    }
    /**
     * <code>repeated .CellInfo cells = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CellInfoOuterClass.CellInfoOrBuilder getCellsOrBuilder(
        int index) {
      return cells_.get(index);
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
      if (minx_ != 0) {
        output.writeInt32(1, minx_);
      }
      if (maxx_ != 0) {
        output.writeInt32(2, maxx_);
      }
      if (minz_ != 0) {
        output.writeInt32(3, minz_);
      }
      if (maxz_ != 0) {
        output.writeInt32(4, maxz_);
      }
      for (int i = 0; i < cells_.size(); i++) {
        output.writeMessage(5, cells_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (minx_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, minx_);
      }
      if (maxx_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, maxx_);
      }
      if (minz_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, minz_);
      }
      if (maxz_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, maxz_);
      }
      for (int i = 0; i < cells_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, cells_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo other = (emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo) obj;

      if (getMinx()
          != other.getMinx()) return false;
      if (getMaxx()
          != other.getMaxx()) return false;
      if (getMinz()
          != other.getMinz()) return false;
      if (getMaxz()
          != other.getMaxz()) return false;
      if (!getCellsList()
          .equals(other.getCellsList())) return false;
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
      hash = (37 * hash) + MINX_FIELD_NUMBER;
      hash = (53 * hash) + getMinx();
      hash = (37 * hash) + MAXX_FIELD_NUMBER;
      hash = (53 * hash) + getMaxx();
      hash = (37 * hash) + MINZ_FIELD_NUMBER;
      hash = (53 * hash) + getMinz();
      hash = (37 * hash) + MAXZ_FIELD_NUMBER;
      hash = (53 * hash) + getMaxz();
      if (getCellsCount() > 0) {
        hash = (37 * hash) + CELLS_FIELD_NUMBER;
        hash = (53 * hash) + getCellsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo prototype) {
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
     * Protobuf type {@code MapInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MapInfo)
        emu.grasscutter.net.proto.MapInfoOuterClass.MapInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MapInfoOuterClass.internal_static_MapInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MapInfoOuterClass.internal_static_MapInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo.class, emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo.newBuilder()
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
          getCellsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        minx_ = 0;

        maxx_ = 0;

        minz_ = 0;

        maxz_ = 0;

        if (cellsBuilder_ == null) {
          cells_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          cellsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MapInfoOuterClass.internal_static_MapInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo build() {
        emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo buildPartial() {
        emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo result = new emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo(this);
        int from_bitField0_ = bitField0_;
        result.minx_ = minx_;
        result.maxx_ = maxx_;
        result.minz_ = minz_;
        result.maxz_ = maxz_;
        if (cellsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            cells_ = java.util.Collections.unmodifiableList(cells_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.cells_ = cells_;
        } else {
          result.cells_ = cellsBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo) {
          return mergeFrom((emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo other) {
        if (other == emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo.getDefaultInstance()) return this;
        if (other.getMinx() != 0) {
          setMinx(other.getMinx());
        }
        if (other.getMaxx() != 0) {
          setMaxx(other.getMaxx());
        }
        if (other.getMinz() != 0) {
          setMinz(other.getMinz());
        }
        if (other.getMaxz() != 0) {
          setMaxz(other.getMaxz());
        }
        if (cellsBuilder_ == null) {
          if (!other.cells_.isEmpty()) {
            if (cells_.isEmpty()) {
              cells_ = other.cells_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCellsIsMutable();
              cells_.addAll(other.cells_);
            }
            onChanged();
          }
        } else {
          if (!other.cells_.isEmpty()) {
            if (cellsBuilder_.isEmpty()) {
              cellsBuilder_.dispose();
              cellsBuilder_ = null;
              cells_ = other.cells_;
              bitField0_ = (bitField0_ & ~0x00000001);
              cellsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCellsFieldBuilder() : null;
            } else {
              cellsBuilder_.addAllMessages(other.cells_);
            }
          }
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
        emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int minx_ ;
      /**
       * <code>int32 minx = 1;</code>
       * @return The minx.
       */
      @java.lang.Override
      public int getMinx() {
        return minx_;
      }
      /**
       * <code>int32 minx = 1;</code>
       * @param value The minx to set.
       * @return This builder for chaining.
       */
      public Builder setMinx(int value) {
        
        minx_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 minx = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinx() {
        
        minx_ = 0;
        onChanged();
        return this;
      }

      private int maxx_ ;
      /**
       * <code>int32 maxx = 2;</code>
       * @return The maxx.
       */
      @java.lang.Override
      public int getMaxx() {
        return maxx_;
      }
      /**
       * <code>int32 maxx = 2;</code>
       * @param value The maxx to set.
       * @return This builder for chaining.
       */
      public Builder setMaxx(int value) {
        
        maxx_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 maxx = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxx() {
        
        maxx_ = 0;
        onChanged();
        return this;
      }

      private int minz_ ;
      /**
       * <code>int32 minz = 3;</code>
       * @return The minz.
       */
      @java.lang.Override
      public int getMinz() {
        return minz_;
      }
      /**
       * <code>int32 minz = 3;</code>
       * @param value The minz to set.
       * @return This builder for chaining.
       */
      public Builder setMinz(int value) {
        
        minz_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 minz = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinz() {
        
        minz_ = 0;
        onChanged();
        return this;
      }

      private int maxz_ ;
      /**
       * <code>int32 maxz = 4;</code>
       * @return The maxz.
       */
      @java.lang.Override
      public int getMaxz() {
        return maxz_;
      }
      /**
       * <code>int32 maxz = 4;</code>
       * @param value The maxz to set.
       * @return This builder for chaining.
       */
      public Builder setMaxz(int value) {
        
        maxz_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 maxz = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxz() {
        
        maxz_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo> cells_ =
        java.util.Collections.emptyList();
      private void ensureCellsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cells_ = new java.util.ArrayList<emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo>(cells_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo, emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo.Builder, emu.grasscutter.net.proto.CellInfoOuterClass.CellInfoOrBuilder> cellsBuilder_;

      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo> getCellsList() {
        if (cellsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(cells_);
        } else {
          return cellsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public int getCellsCount() {
        if (cellsBuilder_ == null) {
          return cells_.size();
        } else {
          return cellsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo getCells(int index) {
        if (cellsBuilder_ == null) {
          return cells_.get(index);
        } else {
          return cellsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public Builder setCells(
          int index, emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo value) {
        if (cellsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCellsIsMutable();
          cells_.set(index, value);
          onChanged();
        } else {
          cellsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public Builder setCells(
          int index, emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo.Builder builderForValue) {
        if (cellsBuilder_ == null) {
          ensureCellsIsMutable();
          cells_.set(index, builderForValue.build());
          onChanged();
        } else {
          cellsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public Builder addCells(emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo value) {
        if (cellsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCellsIsMutable();
          cells_.add(value);
          onChanged();
        } else {
          cellsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public Builder addCells(
          int index, emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo value) {
        if (cellsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCellsIsMutable();
          cells_.add(index, value);
          onChanged();
        } else {
          cellsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public Builder addCells(
          emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo.Builder builderForValue) {
        if (cellsBuilder_ == null) {
          ensureCellsIsMutable();
          cells_.add(builderForValue.build());
          onChanged();
        } else {
          cellsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public Builder addCells(
          int index, emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo.Builder builderForValue) {
        if (cellsBuilder_ == null) {
          ensureCellsIsMutable();
          cells_.add(index, builderForValue.build());
          onChanged();
        } else {
          cellsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public Builder addAllCells(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo> values) {
        if (cellsBuilder_ == null) {
          ensureCellsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, cells_);
          onChanged();
        } else {
          cellsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public Builder clearCells() {
        if (cellsBuilder_ == null) {
          cells_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          cellsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public Builder removeCells(int index) {
        if (cellsBuilder_ == null) {
          ensureCellsIsMutable();
          cells_.remove(index);
          onChanged();
        } else {
          cellsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo.Builder getCellsBuilder(
          int index) {
        return getCellsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public emu.grasscutter.net.proto.CellInfoOuterClass.CellInfoOrBuilder getCellsOrBuilder(
          int index) {
        if (cellsBuilder_ == null) {
          return cells_.get(index);  } else {
          return cellsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.CellInfoOuterClass.CellInfoOrBuilder> 
           getCellsOrBuilderList() {
        if (cellsBuilder_ != null) {
          return cellsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(cells_);
        }
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo.Builder addCellsBuilder() {
        return getCellsFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo.Builder addCellsBuilder(
          int index) {
        return getCellsFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .CellInfo cells = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo.Builder> 
           getCellsBuilderList() {
        return getCellsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo, emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo.Builder, emu.grasscutter.net.proto.CellInfoOuterClass.CellInfoOrBuilder> 
          getCellsFieldBuilder() {
        if (cellsBuilder_ == null) {
          cellsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo, emu.grasscutter.net.proto.CellInfoOuterClass.CellInfo.Builder, emu.grasscutter.net.proto.CellInfoOuterClass.CellInfoOrBuilder>(
                  cells_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          cells_ = null;
        }
        return cellsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MapInfo)
    }

    // @@protoc_insertion_point(class_scope:MapInfo)
    private static final emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo();
    }

    public static emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MapInfo>
        PARSER = new com.google.protobuf.AbstractParser<MapInfo>() {
      @java.lang.Override
      public MapInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MapInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MapInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MapInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MapInfoOuterClass.MapInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MapInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MapInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rMapInfo.proto\032\016CellInfo.proto\"[\n\007MapIn" +
      "fo\022\014\n\004minx\030\001 \001(\005\022\014\n\004maxx\030\002 \001(\005\022\014\n\004minz\030\003" +
      " \001(\005\022\014\n\004maxz\030\004 \001(\005\022\030\n\005cells\030\005 \003(\0132\t.Cell" +
      "InfoB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CellInfoOuterClass.getDescriptor(),
        });
    internal_static_MapInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MapInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MapInfo_descriptor,
        new java.lang.String[] { "Minx", "Maxx", "Minz", "Maxz", "Cells", });
    emu.grasscutter.net.proto.CellInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
