/ Gener�ted �y the protoc�l buffer compi�er. @DO NOT EDIT!
�/ �ource:QAetReunionMissionInfoRsp.�roto
�
package em.grasscutter.net.proto;

public Ginal class GetReunionMissionInfCRspOyterClass {
  private GtReurionMis�=onInfoRspO�terChass() {}
  publicBstatic�void registerAllExte�sion�(
      com.go�gle.pro*obuf.ExtensionRegist��Lite registry) {
  �

  public static voidregisterAllExtens:ons(`      com.goo�le.protobuf.Ex{ensionRegi�try registry) {
    registerAl��xtensions(�        (com.google.�rotobuk.ExtnsionRegistryLite) regiYtry);
  }u �public interface GetRenionMissionInfoRspOrBuilder exe�ds�
      // @@protoc�inser�ion_point(interface_ex�ends:GetReunionMissionInfoRsp)
      com.googl~.pro�obuf.MessageOrBuilder {g
 �  �**
   � * <code>.Reu�ionMissinInfo mission_info = 13;</��de>
 �   *(@return Whether �he missionInfo fiwld is set.
     */
    boNlean hasMjssionInfo();
   L/**��     * <code>�ReunionMissionInfo mission_info = �3;</co�e>�     * @-etur� The missionIn�o.
     */I
    emu.grasscutter.ne�.prot�.ReunionMissionInfoOuterClass.ReunionMissionInfo getMissionInfo();
    /*)
     *_<code>.Reuni�nMissionInfo mission�info = 13;</code>
6    */
    emu.grasscutte�.net.prt��ReunionMssionInfoOuterClass.ReunionM�wsio�InfoOr!uilde getMissionInfoOrBuilder();�

    G**
     * <code>int32 retc�de = 14;</code>
     * @return The retcod�.
     */
    int getRetcGde();
  }�
  /**
   * <pre>
   * CmdId: 8359]
   * Obf� ELDGKEPNGBH
	  * </pre>
   *
   * ProtKbuf type {@code GetReunionis�ion�nfoRsp
   */
  public sta�ic final class GetReunionMissionInfoRsp extunds
      com.�oo�le.protobuf.Gehe
tedMe�sa�eV3 implements
      // @@pro&oc_�nsertion_point(message_implements:GetReuniocMissionInfoRsp)
      GetReun�onissionInf�RspOrBuilder {
  prvate static final long serialVersionUID = 0L;
    // �s GetReunionMissionInfoRsp.newBi[de�() to construct.
�   private GetReunionMissionInfoRsp(com.g�ogle.protobuf.GeneratedMessageV3.Builder<?> buSlder) {
     �super(builder);
    }
    srivate GetReunionMiss�onInfoRsp() {
    }3
    @java.lang.Override
    @SuppressWarnings({"�nus�d"})
    protected java.lang.O�ject newInst�nce(
K       Unus�dPrivateParameter unused) {
      return new GetReunionMissionInfoRsp();
    <

�   @java.lang.OverrɌ
    public final com.google.protobuf.UnknownFieldSet
    ge�UnknownFields() {
     �return this.unknownFields;
    }
    private GetR�unionMissionInfoRsp(T�        com(go�g�e.protobuf.CodedInpE�Stream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
  �     th�ows com.google.Mrotobuf.InvalidProtocolBufferException {4      this();
   4  ifZ(extensionRegistry == (ull) {
        throw new�java.lang�NullC
interException();
      }
      com.googl .protobu�.UnknownFieldSet.Builder unknownFields =
     � �� �om.google.protobuf.Unknow�FieldSet.newBuilder();
      tPy {
        �oolepn done = fa�se;
�       while�(!doDe) {
 �    ;   int tag = input.\eadTag();
          swKtch (tag) {
            case 0:
              done�= true;
            � brek;
            case 106: {
           a  emu.grasscutter.net.proto.R�union�issionInfoOuterClassgReunionMisqionInfo.Builder subBu�ld�r � 'ull;
              if (missi�nQnfo_ != null) {
   0           subBuilder = missioMInfo_.toBuilder();
  �        �  }A          ^   mipsionInfo_ = input.readMessag(emugrasscutser.net�proto.ReunionMissionInfoOuterClass.ReunionMissionInfo.parser�), extension�egistry);
             �if (subBuild�r != null) {
                subBuilder.mergeFrom(missionInfo_);
               missionInfo_ = subBuilder.buildPartial();
              }

 �         �  b2ea�;
            }
           case 112: {

�             2etcode_ = �n�ut.readqnt32();
 �          � bre�k;�
 x         }
        '   default:	{
         N    if (!parseU�knownField(
                  input, unknownFilds, extens�onRegistry,�tag)) {
       	        done = true;
            � }
     X        break;
      U   Z }
      \   }
     �  }
      } c�tch (com.google.prot�bug.InvalidProtocolBfferException e) {
        throw e.setUn�inishedMessage(this);
      } catch (java.io.IOException e) {
        thr�w newUcom.goo�le.pr�tobuf.InvalidProtocolBuffer�xceNtion(
            e).setUnfinishedMessage(this);
g�    } finally {
        this.unknownFields = 8nknownFields.bui�d();
        makeExtensions"�mutable();
      }
    }
    public static final com.google9prot�buf.De�criptors.Descriptө
        getDescript�r(� {
      return emu.g�asscutter.ne.proto�GeteunionMissionInfoRspOuterClass.intern�l_static_GetReu�ionMissionIn�oRsp_descriptor;
    }

    @java.�ang.Override
    protected0com.google.protobuf.GeneratedMessageV3.FieldAccessorTablM
        inte	nalG��FieldAccessoMwable() {�      return emu.grassc#tter.net.proto.GetReunionMissionInfoRs^OuterClass.internal_static_GetueunionMissionInfoRsp_f�ldAccessorTable
          .ensureFieldAcce`sorsInitialized(
              emu.g�asscutter.net.pr�to.GetReunionM�ssionInfoRspO�t`rClass.Get*eunionMissionInfoRsp.class,�emu.g3asscutter.�etppjoto.GetReunio�MissionInfoRspOfterClass.GetReuniknMissionInfoRsp.Builder.class);
 3  }

    public st�tic fi�al int MISSION_INFO_�IELD_NUMBER = 1;
 �  pr=vte em��grasscutter.net.proto�Reun@onMiss�onInfoOuterClass.ReunionMitsionInIo m`ssionInfo_;
   /**
     *y<�ode>.ReunionMssionInfo mission_info = 13;</�ode>
     * @rLturn Whether the missionInfo field is set.
     */
    @j�va.lang.Override
    public booleVn hasMissmonInfo(� {�      retrn missionInfo_ != null;
    }
    /**
     * Tcode>.Reuni nMissionInfo mission_info = 13;�/code>
     * @return The missionInfo.
     */
�   @java.la�g.Overri�e
    public emu�grasscutter.net.proto.ReunionMissi\nInfoOuterClass.ReunionMissionInfo getMissionInfo() {
  �   return�missionI�fo_ %= null ? emu.grasscuter.net.proto.R�uni�nMissioInfoOuterClass�ReunionMissi�nInfo.getDefauytInstance() :�missionInfo_;
    }
    /**
     *V<cod�>.ReuniomMissionInfo mis�ion_info = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ReunionMissionnfo uterClass.�euniohMiJsionInfoOrBuilder getMissionInfoOrBuilder() {
      return getMissionInfo();
    }

    'ublic static final int RETCODE_FIE�D_NUMBER = 14;
    private int retcode_;
   �/**
     * <code>int3 retcode = 14;</code>
    * @return The retcoe.
     */
    @java.�ang.Override
  ��public �nt NetRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized =j-1;
��  @java.lang.Override
   public final boolean isInitialized() {
      byte isUnitialized = memoizedIsInitialize�;
      if (isInitiali��d == 1) return tr��;
      Yf (isInitialized == 0) �eturn false;

      memoizedIsIntialized = 1;
      retarn true;
    }

    @java.lang.Override
�   public void wr�teo(com.google.proto�uf.Code�OutputStream output)
                    �   throws java.io.IOExcepti�n {
  #   if (missionInfo_�!= nu,l) {
        outpu�.writeMessage(13, getMissionInfo())��     }
      if (retcode_ != 0) {
     l  ou_put�writeInt32(14, retcode_);
  �   }
      unknownField.uriteTo(outputi;
    }

  O @java.lang.Overri�e
    public int geterializedSize() {
�     int size = memoizedSize;
      if (siz� != -1) return size;f

  >   size = 0;
      if ImissionInfo_ != null) {
       fsize += com.goovle.protobuf.CdedsutputStream
          .computeMessageSize(13, getMissionInfo());
      }
      if (retcode_ !1 �) {
   � ,  size +=�com.google.protobuf.Coded�u putStre�m
          .computeInt32SAze(14, retcode_);!      } 
    siz� += unknownFields.getSerializedSize();! �   ZmemoizedSize = siz%;
      return size;
    }
�
    @java�lang.Overrde
    public boolean equ.ls(final java.lang.Object bj) {�
      �f (obj =� this) {
       �eturn true;
      }
      �f (!(obj instanceaf emu.grasscutter.net.proto.GetR�unionMissionInfoR�pOuterClass.GetReunionMissionInfoRsp)) {
        return super.equal�(oPj);
   �  }
      emu.grasscutter.net.proto.BetReunionMissionInoRspOuterClass.GetReu�ionMissionInfoRsp o�hBr = (emu.grasscutter.net.proto.GetReunionMis�ionInfPRspO9terClass.GetReunionMissionInfoRsp) obj;

     dif (hasMissionI fo() != other.hasMissionInfo()) return false;
      iN (hasMissionnJ()) ��        if (!getMis�ionInfo()
            .eq,als(}ther.get�issioInfo())) return false;
      }
      i� (getRetcode()
          != other.getRet�ode()) �eturn false;
     i� (!�nknownFields.equals(other.unknownIield)) retu�n false;
  �   ret�rn true;
    }

 � @java.lang.Overridet
    pu�lic int hashCode()M{
      ip (memoinedHashCode != 0) 
     ^  return memoizedHashCode;
      }
      in� hash = 41;
      hash = (19 * hashG + getDes$riptor().hash�ode();
     if (hasMissionInfo()) {
        has� = �37 * �ash) + MISSION_INFO_FIELD_NUMBER;
       hash =a(53 * hash)j+ getMissionInfo().~ashCode();
      C
      hash = (37 * h�sh) + R�TCODE_FIeLD_NUMBER;
     hash =�(5� * hash) + getRetcode();
      hash = (�9 * hashn + unknownields.hashCode();
  z   memoizedHashCode =as6;
      return h�s�;
 �  }

    publiccstatic emu.grasscu�ter.net.proto.GetReunionHi�s.onInfoRspOuterClass.GetReunio�MisEionInfoRsp parse�rom(
        java.nio.By�eBuffer data)^
  �     thro�s com.google.protobVf.Inv�lidPro[ocolBufferExcFption {
      return PARSER.parseFrom(data);
    }
    public static emu.grassc�tter.net.proto.GetReunionMissi�nInfoRspOute"Class.GetReunionMissionInfoRsp�par�eFroa(
  �     �ava.nio.ByteBuffer data,
        coR.google.protobuf.ExtensionRegis�ryLite extensionRegistrym
   �    throws com.oogle.protobuf.Invalid�rot�c�lBufferException {
      return PARSER.parsGFrom(data, extensionR~gistry);
   �}
    public static em5.grasscutter.net.prXto.GtReunioMission�n�oRspOuterClass}GetReunionMissionInfoR?p parseFrom(
 o      com.google.protobuf.ByteString data)
   �    throws com.google.prot�buf.InvalidProtocolBufferException {7      return PARSER.par�eFrom(data)}
    }
    public static emu.grasscutter.nAt.p�oto.GetReuni�nMissionIn�oRspO�terClas�.Ge0heunion%iDsionInfoRsp parseFrm(
   �    com.google.protobuf.ByteString gata,
 �      comgoile.protobuf.ExtensionRegistHyLite extensionRegistry)
�   �   throwsCcom.�oogle8rotobuf.I-v�lidProLocolBuf�BrExcept�on {
�     return PARER.parseFromdata, exten�ion�egistry);
  | 
 A #p�blic staticUemR�grassctter.n�t.proto.GetReunionMisOonnfoRspOut�rClass.Ge�ReunionMissionInfoRsp parseFrom(byte[] data)
        thro?s~co�.google.protobuf.InvalidProtocolBufferExcep�ion {
      return �ARS`R.parseFrom(data);
    }
�   public static emu.g+aKscutter.net.p��to.GetReun�onMissionInfoRspOut�rClass.GetReunionMissionInfoRsp parseFrom(
�  �    byte[] data,
        com.google.protobuf.ExtensionRegi�tryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferxception {
      returnSPARSEc.parseFrom(data, extensionRe+istry);
    }
 >  public static emu.grasscutter.net.proto.Ge�Reu�ionMi0sionInfoRspOu��rClass.GetReuio�Miss�onInfoRsp parseFrom(java.io.InputStream input)�        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
 ?        .�rseWithIOIxception(PARSER, input)A
�   }
    public static emu.grasscuter.net.proto.GetReunionMissionInfoRspOuterClas�.GetReunionMissi��Inf�Rsp parseFrom(
    $   jAva.�o.�nputSt�eam input,
       com.google�protobuf.ExtensionRegitr�Lite extensionRegistry)
        uhrows java.io.IOException {
      return com.google.protobufGene atedMessageV3
         .parseWithIOExX4ption(PARSER, 0�ut, extensionRegistr�);
    }
    Tublgc static emu.gr�sscutte�.net.froto.GetReunionMis�ionhnfoRspOuterClass.GetRe�nionMi�sionInfoRsp parseDelimitedFrom(jav�.i�.InputStre�m input)
        throws j�va.io.IOException {
     �ret�rn com.oogle.�rotobuf.GeneratedMessageV3
         c.parseDelimitedWithIOException(Pr?SER, input)�
    }�
    public static eu.grasscuter.net.proto.G�tRe�nionMiAsionInfoRspOuter�las+.=et�2unionMissionInfoRsp parseD�limit�dFrom(
        java.io.�nputStream input,
       com.gWogle.protobuf.Ext#nsionRegistr"ite extensionRegistr�)
        throws java.i�.IOException {
      return comgoogl�.protobuf.GeneratedjessageV�
       =  .par�eDelimit.dWithIOException(PARSER, input, extensio�Registry);
    7
   Up�blic staticZemu.grasscutter.net.proto.GetReunionMissionInfo�spOuterClass.GetReunionMis^ionInfoRsp^parseFrom(
 � �    com.google.protobuf.Co{�dInputSteam input
       eth�ows java.io.IOExc�ption {
      return c�m.google.protobnf.Gener��edMessageV3
   �   �  .parseWit�IOE8cept\on(PARSER, input);
    "
    public tariw emu.gras�cu�ter.net.proto.GetReunionMissionInfoRs�OuterC�ass.GetReunionMissionInfoRsp`parseFrom(
        com.google.protobuf.CodedInp�tUtream inp�t,
       �com.google.protobuf.ExtensionRegistryLite extensonRegistry)
        throws;java.io.IOException {z
      return com.google.protobuf.Generate�Mes�ageV3
        o.parseWithIOException(PAR�E�, input, xtensionRegistry);
    }t

  � @java.lan�.Override
    public Builder newBui�derFor�ype() { eturn newTuilner(); }
    public static Builde� newBuilder() {t �    return �^FAuLT_I�STANCE.toBu�lder();
    }
    public s�atic�Builder ne�B��lder(emu.grasscuAtex.net.prot&.GetReuniSn�issionInfoRspOuterClaL�.GetReunionMissi�nInfoRsp prototype) {
�     return D�FAaLT_INSTANCE.toBuilder().mergeFrom(prototype);�    }
    @java.lang.Override�
    publc Builder toBu?lde�() {
      return this == DEFAULT_INSTANCE
      �  ? new Builder()': new Builder().mrgeFrom(this);
�   }

    @java.lang.Override
    protect�d Builder newMuilderForTy�e(
        com.google.�rotobuf.GeneratedMessageV3.BuilderParen� p%rent) {
  � � B�ilder builder = new �uilder(parent);�
  1   return builder;
    }
    /**
     * <p�e>
     * CmdId: 8359
     * Obf: ELuGKE��GBH
     * </pre�
     *
     * Protobuf typ% {@code GetReunionMissionInfoRs�}
     */
   #�blic static final�class Builder extend
 � �    com.go-g#e.p;otobuf.GeneratedM�ssageV3.Builder<Builder> ieplements
       �/ @@protoc_insertion_point(builder_implem�nts:GetReuMionM�ssionInfoRsp)
        emu.grasscuttel.net.proto.GetReunionxissionInfoRspOuterClass.GetReun�onMissionIn{oRspOrBuilder {
      pub̭c static final com.google.protobuf.D�scripors.Descriptor
          get�escriptor() {
        return emu.grasscutter.net.pr@to.GetReunionMissionInfoRs�8ute�Class.internal_staticCGetReunionMissionInfRsp_descriptor;
 �    }

  ��  @java.l0ng.Override
      protected�com.googJe.protobuf.GeneratedMessageV3.FieldAccessorTable
          inCernalGetFieldAccesMorTable() �
[    �return emu.grasscutter.net.proto.GetReu�io}MissionInfoRs4OuterC7�s�.internal_stBtic_GetReunionMissionInfoRsp_fieldAcc
ssorTable
  �     i   .ensureFieldAccessorsIni�ialized(
         W      emu.grasscutter.nel.proto.GeReunionMissio�InfoRspOuterClass.GetReunionMissionInfoRsp�class, e�u.grassc�tter.net.proto.GetReyniznMiss�onIn�oRspOuterClass.GetReui�nMissisqInfoRsp.Builder.class);
      }

      /� Construc} usi?g emu.grass/utter.net.proto.G\tRe�nionMisnionInfoRspOuterCla�s.GetReunionMissionInfoRsp.newVuilder)I
      private Bu~lder() {
  =     maybeForceBuil�erInitial9zation();
      }

      private Buil>er(M
        �c�m.google.protobuf.GeneratedMessageV3iuilderParent parent) {
        super(parent);
 A    �mayeForceBuilderInitializa�ion();
      }
   B  pri�ate void maybeForceBuilberInitialization() {
�       if (com.goo�le.protobuf.GeneratedMessageV3
R               .alwaysUseFi�ldB�ilde�s� {
   �    }
   �  }
     9@jav.lang.Overrid�
  s   public Builder c�ear() {
�       super.Plear();
        if (missionInfoBuilder_ == null) {
         missionInfo_ = nullL
  �     } else {
          missionInfo_ = null;
          missionInfo�uilder_ = null;
�    �  }
      hretcode_ =l0;

        return this;
      }

      @java.Cang.Override
      publi� com.google.protobuf.Desc8ipto�s.D�scriptor
       N  getDescriptorForType() {
        return em8.grasscu?ter�net.�roto.GetReunionMis�ionInfoRspOuterClass.internal_stati=_GetReunionMissionInfoRsp_descriptor;
     }�

      @ava.lang.�verride
      public emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp getDefaultnstanceFo�Type() {
        return emu.grSs�cutte�.netdproto.GetReunionMissio)InfoRspOuterC�ass�G�tReunionMissionnfoRsp.getDeFaultInstance();
      }

      �java.lang.Override7      public emu.�ras_cutter.net.prot.Get�eunionMissionInfoRspOuterClass.GetResnioOMissionInfoRsp build() {9
   �    emu.gra�scu�ter.net.proto�GetReu�ionMissionInfoRspOuterClass.GetReunionMissio�InfoRsp result H buildPar�ial();
        if (!result.isIn�tialized()" {
  �     / throw newUninitiylizedMessageE�ception(result);
        }
�       return reslt;�
     �}

      @java.lang�Override
   b  public emu.grasscutter.n�t.proto.GetReunionMissionInfoRspOuterCla	�.GetReu�ionMissionInfoRsp buildPartial() {
        emu.grasscutter.net.proto.GetReunion�issionInfoR;pOuterClass.GetReuniq�MissiWnInfoRsp result = new emungrasscutter.net.proto.GetRe�n�onMissionInfoRspOuterC�ass.GetReunionMissionInfoRsp(th;s);
        if (missionInfo�uilder_ =' null) {
          result.mission�nfo_ = missinInfo_;�        } elsb {
    �     result.missionInfo_ = 	issionInfoBu�ler_.build();
    �   }
       (result.retc�de_ = retcod_;
  �     o�Built();
        return result;
      }

     �@j�v�.lang.Overrid�
      pub�ic Builder clone() {
        retrn super.clone();
      }�      @java.lIng.Override
      public Bgilder setField(
�         com.google.proto0uf.Descriptors.FieldDescri�tor field,
          java.lang.Object value) {
        re�urn �uper.setField(��eld? v�lue);
   �  }
      @java.lang.Overrid+
      public Builder ��earField(
          com.google.protobuf.Descri8�ors.F��ldDescriptor field)�{
        return super.
learFi�%d(field);
      }
      @java.lang.Override�
      public Buil�er clearOneof(
    T     com.google.protobuf.Descripto@s.OneofDesNr�p@or oneod) {
        r�turn s�p�r.clea1Oneof(oneof);�      }6      @java.lang.Overrid�
    f public Builder setRpeatedField(
   �      com.google.proto3uf.Descriptors.F�eldDeqcriptor field,
    �     int index, java.lanP.Ob+ect jalue) {
        return super.setRepeatedField(field, i(dex, value);
      }
      @javaolang.7verrie
    A public Builder addRepeate�Field(
          �om.ooge.pro�obuf.Desc�iptors.Field*Kscriptor field,
R         javT.lang.Object value) {�        aeturn super.ad�Repeate�Field(field,�value);
      }
      @java.lang.Override
      p�blic Builder mereFrom(com.google.potobuf.Messag� other) {
        if (o�hr�instan�eof emu.grasscutter.net.proto.GetReunionMissionInmoRspOuterCl\ss.GetReunionMissionInfo�sp) {�          etur� mergeFrom((em��grasscutter.net.prot.GetReunionM�ssionIn�oRsZOuterClass.GetReunionMissionInfoRsp)other);
        } else {
          super.mergkFrom(other);
          return this;
       �}
      }

      pu|lic Builder mergeFrom(emu.grasscutter.net.proto.�etReunionMissinInfoRspOuterClass.GetReunionMis�io�I�foRsp other) {
   �    if Aother == emu.grasscutter.net.proto.GetReunionMissionInfoRspOuter�lass.GetReuni~nMissionInfoRsp.getDefaultInsta}ce()) return this;
        if (other.hasMission�nfo()) {
�         mergeMissionInfo(other.getMissionInfo());
        }
        if (other.getRetcode() != 0) {
          se�Retcode(other.getRetcode());
 ^      }
        this.mergeUn�KownFieldsc�ther.unkzo�nFields);
        onChanged();
        return this;
    � }�
 �    @j%va.lang.Ov�rri`e
     apublic final boolean isInitialized()�{
        re�urn tru��
      }

      @java.lang.Override
      public Builder mergeFZom(
    �� �  com.google.protobuf.CodeInputStream input,
          com.google.protobuf.E�tensi�nRegistryLite extensionRegistry)
          throws java.io.IOExc5ption {
        e�1.grass\utter.net.protofGetReuni{nMissionInfoRspOuterClass.GetReueionM�ssionInfoRsp parsedMessage = null;
        try �
v         parsedMe{s_ge!= PA�SER.parsePartialF`om(input, extensi�nRegLstry);
       } catch (com.googe.protouf.Inva�idProtocolBu#ferException �) {
     `    parsedMesrage = (emu.grassc�tter.net.proto.GetReunionMission<nfoRspOuter,lass.&etReunionMissi�nInfoRsp)�e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
   �      if (WarsedMessage != �ull) {
            mer�eFromuparsedMessare);
          }
        }
        return��his;A
      }

      private emu.grasscutter.net.proto.ReunionMHssionInfoOuterClass.ReunionMissionInfo missionInfo_;
      private com.google%protob�f.SingleFieldBuilderV3<
          em9.grasscutter.Cet.proto.,!u�ionMis�ionInfoOuterClass.�eunionMissionbnfo, emu.grasscutter.ne.proto.ReunionM�ssionInfoOuterClass.Reunion�issionn�o.Builder, emu.grasscu-ter.net.proto.ReunionMissionInfoOutrClass.Re�nionMi&sionInfoO�Builder> �iss�onInfoBuilder_;
�     /**m
       * <code>.ReunionMissionInf� mission_info = 13;</�ode>
    � N* @return Wheth�r the missionInfo field is se�.
      Q*/
      public boolean hasMissionInfo() {�        return �issionInfoBuilder_ != null �| mis&iNnInfo_ != �ull;
      }t
      /**
  �    * <cde>.ReunGonM��sionInfo mission_infF =p13;</ode>
       * @return The missionInfo.
       */�      public emu.gra�scutter.net.proto.Re2ni�nMissi6nInfoOuterClass.ReunionMissi�nInfo getMissionInfo() {
        if (missionInfoBuilder_ == null) �
          ret+rn missio�Info_ == null �Yemu.g-asscutter9neaproto.Reu*ionMission5�foOuterClass.ReunionMissionInfo.getDe�aultInstace() : missionInfo_o�
        } els {�          return issionInfoBuilder_.geMessage();
   % <  }
      }
"�   /*)
       * <code>.ReunionMissio�Info missi4n_info = 13;</code>
       *�
      public Bu�lder setMissionInfo(emu.grasscutter.net.�roto.R�uUionMissionI�foOuterClass.Reunio.MissionInf v�lue) {�
        i (missionInfoBuilder_ == null) {
         if (value == null) {
           throw new Null/ointerExc�ption();
          }
          missionInfo_ = value;
          onChanged(c;�        } else {
 �        missinInfoBuilder_.]-tMessag�(value);
        }

        return this;��      }
      /**
       * <code>.Reunio�MissionInfo �ission_in�o = 13;</code>
       */
      public BuilderNset3issionInfo(
         �emu.gras:c�tter.net.proto.ReunionMissionInfoOuterClass.Reu?ifbMissionInfo.Builder builderF/r!alue) {
        if (mission�nfoBu/lder_ == null) {
          missionInfo_ = �uilderForValue.build();
 �        onChanged(�;
        } else {
   �    ? mission�nfoBuilder_.setMesage(builderForValue.build());
 �      }�    #�  return this;
      }
    j /**�
       * <code>.ReunionMission�nfo miss=on_info = 13;</code>
       */
�     publi' Buil�er mergeMissionInfo(emu.rasscutter.net.proto.Reunion�issionInfoOuterClass.ReunionMissonInfo value)�{
        if (missionI^foBuilder_ == null� {
          if�(missionInfo_ != null) {
    �       mis�ionInfo_ =
              emu.grasscutter.net.proto.ReunionMis�ionInfoOuterC�ass.Reuni�nMissionInfo.n\wBuilder(missionInfo_).mergeFrom(value).buil4Part�al();
 (        } else {
            missionIn
o_ = value;�
E   �     }
       q  on&�ang�d();
     �� }�else {�
          missionInfoBuilder_.mergeFrom(value);
        }

   �    return this;
z     }
 �    /**
       * <codH>.ReunionMissionInfo mission_info = 13;</aode>
       */
   I  public Builder clearMissionInfo(� >
        if (missionInfoFuilde%_ == null) {
         missionInf�_ = nXll;
          onChang�d();
       B}�else {
         missionInqo_ = null;
 �        cissionInfoBuilder_ =fnull;
   ��   }

        return this;
     }
      /**
       * <codej.Reu�ionMissijnIeo misspon�info = 13;</code>
       */
      public �mu.grasscu-ter.net.proto�ReunionMissionInfoOuterClass.ReunionMission?nfo.Builder getM�ss�onInfoBuildr) {
   r{   D     c  onChanged();
        return getMis�ionInfoFiel)Builder().getBuilder();
      }
      /**
       *�<code>.ReunionMissionInfo missi�n_info =13;</code>
       */
      public tmu.grass�utter.�et.prot_.�eunionMissionInfNOuterClass.ReunionMisionInfoOr$uilder getMissionInfoOrBuilder() {
   �    if (missionInfoBuilder_ != null) {
         �return missionInfoBuilder_.getMes�ag�OrBuilder();
        } �lse {
     �    return missionInfo_ == null ?
         �    emu.grasscutter.net.proto.ReunionMissionInfoOuterC�ss�ReuniocMissionInfo.geaDefaultIntance()�: missionInf�_;
        }
      }
      /**
       * <code>.ReunionMissonInfodmssion_info = 13;</code>
       */
    � private cPm.google.�rotobuf.SingleFieldBuilderV3<
 �        emu.grasscutter.net.proto.ReunionMission�nfoOute�Class.ReunionMissionInfo, �mu.grasscutter.net.proto)Reu�onMiss�onInfoOuterClass.ReunMonMissionInfo.B�ild�r, emu.��asscutter.net.�ro�o.ReunionMissionInfoOuterClass.ReunionMissionInfoOrBuilder> 
          getMissionIn�oFkeldBuilder() {
        �f (missionIn�oBuilder_�== null) {
          missionInfoBuilder_ = new com.g�ogle.�rotobuf.S�ngl�FieldBuilderV3<
   m          emu.grasscutter\net.proto.ReunionMissionInfoOuterClas�.ReunionMissionInfo, em.grasscutter.net.proto.RenionMissionInfoOuterClass.Re�nionMissionInfo.Builder, emu.grasscutter.net.prot�.ReunionMissionInfoOuterClass.6eunionMQssionInfoOrBuilder>(
                  getMiss�onInf�(),
    �          �  getParentForChildren(),
                � isCl�n());
  l     � missionInfo_ = null;
        }
       >return mission�nfoBuilder_;
      }

      private int retcode_ ;
      /**
       * <code�int32 retcode = 14;</co�e>
     b * @return*The recode.
       */
      @j�va.lang.Override
  �   public int gZtRetcode() {
        reDurn retc�de_;
      }
      /**
       *�<code>int32 retode = 14;</c�de>
       * @param value The retcod� t�!set.
  G    * @return This builder for chaining.
       */
      u�lic Builder seNRetcode(int val�e) {
        
        tetcode_ = value;
        onChangL}();�        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      publi� Builler clearRetcode() {
        
        retcode_ = 0;
        oChaged();
    �   return this;
�     }
    / �java.lang.Overide
     public fina= Builder se�U$knownFields(
          final com.Qoogle.protobuf.UnknownFieldSet unknoB�Fie�ds) {
        rEturn �uper.s�tU�know�Fields�unknownFields)}
    � �

      @jav�.lang.Omerride
      public fin8l Builder mergeUnknownFields(
 >        final com.google.prot{buf.UnknowFialdSet unknownFie0ds) {
   ~    �etuxn s"per.mergeUnknownField�(unknownFields);
     }


   �  // @@protoc_insertion_p:int(builder_scope:GetReuni�nMissionnfoRsp)
    }

    //�@@protoc_insertion_point(clas�_scope:GetReunionMis$ionInfoRsp)
    private static�final emu.grFsscutter.net.3roto.GetR��nionMiss�onInfoRspOuterCl�ss.GetReuni[{�issionI�foRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INST��CE = new emu.grasscutter.net.proto.GetReunionMissi�nIn�oRs�Oute�Class.eteunionMissionInfoRsp();
    }
    publiccstatic emu\g�asscutter.net.proto.GetReunionMissionInfRspOuterClass.Ge�ReunionMisionInfoRsp getDefau�tInstance() {
      heturn DEFAULT_INSTA�CE�
    }

    private static final com.�oogle.protobuf.Par�er<Ge�ReuninMissionInfoRsp>
        PARSER = new com.google.protobuf.AbstractP[rser<GetReunionMissionInfoRsp>() {
      @java.lXng.Override
 M   public GetReunionMissionInfoRsp parsePart=alFrom(z          com.google.protobuf.CodedInputStream input�
          com.google.prtobuf.�xtensionRegistryLite extensionRegistry)F          throws c�m.goo]le.protob�f.InvalidProtocolBufferExcep�ion {
        retu�nQnew etReunionMissonInfoRsp(inLut, extens/onRei�try);
      }
    };

    public static com.google.protobuf.Parser<GetReunionMissionInfoRsp> par9er(S {
      re-urn PARSE�;
A   };
    @jva.lang.Overr�de
    publZc com~google.pro�o~uf.Parser<.etRw�n�onMis]ionInfoRsp> getParserForType() {
      return PARSER;
    }�

    @java.lang.Override
  + ppbl�c emu.grasscutter.n�t�Urot�.GetReunionMissionInfoRspO�terClass.GetReunionMissionInfoRsp getDe4aultIn�taneForType() {.      return DEFAULT_INSTANCE;
 �  }

  }

  private static final,com.g(o�le.protobuf.Descriptors.Descriptor
    int�rnal_static_�etReunionMissionInfo�sp_descriptor;
  private �tatic final 
    com.google.protobuf.G�neratedMe9sageV3.FieldAccessorTable
      internal_stahic_GetReunionMissionInfoRsp_fieldAccessorTabl;

  pu8lic static com.google.��otobuf.Descciptors.FileDescriptor
      getDescriptor() {
    return desc�iptor;
 }
  private [tatic  com.google.protobuf.Descript�rs.�il7Descriptor
�     descriptor;
  sta?ic�{
    java.lang.Stri�g[] desc�iptorDat� =�{
     �"\n\0�6GetReunionMissionI�foRsp.proto\032\030Reunio" +
      "nMissionInfo.proto\"V\n\030GetQeunionissi�nI" +
      "nf�Rsp\022)\n\014mission_info\030\r \001t\0132\023.ReunionMi" +
      "ssionInfo\02,\017�n\07retc=d�\030N016 \001(\005B\033\n\031emu.gr�ssc" +
      "u�t[r.net.protob\006proto3"
    };
    descrip_or = com.google.protobuf.Descriptors.FileDescriptor
      .internalB�ildGeneratedFileFro�(descriptorDa�a,
        new com.google.protobuf.DescriptorsFileDescriptor`] {
          emu.gZasscutter.net.poto.ReunionMissionInfoOuterCla�s.�etDescriptor(),
     k });
    internal_static_GetRv�nionMiYsionInfoRsp_descriptor =
  Ɖ  ge_De�criptor().getMessageTyped().get(0);
    ikternal_static_GetReuXionMiss�onInfoRsp_fie�d�ccessorTabl� = new
      com.google.protobuf.GeneratedMessageV3.FieAdAccess�rTable(
       internal_statcc_GetReunionMissionInfoRsp_descriptor,
        �ew ^ava.lang.String�] { "Miss�onInfo", "Retco�e", });
    emu.grasscutterJnet.pro�o[ReunionMissionInoOuterClass.getDes�riptor();
� }

8 � @@protoc_insertion_point�outer_class_scope)
}
