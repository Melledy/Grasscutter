// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GroupLinkMarkUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class GroupLinkMarkUpdateNotifyOuterClass {
  private GroupLinkMarkUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GroupLinkMarkUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GroupLinkMarkUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GroupLinkBundle bundle = 15;</code>
     * @return Whether the bundle field is set.
     */
    boolean hasBundle();
    /**
     * <code>.GroupLinkBundle bundle = 15;</code>
     * @return The bundle.
     */
    emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle getBundle();
    /**
     * <code>.GroupLinkBundle bundle = 15;</code>
     */
    emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder getBundleOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5785;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GroupLinkMarkUpdateNotify}
   */
  public static final class GroupLinkMarkUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GroupLinkMarkUpdateNotify)
      GroupLinkMarkUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GroupLinkMarkUpdateNotify.newBuilder() to construct.
    private GroupLinkMarkUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GroupLinkMarkUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GroupLinkMarkUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GroupLinkMarkUpdateNotify(
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
            case 122: {
              emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder subBuilder = null;
              if (bundle_ != null) {
                subBuilder = bundle_.toBuilder();
              }
              bundle_ = input.readMessage(emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(bundle_);
                bundle_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.internal_static_GroupLinkMarkUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.internal_static_GroupLinkMarkUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify.class, emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify.Builder.class);
    }

    public static final int BUNDLE_FIELD_NUMBER = 15;
    private emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle bundle_;
    /**
     * <code>.GroupLinkBundle bundle = 15;</code>
     * @return Whether the bundle field is set.
     */
    @java.lang.Override
    public boolean hasBundle() {
      return bundle_ != null;
    }
    /**
     * <code>.GroupLinkBundle bundle = 15;</code>
     * @return The bundle.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle getBundle() {
      return bundle_ == null ? emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.getDefaultInstance() : bundle_;
    }
    /**
     * <code>.GroupLinkBundle bundle = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder getBundleOrBuilder() {
      return getBundle();
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
      if (bundle_ != null) {
        output.writeMessage(15, getBundle());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bundle_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getBundle());
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
      if (!(obj instanceof emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify other = (emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify) obj;

      if (hasBundle() != other.hasBundle()) return false;
      if (hasBundle()) {
        if (!getBundle()
            .equals(other.getBundle())) return false;
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
      if (hasBundle()) {
        hash = (37 * hash) + BUNDLE_FIELD_NUMBER;
        hash = (53 * hash) + getBundle().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify prototype) {
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
     *   CMD_ID = 5785;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GroupLinkMarkUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GroupLinkMarkUpdateNotify)
        emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.internal_static_GroupLinkMarkUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.internal_static_GroupLinkMarkUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify.class, emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify.newBuilder()
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
        if (bundleBuilder_ == null) {
          bundle_ = null;
        } else {
          bundle_ = null;
          bundleBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.internal_static_GroupLinkMarkUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify build() {
        emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify result = new emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify(this);
        if (bundleBuilder_ == null) {
          result.bundle_ = bundle_;
        } else {
          result.bundle_ = bundleBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify.getDefaultInstance()) return this;
        if (other.hasBundle()) {
          mergeBundle(other.getBundle());
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
        emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle bundle_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle, emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder, emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder> bundleBuilder_;
      /**
       * <code>.GroupLinkBundle bundle = 15;</code>
       * @return Whether the bundle field is set.
       */
      public boolean hasBundle() {
        return bundleBuilder_ != null || bundle_ != null;
      }
      /**
       * <code>.GroupLinkBundle bundle = 15;</code>
       * @return The bundle.
       */
      public emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle getBundle() {
        if (bundleBuilder_ == null) {
          return bundle_ == null ? emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.getDefaultInstance() : bundle_;
        } else {
          return bundleBuilder_.getMessage();
        }
      }
      /**
       * <code>.GroupLinkBundle bundle = 15;</code>
       */
      public Builder setBundle(emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle value) {
        if (bundleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          bundle_ = value;
          onChanged();
        } else {
          bundleBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GroupLinkBundle bundle = 15;</code>
       */
      public Builder setBundle(
          emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder builderForValue) {
        if (bundleBuilder_ == null) {
          bundle_ = builderForValue.build();
          onChanged();
        } else {
          bundleBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GroupLinkBundle bundle = 15;</code>
       */
      public Builder mergeBundle(emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle value) {
        if (bundleBuilder_ == null) {
          if (bundle_ != null) {
            bundle_ =
              emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.newBuilder(bundle_).mergeFrom(value).buildPartial();
          } else {
            bundle_ = value;
          }
          onChanged();
        } else {
          bundleBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GroupLinkBundle bundle = 15;</code>
       */
      public Builder clearBundle() {
        if (bundleBuilder_ == null) {
          bundle_ = null;
          onChanged();
        } else {
          bundle_ = null;
          bundleBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GroupLinkBundle bundle = 15;</code>
       */
      public emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder getBundleBuilder() {
        
        onChanged();
        return getBundleFieldBuilder().getBuilder();
      }
      /**
       * <code>.GroupLinkBundle bundle = 15;</code>
       */
      public emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder getBundleOrBuilder() {
        if (bundleBuilder_ != null) {
          return bundleBuilder_.getMessageOrBuilder();
        } else {
          return bundle_ == null ?
              emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.getDefaultInstance() : bundle_;
        }
      }
      /**
       * <code>.GroupLinkBundle bundle = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle, emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder, emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder> 
          getBundleFieldBuilder() {
        if (bundleBuilder_ == null) {
          bundleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle, emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder, emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder>(
                  getBundle(),
                  getParentForChildren(),
                  isClean());
          bundle_ = null;
        }
        return bundleBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GroupLinkMarkUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:GroupLinkMarkUpdateNotify)
    private static final emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify();
    }

    public static emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GroupLinkMarkUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<GroupLinkMarkUpdateNotify>() {
      @java.lang.Override
      public GroupLinkMarkUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GroupLinkMarkUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GroupLinkMarkUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GroupLinkMarkUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GroupLinkMarkUpdateNotifyOuterClass.GroupLinkMarkUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GroupLinkMarkUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GroupLinkMarkUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037GroupLinkMarkUpdateNotify.proto\032\025Group" +
      "LinkBundle.proto\"=\n\031GroupLinkMarkUpdateN" +
      "otify\022 \n\006bundle\030\017 \001(\0132\020.GroupLinkBundleB" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GroupLinkBundleOuterClass.getDescriptor(),
        });
    internal_static_GroupLinkMarkUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GroupLinkMarkUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GroupLinkMarkUpdateNotify_descriptor,
        new java.lang.String[] { "Bundle", });
    emu.grasscutter.net.proto.GroupLinkBundleOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
