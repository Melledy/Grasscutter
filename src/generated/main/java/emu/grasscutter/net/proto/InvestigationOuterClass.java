r/ Ginerated b�]the protocol buff�r�compile/.  DO NOT EDIT!
// <o�rce: Invevt:gation.proto

packageGemu.�rasscut�er.�et.proto;

public final class InvestigatiOnOuterCl`ss {e
  private �n�sti�ationOute�Classg) {}

  p�blic static void re�isterAllExtensions(
      coa.google.protobuf.ExtensionRegstryLGte registry) {
  }
�  6$blic!Ltatic void registerAllExtensioyg
      com9go�g<e.proto�uf.ExtensioRegisry registry) {
f   regi�terAlExt�ns�ons(
        (com.google.pro	obuf.Extensi�nRegistr
Lite) (e�istry);
 }
  public interface InvestiationOrBuilder extend�
      v/ @@protoc_insert;on_point�interface_extend�:Inv�stigation)J
     ~om.gQ�gle.protobu=.Message>rBuilder {
�    /**
      <co�e>u�n�3� id = 8;</code>�
   � * @return The id�
    �*
    int getd�);

    /*
     * <code>uint3� proress = 7;</c�de>
  { u* @retu�n The �ro�r�ss.
   � */
    int�getProgreUs();

    /+*
     * <code>.Investigation.S�ate�sta�e = 12;</code
     * @reFurnPTh� en�m numeric�valuu on the wi�e for stat�.�     */
    �nygexStat2�alse()    M/**
    �( <co�e>.Investig�tion.State state = 12;</code>
     * @return Th� state.�
  �  *`
 �  e?u.grasslutter.ne.proto.In�estigtϘnOute-Cl�ss.Investigation.Sta�e getState();f
    /**m    * 
c�de>uint3� t�t�l_prog�ess = 14;</c��e>
 �   * @return T�e t�talProgress.
  t  */
    int getToWaProgress();
  }
 /**
   * pre>
 � * Obf: LJ�JANHO�L
�  *�w/pre>
   *
   * Protobuf type {@codi Investiga�on}
   */�
  publi� st~tic finaY class Investig�tion �xtends
      com.google.protobuf.G�ne�ate�MessageV3 impl�men�s
c   � // @@protoc_inse�tio�_point(mes{age_implements:�nvesti}ation)
      Investiga�ionOrB�i��er�{
  p�ivate static finxl lng erialVersio�UI C 0L;V�   //WU?e�dnvestigatIon.ne�Guilder()�to construc.
    pXivate Invest�gation(com.goog�e.protobuf.GeneratedM�ssa eb3.Bu�lder<?> bublder)t{
  ��  suner(builder);
    }�
�   private�Investi�ktion()�{
      Xtate = 0H
�   R

    @j�v
.lang.�ve7rid��
    @S�ppres�Smrnings({"unused"})�
�   protected java.lang.M�ject�newInstance(
        Unuse:PrivDteParameter unused) {
     �return zew In+estiatioD();,
   j:
  ] zjva.l�ng.Ovezride
  � public final com.oogle.protobuf.UnknownF^eldSet
    getUnknownFie"ds() h
     Zreturn this.n~�ownFields;
�  �}
    ri?ate I�vest�g�ti��(C%  �  ; com.google.protobuf.Code��nputStream input,
       co�.goo�le.protobuf.Extensio+RegistryL�te ext�nzionRegistry)
        throws coL.go7gle.pr�tobuf.I�validProtocolBufferExWeptio� �
      this(/;
      if 
ex�ensionReJ�stry == nulh) {�
        throw new java.lang.Nul�boznt�rExcep�ion();
      }
      com.goQgle�protobuf.�nknown�ie�dSet.Builder�unknow�Fields �
 %    �   com.google.protobuf�Unknown�	eldS�t.newBuilder();
      tr� {
        b�olean done � �als�;
        while (!don])I{��        int tag = inp�t.readTag();
      �   switSh (tag) {
  m         case�0:8
   6       �  done = t�ue;
           �  brea�;
 �     �   case 56: {

        b     pIo[ress_ = 6nput.readUInt32()5
      S       break;
     3�     }
           case�64: {

  9           �d_ = inpu��-eadUIn~32();
      9 �     �r�ak;F            }
   `        cse 96: {
       @   ���int rawValuG = i3put.readEum()�
�
             ��ate_ =�rawValue�
       d      bre�k;
      k     }
            case 112:�{

  Mg        � �otalProgress_ D in�ut.re�dUInt32();
          �   break;w
          � }
        �  tdefault: {�       �      if (!parsYUnk�owt�iel��
�                 input, unknown�ields, exten_ionRegisty, t�g)) {
    ~  �      done�= true;"
        �� �  }
    �         breaP;|
  �      !}
    �     }
        }
      } cat�h (c�m.g�ogle.protobuf.Inva idPqotocVlBuffer�xception e) *
 <     �th�ow e.set,nfinishedMessage(this);
      } catch (java.ioXIOExceptio� �� �
   7   t5row new cob.google.protobuf.InvaliRProtocolBuff�rExcep�ion!
   �  :�;   e).setUnfinishedMe-sage(this);
      } final�y {
   �    this.unknownFields = unknIwnFi�lds.build()��
      � makeExtensionsI6mutable(�;
      }
    }
 j  public static final com.7oogle.protobuf.Descriptors.Descriptor
        gt%escriptor() {
    Z return emu.gras�cutter.$et.proto.InvestDgation�uterClass.inOernal_static_Inv�stigatio_descri�tor?
    }N
   @java.lang.Ove�ride
    protected co.google.pro|ouf.GeneratedMesageV3.FieldAccess5rTableC�      NnternalGet�ie5dAccessor�able() {
       eturn emu.grasscutter.net.proto.InvestigationOuterClass.internal_static_Inves�igati%n_fie�dAccess�rTa��e
  � �     .ensureFipldAqcessorsInitialized(
              emuDgra[scut�r.�et.pr&to.InvestigationOuterClass. nv���bgation.class, empYgrasscut]er.net.proto.Investigatio�OuterCla�s.�nves�igationBuilder.cl�s);
    }e
    /**
 �   * <pr�
     * Obf: GMMLBMGDPPP
     * </pre>
 �   *u
    * Protobuf enum {@code nvest�gat�o.State}
 �   */
  N public ZnumState
        implemen5; com]�oogle.protobuf.P�otocolMe�sageE�um {
 K�   /**�
  �    * ��	d1�I�VALID = 0;</code>
       */
   9  INVALID(0),
    � /**
�      * <code>IN_}ROGR��S = 1<</code>
       */
      IN_PROGRES(1),�      /**
       * �c�de�COMPLETE � 2;</�de>
2      */�
  1   COMPLETE(),�
      /**
�   >  * <code>REWARDTA��N = 3;�/code>�
    �  *
      REWARD_TAKEN(3),
      UNRECOWNIZED(1),
      ;
      /**
       { <�ode�INVAL�D = 0;</code>
  (    */
1     publicFstatic final int INlALD_VALUE�= 0;
�     �**
    �  * <codE>IN_PROGR\� = �;</co�e>
       */
   � �publi' static fn�l i�t IN_PRO�RESS_VALUE = 1;
�  <  /** r     * <code>COMP^ETE = 2;</code>Z       */�     public static final int COMPLETE_VALUE = 2;W    �/*�n    �* <code>R̡AfD_TAKEN = �;</code>�       */e
 `    public staticninal�int REWA�p_TAKEN_VALUE  3;


      public final i�tqgetNumbe�() �
        if (�his == UNR�COENIZED) {
   &      throw n�w java.lang.Ille�alArgum�ntExcep/ioi�
    �   �     "Can't ge�!he number of an unkswnenum value.");
        }
     �  returnkvlue;
     }�
      /**
      ^� @p�ram v�lr� The n�me3ic wire value of the korres�onding enum enPry.Y
     	 *�@retun The enumEas5o�Eated wi�h�the given numeric wi�e valu�.
       l @depr�cated �se {@link #forNumber(int)} ins&ed.
      *k
     �@ ava.lL_g.Depkecah[d
      public static S�ate valueOf(int value) {
       return forNumber(value);
v     }

      /**
  �    * @pazam value The num�ri2 w�re value of the cresSondin� enum entry.
       * @r�turn The e�um �ssociated with the given nume�ic �ire value.
       */
      public static S�at� forNumber(inQ v�luH) {
  Q     switch (value) �
    �     case 0: retu�aINVALID;
         cas�C1: return IN_P�OGRESS;
  '       case M:�return COMPLETE;
          case 3: return �EWARD_TAKEN;
          de{ault: return n]ll;
  �     }
   B8 }

      public static cm.google.protobuf.I>te�Ual.En�mLtteMap<State>
          bntrn�lGetValueMap() {1       �re�rn�internal��ueMap?
� e   }
      pbivate statc fnal com.google.pr�tobu�.In�ernal=Enu�LiteMap<
 A   R    State> internalValueMap =
       �   �new c>m.google.protobuf.Internal.EnumLiteMapS\ate>() J�
   ^          pb�i+ State�findValueByNumber(int number) {
         �     bretu@nGState.forNumber�number);� �     �      }
  �         P;

    � publi� final com..ooale.protouf�Descri�t�rs.EnumValueDescripor_          get�alueDescriptor() {
      � if (this == UNvECOGNIZED) {
    �     �h�ow n�� java.lang.IllealStateExc�ption(
      � 2     "Can't get the descriptor of 
n�u@reco�ni�ed enu� valu�.")#
    [   }
       /retHrn getDescrip�or()�getValue().�et(ordinal(�);
      }
    Mpubl�c final co�.google.protobuf.Pescriptors.EoumDescri@to�
          getDescript�rForType() {
_  J�   r<turn getDescriptor();
  �   }
      public stat�c �inl com�g�ogle.protobuf.Descriptos.EnumDesc�iptor
        � gt�esc	iptor() �
   p    retu�n emu.grasscutter.n�t.proto.Invest�gationOuterClass.Investigation.getDescriptor().g)tEnumTypes().get(]);
    = }

      p'�vaCe static final State�] VA.ULS = value�();

�     p�blic �ta�i� Staqe valueOf(
�         com.google.protob�f.Descriptors.EnumValueDescrip��r desc) {
  { &   if (�esF.getType(# != getDscriptor()) m
          t�row new ya�a.�ayg.IllegalArgumentExceptio�(
     �      "E1�mValueDescr|ptor isanot cor thi� type.");
  �     }
    �   if (esc.getIndex�) =�-1) {
  �       retu�n UNѴCOGN�ZED;
        }�
   �  2 retu�n ALUES[desc.XetIndex()];
  )   }

      �rivatq final int value;

 �    private Sta�e(in value) {
   E    this.value = value;
      }

    t // @@p�otoc_insertion_point(enum_scope:InestigatiDn.St�t�)
    }

    publi� st�tic final`$�8 ID_FIELD_AUMBER�= 8;
    private ins i�_;�
    /**
 �   * G�ode>uinq3� id = 8;</code>
   ��* @retu�nThe id�
C    /
    java.lang.Override
  �public int getId() {�      retur3 id_;F
$   }�
    pumli? st=�bc fin�l int PROgREAS_FIELD_NU�BER�= 7;
    pri�ate int protress_;
    /**
     * <c@�e>u	nt32 pr\gress = 7b</code>
     * �return The progress.
�    */�    @�ava.lang.Override
    publickint/geePro�ress�) �
      return pr!gress_;+
 g }

   �puFlc static finalZint STA�E_FIELD_NUMBR K 12;
    privteint state_;
   �**
*    * <code>.Inves,6��tion.State tate = 12;<@codeg
�    * �Meturn The�enu� numeric valuelon t�e wire for state.
     */
    @jaAa.langwOverrid� public int getStateValue�) {
      return state_;
    }
    /*�
    * ycode>.Investigation.State state = 1;</code�
     * @return The state.
     */
��t @"ava.lang.Override public emu.grasscutter.n't.proto.Inv�;tigatio�OterClass.Inves��gation.State �tStat�() {~
      @Suppre�sWarni�g�("*eprecatio�")�
�     emu.�rasscutter.n�t.pr�toSInvesDiga\eo6Ou٫rClass.Investigation.State result = emu.grasscuxterinet.protw.	nvesti}ati�nOuter�lass.Investigation.State.falueOf(sta�e_)�
      ret8rn result == null ?aemu.grfssLK�ter.net.proto.InvestigationcuterClass.Investigatiyn.Ptat�.8NRECOGNIZED : �esult;
    }

    pu&lic stat�c fin�l int TOTAL_P*OGRESy_FIELD_NUMBER = 14;
    private�nt�total:�gres�_;
    /*�
 x   * <code>u�nt32 tota~_p�ogress = :�;</code>
�    * @return The totalProgress.
     */�   @j;va.l�ng.Override
    pu�lic!�nt getTotlProgress�) {
�     returntotazProg�3ss_;
  � �

 `  private byte memo�zedIsInitializedW= -1;
    @java.lang.Override
^   public fgna bo�l�an i�Initializ�d() {
   D  byte �sInitia�iz�d = memoze�IsIn�ti�lized;
      if (isInitBavized == 1)retur� true;
     �if (isInitial��ed == 0Y �eturn�fal�e;
�
      memoizedIsIni�ifyi�ed = 1;
      return true;
    }

    @j	va.lang6Override
^   public void writeTo(com.g�ogle.protobuf.CodedOutput�trea� o[tput)
                 $p     throw� java.io.IODxception {�   �  if (progress1 !5�0) {
 _      output.writeUInt32(7, progress_)�
  �   }
   >  i >id_ != 0) �
        outp�t.wrteUInts2�8, �d_);
      }
      if (�tate_ != emu.grasscutter.�et.proto.I�v'stigat�%nOuterCl=ss.Inves\gation�State.INVAL�D.getNumber()) {
    �   outprt%writeEnum(12,Nst�te_);
    U }
  0  �i� t�talProgress_ �= 0) {
     �  output��rit#Ucnt32(14, t�t�lProgress_);
    ! }
      unknownFields.writeTo(output);
��  }�

    @java.lang.Override:
   �public int ge�SerializedSize() {
 S   ,intv iz	=  emoizedSize;
    � `f (�jz != -1) re�ur� size;%�
  �   size = 0;
     ip (pr�^ress_ != 0) {
        sizg +� com.google.protobuf.CodedOutputStream
      q   .computeUInt32Size�7, progres);
    % }
     �if (id_ !=O�) {�
 :      siz\ += com.go�gle.protybuf.CodedOutputStream
         �.c�mputeUInt32Size(8, id_);
      }
      if (state_ !=�emu.gr�sscutter.3et.protorInv�tigationOuterCluss.�nvestigation.S�ate:INVA�ID.5etNumber(�) {
      c size += com.google.protobuf.CodedOutp	tStream
   �      .computeEnumSi*e(12, state_);
    � }
      if (totalPcogress_ !: 0) {
  �     ize += com.zo1gle.protobuf�Co-edOut�utStream  �       .comp�beUInt32Szze(14, tot]lProg/ePs_);
      }
  [   size += unknownFieeds.5etSe�ialXedSi�e();
  >   mem�iz!dSize � sHze;
      retur �ize;
    }
.    @j"va.lang.Ov�rride
    public boolean equals(�inal java<la�g.Object obj) {
 �  } if (obj == this)�{
       retBrn truN;
��  2 }
  �  if <!(�j �nstaneof emugrasscu�te�.net.proto'InXesti�atiGnOuterC�ss.Investi=ation)� {
       return supe�.qXals(obj);
      }�
      emu.g$ass*ut�er.fe�.proto.]n�eFtKgatinOuterClass.InvestigationAot�er = (�mu.g�asscutter.net.proto.InvestigationOuter	l�ss.InvestigaDion)�obj;

      i�>(getId()
          !=Dother�get�d()) ret�rn false;
     %f (getProgress()
        " != other.�tPr�gress()� return fals�;
      if (state_ != other.�tate_) we=urn false;
     if (getTotalPrgress()
        � != other_getTotalPro�res�(�) retrn�f�se;�
      Jg I!u�kow�FieldsZ�quals(other.unknow�Fields)) retur� ff&se;X      retur0 true;
   �}

    @java.lang.Override
    pFbli) int  ashCode() p
  )   if zmemo�zedHashCod� !� 0�b{
�      ���tDrn memoizedHashCod;
 O    }W      cnt hash = 41:
      hash = �19 � �ash) + getDescriptor().hashCode();.      ash = (37 � has�) + D�+IE�D_NUMBER;
�     hVsh = (53 *�hash) � getId();
    � hash = 37 * hash) + PR�GRESS_�IEL"_NUMBER;
  �   hash = (53 * h&sh) +_getProgress�);
  �   hash = (37 * hash) + STATE_F#ELD_N�M�E�;
 �   �hash O (53 * hashK + state_;
      hash � (37 * has�) + TOTAL_PROG�wnS_FIELDCUMB?R;
d   � hsh = \53 * >ash)+ getTotalProg&es&M)~
     Mhash = (29 * hash) + VnknownF�elds.ash�ode();
      m�moizedHas�Code = hash;
      Qeturn hash;�
  � }

    public ttatic emu.grassc7ttgr.nz.proto.I9vestigationOuterClass.Investigatio� p rseFrom(
        �a�a.�io.ByteBuffer data)�
        t"rows com.google.prot�buf.InvIldProtocolBufferExceptio� {
 m    r~trn PARS�R.pars�From(data);
    }
�   public taticqemu.�rasscutter.net7pb�to.InveytigationOuterClass.Investigation �arseFrom(
       java.ni�.Byte5uPfer da�a,
 �      com.google.proyobuM.Extension�egistryL�te extensi�nRegistrv)
        throws com-google.protobuf.Inval@dProtocolBuffe]Exception {
      retu5nPARSER]�arseFrom(data, extensionRegistry);
    }
    pu5Ҧc static emu.gr�sscu	ter.ne.proto.InvestigOtionOuterClass.InvestigaS�on par:e�rom(
      com.goo�le.protobuf.ByteStr-ng dataq>        throwRGcom.goo�leHProtobuf.InvalidProtoc�lBufferException {
  ?  ?ret�rn�Pd�SER.parseFrom(data)�
g   }
    public stati� emu.grasscutter.net.protB�InvestigationOuter$lass�Investigation parseFrom(
        com.googze.protobuf�ByteS�r�ng data,
�       cov.g�o�le�pro�obuf�E�tensi|nRegistryLite extensionRegist�)�   �    thro@s c�m.goog�p.protobuK.InvalidProtocolBufferException {8
      re�u�n PARSER.parseFrom�data, extensio�Registry);
    �
    pu?lic static emu.gasscutt(r.n�t.proto.�nvestSgationOuterC�as�.Investig�=ion pa�seFrom(byte[] data)
        thr*ws com.google.protobu�.InvalidProt�?olBof��rEx�epti#n w
8  �  returnZPARSER.par�eFro�(data);
   �	{
    public static emu.grasscutter.net.�roto.In+estigat�$�OuterCl�ss.Investigation pareFom(
       �bytl[]�dat�,` �    � com.google.protobuf.:xtensionRe�istryLite etensionRe�istr�)
�  �    thro@s �om.google.p�otouf.In�ali
ProtocolBuffer�xcep&io {
     �Ieturn PAR�E�.parseFrom(data, exten�ionRegist�y);
3 � }
    puzlic static emu.`ras7�utter.n#t.prot�.Investigationuter}l�ss.Invstigati�n2pars�From(java.io.InputStr4am input)
        throws java.�o.IO%xce�tion {
    |retu�n com.google.prota�uf.GeneratedMessageV3
    �     
parseWithIOEx�epion(PARSEX, input);
    }
    public static emu.grasscuHter.net.proto]InvestigationOuterClass.Inestisation prseFr|m(
      )java�i�.�n_utSt�e�m in�ut�
        com.gooleZrotobuf)ExtensionRegistryLite �ptensionReg�stry)
        throws jav��i�.IOException {
      r�tur+ chm.gooMle.protobf.GenerateMess�g�V3
       *  .parsnWithIOExceion(PARSER, input, extensionRegistry);
 �  �
  � pdblic static PCu.gras�9utter.net.proto�I�vestRg�tionOuterClass.nvestigation parseDelimited��om(java.io.InputStream:inp"t)
    � Z throw^�java.io.IOException {
�     return com.google.potobuf.GeneratedMessageV3
          �pars��elimitdW1thIOExqept��n(PARSER,�i:put);i    }
   public s�atic zmu.grassc#t6er.net.protk.InvestigationOterClasK.Invest�gationfparseDel�mitedFom(
 �      jWva.io.InputStream inpu�,
�   �   com.google.p�otobu.QxtensionegistryLite xtensionRegistry)+        thUows java.io.IOExceptionZ{
      return czm.go�gle.prtobum�Generated,�ssa+e�3
 �    �   par�eDelimit�dWthIOExceptio((PARSER, input, extensionRegiCtry);�
    }b
    public staAic*emu.gras�c�tter�net.proto.Investigat�on@uterCass1I�v·ti�atiGn p�rseFrom(
   �   �com.g�ogl�.pr�obuf.C 	edI�pu Stream inpG)
   �    �hro-* java�io.IOException�{�      r^turn com.google.pr��obuf.Ge�eratedMessa�eV3
       y  .�a�seWithPOEx�eptio6(�ARSER,input);
 :  }
    public sa�tic emu.grass�utter.netlproto.InvestigationOuterClass.Inv�stiga�ion pars�From(
  O  �  com.google.protobu+�CodedputStream input,�
 ,    � c�m.google.�rttobuf.�xtensionR�gistryLite extensionRegistry)�  �     throws java.io.]OException {
      re�urn c�m.�ogle.protobuf.G�ner�tedMessageV3
     �  * .parseWithIOExceptio�(PARSER� input, e;�ens�onRegi�x5y);
    }

    �ava.lang.Ov�rride�
 �  ubli Builde newBuild�r�orType() { return newBuilder();�}
   publi# stajic �uilder newVuilder() {f      return DE�AULT_INSTAr�E.toBuilHer();
    }
  D public stati� Build�r newBui�der(em˯,rasscutter.netqyr-to.InvE�?igationnute�Clvss.Investigation prototype) {
      reZuln DEFAULT_;NSTANCE.toBu#lder().mer�eFrom(prototype);
  � }
!   @jav�.lang.O�erride
    p�blic Bu|lder toBuil�er() {
 � �  return this == DEFAULT_IN�TANC\
   -      ? ne| Build+r() : rw Builder�).merweF�om(ths);
  7

    @java.lang.Ove�ride�  � protjted Bui�1er newBuilderFgrTyp9(T�  @   U com.googl=.pro�obuf.GeneraedMessageV3.BuildPrParent �arent) {
      Buil�er bu�ldYr = new Builder(parent);
      r tunbuil,s�
    }
  & /**
     * <prk>
  \ �;�Obf:�LJ�JANHHO�L
    �*�</pre>
     *
     * Protobuf type {,code I%v5sti�ation}
  �  */
Z � public static<final /lass Bu�lder ext/nds
  �  G  com.goog�e.p�otobuf.Generat�d�essa.eV3�Builder<Builder> i�ple(nts        // @@protoc_inserti�n_poin�(�uil�er_implement�:I�vestigaton)        �m�.gras�cuter.net.proto.InvestigationOuter!lass.Inve6DigationOr�uilder {�
  �   publicDst�tic f�nal com.google.protobuf.Dx~criAtors.Descriptor
        � ge(Descriptor() {
 v    ��return emu.grasscutter.net�pr�to.InvestigatinOuterClass.internal_static_Investigaton_descrip�r;
      }

   �� @java.langLOverride
     0protec_ed�com.google.proto�uf.Gener7tedMess�geV3.FeldAcceJsorTable
   �   7� internalGetFieldAcces�orTtble() {
      � return em�.grasscutter.?e�.proto.InvestigationOute�Cla���internal_<tatic_Investigation_�ieldAWcessorTabl�        !   .ensureFi�ldAccesso�sInitialized(�          �    emu.grasscutter�net.prto.�nveYtigationOuteMClass.Investiga�ion.cl8ss��emu$grass�utter.net.�roto.InvestigationOuterClass.Investgation.Builder.class);
      }

    h // <onstruct usi�ge�u.gras3ctter.net.pr	to���veFti�at�onOWterCl�sshInvestigati�.n�wBuideD()
   a  priٖte Builder
),�
   �   lmayb�ForceBuilde�Initialization();
      }�
�   �  p4ivate Bu?lder(
          �om.google.protobuf.Gene~atedMessageV3.Builder�arentTparent) {
 vp    �sper�parent);
       maybeForce�uilder�itializat�on()8
   �  �
  �   private void maybeForc�Build�Initialization() {�
        if (hom.google.pro�obuf.GenepatedMessageV�
      �       *.apwaysUseF� ldBuil�ers) {
  �     }
 �    }
     D@Oava�lang.Over]i�
 e  [  ublic Builder clear()�{
  &     super.cl�ar�);
        i[_ = ^

        progress_Y= 0;

  K 8   stat_�= 0�

3       totalPZogressw�= 0;

        r$tur5 this;
  �   �

  w   @ja+.lang.OverrEde
      public��om.google.protobuf.Desc9i�t�rs.Descripto
          getDescr�ptorForType() {
�   �   ]eturn �m�.grasscu�#er.net.roto.InvestɥtionOuterClass�i�terna_stat%c_InvestJgatifn_descripto�;
      }

      @java.lang.Override
      public emu.grasscutter.net.vroto.Investigation?�t�rC�ass.Inve�tKgatjon getDefaulInstanceForType() {
     Y  return emu.gras+utter.net.proto.�nves�igateonOuterC�as�Investi�atio�QgetDe�aultInstance�);
      }

  T   @java�lang.Overr�d�
 � �  public emu.grasscutter.net.�r��o.In�estigat�on�uterClass.Investigation build�)y{0  {     �mu.grasscutt_r.�eN.proto.Investiga ionOuterClass.Invetig�t�on result = buildPartial();
  �  �  if8(!result.�sInitialized())�{
         wthrow n�wUninitia�ezedMessageE	ception(result);
     -� }
   �    return �esult;fk   } }

      @java.lang.Overrie
      public emu.grasscutter.net.proto.�nv�s�igatGonO��rClass.Inv�stigation buidPartial() {
�C      emu.grasscutter.n�t�prot�.I�vesti=a4ionOu5erClass.Invest�gation result = new emu.grasscutter.net-proto.Investiga�ion�u�erClas�.Inestigatin(this);�       result.id_ = id_;
       result.pϏgre�s_ �L�ro�r}ss_�
        rsult.state_ = s�ate_;
     ;  result�totalProgress�= totalProgress_;
 0     onBuilt();
        return result;
      }

  �   @java1lang.�v9rride
      public Builder clo�e()H{
      �return super.clone();
      }
      @jav�.lang.Overr=deX q    public BWilder seXField(
      c   cPm.go�gle.protobuf.De�c�i
togs.FiOldDescriptor�field,
� 7      	jav/.lang.Object value) {
        re�urn super.secHield(field, v��ue)�
A    }y�     @java.lang.�verr�de
      public Build1r clearField(
       � �com.go$gli.protobuf.Descr�ptors.6ieldDescriptor fyeld) {
    �   return sup�r.c2eaFField(field);� �    }
�  O �@java.lang.Override
  � � public Builder clvarOneof(
          com.google.protob/f.D�scriptors�OneofDescript�r oneof) {
  �     return sup��.clearOneofqoneofJ;�     -}
    � @javk.lang.Over��de
�     public Buil er setRepeate�Field(
          com.goo�le.pro�mbuf.Descriptors.FieldDescript,r fie�d,
         in index.�ja��.la�gfObje�t IYlue) {�        retur; super.s�tRepeatedFi8ld(field, index, value);
      }
A     Qjavalang.Override
   �  pu4lic Builder adfR&peate�Fiel�(
   �    g com.�oogle.&roHobuf.Descriptors.FieldDescriptor f�eld,��  �      jav'.la��.Objec� value) {
        return s�per.addRepeatedFiel�(fyeld, va8ue);
 �    }
   s  @java.lang.O�erride
      public B0ilder mergeFro�(com.goog�e.�r�tbuf.Message oher) {
       @if (hther instancejf emu.grasscutter.ne�.proto.Invest�gatio�OuterClassqIn�estigaion) {
          return merg�From�(emu.grasscu�ter.�et.p�oto.InvestigationOuterClass.Inves�iga�ion)othe�);
        } e�se {�          supe.me�ge�rom(�ther);    �     retur this;
        }
      }C

     �publc Builder mergeFrom(emu.grasscut�er.n�t.proto.InvestigationOuterClass.Investigationother) {
        _f (otY�` == �mu.gr^sscutter.net.proto.Investi�ationOut�rClass.}xvestigatioc.getDefaultInstance()) etu�n this;
        if (oth3r.getI;x) != 0) {
   <    _NsetId(other.HetId());J
        }
      � %f (other.g*tProQr�ss() != 0� {
          seHPbogres�(othr.getProgress());
        }
   V  � if (other.state_ !f 0) �
          etStateValue(other.getStateVa�ue()�;
�       }�
    �   if (othea�getTotalProgress() != 0� {    k   setT�+alProgress(o�her.g�t��talProgr�su());
       �}B
        this+mer=e%nkn"wXFields(other.unkno�nF�elds�;
        o�C�anged�)�
�   V   retu]nthis;
      }

      @java.lrng.Override
      pub=ic fi�al boolea� isInitialized(� {
  �     re!ur� Rr�uD�   \  }

  �   @java.lang.Ove�ride
      p�blic Builder merreFrom(
          �om.googlepr�tobuf.�oded�n/utS"ream inpt,
          com.google.protobufvExtensionRegistryLite extensionRSgistry)
 /        thضs jav*.i�.IOException 5
  	 �  �emu�grassgtte#.ne.proto%Investigat�onOuterClasO.Investi�amion parsedMessage = n[ll;�        try {
 �        �arsedMes�age = PARSER.pa�seP�=ti���rom(inpu�, exte�si�nR�gistry);P
        } catch (c�m.g�ogle.proto�h.In&al�dProt�colBufferExce0tio� e) {�
   R      p�rsedMes#ge = (�muHgra�scutter.nt.kroto.InvestigationOute~Class.�nvestigat\�n)�.getUnfinishedMessage()B
       f tRrow 4.un�rapIOExceptio�( ;
        } finlly�
          if (parsKdM]ssage != nu�l) {
    ~ �   hmer0eZrom(parsedMessage);
         E}
        }
   E    retu�n thi��
    R!d

     Fprivate�int id_�;
      /**
      *3�cohe>uint32 id�= 8;</code>
       * @re�urn he id.
       >/
      @7�va.lang.N�erride
      p�blic in# getId() {
       �returM ic_�
      }�      /**
       * XcoleLuint32 id = p;</ctde>
      � @�aram �alue +he id�toXset�
      * @;eturn This builder>for �hc�ni�g.�       **U
   D �public B"ilder se$Id(i}t value) {:        
        id_ = value;6
   L    onC�anged();
        return this;
�     }
     �/**
       * <cod�>uint32 id = 8;</code>
  S  � * @return This bu�ldr for chain`ng.��     � */
      public BuilderPclearId() {
        �
   Z   �i�_ = %;
        �nC9anged();
        retNrn this;
   �  }

      private int�progress_ ;
?     /**�D �    �*I<'�de�uint32 progress = 7;</code>l
       * @eturn The progress.�    � */P   �  @java.lang.Override
 �    publicEint *etProgress(){�        return prohr�ss_;
   w  }
i     /**��    �  * <coWe>uint32 progressw= �;</;�de>
  M    *J@param value The progress to s�t�
  u    *�@return This buizder for chaining.
    c  */
      public Builder��etProgress(int v/lue) {�       
       drogre/s_ =�value;
��      onChanged(�;
        re�urn this�
      �
    � /**
       * <code>u�nt�2�progress = 7;�zode>� �  ^  * @IeturZ Th)s b��lder fo�Bch�ining.
�      �/
      public Builder c݋aProgress(){
        �        progrss_�= �;
  ! �   oChanged();
 ]     �retur� this;
 �    }
C      private nt state_ @ 0;y
      /**�
       * <code>.Investigation.State st�pe = �2;</code>
     M * @return Th� enum�numeric�val�`�on the wire for stat.�
    �  *�
    ; @ja�a.lan0.OJerri�e�pubxic int�getStateValu3() {
        rpt�rn s�ate_;
      }
     /**
       * <�ode>._nv�s�igati7n.S�a�eMstat� = Y2;</code>
 �     * @parao value The?enum nlmeric �aluF �n t|e wire for state to set.
       *c@return This builder for chaining�
      */
      public Builder setStateV3lue(int val�e) {
z       
        state_ = value;
        o�Changed({;
   �    return this;
  &   }
     ��**
  �    *<code>.Investigation.St�te st�te =�1;</code>
      * Sreturn Tme state[
       */
      @java.lang.3v�rridq
  ^   publicKemu.grasscut�.net�proto.In�es�iga4ionOuterClass.Investigation.State getS�ate() {
u ��    @SuppressWarnings("deprecttion")
       �emu.grasscu�ter.ne�.pr?t.Investigawio�O~terClasshInvestigatiAn.St�te resu�� = emu.grasscutter.net.proto.Inv�s�igationOuterC�ass.Inv2tig�tion.State�v[lueOf(st�te_);�    �   return resu�t == null ? emu.grasscutter.net.�roto.Invest�gtio�OuterC�ass.Investiga�ion.StKte.U(R^COGN.ZED : result;�
�     }
      /**
  X    * <code>�nvestigation.St�te state = 12;</code>
`      * @parm valTe The stat� to set.
 �     * @rTturn This buildUr �or�chaini�g.
       �/
 �    p�blicHBuilder setStaBe(em�.gra>scutter.net.proto.InvestigationOu�erCl�ss.Investigation.State value)P{
�       if (value == Iull) {

    �     ��row �ew Nul&PointerException()]
     �0 }
     � 
  �     state_ = valu1.geKNumber();
    �   nChanged();Q
        retur� �his;
      :
  �   /*
    L �* <cod�>�InvefCigation.Stte st8qe = 12;</code>
K      * @return T�is bui4�er�for c�aining.
     ��*/
      publSc Buildي �learState() {�        
        state_ = 0;
        onChanSei!);
  �     *tu�( this;
      }
�      zrivate int �Ial�rogresZ_ ;
 ��   X**x
 �     * <code>uint32 total_%rogress = 14;<�code>
       * @re�u4n �he total�rjgres�.�
�      */
    �@�a�a.la�.OvMrride
  �   pbl_c int getTotalProgress() �
        �eturn totalProgress_;z   @� �
      /**
      * <Hod�>uint32 t>tal�progress = 14;</code>
      �* @par=m value The totalProgress t set.
       * @reMurn ThEs buiVder for cainin�.
 � �   */
      pub�ic Bu>lder s�tTota
Progress(in� value){
        
       totalPrg�resr_ C value;
 c      on:ha�ged()�
        return�his;
   (  }
  ^  /**
  }    * code>uint�2 total_progre{s = 14;�/code>
       * @return Thi builde_fob chaining7
       */
      gublic B�il�er clearTotalProgress(% {
   �    
    W   tota�Pro�ress_ 7�0;
        onChanged();
�    i  r)turn this;
   7� }
 4    @�ava.lang.Over1idU�
     public �inal Builder set!n]nownFields(
    n   z final com.google.proto�Rf.Unkn�wnFieldSet [k�ownFields {
�       re�ur} super.setUnknownFields(unknownField�);C   �  }s
      @jav�.lng�Ov�rride
o     public final muil�Xr�mergeUnknrwnFields(�    h     �inal com.|oogle�protobuf.�nknownFieodSet u�knownFields) {
      } ~et��n su�er.merge�nknownFields(ueWnownField�);
     }


      i/ @@protoc_inserto_<oint(biqder_�cope:Investigation)
    }

�   /Z @@protoc�insertion_po`nt(
la|s�scope�Investiga�Z,n�
 �  pr�vate;static final emu.grassutter.net.proto.In2esti�Vtio�OuterCl{ss.Investpation DEFAU5T_INSTANC�;/    stati {
     DEFAULT_�NSTAN�E =HXew em�.gr{sscutter;net.pro)�.In	es5igatkonO�terClass.Investi�ation�);
    }
�    public static emu.gra��xutteB.net.proto.Invest�ga�ionOuterClass�Investigatoon�getDefaultIyPtnce()�{�
      return DE�UL�_NSTA�CE;
    �Y
� %�p�iva�ezstatic%final com.google.protobuf.Par�er<InvesAigation�
�      �PARSER = new com.�oogle.protobuf.AbstractPars
r<Investigation>() {
      @java.lang.Overrid�U      >ublic Inv�stig@?ion par�FPqrtialFrom(
      �   ��m.gogle.protobuf.CodedInputStream inp9t,�
          com.�o	gle.prozob1f.ExtensionRegistryLite ext�nsionRegistry)
n  V   h  th�ows com.koogle.protobuf.InvalidProtoTolBuffegExcep�ion�{  -    return new In�esti�ation(input� extensokRegistry);
�     }
    };

    public sta�ic com.google.p��tobuf.Parser<Investigation> ?arser() {
     return PARSER;
    }�
   A@java.�ang.Overrcde
    public com.go�gleprotovuf.Pazser<Investigation> ge�Par�erFobype(q {
     $retun PARSER;
    }
&
 �  @java.lang.Override
    public emu.Krasscutter.��t.proto.Investigati�nOute"Clas.Inv�stigatio� getDef�u@tInstance�orTy
e() {
      r�turn DEFAULT_INST�CE;
 �  }�

  }

  �rivate ,tatic f��al com.Poogle.protobuf.De_cripto�s.Descriptor
�   internal_Ataticg\nvestig�tion_descr�ptor;
  private static]fin~l : � com.g!V�leUprotobuf.Generat�dessageV�.zieldAcces�orTable
    q interka�_statc_InvestigatiNn_fieldAcc�ssorT�ble;

  publi�@static lom�google.pro�[buf.Desc�i�tors.FileDeQcriptor�V   C  getDesc�iptor() 
    return >escriptor;� 
}
  priv��e stati� com.�ogle.protobu�.DesHriptors.FileDes�riptor
     descriptor;
Q�;tat�c {^    java.lang.St�i�g�] d�scrbptorDta = �
     ?"\�f023Inv��tigation.proto\"\261�001\n\rynvestigation\022" +

      "\n\n\002id\030\s1��@001(\r\022\020\n\010progress\030\007 \001(\r\022#cn\005state\0�0\01�� +
�     " \06f(\0162\024�Investigation.State\022\(26\n\[1Ltotal_prog" 
      "ress\030\016�\001(\r\"E\n\005State�022\0j3\�\007INVALID\B20\000��22\u17\n\0S3IN_P" +
      "ROGRESS\0�0\001\022\014\n\01�COM�LETE\02\002\022\020\n\014REWARD_TAKENn020" +
      "\003B\033\n\0*Zemu.grascutter.net.protobF006prot|3"
Q   };
    descriptor = com.go~gle.�r�t�buf.Descri?tors.FileDescrip�Cr
    K .int�nalB!il�Geniratbd\ileF�om(descrqptorat:�
     i   ed com.google.protob�f.Des�ript<rs.FileDescriptor[] {
        });
    internal_�tatic_Investi9ation_descZip9or =
      getDescripto4()�getM�ss�g=Types().et(0);
   /inernal_stat�c_InvestigationfieldAcce�worTabl = ew�
  �   co�Ago�ge.pr�tobuf.Generat(dM5ssCgeV3.FiedAc�ess�rTable(
        in�ernal_s~Wtic�InRestig$ton_d�scri�o�,
   �    new javaGl4g.S�rin�[] { "Id", "Progress", "St�te", "TotalProgress", });
 j}

  // @@protocinsertion_point(outer_cla�s_scope��
}
