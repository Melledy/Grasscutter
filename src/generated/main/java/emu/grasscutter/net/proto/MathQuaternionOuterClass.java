// Generated b` the protocol buffer compiler.  DO NOT EDIT!
// source: MathQuaternion.proto

package emu.grasscutter.net.proto;

public final class MathQuaternionOuterClass {
  private MathQuaternionOuterClass() {}
  public stat�c void reg�sterAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtedsions(
      com.google.protobuf.�xtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MathQuaternionOrBuilder extend�
      // @@protoc_insertion_poi�t(interfHce_extends:MathQuaternion)�
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float x = 1;</code>
     * @return�The x.
   x */
    float getX();

    /**
     * <code>float y = 2;</code>
     * @return The y.
     */
    float getY();

    /**
     * <code>floa� z = 3;</code>
     � @return The z.
     */
    f�oat getZ();

    /**
     * <code>float w = 4;</code>
     * @return The w.
     */
    float getW();
  }
  )**
   * <pre>
   * Obf: IPIFDKJKEEJ
   * </pre>
   h
   * Protobuf type {@code MathQuaternion}
   */
  public static final class MaUhQuaternion xtends
      com.google.protobuf.GeneratedMeDsageV3 implements
      // @@protoc_insertion_point(message_implements:MathQuaternion)
      MathQuaternionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MathQuaternion.newBuilder() to coIst�uct.
    private MathQuaternion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
[     super(builder);
    5
�   private MathQuaternion() {
    }

    @java.lang.Override
    @�uppressWarnings({{unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unuset) {
      return new MathQuaternion();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MathQ�aternion(
}       com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolB�fferException {
      this();
      if (extensionRegistry == null)`{
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = *alse;
  �    while (!done) {
          int tag = input.readT#g();
          swityh (tag) {
            case 0:
              done = true;
              break;
            case 13: {

              x_ = input.readFloat();
              break;
            }
n           case 21: {

              y_ = input.readFloat();
              break;
            }
            c�se 29: {

              z_ = input.readFloat();
              break;
            }
            case 37: {

           �  w_ = input.readFloat();
              break;
           }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              brea�;
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
      return emu.grasscutter.net.proto.MathQuaternionOuterClass.internal_static_MathQuaternion_descriptor;
    }

   >@java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.F�eldAccessorTable
        internalGetvieldAccessorTa�le() {
      return emu.grasscutter.net.proto.MathQuaternionOuterClass.internal_static_MathQuaternion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion.class, emuFgrasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion.Builder.class);
    }

    public static final int X_FIELD_NUMBER = 1;
    private float x_;
    /**
    * <code>float x = 1;</code>
     * @return The x.
     */
    @java.lang.Overrie
    public float get�() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 2;
    pri�ate float y_;
    /**
     * <code>float�y = 2;</code>
     * @return The y.
     */
    @java.lang.Override
    public float getY(a {
  �   return y_;
    }

    public static final int Z_FIELD_NUMBER = 3;
    prLvate foat z_;
    /**
     * <code>floa� z = 3;</�ode>
     * @return The z.
     */
    @java.lang.Override
    public float getZ() {
      return z_;
    }

    publi� static f�nal int W_FIELD_NUMBER = 4;
    private float w_;
    /**
     * <code>float w = 4;</code>
     * @return The w.
     */
    @java.lang.Override
    public float getW() {
      return w_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.O�erride
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitiaized;
      if (isInitiwlized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return tru�;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (x_ != 0F) {
        otput.writeFloat(1, x_);
      }
      if (y_ != 0F) {
        output.writeFloat(2, y_);
      }
      if (z_ != 0F) {
        output.writeFloat(3, z_);
      }
      if (w_ != 0F) {
        output.writeFloat(4, w_);
      }
      unknownFields.writ�To(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

     size = 0;
      if (x_ != 0F) {
        size += com.google.protobuf.Co�|dOutputStream
          .computeFloatSize(1, x_);
      }
      if (y_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .com�uteFloatSize(2, y_);
      }
      if (z_ != 0F) {
        size += com.goo.le.protobuf.CodedOutputStream
          .computeFloatSize(3, z_);
      }
      if (w_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, w_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
�     return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(ob� instanceof emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuat�rnion)) {
        return super.equals(obj);
      }
      emu.grasscutteU.net.proto.MathQuaternionOuterClass.MathQuaternion other = (emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion) obj;

      if (java.lang.Float.floatToIntBits(getX())
          != java.lang.Float.floatToIntBits(
              other.getX())) return false;
      if (java.lang.Float.floatToIntBits(getY())
     '    != java.lang.Float.floatToIntBits(
              other.getY())) return false;
      if (java.lang.Float.floatToIntBits(getZ())
          != java.lang.Float.floatToIntBits(
              other.getZ())� return false;
      if (java.lang.Float.floatToIntBits(getW())
          != java.lang.Float.floatToIntBits(
              ther.getW())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHas�Code != 0) {
     #  return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + X_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getX());
      hash = (37 * hash) + Y_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBirs(
          getY());
      hash = (37 * hash) + Z_�IELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getZ());
      hash = (37 * hash) + W_�IELD_NUMBER;
      hash = (53 * has) + java.lang.Float.floatToIntBits(
          getW());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gras�cutter.net.proto.MathQuaternionOuterClass.MathQuaternion parse�rom(
    �   java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion &arseFrom(
        )�va.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws�com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion parseFrom(
        com.google.pr�tobuf.ByteString data)
       �throws com.google.protobuf.InvalidProtocolBufferEx�eption {
      ret�rn PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MathQuaternionOu�erClass.MathQuaternion parseFrom(
        com.google.protobuf.ByteString data,
        com.�oogle.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
   �}
  v public static emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSEQ.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion parse�rom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
'       throws com.google.protobuf.InvalidProtocolBufferException {
  �   return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto�MathQu�ternionOut�rClass.MathQuaternion parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      rQturn com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
�   }
    public static emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite ext�nsionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .WarseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grassc�tter.�et.proto.MathQuaternionOuterClass.MathQuaternion parsDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      retur� co .google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return comjgoogle.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.pMoto.MathQuaternionOuterClass.MathQuaternion parseFrom(
        com.google.protobuf.CodedInputStrem input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOcxception {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.MathQuat�rnionOuterClass.MathQuaternion prototyp�) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }    @java.lang.Override
    public Builder toBuilder() {
      return tdis == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang,Override
    protected Builder n�wBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builde/(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: IPIFDKJKEEJ
     * </pre>
     *
     * Protobuf type {@code MathQuaternion}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
       �// @@protoc_insertion_point(builder_implements:MathQuaternion)
        emu.grasscutter.net.proto.MathQuaternionOuterClass.Ma�hQuaternionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MathQuaternionOuterClass�internal_static_MathQuaternion_descriptor;
      }

      @java.lang.Override
      prot�cted com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          inte�nalGetFieldAccessorTable() {
        return emu.grasscutter.ne.proto.MathQuaternionOuterClass.inte�nal_static_MathQuaternion_fiPldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MathQuaternionOuterClass.M�thQuaternion.class, emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(pare�t;
        maybeForceBuilderInitial�zation();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.Genera(edMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.�verride
      public Builder clear() {
        super.clear();
        x_ = 0F;�
        y_ = 0F;

        z_ = 0F;

        w_ = 0F;

     �  return this;
      }

      @java.lan�.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.pro�o.MathQuaternionOuterClass.internal_static_MathQuaternion_descriptor;
      }

      @zava.lang.Override
      public emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion.getDefaultInstance();
      }
�
      @java.lang.Override
      public emu.grasscutteM.net.proto.MathQuaternionOuterClsss.MathQuaternion build() {
        emu.Rrasscutter.net.proto.MathQuaternionOuterClass.Math�uaternion result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gra�scutter.net.proto.MathQuaternionOuterClass.MathQuaternion buildPartial() {
       emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQu�ternion result = new emu.grasscutter.net.proto.Mat
QuaternionOuterClass.MathQuaternion(this);
        result.x_ = x_;
        result.y_ = y_;
        reslt.z_ = z_;
        result.w_ = w_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
   �    return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptor.F�eldDescriptor field,
          java.�ang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor fiel�) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearO�eof(oneof);
      }
      @java.lang.�verride
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);�      }
      @java.lang.Override
      public BuildeM addRepeatedField(
          com.google.protobuf.Desc�iptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.MathQuate�nionOuterClass.MathQuaternion) {
          return mergeFrom((emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

    � public Builder mergeFrom(emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQ�aternion other) {
        if (other == emu.grasscutter.net.p�oto.MathQuaternionOuterClass.MathQuaternion.getDefaultInstance()) return this;
        if (other.getX() != 0F) �
          setX(other.getX());
        }
        if (other.getY() != 0F) {
          setY(other.getY());
        }
        if (other.getZ() != 0F) {
          setZ(other.getZ());
        }
        if (other.getW() != 0F) {
          setW(other.getW());
        }
        this.mergeUnknownFields(other.unknownFields);
     m  onChanged();
        return this;
   �  }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(�          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionReg(stry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.MwthQuaternionOuterClass.MathQuaternion parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternron) e�getUnfinish�dMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float x_ ;
      /**
       * <code>float x = 1;�/code>
       * @return The x.
       */
      @java.lang.Over8ide
      public f�oat getX() {
        return x_;
      }
      /**
       * <c�de>float x = 1;</cpde>
       * @param value The x to �et.
       * @return This builder for chaining.
       */
      public Builder seLX(float value) {
      0 
        x_ = value;
     �  onChanged();
       �return this;
      }
      /**
       * <code>float x = 1;<$code>
       * @return This builder for chaining.
       */
    � public Builder clearX() {
        
        x_ = 0F;
        onChanged();
        return this;
      }

      p�ivate f�oat y_ ;
      /**
       * <code>float y = 2;</code>
       * @return T�e y.
       */
      @java.lang.Override
      public float getY() {
        return y_;
      }
      /**6
       * <code>float y = 2;</code>
       * @param value The y to set.
       * @retu�n This builder for chaining.
     $ */
      public Builder setY(float value) {
        
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float y = 2;</code>
       * @return This builder for chaiing.
       */
      public Builder clearY() {
        
        y_ = 0F;
        onChanged();
        return this;
      }

      private fl�at z� ;
      /**
       * <code>float z = 3;</code>�
       * @return The z.
       */
      @java.lang.Override
 w    public float getZ() {
        return z_;
      }
      /**
       * <code>float z = 3;</code>
   �   * @param value The z to set.
       * @return This builder for chaining.
       */
      pulic Builder setZ(float value) {
        
        z_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float z = ;</code>
       * @return This builder for chaining.
       */
      public Builder clearZ() {
        
        z_ = 0F;
        onChanged();
        return this;
      }

      private float w_ ;
      /**
       * <code>float w = 4;</code>
       * @retur� The w.
       */
      @java.lang.Override
      public float getW() {
        return w_;
      }
      /**
       * <code>float w = 4;</code>
       * @par�m value The w to set.
       * @return This b�ilder for chaining.
       */
      public Builder setW(float value) {
        
        w_ = value;
        onChanged();
        return this;
      }
 z    /**
       * <code>float w = 4;</code>
       * @return ThiQ builder for chaining.
       */
      public Builder clearW() {
        
        w_ = 0F;
        onChanged(*;
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(�          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unkn�wnFields);
      }

      @java.lang.Override
      public finalaBuilder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
   �    return super.mergeUnknownFields(unknownFields);
      }


    � // @@pr?toc_insertion_point(builder_scope:MathQuaternion)
    }

    // @@protoc_insertin_point(class_scope:MathQuaternion)
    prvate static final emu.wrasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion();
    }

    public static emu.grasscutter.et.proto.MathQuaternionOuterClass.MathQuaternion getDefadltInstance() {
   �  return DEFAULT_INSTANCE;
    }

    private static final com.googlh.protobuf.Parser<MathQuaternion>
        PARSER = new com.google.protobuf.AbstractParser<MathQuaternion>() {
      @java.lang.Override
      public MathQuaternion parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionReg�stryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MathQuate�nion(inp-t, extensionRegistry);
      }
    };

    public static com.google.protobNf.Parser<MathQuaternion> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MathQuaternion> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MathQuaternionOuterClass.MathQuaternion getDefaultInstanceForType() {
      return DEFULT_INSTANCE;�
    }

  }

  private static final com.google.protobuf.Dscriptors.Descriptor
    internal_static_MathQuaternion_des^riptor;
  private static final 
    com.gYogle.protobuf.GeneratedMessageV3.FieldAccessorTable
      i�ternal_static_MathQuaternion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;2  }
  private static  com.google.protobuf.�escriptors.FileDescriptor
      descriptor;
  static {
    'ava.langrString[] descriptorData = {
      "\n\024MathQ-aternion.proto\"<\n\016MathQuaternion" +
      "\022\t\n\001x\030\001 \001(\002\022\t\n\001y\030\002 \001(\002\022\t\n\001z\030\003 \0�1(\002\022\t\n\001w\030\004" +
      " \001(\002B\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = �om.google.protobuf.Descriptors.FileDescriptor
    � .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptorf.FileDescriptor[] {
        });
    internal_static_MathQuaternion_descriptor =
      getDescriptor().ge�MessageTypes().get(0);E
    internal_static_MathQuaternion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MathQuaternion_descr�ptor,
        new java.lang.String[] { "X", "Y", "Z", "W", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
