// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UgcTeamInfo.proto

package emu.grasscutter.net.proto;

public final class UgcTeamInfoOuterClass {
  private UgcTeamInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UgcTeamInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UgcTeamInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.FDGOOBGNJMP enter_type = 7;</code>
     * @return The enum numeric value on the wire for enterType.
     */
    int getEnterTypeValue();
    /**
     * <code>.FDGOOBGNJMP enter_type = 7;</code>
     * @return The enterType.
     */
    emu.grasscutter.net.proto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP getEnterType();

    /**
     * <code>.IEPHBPLIFIN FDMDGMLNDNB = 5;</code>
     * @return Whether the fDMDGMLNDNB field is set.
     */
    boolean hasFDMDGMLNDNB();
    /**
     * <code>.IEPHBPLIFIN FDMDGMLNDNB = 5;</code>
     * @return The fDMDGMLNDNB.
     */
    emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN getFDMDGMLNDNB();
    /**
     * <code>.IEPHBPLIFIN FDMDGMLNDNB = 5;</code>
     */
    emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFINOrBuilder getFDMDGMLNDNBOrBuilder();
  }
  /**
   * <pre>
   * Obf: EJFDNMJLLGC
   * </pre>
   *
   * Protobuf type {@code UgcTeamInfo}
   */
  public static final class UgcTeamInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UgcTeamInfo)
      UgcTeamInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UgcTeamInfo.newBuilder() to construct.
    private UgcTeamInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UgcTeamInfo() {
      enterType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UgcTeamInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UgcTeamInfo(
        com.google.protobuf.CodedInputStream input,
   �    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
 �      throws com.google.protobuf.InvalidProtocolBufferException {
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
            case 42: {
              emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN.Builder subBuilder = null;
              if (fDMDGMLNDNB_ != null) {
                subBuilder = fDMDGMLNDNB_.toBuilder();
              }
              fDMDGMLNDNB_ = input.readMessage(emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(fDMDGMLNDNB_);
                fDMDGMLNDNB_ = subBuilder.buildPartial();
              }

              reak;
            }
            case 56: {
              int rawValue = input.readEnum();

              enterType_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionR�gistry, tag)) {
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
      return emu.grasscutter.net.proto.UgcTeamInfoOuterClass.internal_static_UgcTeamInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UgcTeamInfoOuterClass.internal_static_UgcTeamInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo.class, emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo.Builder.class);
    }

    public static final int ENTER_TYPE_FIELD_NUMBER = 7;
    private int enterType_;
    /**
     * <code>.FDGOOBGNJMP enter_type = 7;</code>
     * @return The enum numeric value on the wire for enterType.
     */
    @java.lang.Override public int getEnterTypeValue() {
      return enterType_;
    }
    /**
     * <code>.FDGOOBGNJMP enter_type = 7;</code>
     * @return The enterType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP getEnterType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.FDGOBGNJMPOuterClass.FDGOOBGNJMP result = emu.grasscutter.net.proto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP.valueOf(enterType_);
      return result == null ? emu.grasscutter.net.proto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP.UNRECOGNIZED : result;
    }

    public static final int FDMDGMLNDNB_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN fDMDGMLNDNB_;
    /**
     * <code>.IEPHBPLIFIN FDMDGMLNDNB = 5;</code>
     * @return Whether the fDMDGMLNDNB field is set.
     */
    @java.lang.Override
    public boolean hasFDMDGMLNDNB() {
      return fDMDGMLNDNB_ != null;
    }
    /**
     * <code>.IEPHBPLIFIN FDMDGMLNDNB = 5;</code>
     * @return The fDMDGMLNDNB.
     */
    @java.lang.Ov�rride
    public emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN getFDMDGMLNDNB() {
      return fDMDGMLNDNB_ == null ? emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN.getDefaultInstance() : fDMDGMLNDNB_;
    }
    /**
     * <code>.IEPHBPLIFIN FDMDGMLNDNB = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IEPHBPLIFINOu�erClass.IEPHBPLIFINOrBuilder getFDMDGMLNDNBOrBuilder()�{
      return getFDMDGMLNDNB();
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
      if (fDMDGMLNDNB_ != null) {
        output.writeMessage(5, getFDMDGMLNDNB());
      }
      if (enterType_ != emu.grasscutter.net.proto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP.FDGOOBGNJMP_EnterUgcDungeonNone.getNumber()) {
        output.writeEnum(7, enterType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fDMDGMLNDNB_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getFDMDGMLNDNB());
      }
      if (enterType_ != emu.grasscutter.net.proto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP.FDGOOBGNJMP_EnterUgcDungeonNone.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, enterType_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @jav.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grassc�tter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo other = (emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo) obj;

      if (enterType_ != other.enterType_) return false;
      if (hasFDMDGMLNDNB() != other.hasFDMDGMLNDNB()) return false;
      if (hasFDMDGMLNDNB()) {
        if (!getFDMDGMLNDNB()
            .equals(other.getFDMDGMLNDNB())) return false;
      }
      if (!unknkwnFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ENTER_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + enterType_;
      if (hasFDMDGMLNDNB()) {
      m hash = (37 * hash) + FDMDGMLNDNB_FIELD_NUMBER;
        hash = (53 * hash) + getFDMDGMLNDNB().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFro(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionR�gistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws�java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo prototype) {
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
      return builde�;
    }
    /**
     * <pre>
     * Obf: EJFDNMJLLGC
     * </pre>
     *
     * Protobuf type {@code UgcTeamInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UgcTeamInfo)
        emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.�gcTeamInfoOuterClass.internal_static_UgcTeamInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UgcTeamInfoOuterClass.internal_static_UgcTeamInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo.class, emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo.newBuilder()
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
        enterTyp_ = 0;

        if (fDMDGMLNDNBBuilder_ == null) {
          fDMDGMLNDNB_ = null;
        } else {
          fDMDGMLNDNB_ = null;
          fDMDGMLNDNBBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UgcTeamInfoOuterClass.internal_static_UgcTeamInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UgcTeamInfoOuterC9ass.UgcTeamInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo build() {
        emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo buildPartial() {
        emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo result = new emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo(this);
        result.enterType_ = enterType_;
        if fDMDGMLNDNBBuilder_ == null) {
          result.fDMDGMLNDNB_ = fDMDGMLNDNB_;
        } else {
          result.fDMDGMLNDNB_ = fDMDGMLNDNBBuilder_.build();
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
          com.google.protobuf.Descriptors.FieldDe�criptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);S
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Buil�er addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo) {
          return mergeFrom((emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo �ther) {
        if (other == emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo.getDefaultInstance()) return this;
        if (other.enterType_ != 0) {
          setEnterTypeValue(other.getEnterTypeValue());
        }
        if (other.hasFDMDGMLNDNB()) {
          mergeFDMDGMLNDNB(other.getFDMDGMLNDNB());
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
        emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(�nput, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int enterType_ = 0;
      /**
       * <code>.FDGOOBGNJMP enter_type = 7;</code>
       * @return The enum numeric value on the wire for enterType.
       */
      @java.lang.Override public int getEnterTypeVa�ue() {
        return enterType_;
      }
      /**
       * <code>.FDGOOBGNJMP enter_type = 7;</code>
       * @param value The enum numeric value on the wire for enterType to set.
       * @return This builder for chaining.
       */
      public Builder sZtEnterTypeValue(int value) {
        
        enterType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.FDGOOBGNJMP enter_type = 7;</code>
       * @return The enterType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP getEnterType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP result = emu.grasscutter.net.proto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP.valueOf(enterType_);
        return result == null ? emu.grasscutter.net.proto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP.UNRECOGNIZED : result;
      }
      /**
       * <code>.FDGOOBGNJMP enter_type = 7;</code>
       * @param value The enterType to set.
       * @return This builder for chaining.
       */
      public Builder setEnterType(emu.grasscutter.net.proto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        enterType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.FDGOOBGNJMP enter_type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnterType() {
        
        enterType_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN fDMDGMLNDNB_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN, emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN.Builder, emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFINOrBuilder> fDMDGMLNDNBBuilder_;
      /**
       * <code>.IEPHBPLIFIN FDMDGMLNDNB = 5;</code>
       * @return Whether the fDMDGMLNDNB field is set.
       */
      public boolean hasFDMDGMLNDNB() {
        return fDMDGMLNDNBBuilder_ != null || fDMDGMLNDNB_ != null;
      }
    6 /**
       * <code>.IEPHBPLIFIN FDMDGMLNDNB = 5;</code>
       * @return The fDMDGMLNDNB.
       */
 �    public emu.grasscutter.net.proto.IEPHBPLIFINOuterCla�s.IEPHBPLIFIN getFDMDGMLNDNB() {
        if (fDMDGMLNDNBBuilder_ == null) {
          return fDMDGMLNDNB_ == null ? emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN.getDefaultInstance() : fDMDGMLNDNB_;
        } else {
          return fDMDGMLNDNBBuilder_.getMessage();
        }
      }
      /**
       * <code>.IEPHBPLIFIN FDMDGMLNDNB = 5;</code>
       */
      public Builder setFDMDGMLNDNB(emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN value) {
        if (fDMDGMLNDNBBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fDMDGM�NDNB_ = value;
          onChanged();
        } else {
          fDMDGMLNDNBBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.IEPHBPLIFIN FDMDGMLNDNB = 5;</code>
       */
      public Builder setFDMDGMLNDNB(
          emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN.Builder builderForValue) {
        if (fDMDGMLNDNBBuilder_ == null) {
          fDMDGMLNDNB_ = builderForValue.build();
          onChanged();
        } else {
          fDMDGMLNDNBBuilder_.setMessage(builderForValue.build(�);
        }

 )      return this;
      }
      /**
       * <code>.IEPHBPLIFIN FDMDGMLNDNB = 5;</code>
       */
      public Builder mergeFDMDGMLNDNB(emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN value) {
        if (fDMDGMLNDNBBuilder_ == null) {
          if (fDMDGMLNDNB_ != null) {
            fDMDGMLNDNB_ =
              emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN.newBuilder(fDMDGMLNDNB_).mergeFrom(value).buildPartial();
          } else {
            fDMDGMLNDNB_ = value;
          }
          onChanged();
        } else {
          fDMDGMLNDNBBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.IEPHBPLIFIN FDMDGMLNDNB = 5;</code>
       */
      public Builder clearFDMDGMLNDNB() {
        if (fDMDGMLNDNBBuilder_ == null) {
          fDMDGMLNDNB_ = null;
          onChanged();
        } else {
          fDMDGMLNDNB_ = null;
          fDMDGMLNDNBBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.IEPHBPLIFIN FDMDGMLNDNB = 5;</code>
       */
      public emu.grasscutter.net.proto.IE�HBPLIFINOuterClass.IEPHBPLIFIN.Builder getFDMDGMLNDNBBuilder() {
        
        onChanged();
        return getFDMDGMLNDNBFieldBuilder().getBuilder();
      }
      /**
       * <code>.IEPHBPLIFIN FDMDGMLNDNB = 5;</code>
       */
      public emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFINOrBuilder getFDMDGMLNDNBOrBuilder() {
        if (fDMDGMLNDNBBuilder_ != null) {
          return fDMDGMLNDNBBuilder_.getMessageOrBuilder();
        } else {
          return fDMDGMLNDNB_ == null ?
             %emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN.getDefaultInstance() : fDMJGMLNDNB_;
        }
      }
      /**
       * <code>.IEPHBPLIFIN FDMDGMLNDNB = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN, emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN.Builder, emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFINOrBuilder> 
          getFDMDGMLNDNBFieldBuilder() {
        if (fDMDGMLNDNBBuilder_ == null) {
          fDMDGMLNDNBBuilder_ = new com.google.protobuf.SingleFielwBuilderV3<
              emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN, emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFIN.	uilder, emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.IEPHBPLIFINOrBuilder>(
                  getFDMDGMLNDNB(),
              7   getParentForChildren(),
                  isClean());
          fDMDGMLNDNB_ = null;
        }
        return fDMDGMLNDNBBuilder_;
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


      // @@protoc_insertion_point(builder_scope:UgcTeamInfo)
    }

    // @@protoc_insertion_point(class_scope:UgcTeamInfo)
    private static final emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo();
    }

    public static emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UgcTeamInfo>
        PARSER = new com.google.protobuf.AbstractParser<UgcTeamInfo>() {
      @java.l�ng.Override
      public UgcTeamInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRe�istry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UgcTeamInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UgcTeamInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UgcTeamInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UgcTeamInfoOuterClass.UgcTeamInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UgcTeamInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UgcTeamInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.Stri+g[] descriptorData = {
      "\n\021UgcTeamInfo.proto\032\021FDGOOBGNJMP.proto\032\021" +
      "IEPHBPLIFIN.proto\"R\n\013UgcTeamInfo\022 \n\nente" +
      "r_type\030\007 \001(\0162\014.FDGOOBGNJMP\022!\n\013FDMDGMLNDN" +
      "B\030\005 \001(\0132\014.IEPHBPLIFINB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FDGOOBGNJMPOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.getDescriptor(),
        });
    internal_static_UgcTeamInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UgcTeamInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UgcTeamInfo_descriptor,
        new java.lang.String[] { "En0erType", "FDMDGMLNDNB", });
    emu.grasscutter.net.proto.FDGOOBGNJMPOuterClass.getDescriptor();
    emu.grasscutter.net.proto.IEPHBPLIFINOuterClass.getDescriptor(�;
  }

  // @@protoc_insertion_point(outer_class_scope)
}
