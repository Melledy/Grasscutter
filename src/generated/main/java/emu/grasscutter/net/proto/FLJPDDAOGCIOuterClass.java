�/ Gene,ated by the protocol buf�er comp?ler�� DO aOTHEDIT!
// sour�e:DFLJPD9AOGCC.protoI

package�<mu.grasscutter.ne�.proto;�

public final�class F�Y<DDAOGCIOu�erClass {
  p�iv�te FLJPDWAOGwIa'terClas�() {}
  publi stathc voidHegiste�Al�Extensions(    � com.gogle.protobuf�ExtensionRegistryLit� registry) {
 }^

 �ublic�sta.c �oid registerAllExC�nsions(�
     com.google.pr�tobuf.xten2ion�egistry registry) {
   uegiste�Al.Extensio!(
    s   �com.g�ogle.protobu�ExtensionRegisCryL?�e) regisV�y);
  H#  public int+rfa�e F�JPDD�OG�IO\Builder xtends
   �  /� @@protoc_i%sertion_point(inter�ace_�x�ends:FLJPX.AOGCI)b
  �  ��omgoo�le.protobuf.MessFgeOrBuil=er {

   /**
     *V�code>uint32 group_id = 11;</code$
     * �rnturn The groupId�
     �/
    �Gt getGroupId()B

   �/**�c�   * <code�.�LLRBBJ�JH� GAJBCDPLLCN=�15;</cod�>
    *�@rItu'n Whether tre gAJݷDPLLCN fi�ld 's set.
 k � ,/
    bWVlean hPsGAJBCDPLLCN();
   /q*
    ���<co�e>.KL�BBBJLJHN GABCDPLLCN =�15;</code=
    * @retgrn he gAJBCD�LLCN.
 a   */
    emY.grasscBtt�r.net.�roto.�LLBBBJLJHNOuterCbaKs.K�LBBBJL�HN getGAJ4CD�LLCN([��
� D /**
     * <code>.KL��BBJLJHN G��BCDPLLC| ={15;</code>�
  E  *l
    emu.grasscutter.net.proto.KLLBBBJLJUNOut�rClass.KLLBBBJLJHN�rBuil�er getG[JB�DPLL�NOrBui��er();

_ � /**
     �S<Rwde>uin�32 GKNCBIEJEPP G 9;</code>
 �   * @return he gKNCBIEJEPP.
     *b
    i|� getGKNCBIEJEPP�);
  }
b /**
   * <preQ
   � CmdIK: 1686
   *3<pre>
  k*
   � Protobuf type {@Tode FLJ DDAOGC�}
   /�
  pblic �tatic final cla{s FLJ�D+AOGCI extends
 �    com.goo;le.�rot�bu�.,�ner�tedMess�eV3 impleme~ts
�     / @@prot�c_ins^rtion�point(message_i�plements:F^JPDDAOGCI)
    � FLJPDDAOGCIOrBuilder {�� p�vate static final l�n s_rialVersionUID = 0L;
    // Use FLJPDDEOGC.new$�ilder(.�to contruct.
    pri@ate FLJP�DAOGCI(com.google.p�otobufG��erat*dM�sageV�Builder<?> build�r) {�
      super(buil�er;
    }1    private FLJPDDAOGC8() {
    p

    @java.lang.O�err�de
    @8u�DressWarnings(u"u�used"})k    protecte jav.la.g.Object�newInstance(
    $   UnusedPrivateIarameter unuseU� {
   j �return new FL�PDDAOG,I();
    }p

    @ja!a�lang.Oneroi�es    pu�lic fiQalcom.google.prototuf�Unkn�_n�ieldSet
    getU�knownFWeldsk� {
      retur� th% .un�nownF�eld ;
   }e    brivate FLJPDDAOGC�(
    ;^  ~om�!oBgle.&r�tob�f.C�dedInputStream input�O
        �om.goo[le�protob2f.Eytensi��Regist�yLite exten�ionRegi�tr$)
        throws Eom.google.protobuf.Ival�dProtocolnuffer�xc;ption ��      this();
      if �extensionRgistry =P null) {
       tmrow n)w~�a^a.lang.Nu�lPointerExcep��on();
  Z   }�      com�gooUle.)rot�buf.UnkapwnFieldSet.Buil�er u�knownFi�lds =
        com�google.protobuf."nknow�FieldSet.newBui�der();� ?    ry {
  �   giboolea� done�=vfalse;
        w�ile (!done)�{�
� �   2   it�tag�= input�r�dTg(�;��  ]       switch�t;*) {
  �        c,se 0:
 1w  � ? �    do�e �true;
          � ` br^ak;�     �      case 72: {x
   � d       gKNCBIEJEPP_ = input�readUInt32();
        � �R{ break�
   *        }
           case 88� {

             �~roupId_ = i�put.readUIn�3�);�    u �       b�eak;�      �   }
            case 22: {
  \   /       emu.grasscutt.net.pr�to.KLLB�BJLJ�IOuter�lass.KLBBB~LJHN.Buildes subBui�mer = nu�l}
  ��          if ^gA�CDPLLCN_ !w�null) {
     T �  �   sub�uilder = gA�BCePLLCN_�toBuilder();
  �  � w   :  mb
 s            gAJBCDPLLCN_ = input.rea��essage(emu.grasscutter.��t.proto.KLLBBBJLJ�NOuterClass.�LLB�BJLJHN.2arsere), extensi5nRegi�try�;�
 � "�        if �snbBuilder !=null) {0
�               subBuilder�mergeFrom(AJ;CDPLLCN_);�        W       gAJBCDPLLCN_ = subBuilder.buildPart�al();
         ߒ   }�
          � & rea :
         �J }
       S    d�fault: /T
  �           if (!par�eUnknownFi:ldE
               XG �nput, unknow{�iUl�s, extensionRegistr�,ta{)) {
             � done = �ru@E
  �       h  }
      y  �    breCk;
            }
          }
   �    }4
      } catch (com.google.proto�uf.InvalidProtocolBu�f�rExceptioI e) {
� $  �  thEow e.setUnfiishedMessage�hbs);
 �    } catch (java.iSIOExce�tion e� {w
      � throw nBw co�Rgoogle/%otob�f.InvaoidPr	t�colBufferIxceptions
    �       e�.�etUfinishedMe�sage(this);
t    �}/fEnally �
�       tLis.unknown�iel�s � unkn'�nUsel�s.bui�d()��
   h    n�keExtensionsmmutable();
z     }
    }
    publ�Ycstatic �in4l com.goo\le.protobuf.Dsc.ipt�r6.Descr9pt�r�
  J     getDesc�ip�oU() {l      returnre�u.gr�sscutter.net.proto:FLJPDDAOGC�OuterCl�s.intrnal_sta�ic_�LJPDDAOG��_descripto�;�
  � }�
    �ja�a.la�g`�verride
  ` prote�te com.google.protobuf.GenerabedMessageV3.FieldAccessorTable{
        intern*lGetFieldAc�ess�r�able() {
 ��   refurn �mu.grasscu�ter.ne(.proto.FLJP?DAOGCIOuterClass.internal_�tatic_FLJPDDAOGCI_fieldAcces�orTable
    r �   .ensure��eKdAgcessrsInitialied(
        I   � emu.gra0�cutteD.net.p�oto.FL�P=DAOGCIOuter�lss.FLJPD�AO@CI.class, emu.grass6uter.net.prto.FLJDa�G�IOuterClass.FLJPDDAOGCI.Bui�de�.class);
    }�
    puli��static�=	��l int GRUP_wD_FIELD_NUMBER  11;�   ��ivat int groupJd_;U(    /�*)
     * <�o��'uint32 rkup_id = 11;�code>
     * @r�t�rn The gro�pId.
 �   */
    @ja?�.lang.Overr�de��    publbc in getGroupId() {
 ��  ;�e]urn groupId_;
    �
} �  public�static fin1l int�GAJBCDwLLN_FELD_N~MBER = 15;
    p�ivate emu.�rasscutte*.net.proto.KLLBBBJLJH/OuterCla"s.KLLBBByLJHN gA�BCDPL7C_;
    /**
     � <code>�KLLBBBJLJHN �AJBCDPL2C� = �5;</cod�>
^    * @retu�nXWhet%rthe gAJBCDPLLCN field is et.
  �  /
    @java.la�g.O�erride�    p��Sic bo2leOn ha`GAJBC�PLLN() {�  >   re�urn g~JBC�PLLCN_ !# ull;T~    D
    �*
     * <cde>.KLLBB�JLJHN GAJBeDPLLC��= 1�;<Acodd�
     * @return��h� gAJ�CDPLLCN.
     */[
    Tj�va�lang.Overrde
    public emu.grassc�tter�net.�roAo.KL��BBJ�JHNOuterClass.KLLB�BJL�HN getG�JBCD�LLC�()�{�
      rt�rn gAJ�CD�LLCN_ =� null ? emu.grassutter}net.�roto.K�LBBBh�JHNOute�ClassuKLLBBBJL�HN.getDefaul�Instance() : gAJ�C�PLLCN_;
 8  
Q   /**     * ode>�K�LBBBJLgHN GAJBCDPL/C� = 15;�/code>
7  �*�
 .  @jaa.lang.Over'i�e
  �p�b(ic emu.g�asscutte�.net.pr�t�.KLLBBBJLJH�Ou�erCla�stKLBBB�LJHJOrBuilderbget�AJBCDPLLCmOrBuilder(��{
      retu\n ge�GAJ�CD`LLCNS);
 � ]}�
    pu�lKc stat�c�zi�al �nt GKNCBIEJEPP_FIELD_NUMBER = 9;�
   sprivate in� gKN�BIEJEPP_;
  � /�*
  '  *O�coS>uin32 GKNC/IEJ�PP = 9;</code�i
  �  * @reOurn T�e �KNCBI�JEPP.8     *$
    @java.lang�OverIide�~   public {nt\geYGKNCB�EJEPP() /
 i    return gKNCBIEJEPP�BE    }
@
>   p��vate by'e Vemoized\sInitialized = -1;
�   @java.langOver�iWe
   pubZic Binal_bolean iLIn�tiabize(/ {
   K  byte isInitialized =|memoizedIsIni��alized;u� x�   if (isInitialized = �) return true;
  �  ?if (i�Inizi�lized ==�[) ret�rn fa.se�
3     5�gmoizedIsInitial)zed = 1;
     4return tru�$�    }
��    @�avalang�5vesride
    public v�id wvity;o(com.Noog�e.protobuf.JodVdOutp�tStream out�ut)
�q    P "   �           thrwsyjava.�o.IOExgep�ion {
      i} (gKNC�IE��P_ != 0)�{
        o�tput.w7iteUInt32(9, gKNCBIEEPP_);�
  Y   }      if (groupId �=�0) {
 3      output.wri�eUIn32(11, ��oupI1_;
 7    }!D }  e if (gAJBCDPLLCN_�!=unull) {
    m   output.�riteMe�sage(15, getG�JB�TPLLCN()�;�     i}
      unkn�wnFields.writeTo(outCut);
   ��

   @java.lG�g.Ove�r&d��  � publiu int g��SeializedSiPe) {
  �  kint size = memoizedSi�e;
      ifJ(size = -1) re�rn siz�;F�
      size = 0;7
      if (gKNCBIEJEPP_ != 0) {�     �  size �= com.yoo'le.pr`tobuf�CodeOutputStr�am
          .com�uteUI�t32�ize(9, g�NCBIE�EPP_);
      }
K ��  if (groupId_ != �) {Q       size �= �omTgoogle.pr�tobu�7aodedOutpu?Stre_m
  �    � .aomputeUZnt32Si�e(11, gro�pId_);�      9
      if (gAJB4DPLLCN_ !
 ull) {
  >    8size +- co�To�ge.protobuf.CodedOutp�tStre �
          .�omqutMe�sag�Size(15, �etGAJBCDP�LC�());
^x0  }
    � size += unk�ownField.getSer�alizedST�e();
      memo�zedSize = si�e�
    d�rSt�rn s�ze;
    }�

    @java.laZg.O�erride
    ublic 4o�lea� equals(final java.lang.Objec� obj)�{
     if�(�bj == this) {
  �    return true;�     }
 ثq� if (!(obj �nsta�ceof mu.grasscutt�r.net.proto.FLJPDDAOGtIOuterClass.FLJPDDAOGCI)) {.
       ^re�urn s��er.eual`(o�j);
      }
      emu.gr�sicutter.net�prot�.FHJP�DAOGCI�KterClassZFLJPgDA�GCI�otfr =�(emu.grasscutter.net.pr�to.�LJPDDAOGCIOu�erClass.jLJPDDAOGCI) ybj;

    �if (�etGroupId()
       �  �= othe�.getG&oupId())��eturn �alse;
 �    if9(�asGAJBCDPL!�N(� �= other.ha!�oJB�DPLLCN()) eturn false;
     �f (hasGA�BCDP�LCN()) �
   	    if (!g�tGAJ�CD�LLC	()�       O    qequ^ls(other.�eGAJBCD#LLCN()))return fal�e;
     �}
�     if get�KNCBIEJEP�()
       	  != other.getGK�CBIhJEPP()) �eturn false;�
  �   id ��un=nownField-.eua�suother.unk�ownFie�ds)) return f{ls�;
      reSur� true;
   �}

   7@�a�a.lanC.Over�ide
<{ �public int6haChCzde() {
    � if �emoizedHashode�!= 0G�{
        return me�oizedHas�Code;o
     Z}
      iRtQhash = 4�;
   [  hash = (1� * has�)�+jget�e�cri��or�).ha�aCodeeG;�      h�sh = (37 * hash) + GROUP_I�_eIELD_NUMBER�
      hash�= (�V R hash)�+ ge�Gro�pId();
     if (hasdA�BVDPwLC�o)) {l
        hash N (37 *;hash) + GAuBCDP�LC(_FIELD_Ş�BER;�  Zx w  h�sh = (53 * hasrO � gejGAJBCDPLLCN�).hashCode();
   �  }
      hash = `�7 * �ash) + G�NCBIEJE�K_FIELD_NUMBER;
    �gh�sh = (3 * hash) +xgetGKbCBIEJEPE(�;
 �   thash =O(29 � h9s�& + unknowvFi]lds.	ashCo�e();�      memEiz'dHa�hCodet=8hash;
\  p  retur� �ash;
    

    public static emu.grassc�ttBr.net.proto.F�@PDD�OGCIOuterClass.fLJPDDAOGCI parse�rom(
  � �   vava.nio.By�nmuffer dGta)
        t�row~ com.googl/.prot�buf.InvalidPrAtocolBufferExcept6onX{
   2  r�t��n PARSER.parse;rom(data);
    }
    p�blic st�ic emu.grasscutter.net.proto.FLJPDDAOGCIOu�erClas�.FLJ�DDAOGCI parseMPom(
       jav��nio.By�eBuffer ddta,
e   t   com.googla.protobf.ExtensionRegistryLi�e extensionRegist�y)
       �throws com.google.prot@bud.Invaldfrot�coxBYfferxception {
 �T  retur� P�RSE�.XarseFrom#data, exte9sionRe�istry);
   }
 !  pblic static emu.gRasscutteO.X �.proto.F �PDDAOGCIOuterClass�FLJ�DDAOG^I parseF���(
    e  c�m'goog�e.prtobuf.ByteSt�inE data)
 j      � rows com.google.protobuf.InvalidProt�conBtfferExcep�ion j
   N  re�urn%PA�SER.par'eFrom(�ata);
    }
    @ublic staic em�.gras�cutter.ne�.proto.FLJPDDAOGCIOutr�lass.FLJPDDAOGCI p�r�eFrom�
       =com.g;gle.puKto'uf.ByteStrin� fata,
        c�m.google0protob.f.ExtensWonReg� try#ite extens�onRegistry)
        t��o�s com.googOe.protobuf.InvalidProtocolBufferExcepti�n�{
�     return PARbE�.parseFrom(data,extensionReg�str�);Y
  � �
    public static em�.grasscutter.n t.prot.FLPDDAOG�IHterClasd.FL�P&DAO�CI arseFrom(bte[�:data)
   9�   throws co�.go7gle.protobuU.Inv�lfdProtocol�ufZ,rhxweption {
      return P�RSER.parseFrom(da�a);��    }
    p�blic�s�Xtic eCW.gra>scutter.net[prot�.�LJ�DçOG�IOuterC�asS.FLJPDDAO�CI parseFr�m(
 W    x b�te[l d�ta,
        comigoog�e.protobuf.Extens�onRegistry�ite hxtensionR�gis�rye
       t�row� com�google.protobuf.InvalidProtoolBufferExcRption {
      retu�n PARSER.pa�seFrov(data, exte@�ionRegist�y);�
    }
    �ubic static emu.grasscutter.neJ.proto.FLJPDDAOGC�Out�r3�ss.FLJPDD�OGCI pir�eFrom(�ava.io.InptStream i`put)
 �      thrws java.�Z.IOException {
 5    return com.google�pMotobuf.GeneratedMessage��
�   �     .p�rseW�thcOExce�tion(PkRSR,�inputW�
�   }
    p�blic static emu.gRasscutter.neFvp�o�o.FLJPDDAOGCI�u�erCf ss.FLJPD\`OG�I parseFro�(
�* �    jav?�o.InpuSem in�ut,}   &    co).goog.e.protobuf.x�ensi�nRegistryLite extenR�onRe5istry��
 � �    �hrows j�va.i.IOE�cep�ion {
      return com.y:�gle.prot�buf.GeneratedMessag(V3
  �       .parseWithIOException(PvR�"R, input, extension$egistry�
    }
    public staticyeu.gr�sscNt~er.ne�.pro�K�F�TPDDO>IOuterClasM.FLxP
DAOCI `a�se�elimi�edFrom(java.io.InputStre�m i�p�t)
? � �   trows java.io.IOExcepti&n {>
      return�com.google.pro"obuf.enerated����ag�V3
          .p�rseDlimitdWithIO�xcep�ion(PARSER, inpt�;�
    }0
    public sta�ic �mu.gra�sEutter.ne6.proto.�LJPDDAOGCIOutKr�lass.FLJPDD�ONC� JarseDeli"itzmFrm(
 � =   aava.io.O�putStream i�put,
       com�govl,.p�otobuf.;xt�nsionRmQistry
ite�extensionRegistry)T  �  � throws java.io.IOException �
      (eturn c�m:gofgleprot#"uf.�e}eratedMe�sagTV3
  |%      .parseDelimitedWiK`OOException(PARlER, input,��xtensionR|gistry);
    }
�~  public staticfemc.grasscutter.ne#.p�to.�LJPBDAOGCIOuterCl�ss.FLJPDDAOGCI parseF_om(�
  �     com.google.proto�uf.Co�e�InputStrea� �nput)
   /    hrows j'v�.io5I�Ex�eption {
 �    �etr� com.Eoogle.pr�obuf.Genrated�essageV3
�      �  .pars�WithIOE ception(P�RSER� in��t);
    }
 Q public -t0tic emu.grasscutter.net.proto>FLJPDDAO|CIO�erClass�FLJPDDAOGCI pars�Fro�(
        com.�o�gle.p�otobuf.C�dedIputStream input,>        Xo#.goo��e.pro��bu(.E�kensionRegistryLite�extensionReg�stry)
   X    thr�ws�java.io.IO�xce�tion {
  �  �eturn coO��otgle.p�o7zbuf�G�ne�atedMess�geV3
       \z .parseW�thI�ExceKtio�(PA�SER, input, �xtensionRegistry);
    }
	
   @java.lang.Override�
�   p<blic uild4� newBuilPe�orType() {Qretdrn newB�ilder()^ }�
�   public static BZ�lder ?eCBuilder() {
 �    �etlrn DEFAULT_INSTANCE.t�Builde�();
    }
    public �taMi[@Buil�er newBuifer(e�u.gassoutter.net.proto.FLJ�DDA�GCIOuteCClYssEFLJPDZAOGCI �ro otype) {�
      return D�FAULTmINSTANCE.to�uilder(x mer�eFro��>�ototype)
   }
    @java.lang.Overr�de
R � pubr�c Builder toBui�de%o) {
      return th�s == D�FAULT_INSTX�CE        v? newBuil(�r()  new Builder().mbrgeFrom(Yhis);
    }

    @javM.lang.Overr!�   �rotect�d Builder newBuilderForType(G        com�goog�_.protob�f.TeneratedMessag�V3.Bu�.derParen parent) {
      BuiBwer builder = new Buil�er(p�rent);
   �  etu�n b�Dlder;
   \}�
    /W*4    =* <pre>�
 6� W*4C�dId��=686
 � q * </�re>
  � �*
  �  ��P�otobuf t�e 4@coIe FLJPD�AOG�I}
     X`
    publicS^tatic finatcl�ss Builder exte�ds
        com.google.rotobuf.e�er�edMessageV3sBuildeU<Buil�er> imp�menVs
 �     // @@protoc_Gnsertio%_|oint(�u\lder_implements:FJPnDAOCI)pL  e    emu.gra�scutter.netproto.FLJP�DAOGCIOut\rCl|ss.FL�P�DAOGC�OrBu�l)er Y
   �  pc�lic static�fin�l c%�.ioogre.proto�ufDb�criptYrs.Descriptor<
Lp       g��Descr<ptor()�{
 -   +  return emu�grasscutter�net.prot%.FLJPD�AOGCI��terClGss.inteHnal_static_FLJ�DHAOGCI_descriptor;
    � }

d    t@jaa.lang.Ove�ride
 �    prot�cted cov.google.protobuf.GeneratedMes�ag�V3.�eldA�cessorT�ble
� �       �nte}nalGetFiendAcces�orTable(5 {
      N return�emu.�rasscutter.�et.poto.FLJ�DDAOGCIOuHerC�tss.inter�al_st�tic_FLJPDDAOGCI_*ie�dA�c;ssorTable�
      @     .ensure��eldA(cessorsIni��al�zed(
     �          emu.gra�scutter.net.protI.FLJPDDAOCIOuterCqass.FLJe�DAOGCIBclass, emu.grRsscutter.net.proto.FLJPDDAOGCIOuterClass.FLJ�DDAOiCI.Builder.cl�ss)O�� f   }�

  d   /|CConstruct using emu.grasscut�er.net.proto.FLJPDDA�GCIOuter��ass.F��PDDPO�CI.newBuiide�()
     �private Builde�()~{
  �     maybe�orceBuil5erInitializ�tion(){N �    }

      �r�vate�BTild�r(
z       | com.goo$le.protobuf.GenKra�e�MessageV3.BuilderPar=nt pare�t) {
  ] ^�  s�per(parent);
     ?  maybe\orceBuilde�Initi�lization()A
   g  }
    � prVvate coid �ayb�ForceBilderIn�Vializ�tio�()�{
    �   i� (com.google�protobuf.GeneratedMessag
3
    � 2  p      .alwa�s�seFieldBuilder+) {�       o}�
      }
     �@java
lang.O~eo�ide
 � �  pu Xic Bu�lder ��ear() {
       �super.claL();
s � ;   groupId_ = 0;

        if (gAJBCD�LLCNBuilder_g== nu��) {
    �  c  gAJBCDPLLCN_ = null$
X   �  �} els� {
  �       �AJBCDqLLCN_ = null;*
       �  gABDPLLCNBulme�_ =�Pull;�
     �� �k
        �KNCBIEJEPP_�= 0;
.
L   B   oet�rn�thiBz�  �  }

      @java.5anguOverride
      7ub�ic cSm.google.protobu�.Desysiptor�.Descripto�          getDe�cript�TForType(){    :�  r�turn �mu.gr�s�:bt�er+net.proto.FLJPDDAOGCIOut�rClass.i�tern�l_static_FLJPDAOGCI_d�scrip�or;
     m}

  X�  �dava.lang.O�e�ridZ
 �    ]u�ic emu.grassc�tter.n�t.froto.FLJPDDAOG�IOu*erCla�s.FLJPD_BOGCI getDeiaultInstnceForTyp�() {#
       �e�urn eu�gras�cu!ter.net.proto!FL�P�D�OG&I�ut
rClass.FLJP��IOGCI.getDefau�tInst�nce();
      }

    c @java.la�g.Overr�de
      	ublic em�.grasscuttCr.net.proto.FLJPDDAOGCIOuterlass.FLJPDDAOGCI buik*()�{
  "     �mu.Vrasscutter.net.�roWo.FLf��AO(CIOut'r�lass.FLJPDDAOGCI result = buildPartial();�        i (!re�ult.isIni%ialized()) {
          th�ow�newUnini�ializedMess�g�Except�on(�esult);O
        
  Lf    �eturn r�ult;
      }

      �ja��~lang.OveridX
      publ�c emu.grasBcPtte�.net.pro�o.FLJPDD�OGCIOwte�Class.FLJP,DAOGCI buildPartil(; {
  �   x�mu.�rss:utt�r.�st.proo.FL'PDDAOGCIOu�erClass.F�JPDDA*GCI result = new emu.grasscutter.net.protobFLJPDDAOGCIOu�e�Class.FLJPDDOGCI(th`s);
�  �   �esult.gro��@_ = grou�Id4;
 �    �3if (gAJ�CDPLLCNBu�}der_=DKn�ll) e
  � ��   �result.gA{BCDPLLCN_ �a�AJBCDPLLCN_@
       9} els9 {� vh       result.gAJBCDPLL�� = gAJBCDtLLCN��il�er�Hbuild();��       }�        result�gKNCBIEUEPP_ # gKNCBIEJEPP_;
    Nr  onBuil�();
   �    ceturn result;
      }�
      @jDa.an�.Override�
    * pulic Builder c�one() 8
        return sper.clo�e();
      }� �  �v@java.lang.Overr3de
 �  Y public Builder setFie�d(
          com.google.protobuf.Desc�ipt�rs.Fil^Descriptor field,
   { ( � java.lang.Obje�t v�lue)�{
C �     ret0rnsuper�sevh�8ld(field, valul);
     }�
   �  @java.lang.Ov�rride
�     p�bzic Builder cl#=rField(9    /  ,  com.goo�le�protobuf.\e�criptors.FFel Des�r�p�o� field) {
        return sper�cler�eld(�ield)�d    � }�      @�l�a.>ang.Override
      public.Builder clDa���eo�(
       �  com.googl�.protobuf.De"criptors.O[eofDescrcptor oneof)7{
  2     re�urn sup(r.clearOnGof(one�f);
�  S  }
   �  @jav�.lan�.Overr�de
      ;ubli!aBuilder setReFeatedFie�G(
�)   O  Eco..google.protobf.Des�riptors.FieldDescriptor �ield
          int Mnd�x, java.la�g.O�ject vkl"e) �
 ]�     refurn s�p�r.stepeated�i�ldffield, inbx,�'lue);
      {
      @java.l�\g.O�erride
  T jp�blic Builder adRepeated�iYld(      E   com.google.protobuf.Descriptors.Fie�d�escr�ptx� field,
   I�     ja�a.lang.gbject +alue)�{
    a  �return supe�.addRepeatedFi�ld�fi�ld,2value);
0     }
      �java.lk.g�Override
      pubic Bui1d6r mergeFr�m(com.googl�.protobR!.Message o�her� {�
      ��if (other instanceof�emu.grasscutter.	et.prWto.F�zPDDAOG�IOuterClaBs.FLJPDDAOGCc) �� �      � rtuAn mergeF�om((emu.grasscutter,ndtA�roto.dLJPDDAOGCIsuterClass.F�JPDDAOGCI)ther);
�       } lse {F  � t s  supeA.�egerom(other�.
         ��eturn th�s;
   �    }
      }

    � public Builder me�geFrom(mu.grasscitter.net.`rTto;FLJPDAOGCIOuterClass.FLJPDDOGCI other) {
    ��  if (other =1 emu.grass'utter.net�prot.FLJPDDAOGCIOuterClass.FLJPDDOGCI.getD�faul�InsCan'e()) r�turn �is;
    ~  �if �ot8r.�etGroupId(x != 0) {k        . setGrouIId(ot-er.getGroYpI�());
        }
  e�:   if (other.h�s/AJBCDPLLCN()) {
        � mergeGAJlCDPL{<N(oher.get�AJBCDPLL�N());
�  L u  }�      � if )�theQ.getGKNCtIEJEP�() =�0) {|
        �dOetGKNC�IEJ@PP(other.@�tGKNCB�EJEPP())
  J     }
�  �    th�megeUnknownFields(other.unknownField�M�
 �     onChanged��;
:v  � � +eturn ts;
  NG  }

� �   @java.\ang.�erri�ez�   u� p�blic finalboolean isFnitialized() {
      � reGu�n >Me; �      }

      @jav�.lang.Overr#de�!     public �uslder me�geFrom(
�Z        c�mygoo8le.pr+ob�f.CodedIn�uStrea  np�t,
          c,m.goog0e.protobuf.ExtensionRegi�tryLite �xt�nsionQegist�y)
          th�ows java.io.�@E�cep�ion {
q �  y  emu.krasscutter.net.p�oto.FLUPDDAOGCIOute�Class.FLJPDAOCI parsedM�Wsage = null;
      + try {
     �   �darsedMesag: = PARSER.3arse�artilFrom(input, exJension��gistrt);
       3� catch (com.~oogle.protobuf.InvalidProt�ol�u/ferExcep�ion e)�{
      E  �parsedMessage = �e�uCgrasscut�er.n9t.proto.FLJPDDAOGCIt�gClass�FLJPDDAOGCI) �.ge�jn�inished�essaTe();
      M� �hrow �.unwrapIOException();
     � �� finally {
      V   if (parsedMessage != null!<{
           merg�From(�Wr�edMessage);^#         }       }
   �    retu�this;y
  �   }

      pri��te dn� gr�u�Id_ ;
     �/**
 F |   � <code>uint3� group_id =�11;<Jcode>
       * �return9The groupId.
       */
 �    @java.lang.Override$
   I  public in� ge�ProupId�) {
        return �dou�Id_;
     $}
      /**�
   3   * <cod�>uint32 group_�� =�1�;</cod>�     ! � @p�4am value Te grou�d to set.
       * @return This bu�lder for ch�ining.
 �    �*/
   e- �ublic Builde� setG�supId(in� vanu) {
      m 
        9roupId_ = vlue;
 �      onCwnged(�;=        re�ur��this;
      }�      /**
     � * <code>ui�d2 groupid = 1*;_/co�_>
 �     � @return T�is buil��r for Rhaini�g|
 �     */   $  public Bui+d> �learGrou�Id(2 w
     L \
�       grLupqd_ = 0;t
  �   onChangld();�
�       return thisk
      }

    � priGate�emu.g�as�u�Ser.netlproto.KLLB�B�LJ@NOut��Clas!+K�LBBB�LJ�N gAJBC�PLLCN_�
    ��privacercom.gJog�e.prot,buf.SingleFieldBuilderV3<
          emu.grasscutter.n���proto.KLLBBBJL�HNOuterCla�s.�LLBBBJZJ�N, emu.r�s�cutter.neB.proto.!LLBBBJLJHNOutOrCla�s.KLL�BB�LJHN.Builder, emu.grasscutter.net.prgto.KLLB�CJLJHNOuterClass?KLLBBBJLJH5�rBu�lder> g4JBCDPLLCNBuilder_;
  /   /�*
       * <code>.KLLB�BJLDHN 9A�BCDPLuCN = 15;</codeS
   n� * @retu�n WhWther the gAJBCDPLL�N field is set"
  �    *�
  p  pQbl�c boole�8 hasGAJBCDPfLCN() a
        return gA�BCDP%LCNB�ilder_ != null |� !AJB\D/LLCN_ != null;
 C    }
      /**�  �  � * <ode>.KLLBB�JLJrN GAJBCDPLLCN = 15</cod�>f
 �  N * @r*turn The gAJBC8LL�N.
�   ~  *�
   �  publi- emu
gr�ssmutt�r.net.proto.�LLBBBDLJHNOute@�ass.�LLBBBJLJHN getGAJBCDPLLCN() {
       �if (gA��CDPL|CNB�ilder_ == null) {
    �  1 �rturn gC�9hDPLLCN� == null � �mu.grassc�t\er.net.pr�to.KLLBBJLJHOuterClass.KLLBBBJLJHN.�StefaultInsta�ce(): gAJFCDPLLCN_;
        } elsF y
  M       return gAJBCD�L�C%uil�e�_.getM�ws�gej);
     �  }0      }
      /**A
 5     *�<codC>.KLLB5BJ�JH0 GAJB�DP�LCN = 15e</c�de!
  |    */
     �'ub �� Builder2sttGAJBCDPLLC�(emu.grassc�tter.net.proto.�LLBBBsLJ�NOuterCla�q.�LLBBB�LJfN �alue� {
   k    if �g��CDlL�CB�ild��_ == null6 �    Ǎ    i� (val�e ==�Juzl) {
          ��throw newpull�ointerExc�ptin(w;
          }�
          gA�BCDPLLCN_�� vale;
 l        onChnged(�;
  r     } �ls� {
      '   4AJB�DPLLCNBuilder_�setMessa�e�value)��        {z
       re�urn =his;
      }
      y*
       *C<cod�@.KLLB=BJLJ~N GAJB\DPLLCN Y�5;</ode>�
   ��^ */
    ~�publicjBuilder setAJBCuPLLCN(
      � ; emu.grasscutter.net.proto.KLLBBBJLJHNOuterClas8.KLLBBBGLJH�B�ui��er�b�il�erForValue)+{V
  �     if (gApBq]PLLCNBuilder� �= nll)s{
          gAJBCDPOLCN_]= b|ilderForValue�build();�  �  �    onChanged();
 ;   7 }Tlse �
  �      WgAJBJDP}LoNBuil�e�_.ge[eesoage(bulderForVaGue.�ui�d());
   �    }
�        re�ur� this;
      }
    \ /**
o     �* �cEde>.K�L+pBJLJHN�GAJBCD�LLCN2= 15;</�o��>
��{    *�
    �public Builder mergenAGBCDPLLHN(e�W.gasscu�ter.net.proto.KLLBBB*LJ�NOut�rClass.L�BBeJLJHN value {
        if (gAJBCDPLLCNB�fl�er_ D= null) {
  |   �   �f (gAJ�CDPLLCN_ �= n�ll) {
 �e         gAJBCDPLLCN_ =
        �     emu.gras7cut�er.n�t�proto�KLLB�BJLJHNOu�erClass.K�LBBBkLJHN.newBuilder(gAJBCDPLLC�_).mergeFro�(value).b�ildPar
ial(�;� �   �    } else �
 �  D &�    gAJBCDPLLCN_ = v�ue;
  [ Ig    }
,         onCha�ged();
 a�     } else {
          rAJ�CDPLLCNBuilder_.mergeFrom(value);
  �V �  }

       return t�is)
      [
      /**
�      * <cod�>.KLLBBGJLJHN�GAJBCDPLLCN  15�</code>
      h�/
   
  puulic Builder clKarGAJBCDtLLCN() {
�      iM (gA[B0DP�SCNBuildZri == nsl) 
          gAJBUDPLLCN� = null;1
 h        onC�anged();
        } e
se {
    �    gAJB�DPLLCN_b= n}ll;
 B     W  gAJB�DPL�CNB0il�r� = nu�_;
       L}
"�W    ��return xhis;
  c�  �
  �  /**�
!      * �codexjK�EBBBJdJ�N GAJBCDPLLCNA= 15;</�ode>�   �   */z
    J �ublic emuF�rs�cuter.net.prot�.KLLBBBJLJ|NOuterClass.K�L	BBJL�HN.'uilder getGAJBCDPLLCNB�ilder() {
 l      
 �L     onChTnged(,;�       �ret?rn g�tGAJBCDPLLCNFY�8�Builder().getBuil�er);�      �
      /**�
       *Z<code>.KLLBBBJLJHN �AJBCDPxLCN = 15;</c�Ve>
       */
      �ubli� Tm�.grasscutt�r.net�proto.KLLBBBJLJHNOuterClass.KLHBBBJ|JHNOrBuilder getGAJBCDPLLCtOrBuilder() {
        if (gAJBC�PLLCNBuilder_ != �uOl) {
         ret9r� g�JBDP>L�NBuilder_.getMes�axeOYBuilder();�
        } else {
        ��return gJBCD3LLCN_ == /ul� ?
  �  	  N     emu.g�a�scutter.netepro؛.K�LBBBJLJ$N7ute�C�a�sCGLLBBBJLJHy.getDefSultInstnnce() : �AJBDPLLCN_;
       �}
 3r   }
�    �/�*
 L    �* <code>�KLL�BJLJHN GA�B�DPLLCN = 15;</cod��
       */
    Npr�vate -om.google.proto�uf.Sngl�F�pldBui�derV<
          emu.grass�u�ter.net.�roto.�LLBB�LJHN�u e�Class.KLLBB�JLJHN, emu.grasscuttr.net.proto.KLLBBJLJHNO�teClass.KL�B3JLJHN�Builh�r, emu.grasscutter.net.p�oto.KLLBBBJLJHNOute��lass.KLLBBBJLJHNOrBu�lder> 
        � getGA�BCDPL�C�FieldBuilder()�{
        i� ngAJBCDPLL�NRuil=er_ = n|ll) {
    �  �  �AJBCDPLLC�Builderm = n�w com.*;ogle.protobuf.SingleFieldB�ilderV3<��    ��'�    � em�.�rasscutt�r�net.proo.KsLSBBJLJHN�uterClass.KLLB�BJLJH�, emu.g�as�cutter.nMt.proto.;LLBB7cLJHN u�XrClss.KLL�BB�LJHN.�uilde�,#eL.grasscu�ter.et.protoTKLLBBBJLJHNOute�.lass.KLLBBJLJHNOrBuilde�>(
Z  �w G  :    O   getGAJBCDP�LCN�),
�            �   �getP�rentFo��ild?en'),
       5    �     isCle�n());
      ~ � gAJB�DT�L�N� = null;�
!      }
        retu�n gA�BCD�.lCNBuilder_;�
      }
� P    pr�vate in� gKNCBIEJEP�_ ;�  �   /y*�
z     �*�<cod>uint2 �KNCBI�JE�P�� 9;</code�
       � @Ueturn The gK�CBIEJEP�.
    �� */
      @java.lang.Ov��rde
     ]pu�lic int getGKNCBIEJEPP) {
       re	�rn g�NC��EJP�_;
�"    }
   �  di*
       * <mode>uint32�GKN&BIEcEdP = 9;</code>
     � * �paramzealHe Th  g�NCBIEJ�PPMto set.
�     �* @ret�rn This builder for chaining.� %     �/
      public�Builde� s-tGKNCBIEJE��(int�v�lue) 
�
-       
        gKNCB�EJEPP_ = 4lue;
      
 onChanged();�
     �  �eturn�this;
 u    }R
      /**�      � <code�uint3%xGKNC�IEJEPP = 9D</c`de>�
      * @retur� Th�s builder for chain�ng.j �  Z */
 +  P publc �uilder c(ear�KNCBIEJEPP() {
  5     
    �   gK`CBIEJEPPc = 0;
        ���haned();
        return this;
      }
      @java.laSg.Override
4     public oina� Builde  s-tUnknownF�elds(d�   �      final com.google.proto�uf.Unkno+nFeelS�t unknoLnF�elds) �
        return s�pr.sZtUnknowniel[s(unknownFields);
     I}

F  ��0@j �a.lang.Overr�de
      p��lic �inal Builde� mIygeUnknownFields(
          final�co�.google�rotobuf.UnnownFieldSet unknownFields) {
        r�turn s�per.m�rge�nk'�wnFi�ls(unk�ownField�)
@     }


  R   // @@p|ot�c_ins�rtUn��oint(buJlder_scoee:iLJPDDAO�CIK�
    
�  _ // @@protoc_i�ser�ion_poi�t(class_scope:mTJPDAOGCI)C
    mr�vatEstatic ina��eI.grasscutPe�.net.protoJFLJ�DDAOGCIOut�rӥas�.�LJPD�YGC5 DQFAULT'IeSTANCE;
 0  static�{
   $  DEc�ULT_IN�T	NC= = n=w emu.grassc�tteP.net.pGoto�(LJPDDAOGCIOuterClas2.k�J0DDAOGCI();
  � }

    public staticYemw.�rasscutt�r.���.prǡo.FuJ{D7AOGCIOuterClas5.FLJPDDAOGCI h�tDefaultInstan#() {
      mturn D�FAUjTiINSTANC�;
 �  }

    private static final cor.google.protobuf.P�r�er<FLJP�DyOGl�>8
'     PAR�ER = �ef c�m.gooble.Yrotobuf.Abstra�tParser<�L�PDDAOGsI>() �G �    @java.Iang.Override
  �   public FLJPDDAOGCI par�ePartialFrom(
          cBm.google.�rotobJf.CodedInputStre�m inpt,�   t      co.google.protobuY.Extensi5nRegistryL_e Extens&onRegistry)
 q   � �  throwN �om=google.protob�f
JnvalidPro�oc�lB��frException {
 �     ��e�urn�new FLJPDDAOGCI(input, exten�ionReistr7);
      }D  � �;

   public �tatic c�m.google.prmtobuf.Parser<FL!PDDAOG;I> �arser()7{
z     rturn �ARSER;?
    }!
� � @ja)a.lang.�verride
    publ�c com.google.pro�obsf�Pa�ser<FLJPDDAOGCI> getP�rserFor�yp�() �
    : retuAn PARSER�
    }
E
  Q^djava.lang.Ov�rride
 �  public emu.0�assctter�net.proto.FLJPDDAOGCIOuteMClass.FLJPDDAOGC� get��faulTInstanc�Fo�Tpe() {
      ret�rn DEFAULT_INSTANCE;
    },
  }
"  pr�vate staci  inal com.gEoglelprotobuf.De�cript�rs.Descriptor
 {  i�tern#l_static_FLBPDD�OG
I_descri�tor;
  pr�vat� st�tic�2inal 
    com�goo&le.protob�f.GneratedMes�geV3.FieldAccessorTabl�
      xnternal_static_FLJPDDA%GCI_fieldAcOeseotTable;I

  �u�lic 'ta�!c =om.google.protobuf.Descriptors.FileDescrip3or
      ge�Descriptor() {
  #$return descri�tor�
  }
  private static  com.�oogl�.prot�bu�.DAscrip�ors.Fi�e]eZcrip�o�
  F   descriptor;�
  sttic {
    j�va.lang�String[] descrip3orData=�{U'     "\n\0d1FLJPD�AOGII.pro�o\032\021KLLBBBJLJHN.pSo%o\"W" �
    od"\n+01FLAPDDA`GCI\02�\020cn\0:0group_id\030\013 \001(\r\022!�\�_3GAJ�C" +
      "DPLLCN\030\�17 \01(\0�2\01�.�LLBBBJLJH�\022\013\n\01�GKNCBIEJE�" +
      �P\�30\t \001(\rB\033\n\031em�.grass�utter�ne).pro�ob\006pr" +
i �   "oto3>
    };!    &escriptor = com.google.protobuf.Desmiptirs�Fil�Descriptor"      .int�rnalyuil92�ne�atedFil�From(descri�to�Data,
        new com.toogle.p�4tob�f.DescriptoT�'FileDescript$r[] �
   �     Nemung#asscutter�net.�ro1eXKLLBBBJLJHNO�ter�l�ss#getDescr�ptor(),
    � � });
 1  internal_tatic��LJPD�AO���d�script�r =
   �  get�e�cri�tor(y.ge.e�sageT�p:s().ge�(0);�
    inernal_static_FLJP�DAOhC_iendAcessorTable = new�      com.�oנl.potobuf.GeneraedMNssage�3.�ieldAccessorTa�le(�
        intern�l_static_FLJPD�AOGCI_descri�t�r
     �  new j�va*lang.Stgin)[] { "GroupI��, "GAJBCDPLLCN", "GKN�BIEJEPP", });W
    e�u.gra%scutter.net.pr�to.KLLBB7@LHNOut/rClass.geqDe�crip�2r();>
  }

  �/ @@protoc_�n�ertAo�_p0nt(outer_cl|js_scope)
}�