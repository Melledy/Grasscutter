// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientScriptEventNotify.proto

package emu.grasscutter.net.proto;

public final class ClientScriptEventNotifyOuterClass {
  private ClientScriptEventNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientScriptEventNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientScriptEventNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 source_entity_id = 14;</code>
     * @return The sourceEntityId.
     */
    int getSourceEntityId();

    /**
     * <code>uint32 event_type = 10;</code>
     * @return The eventType.
     */
    int getEventType();

    /**
     * <code>uint32 target_entity_id = 13;</code>
     * @return The targetEntityId.
     */
    int getTargetEntityId();

    /**
     * <code>repeated int32 param_list = 9;</code>
     * @return A list containing the paramList.
     */
    java.util.List<java.lang.Integer> getParamListList();
    /**
     * <code>repeated int32 param_list = 9;</code>
     * @return The count of paramList.
     */
    int getParamListCount();
    /**
     * <code>repeated int32 param_list = 9;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    int getParamList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 260;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ClientScriptEventNotify}
   */
  public static final class ClientScriptEventNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientScriptEventNotify)
      ClientScriptEventNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientScriptEventNotify.newBuilder() to construct.
    private ClientScriptEventNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientScriptEventNotify() {
      paramList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientScriptEventNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ClientScriptEventNotify(
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
            case 72: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                paramList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              paramList_.addInt(input.readInt32());
              break;
            }
            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                paramList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                paramList_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 80: {

              eventType_ = input.readUInt32();
              break;
            }
            case 104: {

              targetEntityId_ = input.readUInt32();
              break;
            }
            case 112: {

              sourceEntityId_ = input.readUInt32();
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
          paramList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.internal_static_ClientScriptEventNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.internal_static_ClientScriptEventNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify.class, emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify.Builder.class);
    }

    public static final int SOURCE_ENTITY_ID_FIELD_NUMBER = 14;
    private int sourceEntityId_;
    /**
     * <code>uint32 source_entity_id = 14;</code>
     * @return The sourceEntityId.
     */
    @java.lang.Override
    public int getSourceEntityId() {
      return sourceEntityId_;
    }

    public static final int EVENT_TYPE_FIELD_NUMBER = 10;
    private int eventType_;
    /**
     * <code>uint32 event_type = 10;</code>
     * @return The eventType.
     */
    @java.lang.Override
    public int getEventType() {
      return eventType_;
    }

    public static final int TARGET_ENTITY_ID_FIELD_NUMBER = 13;
    private int targetEntityId_;
    /**
     * <code>uint32 target_entity_id = 13;</code>
     * @return The targetEntityId.
     */
    @java.lang.Override
    public int getTargetEntityId() {
      return targetEntityId_;
    }

    public static final int PARAM_LIST_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.IntList paramList_;
    /**
     * <code>repeated int32 param_list = 9;</code>
     * @return A list containing the paramList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getParamListList() {
      return paramList_;
    }
    /**
     * <code>repeated int32 param_list = 9;</code>
     * @return The count of paramList.
     */
    public int getParamListCount() {
      return paramList_.size();
    }
    /**
     * <code>repeated int32 param_list = 9;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    public int getParamList(int index) {
      return paramList_.getInt(index);
    }
    private int paramListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getParamListList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(paramListMemoizedSerializedSize);
      }
      for (int i = 0; i < paramList_.size(); i++) {
        output.writeInt32NoTag(paramList_.getInt(i));
      }
      if (eventType_ != 0) {
        output.writeUInt32(10, eventType_);
      }
      if (targetEntityId_ != 0) {
        output.writeUInt32(13, targetEntityId_);
      }
      if (sourceEntityId_ != 0) {
        output.writeUInt32(14, sourceEntityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < paramList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(paramList_.getInt(i));
        }
        size += dataSize;
        if (!getParamListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        paramListMemoizedSerializedSize = dataSize;
      }
      if (eventType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, eventType_);
      }
      if (targetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, targetEntityId_);
      }
      if (sourceEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, sourceEntityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify other = (emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify) obj;

      if (getSourceEntityId()
          != other.getSourceEntityId()) return false;
      if (getEventType()
          != other.getEventType()) return false;
      if (getTargetEntityId()
          != other.getTargetEntityId()) return false;
      if (!getParamListList()
          .equals(other.getParamListList())) return false;
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
      hash = (37 * hash) + SOURCE_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSourceEntityId();
      hash = (37 * hash) + EVENT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getEventType();
      hash = (37 * hash) + TARGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetEntityId();
      if (getParamListCount() > 0) {
        hash = (37 * hash) + PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getParamListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify prototype) {
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
     * <pre>
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 260;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ClientScriptEventNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientScriptEventNotify)
        emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.internal_static_ClientScriptEventNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.internal_static_ClientScriptEventNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify.class, emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify.newBuilder()
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
        sourceEntityId_ = 0;

        eventType_ = 0;

        targetEntityId_ = 0;

        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.internal_static_ClientScriptEventNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify build() {
        emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify buildPartial() {
        emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify result = new emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify(this);
        int from_bitField0_ = bitField0_;
        result.sourceEntityId_ = sourceEntityId_;
        result.eventType_ = eventType_;
        result.targetEntityId_ = targetEntityId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          paramList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.paramList_ = paramList_;
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
        if (other instanceof emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify other) {
        if (other == emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify.getDefaultInstance()) return this;
        if (other.getSourceEntityId() != 0) {
          setSourceEntityId(other.getSourceEntityId());
        }
        if (other.getEventType() != 0) {
          setEventType(other.getEventType());
        }
        if (other.getTargetEntityId() != 0) {
          setTargetEntityId(other.getTargetEntityId());
        }
        if (!other.paramList_.isEmpty()) {
          if (paramList_.isEmpty()) {
            paramList_ = other.paramList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParamListIsMutable();
            paramList_.addAll(other.paramList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int sourceEntityId_ ;
      /**
       * <code>uint32 source_entity_id = 14;</code>
       * @return The sourceEntityId.
       */
      @java.lang.Override
      public int getSourceEntityId() {
        return sourceEntityId_;
      }
      /**
       * <code>uint32 source_entity_id = 14;</code>
       * @param value The sourceEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setSourceEntityId(int value) {
        
        sourceEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 source_entity_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearSourceEntityId() {
        
        sourceEntityId_ = 0;
        onChanged();
        return this;
      }

      private int eventType_ ;
      /**
       * <code>uint32 event_type = 10;</code>
       * @return The eventType.
       */
      @java.lang.Override
      public int getEventType() {
        return eventType_;
      }
      /**
       * <code>uint32 event_type = 10;</code>
       * @param value The eventType to set.
       * @return This builder for chaining.
       */
      public Builder setEventType(int value) {
        
        eventType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 event_type = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearEventType() {
        
        eventType_ = 0;
        onChanged();
        return this;
      }

      private int targetEntityId_ ;
      /**
       * <code>uint32 target_entity_id = 13;</code>
       * @return The targetEntityId.
       */
      @java.lang.Override
      public int getTargetEntityId() {
        return targetEntityId_;
      }
      /**
       * <code>uint32 target_entity_id = 13;</code>
       * @param value The targetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetEntityId(int value) {
        
        targetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_entity_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetEntityId() {
        
        targetEntityId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList paramList_ = emptyIntList();
      private void ensureParamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          paramList_ = mutableCopy(paramList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 param_list = 9;</code>
       * @return A list containing the paramList.
       */
      public java.util.List<java.lang.Integer>
          getParamListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(paramList_) : paramList_;
      }
      /**
       * <code>repeated int32 param_list = 9;</code>
       * @return The count of paramList.
       */
      public int getParamListCount() {
        return paramList_.size();
      }
      /**
       * <code>repeated int32 param_list = 9;</code>
       * @param index The index of the element to return.
       * @return The paramList at the given index.
       */
      public int getParamList(int index) {
        return paramList_.getInt(index);
      }
      /**
       * <code>repeated int32 param_list = 9;</code>
       * @param index The index to set the value at.
       * @param value The paramList to set.
       * @return This builder for chaining.
       */
      public Builder setParamList(
          int index, int value) {
        ensureParamListIsMutable();
        paramList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 param_list = 9;</code>
       * @param value The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addParamList(int value) {
        ensureParamListIsMutable();
        paramList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 param_list = 9;</code>
       * @param values The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addAllParamList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureParamListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, paramList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 param_list = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearParamList() {
        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:ClientScriptEventNotify)
    }

    // @@protoc_insertion_point(class_scope:ClientScriptEventNotify)
    private static final emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify();
    }

    public static emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientScriptEventNotify>
        PARSER = new com.google.protobuf.AbstractParser<ClientScriptEventNotify>() {
      @java.lang.Override
      public ClientScriptEventNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientScriptEventNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ClientScriptEventNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientScriptEventNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ClientScriptEventNotifyOuterClass.ClientScriptEventNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientScriptEventNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientScriptEventNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ClientScriptEventNotify.proto\"u\n\027Clien" +
      "tScriptEventNotify\022\030\n\020source_entity_id\030\016" +
      " \001(\r\022\022\n\nevent_type\030\n \001(\r\022\030\n\020target_entit" +
      "y_id\030\r \001(\r\022\022\n\nparam_list\030\t \003(\005B\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ClientScriptEventNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientScriptEventNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientScriptEventNotify_descriptor,
        new java.lang.String[] { "SourceEntityId", "EventType", "TargetEntityId", "ParamList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
