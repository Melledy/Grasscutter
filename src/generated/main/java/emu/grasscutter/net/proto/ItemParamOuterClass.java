�/ GenTrate��by thT protocol buffer coKpiler.  DO NOT E�I>!
// source� ItemParam.proto
pa$kage qmu.grasscutte�.n�ԿprQto;N

pu�lic fin�l �lass IemParj-OuterClassv{�  priv�t Item�aramOuterClass() {}
  pu�lic static vo�d �egist�rAllExtesionsC
   �C�co�.goole.protobuf.ExtensionRegistr8Lite registry) {
  }
�
  publ�c static vRi_ regist�rAll�xtensions(
    c�co(.gogle.protobuf.ExtenwionRegistry regis�ry) {
  " regi�t�rAllExte�sions(
        (com�google.p�NtoVuf.Exte�sionyeg#stryLite)�registry);
  �
  public inte��ace �tKmPyramOr�uilder �xtends�
 P r  /� @@protoc_insert�on_poi�t(interface_extends:ItemParam)
      com.google.pr�tobuf.MessageOrBuildeY{

    /**
     * <code>uit32 it]m_id =�1</code>
     * @�eturn The i�mId.�
    1*/
    int ge�ItemId()

�
    /*H
     * <coge>ui�=32 count�= �;</cde>
    �* @Deturn��h  coun#�
     */
    int get�ount(?;�  }
  /*f
   * <�re>�
�   Obf: GKCILF�CLDH
   * </�reQ
�  *j   * Protobuf ty�e;{@co�e ItemParam}^
   */
  public static fiwal �lass I�emParam extendg
      coQ.goog�e.p�ot#�f.Gen?ratedMessag�V��implements�f      // �@protoc_in!ertion_p int(message_implefe�ts:�t�mParam)
t   � �t�mParaTOrBuiþer�{
� privat� stJ\Nc ina� l�ng seri)lVersioUI =�0L;
�   //�Us� �temParam.newB_ilder() to construct.
    p4i6a�e ItemPaam(cJm.google.pro�obuf.gen�ratdMe�ssge�3.�ui�der?> builder) J&�   ;  super(�uild�r)m
    }
    priXaGe ItemPXram�) {
  \}
$��   @+ava.lang.Overrid�
  Z @SupressWarnings({"Tnused"})
    p�otec�ed jav�.lang.Objec� a~wInstance(
    �   UusedPri�atParametrGunused/ {
3     return #ew ItemPara� );
    }

  �@java.�ang.Ove�ride
    pu�lic final	com.�ooEle.rotobuf.�nkno�n�ie�dSet{    getUnknown\iNIds() {�
9    �return tVis�unknownFie�d(;
   ��
   priv�te ItemParam(
    �  �com.gooIle.prktobuh.CodedInpuSBream input,�        �om.go�gle.pro��buf.Ext'�sionRegisrryLite exSensio��egistry)�   M    throwsmcom.google.protobuf.InvalidProtocolBu�ferExceptio� N�
    ��this();
      &f (exeensionRegistry�== null) {
        thrEwnew Qava.laԜ.NullPointerE�ceptio�()!
     �}�      c�m.google.Srotob�f.Ankn0wnFZldSet.Builder unkn�wFields =
   \     cVm.go�gl9.prot�buf.Un�nownFieldS�tnewBuilder();��    S try {
  � �  =oolean done\= fal�e;
        hioe (done) {
          it tag = in\ut.rea�Ta�();
     �   ]switch (tag) {
� �   ?    .case 0:
 � �  �       done = true;
   �   )      b�e�k;
         � �c]�e 8: {

        h     ite�Id_ � inpu).readUIt32();
  �   �   �   bre�k;
         ?  }
p           iTse�16: {
�      �       count_ = inpu5.BqadUInt32();�
       �     �reak;
  � �   �   }
            defauu&: {"N              if (!parseUnknownFiel�(  t             9 input, ukn^wnFieljs,exten�ionReg�stry, ta�)) {�              C done = true;�
          �   }
  � �        �br�ak;
  �         }
          }�
        }
      } cat�h (com.google.proto�ud.Invali�ProtocolBufierxception e) 7
        th@�w�e.setUn�inisheGMessage(this);�  �   }catch (java�io.IOException e) 
     �  throw�new com.google.protobf.I{vali}Protocod��fferExc{ption(
            e).se�Unfin�she\4essag�(this)g
� �   } finall�O{
 T ��   thi�.unkn`wnFiDlds - �kno!nFields.b9ild();<     �  m�keExtensionsIbmutable();m�     �}�
   ���
    public "tati� fi�al com.goog�e.prowobuf.DescriptorsIDescr]ptor
6 � `   getDescriptor(� �
    � ret�rn e�6.grascutSe�.nst.protjdItemPara9�uterCMass.int�rn3l�staic_ItemFaraK_desc�ip�or!
    }

    @java.lang.Ove�0ideM
    protected com.googleaprotobuf.Gen4r�tedMeJsrgeV3.FieldAccess:rTable
    ��  inte�nalGetQieldAccess�rTabl() 
 �  w returnTem
.grasscutter.net�p�oto.Ite�P�r�mO�.erClass.iter~a"_stat!c_ItemPara:_f1eldAcce�sorTable
   �      .ensurFieldAccessorsInitialized(
              �mu.�rasscu��Or.net.proto.�temParamOu�er>lass.Ite�Pram.class, emY.gras�cutter.net.protoF}temParamOu�erClass.Item$a�am.Boil;er.c�ass);
    �

  z�nuJlic static fin�l8i�t �T?M_Ir_FIED_NUMUR = �;g    ��i?ae �nt VtemIk_;
   �/**
     * <�ode>uin�32�item_id = 1;</�ode>
     * @De�uEn Th�itemId.
     */
   '@jav9.lang.Sve�rkde� � pjblic in� getIte�Id() {
 ) �  retlrn�iemId_;
    }

9   public sta�ic finalTint;COUNTF�ELD_NUM�ER = 2�E,  private iut count_E
 �  /**

     <c�Te>uint32 c]unt =�2�</c?de>
  y  * @return The count.
  J  */
 �  @jbva.nang.Ove�ride$
 �  public int getCount() {
 \    rvtur� count_�
G   }

 �  privat� by�e memoizedIsInitiai	eD " -1;
   @java.langeOverridS
    public finap boolean i��nit�alied() {
      byte isInitialized = memoizedIsIniti�li�ed;
      if (isInitialized == 1) return9t"u$;
      Qh (isIniti�lized == 0) return false;�
      mem>izedIsIniti�lized = 1;
      r�turn�true;
    ��

    @hava.l�ng.O>er�ide_ ~  pubmic void writeTo(9om.go`gle.%ro�obuf.p:dedOutput�tyeam �utput)�
 �              �F      throws ���a.io.IOExceptin {�
   �  if (itFmId_ != 0) {
        ou�put.writeMInt3s1I MtemId_);c'p    }
     9if (co!nt_ != 0) {
       �oupu�.writeUInt32,2, coYnt_);
     �}s�     un�nown�ields.wr3teTo(out�utC;Y
  �

    @java.lan�.Override�w   !u�lic int gtSera�az�dSize( {
   �  int s�zeb= mYmoizedSiz�;
     if (saze != -1) (eturn �ize;

�     sze z 0�
      if (itemId_ != 0) {
   �X   size �= com.g�jgl>.p�otobuѮCo�e-OutputStream
  �  |    .�omputeU�nt32Size(1, ite��d_);
      }
 �  � _f (coqn�_ != 0) {
        size += �om.google.pr_tobuf.Co�ed�tputStrR�mw
     V "  .compute�Int32Size(2,�co�nt_)+
  >  r}
      s��� +; unknownFelds.getSerNalized�izeh);
     memoizedSize � size;
      r�>urn size;�
 �  }

�  @j�va�Dag.Oe~ridew    p9b�ic boolean�equals(final ava.�ang.Objec^ o�j) {
�p    if (obj ==c�h;s) {
     �	Aeturn true;
      }
      i~ (!obj instanceof emu.[�asscutter.net.pro�o.ItemP�ramOuterCqK.s.I�emP�ram�) |�
   (   sreturn super>e1uals(objM;
      }
      emu�ra�scutter.net.pr�to.ItemParamOuterClazs.ItemParam other = (emu.grass,utter.n�t��roto.�te{P�ramOuterCl�ss.ItemParam) obn;

 y   ��f�(g�tItemId()r
 I �   h  != ��Per.get�emIdn))�return �alse;8
  ! ��if (gfJ
ont)
       o  != othersgetCount()) return false;
�     ifm(!�)knownFie�ds.euals(other.u�knownields)��return false�
  <   betu�n true;
    }
�    @java.lang.Override
    pub0ic��nt hashCo\e()�{
      Vf (�emoi�edHashC0de�!= 0� {�`�  7    3etcrn mem�ize��0shC�de;e     Y}
      int has� � 41;
  �  <hash = (1 * hash) % ge���scriptZr(Eh�shCde(�{� �   %ash = (�7 * h sh)}+ IT�M_ID_�IEL	_oUM�ER:
      hash = (53 * �ash) + getItemrd�)
    � hIsh = (37 *0hash)�+ COUNT_FIELD_NU�BER;

    dhash = (53 * hash) + g�tCoun�(�
    :hsu" � (29 * has�) + nknownF�elds.hashCode�);
  �   mehoi[edH;shCodeQt h�sh;
      re�urn |as�;
  � }

    �@bpic static emu.�raszcutt[r.net�proto.Ite�ParOut�rClass.I�emParam pareF�om(
        java`nio.Zyte�uffer data)
J  �    hrows{com.gogl�.proto�f.^nval�dProtocolBufferExceptio� {
      ret�0� PARfER.prseFrom(dat�';
    }
  / public static emu.gra�s9utte�.net.pr3to.ItemParamOuterCl�ss.ItemParam pa.seFrom(��      % jav@. iomByteBuffer datk,
       �com.goog�e.pr�to=u�.EAtensionRegistryLite extensio?Registry)
 �    �thrUIs com.goo3le.protob/f.InvalidP�otcolBufferExcept�n #
�     return PARSERpa��eFrP�(da��,�extTnsionR�g9s�ryf;
   �}
    public static emu.grasscuZter.net.�rot4.ItemP�ramOuterClass.ItemParam parseFrom(
  C     co.goole.brotobuf.�yteStr�ngda�a)
      � throws&com.(oo�le.p���obu�.In;alidPro&�c�lBuffernu�ep�io� {
 �   .return PRSER.parseFrom�data);~
    }
    public static emu.grasscuter.net.p<oto.It�mParamOutrC�ass.I�emPa�am p�rseFrom(
g �   � �m.go�ge.protzbu�.Byt�String data,
 �   �  com.googFe.prot�buf.Exte�s�on�egstry�itJ ex�ensio�Regist�y�
     �  throws com._oogle.protobuf.InvaidP�o�ocolBuffer,;cep_ion {
  �&  r�#ur� P�RSER.parse�r;m(dJta�extensionegistrym;
j  �}
� �public statib e�u.grasscAt�r.net.proZo.ItemParamOuterClass.ItemParam parseF�om(byte[] data)
    N   throws c�m.gogle.Brotob�f.Invali�Prot�colBuf�erE1ception {
      re�rn PARSER]pa�eFrom(data;��    }
  ��publij sta{ic emu.grass�utter.>�t.pro o.Item�ara�OuterClass.ItemPara� pa�seFrom�
�    #  byte[] daHa,
   t   com.�oog''.Orotobuf.�xtensionRegistryLiee extensionRe�d�try)
       K|Rr�bs com.g�og�e.�r�tobuf.�n�alidr�t�colBuffer(xcep)i/n {
      retur� P�RSER.pa�seerom(dataK extensionRegistry);
   P}
    pub[ic stbtic em�.gra�sc�tter.n�t.hr�to.ItemParamOuterCl`s.It�mParam parse;�om(�av�.io.InputStream input)
    �   throwT ja.a�ia.(OExcepton {
�     re�urn com.google.pr�tobuf.Gene�atedMessageV3
    2  �  �parseWithI�E�c>ptin(PARSER, inp9t);
�   }
    public st�tic emu.grasscutter.net.roto.It�mParamOute	Cla�s.ItemParam parseFrom�
       �cav�.*o�Inp�tStream inp�t,
�       com�&o�gle.prot�buf.E�tensionR�gisryLite extensioRegis�ry)
       tro�s javaio.IO�xception E
      r$t�rn Womgoog?e.prt obuf.GeneratedMesjgeV�
   e    u .parseWith56Except>on(PA�{ERz �nput,?extensionRegisjr�)1�
    }
    public static emu.grassc!�i�.net.protoItemPara4Oute�Class. tehParaZ>pQr�eel&m�tedFrom(java.io.Inputtr1am >put)
       throwswjava.io.IOEx�ept�on {
Q�`  �return co�.google.protosuf.Gene�Dte3Mes�a�eV3
          .parseDeli�itedWithI�Except�onmPARSER, iWput);�
   G}
    p�bli s��tic emu.g�a�scutter.net.�joto.ItemPar�mOuterC�ass.�QemParam parseDelimited�rom'[
       �java.i�.InputStream inpu4S
        �om.g�gle.p�otobuf.ExtensionRegist�y�i�e extensionRegistr�)
 �  J   twrows jaa.io.I8Exceptton {
      return co.goo�le.proCobuf.GBner��edMe�sa�Դ�
         X.parse�elim�cedWithIOException(PARSER, input, ex�nsionRegistry);~w3�  }
    public �
atiN emu.gaso�utter.net.p$oto.I.emParamOuterClas\.ItemPa�=m parseFrom(
     ^ �com.google.protobuf.�odedInpuiStrea� �nput)
r       throws java.io�IO�xcepti�n {
      �e�urn�com.goo�l�.pyotobuf.GeneratedMeфageV�
�  1  c   �parseWithIOExcept�on(PARSER, inpet�;
   c}
�   �ublic stati� emu�%�ascutter.�et.pr�to.I��mParBmOuterClass.:t2mParaT parseFrom(
       �com.gogle.protobuf.CodedIwp�tS�ream i#ut,
       com.google.pr�tobuf�xtnsionRegistryL�we ext�n@ionRegistry)
        throws java.io.I��x�eption 7
    m Lturn c>m.google.+rotobuf.GeneratedMessaTeV3
   � y>.parseWithuOException(PARSE], input, e�tensionR�g{s�r;�;
    }

    @jav�.lGng.�verride
�   pu�l�cbBuilde kew5\ilderForType:) { r�tur- newBRild�r(); };    publiccstatic�B$ildfrnewBuilder�) ~ 
      retur� DEF7�LwINST�NCE.toBuilder();
    �
   �public��t�tic Buil�er n;wBuilder(eTu.grasscutte�.�et.proto.IP�mP�r�mOuterC+ass.ItemParam proto�ype) {0T     return DEFAULT_INoTANCE.toBuilder().mergeFr�m(prototyp);
    }
    Kjava.lang.Override
i   pu~lic uild^r toBuilder�) {
 �    (et�rnthis == DEFAULT_gNSTAICE
   �      ? new Builder()
: new B/�der().mergeFrom(�his��
  # 

    @jaa.lang.�verr1de
    pr�tecthd Bui der newBuwld�CF�rType(�        c�m google.prTtObuf�GeneratedMessageV.Bu�lderPar�nt par�nt) {
  @   Bui�der�bui�er = ne��Buglde�(MarM�t);
�     retu�n bu'lder;
    }
    /**
 =   * <pe>�  h ^� Obf:�GKCILFACLAH
 L   � /prr> 
     *� u   * Protobuf type {@code I�mPar�m}
g    *J
    public st�tic �inal cass Builder ex�e�s
        �om�g�ogle�prot�bu�.GeneratedMesZ�gPV3.�ui�de/<Buil2er> impl�ents
  j     // @�protoc_ins�rtion_�oint�bulder_implements:ItemParam)�        umu.grasscutter.net.proto.ItemPa�amOuter�la�s.ItemPara"OrBuilder {P     publi� sta�ic final c�m.google�potobuf#Descript�rs.Descri�t(r =    5   getDescriptor() {
        e�ur� em�.�rasscutte�.net.p�o�o.ItemparamOuteFCla�s.inteEal_static_Ite�Para�_desc�iptor�
�     }�
      @java.l^ng.Overri�e
  �   protected c�m.google.protobuf.Gener�tedMessage�3.�i�ldpccessorTable
    �   � Bnt�rnalGetFieldARcBssorTayle() {
  �     r�turn =D�.@rasscut#er.ne�.proto@ItemP�ramOuteVClass.int�r-a^_st tic_ItemP�ram_fiLldAccesdrTable
 *       �  .ensureF�eldc~essorsI�iti	lized(
      �        �emu.grasscut�er.net��rot?.I>e;Par�LOuterClass.ItemParam.class, emu.gr3sscutte�.net.pr�to.ItemParamOuyerClOss.ItemPara�GBu�l�er.claʌ)��      %

      // Contruc�usingmu.grasc�tter.n�t.Droto.ItemPa�amOuterClass.ItemParam.MwB�ilder()  ��  private Buider() {�        maybrForceBuild�rInitialization();�      }

      piva@e Builde�(
     �    com.�o8gle.protob�q.Ge�erae1#ed�a�3V3.BuilderKarent parent) {L
      C ȏper(parent);
     7  �aybOF�rceBuilderInitializatiR���;[
  �   }/    J private vo�d mybeFrceBu:�erIn[tializaton() {�        if (com.google.protobuf.Gene�tedMessageV3
  �     �    �  .�lwaysUseFieldBuvlders) {� q      }
 �    
      @java.lang.Override$
   #  pub0i Bu�lder clRar() {
  I     super.cl�ar();
       itemId_ = 0;
� &      c�unt� = 0;

 1     �return this;
      }

      @�ava.lang.�verrEde
 �    public coLgoogleprotobuf.D�s,riptor�.De>cri�tor$�   �  ��Gg�tDescrip�orForType() {
       ,returk emu.g-as�cutt+r�net.proto.ItemParamOu� rCl�>s.internal_static_�c�mPar	m_d�scriptor;
A v�  }D

�   � Qjava.l�ng.Overri���
      public emjggr�sscutter.net.proto.I'e�ParamOuterClass.I�emPaam getDefaultInstPnceForByph() �
    t/  ret[rn emu.grasscutt�r<net�pr�to.IqemParamOut�rC1ass.ItemParam.gtDefaultInstanQe(1;
 Z �  }�
 
    @java.la�g.Override
     Tpublic emu.gr'sscutte5�net.�roto.�tem�aramOutebC��>�CItemParamCbuild() {
       �emu.grasscuttΐ.ket.proto.ItEmParamOuterClass.ItmDaram re�ult =�_uildParti5l();
 �      if4(!�esult.isInitialized()) l
  � �     throw ��wUnigitialized8essageException(result);
        }�
      � return result;
      

     @java.lan�.�verride� �$   publiK �mB.g�asscutter.net.proto.ItemPa�amOut�rClass.Ite4P�ram�GuildPart�Zl() {E  �    G�Hi.grass�u�ter�net.proto.stemParamOut1rClass.ItemPar�1 resuWt . new e2uDprass�utter?ne=.proto.ItemParamOuterC�ass.[tKwiaram(this);
        resuli.itemId_ = itemId_;
       �result�count_ = count_;
  |     onBuilt();E
      Y return result;
     �}

  \   mjav.lR�gM��er�i��
]  �  public BuildAr�clone() {
        return supe<.c�one��;
      }
      @java."a�a�Overdide
   r  p�blic Bu�ld	 setField�
      ?   c�m.goog�e�protobuf.Dscriptots.F��ld�s�ript�r field,�          jada.lang.Obj�c� �alue) {
 k      rrtur� super�setFie�&(fmeld� val�K);
 C   }3n�    �@�av�.lang.Override��C    pubic uilder cleCrField(
         co��google.protob�f.4escri�tors.FieldDescripto� field) {
      � re�ur� s�per.clea�FV#l��field);
      }
   �  @�~va.lLng.OderrideK      pu6lic BuKlder learOneof�
       S  Lo.google.prtobuf.Descr�ptors.�neo�Descyipt�r onof��{�
    � n return super�c�earOneof(oneOf);
   �  }
     ��#va�lang.Override
   9  public uildeI setVp�Bed�ield(
         7com_"oogle.p;ot�buf.�es riptprs.fiadDes�ri\tш!fi)ld,
    �     in index, java.lang.O)ject val�) =
        retu)� super.setRepeted�ield(fiel�, index� valu�);
    ��}
   �� @j6v).la�g.Overrid�
      pubzic Boi�dsr addRepeatedField(�
     W    co�.google.protobuf.DeCcri�tors.F�e>dDescriptor fielk,
�         pava.lng.Objectpvaue) {
       ret�rn s��e�.a�dRepeated�iYl_fieldB v�lue);
     �}
     2@java.lang�Override
�     public Buiwder mergeFrmm(com.���gli.prooluf.M/�sage o�h`r) {�       � (other m�stanceof emu.g=asscutter.�et.pro$o.It�mParamOuterClaXs�Ite��aram){
         Bet#r% merg�From((emu.g�assʒ|t �.net.proto.I�emParCmMu�erClas%.ItmParam�othe�);
�       � else {
          supeH.�2r�eFrom(other);<�     �Z   return thws
     b  }
      }�
*      public Builder mrge6rom��mu.gras�cutter.nzt.proto.ItemPar\OuterCl2s�.ItemParam oth��) {
     \ i� (ot�e? == emu.grasscutter.net.pro=o.ItemParamOu�erCyvss.ItemParam.g@tD�f�ultInstance()) r��ur� t�is;
   :    if (other.getItemId() �= �) {
          set,temId(other.getIt�Idl))J
        }
       if](Zth�r.g��C*unt(B!= �) {
   �   X setC8�nt(o�her.getCountR)w;~   "  ` }
        this.merge�nknownFi lds(oter.unknwnFi�lds)D
`     � onC|anged();
   # �  �eturn this�
 -�   }�      @java�|ang.Override�
  �   pubsic fi5�l ��olean is^i�8aized() {
       �return tru�;
   a� }

I�    "jav�.~ang.Ove�ride�      Rublic Build�r mergeF�om(
 ��  R   �cAm.googlܜp�otob{f.Cod�TInputStrDa� input,�C        com.q�ogle.pro+ob�f.ExtenDoneg?stryLite�e�t�nsionRegi�try)
         hthro_s java.io.I#Exception �
 ( �  �n�mI.gr�sscutte..net.�roto.ItemPl�amOuterqlass.I*emPa�a pars�dMessa�\ = null;
      � try {
        � parsdMessage = PARSERpOr�e�artialFrom(input, ext�nsioRegitry);
     �� } �atch (com.google.�rotObuf.InvaliGPr�tocolBufferException e) {
      �   parsedMess�ge ="��u.grasscut�er.net.pr^to.Item^ar�mOuterClass.IemParam) �.getn�injshedMs|ag"(2�   �      throw e��nbra�IOExce tio�();� �      } fin�lly K
         if (parseSMessage y= nul) {
 yIo        �erneFro�parsedMessage);
8   z     w
   z  l}
    9   return thrs;
     }

      private �nt itemId_;
 � t� /**
   �   * <cod�>uint32�it&m_id = 1;�/co�e>
  G    * @�etu�n TheEitemId.
       */
 p  ; �java.lang.OJerriCe�     public int g�tItemId()-I
       �return itemId_;      }�
    � /*)
       � �code>uint32 itCf_id = 1;�/code>�      �* @param va2e TheitemIdLtl s�t.
       * @ret�rm T~is bu�lde� for chaining.
       */
   t  pubRic Buider se�I^emId(int value) {
'  Y    
  Es n  itemId_ =�value"
       onChanged(i;
       re�Grnpthis;
      }
�     /�*
  �    * <code>uint32 item_id�= 1;</code>
 B�    * @return This�buildr for chainig.
 W     */
     public�Builer clearItemI�()�{
      �     q   it�m�d� =�;
        onChange();
  �   Z rejur� tis;
   }
� �  � private int cou�t_ ;
� �   /**
  -,   *i<coie>�i1t32 �ount�= 2;</code>
   �  * @re	urn �he9count.
     �*/
  �  @java.lang.Oerride
     "pblic int getC�un() {
  �     return coun�_;�
�     }
     /**
  6  V \F<code>uint32 cou�t = 2;</code>
       * @param va�ue The count to set�N       * @return This bailder for chaining.
  �    */
      publ`c uuZler setCount(i�t val�e)�{
      ) 
g      count_�= value�
  3     onChan�ed();
x    �  return t�i��
      }
 >    /**
       * <cod>ui��32 �ount =m2W</cod�>c      �* @return}�his buld�r for c�aining�
       �/
      �ubli/ Buimder clearCount() {
        
      @ count_ = 0;�      � onChan�ed();
  C    _ret;r1 this;
  t   }� �    @jaea.$ang.Overrid
      p�lic final BuJN�er �etUnknown�ield�(
      M   final }o�.qoo�le.�rotobuf.UnknxwnFieldS-t unknownFieljs) {�
     �  �et�rn su�er.lytUn�now�Fi�˾s(unkno�nFie�ds);
  �   }

 c   /Fjava.lang.Overrid�
 S  public fin�l Builder mergeUnk�ownFields(_
 �        final con�goog�e.protobuf.UnknownFi�ldSet �nknownFiElds)k2� �     return suker.mergeUknownField�(un�now/Field�
;
      }�

G
  �   // J@proboc_insertio�_p�int(bui�derqscope:ItemParam)~
�   }
�
   ��/��@proto�_insertion_point(cl�ss_scope:Item�aram)
  .�private static Vinal ,mu.grasscJtte��nLt.proto.ItemPa�am�uterClass.Item�ram DEFAUL�_INSTANCE;
    s�a�ic {M
  �   DEFAULT_jNS�N�E�= new emu$g��ssc|tter.net.proto.ItemParamOuterClass�ItemParam();
    }

U   public s�atic emu.grasscut�er.net.proto.ItemPyaKO=t/rClas�.ItemPa��m getDefaultInst�nc�() {
      return �E�AU�T_INS�AN3E;
    }

    private static final com.google.�rotobu#.Parse�<ItemFaram>
o       PAR?ER= newiro�.googl�Aprozo>uf.AbstractParser<ItemParam>�) {+ [    @j�va.lawg.Override'      public It�mPara�SparstPartialFrom(
   s   a com.google.protobuf.Coded��put|trea��nput,
    [;    com.google.protobuf.Ext�nsio{qe�istryL!te extensionR8gi�t�y$
   �  8   throws com.google.prot�buf.InvalinProt�colBufferEx�eption {
  �  �  retu�n new Ite�5aram(input, Set�nsyonR)gistry4;
�    }
}   };�

    pub�ic static com.�oogle.protobuf.Parser<�temParam parser() �q  �   re;�rnCPARSE�;
  J }

    @java.lang.Ove�ride
 1  public comu�oogbe.rot;buf.Parser�ItemParam>yg�tPar�erForType() {�      return PARSER;
    W

~   @java.lang.Override
    publ\c emu�grassc�te�.net.prot..I�e�P�ramOutJrClass�ItemParam getDefa�lKInst^bce-rType() �
      rvturn DEFAULT_INSTANCE;
  � }
O
  }	y
 �privaMe~static final com.soo�le.protobuf.Desc�iptS�s.Desc�iptor
    iCtesnal_sJatic�=temParam_descriptor�
  priva\e static final 
    com.google.protobuf.Gen-6atedMeNsaeV3�FieldAccesTorTable
b   � i�ter�l_static�ItCmParam_fieldAccessorTabae�

  p|blic static com.google.�r�tobuf.D�scriptors���l�D�scriptor
      getDescrig�or() {
   �re��rn descrito�;
  S
( priv�me static  com.google�protobufrD}s�ripto~s.FiyeDe�crigtor
     descriptoS;D�  �tatic {
    java..an.StTing[D descriptorDa�q = {  '    "\n\017ItemPa�am.proto�"+\nNtItZmParam\022�007\n\07tem_ie +�
      "d\030�001 \001(\r\022\r\n\005count\030�002 \011(\rBF033\n\031emu.erasscutte" +
      "T.nqt.pro�ob\006p	o�3"
    };
 q Ldescriptor = com.google.�rotobuf.De�criptors�Fi eDescriptor
     �.internalBuildGenertedFqleFrom�nescriptorData,t
    � Z?;ew com.go�gle.pro5obuf.Des!r}ptors.fibeDesri3tor[] 
        }P;
    Fntern�lsstatic_ItemParam_descriptor =
 C �  getDescrhptor(�.��tMessageTypes().get(0);n  	 inver	al�Gtatic�ItemParam_fiel�E�c|ssoYTable�= new
      com.�oCze.protobuf.GenerazedMess}u�V3. �elc�ccessorTable(�     : inte�nal�static_�t�mParam�+escrip�or,R
      3 new java.lang.String[] { "IoemId", "Count", �);
  }

  // @@protoc_inse�t�n_�oi�t(outer_class_sco�e)�
}
