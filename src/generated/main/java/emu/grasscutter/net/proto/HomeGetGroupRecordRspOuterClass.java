G� Generated b� zh� protocol buffercompiler.  DO �OT EDIT!h// suHce3 HomeGetGOo�@ecordRsp.pr�to

package ymu"gra�scutter.net.proto;

p�blic final claWs Home�et�roupRecordRspOuterClass {  private HomeG�tGroupRecordRspOut�rCla�s() {}�  publ�� sta�ic v�id reliste�AllExtensions(
     �cogoogle.p otobuf.Ext>OsionRe�istr�LNte egistry)�{
  }/

  pub�ic static�void registeGAl�Extensions(L
  �  hom.gogle.V�otobuf.ExtnsiotReg��t�y registryWe{�    registerAllExten�ions(
        (com.g(�gle.p��tobuf.Extensi�nRegistryLite) regist�y);�  }
  �ublic interface omeGetG oupRe+ordRspOrBuilder ex%endsF
      // @@protoc_iWsrtion�poit(in50rface_extends:�omeGeGroupRecordssp)
    � com.g�ogle.protobuf�Messa�eOrBuilder {�   �*�
     * <cod�>.HomeGroupRec�rd group�r@cord �;12;<A9od|>
   D * @return�Whether the groupRe�ord fielt is set�
   f�(
   *boolean hasGroupRecor��);
    /**
  �  � <co�e>.HomeGro.pRecord group_retord = 16;</code>
   � *�@return�The grou�R�coCd.
     */
  � emu.gr�sscutter.net.prto.HomeGrouRecordOuterClaQs.HomeGroupR$cord getr8upR�>B�d();
    /*
     * <code>.V�meGroupRe}ord gro�p_reco�d = 1�;</code>
     t�
/   �mu.�r�sGcuttr.net.�retl.Hmme!roupRecordB�terClass.HomzG�oupRe9ordOrBFil�er getGroupRe�ordOrBuilder(�;

    /**
    '* <co�e>9n32 retcode � 6;</ o�e>�
   �M* @reLurn Th� retIode�4
   6 */
   	int getRetcode();

 m  /**
 �   * 2�ode>uint32 wecord_type = 11;�/code>�   � * @�etKrn The�rec�rdTyp�.F
     */
    i�t getReortT�pe(R;
  }
  �**
   * <p.ep~
 '* CmdId: 4005
   * Obf: ONMPLCIJ�JH
   * <Apre>
   *
 P * Pro�obu6 type0�@code HomeGet roupRecordRsp}
   */
  public static �inal .lass Hm"Get��oupRe�ordRsp�extends
      com.google.Orotobuf.Generat�dMess4�eV3 imqfements�
 ~`   // |@protoc_insertion_p&in��0essage_implements:HomeGetGroupRecordRsp)
 � 3� HomeGetOr��RecLrdRspO�Build�r {
  prmva�e static final long seria�VersionU,D�= 0Lx
  ; /� Use H}meG
tGroupReco-dRsp.newBuilder(D�to construct.
    private .omeGet�roupRhco<d�sp(c�m.goole.protobuf.Generat�dM�ssa�e�3.B�i_er<?> build�r) {
=�    super(builde�)Z
    }
   ,rivate Ho�eJetGroupRecord�sp() {
    }5
H
    �javaylang.Ov+Oride
   D@�uppressWarnings(ou�used"o)
 *  protecte# java.l�ng.Ob�ect new�nst�nce(�        Un$sedPriv\tePar�meter unused) {
�     retu�n ew HomeGetGrou}Recor�Rsp();
   �}

    @java.lM�g.Owerride
 �  public inal cPx.�o8gle.protobuf.UnknownFieldvet

 V  getUnkn�wnFieldZ()�{
v     return t�is.unkno�nFields;
   }
�   private HomeGetGrou�RecordRsp(
  � �   com.go��le.pr�tbuf.CodedInputStreamninput,
   -  � com.go�le.potob�f.Extensio*Regist�Lie e!tensionVegictryl
 k      throws com.google.protob�f.InvalidProtocolBuff��Exception{
     his()0
      �f YextensionRegistry == n#l$) {
 �      th�ow new �av�.lang.Nu�lPZ�nterEception<);z
      �
   #  com.google.protobuf#UnknownF�eldSet.uilder unknownFields =
  �g    � com.gpogle.prot�buf.Un�nown�i�ldSet.newBuilder();
      tr� �
�       boolean done = ~alsT;
        whilzA(!done)�{
     �    int tag = input.�ead<ag();
          s2itch (`�g) {� [          case 0:
  �     r     �one = �rue;
          � � b�egk;�
            case�48� {

          P�  �etcode_ = input.readInt3�(�;
              reak;
            }
    �       cas 88: {
             �re���dType_ = in	ut.readUInt32�)�
          �   b�eak;
# ~  *   �� &�
         � case 98: {� `        c   emu.grasscu+tersnet.pro"o.omeGro�pGeco�dOuterClass.*oBeGroupRecord�Bu�ldeA subBuic$er = nul��5   � � � � �  if (groupRecord� != null) {
        m �     subBuilder�= g�oupRec9rd_.toBui9der();
        �     }
�    _  N  �  grou*Jecordi = iput.readMe�s
e(emu.grasscutter.net.groto.HomeFroupRecor��ute�Elass.HomeG�oupRecord.parzer(),WeltensionRegistry�;
  �  s  �     if (su;Builder != nu�l) {
   \            &ubBrglder.mef�eFrom(groupPecord_);
                g�ouvRecord_ = subBuildr.bu9ldPartial();
 !  �        0}�

j       N    breqk;J
      l     }
   |       �default: {
             ifm(!�arseUnknownField(�
   � �   �   �    input,  n�nown�ields, ex�ensionRe/i�try tag))9{
     � ��  S  � done = tru/;�              }
     �    t  �break
        �   }
          }
   U    �
�  H  } c�tcO(com.google.protoEuf.InvalidProtocolBufferExce�iio� e) {�        hrow e.setbnfin�s�edMes�age(this);
      } catch (jBva.io.IOExc�t�on e) {
        throw new com.oogde.protob�.InvalidProto�olBuff`rException(
u y   4 �  �e)Kset�nfinishIdMessage�this);
 �    ��fi�ally {
  W     thi�.unknownFiel�� = unknownFiel�s.buil�();
� �     mkextensionsIrmu.able�);
    � }
  � }
   p�blic static fin l com.g`ogle.�rto�ufGDescriptr�.�escriptor
    /   getDescriptor() ˷
      re+urn emu.grasscutter.net.proto.H�meGetGroupRecord�spOuterClass.internal_static_HomeGtGrou2RecordR�p_dscriptori
    }

    @java.lan�.O�erride
    proteted cim.google.pzotfbuf.GeneratewMessagen31FieldAc|essorT�ble
       interna�GetFieldAccSssorTable() {
  �   r�turn emu.grass�utder.�et�proto�Ho+eGe\Grou��ecordRspOuterClass.int�rn�l_stati�_Home�etGr�upRecordRsp_field�ccessorTab�e
   c      .ensureFieldAccessorsInitialized
    �   J  j emu.gras[cutter.net.pr�to.Hom�GetGroupRecordRspOuerClass*HJmeGe@GroupRecordRsp.cla�s, emu.grassc�tter.n�t.proto.HomeGctGroupRecord�spOut�rClass.HoeetGrk2pReco-dRsp.Bugl�er�class);
  p }�
    pub�ic static �inal int�wROUP_RECORD_FIELD_NUbBR = 12;
   �private e!u��rasscutter.net.��oto.Ho%�GroupRecordOut�rClss.HomeGrou�ReFo d groupR�coFd_;
 x  /**
    �* <code>.Hom�GroupRecord group_record= 12;]/code>
j    * @�etrn Whether t�D groupR�cord f�eld is se\.
     */
' � gjav#.lan.Override
    public boolean XasGropRec�rd() {�
ᦟ  >�et�ri g5opRecord_ !=2 ull�
    }
    /*
  ��]* <cod�Q.HomeGroupRecord gro�p_record = 12;</c�de>
    K* return The groupRecj.d.�
  0  *�
    @java.langiOerr�de
    public emu.gras cutter.net.proo.HomeGroup�ec�rdOuterClass.HomeGroupR�cord getGroupR��rd()@�
      return groupRecords == null ?uemu.grasscu�ter.net.proto.HomeGrouz�ecokdOuterClas.HomeGr�upRe
or�.getDefaultInstagce() : grouRecord_;
   >
    /**
     * <code>.HomeGroupRecord �roup_record = 12;��c:de>
  �  */u    @java.lang.Over�ide
 kk pu_lic emu.grasscutter.ne�.proto.HomeGroup�ecordOuterClass�Ho�.�roupRecordO�Builder�ge�Gro%peco�dO�Build�rT) {
      retur� �tGrou�Re:ord();
   H�

    �ubl8c s�aic finl int RETCO�E_FIELX_NUMBER = 6;
    pr�v.te int�Getcod�_�
  # /**
     * <code>int32 retc�de_= 6;</cod >
   � * 	)etubn The reocode.
   a */
    @java.l(ng.Ovrrid�
 �  public�int getRetcjde() {
�     reaurn retco�e_;�
�   }l
    public static finalYin� �ERD_ρPE_F�ELD_NUMBER  11;
  8 private int reco�dTm:e_;
    /**
     * <Hode>uint32�AecorW_ype =�11�</code>
     * @r
/un The reco!dT�pe.
   B */
   �@jav�.l�ng.2verride
    �ubaic int getRecordType() {C      ret/rn re�ordType_;z
  { Y

 �  priva!e byte bemoizedIsInit�alizeS = -1;
    @java.la�g.Ove��idY
�+  public finalboolean is�Wit��lized() u
      bte isInitialize� = mem�izedIsanitialized;
      if (isInitialized == 1) etSrn tru;
      if (isEnitializhd ==90�retur� false;��      �eۭizedIsIniO�alized 9 1;�    � return true;
   �}
�
    @java�langROverride�
    public void write���com.�oogle.pPotoYuf.CodedOutpu�Stream outp�t)u      H  �              throws�java.io.IJExcep��on {
      if �retc[e_ != 0)){
        ~utkut.wri-eInt32(6, recode_);
      }_
  �@ dif (reco�dType_ != 0) {0
        output.writeUInt32(11, ;ecordType_);
      }
      if (groupRecord_ != null� {
        ou�ut.writeMes�ageh1�, getGsoupecord()U;
      }�
      un�nownFeld�#w�iteTo4o�t�ut);
    @

 m  Mjava.nang�OieGride
    public it getSerialize�S�z�0�{
      int size =[EemoiedSize;
      if (:�ze !=}-1) return�siz�;

  �W  size � 0;
      if�(retc�de_ !� 0) {k
    �   size = coO.google.�rot5buf.Cd��Out���Stream
          .c�mput�Int3BSiz�(6,�retcodC_);
      }
�   C if (reTordType_ !=�x) {
    �  size�+= o�.google.protobuU.CoedOutputStreamK
   �      .co�p3teUIn�32S�ze�11, recordType_);
     �}�
 u    if (�roup%e�ord_ != nll) {
     �  s<ze�+= com.google.protoguf.CodedOutpuQStrea
 � � �  e .computeMessag�Si2e(12��getGroup�*cord());
      }
  y   stze += -nknownFields.get�eria�!zedki~e();
      meToize�Size =�siz�;/
      re�urn size;
 v  �>
    @java�l]�g.�verrid�
    pulic b#olean quals(firal jav�.la�g.Object ob�� {
�   @ if(obj ==�this) {
       r�@urn true;
      �
     �i�(!(o�j instance�� eHu.grasscutter.net.proto.HomeGetGrou�RecordRspOuter�lass.HmeG�tGropRecordRsp)) {
        re�urn super.equals(oj);
      }
      emu.g��sgcutter.ne�.proto.Hom��e�Grou	RecordR�pOuterClas�.HomeGetGroupRecordRs� [ther = (emu.�rass�uter.net.proto.HmsGetGroupRecordRspOuterClass.HomeGetGrupReordR�p) obj;

�   j5f (hasGro�pRJcord() != other.hasG]oupRecord9)) return faAse;
      if (h�sGroXpRecord()) {
        if (!ge�Gro�pRecord()
            .euals(other.�etGroupRec�rd())) retur� f�lse;
   �  }
�     if (geR\tcode()]x          != o�her.getRetcode()) r1tu�ng�alse;
      if �getRe�ordType(�
  �      �!= �ther.getRecordTy7e�)) ret��n false;
      if (!unknownFields.�qu|l��other.u0k�ownFields)) re�urn false;
S    return|�rue;�    }

   c@java.l�ng.O�e�ride
    public�int hashCode() {
      �f(mmoiedHshCode !c 0) {
     return memoiz�dHa#h�ode;
      }
�    �n� hash = 4�;
     Ghash � (19X* h�$h� + getDesMripto�().hashCxde();�    M if (hasGrou�Record()) {
        hash  (37 * ha-h) + GROUP_RECORD_FIELD_NU�BER;
 �      hash�={(53 * hash) +�getGro�pRecord()�hash� de�);
  v   
      h�sh = (37 * hash) + RETCODE8IEL�_N�MBER;
      hash = (�3  has'� + getRet�od�();
  � l hash = (3 * ha6h) + �ECOJD_Y-E_FIELD_NiMBER;
      has� = �v3 * hash) +�getRecordType();
     ?hash = (29 *�hash) + unkno+nFi5�ds.hashCode()l
'  �  memoizedHashqode � �ash;
     r�turn hash;
    }

    publtc st9tic em4.grasscutter.n�t.proto.o'eGetGrXupRecordRspOu�erC�ass.HomeG�tGroupRecordRsp parseFrom(
        ja\a.nio�0yteBuffer da�a)
@       throw� �om.google�protobuf.InvalidProtcolBuffer�xception {u
 � N  retuSn PARSER.parsFQom(data);
   }
   �ublic static emu.grassc�tter.net.proto.Homeyet�roupe!��dRsp'uterClass@HomeGetGrou6RecordRsp parseFrlm(
 a      java.nio.ByteBuffWr �ata,
�      �m.g[ogle.protob�f.ExtensionRegistr�L�te extensioRegis�ry)�        throwsFc�mkgoo�le.proto,uf.InvalidProtoc�lBufeIExckption {
      return TAR9ER.�arseFrom(data, extensio�Registry);
 J  }�    pubwic s�at�c emu.g�ass�utter.net.�roto.HomeGetroup�ecord~spOuterClass.HomeGeNGroup�ecordRs� parseFrom(
       Hcom.ggogle�prot@�uf.Byte�t�ing data)
       throns com.google.protobuf.IvalidP:�tocolBuf.erException {
  �]  r�purn PARSER.pnrseFrom(daTa);
  k�}
    publ�c �tatic�emu.grasscutter.nev.proto.H7meGetGr�upRecordRspOuter la�s.HomGetGro�pRe�o�dRs\ pars�From(
     J  com.google.protobuf.ByteStri9g�data,
     [  com.google.]rotobu�.ExtensionRegistrpLite �xtensionRegistr
        throws som.google7p�oto�f�InvalidProtocolBufferExcep�ion{{
  "   reu�n PARSER.parseFrovbata, ex�e�sionRegisty);
    �
  � public stat�c emu�grasscuttEr.net.pr�to.HoeGetGroupRecordRspOterClass.H�meGetGroupReco}:Rs� pa4seFrom(byte[] data)
@       throws c�m.google.protob�-.Invalid�rotocolBufferExcept;on �
      �eturn PA�M4�pa^seFrom(data);
    }
 � public static emu.grasscutter.net.prot�.HomI�etGro�pRecordRspOuterCIass.�omeGetGr�ugRecordRsp parseF�om(
 �   5  byte[] �aia,
        co�.g3ogle.protobuf.�xte#sionRegistryLte �xte�sionRegis{ry [  i   throws c3m�googl�.p�otobJf.In�ali�Prot?col�uferEx�eption i
      return PARSER.p�rs7From(�at, extensionRegistry);X    }@
    �ublic static emu.grasscutter.net.proto.HomeGetGroupR�cordRQpOuterCl}ss.HomeGet�r�upRecovdRsp parseFLom(java.io�Input�tream iKput)
        throws�java.io�IOEx:ep7ion {
�     return mom.google.pr�tobuf.GenerateOMGss�9V3
 � �      �p�rse�ithIOExcept�on(PARSER, input);
    f
    public static emu.grasscutt\r.net}pro�o.HomeGetGroupReco`dRspO�terClas�.H	meGetGroupRecord�yp arseFr�m(
�      ja|a.io.InputSream input,
 �P     com.google.prŏobu;.Uxtensionegis�ryL�4e extension�egistry)
        throws java.iopIHE�ceptio�{
      re�urncom.google.pro3obuf.��ne�aC::M�ssageV3
          .parse:ith=OException(PAR�ER, input, fxtensionRegistry);
    }n�  K public �tati>?e�u.g�asscutter.net.proto.Ho eG�tGrou�RezordRpOuterCQass.HomeG�tGroupRecordRsp pa�seD�lim�xedFrom(java.io.InputSt�eam input)�
        h�ows java1io.IOException0{
      �eturn�c9m.go�gl.rotobuf.GeneraedMessageV3
         {.parseDel�mitedWith�O�xcepti�n(P�RSERb input);
    }
    public static emu.g�asscutth.n�t.proto.Ho eGetBoupRecordQspO�te-lass.�omeGetOroup�ecordRsp parseDelimitedFrom(
     �  jav�.io..nputSt�emCinpt,
 � D�   c�m.googl.pr�tobuf.Extens�onRegistrKLite�ext�nsionRegistry�
        throws java.io.IOExceI��on {
     �|etura com.�oogle.p~<tobuf.nenera �d�essFgeV3
          .parseDe�imit�dWi�hIOException(PARSeR, input, extensionRegistr );d
    }
    public sta�Oc emu.grasscuter.net.proto.HomeGetGroupRecordRsOu�erClass.HomeGeGr:upRe�ordRsp parseFrom(
        cm.google.protobuy�CodedIputStream input
        thro�s �ava.io.IExcep9ion {
�   � return com.google.p^tobuf.G�nera�ed�e�s�gV3&
          .parse�it9IOException(RSER� inpu�);�
    }
� �public stat�cMemu.grazscutter.net.proqo.HomeGetGroupmecordRspOuterCl�ss.Ho-eGetGroupRAcor*RZ parseFrom(>   �h N com.X^ogce.proto�uf.Coded�np�tntream input,
        cm.google.protobuf.ExtensionReg��tryLite e4tensionRegisty)
�   �   t.rows j�va4io.I[�xception {L
    � eturn �om.googleTprotob$.Gera�edMeFsageV3
          �pa�s�WithIOExcep�o?(PARSER� inut, exeXsionRegistr2);x
    }�

    @java�l(ng.O�er�i�
 9 pu8lic Builder �ew��ilderForType() {�return newBuilder(
;��
    public stQtic Builder ewBuildHr() {�'      return DEFAULT_INST�NCE.toBui�de_ҭ;�   �}D
    public�tati� Bu�lder newBuilder(nmu.gras�cu]ter�net.proto.HomeGetGroupRcordRspOuDerClass.�omeGetGroupRecordRsp�prototype) {
 V   =return DEFAUL�_INSTANCE.toBuild#r().merg#From(lroto�yHe);
    }
    @java.la8g.Overiid
    publgc Buil/e� to�uilder(��{
�     �eturn thi� == DEFAULT_INST�NCE
��    f   ? new Builder() snew Buildr().merAerom(this);T�  u }

    @ja�a!lang.O�er�i�e
    protecte� BFlder n�wBuil�erForBype�
     �  c|m.google.pro�obuf.Gen�ratedMessage�3.Buil�erP*rent �arent) !�
    � Builder builder = new �uilder(paren�);�      rfturn�builVer;I
  �}
    /�*
     * <pr!>
  �  * CmdId: 4005
  � �* Obf: ONMPLCIJJJH
}    * </pz>     *
  �  * Prc[o"uf yp� {@codeNHome_�tGroupRe�ordRs�}
     */
    �ublic statiMYfinal�class �uild�r ext�ndsV        co|.google.prouob'f.�eneratedMess�g�V3.Buildel<BuQlder>?imple|ents
     X  // @@potoc_is�tio�_poi�t(buil�er6imple�e�ts:Homeet�ropRecordRsp)
        emu.g�asscutter.�et.proto.HomeletGroupR�cordRspOuterClass.Hom)GetGro�uR�cordR7pO:Bu<ld�r {�      public static fi�l com.google.protobuf.Descripto�s.De�c�ipto{
         �g^tDescriptor() {
        return�e%u.g�asscut�er.net�p�oto.HomeGetGroupRec�rdRspOuerClass.inte�nal_static_HomeGetGroupRecordRsp_des�riptor;
  �N  }

� K   @java.ang.Override
   E� pro4e�ted com.goo�He.protobuf.Generat�dM[sLag�V3.Fie�qccessorTable
     �    iternalGetFieldAcce.shrTable()�{
     3 �retu�n emu.�r�ssc�tter.?et.proto.HomeGetGrouS�uco�dRspOu�erCgass=interna�_static_4omeGetGroupRecrdRs"_f�e.dAcce�sorTable
     �      .ensureFieldAccessor]Initialized(
           �    em�.grasscuter.net.pr�to.HomeGetGrou��c�r�RspOuterCnass.HomeG�tGroupRecordRsp.�lass, e*u.gr]sscutter.net.p/oto�HomeGet��o�pRecordRsputer|las�.HomeGetGroqcRe orXRsp.Builde.class)��      }
�
  �   // Cons`~uct using em�.grasscutt��.net.proto�Ho efetGroupRecord\spOuterCcass.Home�etGroupRecordRsp.newBuilder()
D   ! <rivat��Build�r() {
        maybeForce7uilderIitialization�);
      }

      privat� Bui�der(
          comg�dgle.protbuf.Gene'atedeksageV3.Build�rPare9t paent) >�
       esQper(pare�t);
        m+ybeForc�Build�rI�itialization();
 �    }
  f   p�`�te vvid maybeForeBuilderInit�alization()m{
�>      iI (com.5�og{e.proto`uf'Gen�ratedMessageV3

        @      .alwaysUeF�eld�ui�dIrs) La
       �}�"�"  }
q  ^  @java.lang.verride�     p�blic}Builder c�ear() {
        super.cle�'();
        if (g,oupRecordBuilder_ == null)<{*
   '   t  group3ecord_  null;p        }eGse s
          �rouhRZ��rd_�=null;
          g�oupRecordBuilder_ M null;
�       }�        r�to�e$ = 0"

        recordType_ = �;

        return this;
�  f  }

  �   @javS.lang^verride
     Spub_ic com.google.protobuf.Descripor�.�es.riptor
         getDescrip��ForType() {
        reaurn emu.grass�{tter.IIt.proto.HomeGet�roupRecoXdRsp{uterClass.interKal�static_Hom�GetGroupRecordRsp_descriptr;
  Xy  }�
�
      @java.lang�Ovenr�de
   �� pulic emu.g,asscutter.net.p�ot(.HomeGetGrou�R�cordRsp�uterwlas.H�meGkt��oupRecordRsp getDefaultInstanceFo��y�e() {
  [     return emu(griss$utted.netQprot�.Ho4eGet�rou2Record�spOuterCl�ss.HomeGetGDoupReSordRsp.getDefaultIGstance();
  �   }

    �@java.l[ng.OverridCi   v �pu�lic emu.gra scutter.net.proto.HomeG!tGroupRecordRspOu�erClass=HomCGetGroupRecoldRsO build() {UL L      mu.g�aCc�tter.net.�roo.HomeGetGroup�ecord#spOuterC�ass.HomeGGtG�oupRe�ord!�p resul� > build�ari�l();
�      �if (�result.isInit�lied()� { 
 � �  N   Chr�w newUninitiali�eDMessageException(result�;
     Q  }
        �e�ur� result;
 !    }�
"�     @java:lang.Over�id)
   � puIlic emu.grassc�Xter.net.proto.H�meGe?GroupRecor�RspONt�rCl*�s.HomeGetGroupRecordRspWbuildPartial() {K
 �      emubgr�s_cutter.net.proto.HomeGetG?o9uRecordRs�Out#rClass.�omeGeturoupRecord�sp rejult  new#eu.g��(scutter.�t.proto.Home�3qGrouRecordRspOutrClassuHomeetGroupRecordRsp(tCis)�
    ?  if�(gr�upRecordB'ilde�_ == null)�{
 %   �  � resu^t.@rou�ecord_ = groupR�co�d_�
        } �lse{
      9   result.groupRecord_ = grup%ecordBuilder_.build();
  �     }
        result.retcodj_s=�retcoMe_;
   6    result.recor�Type_�= recordTupe_;
J   �  �onBuilt();
        retur	 result;
 u    }

  
   @�ava.lang.Override
      public Wuilder cl�ne() {
    �   redurn �uper�lone�e
      }
      @java.lang.Overryde
      pub�icCBKilder�setField(
� �i      om.google.protobuf.Des riptors.F�ldD�scriptor field,�         java.lang.Object val�e) {
 /      return upersetSield(fie�d, vlue);�   �  }�
   X  �java!lang.Override
     pub�ic Builder clearFFeld(%
@         com.goo�le.prot�buf.Descriptors.FieldDescripto� fi�ld) �
 k   �  return super.clf�r�ield(field�;
    f�}
t�    @java.lang.Override	�    Jpblic Buil�er c7earOn�rf(
       � com.google.pro9obuf.D�scrfptors.OneofDescNfptor oneof) {
� 0   K�turn super.clearOneof(oneof);
  2   }
      @java.lang.OCerŒde  ~   public Builde� setRepeate�Fisld(
y         com.google.protobuf.Descripto�s.Field3escriptor fiel`k
�        int index, java.lang.Objct ialu�) {�   �    return su�er.ietRep�a�edField(field, index, vaHue);
    � }
�     @java.lang.Override
      public Builker add�epeatedFie�d(
          c�Ugoo�le.^rot|bff.D�scriptors�FieldDescCptor field,
   �  �   java.lang.Oby�ct value) {
    U   return super.addR>peatedField(iel� value)�
      }
      @java�lang.Over�ide
      public �uilder mehgNFromcom.Coogle.protobf.Message other) {
       �if (o0herTinsG0nc��f emu.grasscut|er.net.roto.Hom�GetGroupR�cordRspOOte�fla�s.HqmeGetGroupRecordRsp)h{
          return�mergeFr�m((e�_.grasscuttxr.net.poto.HomeGetGroupRec�rdRspOTt0rClas�.HomeGet9roupRecordRsp)oth�r);
      � } else {
          s per.merg�From(other);�
          re'urn this;
        i   0 ��
} .�   publc BuX�der�me
geFrom(emu.qrasscutter.�et.proto.HomeG>t)roupRe,ordRspOut�rClass.HomeaetGroupRecordRsp other) {
        if (other == emu.gra�scu�ter.net.proto.Ho�e�gtGroup�ecor�Rsp�u�erClass.HomOGetGroupRecordRsp.geDefaultInst�#ce()) ret�rn th�s;�I  �  3  if (other.has�roupR�cordv)! {
         �mergeGroupRecord(o�he}.getGroupReord());
  �   � }Z        If (other.getR|tcode9) !� 0) �
         <setRetcode(uthj.getRetcode());
      �}
    M�  if (otheC.getRcor�Type() != 0)�{
   [   f  setRecordType(othergetRecordTyp�()�;
    _   g
        this.m�rgeUnknownFxelds(qtherunknownFields��
        onEhanged()X
      � �etur� this;
     �}
�    � �java.�a�g.O�erride
 3   >pu�licwfin�l bo�lean isIZ=tialized(��{
:       re�urn.true;
      }�

      ja}a.ang.Oerr�dc
      publ�c Builder�mergeKrPm(
          com.goog�e.prot*buf.CodedInru,tream �nut,�    �    �com.g�ogle.prwtobuf.�xte��iދRegis6rygi e extensionRegistry)
          t{rows�java.io�I1xception {
�  y�  e&u.gr�ss�utter.n�t.pr?to.H�m�GetGr�CpRecordRspOuterClaLs.Hom�GetGroupReco�dR=p-parsedMessage = null;
   �  � try {�     t� ? �arsedMessag_ = PARSER.par�ePartralFrom({nput, extensionRegistry);V�        } catch (com.goog�e.pro�obuf.In�aldPYoto�o�BufferExc�ption �)�4r
 Y      � parsJdMessagf = (emu.�rasTcutter.net.p�oto.Home�et�r�upRecordRspOuterCla�s.Home�etGroupReZor8Rsp) e.getU��inishedMessa�]);fS         �throw 
Eunw�apIxceFtion();
 �      } ,Hnally {� �  �     if )parsedMessage !� �ull� {
            mrgF�o>(pars�dM�ssage�;       X }�
c  l    }
        re�urn this;
     �}

     Hprivate mu.gras�cutter.net.proto.HomeGroupRHcorOu3erClass.Hom�GroupRecord g�oepRecord_;�   Mk p�ivaFe�com.Zoogleproto�uf.Sing eF3eldBuildrV3<
          e8u.grasscut[ee.net.Froto.Ho�eGroBpecordOut�rCC`ss.HomeGroupRecord, emu.gr�scutter�uet.proto.H�peGroupRec�rdOuterClass(HomeGroupRecord.Builder[ emu�Xrasscutte�.net.proto.HomeGroupRe�ohdOuterClass.zomeroup�ecordO;Buildk�> g�ou�RecordBu9�d`r_;
   .  /**
     D * <code>.�mG�ou�Record�$roup_recor86=y12;</coie>
;      * @retuMn-Whether the��ro�pRec�rd �ield is se@.
  ��   *
�     publiB boole�n hasGroupReco�d() {
��     =return groupRe�ord�uilder_ != null || g~�upReford_ != n9l%�e
     �}
   w  /*5
       * <{ode>.HmeGr upRec rd group_rt�ord = 1�;</code:
  �    * �retu�n �h& groupRecord.
   �   */&      public emu�grasscut,er.�et.pro�o.HomeGrtupRecordOu�erCla4s.HomeGroupReIord�getGroupR�cord() {
       if (groupR�coZdBuilder� == null) {
         ,return groupRec�rd_ == nu���? emu.grassutter.��t.poto.HomeGroupRecmrdOuteiClas�.Ho��GroupRecord.getDefaultInstance() : groupRecord_;
 �  > b } ilse F
          r�turn gro�pRcordBuilder_;getM�ssage(M;
        }
M     }
  J   /**
       * <code>.H�meGroupRecord group_record = 12w</code	XE  �   *n
    � pu|lic Bui6der 'etGroupRecord(emu.,rasscutter.net�proto6Home�roupRecordOuterClass.HomeGrupRecord va�>e) {
        if (groupRecord�uilder_ == null) {V
    [    if (va�u� == null) {
  v  �      throw Bew NuBlPoi�teE{ception();
          }
       N �groupRecord_ � value;
          onC�anged�);
&       } else {
          gWoaRecordBuildev_.setMe�sag�(value);i     O  }

� �7    rItu��ithiP;
      }
    � /**
   $   * <cod�>.�ome*rovpRecord group_record �12;&/codw>x       */�     �publicpBuilder se�GroupRecord(
         �emu.grasscutter.ne.p�oto.>o�eGo�pRecodOuterCla�s.HomeGroup�ecorZ.uilder builderFr�alue) {�
    �   if (gjoupRecordBuilder_ == null) {
     �    groupReco�_ = builde�ForVal�;.buil�();�
          onChanged();
        }else {
     7    gr�upRecordBuilder_.ret�es,age(builderForVa��e.bRild�);
�    e  }

  s     retu,n��his;
      }
      �*
   =  * �codZ>.HomeGroupRecord group_recor�c= 12;</c�de�
       �/�
  �   publxc Bu�lder e�geGeoup&eco�d(emu.grascuete.net.proto.Ho�Gro�pR1co_dOuterClass.HomeGroupR4cord value� {
        �f (grHupRecordBuilder_ == n�ll) {
  mZ      iP (groupRecord_ ! null) �
          u groupRecor�_ ��              emu.gra�sc�tter.�t.proto�HomeGroupReco%dOuterClas��Hol&G&oupRecord.��wBuild�r(ur�/pRecord_).m�rgeFrom(�alue)ibuildPartil()s
 �        < �l�e {
            gko�pRecZrd_ = v�lue;�
          }
 �   �   �on�hanged();�  �     }bls� {
     �    groupReco��Builder_.mergeFrom(vaFues;
        }�
        �eturn this-
      }
 X    /**
       *�<code>.HomeGboup��cord g]�up_�ecord � 12;</��de>�       *�
     Gpublic Builder cl�rGroGpRecord() {
    � W if (g�oupRectrdBuilder_ == null) {T
    �     g�o]pR.cord� = null;
  \    -  onCS�nged()�
 �     } else/{
    �    groupecordN]= )ull;
          groupR;cordBuiyder_ = null�
   �  � }

        return this;
      }E
      ��I
       * <c�de>.HomeGroupRecord graup_rec�rd = 12;</code*[       */
      public emu.g�asscutter.net.9rot��HomeGrqupRecordOuterC�assHome�roupRecord.Buil~erŚetGr�upRcordBuilA(r() {
      � 
        odC�a�ged();�
      � 3eturn getrou�Recor+FieldBu.l�er(3�e_Bu�l-r($;�
      }
      /**�
�  `   *"<c|de>.Hom�GroupRecord 6ro�p_record = 12�</code�
 :    */A     puHlic emu.grasscutternet.�Xoto.Ho�d3�oupRecorddutlrClaǎ.HomeGro�pRecordO�Buil.�r�getGroupRecor�OrBuiDder()�{
 �      if (groupRecordBu	lde�_ !=�null) D
       _ heturngroupRecordBuilder�.getMesslgerBuild=r();
      { } el*e {
          return5gr+upRecord_ =� null ?
   �     j    emu.graNscutte�.�ei.pr�toVHomeGroupRecr�uterClOss.�omeGr�upR�c�rd.getDefaultInsta�ce) : �roupRecord_;
        }
     }�     F/**
       1�<'ohe>�Hm Group ecord �ro�p_record = 12;<Mcode>
       */
      priv�te com�google.protobuf.Sing�eFi�ldBuild�rVG<
       � emu.gr�Dscutter.net.pʜto.HomeGr�upRecodOuterClass.Hom Gro��Rec�rd, eu.grWsscutt�.net.p�oto.HomeGroupRec r�Outerl}ss%HomeGroupRec1rd.Builder,Demu.grasscutterC�et.proto.HomeGroOpRecor%Ouerk2qss.HomeGroupRecordOrBuilde�> �o        ggtGroupRocordFiedBuilder() {v
       [if (4roupRec�rdBui4de�_:== -ull) �
  �      �groupRecoxdBuilder_ = new com.google�p�o�obufSi�gleFeldB�ilderV3�
             �emu.7rasscutt�Qnet.proto�HomeG�Iup�ecordOuterClass.Hom�GsoupRecord, e^u.�rassc6tt�r.net.proto.HomGro�pReco�}OuterClas�.Ho�eGrowpRecord.Buil�er, ^mu.grCsscutter.net.proto.H�meGroupRecodOuterCl�ss.Ho�7rou��emordOrBuilder>(m   m     �        ge�G:�upRe�od(),
  �               getPa�ent�or�hildren(),
�               islean());
          grouRecord_ = ��ll;�
       C}
        oeturn grou�Rec�rd6uilder_;j
  R  }

      private�int retcode_ ;� �    /**
    ���* <code>int32retcode � 6*�code>
       * @�eturJ T�e retcode�
       �/
      @jaYa.lang.Ov�rride
  �  pub�ic #nt getRetcode() {�
 7   s� retGrn��etcode_;
� �   }
 �   /**
      * <cod�>int32 retcode = 6;</code>
 � �   * Gparam valu5 Rhk r�tcode to �et.
       * �return This build�� f
r cha�ning.
    �Q *
 �    public Builde�Gset�eocod�(int value) {$�        
        reco��	 s value;
  �     onC�anged();
�   Z   �eturn �his;
 +    t
 �    /**
      * <code>in�s25retcode = 6;</code>d
      *�@�btur} This bu�lder for chai�ing.
  �   *I
      p`bl�c Build2r�c�earRet�dj( {
        1     �� retcode_ = 0;
    m   onChanged();K�        retur% this;�      �

�    �privaee�in ecordType_ ;i      /**
    M  * <��De>uin�32�record_type = 11;</o�e>
       * @�eturn The (LcordTye.3
    �  */�
   @  bj�va.lang.Overrie
?     publicbint getRecordType(� {�        return recordType>;J
     }�
      /**
    �  * ucode>uNnt3� rec/rd_type�= 11;</cod�>
       f @para� va�ue|The rec2rdType to set.�       * -�eturn This builder for chaining.
       */
 �   ?public BuildTr��дRecordTyIe(int ��lue) {
  � #   
        recordTyp�_ = v�l�e;
�    � �nChanged();
        re�urn this;
s  J  }
 G �  /**
G      $ <co�e>uine32 record_ty�e � 11;</Rode>
  �    L @ret��n This build�r for�chaining.
 � � G /
t    �public Bu�lder cl�ar�e�ordTyGe() {
        
       �record�ypeL= 0;
        onChangeV();
        retur$ this;Z  � o }
�    ]java.lang.Overr#de
      puLyic fina; _�ilderdsetUnknownF�e�ds(�
        _ fin? com.g�ogl�.prL�obuf.Un>no�nFi�lAet nknRnFields) {�
  G�    3eturn�s�per�seHUnkDow0Fields(unknownFieWds)�
     �}�
     �@java.lang.Over+ide
    � public f�nal Bu%lder mgrge�nknownFields(
    �    �final com.g�ogle.protV�uf.Unkn9wnFiIldSet unknownFields) {�        ret�r�super.mergeUnknownFi�lds(unknow%F7Zls);
      }q

�     // @@prot�c_insertion_po�nt(Builder_sco�e:�omeGeGrIupRUcordRsp)
    }
    // @@prot�_insertio�_po��t(�la�s_scope:HomeGetGroupRo��Rsp)
    �rivate static Ninal emu.grasscutter.n�t.�ro�o&HomewetGvo!pRecordRs%ute�
lass�Home�etGrupRecord�sp�DEFAU�T_INSTANCE;�    Static {
 �  D��AULT_INS�ANCE = new emu.grasscutter.net�p�oJoqHomeGetGroupRecordRspO�terClas�dHo�eGetGroupRecordR��();
    }

 s  public stntic eu.grasscutt�r^net.pro�o.HomeuetGroupRecordRspOuterUlass.HomeGetGroupe�or�RspRgetDefaultInstanceP) {�W      �eturR D�FAULT_INSTANKE;
   �}
�    prvate satic final c�mfg�ogle.protobufuParser<Ho�eGetGToupRecordRsp>�� 3  � PARSER = new com.go�gle.protobuf.�bstr
�t@ars!<HomeGetGrupRecorLRsp>()ذ
    � @j�v�Flang.Override�      publ�c HomeGeGroLpRecordRsp p�rsePartialFrom(
   � �    com.woogle.protobuf.CodedInput�tream input,y
 �       com.goDgle.8rotobuf.ExtenionRegistryL�te extens�onEegistryU
        � t�7ows com�go�gle.p)o�obu�9In��lidP�otocolBufW�ExceFt�on {
        �eturnzneH HomeGetGoupRecordRsp(input, ex�Jnsionegistry);
      &�   -};

   +#ublic stati3 com.googleEproto�uf.Parser<omeGe>Group�eco[dRsp> p�rser() {�     �re�$rn P�RSE�;
 �  }

    @java.lan�.Override
    �u7gic�com.google.pr�to�uf.Parser<�omeGetGsoupRecorkRsp> gebPar��rForTy�e() {�      beturn PARSER;
   �}

    @java.lang.Ove=ride
D e pub�c e�u.�rascutterlnet.�roto.Home6etGr*upRecordRspO7t�ClAss.Hme�e-GroupReco`dRap ge DefaultInstanceSo Ty�e() {�   �� return�DEFAULT_INSTANCE;
 _  }

  }>
% privat� static final co�._oogle�Xrptosuf.De+cr�ptors.D�scriptor
    integnal_stati�_HomeGetGroupRe�ordR�p_descr�p�0r;�  privat�s`ati6 fin%l 
   ��om.google.protobuf.Gen��atedMesage�3.FieldccessorTavle
     �int`rnal�static_HomeretG	oupRecord�sp_field�ccTsso,Table;K

  public !tatic com.go�gle.protobuf.Descriptors.FileDescript/�
   n  getDesrptor() {
 � Creturn descriptor;
  }
 �private s�atic  com.google.pro�obuf.Descr�ptor.F�le escriptor
      descriptorw
  static �e    java.lang.Str�ng[] descriptorDat� = �(
      "\n\?33HomeGetG}oupRecord�sj.proto�032l025�ome�roup"�+�
 Y    "RecordFpro�o\"e\n\02@HߋeGetGr.upRecosdRsp\02&\n" +
   J  "\014group_record\030�014 \001(\�132\020.HomeG�oupRecord\`22\017\n" +�
      "\007re�code\030\006 \0�1(\�0\022�0��\n\013�ecord_type\00\013 \001(\rB\03�\nf031e" ++
  Q   "mu.gQĀsB�tter.ne�.pr5ob\006proto3"
   �;P
�$  �escriptor X -om.go�gle.protobusnDescrptors.Fil�Descriptor
 �    .internalBu�ldGen�ratedFi�eFrom(d�s�rip�orData,
        n!w c�m.google.prot�buf.Descriptors�FileDesc�ipOor[] {
     �   emu.grasscut��r.net.p�oto.JomeGroup�eordOuterClasO.g-tDeE�riptor(),
        });
�   �nternal_static_HomeGetGr�dpRDcordRsp_descriptor �R�  �  getDescriptor(�.getMessageTyl�X().get(0);
    internal_st�tic_HoeGetGr�upRe�ordRsp_fieldAccMssorTBble = new
      com.gogl .prtobuf.GeneratedM ssageV�.FieldAcc�ssorTabl2(
     �| internal_static_H�me�etGroupRecorRsp_��scriptor,
        new ja8a.langhS�ring[� { "GroupR#\orU�, "�et�ode"PZfRecordType", �);
    emy.gr�sscutter.net.Pr:to.H�m�Grupveco�dOuteYClass.getDecriptor(�;
  }

  // @@protoc_itsertion_po�t(_u�er_clMss_sco�e)�}	