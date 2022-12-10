// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgUseSkillEnd.proto

package emu.grasscutter.net.proto;

public final class GCGMsgUseSkillEndOuterClass {
  private GCGMsgUseSkillEndOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgUseSkillEndOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgUseSkillEnd)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_guid = 9;</code>
     * @return The cardGuid.
     */
    int getCardGuid();

    /**
     * <code>uint32 skill_id = 6;</code>
     * @return The skillId.
     */
    int getSkillId();
  }
  /**
   * Protobuf type {@code GCGMsgUseSkillEnd}
   */
  public static final class GCGMsgUseSkillEnd extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgUseSkillEnd)
      GCGMsgUseSkillEndOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgUseSkillEnd.newBuilder() to construct.
    private GCGMsgUseSkillEnd(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgUseSkillEnd() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgUseSkillEnd();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGMsgUseSkillEnd(
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
            case 48: {

              skillId_ = input.readUInt32();
              break;
            }
            case 72: {

              cardGuid_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.internal_static_GCGMsgUseSkillEnd_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.internal_static_GCGMsgUseSkillEnd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd.class, emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd.Builder.class);
    }

    public static final int CARD_GUID_FIELD_NUMBER = 9;
    private int cardGuid_;
    /**
     * <code>uint32 card_guid = 9;</code>
     * @return The cardGuid.
     */
    @java.lang.Override
    public int getCardGuid() {
      return cardGuid_;
    }

    public static final int SKILL_ID_FIELD_NUMBER = 6;
    private int skillId_;
    /**
     * <code>uint32 skill_id = 6;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
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
      if (skillId_ != 0) {
        output.writeUInt32(6, skillId_);
      }
      if (cardGuid_ != 0) {
        output.writeUInt32(9, cardGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, skillId_);
      }
      if (cardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, cardGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd other = (emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd) obj;

      if (getCardGuid()
          != other.getCardGuid()) return false;
      if (getSkillId()
          != other.getSkillId()) return false;
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
      hash = (37 * hash) + CARD_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getCardGuid();
      hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd prototype) {
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
     * Protobuf type {@code GCGMsgUseSkillEnd}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgUseSkillEnd)
        emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEndOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.internal_static_GCGMsgUseSkillEnd_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.internal_static_GCGMsgUseSkillEnd_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd.class, emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd.newBuilder()
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
        cardGuid_ = 0;

        skillId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.internal_static_GCGMsgUseSkillEnd_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd build() {
        emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd buildPartial() {
        emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd result = new emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd(this);
        result.cardGuid_ = cardGuid_;
        result.skillId_ = skillId_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd) {
          return mergeFrom((emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd other) {
        if (other == emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd.getDefaultInstance()) return this;
        if (other.getCardGuid() != 0) {
          setCardGuid(other.getCardGuid());
        }
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
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
        emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cardGuid_ ;
      /**
       * <code>uint32 card_guid = 9;</code>
       * @return The cardGuid.
       */
      @java.lang.Override
      public int getCardGuid() {
        return cardGuid_;
      }
      /**
       * <code>uint32 card_guid = 9;</code>
       * @param value The cardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuid(int value) {
        
        cardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_guid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuid() {
        
        cardGuid_ = 0;
        onChanged();
        return this;
      }

      private int skillId_ ;
      /**
       * <code>uint32 skill_id = 6;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skill_id = 6;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        
        skillId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGMsgUseSkillEnd)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgUseSkillEnd)
    private static final emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd();
    }

    public static emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgUseSkillEnd>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgUseSkillEnd>() {
      @java.lang.Override
      public GCGMsgUseSkillEnd parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGMsgUseSkillEnd(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGMsgUseSkillEnd> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgUseSkillEnd> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGMsgUseSkillEndOuterClass.GCGMsgUseSkillEnd getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgUseSkillEnd_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgUseSkillEnd_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GCGMsgUseSkillEnd.proto\"8\n\021GCGMsgUseSk" +
      "illEnd\022\021\n\tcard_guid\030\t \001(\r\022\020\n\010skill_id\030\006 " +
      "\001(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGMsgUseSkillEnd_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgUseSkillEnd_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgUseSkillEnd_descriptor,
        new java.lang.String[] { "CardGuid", "SkillId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
