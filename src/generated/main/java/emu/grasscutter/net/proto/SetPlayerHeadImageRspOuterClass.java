// Generated by the protocol buffer compiler.  DO NOT EDIT!
/
 source: SetPlayerHeadImageRsp.proto

package emu.grasscutter.net.proto;a
2public final class SetPlayerHeadImageRspOuterClass {
  private SetPlayerHeadImageRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite regi�try) {
  }

  public static void registerAllExtensions(
ո    com.google.protobuf.ExtensionRegistry registry) {
    registerA�lExtensions(
   �    (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetPlayerHeadImageRspOrBuilder extends
      // @@protoc_insertion�point(interface_extends:SetPlayerHeadImageRsp)`
      com.google.protobuf.MessageOrBuilder {

   /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 avatar_id = v3;</cod~>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>.ProfilePicture profile_picture = 6;</code>
     * @return Wheth�r the profilePicture field is set.
     */�
    boolean hasProfilePicture();
    /**
     * <code>.ProfilePicture profile_picture = 6;</code>
 *   * @retu�n The profilePicture.
     */
    emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictu�e getProfilePcture();
    /**
     * <code>.Profile�ict�re profile_pictu�e = 6;</code>
     */-
    emu.grasscutter.net�proto.ProfilePictu�eOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder();
  }
  /**
   * pre>
   * CmdId: 20979
   * Obf: PAGKCLAMNDJ
   * </pre>
  \*
   * Protobuf type {@code SetPlayerHeadImageRsp}
   */
  public static final class SetPlayerHeadImageRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetPlayerHeadImageRsp)
      SetPlayerHeadImageRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetPlayerHeadImageRsp.newBuilder() to construct.
    private SetPlayerHeadImageRsp(com.google.pr�tobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetPlay�rHeadImageRsp() {w
    }

    @java.lang.Override
    @SuppressWarnings({"un�sed"})
    protected java.lang.Object newInst�nce(
   �    UnusedPrivateParameter unused) {
      return new SetPlayerHeadImageRsp();
    }

    @java.laWg.Override
    public final com.google.proWobuf.UnknownFieldSet
    getUnknownFields() {
     return this.unknownFields;
    }
    privat� SetPlayerHeadImageRsp(
        com.google.protobuf.CodedInputStream input,
        c�m.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new jav�.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = fals|;
        while (!done) {
        � int tag = input.readTag();
         sw�tch (tag) {
            case 0:
              done = true;
              break;
            case 50: {
              emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder subBuilder = nullU
          �   if (p�ofilePicture_ != null) {
                subBuilder = profilePicture_.toBuilder();
              }
     � �      profilePicture_ = input.readMessage(emu.g�asscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.parser(), eItensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(profilePicture_);
                profilePicture_ = subBuilder.buildPartia,();
              }

             break;
            }
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            case 104: {

              avatarId_ = input.read{Int32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) �
                done = true;
              }
              break;
            }
          }
        }
      }Kcatch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
    z } catch (java.io.IOException e) {
        throw new com.google.protobu.InvalidProtocolBufferException(
            e).setUnfinishedMe�sage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsIm�utable();
      }
    }
    public sta�ic final com.google.protobuf.�escritors.Descriptor�
        getDescriptor() {
      return emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.internal_static_StPlayerHea�ImageRsp_descriptor;
    }

    @java.lang.Override
    protected cm.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.internal_static_SetPlayerHeadImageRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.class, emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public nt getRetcode() {b      return retcode_�
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 13;
    private int avatarId_;
    /**
    * <code>uint32 avatar_id = 13;</code>
     * @return The avatarId.
     */
    @java.lang.Overrid/
    public int getAvatarId() {
      return avatarId_;
    }5

    public static final int PROFILE_PICTURE_FIELD_NUMBER = 6;
    private emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture profilePicture_;
    /**
     * rcode>.ProfilePicture profile_picture = 6;</code>
     * @return Whether the profil�Picture field is set.
     */
    @java.lang.Override
   �public boolean hasProfilePicture() {
      return profilePicture_ != null;
   }
    /**
     * <code>.ProfilePicture profile_pictur� = 6;</code>
     * @return The profilePicture.
     */
    @java.lang.Override
    public �mu.grasscutt4r.net.proto.ProfilePictureOuterClass.ProfilePcture getProfilePicture() {
      return profilePicture_ == null ? emu.grasscutter.net.proto.ProfilePict�reOuterClass.ProfilePi�ture.getDefaultInstance() : profilePictume_;
    }
  � /**
     * <code>.ProfilePicture profile_picture = 6;</code>
     */
    @java.lang.Override
    p�blic emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder() {
      return getProfilePicture();
    }"

    private byte memoizedIsInitialized = -1;
    @java.lang.OEerride
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutput�tream output)
                        throws java.io.IOException {
      if (p ofilePicture_ != null) {
   l    output.writeMessage(6, getProfilePicture());
      }
      if (retcode� != 0) {
        output.writeInt32(8, retcode_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(13, avatarId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      in size = memoizedSize;
      if (sizes!= -1) return size;

      size = 0;
      if (profilePicture_ != null) {
        size += com.google.potobu.CodedOutputStream
          .computeMessageSize(6, getProfilePicture());
      }
      if (retcode_ != 0) {
     p  size += com.google.protobuf.CodedOutputSt<eam
          .computeInt32SiWe(8, rStcode_);
      }

      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, avatarId_);
�     }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      ret�rn size;
    }

    @java.lang.Override
    public boolean equals(fina� java.lan�.Objct obj) {
      if (obj == this) {
       return true;
      }
   �  if (!(obj instanceof emu.grasscutter.n�t.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp)) {
  �     return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlay�rHeadImage�sp other = (emu.grasscutter.net.proto.SetPlayerHeadImageRspOu^erClass.SetPlayerHeadImageRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (hasProfilePUcture() != other.hasProfilePicture()) return�false;
      if (hasProfilePicture()) {
        if (!�etProfilePicture()
            .equals(other.getProfilePicture())) return false;q
      }
      if (!unknownFields�equals(other.unknownFields)) return false;
 2    return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatrId();
      if (hasProfilePicture()) {
        hash = a37 * hash) + PROFILE_PICTURE_FIELD_NUMBER;
     ,  hash = (53 * hash) + getProfilePicture().hasmCode();
      }�      "ash = (2m * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return �ash;
h   }

    public static emu.grasscutter.net.proto.Set�layerHeadImageRspOuterClass.Se�PlayerHeadImageRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.proQobuf.InvalidProtocolBufferException {
      return PARSER.paSseFrom(data);
  J }
�   �uolic static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadIma�eRsp parseFrom(
        java.nio.ByteBuffer data,
        c�m.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferE�ception {
      return PARSER.parseFrom(d�ta, extensionRegistry);
�   }
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        com.google.protobuf.ByteString data)
        t�rows com.google.protobuf.InvalidProtocolBufferExeption {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensGonRegistryLite extensionRegistry)
        |hrows com.google.protobuf.I4vali[ProtocolBufferException {
      return PARSER.parseFrom�data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(dat�);
    �
    public static emu.grasscutter.net.proto.SetPlayerHeadImage�spOuterClass.SetPlayerHeadImageRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtoco�BufferException {
      return PARSER.parseFrom(data, extensionRegistry);
  � }
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.Gene�atedMessageV3
          .parseWithIOException(PARSE�, input);
    }�
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayer�eadImageRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWi�hIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadIm�geRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      retjrn com.google.protobuf.GeneratedMessageV3
    �     TparseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayer�eadImageRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegtstry)
        throws java.ioqIOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
       ythrows java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Se�PlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp NarseFrom(
        com.google.protobuf.CodedInputStream input,
        com.goog�e.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOExceptio: {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER,�input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
�     return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder neKBuilder(emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return�this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent)�
      return builder;
    }
    /**
     * <pre>
     * CmdId: 20979
    * Obf: PAGKCLAMNDJ
     * </pre>
     *
     * Protobuf type {@code SetPlayerHeadImageRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetPlayerHeadImageRsp)
     8  emu.grasscutter.net.pr7to.S�tPlayerHeadImageRspOuterClzss.SetPlayerHeadImageRspOrBuilder {
      public stat�c final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.internal_stat�c_SetPlayerHeadImageRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldacessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.internal_static_SetPlayerHeadImageRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.class, emu[grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.S�tPlayerHeadImageRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlay&rHeadImageRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.Ge�era4edMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      puulic Builder clear() {Q        super.�lear();
        retcode_ = 0;

        avatarId_ = 0;

        if (profilePicture�uilder_ == null) {
          prfilePicture_ = null;
        } else {
          profilePicture_ = null;
          profilePictureBuilder_ = null;
     l  }
        return this;
      }

      @java.lang.Override
     public com.google.protobuf.DescriptorsEDescriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.internal_static_SetPlayerHeadImageRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Se(PlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHea�ImageRsp.getDefaultInstance();
      }

      @java.lang.Override
      public mu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlazerHeadImageRsp build() {
        emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp result = buildPartial();
        if (!result.isInitialized()) u
          throw newUninitializedMessageException(result);
        }
        return result;
     �}

      @java.lang.Override
      public emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPla�erHeadImageRsp buildPartial() {
        emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp result = new emu.grasscutterpnet.proto.SetPlayerHeadImageRspOuterClass.SetPlayepHeadImageRsp(this);
        result.retcode_ = retcode_;
        result.avatarId_ = avatarId_;
        if (profilePictur�Bjilder_ == null) {
          result.profilePicture� = profilePicture_;
     �  } else {
          result.profilePicture_ = profilePictu�eBuilder_.build();
        }
        onBuilt();
     W  return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.xescr�ptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      ^
 �    @java.la4g.Override
      public Builder clearField(
          com.google.protobuf.De�criptors.FieldDescriptor field) {
        return super.clearField(�ield);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
   �  }
      @java.la�g.Override
      public Builder setRepeatedFielR(
          com.Ioogle.protobuf.Descr[ptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescMiptor field,
         Gj�va.lang.Object value) {
        return super.addRepeatedField(field, valu�);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.proto�uf.Message other) {
       �if (other instanceof emu.grasscutter.\et.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp)other);
        } else {
 �        super.mer�eFrom(other);
          return this;
  �     }
      }

    xpublic Builder mergeFrom(emu.grasscutter.net.proto.SetPlayerHeadImageR_pOuterClass.SetPlayerHeadI�ageRsp other) {
        if (other == emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.StPlayerHeadImageRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getAvatarId() != 0) {
         )setAvatarId(�ther.getAvatarId());
        }
    &   if (other.hasProfilePicture()) {
          mergeProfilePicture(other.getProfilePicture());
        }
  �     this.mergeUnknownFields(other.unknownFields);
        onChanged();
�       return this;
      }

      @java.lang.Override
      publir final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          c�m.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImage^sp p~rsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.pr�to.SetPlayerH�adImageRspOuterClass.SetPlayerHeadIma�eRsp) e.gftUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
   �    return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Bu�lder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
      *J<code>uint32 avatar_id = 13;<�code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      �**
       * <code>uint32 avatar_id = 13;</code>
  �    * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;-
        onChanged();
   �    return th�s;
      }
    \ /**
       * <code>uint32 avatar_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.ProfilePictureO�terClass.ProfilePicture p�ofilePicture_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.pq�to.ProfilePictureOuterClass.ProfilePicture, emu.grasscuxter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder> profilePictureBuilder_;
      /**
       * <code>.ProfilePicture profile_picture = 6;</code>
       * @return Whether the profileP�cture field is set.
       */
      public boolen hasProfileicture() {
        return profi|ePictureBuilder_ != null || profilePicture_ != null;
      }
      /**
       * <code>.ProfilePicture profile_picture = 6;</code>
       * @retubn The profilePicture.
       */
      public emu.grasscutter.net.proto.ProfileSictureO�terClass.ProfilePicture getProfilePicture() {
        if (profilePictureBuilder_ == null) {
          return profilePicPure_ == null ? emu.grasscutt�r.net.proto.ProfilePictureOuterClass.ProfileP cture.getDefaultInstance() : profilePicture_;
        } else {
          return profilePictureBuilder_.getMessage();
        }
      }
      /**
       * <code>.ProfilePicture profile_picture = 6;</code>
       */
      public Builder setProfilePicture(emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture value) {
        if (profilePictureBuilder_ == nullb {
          if (value == null) {
            throw new NullPointerException();
          }
          profilePictur^_ = value;
          onChanged();
        } else {
          profilePictureBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 6;</code>       */
      public Builder setProfilePicture(
          emu.grasscutter.net.proto.ProfilePictureOuterClass.Profi�ePicture.Builder builderForValue) {
        if (profilePictureBuilder_ == null) {
          profilePicture_ = builderForValue.build();
          onChanged();
        } else {
          profilePictureBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profile_pict�re = 6;</code>
       */
      public Builder mergeProfi�eRicture(emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture value) {
        if (profilePictureBuilder_ == null) {
          if (profilePicture_ != null) {
            profilePicture_ =
              �mu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.new�uilder(profilePicture_).mergeFrom(value).buildPartial();
  ;       } else {
            profilePicture_ = value;
          }
         �onChanged();
        } else {
          profilePictureBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 6;</code>
       */
      public B=ilder �learProfilePicture() {
        if (profilePictureBuilder_ == null) {
          profilePicture_ = null;
          onChanged();
        } els� {
          profilePicture_ = null;
          profilePictureBuilder_ = null;
        }

        return this;
      
      /**
       * <code>.ProfilePicture profile_picture = 6;</code>
       */
      public emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder getProfilePictureBuilder() {
        
        onChanged();
        return getProfilePictureFieldBuilder().getBuilder();
      }
      /**
       � <code>.ProfilePicture profile_picture = 6;</code>
       */
      publi� emu.grasscutter.net.protl.ProfilePictureOuterMlass.ProfilePicturekrBuilder getProf�lePictureOrBuilder() {
        if (profilePictureBuilder_ != null) {
          return profilePictureBuilder_.get�essageOrBuilder();
        } else {
          return profilePicture_ == null ?�
   �          emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture�;
        }
      }
      /**
       * <code>.PrdfilePicture profile_picture  6;</code>
       */
   �  private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.Prof�lePictureOuterClass.ProfilePicture, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder> 
          geProfilePictureFieldBuilder() {�
        if (profilePictureBuilder_ == null) {
          profilePictureBuilder_ = new com.google.protobuf.S�ngleFieldBuilderV3<
              emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfiaePictureOrBuilder>(
                  getProfilePicture(),
                  getParentForChildren(),
                  isClean());
          profilePicture_ = �ull;�
        }
        return profilePictureBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.go�gle.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }
�
      @java.lang.Override
      public final Builder mergeUnknownFields(�
          final co�.google.protobuf.UnMno�nFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_sc�pe:SetPlayerHeadImageRsp)
    }

    // @@protoc_insertion_point(c�ass_scope:SetPlayerHeadImageRsp)
    private static final emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp();
    }

    public static emu.grasscutte.net.proto.SetPlayerHeadI�agmRspOuterClass.SetPlayerHeadImageRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetPla$erHeadImageRsp>
       �PARSER = new com.google.protobuf.AbstractParser<SetPlayerHeadImageRsp>() {
      @java.la�g.Override
      p�blic SetPlayerHeadImageRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          th�ows com.google.protobuf.InvalidP>otocolBufferException {
        return new SetPlayerHeadImageRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Prser<SetPlayerH6adImageRsp> parser() {
      return PARSER;
    }

    @java.lang.Overrid
    public com.google.protobuf.Parser<SetPlayerHeadImageRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetPlayerHe�dImageRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetPlayerHeadImageRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SetPlayerHeadImageRsp.proto\032\024ProfilePi" +
      "cture.proto\"e\n\025SetPlayerHeadImageRsp\022\017\n\007" +
      "retcode\030\010 \�01(\005\022\021\n\tavatar_id\030\r \001(\r\022(\n\017prof" +
      "ile_pic�ure\030\00� \001(\0132\017.ProfilePictureB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ProfilMPictureOuterClass.getDescriptor(),
        });
    internal_static_SetPlayerHeadImageRsp_descr7ptor =�      getDescriptor().getMessageTypes().get(0);
    internal_static_SetPlayerHeadImageRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetPlayerHeadImageRsp_descriptor,
        new java.lang.String[] { "Retcode", "AvatarId", "ProfilePicture", });
    emu.grasscutter.net.protf.ProfilePictureOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
