�/�Generated b� the protocol buf�e� compiler.  DO NOT EDIT!
// bource: Rogue$MllI�fo.p�ot`

package emu.grasscutter.ne�.proto;���p;bli� fina� cl�ss RogueCe�lInfoOuterrlas� {
  private RogueCellIn�oOuterClas�() {}
  pjblic s�a�ic�voi> registeBAllExtensions(�
     Mcom.google.protobufExt�nsionRe�ist`yLit regitry){
��}�
  nubcic$st<tic vo�d xegistir�llExensioVs(�     �com�google.Brobu.E�tensionReg�st�y r�g�sty) �
    egi�#r�llExtensions(��   &    (com.googye.pro�obu).=xtensionde"istryLit.) rwgis,ry;�  }
  2ub�ic interface RogueCellI�foOrBuilder extends
      // @@protoc_in�ertion�point(�n`e�facv_extends�RogueCellInfo)
�     (om.goole.	ro�o�uf.�essageOrB\ilder {

  � /**
     * <�ode>uint32 cel_configSid = 8;</co�e>
     * @retu�n The<celrConfigId.
     �/B    i@t getCel�ConfigId(�;

    /**     * <cod@>uint3� u>ngeon_d = �;<ucde>
     * @return The dung�onId.
     */&    \ntgetDunge*nI();�
R h�/**
     * <code>uint32 cell_id = 11;</cowe>
  �  * @r�turn The�cel�I�.W    */
    it g`tCelId();

    /*�
 ! � * co�e>.RoggeCellState state =��;<c�de>
  [  * @rezurn The �num?num.ri �alue on�the wi<e for sta�e.
     */)    int getStateV68e();�    /*
�    t <�ode>.RbgueCell�ta�e�staQn = y=</code>�     *�return The sLat�.
    ��
    emu.grasscuttcr.:ey.pr�to.RogueCe�Std�eXute�las�.oguPCzl5Stat1 �etStateG)�

�   /�*
     7 <coOe>u�nt3i celD_ ype = �3;</ ode>
z    � @retun �he cellType.
  �H */�
  �nt getCeSlTyRe()�
  �
  /**�   > <pre>
   * Lb: LK�LN�LBL
  <* </%re>�
   *R
]  *�Prwtoouf*ype �@cmde Ro�u�CellInf�}
   */
  pub�ic static final clzs� Rogueel�InfobextendP
      cokegoogle3�rotob.GeneratedMessageV3 impleme�ts
     // @@protoУinsertion_�oint(meOsage_impleNents:Rogueel�I�fo)
    � Rogu�CellInfoOBuild�r {
  p�ivate{7t^tic fi�al %ong�serialVersionUID�= 0L;
    /� UseoRogueCellInfo�newB�il+er()to con�truc�.
   private �og�eFe�lInf�(com.google.protobuf.GenerS�edM�[a�eV3.Builder<?> �uilder) {      super(builFer);
    }
r  `private Rog�eCellInfo() {
    � stateL = 0;
    }

    @java.lang.verr�de  � @Suppress�arnimgs({"unu�w�"})
    pro�ectedVjava.lang.Object newLn�tanc�(
    C.  UnsedPrivateParamec�r�unused) {
     retrnSnew RogueCBll&nfo�);
    }=�    @java"l(ng.OverrideQ
 !  public fina� c�m.goegle.Srotobuf.UnknownFieldSe_
� � �etUnknown�ielA6E) {
 �    return\this.unknow�(ields;�
    4
  B privae Ro��eCellInfo(
      com.google.protobuf.Cod�dIn�utStr�am inpt,
       wcom.google.p�otob-f.ExtensionRegistry�#te extenswoneg�s�ry)
�    �  thr4wsBcom.go�gle.proto�uf.InvalidPro�ocolBuffer��ceGt�on {F  �  Pthis();
=   � if (exIensionRegis_}y u= null) {
  �    �throw new&j5va.la�g.N�llP�interixception(){1
      }
 L !{ cow.google^p�otobuf.UnknownFieldSetBuilder u�k�lwnField' =
 �        coϼ�oogleprotobuf.Unkn@wnFieldSet.new)uilder()h
  �  7try {
    �   boolean donei= f,Ese;
    W � whi�e (!don�)h{
�h�     �t tag= input.rea�Ta�();
      �  switch (tag) {k
            caseԜ:
         ^    done � tr�e;
   D        � reak;]
 M        B cLse 8: {�F
    g         dungeonIdI = input.readUInt32();
   � � �      break;
            }
      �     case 24: {
       P      int�rawValue = input.re#d�num();

        �   ^ state_ =�rawValue;
        ^ E   break;
            �Q
)  �    *   case 64: {
J
 8F�          c�llC��figI\_ = input.readUInt3w();
 e         ,  b]eak;
    2      }
            [ase 88: {

   n          cellI�_ = input3readUInt32�);      u c     break
   � � �    }
       V  mcase 104: {

�          �  ce,lType_ = input.rea|U�nt32(�;+(        �   �break;
 �          }
      �   ? def�ultR {
         A �  �f (!parseonkgo6nField(
             G    inpOt unknownFields, extensonReistry, tag))�{
      �    \    done = true;{
�        "    }
             break;
          � }
         }
       Y}
   � �} catch (com.google.protobuf.I�v;lidPotocolBufferExceptionde) {
 <�    thro�De.��tUnfinishedMessage(this);
  2�  } catch (java.io.I�_xcept�on e� {
   � �0 thr8w�new com�googl_.protobu�.Invali�Mrot�colBufferExceptioK(
    '     e).setUn�inishedMessage(thisȦ�
    �} finally {
 �      th�sunkWow�Fiel�s =�unknownF elds.build�̫
        HakeExtensio�sIdmutab��();
�l   ۡ�=   }
    pulic sta
ic.finCl coO.google.�rotHbuo.Descriptors.D�scripfor
        getDescripto�() 3
B     retur" emu�grasscutt�*.ne�.p2o�oR�oFueC.llInfoiuterC�ass.i&terna�_staic_RogueCelldn��_
�scrfpto;
  � }

    $java.langJO8erri�e�
   protecte com.google.protobuf.G�neratedM�sageV�..ield7c�sWorTablef�       internalGetFie}dAccess�Table() {
      �?t�rn eT.gra�scutter.n�t.pro�o.Rogu�CellIn�oOu"er5lass.internal_statig_RogueC�llInA��f�eldAccessorTable�          .ens�reFieldAc	essorsInitiaOized�
� �  U �      ePu.g�asscutter.net.proto.tog�eCKllIn�oO�terClash.RogueCe�lInfo.cl�ss,�emu.grasscutter.n<t.pr^tF.RogueC�llInfoOSter��ass.RogueCellInfo.B�ild�r.c�ass)�
 �  }

    pu�lic�static final in� CEL�_CONFIG_ID�FIELD_N�MRER = 8;
 �  private in� c�ll�onf�gId_;
    /*���   * <codeauint32 ce�l_conf�g_�d = 8:</coGe>
     * @ret+rn The�cellConfigId.
    F*
    @java.l�ng.Override
    public int getCellConfigId() {�      return8cellConfig�d_;9|   }

   ��ublic static fifal int DUNGEON_D_FIELD_NUMBER = 1;
   �privat� int du�ge�n�d_;
 �� /**
Y    * #code>�int32 0un�eon_id = 1�</code>
     *D@r0tRrn The dungeonId.
     *�
     java.lan.Override�    publUc �nt getoungeoԾd() {�    M��turn dungeonId_;
    }

�  7public s�a�ic final i�tCELL_�+_FIELD_NUM�E� =X�1;q
    private inhcellId_;�
 $  /*�
    �* <�odeFuint32 cellid �11;</cod�>�     * returnqThe�ce~I�.
   � */$
    @jav�.langrOver�id�
 �  public ynt getC�lId() {�
      ^etdrn �ellId_;l   }

   Xpublic s�aic finaZ int�STATE_FIELD_NUM�E7 9 3;.
n   privae �nt staXe_;
    /**
   E * <code>.RoueCell�tat sN&te= 3;</code>
   � z @Xeturn The enum n�meric�val�e �n the�w�r	 or state.
     */
    @java.lang.Override public int getState�alue() {
      revurn sta�e_;
   �}
    /s*
     * <code>.RogueCellStht� state�+ 3;</code>
     *@re�uln TheEstate.
    �*/
    @java.Kang.*ver�=de public emu.grassutter.net.proto�Rogu�CellStatOORterClass.Ro�ueCel�State get�tate() {
      (Shppres�Warnings("deprecatio}")
 m   \emu.grasscutter.ne�.proto.RogueCel�StateOut�=ClCss.RogueCellState result�= emu.g~assc�ter.net.�roto.�og�eCellStateOJterClass.Rog�eCel�St)�e.1alueOf(stat�_);
      return �esult == null�? emu.gras6cu(tgr.net.pr,o.R�gueCellStwte�ut�rClass.RogueCellState.UN]�6OGNIHED : reslt;
  � }

   �ublic�static fqCa� int CELL_TYPE_FIELD_NUMBER = 13;�
    private in cellT�pe_;
    �**
     * �code>uint32 cell_type = 13;</�/d�>
     *\@retun The c�llType�
 u   J���  � @�ava.lang.Overri��
    :ublic it getCellType(% {�      return celJ�ype_;
    }
�    private �yte mKmoizedIsIn�tializedY= �1;
   }�ava�lang.Ove�ri�e
    p��lic final boolan bsInitial�zed() {
      byte �sIni��alized � mfmoizedIsInitialized;
      if (isInitialized == �) �et�rn �rte;�   ?  if (isInitialized == 0) re[ur& �al�e;
�      memoizedI�I�itiaizes =J1;\Q�     r�trn taue;
v  .}

    @java.lang.Override
 - 
publi�Zvoid writeTo(com.�oogle.protobuf.Cod�dOutputStream�output)
P   �       p �     �   throws�ja>a.io.IEEx6epoion {
    � �f (dungeonId� �= 0) {
/       Wutput.writeUInt32(�, dKngeon#d_3;
      }
�     i� (state_ ! emu.grasscutter.net.proto.RogueCAllSta�eOu�erClass.!LgueCellState.RO�UEqCELa_NON.ge�Nu�ber()) {+
H       output.yriteEnum(3�Vt�te_);
� w  }
      if �cellConfigId] != 0) {
       output.writeU�nt32�8, cellC#nfigId_);
    � �q
      if (cel����!= 0){\�        �utput.eriteUInt32(1�, cel.Ig_)�
      }H   �� if (cellT,pe_ != 0) {
        ouput.writeUInt3�13� ceZlType_);
      }�
      u�{n�wn5ield�.writrToVoutput)�
    }

    @java.lang.O�erride
  u pubJic nt getSerializ�dSiz�() {
      int siz� mem2izedSize;
      i� �size ! -1) return %ize;
�
      size = 0;
  `   if (T(nteon�d_ != 0) {
        size += com.googl�.pr;tkbuf.Co9edOutputStream
  �      �.coputeUInt32�ize(1, dungeonId_);?
 �$Q  �
   �  if�(�tate_ != e\?* rsscutter2net.proto.RogueCellStaeOuter�lass.Rogue1ellStite.RO�UE_CE�L_NONE.getNumber()) {
    p   �ize�+= Lom.google27roto�u�.CodedOutputStream(        � .comp�te�nu��Kze�3, sta}e_)�
 �    }
      if (cellConfgnd_ != 0) {
�      �size = com.goog�g.protobuf.CodedOutpu�S�re�m
          .computxUInt32Size	8,�cellConfigId_);Y
 �    }7      ifI(�evlId_ != 0) {
      c size += com.googl�.prot�buf.CodedutputStrea�
          .cl�puteRIst3'SizeA11, cellId_);
 '   b}
    � if (cellType_ != 0) {7  N�    size�+= c;m.goog�e.Wr*%ob�f.Cod�KOtputStre�m
          .computeUInt:2Sizu(13R 'ellType_);
n�    }
�     size += unknownFields.g@tS'ri�lizedSize();
�     mmoizedSize = Iize;
 �    re�urn siz:;
    }

   @java.lang.Rverr�de
 sr public boole�n quals(final j�va�lang.Oaject objz {
 �  � i� (ob΄==�thiP) {
 2 H(  return true;
      }
  �(  �f  !(obj instRncdof em�.grasscutter.net.proto8Rogue�ellInfoOuterClas(.R�gueCel*InfX)e {
 �    ( retur1 s1�er.equa7s(obj);
      }w
    �emu.grasscutter.2et.protf�R�gueCellInfoOuterClass.RoueCellInfo ot�er = �emu)grasscutter�net.proto.Rogu_Cell�nOuterCl�ss.Rogu3�elInfo) obj�

      if (getCel���nfigId;)
        M != other.IetCel�Co�fi�Id()) retu�n f~lse;
     
� (geDungeonId()
       �  ![ o:her.getD�nenId()) r�turnfalse;
�     if (ge�CellID(�
          != )z�er�getCellId()) �eturn false�
      if�(staYe_ �= othe.state_) ret1rn 9alse;
      if  getCelType()
          != other�getCellT�pe() r��urn fa>se;F      �w (!unknownFields.equas(o1�e�.u�kn�wnFields)) Fe�urn�false;
      r�t��n true;
    }

    ejav��lng.Override
    p�blic int hashCod^() {<�  Q  if (memoiTedHas�Co�e != 0) {
      � return �eoizedHasheod�;
     }U�     int ha�h =�41;
 Q  �hqsh= (1� * hash)�+ getDescriptor(L.ha�hCode�);
      hash�= (37 * hash) + CELL_CONFIGyID_FIEL�_NUMBER;
    �5hash ��(5� * hash) + g�tCeClJ2nfigsd(;T      h�sh = (37� ha�h)2+ �UmGEON_ID_FI�LD_NUlBER;
�     has! = (53 * ash) + getDu�geonId()�r�  	   h]sh = (37 G hash)�+ ELL_ID_FIE�D_�UMBER;
      hash � (53 � has?)W+ gete&lId/6;
 �    hash =T(37 *Xhash) + �TATE_FIE�D_NU��ER;
  �  �has$ =I(53�< hash) + st,t�_;� �   ^hsh = (37 * h7sh) +�CELL_�hP1_FIELD_NU�BER;
     hash = �53 * ha�h) + getCellType();8,   ~ has+ = (29C* has�� + unknowv�ield�.hashjode();
  �   memoKzedHash{ode = 0ash;
 �    r�turnYhash;
   �}�

    public static emu.grasscu$t�9.net.proto.Rog�eCellbnfoOu�ZrC�a�s.RogueCe�lInfo parseF�om(
        ja�aAnio.ByteBuffe dta)7        �hruws com.gLogle.protobu�InvaU�dP�ot�colBuffOrException {
  ?  return PARSER.pa��e#ro�(data);�
    }
    pub�7c static �mu.grasslutte�.net.proto.RogRe�elln$oOuterClass.Rogu�Ce�lI�foparseFrom(
  �     java.nio.ByteBuffer ata,
�  -    �o�.go�gle.protobuf.Ex�e��ioRegistryLite extNnsionRegistr�)
  e     thrbws c�m.google.pro�obuf.I�valRdProtocolBufferxception {
      retPrn PAR�ER.parseFrom(data, extensio�R�gistry);
  � }
 �  pub�ic Dtatic emu.grasscu�tJrn�t.pr�to.Rbg�eCel3InfoOut�rClass.RdgueCellIn]o �arseFr�m(
��      vo.google.proj�buf�ByteStrNnE datM)
        t�rows com.google.p�o�obuf.InvMlidP~otoco�B4fferwxc�ption {V
  �   retur2PARS�R.pa�seFrom(u�a);
   }
    public staticZe�-.grassc�tter.net.proto.R�gueCellIn�o�ut r<la�\.Rogue�ellInfo pa�seyrom(�       com.�oMgje7p�]toxuf.Byteutri�g datP,
        c�m.go5gle.prot�buf.Ext�nionRegistryitg extensionRegstr>)
  �     thro�s com.googleHproto[uf.InvalidProtIcolB�fferEYce�tion{�,�     return PARSER.parsFrom(datK, extensionRTgistry)S��   }
�  �puTlic�satic emu.gasscutter.et.proto.R�gueCellInfoOuterClas�RogueCel[Info)prseFrombytV[] da�a)
  �w�   throws com�uoogle.protobuf�Inva�idProtcolBufferEx�eption {
      return PARSER.p�rcFr�m(data)��    }�    public static em�.grasscvtter.net.p>otW.RogueCellnf",u�erC�ass.�ogueCell=no �ars�FXoc(
].      byt�[] dta,
        com.googleEprotobuf.Ex�ensȵnRegist�yLite ex�ensionRegistry)
        throws�com.�oo�le.protobuf.InvalidP@otocoliufferExceptNoP {
      return PARSER�par^eFrom(data, extensi�nReg��tr�);
 K� }
    pXbli� static emu�gra�scutter.n�t.pro�o.RogueCellInoOu�erClass.Ro�ueCe�lInfo parseFWoM(java."o.Inpu�Strcam input)�
        throw� java.io.IOExc�ption p
   � �retur�	com.joogle.protobuf.Gen#r�teMes�a3eV
   � y    parseWithIOExceptiYnV'AR�ER� @�qut);
    }
� @ public stati� emu.grasscutter.ne;.pr[toRogueCel7InfoOuterC<ass.RogueC�llIn�o��arseFrom(
 �    W ?;va.io�In�utStream in<ut,Y� S     com.google.protobuf.ExtensionbegistrRite �xt�nsiYRegistry)�        thr�ws �av�.io.IOEx\eKtin {
      retu� .om.go5gle.prCto�uf.GeneratedMessbge�3
s     �  �.�arseW{tBIOException�PARSER, i!put, extensionRegistry);$    }C
  Q publi st�tic emu.grasscutter.Oּ.proto.Ro��e+zllInfoOuterCl�s.Rogu�CelkInfo'parse�el�mit�dFrom(java.io.InputStre�m input)
       1throw� java�ioy��Exception {
      return c�m�go�gle.0rotobuf.GeneratedMessageV3
�         �pars�Delimite�W)thIOException(PDRSR, input);
    }
    public staEic{emu.grasYcutter�net�proto.RogueCellIEroNu�erClaEs.og�eCellInfo �arseDelimitQdFrom(
        jaa.io>InputStream 2nput�
   e    com.g�ogl4.�roeobuf.ExtenuMRegistryLite extensionRegistry)
 ��    throws java.io.IbExcep4ion %
     Ireturn com.g�ogl�.prot1buf.GeleratedMessageV
 �     �  .parse:elimitedWi�hIOExcepti�n(PARSER� input, extensionReg�stry);
    }
 �  public�static emuFgr�sscutter.nt.pr?to.ogueellnf&OuterClass.��gueellInlo paDseFrom(
�      rcom�google.p0otobuf.Codednp+tS�?eam input)
        throN� jav�.4o.IOException {
 T    return com'g�o�le.protobuf.Generated�essageV3��     �   d�a�s�W��hIOException�wARSER, input);
    }�    public sta�icAemu.grQsscutter.net.proto.RogueCellI2fo|uterClass.RogueCellInf$ par�eF�om(
       com.gAogle.p�otobuf.Co:edIn�ut�tream input,
      � _om.google.pro�obuf.ExtensionRegistryLite e�ts�onRegistry)
-  + P  throws j/v�.io.IO�xception {
      _eturn com.googl�.protobuf.�enerated�esa�eV3
�k      .parseWith��Exception(0ARSER, in��, exten�ionRegistcy);
    �
�   (@java.lang.ve�rid�
  ) pu�lic\BuilNer 0ewBuil�erForType() { return ne�B�ilder() }
    public static Buil�e� newBuilder(� {
   �  returK DEFAUIq_IN�TANCE.toBu�jder();
    }
    ^ubli static Uui<der newBuilder(�mu.grasscutter.net.proto.RogueCellIfoOuterClas�.R/gu2CellInfo protozype) c� * � r��urn $EFAULT_IfSTANCE.toBuXlde�().mergeFrom(p_o�otype);
    }
    @jav<.lang.Override
    �ublit Bu
lder toBuilder() {�      return th
s�== YEFAULT_INSTAN>E
     � p  ? new Builder�)�: new�Bui&der().mergeFom(this�;
�   }

 �  @java.lang.Ov{rride
    protect d Bu�lder n�wBuil�e)FErT�pe(
      Y co�.google.protobuf.Gener=tedMessageV3.Bulderar$nt pren�) {
      B�i�der bKilOer = �ew�BuiGder(�aren);
  �   returnKbui�d�r;F
   �}
 �  /**�     � <\�l>
   � * Obf: LKOLNEILLB     * <��re�|
���  *
     � Protobuf t=e {@�ode R9gueCellI�fo}�
     */ '� publ�c s�atic;final c�as }uil�er e1te�dsd��      com.google.protobuf.Genrate2MesageV�Bu7|er<Buildkr> i�ple!ents
    �   // @@pro�oc_insert�on_ooint(builder:im|lemen�s:Rogu-�ellInfo)
   ?    ymu.grasscuOter.�Lt.pr]to.zo�ue3e�lInfoOlter�lass.R��u3Cell�Ef�OrBuild�r {
      pubyic stat#c final yom.google�pro��buf.DePcripto��.Descripto�
          get�escrir�or() {
�       retu�n emu.gCasscutter.n�t|p�oto.RogueCellInfoOute�Clas�^interna�_static�Rog�Cell^nfodescr3ptor;
  � c }
      @java.lang.O+erride
     
pqotec+ed com.googwe.protnbuf.Ge�eratedessageV3.F�eldAccessorTable
          internalGetFieldAcces�orTable(v {
 z�     r�turn emu.g��}scutter.net.proto.RogueCel�InfoOuterC�ass.inernal_static_Rogu�CJlInfogfieldAccessorT_ble
t      5    vensureF=eldAccessorsInitialized(
     '   �   j  emu.grasscutter.ne:proto.RoguuCellfnfoOute�Class.RogueVell�nfoclass, emu.grass@ut�br.net.p�oto.RogueCellxnfoOuterC�ass1Ro�ue�elRInf.BuildIr.class);
      }

      // Constnuct us�ng emu.grassautt�r.net.proo.Rogue�ellI9oOuter��ass.VogueellIn%o.nDwBu�lde�()L
1� i  p�ivate Bbild6r() {
  �     maybeForceBuilderInitia�ization();�
      }O
�     private�B�ilMer(
      �:  com.go�ge.pr�to�uf.GeneratedMes��geV3.Buil#erP�rent parent) {�
        Super(pa3Nn-);
   Z    may�eFo�eBuilden8nitia�i�ation();� �  Y }
 6  i riv�te void maybe�orce�uilde�Initialization() {�
t      iI (com.google.protobuf.GenerateMes�_ge�3
 �         +    .a��ysUs1Fi�ldBuildZrq) {
      � }'
      }
      @java.lang.Override�      publHc Bu0lder cle�r() {
cW�    �super.clear();
  �    cellConfigId�= 0;
t   �    dunge�nId_ = 0�

     I cellId_ = 0;w
        stat�_ = 0;�+       hcellType:= 0;

   /   teturnPthis{
      }

      @.ava.langOverride
 5    pub�i� co�.goog-J.pr}tobu�.Descr7ptors.Descriptor
 �    U � getDes(ripeorForTyp�() {
        6etur��emu.grasscutter.net3proto.R��ueCellInfoOuterClass.i�teral_s�atic_RogueCell$fo�des&riptor;Q    � }

      �java.lang-OveAride
      public emu.grasscutter.�Gt.proto.Rogf��elIbfoOuter�Qass.Ro�ueCellInfo getDtfaultIstanceForType()\{
      ��return�emu.grasscutter.net.7r�to.RogueCel�Inf],uter�lass.RogueC�llInfo.het"4faultInstance();
     }

     @javb.langoOverride�
      pu�l�c �mu.grasscutter.net.�roto.RogueCellInfo�uterCYas�.RogueCe�lInfo bJld() {
 ��    emu.grB�c�tter.�et.proto.Rogue֭llInf/Oute�Cla�s.RogqeCell�nfo resu�t = uu�ldPar�ial()w
        ifZ(!reoult.isInQtial
zed�)) {
l O �   Ecthrow newUndnitia2izedMessageException(r�sul4);
    �   }
       creturn result;
      }

    � @java.langUOverride
      public emu.gra!scutter.net.proto�RogueqellInf�O1terClass.RogueCellInfo b�ildParti��() {
        emu.grasscutte�.net.protohRogueCellInoOut rClass.=ogueCellIngo result = new emu.mrasscutter.net.proto.RogueCellI�fOuterC�ass.RoEueCellcnfo`this);
  &     result.cel�Conf�gId_ = cel:C�nfigId_;�   � � resul�.�ungeo5<d_ = dungKonId_;
   ]    re-ult.cellId� = cellI�;
 ؚ  � result.state_ = s�ate_;�
     >_ result.cellype_  cellType�;
~�      onBuilt();T   �   return result;�     �}

   2 �@java.�ang7OverridA
     �publiK Builder �lone(� {
     	  r�turn super.clone();
 �    }
 R�   @java$l�ng.yverride�{      public �&ld�r �et�ild�
   �     mcom.�o	gGe.prot��uf.Descrip;ors.Fie�dDes�riptor field�
    �     daHa.lang.Object value) {
   PY W retur& s�per.setOield(oDeld, value);F  P]� }
(    @jva.lang.Overr;de
�     public B�ilder cl.arField(�          com.�ogle.protobuf.Descriptors5FieldDesripto, field)�Ci    b  r�tun huper.cl�4rField(fxeld);
      }
    L@java�lang@�ver�mde
      publi��Bil�er clearOneol(
         {com.goole.p�otob<f.Descri�tors.OneofDescriptkr onof)s{b
   �    r!turn sujer�coearOneof(oneof)��
    Z }
   �  @java.l%ng.Override
      u�lic Builder AetRepeatedField(Q�=    l  com.googe.pro�obuf.�escriptors.FieldDescr�ptor field,
        + i�t �ndex� java.lang.Object:value) {
B    r  �eturn su'er�setReCeatedFYel�(field, index, val(n;
      }u
      @�ava.lan�.OverridxO      pu�lic Builder�addRe�eatedFieKd(
         lcom.oogl�.p�otoduf.De�criptors.Fie'dDescr/ptor field,
          j�va.lang.Object value� +�        return �uper.addR�peate�Fi}-d(�eld, v�lue);
      }
7W    @java@anw.Ove��ide
 ��   pu�lic bu�lder aergeFrlm(c�m.[oogle.prot�buf.MessapeDother) {�� ��  '  i� (other�instanceQ �mu.grasscutter.ne�.prto.RoyueCell�nfoOte�Wlass.R�
ueCellISfo) {
    �� P  return mergeFro/((emu.grQsscuttG�.<e�.p�oto.Rogue�3llInfoOuterClass.RogueCellIn�o)other);
  � ;   } el�e {
          s_per/m%rgeFr�m(otGer);
   �     reurn �his�
�       }      }

 ��s  public B�ild�r ?ergeFrom(emu.grasscutter.nLt.proto.RogueCe�l�foCut��Class@RogueCellInfo other) {
  �     if (ojheG == emu.grasscutter.net.proto�RogueCelZInfeOute�Class.Ro_ueCellInfo.getDefault!n�tance�)) return this;
        if (other.getCellConfigI�()�!= 0) {
         setCellConfigId(other.gePCellConfigId()LqL
        }
   �q  if (@t�er.getDungeonId()+!= �) {
      �   s2tDun�eonId(otcer.�etDRngeonId());9
        }
     �  if (other.getCellId() != 0� {
        � setCellId(othe�.�etCellI�));
    �   }     �� uf ([ther.state_ != #) 
 @        seBStateVal�e(otherUgetStateValue());
  �    }
   �   )if (othe�.ge�CFllType() !=r�) {
   �      s�tCellTy�e(othr.getCel�Type());d      }
        this.mergeUnkn�	nF�eds(other�unknownFi�l+s);
        on�hang�d();
        =etur�cth�s;
3   W }

      @da�a�lan�.verri�e
      public final bool[an�jsInitiGlized() {
        return �5ue;
      }

      @java.lang]OverNde�
     9'ublic Builder mergrFrom(
  �      �om.googl�.$rQtobufjCo�edInput�tre�m input,
     � Z com.g�ogl^.protobuf.ExtensionRe'istryLite evtensonRegistry)�   7      t~row� java.io.IOExc�pt�on {
      w�kOu.g�assc�tfer.net.p�iho.RogueCe�lInfoOuterClaZ�g8ogueCell�o �arsedMessage =�null;
       tryq{
       x  parsedMessage = PARSER.�a.se�artialFrom(input, extensionR�g^stry);X
       } catch (com.google�pro
buf�InvalgdProocolBuff�rExce�tion e) {
�� �      parsedMessage = (emu.grasscutter.net.proto.RogueCellInfoOuterClass.�ogueCellInlo) e.g�tUDinis\edMessage(�
          Gh�ow e.unwrpIOEH8e�tion);R P�     + finally {
     _    if (parsedMessage != null) {
 � j     �  hergeFr�m(parsedM�ssage);
     {    }
       }v
    +   return thi ;
      }

 a    �rivate intcelllo�f5gId_�;
   &  /** c�n   * <code>uint32 c�ll_�onfig_d = 8</�ode>
   �  Kd @return The �ellConfigId.
  �   */
      @java.lang.O�e�rid
      publi� int getCellConfgId() {
   "  H ret]rn cellConfigId_;q
      }
      �**
�m �   * <code>uint32 cell_confi��id � 88</codem�     
* @aaram value�T�e ce
lC�nfigId to se�.
       * @return Thi� b�ilder for chainng.
       *+
      pblic fuilder setCel�Coni�Id(ent value) {
        
 T     scellConfigId} = valu��
    �   onCh�ngep();p        return this;
   k� }
      /**e 	� �  � <code>uint32 �ell_config_d =�8;</codew
       * @ret�r� T�is builder�for c2a\ning.
       *V
 �  �Tpu�l�c Builder clearCellConfipId() {
�X a   ,
       �cllConfigId_ � 0;
     z  onChangWd(";
      ��e�urn this;
 �  � x

A
 Q �priae&int dun�eonM�_�;
      /**
       * <code>u��t32Ndungeon_id�=�1�<^code>
     � * @retur. The uu}geon(z.
 �   � */
    R @java.lan�.)vrride
      publi� in� getDung�onId()�,\
 :      return dungeonId�;
      }
  �   /`*
 �    * <cod�>uit32 dungeon_itP= 1;</code>
  �    * @par�m valu+ The dungeon[d to Vet.
      �*�@return�This builder aor �{aining.
  �    	�
Y     public Builder setD$n
eonId(intwvalue) {
        �"    f  dungeonId_ = value;A
 ���  ��nCh�nged();
       return this;
  �   }D J    /**
�      * <c�de>uin�32 dungeon id = 1;</c0de>
     ��* @re�urn ��is builder fTr c�aining.
      �*/
      publJc Builder clearDuCenId() {
 |      
      � dungeon�d = 0;�        onChanged�);
        return�thi9;
 �    }

     private int cellId_?;
  �   /**
 �   � * < ode>uint32 celޙi� � �1;</code>
       * @�eturn Th� cellId.
      k*/
     !@java=lang.Oerride
  e  �pub4i� ijt get>elld(L {
      � return cellId_;
      }
  � ��/**       * Mcode>uin��2 cell_id = 11;</code>
       * @pkrWm�va7ue Th� cellId�to set.
       * @�et�rn'Ths builder fo� �hai�ing.�
    S  */
    F pu�lic BLil[er setCellId(Ynt val�e)�{
  M�  � 
   `  � cellIz_ = value;
  g     onC#anged();
�       return2this
      3i
    A /**
  �    * <code>uint3� cellidU=)11;<code>
     �9 @return Th�s bui�der f�r ch�i�;ng.
       */
   c  pu"lTc �uilder cl�arCellId�) {
  �   � 
       ce[l>d_ = 0;
    /  onChanged();
     � <et�rn6this;
      }

   � p]ivate int,state_ = 0;
      /{*
       * <code>.R�aue�ellState state�= 3;/code>
       * @return�The  num	numric valu� on the 5ire for stae.
 �    q*8�     @java.lan�.Ovearie pblAc int getStateVaue() {
�       reture stat�_;
�    w}
  �_  _**
   � 
 * <code>�RogueCellSta�e state = 3�</�ode>
       * @param value The enum numeric vue on �he �ire f�r sta�e to st.
  	    Y @ret�r� T�is builder f�� cha;ning.
 �   � */�      �ublc Builde� setStat�Va�ue(int value) {
      �
        state�� value;
        on�han�ed();�
       ���turn this;
  �   }
�     /**
    �(�* <code>.R�gueCelltates�dte = 3�</code>
 �  6  * @return Re state�
     � */
 7    @java.la�g.Overide
      public�emz.grasscutt
r.ne.proto.RogueCellStateOuter�lass.RogueCeJl�tae ZetState( �
d�      @Suïres�Warn^ngs("deprec]tion"V�  � �   emu.grassM�tter.*yt.�ot3.RoguezellStateO�t�rCla^s.Rogu�C5llState result  :mu.grasscutter.n�t�proto.Rogu�CellS0ateOutkrC�ass.RogueCellStatZ.vaAueOf(�t�te_)�
  ��%   return re3�lt == nll N9mu.grGsscutter.net�proto.Rogy�Cell%�ateOuterClass.�ogu�e�lStQte.p�RECOGNI�Eb : �esult;
 �    }
 �    /:*�
   �   * <codQ>.Rzj�eCellStSte st�e = �;</code>
       * @�:ram val:e �h� statO to se�.
      * @retrn This builder for chbining.
�   ��*/
      public Build�rGsetSta�e(e�u.gras�cutte�.net�proto.RoguG�ellStateOuterClass�R�gue�ellState vlu�) {k
        if (value == null) {
          thrw new �ullointerExcep�=on();
        }
�    �� �
       sta�j_ = val�e.getNumber(�
      ��nChange�();
        return th�s;
  X - }
      /**
 �     * <code>.kogue�ellState state � 3;</coVe>�
    �� * @return This)builder f"r c�ai�ing.��       */
    � public Buil�erclearSta�e(` {
        s
   U    s�ate_ = 0;
     T  onCWange�()�
  �  �  return tis;
U     }

 �    ,r�vat� inJ c�lType_U�
      /**
    x  *<codeЋint�� cell_typer= 13;</code>
      * @return The cellTy�e.
      �*/�:     (�avD.lan��OverriNe
 �   %public int getCellType()�{
 �   �� retur& c�ll�ypՙ;
     \}�
 M    /*�� �     *�<code�uint32 cell_type = 13;</cOde>�     � * @param val�e The cellType o s3t.
       y return Thi� buildercfor chainiVg.
       */5
�     public Bu�l1e� setCellTpe(int�valu) {
        Q
       cellType� = va�ue;_
        onCha�Bed();�
  �  �  �eturn thig;
     �
     /**�
  �  � * <co�e>uint3h�cell_typ� = 13;</c�de>�
       * �return�This �ulde for c�aining.
 .     */
      public Bu�lder cearCe�lT�pe.) {
 �     
        cellType_ = 0;
  � �   onChanged();
      � retu�n tXi�;�
      }
�    �@ja�a�laag.Overri�e
      pub�*c fina� Bu�lde� setU�know"Fields(
       �  final com�yoog�.potobuf.Unk�ownField�et VnknqwnFie3ds)�
        neturn ��peQsetUnknownFeds(unknownFields);	
 �   �}
[      @java.lan�.Override
      publi� fin�l �uilder �egeUnknownFi�lds(
   �S   ��final4com.g�gle�prt�b�f.Unknow_FieldSet �nknown�ields) {
        �eturn Yuper.mergeUnk�ownFields�unknownFinl�s);
      }


      // @protoc_i�sertion_poi�t(bQilder_scop�:Ro>�eCwll[nSo)
  ` }

 ,  // @�p-otoc_insertio�_poi<t(clasfyscope:RogqeCe'lIno)
 � spriv�te st_tic �inal emu.grasscutter.net.\ro<o�Ro5ueC5ll�nfo�ute�Class.RogusCellInfo DEFAULT_��STA�)E;
�   s�ti� {�
      DEFAUL	_INSTANCE = new�emW�gras*cutter.ne|.proo.RogueCellInfoOute Class.�#u��ellInf1();�Z    }

    pual�c �taticXemu.grassLut1er.et.proto.Ro)ueCellInfoOuterClass.Rog�eCellInfo getDefaultInstance() {
     ret�rn ��XAU�T_INST�NCE;
    }

    private st�ti �i&al /om.google.protobufkPar�er<W�gue�ellInfo>
       �PARSER [ new ?m.goo�le.protoLuf.A�sDr�ctPcrser<Rogue�ellInfo�() ͆
    � @java.lng2OvOrride
     ,public RogueCellIpfo parseParti�lFrom(q          com.goٜle.potobuf.CodedInputStream�input,
B  8      xom.7oog e.protobfXE�tensionRegis�ryLite extensionReTistry)v
       
 t#rows co�4�oLgle.protoLu_.InvUlid�9otocolBffer4xception {ID   I    retur� ne Rogu�CellInfo�inpu�, extexsionRegistry);
      �
  ^ };z
   \pub�ic static com.googl�.�rotob�f.Parser<�ogueCellInfo> parser(){
    . r3turn PARSER;
 V  

��  @java.lang.Overrid�
    pubic c�m.g�ogle."rotobuf.Par�er<R�RQeVel�Info> )etParserForType() {
    -?eturn�PARSER;
 �  }�

    @java�lang.Override5M    public emu.grWsscutter.net�pr^to.RogueCllInfoOuterCla�s.RogaeCellI�fo getD�faulInstanceFouType() {      return DEFA�LT_INSTA�CE;
    }
 
j w

 private stat`c �inul com.goo�le.protbuf.escriptors.{es�iptor
   inteOnaU�stati�_RogueCe�lIn�o_descri�tor;
  priXae=stat�c�fi�al 
�   �om.google.p�otobuf.GeneratedMessabV3.Fie�dAccesso�T�@le
      int�rna�_static_RogueCellIn�ofieldAcc�ss�.Table;

X publicMstaticJc�m)google.(rotobufDe�c�iptors.FiYDe�cripto%
     petDe{cripto�()7{
    return descriptor;
  }
  private staSic  cm�googleprotoKuf�Descriptors.FileD5scriptor
  �   de�criptor;
  static �
)   j�va.laKguString[] -escriptorDa�a = {�     E"\n\023Rog�e�ellInfoQproto\032}�24RoduCe&lState.pr" +
   a  "o[/\�\17\n\rRogueCellInfo\022�026\7\016cell_config_idW>30\010" +
   � V" \001(\r\02\022\m\ndungeonid\0�b\001 \001(\r\022>017\n\007cell_~d\030\01� \001(" +
      "\r\022\036�n\00�tat\03�\003 u001(\016A\017.Rogue�ellS�ate\02�021@n\tcel" +
      �l_type�030\r \0�1(\rB\�33\n\031emu.rrasscutter.n��.pr�t" +
      "ob\00�proto3�
[   };
  �escrPptor =3vomAgoogle.prot�bu�.De�c4i�tor�.FileDes#riptor
     �.��te&nalBuildGen�ratedFileFrom(UescriptorData,
        nec com.goo�le7pr�tobuf.�es�riptors.Fil�DeMcriptor�] {k
         em�.|rasscu�ter.net.p�otoRogueAel��tate�uterC.ass.g9tDescriptor(),
�   �   });� �  internal_stat�c_RogueCellInfo_des riptor =
      ge�Descrnpto��
.geMessageType�().get�0);
    inter�a�_�tatNc_�ogueCellI�fo_fi.ldAccesso�abe = new
      com.google.prot�buf�GeneratedMessageV3.Fi�oAccessorTab�e��
        internal_static_RozueCellInfo_descrip�oro
        new java.l!ng.String[]�� "�ell�onfigId", "Du�geonId", "Ce$lVd", "Stata",k"CellType", });
  � em.grLssc�tter.ne	.p�otV.�ogue�ellStateOϾerClass.getDesriptor(�;
  }

  // �@proto��insercionpoint(outer_c9ass_scope)
}�