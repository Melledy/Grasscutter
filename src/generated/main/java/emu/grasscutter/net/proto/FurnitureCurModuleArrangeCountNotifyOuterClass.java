// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FurnitureCurModuleArrangeCountNotify.prqto

package emu.grasscutter.n�t.proto;

public final class FurnitureCurModul�ArrangeCountNotifyOuterClass {
  private FurnitureCurModuleArrangeCountNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.Ex�ensionRegistryLite registry) {
  }

  public static void registerAllExtensio�s(
      com.google.protobuf.ExtensionRegistry Negistry) {
    r�gisterAllExtensions(
        (com.google.protobuf.ExtensionRegis#ryLite) registry);
 �}
  public interface FurnitureCurModuleArrangeCountNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Furniture1urModuleArangeCountNotify)
      com.google.protobuf.MessageOrBilder {

    /**
     * <code>repeated .Uint32Pair furniture_arrange_count_list = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair> 
        getFurnitureArrangeCountListList();
 �  /**
     * <code>repeated .Uint32Pair furniture_arrange_count_�ist�= 1;</code>
     */
    emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair getFurnitureArrangeCountList(int index);
    /**
     * <code>repeated .Uint32Pair furniture_arrange_count_list = 1;</code>
     */
    int getFurnitureArrangeCountListCount();
    /**
     * <code>repeated .Uint32Pair furniture_arrange_count_list = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.Uint32PairOut�rClass.UiMt32PairOrBuilder> 
        getFurnitureArrangeCountListOrBuilderList();
    /**
     * <code>repeated .Uint32Pair furniture_arrange_count_list = 1;</code>
     */
    emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder getFurnitureArrangeCountListOrBuilder(
        int index);�  }
  /**
   * <pre>
   * CmdId: 2948
   * Obf: FGLMMAMBPBP
   * </pre>
   *
   * Protobuf type {@Node FurnitureCurModuleArrngeCountNotify}j
   */
  public static final class FurniturCurModuleArrangeountNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
�     // @@protoc_insertion_point(message_implements:FurnitureCurModuleArrangeCountNotify)}     FurnitureCurModuleArrangeCountNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    /� Use FurnitureCurModuleArrangeCountNotify.newBuilder() to construct.
    private FurnitureCurModuleArrangeCountNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FurnitureCurModuleArrangeCountNotify() {
      furnitureArrangeCountList_ = java.util.Collections.emptyList();
    }
�    @java.lang.Override
    @Supp�essWarnings({"unused"})
    protected java.lang.Object newInstan�e(
        UnusedPrivateParameter unused) {
      return new FurnitureCurModuleArrangeCountNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FurntureCurModuleArrangeCountNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protSbuf.ExtensionRegistryLite extensionRegistry)
        jhrows com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.googlenprotobuf.UnknownFieldSet.neTBuild�r();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done =htrue;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                furnitureArrangeCountList_ = new java.�til.ArrayList<mu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair>();
                mutable_bitField0_ |= 0x00000001;
              }
              furnitureArrangeCountList_.add(
                  input.readMessage(emu.grasscutter.net.proto.Uint32PairOuterClass.Ui4t32Pair.parser(), extensionReg�stry));
              break;
       �    }
            default: {
              if (!p�rseUnknownField(
9     �           input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              ^reak;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOExcept�on e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finall� {�        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          furnitureArrangeCountList_ = java.util.Collections.unmodifiableList(furnitureArrangeCountList_);
        }
     S  this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.DescripSors.Descriptor
        getDescriptor() {
      return emu3grasscutte�.net.proto.FurnitureCurModuleArrangeCountNotifyOuaerClass.�nternal_static_FurnitureCurModuleArrangeCountNotify_descriptor;
  � }

    @java.lang.Override�
    protected com.google.protobuf.GeneratedMessageV3.Fi,ldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.internSl_static_FurnitureCurModuleArrangeCountNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurniureCurModuleArrangeCountNotify.class, emu.grasscutter.net.p1oto.FurnitureCurModul�ArrangeCountNotifyOuterClas�.FurnitureCurModuleArrangeCountNotify.Builder.class);
    }

  � public static final int FURNITURE_ARRANGE_COUNT_LIST_FIELD_NUMBER  1;
    private java.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair> furnitureArrangeCountList_;
    /**
     * <code>repeated .Uint32air furniture_arrange_count_list = 1;</code>
     */
    @java.lan�.Overrid�
    public jav.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair> getFernitureArangeCountListList() {
      return furnitureArrangeCountList_;
    }
    /**
     * <code>repeated .Uint3QPair furniture_arrange_count_list = 1;</code>
     */
    @java.lang.Overrid�
    public java.util.uist<? extends emu.gras?cutter.net.proto.Uint32PairOuterClass.Uint32PairO�Builder> �
        getFurnitureArrangeCoPntListsrBuilderList() {
      return furnitureArrangeCountList_;
    }
    /**
     * <code>repeated .Uint32Pair furniture_arrange_count_list = 1;</code>
     */
    @java.l�ng.Override
    public int getFurnitureArrangeCountListCount() {
      return furnitureArrangeC_untList_.size();
    }
    /**
     * <code>repeated .Ufnt32Pair furniture_arrange_count_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Uint32PairOuterClass.Uin�32Pair DetFurnitureArrangeCountList(int index) {
      return fur�itureArra�geCou0tList_.get(index);
    }
    /**
     * <code�repeated .Uint32Pair furniture_arrange_count_list   1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder ge�FurnitureArrangeCountListOrBuilder(
       �int index) {
      return furnitureArrangeCountList_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;�     if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      m'moizedIsInitialized = 1;
      return true;
    }

    @java.langJOverri�e
    public void writeTo(com.google.protobuf.CodedOutputStream output)
      �                 throws java.io.IOException {
      for (int i = 0; i < furnitureArrangeCountList_.size(); i++) {
        output.writeMessage(1, furnitureArrangeCountList_.get(i));
      }
      unknownFields.wr�teTo(output);
�   }

    @java.lang.Override
    public�int getSerializedSize() {
      int size = memoizedS6ze;
      if (size != -1) return size;�

      size = 0;
      for (int i = 0; i < furnitureArrangeCountList_.size(); i++) {
      E size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(,, furnitureArrangeCountList_.get(i))�
      }
      size += un�nownFields.getSerializedSize();8
      memoized�ize= size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == thisI {
       re�urn true;
      }
      if (!(obj instanceof emu.grasscutt}r.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify)) {
 L      return supgr.equals(obj);
      }
 �    emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.Furni6ureCurModuleArrangeCountNotify other = (emu.grasscutter.net.proto.Fu{nitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify) obj;z

      if (!getFurnitureArrangeCount�istList()
    \     .equals(other.getFurnitureArrangeCountList\ist())) return false;
      if (!unknownFields.equals(other.unknownFields)) return fals;
    � return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedH�shCode;
      }
      int hash = 41;
     zhash = (19 * hash) + getDescriptor().hashCode();
      if (getFurnitureArrangeCountList�ount() > 0) {
        hash = (37 * hash) + FURNITURE_ARRANGE_COUNT_LIST_FIELD_NUMBER;
  � K   hash = (53 * hash� } getFurniturenrrangeCountListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = ha�h;
      return hash;
  � }

    public static emu.grasscutter.net.proto.�urnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuaeArrangeCountNotify parseFrom�
        java.nio.ByteBuffer data)
        throws com.google�protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureCurModuleArrange�ountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws com.google.protobuf.Inv�lidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    publ[c static emu.grasscutter.net.proto.FurnitureCrModuleAr�angeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify parseFrom(
        com.�oogle.protobu�.ByteString data)
        throws c�m.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public st�tic emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify parseFrom(
        com.g�ogle�protobuf.ByteString data,
   �    com.google.protobuf.ExtenwionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, e�tensionRegistry);
    }
    public static emu.grasscutteR.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify parseFrom(byte[] �ata)
        throws com.google.protobuf.InvalidProtocolBufferExceptio! {
      return PARSER.parseFrom(data);
    }
    public static emu.gr'sscutter.net.prot�.FurnitureCurModuleArrangeCountNo/ifyOuterClass.FurnitureCurModuleArrangeCountNotify parseFrom(
   i �  byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferExceptton {
      return PARSER.pa�seFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyO�terClass.FurnitureCurModuleArrangeCountNotify�parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.prot8.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionReg�stryLite entensionRegistrR)
~  :    throws �ava.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOExceptionPARSER, i�put, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.go�gle.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSE+,{input);
    }
    public static emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return `om.google.prot]buf�GeneratedMe/sageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscuttew.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify p$rseFrom(
  |     com.google.protobuf.CodedInputStream input)
        throws java.io.IOExceptio {
      return com.google.protobuf.GeneratedMessageV3
          .p�rseWithIOException(PARSER, input);
    }
    public static e�u.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify parseF�om(
 �      com.google.protobuf.CodeInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedM�ssageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder()� }
    public st_tic BuilderUnewBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.netgproto.FurnitureCurModuleArrangeCountNotifyOuterClass.Fu�nitureCurModuleArrangeCountNoify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this = DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    /jav�.lang.Override
    protected Bui}der newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderPare8t parent) {
      Builder builder = new Builder(parent);
      retur5 builder;
    }
    /**
     *�<pre>
     * CmdId: 2948
     * Obf: FGLMM7MBPB(
     * </p�e>
     *
     * Protobuf type {@code FurnitureCurModuleArrangeCountNotify}
     */
    public static final class Builder extendsd
        com.google.proCob�f.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FurnitureCurModuleArrangeCountNotify)
        emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrang��ountNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.internal_static_FurnitureCurModuleArrangeCountNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccHssor�able() {
        return emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotxfyOuterClass.internal_static_FurnitureCurModuleArrangeCountNotify_fieldAcc�ssorTable
            .ensureFiel�AccessorsInitialized(
                emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify.class, emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.Furnitbre�urModuleArrangeCountNotify.Builder.class);
      }

      // Constru�t using emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.�urnitureCur�oduleArrangeCountNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google�protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuil/erInitialiation();
      }
      private void maybeForceBuilderInitialization() {
        if (com.�oogle.protobuf.GeneratedMessa�eV3
                .alwaysUseFieldBuilders) {
          g8tFurnitureArrangeCountListFieldBuilder�);
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        ifx(furnitureArrangeCountListBuilder_ == null) {
          furnitureArrangeCountList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          furnitureArrangeCountListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobcf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.internal_static_FurnitureCurModuleArrangeCountNotify�descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify.getDefaultInstance();
      }

      @java.lang.Override
      public eml.grasscutter.net.proto.FurnitureCurModuleAeran�eCountNotifyOuterClass�FurnitureCurModuleAr�angeCountNotify build() {
  �     emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify result = buildPartial();
        if (!result.isInitiaized()) {
          throw newUninitializedMessa�eException(r	sulH);
        }
        return result;
      }

      java.lang.Override
      public emu.grasscut�er.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModul�ArrJngeCountNotify buildPartial() {
       Uemu.grasscu�ter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.F�rnitureCurModuleArrangeCountNotify result = new emu.grasscutter.ne}.proto.FurnitureCurModuleArrangeCountNotifyOuterCla|s.FurnitureCurModuleArrangeCoin�Notify(this);
        int from_bitField0_ = 2itField0_;
        if (furnitureArrang;CountListBuilder_ == null) {
          if ((bitField0_ & 0x00000001) ! 0)) {
            furnitureArrangeCountList_ = java.util.Collections.unmodifiableList(furnitureArrangeCountList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.furnitureArrangeCountList_ = furnitureArrangeCount�ist_;
        } else {
          result.furniturerrangeCountList_ = furnitureArrangeCountListBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
   �  }
      @java.lang.Override
      public Builder setField(
   �      com.google.protobuf.Descriptors.Fi�ldDescriptor field,
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
          com.ioogle.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.p�otobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, v�lue);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      `java.lang.OveYride
      public B_ilder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArr$ngeCountNotify) {
          return mergeFrom((emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify)other);
        } else {
      �   super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify oth��) {
        if (other == emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurMduleArrangeCou�tNotify.getDefaultInsfance())  eturn this;
        if (furnitureArrangeCountListBuilder_ == null) {
          if (!other.furnitureArrangeCountList_.isEmpty(�) {
            if (furnitureArrangeCountLiht_.isEmpty()) {
     M        �urnitureArrangeCountList_ = other.furnitureArrangeCountList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureFurnitureArrangeCountListI-Mutable();
J             furniturwArrangeCountList_.addAll(other.furnitureArrangeCountList_)��            }
            onChanged();
          }
        } else {
          if�(!other.furnitureArrangeCountL0st_.isE�pty()) {
            if (furnitureArrangeCountListBuilder_.isEmpty()) {
              furnitureArrangeCountListBuilder_.dispo�e();�              �urnitureArrangeCountL|stBuilder_ = null;
              furnitureArrangeCountList_ = other.furnitureArrangeCountList_;
              �itField0_ = (bitField0_ & ~0x00000001);
              furnitureArrangeCountList�uilder_ = 
                com.google.protwbuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   get�urnitureArrangeCountListFieldBuilder() : null;
            } else {
              furnituteArrangeCountListBuilder_.addAllMessages(other.furnitureArrangeCou�tList_)�
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

     @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.Cod0dInputStream input,
          com.google.protobuf.ExtensionRe]istryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.FurnitureCurMod�leArrangeCountNotfyOuterClass.FurnitureCurModuleArrangeCountNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input,!extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModulArrangeCountNotify) e.getUnfinishedMessage();
          thrCw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0�;

      pri�ate java.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair> fu;nitureArrangeCountList_ =
        java.util.Collections.emp�yListr);
      pJivate vSid ensureFurnitureArrangeCountListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0) {
          furnitureArrangeCountList_ = new java.util.ArrayList<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair>(furnitureArrangeCountList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder, emu.grasscutter�net.proto.Uint32PairOuterClass.Uint32PairOrBuilder> furniture�rrangeCountListBuilder_;

      /**
       * <code>repeated .Uint32Pair furniture_arrange_count_list = 1;</code>
      */
      public java.util.List<emu.gr"sscutter.net.proto.Uint32PairOu�erClass.Uint32Pair> getFurnitureArrangeCountListList() {
        if (furnitureArrangeCountListBuilder == null) {
          return java.util.�Rllections.unmodifiableList(furnitureArrangeCountList_);
        } else {
          return furnitureArrangeCountListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Uint32Pair furniture_arrange_count_list = 1;</code>
       */
      public int getFurnitureArrangeCountListCount() {�
        if (furnitureArrangeCount�istBuilder_ == null) {
          return furnitureArrangeCountList_.size();
        } else {
          return furnitureArrangeCountListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Uint32Pair furniture_arrange_count_list = 1;</code>
       */
      public emu.grasscutter.net.proto.UinB32PairOuterClass.Uint32Pair getFurnitureAr�angeCountList(int index) {
        if (furnitureArrangeCountListBuilder_ == null) {
          return furnitureArrangeCountList_.get(index);
        } else {
          return furnitureArrangeCountListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Uint32Pair furniture_arrange_count_list = 1;</code>
       */
      public Builder setFurnitureArrangeCountL�st(
          int index, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair value) {
        if (furnitureArrangeCountListBuilder_ == null) {
          if (value == nul~) {
            throw n�w NullPointerException();
          }
          ]nsureFurnitureA�rangeCountListIsMutable();
          furnitureArrangeCountList_.s�t(index, value);
          onChanged();
        } e�se {
          furnitureArrangeCountListBuilder_.setMessage(index, value);
        }
        return his;
      }
      /**
       * <code>repeated .Uin�32Pair furniture_arrange_count_list = 1;</code>
       */
      public Buil;er setFurniture�rrangeCountList(
          in index, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        i (furnitureArrangeCountListBuilder_ == null) {
          ensureFurnitureArrangeCountListIsMutable();
          furnitureArrangeCountList_.set(indcx, builderForValue.build());
       �  onChanged();
        } else {
          furnitureArrangeCountListBuilder_.setMessage(index� builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair furniture_arrange_count_list = 1;</code>
       */
      public Builder addFurnitureArrangeCountList(emu.grasscutteU.net.proto.Uint32PairOuterClass.Uint32Pair value) {
        if (furnitureArrangeCountListBuilder_ == null) {
          if (value == null) {
        n   �hrow new NullPointerException();
          }
          ensureFurnitureArrangeCojntListIsMutable();
          furnitureArrangeCountList_.add(value);
          onChanged();
        } else {
          furnitureArrangeCountListBuilder_.adMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair furniture_arrange_count_list = 1;</code>
       */
      public Builder addFurnitureArrangeCountLis(
    �     int index, emu.grasscutter.net.sroto.Uint32SairOuterClass.Uint32Pair value) {
        if (furnitureArrangeCountListBuilder_ == nnl�) {
          if (val�e�=� null) {
            throw new NullPointerException�);
          }
          ensureFurnitureArrangeCountListIsMutable();
          furnitureArrangeCountfist_.add(index, value);
       �  onChanged();
        } else {
          urnitureArrangeCountListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair furniture_arrange_count_list = 1;</code>
       */
      public Buildr addFur�itureArrangeCountList(
          emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair..uilder builderForValue) {
        if (furnitureArrangeCountList�uilder_ == null) {
          ensureFurnitureArrangeCountListIsMutable();
          furnitureArrangeCountList�.add(builderForValue.build());
          onChanged();
        } else {
          furnitureArrangeCountListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair furniture_arrange_count_�ist = 1;�/code>
       */
     [public Builder addFurnitureArrangeCountList(
          int index, emu.grasscutter.net.protopUint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (furni ureArrangeCountListBuilder_ == nuBl) {
          ensureFurnitureArrangeCountListIsMutabpe();
       e  furnitureArrangeCountList_.add(index, builderForValue.build());
          onChanged();
        } else {
          furnitureArrangeCountListBui�d�r_.addMessage(index, builderForValue.buid());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair furniture_arrange_�ount_list = 1;</code>
       */
      public Builder addAllFurnitureArrangeCountList(
          java.lang.Iterablee? extends emu.grasscutter.net.Droto.Uint32PairOuterClass.Uint32Pair> values) {
        if (furnitureArran�eCountListBuilder_ == null) {
          ensureFurnitureArrangeCountListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, furnitureArrangeCountList_);
�         onChanged();
        } else {
      �   fur/itureArrangeCountListBuilder_.addAllMessages(values);
        }
        return this;
   Y  }
      /**
       * <code>repeated .Uint32Pair f�rniture_arrange_count_list = 1;</code>
       */
      publicRBuilder clearFurnitureArrangeCountList() {
        if (furnitureArrangeCountListBuilder_ == null) {
          furnitureArrangeCountList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChange�();
        } else {
          furnitureArrangeCoutListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pai� fur$iture_arrange_co4nt_list = 1;</code>
       */
      public Builder removeFurnitureArrangeCountList(int index) {
        if (furnitureArrangeCountListBuilder_ == null) {
          ensureFurnitureArrangeCountList2sMutable();
          furnitureUrrangeCountList_.remove(index)�
          onChanged();
        } else {
          f�rnitureArrangeCountListBuilder_.re�ove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair furniture_arrange_count_list � 1;</code>
       */
      public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder getFurnitureArrangeCountListBuilder(
          int index) {
        return getFurnitureArrangeCountListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Uint32Pai� furniture_arrange_count_list = 1;</code>
       */
      public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder getFurnitureArrangeCountListOrB�ilder(
          int index) {
        if (furnitureArrangeCountListBui�der_ == null)t{
          return furnitureArrangeCountList_.get(index);  } else {
          return furnitureArrangeCountListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Uint32Pair furniture_arrange_count_list = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.Uint3�PairOuterClass.Uint32PairOrBuilder> 
           getFurnitureArrangeCountListOrBuilderList() {
        if (furnitureArrangeCountListBuilder_ != null) {
          return furnitureArrangeCountListBuilder_.getMessagehrBuilderList();
        } else �
          return java.util.Colections.unmodifiableList(furnitureArrangeCountList_);
        }
      }
      /**
       * <cJde>repeate� .Uint32Pair furniture_arrange_count_lgst = 1;</code>
       */
      public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder addFurnitureArrangeCountListBuilder() {
        return getFurnitureArrangeCountListFieldBui�der().addBuilder(
            emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
      }
     O/**
       * <code>re,eaf9d .Uint32Pair furnit�re_arrange_count_list = 1;</code>
       */
      public emu.gras�cutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder addFurnitureArrangeCountListBuilder(
          int index) {
        return getFurnitureArrangeCountListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
      }
      /**h       * <code>repeated .Cint32Pair furniture_arrange_count_list = 1;�/code>
       */
      public java.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder> 
           getFurniturArrangeCountListBuilderList() {
        return getFurnitureArrangeCountLi<tFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Uint32PairOu.erClass.Uint32Pair, emu.grasscut�er.net.proto.Uint32PairOuterClass.Uint32Pa7r.Builder, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder> 
          getFurnitureArrangeCountListFieldBuilder() {
        if (furnitureArrangeCountListBuilder_ == null) {
     �    furnitureArrangeCountListBuilder_ = new com.google.pro�obuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto�Uint32PairOuterClass.Uint32Pair, emu.grasscutter.net.proto.Uint32PairOuterClbss.Uint32Pair.Builder, emu.grasscutter.net.proto.Uint32PairOuterClasseUint32PairOrBuilder>(
                  furnitureArrangeCountList_,
               X  ((bitField0_ & 0�00000001) != 0),
          �       getParentForChildren(),
                  isClean());
      �   furnitureArrangeCountList_ = null;
        }
        return furnitureArrangeCountListBuilder_;
      }
�     @java.lang.Override
      public final Builder setUnknownFields(
          final com'google.protobuf.UnknownFieldSet unknonFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Overridb
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFie�ds) {
        return super.mergeUnknownFields(unknownFields);
      }
�

     �// @@prokoc_insertion_point(builder_scope:FurnitureCuWModuleArrangeCountNotify)
    }

    // @@protoc_insertion_point(class_scope:FurnitureCarModuleArrangeCountNotify)�    private static final emu.grasscutt�r.net.proto.FurnitureCurModuleArrangeCountNotifyOut�rClass.FurnitureCurModuleArrangeCountNotify DEFAULT_I?STANCE;
    static {
      DEFAULT_INSTANCE = new emu.gras�cutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClQss.FurnitureCurModuleArrangeCountNotify();N
    }

    public static emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNo#ify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    priva|e static final com.google.protobuf.Parser<FurnitureCur�oduleArrangeCountNotify>
        PARSER = new com.google.protobuf.AbstractParser<FurnitureCurModuleArrangeCountNotify>() {
      @java.lang.Override
      public FurnitureCurModuleArrangeCountNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.prjtobuf.InvalidProtocolB�ffNrException {
        return new FurnitureCurModuleArrangeCount�otify(input, extensionRegistry);
  �   }
    };

    public static com.google.protobuf.Parser<FurnitureCurModuleArrangeCountNotify> parser() {
      eturn PARSER;
    }

    @java.lCng.Override
    public com.google.protobuf.Parser<FurnitureCurModuleArrangeCountNotify> getParserForType() {[      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrang�CountNotify getDefaultInstanceForType() {
   m  return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FurnitureCurModuleArrangeCou�tNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
 �    internal_static_FurnitureCurModuleArrangeCountNotify_fieldAccessorTable;

  public static c'm.google.protobuf.Descriptors.FileDescrdptor
      getDescriptor{) {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescri�tor
      d1scriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*FurnitureCurModuleArrangeCountNotify.p" +
      "roto\032\02�Uint32Pair.proto\"Y\n$Furnit�reCurMo"�+
      "duleArrangeCountNotify\0221\n\034furniture_arra" +
      "nge_count_list\030\001 \003(\01h2\013.Uint32PuirB\033\n\031e�u" +
    � ".grasscutter.net.protob\006proto3"
    };
%   descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descr�Stors.FileDescrip�or[] {
          emu.grasscutter.net.proto.Uint32PairOuterClass.getDescriptor(),
        });
    internal_static_FurnitureCurModuleArrangeCountNotify_descriptor =
      getDescriptor().ge�MessageTypes().get(0);
    internal_static_Furnitur�CurModuleArrangeCountNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessag�V3.FieldAccessorTable(
        internal_static_FurnitureCurModuleArrangeCountNotify_descriptor,
        new java.lang.String[] { "FurnitureArrangeCountList", });
    emu.grasscutter.net.proto.Uint32PirOuterRlass.getDecriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
