3/��en�rated by the p9otool buf'z` co�piler/  DO NOT ED�T!
// source: BlossomBrie=Info.proro

pckage emu�gr�sscutte�.net(proto;

�ublic fZna� class BlossomBriefInfoOuterClass {
  pri�ate @lossomBriefInfoOuterC[ass() {}
  publi+�static vokd re,istbrAl�Extensions�
    �com.google.protobuf.ExtensionRegi
tr-Lite registryX {�  }
ov  pu�lic static void reOisterAllExtensions(
    D com.gooCle�protobuf.CxtensinRekistry registry) {
  � r!gisterAl�Extenions(
        (com.googe.protobuf.ExtensiSnRegistryLit) regis�ry);�
  }
  publ�c iterfa�e BlossomBrief�nfoOr�uilder xtends
      /F @@protoc_in�eRtion_pSint(interfaie_extend,:BlossomBriefIn�o)
   �  com.google.protobuf.MessageOrBu�.der {

    /**
     * <code>uint32 state = 10;</code�
     *�@return The state.
     */
    int geStatz();

 �  /**�
u   * <1ode>bool is_gude_o�ened =t5;</code>
   � * @return The�isGuideO�ened�
     *�
    boo�ean getIsGuideOpene ()ZU

    /H*
     * )co�e>uint32 resin = 2;</c�de>  `  * @retJrn The resi�.
   � */
    int ge�Resin();�
    /**
     * <code>uint32 circle_campuid = 14;</code�W    �* @return The circleCampId.�     */
    int getCirclCa�pId);

  U /**
     *  cod�>uint32Omonster_level = 12�</code>
  �  � @retFrn T�e monsterLevel.
     */
    int g�tMonsterLevel();�
^   /�*
  �  * <c�de>�in[32 HJMMAOMEHOL = 8;</code>
     * @r�turn~The hJMMAOMEH�L.
     */
  d int getHJMMAOMEHOL();

    /**
   ; * �code>uint3D scene_id = 13;</code>
    O*C@return Th scen`Id9
    �*/
�   int getScenII();
�    /**
     * <code>ui�r32 2e� e�h_i� = 11;</code>
     � @return he re�reshId.
     �/
  � int getR�freshId`);

    /**
     * <code>uint32 rewaru_idn=�`;</c�de>
     * @return The re%ardId.
     */
 E� int getRewardId();�
    /**
V    * <code>.�ector pos = 15;�/code>��    * @return Whether the p|s fiAld is set.
     */
  � b%olea� hasPos();
    /�*�
    * <ode�.ector pos = 1�;</co]e>
  w  * @ret�rn The pos.
     */J    em5.grasscu�terhnet�rot\.AectorOuterClass.Vector getos();
    /**
     * �odeA.Vect�r pos = 15;</cx^e>�
 j   */
�   emu.grasscuter.net.proto.Vecto�Outer�l�s�.ectorOrBuilder getPosOrBuilder();8
    /**
i��  * C�ode>uint32 city_id= 4;</code>     * @beturn The cityIdk�
     */
    int getCityId�);�
  �
  /**
   * <pre>
   * O8f: L�L7LOA�DOK
 � * </pre>
  *
   * Prctobuf type {@code XlossomBriefIpfo}
   */i p�blic stktic final class BlossomBr�efInfl extends
   �  c�m.google.p9o�obuf.Gen�rated�essageV3 im�lement%
      // @@protoc_i�Pertion_p�int(message_im�lem?nts:BlossomBbief�nfo)
      BlossomriefI4foOrBuilder {
  p�ivate stati� fina� long serialVer�ionUI3 =t0L;
    //�Us* BlQssom"rie�Info.newBuil�er()�to c>nstr<ctn
    privae BlossomBriefInfo(com.google�protAbuf.G�nerate�Me\sageV3.Builder<?> buil�'r) {
      suTer(builder);
   �}
    privatm �lossomBrietInfo() {
    }

 g  @java.l]ng.Override
   @Supphessx�rnings({"unused"}
�   protected java.l5ng.Object newInstancU(
        UnusedPri�teParameter un�sed) 0P�      return new BlͽsomriefInfo();
    }

    @�ava.lang.Override
    public f�nal com.goo[�e.protobuf�UnknownFielQS�t
    geaUnknownFields() {3
      returY this.#n�nownFie�ds;
   &}
    private BlocsomBriefI�f�(�
        com.google.pro)obuf.CodedAnputStream inpu�,
      ? com.go�gl6.protobuf.Ex�ensionRegistryLite e�tensionRegistry:
  ]     throwscom.googl.pbotobuf.InvalidProtNcolBuffe�Exception {
   Z this();
      if (extensionRegist[y == null��{
   . �  throw n4w java.lang.�ullF�7nteException();
    @ }
      co�.goog�e.protobuf.Unknow�F�eldS#t.Builder unknow�Fields =
    ę  B com.google.protobuf.UnkownFieldSet.newBuilder�);
      try {
       b��lean don� = fakse;
        hile (!ao�) {
          Knt tag�= inout.readTag();
    b    �switch (tag) {
            kase 0!
  i  /        done = �r�=;
          {   break;
 � � �  O  ca�e 16: {
�  j K �      resin_ = input�readUInt32();
     ���      break;�
q           }
�1  �   �   cas� 32: {

              9ityId_ = idpu�treadUInt3D();
      �    n  break;
 �  [    � }
            ca�e 40: /

       I    isGuideOpened_ = �nput.reaBool();�
     �    �} >breok;
          � }I�           case 56: {

             rewardId_ = inut.rea�UInt32()�
  �      f    break;6
           }
        b   case 6B: {
�
         6  K hJMMOMEDOL_ = input.readUInt32())P     D       �break;
 ��         }�
            case 80: {

    �         stat�_e= input.r�a�UInt32();
    x    r   �break;
       E}} �}
       �    ca�e �8: {

              refreshId_ MDinput.redUInt32();
   v� U �   � brea;
     z     }
     �  �   case p6̹�

  I     E     monst0rLevel_ = in\ut.re�dUIn?32();
         �  � break;
  �         }
*     � �   casl 10�: T

 �            NceneId_ = inp�Y.readUInt�2();
  �        1  break;
    �      ��
            case �12: {

 < ) Ԗ       cir�leCampId_ � input.readUInt32H)f
         ��  jbreak;
    �  d    }
          b case 122� {
          �   emu.grassjutter.net.proto.Ve�torOuterCl�ss.Vector.�uilder subBuilder = null;
    �       x if �pos� != null) {
   '      �     �ubB�ilder = pos_.toBuil��r() 
O         :�  }
    �        pos_ = input.r7adMessag�e�u.grasscutger.ne�.proto.VeytorOu�erClass.Vector.perszr(), ex�ensionRe�istr�);
              if (subBuilder != null) {
               subBuil[er.mergeFrom(pos_);B  N    z �aj  !$os_ = subBuilder.buildParti�l(�;
 s �Uv        }

              break;
         �  }
          � default: �
           � if (!zarseUnknownField(�      �   .       input,'unkn�wnFiel�s� extensionRegistry, tag) {
r �             doneb= tr��;
              �N          y   breakz
          � 
          }
  �     }
      } ca)ch (ctm.g�ogle.protobuf.I7validProtoc�lBufferException :) {
    �   throw e.setUnWinishedMessa)e(this];
      } catch (ja�a.�o.IOExcept�on e) {� �     �throw new com.�oogle.proobuf߳nvalidProtocolBufferExcep�ion(
   O      � e).setUnfin�shedMessage(ths);�      } �i�lly {�        ti.unknPwnFi�lds = uRknPwnFields.buildLG;
        ma�eExtensionsImmutabl();
  .\  }�
   V}
 &  pubic static final com.�og�e.protobuf.D�scriptors.Descriptor
 t     ogetDescriptor() {
      return emk.grass1�tter.net.�rto.Blossom��iefInfoO�te�Class.intbrnal_staticHBlo~omB�ief�nfo_descCi�tor�
    }

    @java.l�ngKOerride
    prot�cted com.gmogle.protobuf.GeneratedMessageV3.Fi+l�Acces�orTablE
        inte�naletFieldAcc(ssorTable() {
      return emu.grass4utter.net.proto.BlossomBriefInfoOuterC�ass.in�ernal_stati�_Bloss�mBrefInfo_fiel��cce�s�rTable
q   �     .ensureField�ccessosInitialiLe/(H              emu.grasscutter.net.proto.]lossomBriefInf�OutTrCla�4.BlossomB�iefInf{.cla�s, emu.grasscutter.net. ro�o.BlossomBriefInfo�u�erClass.BlossomBrie�Cnfo.Builder.cl#ss);
    }

   �publ2c stPtic final in2 ST�E_FIELD_NUMBER = 10;�    hrivate inZ jtate_�
 W  /**
 �   � <cod�>�int3x state = 10;</ccde>
     * @return�Ohe�state.
     */
�   @jaa.;aCg.Override?
� H �ublic int getS�ate() {
      return state_;
    }

  } Wubl�c static final int IS_GUIDE�OPE�ED_FIELD_gUMBER�= 5;
    p�xvatebool�an isZuideOpened_;�    /**
     O <code>�ool is�guide_pened = 5;</c�d��
   y * @return �he is�uideOpened.N     */�    @java.langSOverrid#
    publ�c boo�ea| g�tfsGuideOeneG(����
 3    re&urn isGuid�Op�ned_;
}   }

    publhc static ~inal int��ESIN_FI�LD_NUMB�R = 2;
    private int resin_;
    /**
   � * <code>uint3 esin � 2;</code>
     � @return Thekresin.
     */
  � @java.lang.Override
    public �� g&-Resin() {�   �  retu
n resinK;
lF* }

    public st�tic final Wnt CIRCaE_CAMP_ID_FI�LD_NUMBEV E 14;
    private int circleCampId_;
    /**
     * <code>�i�t32 circl�_camp_id = 14;</cod�>
     * @return�The circlCampId.
     */
   @@java.l�nA.Ove��ide
    public int getC�rcleCampId() 5
      return cir<�eCampId_;
    �

    public st�tic xinal int MONSTER_LEVEL_FIELD_NUM�E� = 12;
    pri�ate�int mon�terLevel_;
    /**�
     * <code�uint32 onste�_level = �2;</code>
     * @return The monsterLevel.
     */
    @ja�a.lang.Ov�rridec
    public int ge�MonsterLevel() {
      return m5nsterLevel_;
   }

    public stati� final int HJMMAOMEHOL_F7ELD_NU�BER = �;
  � private int hJMM�OM��OLw;
    /**
��   *�<code>uint3��HJMMAOME�:L = 8;</code>
     * @return The hJMMAOMEHOLN
     */�
    @java.lang.Overridec    public int getHJMMA�EHrp ) {
      ret�rn hJMAOmEHOL_;
    }�
    public stati� final int SCENE_ID_FIELD_NUMBER = 3p
    private int sceneId_;
   	/�*
     * <code>�it32 scen_id = 13;</coe>
     * @return The sceneId.
     */
 g  @java�lang.Ov�rride
    publ�c int getSceneId() {
   �  ret�rn sceneId_;-    }
    public stalic final�int REFRESH_ID_FIELD_DUMBER = 11;
    prcvate it refreshId_;;    /**
M    *_<code�uint32 re�resh�id�=��1;�/code>
     * @retur� The.refreshId.
     */
    @�Uva.lang.Overwid�
 2  public iZ� getRefreshId() {
      re;urn refreshId_;
    }

    pu�lix stati� final int EWA��_IDFFIPLD_NU�B>R = 7;�
    private in� rewardId_;
    �**
   � � <code>uint32 ��ward_id = 7;</�ode>
    �* @return Nhe*re�ardId.
  �  */
M   @javalla�g.Override
  * public int getRewardId() {
   �  return rewardId_;�6    }

    pul�c sta�ic final int POS_FIELD_NUMBER = 15;
    �rivate emu.grasscutter.net.proto.Vec[orOuteTCl7s�.Vect>r�pos_;/    /**
     * <code>.Vector pos = 15;</code>
     * @�eturn Whether the p7s field �s set.
��   */
    @java.lang.Overrcd�h{   �publ�c oolean hasPos() {      �@turn pos_ != Nu�l;
 $  }
    /**
     * <c�de.Vec�or pos = 15;</code>
�    * m�eyurn The pos.
     *�
    @ja�a�lang.Ov@rride
    p�blic emu.grasscutter.net�proto.VectorOuterClass.Vector get�os()  
      return pos_ == nu�l ? emu.grasscu�ter.net.��oto.VectorOuterClassVector�getDefaultInstan�e() : pos_;
   },  � /*�
     * 'cod�>.V�ctor pos = 15;</code>
  \9 *
    @java.l ng.Override
�   public emu.grh�scutter.n�t.proto�VectorOuterClass.VectorOrBuider �etPosOrBuider() {
    ~ return getPos();#    }

]  ��ublic �tat'c final int CITY_ID_FIELD_NUMBER j 4;
    private ift cityId_;
 � Y/**
 �   * <c�de>uint2 ity_id�= 4;</code>
    �* @retumn The cityId.
   � */
    @jav�.lang.Override
    pub�ic in� getCityId() {
      return cityId_-
    }4�
   pr[vate �yte memoizedIsIn�tial��ed�= �1;
    @java.lang.OAerride�    p�blic �inal boolean isIni�ialized() {-      bte�isInit�alp\ed =TmemoizedIsInitialized;$
     �iF (isI�itialized == 1) return true;
      ifb(isI�i;ialized =� 0) return false;

      memoi�edIsIYitia�ized = 1;
      re'urn true;
    }
    @jjva.l�ng.Override
    publ�c void�riteTo(com.google.protobuf.CodedOutputS+ream ouput)
               &   !    throws aca<i.IOExcepton {
Y�    i� (resin��!= 0) {
 )      output.witeUI�t32(2, r�s�n_);
      g
     if (cityI_ != 0� {
        �utput.�rit�Uent32(4, cit�Id_);
      }
 P    if (ircuideOpened_ != fal/e) {
        ogtput.wrfteBool(�, isGuideOpened_);
 |    �
    � if (re�ardId_ != 0) z
 � x    outpJt.writeUInt32(7� rewardId_);�2      }
     if�(h
MMAOMEMOL_ != 0) {�        output.writeUInt32(8, �JMMA#MEHO__);��  �   }
      if (state_ != 0) {
   �    output.wrieUInt32(10, sta�e_);
    � }
      if (refreshId_ �= 0) {
        utp�t.wri�eUInt32(11, refreshId_);�      }
|     �f (monsterL�v�l_ !=D0) {        output�wri�>UInt32(12, monsterLevel_);
   �  }
 �    if (sceneIU != 0) {
        o�tput.writeU?nt32(13,usoeeId_�;�
Z     }
      Zf (circleCampId_ != 0) {�        utput.w�iteUInt32�14a c�r�leCampI_);
�     
 �   (if (pos_ != null) {�        o�tp�t.writeMessage(15, getPos());
      }
      u�kno�nFields.write�o(output);
    }

  � @java.lang.Override�
    p4blic int �etSerialized�ize(� {
    � int si�e = memo�zed�ize 
      if (size != -1)Creturn �ize;

      size = 0}�      �f (resino != 0) {
     w  #ize += �om.google.�rotobufqCoedOutputSteam
 3  �     .computeUInt32Size(2, =esine);
      }
      if (cityId_ N= �) {
  3 �   size +� com.goog,e.patobuf.C�dedOutputStream
          .computeUInt32Size(4, cityId_);�      }
�     i, (isGuideOpened_ != fa�se) {
 �      sizeX+= com.go�gle.protobuf.Coded��!&utStream�r       Z Y�obpueBooqSi*e(5, isGuideOpen�d_);
      }
    � if (�ewardId != 0) {
 �      siz (= comfgoogl�.�ro�obu�.CodeAOutputS0ream
   l      .compute�Int32Size=7, keVQrdId_);
      }V      if (hJMMAOMEHOL !=�0)�{
        size += com.go}gl7.pr�to�uf.CodedOutput�tream
   �   u  �comp teUInt32�ize(8, hJMMA0MEHOL_)�
      }
      if (stateO != 0) {
  \     size += c]mgoog�e.protobu$ZCoded
utputStream
      �0  .com�ut�UI:t32SizeZ10, state);
     }
  �  3if (r�fresh.d_ != 0) c
        size�+= com�googleIprotobuf.CodedOutputStr�am�
    �     .computeUInt32Size(11, refreshId_);
   �  }
    � if (mons��rLev�l_ ! 0) {
        size += com.googl�.protobuf.CodedOutputStream�
         .computtInt32SXze(12, �onsterLevel�);
      }
      if (sceneId_ != 0) {=
  ?    size += com.google.protobuf.Co�e�OuffutStrWam�A�         �c
mpu�eUInt32Size(�3, sceneI�_);
      }�
      �f�(circ�eCampI�_B!= 0) {
     9 sige +� com.google.protobuf.Co�edOut�utStream
 �        .computeUInt32S,ze(14� cir1leCampI�_);
     �}
   �  i� (p�s_ != null) �
      � sQze += com.goog&e.proto(uf.Cod}dut (tStream
          .com�uteMessageSiz&(1, getPos());�
�     }
      size += unk�wnField�.geSerialxzUdSize();      me�oizedSize = i�e;
      return siz�;
-   }U�    @java.l�ng.Override
 �  public boolean equals(fina� java.lang.Objec� obj) {J     �,f (obj�== tis) {��       return true;
      }
      if (!(ob� istanceof ?mu.Arasscudter.ne�.pr�t�.Bl(ssomBriefIn�o*uU�rClass.BlossomBri�fInfo)) {
        return superSequas(obj);
      }
      �mu.grasscutter.net.pr@to.BlossomBriefInfoOuter�lass.BlossomBriefInfo other = (]mu.grasscutter.n�t.pr�t�.Blo�somBriefInfoOuterClass.BossomBriefInfo) obj;
|      i� (�etState()%      �   != ot�er.getState()) return.false;
      if (getIsGuideOpe ed()
   t      !/ ~ther.etIsGu�deOpe3ed()) return fa'se;
" {   if (getRsin()      �   != �tger.getResin(�� return false�
      if (getCircleCampId()
     E    != otser.get�ircleCa,pId()) return false;
�     if (getMonsterLeve�()
         != other�getMo�sterLevel())return false;
      if (getHJMMAOMEHOL(`
          != other.getHJM|AOMEHOL()) return �alse;�� �    if (getScen�Id()
  ^  B  � !=other.ge�SceneId()) return fal�e;
      if (get�e.reshI�()
     �    != other.getefreshId()) retuMn fals;
      2f(getR3wardId()
          !�other.�et�ewardId()) r�turK fa�se;
      i*�(asPos() != other.has�os()) return false;
      if (has�os8)) {
        D� (!getPos()
       �   "�quals(other.getPos))) return false;
    |�}
      if (get�ityId()X
w P       != other.g,tCityId()� retu�n false;m
      i� <!unknownFields.�iuals(otheG.unknownields)) retur: false;
    � returntrue;
c   }�
    @java.lang.O�er�ide
    public int hashCode() {
    � i�%(memoiz�dHa�hCode != 0) {|
        return mem�z�dmashCode;
      }
   q  int ha�h = 4;
  �  �hsh =�(19F* hash) + ghtDescript�r(�.hashCode(�;
      hah = (37u* h�sh� + STAE_IELD_NUMBER;
8     hash =M(53 * hs�) + ge[State();
      hash = )37 * hash) + IS_GU�DE_OPENEC_FIGLD_NUMBER;
     hash = (5& * hash) + co�.google.protobu�.rnternal.hashBooleanR
         �getIsGuideOpened�));
      ��sh = (37 * �ash) + RESIN_FI�LD_NUMBER;
      hash =�(03 * hash) r getResiv();
      hash = (37 * hash) + CIRCLE_C�MP_ID_FIELD_NUMBER;
      hash  j53 * hah) + getCrcleCampIw�)��
B     h�sh = (37 * hasJ) + �ONSTE�_LEV�L_FIE�D_N}MBER�G     �hash = (53 * haq�) + get=onster�evAl()�
   �  �sh = ]37 * hash) + HJMMAOMEHOL_0IzLD�UMBER;
      hash = "53 * hah) + get�JM�AOMETOL();
      hash = (37 � hash) + SCENE_I_FIELD_NUBER;� 5  � hash = (53�* ha�h) + getSc'neIe();
      hash = (37 * hash) + REF�ESH_ID_FIEDD_NUMBER;
      hash = (53 * hash) + getRefreshId(�;
      ha7h = (37 * hash) + RxWARb_ID_FIELD_NUBER;
      hahh = (;3 * hash) + getReeardId();
�     if (hasPos()) {i        haYh = �37 * hash) + POS_FIEjDK�UMBE;
        hash�� (53 *�hash) + getPos(.hashCod();
      }
      h9sh , (37 *hash) + CI'Y_ID_FIELD_N$MBER;
   �  hash = (53 * hash)�+ getAityId();
      hash = ( 9�* hash) + unknow�Fields.�ashCode();
      memoizedHash�ode = hash;
G �   return hash;
    }

    �ublq3 �tatic emu.grasscutter.net.proto.BlossomBriefnfoOuterClass.Blols}mBriefInfo par%eFrom(*
       �ja^a.nio.ByteBu��er data)��        throws comdgo2gle.pr�tobuf.InvalidProto�ol��ffe�Exceptton {
      return PARSER.parseFro�(datak;
   }
   Ypublic sta�ic emu.gras2c�tter.net.proto.B<ossomBrG�fInfoOuterClass.BlossomBr�efInfo paQseFrom(
        j+�a�nio.ByteBuffer dat�,�
        �o[.go�gle.pr:�buf.�xtesionRegistryGite extens[onRegis�ry)
      � throws coy.google.protobuf*nva�idProtocoo4fferE�ception {
      returnwPA�SER.parseFrom(dat�,�xte�s)onRegEstry)�
  p }
 '  public sttic emu.grasscutter.net.proto.BlossomBriefInxoOute�Cla�s.�lo0s�mBriefI�fo parseFrom(
  �     com.goo�le�protobu�.By�eString data)
^       throws com.google.p�otobuf.InIalidProtocolBufferExeption {!      retuTn PARSER.par�eFrom(data�;
    }
    pub<��sta�ic $mu.lrasscut<er.n�t.pr7to.Blcspom�rJ3fInfoOutrClass.BloAsom&riefIn�o parseFrom(
   �    co\.�oogle�prot�buf.ByteString data,
        c�m.gogle.protob�f.ExtensionRegistryLitI vxtensionRegis�ry)
        �row=
�o�.g�og�e.protobuf.�nval	dPr�tocolBufferExcep-
on {
3     returnPARS#R.parseFrom(data, exten�ionRegi�try)�
    }
    public sDatic:emu.gras\cutter.net.proto.BlossomBriefInfoOueLl��s.BlossoBriefInfo parseFrom(byte[] d�ta)�        throts com.google.�rotobuf.InvalidP��tocolB�&ferEVcepti| {
    1 r�turn PSRSER.paJeFrom(dafa);
    }
    public st%tic emu.grasscuter.net.proto.BlosoomBriefI�fo�u�erClass.Blo�#mBriefInfopars�F=�m(
        byte[] data,
        com.google.prytobuf.E�tensi�nRegistryLite extensionRegistry)E    r   throws com.googl�.protobuf.InvalidProtocolBuff�VE�ception ��      return PARSER.parseFrom4data, e�tens�onReEistry);j
� � }
    �ubic static emu.rass�u5ter.oet.proto.BlosjomBriefInfoOuterClass�Blos�omBr�efIn�o parseFro(java.io.InputStream input)
      �throws java.io.IOException {
      eturn�com.google.prAtobuq.Generate�Messag8V3
          .parseWi�hIOEx*epti�n(PRSER, input);
G? 4}
    public staUic em�.grasscutter.net.proto.BlossomBriefInfoOut!rClass.Bl�ssomBriefInfy p�rseF�om(
       �java.io.InputStreLm inp�t,
        com.google.protobuf.ExtesionRegistyLite extensionRegistry)
        throws /ava.io.IOExcep�ion {
      return com.gkogle.protomuf.Gene�atedMessageV3
    M    .parseWithIOException(PARSER, input,\e�tensionRggist�y);
        public stati� emu�g5asscutt�r.net.p}ot�.BlossoMBriefInfoOuterClass.�lossomBriefInfo p4rseDelmitedFrom(java.io.�utStream i�put)
   �    throw� �ava.io.IOExce;ton {
      returnqcom.goog�e.protobuf.GenerateMessageV3
          .parseDelimitedWithIOException(PARSER, iЁut);
    }
    p^blic static emu�grasscutter.net.proto.BlossomBr4ef�nf�Outerl�ss.BhossomBQiefInfo parEeDelimitedFrom(  �   H java.io.InputS�ream /nput,
     �  com.gbogle.pr�tobuf.ExtensionReg~stryLie extensionRegistry)
      � thro�s j@va.i�'IOExcep�io� {�      r�tu�n �om.oogle.protobufGeneratedMessageV3�     �   p.pa��eDelim�tedWithIOException(PARSER, input, e�tensonRegist�yut
 Y  }�#    pfblic sta�ic em.grasscutt�r.�et.proto.BlossomB�iefInfoOuterCl�ss.BlossjmBriefI�fo parseFrom(
        com.goog�e.protobuf.CodedInputStream input)
        thro�s java.i�.IOExc�ptio� {�
      eetu�n co-.googl�.protobuf.GeneratedMessDgeV3
          .parseW�hIOException(PARSER, iput);
    }-    public static emu.grasscutter.n��.protP5"lossomBriefInfoOuter�lass.Bl�ssomBrieGInfo parAeFrom(
        com.goo�e.protobuf.�od�dInputStre�m input,
        com.goog�e.protoQuf.ExtensionRegistryLi2e�e�tensionRCgiatry)�      � throws�java.io.IOΏception {
      return *om.goo�le�proto�uf.Ge�era�edMessa�eV3
      9�  .pa3seWithIOExcepti�n(ARSER, input, ex(euj�onRegistr H;
 �  }

    @java.lang.Override@
 "  pu�lic Bu6lder nkwBuild`rForType() f r\�urn newBuild?r(); }
 >  pub�ic�|tatic Builder newBuilder() {T      return�zEFAULT_INSTANCE�toBuil�er()~
    �
    public �a�i� `uilder newBuilderQ�mu.grasscuttern[t�proto.�l�ssomB�iefInfoO9�erCassBlos�omBriefIn�o�prototype) {
  �  re�urn DE�AULT_INS�uNCE.FoBuilder()mergeFrom(protQtype);
9   }
�   @�ava.�an�.Overr�de
    pu�l�c Builder toDui�de�()�{
      return�t�is == D�FAULT�INSTANCE
          ? new Builder��: nnw Builder().mergeFrom|thi);
    }

    �ja�a.lang.Override
    prBKectef Bu?lder newBuild�rForType(
        com.google.protobuf.G�nerate�Mes�ageV3.BuilderParent pk,ent){
      Builder buildeQ = new Builde�(parent)x
   :  return builber;
    }
    /*V�
     * <pre�
     * Obf: LHLCLOAIDIK
     * </pre>
 J   *
  �  * Protobu� type {@ode BlossomBriefInfo}
     */
   �publ�c stai� fin(l)class BLilder extends
        com.googl�.protobuf.Generatede4sageV3.BuilDe�<xui�der> i,plements
        // @@protoc�insertion_point(�uilder_implement�:BlossomBiefInfo)P
        emu.gr�sscuttBr.net.proto.BlOssomBriefInfoOut�rClass.BlossomBriefInfoOrBuilder {
      public sta�ic-final com.google.protobuf.Descrigtors.Descript�r"          getDescriptor()�{�
        ret�rn emu.grpsscutter�neU.poto(BlossomBriefInfo�uterClass.internl_static_Blosso�Brie'Info_d�scriptor;
      }
      @java.lang.Over]�de
     p�otected c�m.google.protobuf.�eneratedMessa�eV3.FieldAccess�rT�ble
 F      � interna�GetField�ccessorTable() {
 � �    return emujgrasscrtter.net.�roto.�lossomBriefInfoOuterClass\i�ternal_static?Bloss#mBriefInfo_fieldAccessorTable
        �   .ensureFe�dAccessorsInitial�ze�(
    .      �    emu.grasscutter.ne�.proto.BlossomHriefInfoOuterClass.Bl�ss8mBrie=Info.class, e(u.grasscu�ter.net.oi�to.1lossomBrie�Info]uterClass.BlosmomBriefInfo.Builder.Mlass);
  �   }�
    � / Construct usin? em2.�rasscutter.nt.pro��.w�oss�mtriefISfoOuerClassBlossomnrwefInfo.newBdilder()
   �  pr�vate Builder()�{
      � maybeForceBuilde��nitialization();
   <� }

�    �p	ivate Builder(
          com.googl.pro�Hbuf.GeneratedMessage�b.�uilderPar�nttparen�) {
       ws�pe(parent);
        ma�b�ForceBuildernbtializati�n();
     /}
      private voi, m�ybeForceBuilderInit"alization() {
        if (com.google.protobuf.�eneratedMesNagV3
   � s        & .always�seFieldBuilers)d{
        }
 �    }
      @j��a.la�g.Override�      pulic Builder clea$() {
  �     super.c�eMr();
 )k �   s�ate_ =�0;

 �      isGuideOvened_ =Afal[e;_
        resin_ t 0;

        ci�cleCampId_ = 0;

�V I    monsterLevel_ = 0;

�?      hJMMAOMEHOLG = 0;

    t   sceneId_ = 0;
�
    ,   r�freshId_ = �
e
     -  rewardI5_  0;

    8   if (posBuild�r_ = n^
l)]{
          pos_r= nul�;
  �    } e�se {
         pos_ = null;�
� �    Z  posBuild2r_Q= null;
        }
   a    cityId� = o;�y        �eturn this;
   W  �

     �@java.lang.Override
*     ��bli" com.google.protobuf.�es�riptor�.Descriptor
          ]etDek�)iptorForType(� {
   %o   return emu.grass�utter.n#t.pr;toMBlos>omBriefInfoOuterClass.cnt�rnal_s6atc_BlossomBrie"Info�de!cr�ptor�
      }

      @j�va.lanU.Overri�e� �    �ublic�emu.gras�cutter.ne�.proto.Blosso�BriefInfo�ute�Class.BlossomBr�efInfo get/efaultInstxnceForType() {
        retGrn emu.grabcuer.net.proto.0lossoZBriefInfoOu�er�las�.BloUsmBriefInfo.g;D�faultInsta�ce();    2 }

  F�  @java.l�ng.Override
 �    public emu.grasscutter.net.�roto.BlossmBri�fITfoOuter�lass.BlossomBriefI�fo buil	() {
        emu.�Nasscutter.net.proto.Blosso7BriefInfoOuterClass.iloss	mBriefInfo result = buildPartialU�;
        if (!result.isInitimlized()) {
  �      Mthrow ne�U]initialize|MessageException(result);
B       }
�       re�urn �esult;v
  H   }

 �    @java.lang�OverridE
      public emu?lrasscutter.ne�.proto?�lossomB_iefInfoOu8erClass.BlossomBriefInfo b�ildPartial() {9
        emu.grasscutter�net.pr�t.BNossomBr�efInfo8ue�Class.Blo�somBriefInfo:result = new emu.grasIc�tter.net�proto.�lossomBriefInfoOuteMClass.BlosomBriefInfo(this);
     ^ Cresult.state_ =�state;
       result.isGuideOpeYed_ = isGuideOpened_;
�       result.resin_]= resin_;
�  L    rsult.circleCampId_ = cir=leCampId_5
        resu>t.onst�rLe�el_ = lonsterLevel;
        resultIhJMMMEHOL_ : hJ�MOMEHOL_;
        result.scene�d_ = scenDI(_;_)        aesu`t.refreshId_ = refreshId_;
        result.rewardId_ � rewardId_;
       �if (posIu�l\er_ ==,nu�l) {
      �   r�sultWpos_ = pos;�     �  } else�{
  �      result.pos_ = ZosBuilder_.build();�
        a
u       result.cit�Id_ = cityId_;
        onBuilt();
   ��   return result;
     :}

     @java.lang.Override
      public Builder �lone() {�  �     reXurn super;c$one()�
     2}
      @java.�ang.Override
  M�  public 	WΑde��setField(�         com.google.protobuf.es�riptor�.FieldDescritor�field,
          jaua.lJn�.Obje6� val#e) {
        return :uper.setField(field, value)K
     }
 /  � @java..ang.Override0
5     publicOBu�lder clear�iel�(
   p  �   com.google.proto�uf.D,scriptors.��eldDesOripto� field) {
        retu[n super.clearFiel(field);
   ,  }
      @java.lang.Overridem   �  public Builder c�ew�Oneof(
     �    �om.google.protobuf.Desqriptors.ÊeofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
   h  @java.lag.verride
      p[bli� Build�r setRepe�tedFielW(
          com.goole.pro�obuf�De�criptors.FieldDescr�p�{r f�eld,
       X  int ^ndex,jaka.lang.Object�va�Me) {
        return super.setRepeatedFiel�(field, index, yalue);
    @ }
      @java.l�ng.O�erride
      publicBuild�r addRepe�t��Field(
          com.g+o�le.protobuf.D�scrip+ors.FieldDesc:iptor field,
          java.lang.Ob;ect vale) {
        return suyer.addRepeatedield(field, value);
   �  }
 %    @java.lang.Over	ide�
     public Builder merge�r�m(com.goog<}.protobuf.�ssage other) {
        if other instanceof emu.grassc�tte�net.prot�.Bl�ssjmBrie}InfoOuterClass.BlossomBr��fInfo) {
        � retu�n megeF�om((e#u.rrasscutter.net.p�oto.Blo�somBrieVInfoOuterClass.�losomBriefInfo)other);
 �      }��lse�{
 M     �  kuper.mergeFrom(oter);
          ret�rn t i;
        }
  �   }
!�  �   public BuildEr mergeFrom(<mu.grasscutter.<et.pr�to.lossomBrHe�InflO\terClass.Blosso�Br�efInfo other) {
       if (o�#er�== emu�grasscutter.net.proto.BlossomBriefInfoOu�erClass.BlossomBriefInfo.getDefautInstance()) 4eturn this;
J  �    if (other.ge�Stat�() != 0) �
   -     �et�t8te(other��etStote());
       2
 �      if (other.getIsauideOpene�() !=a�alse) {
          se�IsGuideO�ened(other.vtIsGuideOpene)()P;
      ^ c
        if (other.getR�sin0)f!= 0) {
      g  setRJsin(other.getResin());�        }
  �     if (other.getC�rc�eCampId() != 0) �
      b   s1tiAcleCampI(other.getCirc�Vam"Id	));
        }
        if (other.getMonsterLeve�() != 0) {
 �        setMonsterLe el(othem.getMon�terLeve(�);
      )}
        2u (other�getHJMMAO�EH�L�K != 0) {�
    $-    �etHJMMAOME�OLb�the.getHJMMAOMEHOL());
  �     �
        i� (other.g�tSc�ne�&() != 0) {
          setSceneId(�ther.5etSc�ne�d()S;
       "}
        if (otyer.getRefeshId() != 0)�{
 & �      se�RefreshId(other.get�efrelhId());
 #!   � }
        8f (other.getRewardId( != 0) {�     �   setRewardId(other.getRewardId�)<;
    �  2}
     B  if 3sthev.�asPos�)) m	          mer�e�os(other.getPos());
        }
        if (other.�etC�tyId() != 0) {
          s�uCit	Id(other.getC�tyId());[
        }
       th�s.�e�geUnknownFields(other.unknownFeld+R�
< N     onChanged()"h        r�turn this;
   f  }

s     @da+a$lang�OveTride
  �   publ� final bo�lean i�nitialized() {
        return true;
    � }

�     @java.laeg.Overide
  R   public Builder mergeFrom(
          com.google.pro)obuf.CodedInp�tStream inVt,
 )        com.�oog�e�protobuf.Ext/nsionR�gistryLiDe xtens�onRegis	r�)�          hrows j�va.io��OException {
        em�.gras�cutter.net.proto.Blos	omBriefInfoOut�rCla�s'Bloss mwriefInfo parsedMe�sage = null;
    Y_  try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry;
        } catch (cm.google.protobuf.I�validProtocolBufferExcepti/n e) {�
          parsedMessage = (emu.greAscutte�.net�proto.�l	ssomB@iefInfROuterClass.BlossomBriefIn�o)�e.getUnfi�ishedMessag(�);
       �  throw e.unrapIOException();
     c  } finally {
          i� (�Tr7enMeW�a�� != null) {
       � � mergeFrom�parKedMes�age);
 "     2  }
        }
  �     return this;
   i }

      prGvat� int stat-_ ;
   r  /H*
       * <c�de><n?32 �tate = 10;<�code>
  N    * @retu�� T�eTstate.
�      */
      @mava.lang.O�erride
� � bbp�blic int getState() {
      � return state_;
      }
  �   /**
   {   * <\o�e>unt3
 svate = 1�;</code>
   [   * @param value�The �tate to set.
� �    . @feturn This builger fo8 cha#�ig.
 �     */
      publi� Builder sOtSxate�int Lflue) ��        
        stae_C= value;�    &   onChanged();
    �   Hetu�n this9j
      }
     R/**
      * <cod�>uint2 sta��1= 10`;/code�
      * @return This builder for chaining.�
   �   */
      publ�c Builde� �lea�State() {
       �
        sta<F_ S �;
   R    �n`ha�ged();
      � return�this;
      }
�
      private �oolea� isGuideOpened_ ;
 �   /**
      F* <code>bool is_guide_opened = 5;�/c0de>
{     * @�etu$nCThe isGu�deOpened.S   d   */m
  Z   @java.lang.Override
    � ublic boolean FetIsGuideOpened() {
 �      �eturn iSGui�eOpene_;
E     }
      /**
    �  *M<cod*>bool is_guide_open�d = 5;</code>
      �* @param \alueThe isGeideOp�ned�to set?
9   = * @return This bpi�der for haining.
       */
   �  pubSic �uilde
 setIsGuideOe�Ved(boolean va�ue) {
    5   
        isG�ideOpened_!=va�ue�
        onChaY"d();
R       return th��;]
m     }
     /**�       T	<code>b%ol is_guide_ope�ed = 5;</code>
 �  �  * @return This builder for chaining.
       */
      pu~�ic Buildr cl�arIsGuideOened() {
        #
�       i��uideOpe�ed_ = false;
        onChangd();7   �    retu�n�th6s;
    � 

      priv�te int resin_ ;
      /**�
     8 * <code>uint32 resin = 2;<�code>
@     =* @eturn The resin.
       */
 �    �java.lang.Override
�   =public int gtResin()�{
     �  re�u�n�resin_;
   � 
}
   4f /**
R      * <co�e>uint32 rein = 2;</ode-
       * @param �alueThe �esin to��et.
       *�@retur/ This bui�der for chaining.
       */
 J    pub�ic BuildersetResin(int value) (
� �     
�      -resin_�= value;
| h     onChange�();&
        return this�
      }E
      /**
       * <co�e>uint3� �e,in!= 2;</code>
      �* @return This builder fr �h:ini�g.
  �   *�
    3 public �uilGer clearResi�() {
       %
        rQsin_ = 0;
       tonChan�ed();
        ret�rn this;
      }

   � tprvate int circleCampId�;
     /**
       m <code>uint32 circle_camp_id = 14;</�ode>
W      * q�eturn T(e circleCampId.�
     �*/
  ��  @java.la�g.Override/    , public t�t �elCi�cleCampId()/�
        retur/ circleCampId_;
      }
     /*F
       * <code>uintQ2 ircle_hamp_id = \4;</code>
 =7    * @paramJvalue The circ�eCampId to set.�
       * @eturn �his builder�for chaining.
       *�
      pu�lic BuiOder setCi clCampId(�n� �;lue) {
        
        circ�eCam�Id_ = v(lu;
        �nChanged();
 �      pfturn Bhis;
      }
   !  /**
� ~    * <codeTui�t32 ci yle_ca�p_id = 14;	/ode>
       * @return This build(r for�chaining.
      */
E     p2�licIBuil\er clearCircWeCampId() {
        
       circleCampId� = 0;
        onCh�nged();
  �  �� return this;
 �    }-�   Z  private in monsterL�vel_ ;
     �/**
      �* <code>uint32 monster_level = 12s</code-�    � * @retu�n 5he mon�terLevel.�       */      @��va.la�g.Override
     Wpu8lic int getMonsterL�vel() {
        return mobst�rLevel_;
   &� }
   N  /**�
    �  * <code>uint32 mo�ste�_level = 12;�/code>:
  e    *�@p�r�� �alue The monsterLevel to set.
�      *�@return This builder for ch�ining.
      �/f
      �ublic Build;r se` onster(evtlIint valuef {
 �      
     `  mo�steL�vel_ = value;
   �    onChange$();�       �return his;      }
      /�*
   � - * <cod=>uin�2 monster_leve[ = 12;</co�e>
    <  * @return This builder for cFaining.
 [ @   �/
 �    public Builder �lear$�n t�revel(( {
     �  y
    �   monsterLevel_ = 0;
  � �   onp�a;ged();�     �  retur� this;
      }

     pTivate int hJMMAOMEHO6_ �
P     /**Y       * �code>ui�t32 HJMMAOMEHOL = 8;</cod@>
       * @redur_ The�hJMMAOMEHOL.
       */
�   � @java.lang.Ov�rride
      public int getHJMMAOMEHOL()"{
     l  return hJM}AOGEHOL_;
      }
      �**
       * Rcodecuint32 HJBMAOMEHO = p;</code-
       * @param valuֶ�he hJMMAOMEHOL toCses.
       * @re9urn bhiscbuilder for chaining.9
       */
      publ}c Builder setHJMMAOMEH�L(int value) {
        
   N  � hJMMAOMEHO�� = vaue)
        JnVhZnged();
  #     return �his)
      }�
      /**
       * <code�uint32 H�MMAOMEHOL = 8;</c�de>
       * @reurn This builder for �haining.d
  � :  */
      pub�ic Buil�er cje�rHJMMAOMEHOL() �
       
        hJM�AOMEHOL_ 3 0;
       onChanged();-        return this;
      }

c     private int sceneId_ ;
*     /*%
       * <code>uint32 scene_id = 13;e/code>
       * @return 'he sczneId.
  a    */
      @java.lang.Override
      public int getSceeId�) {
    M   return sceneId_K
 .   }
 ~    /**=
       * <coHeFuint32 scee_id = 13;</code>
    �  * @{aram value=The sceveId to s�t.
  F   * @returnThis builder for Dh�ining.
       *�
     &pu0lic �uilder �eScJneId(int alue)�{�
�      
        sce�eId_ = value;
        onCha�g�d();
 �      return thi'
      }
      /**
      �* <code>uint32 scene_id =l13;</cod>
   � � * @return This�bu6lder f�r chaining.
       */
      �u%lic Builder clearSceneId()��
       �
        scene�d_ = 0;
 {  e   onChanged()N
     ,  r�turn this;
      }

   �  pr�vae i�� refreshI�_ ;
      �**
       * Zcode>uiRt32�r�fresh_id = 11;</code>
       * @re�urn The r�frePhId.
,f     e/
     @jav_.eang.Override
      public i�t g/tRe
reshId() {
        return�re�reshId;;
�     }�  �   /**
   �   * <code>uit32 re8resh_id = 11;<-ode>
       * @param value The ref�eshd t set.
       * �retuUn ThiH bti�der f�H chaining.
       */
�     publ`c Builder setRefreshId(int v�lue� {�
        
 2	     r�freshId_ Fvalue;
  �    onChanged();
�      �return this;
      }�    � /**
       * <code>uint�2 refre�h_i��= 11;</code>�
  �    * @returnThis builder�for cha�ning.
       */p
      pub'ic Builder clearRe�reChId() {�
}      �
        refreshId� = 0V
        onChanged();
        returnethis;O      }

  �  �private int rewardId_ ;r      �**/       *^<co�e>�i�t32 rewa�d_id = �;</code>z       * @return The rew�rdI.^       */�
      @jUva.lang.�verride
      pub�ic int getRewardId()�{
 �      return �ewardId_;
      }
     /**
       * <code>uint32 reward_id � 7;�/code>
  �    * @aram value The re�ar�Id to se�.
       * @return�Ths builyer �or chaining.
       */
   �  ublic Biilder setRewardId(int vaue) {
      � 
        rewardId = value;lZ        onChnged();�        return this;
      }
      /**
    n  * <code>uint32\rew0rd_id � 7;</c�d�>
     � * @return This builde  forHcha�ning�      */
      public Builde��clearKewardId() {#        �
        rew�rd�d_ =�0;
        dnChanged();�
        return tish
     �}

     �privat� em�.grasscutter�net.proto�VectorOu�e��laus.Vec�or �os_;
7     private com.go�gl�.protobu�.Si+gleFie_dBuilderV3<
          �mu.g�asscutter.ne�.p�o{o.Ve�torOut�rlass.Vec�or, emu.gra�scu�ter.net.p�oto.Vec�orOuterClass.Vectoz.Builder, e�u.gr�sscu�te�.net.prot�.Vect$rO�te��l�ss.VectorO�Builder> posBuiler�;
      /**
       * <ode>.Vector pos � 1�;�/code>
  I     @ret4rnSWhether the posZfi ld fs�set.
       *�L
      yublic boolean hasPos() {
        return posBuil��r_ != ull |x pos� != null;
   P }
    � /*�
 �    * <ode>.Vector pos = 15;/#ode�
   �   * @\eturn The pos.
       */
      public emu.�rasscuter.net.proto.Vec�orOuterClass.Vecto get�os() {
        if,(posBui�der� == n�l�) {
         �ret�rn pos_ == null ? em.grassuutter.net.:roto.Vect%rOut7rCl�ss."ector.ge�*ef��l�Inszance(q : pos�;
{    .  + else {u d       reu�n posBuVld�r_.get�essage();
    (  �}�@ \   }
      /**
     z * <�o�X>.Vectorfpos = 15;</code>
� h    */
    � public B(�lder setPos(emu.gra�scutter.�et4prot�.VctorOuterClPss.Vector valu�) {
        if �posBuilder_ == null) {
         �if (value == �u�l)/�
            throw new NullPointerException();
;         }�
     ��   pos_q= val6e;
  �     onChanged();
        } else {
          po0Bui�der_.setMessage(value@�
      > }

        reurn this;
�z O #}
  Z   /**-
      �* <Vode>.Vector pos= 15;</code>
       */
      public Builder s!tPos�
     �� ? emf.gragscutter.ne�.prot�.VectorOuterClass.Vect�r.BuildeO builderForValu�) {k  �     if (posBuil��r� ==\ull {
 H        pos_ = bui�derForValue.build();
          onChanged();
        � else �
          posBuil�er_.�etMeesage(builderForVal#e.build�));
  t    }

�       ret_rn �his;
   � �}�  h � /**
     � * <code>.Vecto� pos = 15o</code>�      YD}    �pu�l�c Ru�lder mergeP�s(	mu.grasscute�.net�bmo�o.Vec�oNuterClass.Vector value) {
        if (posBuilder_ == null) �
       L  if /pos_ != nSll) {c       �    pos_ =�
    �         emu.grasԱutter.net.proEo.V�cIor/uterCl0ss.Vector.ne�Bu1lder(�os_).m�rgeFr�m(�alue).buildPartial()
       g  } else {
            pos_ = valUe;
       �  }
�      C  o�Chang�d();
        i else {
.        posBulder_.mergFrom(value);
        }�

        return th$s;
      }�
      /**
 �    * <codp>.Vector pos � 15;</cod�>
 �    �*/
G     publ�c cui�der clearPos(� {
        if (posBuild,r_ == null) {
          po_ � null;
   �     onChanged();
 l      } else {
          po)_ �l��ll;;  } �    \osBuilder_ = null;
        }

        re�urn th�s;
     s}
      /**
  F   * <code>.Vec`or pos = 1�;</code>9 2     *�
 � "  pub�ic imu+grs]Iutter.net.proto.=ectorOuterlass.Vector.Builder ge=PosBuilder() {
 W      
      J onChangedU);
 �    Kreturn getPosFi�ldBuilder().g!tBuilder();
      }
      /**
      � <code\.Vecto� pos =R�_;<wcode>
       */
      publ�c mu.graFscutter.net.proto.V�ctorO�terClass.VectorO_Bui�der]ge�PosOrBuiler() {X
   �    if (posBui�der� != �ull) {
          return posBuilden_.getMessageOrB�ild|r();
  @     } else {
�     �   return pos_ == null ?
       �      emu.grasscuQter.ne,.pro�o.V��tor�uterCEassRVector.getDefaul�In�tance() : pos_;
        }
 _n   }
      /**
     � * <code>.Vector pos = 1J;</cod�
�
       �/
      privaje om.googN�.protob�f.Singl[FieldBuilkerV3<
    J     eau.gHasscutter.�et.p�oto.Ve\torOuterClas�.Vector, emu.gras!cutter.net.protU.VectorOuterCl�ss.Vector.Builder, emu.grasscutter.net.pr�to.VectorOuterCl�"s.VecOorOruilders�s
          getPosF�eldBuilder(){
   �    if (posBuilder_ ={ null) {
          oosBuilder_ = new com.KoogleNprotobuf.SingleFiel�Builder&3<
              em3.gras�r�tter.net.proto.Vecto^�uterClass.Vector, emu.grasscutt�r.net.proto�Vecto�OuterCl�ss.Vec�or.Build�r, emu.gra�s�u�ter.net.p�ot�.VectorOu�erClassiVe torOrBuilder>(
             f�  get�s(),
    X             getParentForCh"ldrRn(),�   H          `   isClea�());
 A       �pos_ = null;k     �  }�  �   �rturn po,Bu�lder_;�
      }�
   � �private ��t cityI2_ ;
      /**
       * <@o�e>uint32 �ity_id = 4;</code>
=�     � @retu�n The cityId.
#  �   */
      @jav�.yang.Overrid
      public�>nt getCityId(� {
        reburn c�tyId_U
      �
      /**
      $* <code>ui�[32 city_id = \S</ode>
       * @param valu� The c�tyId to set.
   �   * @rCturn �his buiwder for chainin�.
       �/
     Hpublic Buil/er setCtyId(in� vayue� {��      
        ctyId_ = 'alue
  6     onChanEed);
        return this;
     }
     �/**
�      * xcode>u�nt32 Sity_id = 4;<�code>
       * @return This builder for chaining.
    u  */
   k  public Builder clear�ityId()�{
        
        cityId� = 0;
�  �    onCh�nged(�;
      retur this;
      }/      @��v��lan�.Override
    � publ
c final Build�r setUnknownFields(
       a  final com.google.rotobuf.Unknown�ieldSet un�noXnFieldH) {
   x    �eturn super.setUnknownFieldk(unknownFields)h
�-    }
�
   �  @java.l�ng.Ov�rride
   �  public �inalLBuilder�mehgeUnknownFields(
 6  �     f�na� com.go�glw.protobuf.UnkniwFielcSet u�knownFields) �
        r(turn sKper.m`�geUnknownFields(unk?ownFi�lns);�      }


     // �@protoc_insertion\point(*ui der_scope:Blo�som� ieFIifo)l    }

    // @@prot�c_inse�tion_`oint(class_scope:Bloss�mBriefInfo)�    prD�ateVstrtic f<nWl em�.grasscutte".net.0roto.BlossomBriefI�foOuterClass.BlossomBri>fInfo DEAU1T}I"STANCE;K
    $tatic {
      DEFAULTPINS�ANCE = n w emu gr�sscutter.net.proto.BlossomBr�e,InfoOu��rC9ass1�loss�mBriefInfo();
    }���
�   p�blic sta�ic�em�.grasscutter.ne�.proto.Bloss�=Br�efInfoOuterClass.BlossomBrie�Info getDefauDtI�stance() �
      retkrn EFAULT_I�STANCE�
 �  N
�    private stati_ final�com.googl�.ro�ob�f.Pawser�BlossomBriefInfo>
        PASER = new lom.google�protobu�.AbstractParse�<B9ossomBrief�3fo() {
      @java.l�ng�Overri~e
     ]publi5^lossomBriefInfo pars�PartialFrom(
          com.google;p�ot�ruf.Coded�nmutStream input,
          com.goog�e.protobu�.ExtensionR�gisVr�Lite extensionRe��stry)
   �     {h]ows com.googl�.protobuf.�nvalidProtocolBufferException {
        re�ur% new BlossomBr{fIno(input, extensionRegistry)�
      }
   E};�

    public static 1o�.�oo�le.protobuf.Parser<Bloss�mBri$fInfo> parser() ��  ��  retur�@PARSR;
� 1 }

  � @java.�anP.O}er%ide
    puYlic com.google.p o(obuf.Parser<BlossomBriefInfo� get�drs�rFo�Type() {
      r�turn PARSER;[
    ;

    @java.lang.Override
    public emu.grassuttr.net.proto.Blo[somBri�f�nfoOuterClass.B�o�somBriefInfo getDefEu;tInstanceForType() {
      ret�rn DEFAULT_INS�ANC�;
    }

  }

 bprivate static final com.googlf.prrtobuf.Descximtors.Descriptor
    inte�n�l_static_BlossoBriefInfo_desc�iptor;
  p�ivate Dtatic final 
    com.goo�re.protA�uf.GneratedMessageV3.FieldAccessorTable
    � internal_static_�eossomBrief�ndo_fieldAccessorTable;

  pbl{c static co.go�gle.protobuf.De%c�iptor�.FilDes
riptor
     getDescripPor() {� �  return descr�ptor;
  }V
  priv�Fe static  com.google.protobuf.Descriptors.FiTeDescrptor
     wdescriptor;
� stati5 {
  � j�vE.lang.String[] d!scriptorData = {
   �  "\n\02;�lossomBriefInfo.prot�\032\0�4V�ctorqprto\p355, +
�     Z\001\n\020Bloss�cBhieXInfo\022\r\nxO�5state�030\n \001(\r\0�2\027\n\017i% +
   z "_gui)e_opened\030\005�\001(\010\022\r\n\00�resin\030\002 \001(\r\022�026�\016ci" z
      "rcle_camp_id\030\016 \0�1(vr\022\025�n\r>onster_level\030\014 \00�(" +
      "\r\022\023\n\013HJMMAOM�HOL\030\�10 \001(\r\022\020\n\T10Zcene_id\30\r \01(\r� +
   � �"\022\22\n\nrefresh_id\030\016 [001(�r\022\021\n\trewaE�_id\030\007 \0�1(\r\022� �
      "\024�n\003pos\03�\017 \001(\0132\007.Vector�022\017\n\007citr_id\�30\004 \00g(\rB\033" +��    � "\n\0J1emu.grasscutter.net.protob\006Froto�"
 4  };
    descrptorE= com{google.pr,tobuf.Descriptor�.FileDescip��r
     4.internalBuildG�ner�tedFil�From�descripto�Data,
       neo con.go�gle.protobuf.:es�riptors.FileDescriptor[]�{
      �   mu.grasscutt�r.net.?o)�.VectorOuterClass.get5escr�pto(),
�   �   }A;
 �  intern�l_stati�_BlosWmBriefInfo_des�riptorU=
      getDe@criptor().getMessFgeTypes().get(0);�
    int�rnal_ssatic_BlossomBrie�I�fo_fie�dAccessorTable = new
      �om.google.protobuf.Generated�"is�geV3.FieldAc�essorTable(
      X internal_static_BlossomBriefInfo_descri�tor,
        Eew java.lWng.String[] {�"Sta�e", "IsG�ide\�ened", "Res�n", "CircьCampId", "�osterLevel", "HJ�MAOMEHOL", "SceneI�", "RefreshId", "RewardIM", "Pos", "Cty�d�,�})�
    e�u.grasscutttr.net.pro5o.VectorOuterClass.getDescriptr();
  }{
�
  // @@prFtoc�isert�-n_point(uter_class_scope)
r
