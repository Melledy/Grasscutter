// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityActionSetCrashDamage.proto

package emu.grasscutter.net.proto;

public final class AbilityActionSetCrashDamageOuterClass {
  private AbilityActionSetCrashDamageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityActionSetCrashDamageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityActionSetCrashDamage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float damage = 2;</code>
     * @return The damage.
     */
    float getDamage();

    /**
     * <code>.Vector hit_pos = 8;</code>
     * @return Whether the hitPos field is set.
     */
    boolean hasHitPos();
    /**
     * <code>.Vector hit_pos = 8;</code>
     * @return The hitPos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getHitPos();
    /**
     * <code>.Vector hit_pos = 8;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getHitPosOrBuilder();
  }
  /**
   * Protobuf type {@code AbilityActionSetCrashDamage}
   */
  public static final class AbilityActionSetCrashDamage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityActionSetCrashDamage)
      AbilityActionSetCrashDamageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityActionSetCrashDamage.newBuilder() to construct.
    private AbilityActionSetCrashDamage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityActionSetCrashDamage() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityActionSetCrashDamage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityActionSetCrashDamage(
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
            case 21: {

              damage_ = input.readFloat();
              break;
            }
            case 66: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (hitPos_ != null) {
                subBuilder = hitPos_.toBuilder();
              }
              hitPos_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(hitPos_);
                hitPos_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.internal_static_AbilityActionSetCrashDamage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.internal_static_AbilityActionSetCrashDamage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage.class, emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage.Builder.class);
    }

    public static final int DAMAGE_FIELD_NUMBER = 2;
    private float damage_;
    /**
     * <code>float damage = 2;</code>
     * @return The damage.
     */
    @java.lang.Override
    public float getDamage() {
      return damage_;
    }

    public static final int HIT_POS_FIELD_NUMBER = 8;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector hitPos_;
    /**
     * <code>.Vector hit_pos = 8;</code>
     * @return Whether the hitPos field is set.
     */
    @java.lang.Override
    public boolean hasHitPos() {
      return hitPos_ != null;
    }
    /**
     * <code>.Vector hit_pos = 8;</code>
     * @return The hitPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getHitPos() {
      return hitPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hitPos_;
    }
    /**
     * <code>.Vector hit_pos = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getHitPosOrBuilder() {
      return getHitPos();
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
      if (damage_ != 0F) {
        output.writeFloat(2, damage_);
      }
      if (hitPos_ != null) {
        output.writeMessage(8, getHitPos());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (damage_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, damage_);
      }
      if (hitPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getHitPos());
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
      if (!(obj instanceof emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage other = (emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage) obj;

      if (java.lang.Float.floatToIntBits(getDamage())
          != java.lang.Float.floatToIntBits(
              other.getDamage())) return false;
      if (hasHitPos() != other.hasHitPos()) return false;
      if (hasHitPos()) {
        if (!getHitPos()
            .equals(other.getHitPos())) return false;
      }
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
      hash = (37 * hash) + DAMAGE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getDamage());
      if (hasHitPos()) {
        hash = (37 * hash) + HIT_POS_FIELD_NUMBER;
        hash = (53 * hash) + getHitPos().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage prototype) {
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
     * Protobuf type {@code AbilityActionSetCrashDamage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityActionSetCrashDamage)
        emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.internal_static_AbilityActionSetCrashDamage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.internal_static_AbilityActionSetCrashDamage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage.class, emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage.newBuilder()
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
        damage_ = 0F;

        if (hitPosBuilder_ == null) {
          hitPos_ = null;
        } else {
          hitPos_ = null;
          hitPosBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.internal_static_AbilityActionSetCrashDamage_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage build() {
        emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage buildPartial() {
        emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage result = new emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage(this);
        result.damage_ = damage_;
        if (hitPosBuilder_ == null) {
          result.hitPos_ = hitPos_;
        } else {
          result.hitPos_ = hitPosBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage) {
          return mergeFrom((emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage other) {
        if (other == emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage.getDefaultInstance()) return this;
        if (other.getDamage() != 0F) {
          setDamage(other.getDamage());
        }
        if (other.hasHitPos()) {
          mergeHitPos(other.getHitPos());
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
        emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float damage_ ;
      /**
       * <code>float damage = 2;</code>
       * @return The damage.
       */
      @java.lang.Override
      public float getDamage() {
        return damage_;
      }
      /**
       * <code>float damage = 2;</code>
       * @param value The damage to set.
       * @return This builder for chaining.
       */
      public Builder setDamage(float value) {
        
        damage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float damage = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDamage() {
        
        damage_ = 0F;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector hitPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> hitPosBuilder_;
      /**
       * <code>.Vector hit_pos = 8;</code>
       * @return Whether the hitPos field is set.
       */
      public boolean hasHitPos() {
        return hitPosBuilder_ != null || hitPos_ != null;
      }
      /**
       * <code>.Vector hit_pos = 8;</code>
       * @return The hitPos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getHitPos() {
        if (hitPosBuilder_ == null) {
          return hitPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hitPos_;
        } else {
          return hitPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector hit_pos = 8;</code>
       */
      public Builder setHitPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (hitPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hitPos_ = value;
          onChanged();
        } else {
          hitPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector hit_pos = 8;</code>
       */
      public Builder setHitPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (hitPosBuilder_ == null) {
          hitPos_ = builderForValue.build();
          onChanged();
        } else {
          hitPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector hit_pos = 8;</code>
       */
      public Builder mergeHitPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (hitPosBuilder_ == null) {
          if (hitPos_ != null) {
            hitPos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(hitPos_).mergeFrom(value).buildPartial();
          } else {
            hitPos_ = value;
          }
          onChanged();
        } else {
          hitPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector hit_pos = 8;</code>
       */
      public Builder clearHitPos() {
        if (hitPosBuilder_ == null) {
          hitPos_ = null;
          onChanged();
        } else {
          hitPos_ = null;
          hitPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector hit_pos = 8;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getHitPosBuilder() {
        
        onChanged();
        return getHitPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector hit_pos = 8;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getHitPosOrBuilder() {
        if (hitPosBuilder_ != null) {
          return hitPosBuilder_.getMessageOrBuilder();
        } else {
          return hitPos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hitPos_;
        }
      }
      /**
       * <code>.Vector hit_pos = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getHitPosFieldBuilder() {
        if (hitPosBuilder_ == null) {
          hitPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getHitPos(),
                  getParentForChildren(),
                  isClean());
          hitPos_ = null;
        }
        return hitPosBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AbilityActionSetCrashDamage)
    }

    // @@protoc_insertion_point(class_scope:AbilityActionSetCrashDamage)
    private static final emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage();
    }

    public static emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityActionSetCrashDamage>
        PARSER = new com.google.protobuf.AbstractParser<AbilityActionSetCrashDamage>() {
      @java.lang.Override
      public AbilityActionSetCrashDamage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityActionSetCrashDamage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityActionSetCrashDamage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityActionSetCrashDamage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityActionSetCrashDamage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityActionSetCrashDamage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!AbilityActionSetCrashDamage.proto\032\014Vec" +
      "tor.proto\"G\n\033AbilityActionSetCrashDamage" +
      "\022\016\n\006damage\030\002 \001(\002\022\030\n\007hit_pos\030\010 \001(\0132\007.Vect" +
      "orB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_AbilityActionSetCrashDamage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityActionSetCrashDamage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityActionSetCrashDamage_descriptor,
        new java.lang.String[] { "Damage", "HitPos", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
