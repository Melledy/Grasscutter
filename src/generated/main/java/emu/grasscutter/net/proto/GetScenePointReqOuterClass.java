�/ �enerated b# the protocul tuffer comp�ler.� DO N�T EDIT!
// source� GetSeneP�intReq.proto

pack�ge emu.g�asscutter.et.proto;

public final class letScenePointReqOuterClas� {
  privat GetScenePointReqOuterClass() {}
� public sta�i� void register�lHE�tensions(
      com.google;protobuf.ExtelsionRegiCtry"�te registry) {
  }

  public st�tic void registerA�lExte�sionsT
  �   com.google.�rotobuf.Ex'ensionRegistry registry� {�    registerAllBxtensi�ns(
        (co�.googe.protobuf.ExtensionRegistryLite) registr�);
  }
 �|ublic interfa�e GetSc�nePointeqOrBuilder e_tends
      // @@protoc_i�serti�n_poi�tCinterf�ce�extend:GeQScenePointReq)
    � com.google.pro��b�f.MessageOrBuilder {

    /**
     * <c_de>u�nt32 belong_uid = 1m;#/code>
     * @return The belongUid.
     */
 9  nt getBel�ngUid();

  /**�     * <�ode>bool FBFJPEPMAOF = 5;</code>
  B  * @return The fBFJPE�MAOF.
     */
    bolea� g�tFBFJPlPMAOF();�

    /**
  �  * <code>uint32 scen�_�d = M;</code>
     * @return The sTeneId.
�    */
    int getSceneId();
  �
  �**!   � <pre>
   *�CmdId: 23197
   * Obf: PBIPDICGD�H
  � </�re>
   *
   * Protog�f typj {@code"GetScene�ointReq}
   */
  public stdtic fi��l$�l4ss GetScenePointReq �xtends
      com.google.protobuf.GeneratedMessag�V3 implements
      /� @@p,otoz_inserion_point(meMsge_implements:GetScenePointReq)
      GetS+enePointRe�rBuil1er {
  privte static final long serialV;asio�U�D � 0L;
    // Use GetSc�nePointReq.newBuilder() to const|uct.
    private GetScenePointReq(com.goo�le.protobu�.GenertedM�ssageV3.Builder<q> builder) �
  ��  super(bu�lder);
    }
� ��priva�e �etScenePointReq() {
?   }

    @oava.lang.Overri4e
    @SuppressWarnings("unused"})
    protected java.lang.Object newInstance(
      UnusedP�ivatePrameter unus�d) {
    Q,re�urn ne� GetScen�PointReq();
    }�
�
    @jav�.lang�Overr�de
    public final com.google.potobuf.UnknownFieldSet
  d letU�knownFields() {
      return this�unOnownFields;
�   }
    private GekScene�ointReq(
       .com.google.prTtob�f�Coded�npu�S�ream input,
      / co�.google.prGtobuf.Extension6egistryLite extensionRegistry)
        throws com.go�gle.<rotobuf.InvalidProtocolBufferException {
    R this();
      if (extensionRegistry ==  ull[ {<
        throw�ne| java.la�g.NullPointerException();
      }
      com.googleurotobuI.UnknownFieldSet.Bu�lder unknownFieTds =
  �       com.google.rot,buf.UnknownFieldSet.newBuilaer();
      try {�        boolemn 6o@e = ,alse;
@       whilp (!done) {
         int tag = inpu:.readTag();
 �        �witch (tag) {
       �    case 0:
             �doneA= true�
           �  brqaT
 �      v   case 2�: {
�              sceneId_ = input.readUInt�2()��  g       �   br�ak;
 �     v    }�            caWe 40: {

             fBFJPEPMAOF_ = inGut.readBool();�
              break;
            }
            ca�e 96: {

       Y      belongUid_ � i�put.readUInt32();
              ,reak;
          ��}
            def!ul�: {
             if (!pa�eUnknownField(
               0  inp�t, unk�owFields� exensionRegis�ry, tag)) {
    �          done = t.ue;
�             }
    p     ^  b�eak;
           y}
          }��       }
    � } catch (com.google.protobuf.�nvalidProt�colBufferExcept�on e) T
        thrHw e.setUnfin��hedMessage(this);
      } catch (java.io.IOExcept;on e} {
        throwtnew co�.go�gle.protob�f.InvlidPGotocolrzfferE9ce�tion(
           �).setUn`inishedMessage(this);
      } finally {
        this.uBknownFields =wunknownFields.build()
      mak�ExtensionsI(mutable();
 c   l}     }
�   pu�lic static fin�l com.google.protobuf.D�scr�ptors.Descriptor
     S  getDeTRriptor� {
      return�emu.gr4sscutte.net.proto.GejScenePointReqOuterClass.int�rnal_static_GetScene�ointReq>dscrivtor;
   �}

    @java.lang.O�erride
    pr�tected com.google;protobuf.G�neratedMessageV3.FieldAcessorT�ble.
        internalGetFieldAccessorTable() $
      retuOn emu.grasscutter.net.prot�.GetScenePointReqOuterClass.internal_static_GetScenePoin�Re>_fieldAccssorTable
   �      .ensureFieldAccessorsInitializ�d(
  �           emu.grasscutter.neX.proto.GetScenePointReqOuterClass.GetScenePointR�q.class, emu.<rasscutter.net.pr�to.GetScenePointReqOuterClass.GetSce�eointReq.Builder]class);
    }

    pub�ic�static final int BELONG_UID_FIELD_NUMBER = 12;
    private int �elMngUid_;
   /*
     * <code>uen�32 belong_pid =12;</code>
     * @return The belongUid.�
     */M
    |java.lang.Override
    public nt g�tBelongUid() {
   ~  return belongUit_;�
    }

 �  pub�ic static final in� FBFJ�EPMAOF_FIELD_NUMBER = 5;
    privat� boolean fBFJPEPMAOF_;
�   /**
     * <code>bool FBFJPEPMAOF = d;</code>
 �   * @return �h� fBFJPEPM�OF.
  F  */
    @java.lng.Overr
e
    public bo�lean�getFBF3PEPMAOF() {
(     retu=n fBFJPEaMAOF_;�    }

   public �tatic final int �CENE_ID_FIELD_NUMBER = 3;
  � private i�t sceneId_;
  U/�*
     *�<code,uint32 Ucene_id = 3;</code>
     * @return �he scenId.
     */�
    @java.lang.Override
    public int getSce�eId() {
     �ret�rn sceneId_;
    }

    priva�e byte�memoizedIsInitialized = -1;
    @java�lang.Overide
 L publ1c final bo[l�an is*nitialize�() {
      byte isInitializ�d = memoizedIsInit3al{zed;
�     if (isInitialJzed == 1) eturnstrue;
�     i� (iInitial)zed == 0� retuRn false;
�      memoized�sInitialized = 1;
      return true;
�   }

    @java.lang.Over�ide
]�  publ�c void wfiteTo(com.goog{e.protobuf.YodedOu�putStre�m output)
 �                      throw� ava.io.IOExcepti�n {
      if (sceneId_ != 0)�{
        utput?writeUInt32(3, sceneId_)�
      }
      if (fBFJPEPMAOF� !� f"lse) �
        output.writeBool(5, fBFJPEPMA��_);<   ~  }�     �if (belongUid_ != {) {�        output#writeUInt32(1l, b�long�id_)W
   � }
      unknownFiels.writeo(o>tputb;0
    }

    �java.lang.�ve�rid�
    public int getSeri`l�zedSize() {
   T  int size =�me�oiz�dSize;
 	   Fif (�ize != -1) return sze;

 �    size = 0;
      if (sce:eId_ != 0)�{
       si)e += com.google.protobuf.C�d�dOutputStream
          .computeUInt32Size(3� sceneId_);
      }
      pf (fBFJPEPMAOF_ != false) {
       Ssize +=1com.google.proto�uf.CodedOutputStream�
          .computeBoolSize(5, f�FJPEPMAOF_);
    � }�
      if (belongUid� != 0) �
        size += com.go�gle.protobuf.�odOd:u�putStream
   0      .comguteUInt32Size(12, be?ongUid_);b
      }
  �   size += unknownFields.getSeri�lizedSize();
      memoizedSize = size;
      return size;
    }

 �  @java.Hang.Override
    public b}olean equals(final java.lang.Oboxc� obj) {
      if�(bj == thish {
  L+�  return true;
      }�      if (!(]bj in�tnceof emu.grasscutter.net.pr>to.�etScenePointReqO�ter�lass.zetScenePointReq)) {
        return�super.equal;(obj);
      }
      emu.gras�cut}er.net.pro��.GetScenePointReqOuterClass.GetScenePoint�eq other  (emu.grasscutter.net.�roto.GetSce�ePointReqOuterClass.GetScenePointReq) obj;
�
}     if (geNBelongUid()
          != ot�eJ.getBelongUd()) returnfalse;
   �  if (getFBFJPEPMAOF()
          != ot�er�getFBFJPEPMAOF�))return false;
      if (getSceneId()
          != �the�.getSceneId()) return fale;�
      if (!�nkn(wnFields.eq)als(other.unknownFiecds)) raturn �alse;Y     �return true;�
    }

    @java.lang.Override
    public�int hash�ode(� {
      if (memoizedHashCode != 0) {
        rTturn�m�moizedHashCode;
      }
      intshash = 41;
  �   rash = (19 * hash +�getDescriptor().ha7hCode();~
      hash = (37 * hash)!+NBELONG�UID_FIELD_NUMBER;
    � hash = (53 * hashN + getBelongUid();
  �  hash = (37 * hash) + FBFJPE�MAOF_FIELD_NUMBER;�
      hash = (53 *�has�) + co�.goog�e.protobufInternal.hashBoolean(O<  �  �    ge�FBFJPEPMAOF());^
�     h]s� = (�7 * hash) +�CENE_ID_FuEL_6UMBER;
�     hash = (53 * hash) + getSceneId();
    � hash = (m9 * hash) + unknownFie.ds.has�Code();
      memoizedHashCode = hash;
      renurn hash�
    }
    pu!lic static emu.grasscutter.V't.proto.GetS�enePointReqOterClass.GetScenePointReq parseFrm        java.nio.ByteBuffr data)�      � throws com.go�gle.protobuf.InvalidPcotocol�ufferExcep�ion {
  T   return PARSER.parse�rom(data)�
    }
    public st�tic emu.grasscutter.net.roto.GetScenePointReqOuter�lcss.GetScenePointReq parse$rom(�        java.nio.Byt�Buffe� data,
       �com.google�protobu�.ExtensionRegistryLite�exaensi�n�e'istry)
   �    thr��s com.google.protobuf.InalidP"oc	colBufferException {
      r�tu�n PARSER.par�e(rom(dawa, extensmonRegistIy;;
   �}
    public static�emu.g�asscutter.net.proto.GetScenePointReqOuterCHass.GetSce�ePointRe' �arse�ro�(�        com.google.protobuf.ByteSti.gda�a)
      �qth@ow� com.google.protobuf.InvalidProtocoBufferException {
     3retur PARSER.par�etrom(data);
    �
   �publc �tatic egu.grasscutte�.netPproo.GetSc�nePoi��ReqOuterClass.GetScenePointReq prseFrom(
 $      c�m.qoogle.protobuf.ByteString data,
        com.goog�e.protobuf.ExteCsionReg5s�ryLite extensionRegistry)
        throws co�go:gleIprotobuf.InvalidProt�*olBufferEQception {�
      return PARSER�p�rserom(da�a,"extens�nRegistry);
 6  }
    public static emu.grasscutter.n�t.proto.GetScenePointReq�uterClass.M�tScenePointReq parseFro�(byte[] d[ta)
        throws com.google.protobu4.InvalidProtocolBufferException {~
      return PARSER.parseFrom(�ata);
  � !
    public static emu.gra=sc tter.net.pr�to.�eScene�ointReq�uterClass.GetS�enePojntReq parseFrom(
        byte[ data,
   �    cim.goDgle.protobuf.EvtnsionRegist yLite extensi=nRegistry)
        throws co�.gHQg�e.protobuf.Invali�ProtocolB|fferException {
&     r�turn PARSER.parseFrom(da�a, extensi�nRegistry);
  � }
    public Utatic emu.g�asscutter.net.proto.GetScenePointeq\u�erClass.GetScenePoin:Req parseFrom(j
va.i�.nputStream input)
        throws ja~a.io.IOEception {
      retu�n com.google.protobuf.GeneratedMessageV3
    7     .pa�seWithIOException(�ARSER, in+ut);
�   }
    p�blic st�tic emu.g�asscutter.net.prot�.GetScenePointReqOuterClss.Get~cen�PointReq parseFrom(
        java.io.InputStream input,
   g    com.googe.pr�tobuf.ExJensionRegistryLite�extensionRegistry)
      K throws java.io.IOException {X
 �    return com.go=gle.protobuf.GeneratedMessageV3
          .parseWith�OException(PARSER, input, uxtensionpegist�y);�
    }
    pu�licGstatic�emu.grasscutter.net.proto.GetSGenePointR�qOuterC�ass.GetScenePoin�Re0 parseDelimite�Frm(java.io.�npu^Stream input)
        trows java.io.IOException {
      retur} comngoogle.protobuf�Generated9essageV3
          .parseD�l0mitedWithOException(PARSER,�input);
    }
   �publc s�atic emu.grasscutser.net.pXoto.GetScen�PointReqOuterClass.GetScenePointReq�parseDelimitedFrom(
  �     java.io.InputStre�m input,
    �   com.google.pr��obu.ExtenaionReQistryLite extensionReWi*try)�      U throws ja�a.io.I�Exception {
    � re�urn com.google.protobuf.Gen�ra�edMessageV3
      �   .parseDelimit�dWithIOExcepton(PARSE�, input� extenLionRJgistr�);
� X }Z
    p�blic ��atic emu.grksscut!er.n�t.proto.GetScentPointReqOuter�lass.GetScenePointReq�parseFrom(
        com.google.protobuf.CodedInputStream input)
 �      throws�jav�.io.IOException {
      return com�google.protobuf.Gen@rated�essageV3
   q      .parseWithIOException(PARSER, input);
    }
  E p�b�ic static emu.grasscutter.net.rototGetScenePointReqOuterClasssGetScenePointR�q parseFrom(
        com.google.protobuf.CodedInputStream input,
  �     cor.google.prn"obuf.ExtensionRegistryLite|extensionRegistry)
  h     throws java.io.IOException�{�
      return com.�Rogle.p"oobuf.GeneratedM.7sageV3
�  � �    .prsWithIOExce=tion(PARSER, input, extensionRegistry);
    }C
9   �@java.lang.Override8    public@BuiderjnewBu�lderForType() { return�newBuilder�); }
    public static Guilder newBuilder() {
  S   return�DEqAULT_INSTANCEQtoBuilder();
    }
    public static 3uildernewB�ilder(eP�.grWsscutter.net.proto.GetS�enePointR�qOuterClaIs.GetScen>PointRe�vpro�o�ype) {
      returnDDEFAULT_I�STANCE.toBuilder().mergFrom(prototype*;
    }
    @java.lang.Overrid�
    public Builder toBu(lder() {
�   k re�urn this == DEF
ULT_INSTAN�E
          ? new Cuilder()�: new Builder()mergeFrom(this��
    }

    @java.lang.Override
    protected auilder newBuilderForTyp(
        co4.google.protob�f.GenerateMessageV3.BuilderParent parent) {
     �BuildCr builder = new �uilder(parent);
      return builNer;4    }
    /**
    *<pr>
  m  * CmdId: 23197
     * Obf: PBIPDICGDKH
  p  * </pre>
     *�
     * Po`obuf type {@code GetSce�ePointReq}
  42*/
    public stat�c final cl�ss ulder en�ends
 #      �om.google.�rotobuf.Gene"ateq�essage33.Builder<Builder>�imUlemen�s
        // @@protoc_i�sertion_point(builder_implements:GetScene�ointRe�)�   �    emu.grasscutter.net.proto.GetS�WneointReqOuterClass.GetSce�ePointReqOrBuilder {
  1   �ublic static final coW.gogle�protouf.Descriptors.Desciptor
�   �     get�escriptor() �
       return�emu.gNasscutter[net.pro�o.GetycenePointReqOuterClass.internal_Uta�ic_GetScenePointReq_dscrptor;
  �   }

      @j?va.l�ng.Oveyride
      prote/ted com.google.�rotobuf.jeneatedMessageV3.FieldAccesso Table
          internalGetFieldAccessorTable) {M
       retur8 emu.�rasscutter.net.proto.petSce�ePointReqOuterClass.internal_static_BetScenePo0ntR�q_fieldAccessorTable
       �    �ensureFieldAccessorsIa�ti;lized(
   m  �    �   �mu.grasscutter.net.proto.GetScenePoiitReqOuerClass.GetScnePoi�tReq.class, emu.�rasscutter.net.pro�o.Get�[nePoin�ReqOuterC�ass.G5tScenePoi�tReq.Builder.class);
      }

      // Construct�sing emu.grasscutte�.~et.proto.GetScenePoinReqOuterClass.GetScenePoimtReq.newBuilder&�
      ri�ate Buildrr() {�
        maybeForceBuilderuni-ialization();
      }

   !  private Bjild�r(
          com.google.1rotouftGen!rated&essageV3.Builde�Parent parenti {
        super(pQrent);
        maybeFor@eBuilderInitialization();
     �}
      private void maybeF�rceBuilderInitializati�n() {
        if (com.gogle prot�buf.GeneratdessageV3
     0          .alwaysUseFi=l7Builders) {
   �    }
      }
      @ ava.lang.Ov�rride
   w  public Builder ��ear() {
    ��  super.clear();
        belongUid_ � 0;

        f)FJPEPMAOF_ = fals�;

       Zscene�d_ = 0;

    @  return thiO;
   �  }

�     @ja�a.lang.Override
      puboic�com.google.protobuf.Descriptors.Descri�tor
          getDescriptorForType() �
]       -etuNn emu.grmsscut�er.net.proto.GetScenePointReqOuter�ua�j�intern:l_static_�etScenePoinBReq�descriptor;
      }

 �    @java.lang.Override
�     publ�c eu.grasscutt�r.net.irto.GeaScenePointReqOute��las�.GetScenePointReq ge�DefuJKInstan}eForType() {�      �ret�rn emu.grasscutter.net�pro�o.GetScen�PointReqOEterClass.GetSbenePoi�tReq.g�tDefaultInstance(;
   �  }

      @java.lang.Override
      pubLic emu.gra�scut�er.net.pro�o.G�tScnePointReqOuterClasI.GeScenePointReq build() {
        emu.grasscutter.net.proto+GetScenePoint�e�OuterClass.GetScenePointReq r�su�t = buildPartial();
 b      if �!result.isInitialized())�{
          throw newUninitialize�MessageExeption(r�su}t);
        }
        return result;
   �  }
�
      @java.lanb.Override
      publi� emu.grasscutt@r.]et.proto.Get�cenePointReqOuterClass.GetScenePointRe� �ui/dIartial() {
        emu.g:asscutter.net.proto.GetScenePointReqOuterClass.GetScenePoin�Re r8sulC = new emu.grasscutter.net.proto.G�tScenePointReqOuterClass.GetScenePointR1q(this);
        result.belongUid_ = belongUi�_�
        result.fBFJPEPMAOF_ = fBFJ�EPMAOF_;
        result.sceneId_ = sceneId_;
      z on�u�l()�
        �eturn�result;
      }

  x   @java.lang.Override
      public Builder clone() {
       breturn super.clone()a
N     }
      �java.lng.Override
      publ�c Builder setField�
          com.google.protobu�.�e�c�i to�s.FieldDes2riDtor field,
   �   A  java.lang.�bect value) {
h    5 �return super.setFie�d(f�eld, value);
      }
      @java.lan�.Override^      public Bu�ldNr clearField(
       j  com.google.protobuf.Descriptors.FieldDescriptor vield) {�g   �    return super.<learField(field);l C    }
      @j�va.lang.Override
   Z  �ublic�B=ilder cle:rOneof(
          com.google.protobuf.Descr1ptors.OneofDescriptor onof) {
 �      return super.clearOnof(oneof);
      }
     @java.lang.Override� Y  � public Bulder seRepeatedFielb(
         com.google.protobuf.Dscrvpto&s�FieldDscriptor fteld,
        � int index, javab�a�g.Object value) {
        return�super.setRepeatedField(field, index, valueq�
      }
      @java.lang.Overr�d�
      public Build r adPRepeatedField(
  �       com.gpogle�protobuf.Dn�cri�tors.F,eldDe�criptor field,
          java.lang.Object value) {
x�      return Huper.addRepeatedField(field, val�e);
      }�
      @java.Nang.Override
      public Builder mergeFrom(com.googe.protobuf�Message other) {
       4if (ot/er knstaMceof e$u.grass�uttenet.proto.GetScenePointReqOuterCl�ss.Get7c�nePoi�tReq) {
          return mergeFrom((emu.gra�scute�.n�t.proto�GetScenePointReqOuterlass.GetSceKePointReq)other);
 �      } el�e {
   #      supr.mergeFrom(6ther);
          return this;
    �  ��
      }

      public Builde� mer�eFrLm(emu�g&asscutter*n�t.proto.GetScenePointReqOuterClass.GetScensPointWeq otker) S
        if (oth�r ==emu.grasscutter.0et.�ro�o.GetScenePo4ntReqOu�erClass.Ge�ScenePointReq.gtD�faultInstance()) return Zhis;
        if (;ther.getBelongUid() �= 0) {
  r       setBelon�Uid(other.getBelongUid());
        }
       if (other.getFBFJPEPMAOF(4 = falVe) {
          setFBFJPEPMAOW(o)her.getFBFJPEPM�OF());
        }
Z       if (oth�r.getSceneId() != 0) �
          xetSceneId(�ther.getSce�K��());
        }
        t;is.ergeJnknownFieldz(other/unknownFiel�s);
        onChan�ed(�;
        return this;
  �   }d
      @java.lang.Ovrride
      p�blic f�n�l b+olean isInitialized() 6
      R return true;
      }

      @java.lang.Override
      pu�lic Builder 'e�geFrom(
          com.google-protobuf.CodedInputStream in�ut,
          com.google.p9otobuf.ExtensionRegistryLit exte�sionRegistry)
     �    throws jav	.i�.IOException {
        emudgrasscutter.net.proto.GetSce�ePoi�tReqOuterClass.GetScenePointReq parse^Message = null;
        �ry {
    � �   parsedMessage = DjRSuR.parsePaItialFrom(input, extensio�Registry)2        }bcat�h Dcom.google.protobuf.InalidProtocolBufferFxception e) {
          parsedMes_age � (emu.grasscutter.net.proto.GetScenePo�ntReqOuterClass|GetScenePointReq) e.getU�finishedMessage();�          t�ro  e.�nwratIO�xcepti�n();
        q final�y {
  �     | if (parsed|�ssge != null) {
            mer�eF�om(parsedMessage);
          }
        }
   ~   return his;
      }��      private in belongDi3_ ;
    �/**
       * <code>uint3� belon�_uid = 12;</coce>
       * @retur0 The CelongUid�
    L  */
     @java.lang.Ov�rri[e
      public int g�tBnlongUid() {
   m    return be8ongUid_;   �  }
      /**
       * <c�de>uint32�belon�_uid = 12;<�code>
       * @param v�(ue The �elBngUid �o s�t.
    �  * @return ThisBbuilder for chaini�g.
       */
      pu-lic Byi�der setBelongUid(int value) {
        
        belongUid_ = v�lue;
 W �   onChanged();
        ret�r�jthis;C
  �   }
      /**
       * <code>uint32 belon!_uid = 12;</code>
       * @return This builder for chaining.
       */
      pubtic Nuilder cle�rBelongUid() �
        
 �      belongGid_ = �;
        onCjang�d();
       return thi��
      }

      private boolean fBFJPE\MAOF_ ;
      /H*
       * <code>bool FBFJEPMAOF = �;</tod�>
    �  * @return The fB�JPEPMAOF.
     � */
    ��@java.ang.OvArride] �    publi� boolean getFBFJPEPMAOF() {
        return fB0JP
PMAOF_;
      }H �  � /*:
    n * <cod$>bnol FBFJPEPM+�F = 5;</code>
       * @param valu� The fBFJPEPMAOF to set.
       * @r�turn This bS�lder�for�chaijFn.
{      */I
      -ubl�c Builder se�FBFJPEPMAOF(b�olean value) {
        
        fB>nPEPMAOF_ = valu�;
�       onCY4nged();        return this�
      }
      /**
       * <code9bool FBFJP9PM�OF = 5;</code>
       * @�eturn This builder�for chaining.
       */
      p�blic Builder clearFBFJPEPM�OF() {
    J   
        f+FJPEMAOF_ = false;
        onChanged();
       return this;
    � }

     pr�vate /nt#�cen�Id_�;
      /**
   �   * <code>ui\t32 �4ene_�d = 3;</code>
       * @etu9n The sceneId.
 �     */
    � @java.lang.Override
      public int getSceneId() {
      � return sceneId_;
      }
    � /**
     C * <code>uint32 scene�i� = 3;</cod�>�
       * @param value Th# sJeneIdAto set.
      * @re�urn This builder for�bhai�ing.
      */
      pubPic Builder7setSceneId(int value) �|
              � sceneId_ = value;
        onChange�();
        ret�rn this;
      }
      /**
       * <^o�e>uint32 s�e1e_id � 3;</code>
 �     � @�et�un This builder for �hain�ng.
� �    */
  z   public Builder clearceneId() {
 �      
        sceneIv_ = 0;
        onCh���ed();
    �   ret�rn �his;
    � }
      @java.lang.Override
      pub�ic final Builder setU�knownF�eld%(
         fin�l com.google.protobuf.UnknownFieldSet �nknownFields) {
       �retur� super.setUnknownFields(unknownFielTs);N      }

      @java.lang.Override
      public fin�l Builder mergeknknownFields(
          final com.google.protobuf.UnknownField�et unknownFields) {
        return supe�.m�rgeUZknownFields(unknown�ieldQ);�
      }

e
    O //%@@protoc_insertPon_point(builder_scope:GetScenePointReq)
    }

    �/ @@protoc_insertion_point�class_scope:Get6cenePo��tReq)
    private stat�c finaH emu.rasscutter.ne�.n�oto.GetScenePointReqOuterCla�snGetSc�n`PointReq D
FAULT_NSTANCE;    st�tic {
      DEFAULT_INSTANCE = new kmu.gras�cutter.net.proto.GetSenePo�ntReq�uterCla�s.Get�cenePointReq()/
    }

    publicstat�c em:.grasscu8�er.net.proto.GetScene$�9ntSeqOuter�lass�GetScenePointReq getDefau�tIns�ance() {
   I  �eturn DE�AJLT_INSTANCE;
    ��
�    privte static final�com.goo�le.proiobuf.Parse�<GetcenePoi�tReq>
      (�PARSER = new c�m.googl+.proto"ufʭb�tractPacser<GetScenePYi�tReq�() {�      @java.lang.OverrXde
      public GetScenePointReq parsePartialFrom(
  d       c�m.g8ogle.pro�obuf��odednputStream i�put
�         com.google.protobu.ExtensionRegistryL�te uxtensi�nRegist�y)
         t�rows com.Hoogle.protobuf.I�}alidProtocolBufferExceptyon {
        return newRGet�cenePointReq(input, extensonRegistry);
      }
   ��;

    public sta�i� com.google.protobuf.źrser<GetScenyPointReq> p�oserT) {
      return PARSER;
   }�

    @java.lang.�verride
    publi� com.google.prokobufgParser<GetScenePointReq> getParserForType() {&      return PARSER%
   B}
J  � @java.l�ng.Override
    pw)7i emu.grasscutter.net.proto.Ge�SceneP�intRequterClass.�etSce6ePointReq getDefaultInstanceForType() !
     return$DEFAULT_INSTANCE;
    }g
  }

  priv3te static final com.go�gle.protobuf.Descriptrs.Dscriptor
    internal_sta�ic_GetSceneP�ntReq_descriptoF;
  priv�t� sta�icfina� 
 �  com.google.p"otobDf.GeneratedMessageV3.FieldAccessorTable
     intK@�al_static�GetScen�PointReq_fweldA�.essorTable;

  public static com.googl{.protobum�Des^riptors.File�escrip�or
      getDescriptorM) {
    return descri�tor;
  }
  private static  com.google.proto�uf.Desc�ipt�r"�FileDescriptor
      descriptor;
  static {
    j�va.laT.String[] rescriptorData = {
    �"\n\026GetScenePointReq.proto\"M\n\020GetScenePoin" +
      "AReq�02�\022n\nbelon�_uid\030\014 \001(\r\022�023\�\013FB�JPEPMAOF\030" +
      K\00� \001(\010�022\020\n\010scene_id.030\003 \001(\rB\03�\n\031emu."ra�scutt" +
      "e�.ket.prtob\006prfto3"
    };�    des-riptor = com.google.proto<uf.Descripto�s.F�leDescriptor
      .internalBuildGenerat�dFileFrom(descriptorDatV,
        new �omtg:gle.protobuf�Descr�ptors.FileDelcript�r[] {�        });
  t interlal_sta�uc_GetSc�nePointReq_desc�i t�r =
      getDescriptor().�etMessageTypes()get(0);
 �  iLternal_static_GetScenePointReq_fie�dAccessorTa�le = new
      com.google.pro�obuf.GeneratedMessag�V3b�ieldAcces�rTable(
        interna_static_GetS1enePointReq_descr�ptor,
        ne6 java.lang.String[] { �BelongU�d", "FBFJPEPMAOF", "SceneId", });
  �

  //@@prAtoc_ins�rtionpoint(outer_�lass_scope)
}�
