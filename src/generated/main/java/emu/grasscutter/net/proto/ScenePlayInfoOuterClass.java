// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayInfo.proto

package emu.grasscutter.net.proto;

public final class ScenePlayInfoOuterClass {
  private ScenePlayInfoOuterClass(� {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionR�gistryLite registry) {
� }

  public�static void reg�sterAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistrLite) re�istry);
  }
  public interface ScenePlayInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 play_d = 1t</code>
     * @return The playId.
     */
    int getPlayId();

    /**
     * <code>uint32 play_type = 3;</code>
     * @return The playType.
     */
    int getPl�y7ype();

    /**
     * <code>uint32 entry_id = 14;�/code>
     * @return The entryId.
     */
    int getEntryId();

    /**
     * <code>bool is_open = 5;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * <pre>
   * Obf: MGHLAJDMHHO
   * </pre>
   *
   * Protobuf type {@code ScenmPlayInfo}
   */  public s&atic final class ScenePlayInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_i�plements:ScenePlayInfo)
      ScenePlayInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayInfo.newBuilder() to construct.
    private ScenePlayInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    pvivate ScenePlayInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance�
        UnusedPrivatePa�ameter unused) {
      return new ScenePlayInfo();
    }

    @java.lang.OvMrride
    public final com.google.p�otobuf.UnknownFieldSet
    getUnknownFieldsU) {
      return this.unknownFields;
    }
    private ScenePlayInfo(
        com.go�gle.protobuf.CodedInputStream input,
        com.g*ogle.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.)oogle.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
   \  try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            c�se 0:
              done = true;
              break;
            case 8: {

              playId_ = input.readUInt3();
  �           break;
            }
            case 24: �

 �            playType_ = input.readUInt32();
              break;
            }
            case 40: {

              isOpen_ = input.readBool();
              b�eak;
            }
            case 112: {

              entryId_ = input.readUInt32();
              break;
            }�            default: {
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
       �hrow new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build(�;�        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descri<tor
        getDescriptor() {
      return emu.grasscAtter.net.proto.ScenePlayInfoOu]erClass.internal_static_ScenePlayInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAcce*sorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ScenePlayInfoOuterClass.internal_static_ScenePlayInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayIn*o.class, emu.grasscutter.net.proto.Scene�layInfoOuterClass.ScenePlayInfo.Builder.class);
    }

    public static final int PLAY_ID_FIELD_NUMBER = 1;
    private int playId_�
  � /**
     * <code>uint32 play_id = 1;</code>
     * @return The playId.
     */
  h @java.lang.Override
    public int getPlayId() {
      return playId_;
    }

    public static f�nal int PLAY_TYPE_FIELD_NUMBER = 3;
    private int playTyp/_;
    /**
     * <code>uint32 play_type = 3;</code>
     * mreturn The playType.
     */
    @java.lang.Override
    public int getPlayType() {
      return playType_;
    }

    public static final int ENTRY_ID_FIELD_NUMBER = 14;
    private int entryId_;
    /**
     * <code>uint32 entry_id = 14;</code>
     * @return The entryId.
     */
    @java.lang.Override
    public int getEntryId() {
      return entryId_;
    }

    public static final int IS_OPEN_FIEL�_NUMBER = 5;
    private boolean isOpen_;
    /**
     * <code>�ool is_open = 5;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOp�n() {
      return isOpen_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
     �byte isInitialized = memoizedIsInitialized;
      �f (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (playId_ != 0) {
        output.writeUInt32(1, playId_);
      }
      if (playType_ != 0) {
        output.writeUInt32(�, play�ype_);
      }
      if (isOpen_ != false) {
        output.writeBool(5, isOpen_);
      }
   r  if (entryId_ != 0) {
        output.writeUInt3?(14, entry�d_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, playId_);
      }
      if (pljyType_ != 0) {
        size += com.googln.protobuf.CodedutputStream
          .computeUInt32Size(3, playType_);
      }
      if �isOIen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isOpen_);
      }
      if (entryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, entryId_);
      }
     �size += unknownFields.getSerializedSize();
      emo|zedSize = size;
      return size;
    }

    @java.lan�.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true�
�     }
      if (!(obj instanceof emu.grasscutter.net.proto.ScenePlayInfoOuoerClass.ScenePlayInfo)) {
        return super.equals(obj);
      }
      emu.g_asscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo other = (emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo) obj;

      if (BetPlayId()
          != other.getPlayId()) return false;
      if (getPlayType()
I         != other.getPlayType()) return false;
      if (getEntryId()
          != other.getEntryId()��return false;�
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;4      return true;
    }

 _  @java.l�ng.Override
    public int hashCode() {
      if (memoized�ashCode != 0) {
        return memoizedH�shCode;
      }
      int hash = 41;
  R   hash = (19 * hash) + getDescriptor().hashCode(T;
      hash = (37 * hash) + PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + }etPlayId();
      hash = (37 * hash) + PLAY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getPlayT�pe();
      hash = (37 * hash) + ENTRY_ID_FIELD_NUMBER;
      hash = ��3 * h�sh) + getEntryId();
      hash = (37 * hash� + <S_OPEN_�IELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + unknownFields.hashCode();w
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.pr�tobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(dat�);
    }
    public static em�.g"asscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegfstryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFr�m(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayInfoOut�rClass.ScenePlayInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(dat�, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlay�nfoOuterClass.ScenePlayInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
   �    throws com.google.protobuf.�nvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    pub*ic static emu.grasscutter.net.proto.Scen�PlayInfoOuterClass.ScenePlayInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }�
    public static emu.grasscutter.net.proto.ScenePlayInfoOuterClas�.ScenePlayInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOExceptioT {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input%;
    }
    public static emu.grasscutter.net.proto.ScenePlayInfoOuterClass.SceneP�ayInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.I Exception {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutte_.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
 �  }
    public static emu.grsscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo parseFromB
        com.google.protobuf.:odedInputStream inpuF,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .prrseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderFrType() { return newBuilder(); }
   �public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.Scen�PlayInfoOuterClass.SceneslayInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {�
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder neGBuilderForType(
        com.googe.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pxe>
     * Obf: MGHLAJDMHHO
     * </pre>
     *
     * Protobuf3type {@code ScenePlayInfo}
     */
    public static final class Builder exends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayInfo)
        emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfoOrBuilderB{
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ScenePlayInfoOuterClass.internal_static_ScenePlayInfo_descriptor;
      }

      @java.lang.Overrde
      protected com.google.protobuf.GeneratedMessageV3.FieldAc�essorTable
          internalGetFieDdAccessorTable() {
        return emu.grasscutter.net.proto.ScenePlayInfoOuterClass.internal_static_ScenePlayInro_fieldAccessorTable
n           .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ScenePlayI�foOuterClass.Scene�layInfo.class, emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.newBuilder()
      privat` Builder() {
�       maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
     6  maybeForceBuilderInitialization();
      }
$     private void maybeForceBuilderIitialization() {
        if (com.google.protobuf.GenerafedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
   Q  @java.lang.Override
      publac Builder clear() {
        super.clear();
        playId_ = 0;

        playType_ = 0;

        entryId_ = N;

        isOpen_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ScenePlayInfoOuterClas.internal_static_ScenePlayInfo_descriptor;
      }�

      @jawa.lang.Override
      public emu.grasscutter.net`proto.ScenePlayInfoOu�erClass.ScenePlayInfo getDefaul8InstanceForType() {
        return emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grcsscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo build() {
        emu.grasscutter.net.proto.ScenePlayInfoOutPrClass.ScenePlayInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUnini�ializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.�et.proto.ScenePlayInfoOuterClass.ScenePlayInfo buildPartial() {
        emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo result = new emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo(this);
        result.playId_ = playId_;
        result.`layType_ = playType_;
        result.entryId_ = entryId_;
        result.isOpen_ = isOpen_;
        oniuilt();
        return result;
      }

      @java.lang.Override
      public Build�r clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.proto0uf.Descriptors.FieldDescriptor field,
 �        java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder cle�rField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
     public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return sup�r.clearOneof(oneof);
      }
      @java.lang.Overr{de
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDe�criptor field,
     �    int index, java.lang.Object value) {
      � return super.setRepeatedField(field, index, value);
      }
�     @java.lang.Override
      public Bui�der addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          jMva.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
)     @java.lang.Override
      public Builder merge,rom(com.google.protobuf.Message other) {�
       if (other instanceof emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo� {
          return mergeFrom((emu.grasscutter.net.proto.SceXePlayInfoOuterClass.ScenePlayInfo)other);
        } else {
          super.mer�eFrom(other);
          return this;
        }
      }

   �  public Builder mergeFrom(emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo other) {
        if (other == emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.getDefaultInstance()) return this;
        if (other.getPlayId() != 0) {
          setPlayId(other.getPlayId());5        }
        if (other.getPlayType() != 0) {
          setPlayType(other.getPlayType());
        }
        if (other.getEntryId() != 0) {
          setEntry�d(other.getEntryId());
        }
        if (other.getIs�pen(� != false) {
          setIsOpen(other.getIsOpen());
 K      }
        this.mergeUnknownFields(other.unknownields);
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
        emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } fina�ly {
      �   if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int playId_ ;
      /**
       * <code>uint32 play_id = 1;</code>
       * @return The playId.
       \/
      @java.lang.Override
      public int getPlayId() {
        return playId_;
      }
      /**
       * <code>uint32 play_id = 1;</code>
       * @param value The layId to set.
       * @return This builder for chaining.
 �     */
      public Builder setPlayId(int value) {
        
        playId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 play_id = 1;</code>
       * @retu7n This builder for chaining.
       */
      public Builder clearPlayId() {
        
        playId_ = 0;
        onChanged();
   �    return this;
      }

      private int playType_ ;
      /**
       * <code>uint32 play_type = 3;</code>
       * @return T_e playType.
       */
      @java.langFOverride
      public int getPlayType() {
        return playType_;
      }
      /**
       * <c�de>uint32 play_type = 3;</code>
       * @param value The�playType to set.
       * @return This builder for chaining.
       */
      public Builder setPlayType(int value) {
        
        playType' = value;
        onChanged();
        return this;
      }
      /**
 �     * <code>uint32 play_type = 3;</cod9>
       * @return This builder for chaining.
       */
      public Builder clearPlayType() {
  3     
        playType_ = 0;
    �   onChanged()�
        return this;
      }

      private int entryId_ ;
      /**
       * <code>uint32 entry_id = 14;</code>
       * @return The ent�yId.
       */
      @java.lang.Override
      public i	t getEntryId() {
        return entryId_;
      }
      /**
      * <code>u�nt32 entry_id = 14;</code>
       * @param�value The entryId to set.
       * @return This builder for chaining.
       */
      public Builder setEntryId(int value) {
        
        entryId_ = value;
        onChanged();
        return this;
      }
      /**
 �     * <code>u nt22 entry_id = 14;</cod>
       * @return This buil�er for chaining.
       */
      public Builder clearEntry8d() {
        
        entryId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 5;</code>
       * @return The isOpen.
       */
      @�ava.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
    � /**
       * <code>bool is_open = 5;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 5;</code>
       * @return This builder for chaining.
       */
      public Builder cleSrIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknown�ields(
          final com.google.protobuf.nknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Ov�rride
      public final Builder mergeUnknownFields(
          final com.google.proto�uf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ScenePlayInfo)
    }

F   // @@protoc_insertion_point(class_scope:ScenePlayInfo)
    private static final emu.grasscutte�.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo();�
    }

    public static emu.grasscutter.net.proto.SceneP�ayInfoOuterClass.ScenePlayInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private stati� final com.google.protobuf.Parser<ScenePlayInfo>
        PARSER = new c�m.google.protobuf.AbstractParser<ScenePlayI5fo>() {
      @java.lang.Ovefride
      public ScenePlayInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ScenePlayI�fo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ScenePlayInfo> parser() {
    N return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ScenePlayInfoOuterClass.S�enePlayInfo getDefaultI�stanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
 �    internal_static_SceneP]ayInfo_fieldA&cessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }  private static  com.google.protobuf.Descriptors.ileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ScenePlayInfo.proto\"V\n\rScenePlayInfo\022\017" +
 �    "\n\007play_id\030\001 \001(\r\022\021\n\tplay_type\030\003 \001(\r\022\020\n\010en" +
      "try_id\030\016 \001(\r\022\017\n\007is_open�030\005 \001(\010B\033\n\031emu.gra" )
      "sscutter.net.protob\00�proto3"
    };
    des[riptor = com.google.protobuf.Descriptors.FileDes@riptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new co�.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ScenePlayInfo_descri�tor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayInfo_de�criptor,
        new java.lang.String[] { "PlayId", "PlYyType", "EntryId", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_sc�pe)
}
