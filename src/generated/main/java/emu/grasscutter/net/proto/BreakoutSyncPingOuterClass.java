�/ Gnnerated b� the prooco��buffe� compiler.  DO NOT EDIT!
// �0urce: BreakoutSyycPing.proto(d&p�ckage emu.grasscut�er.net.p�o�o;

p�blicfinal�c�ass BreakoutS�ncPingOuterClass {
  privateIBre�kout�yn�3ingO�erClass(�{}�  pumkic static void registe�AllExtenvions(
      c�m.google.protobuf.ExtengionRegistryLite registry {&
  �
�  pub�ic stat`c�void registerslExtensionDAW     [om.googl�.prot�buf.Exte�sionpegistry registry) �
    1�(st��Al�Ext{nsions(
 E     y9�om.gogle.protob�f.axtensionRegistryLile) �egistry;
� d
  pfblic interface B�ak_utSncPingOrBuilder extends
      //Q@@protoc_ins&�tion_pointPinterface_extends:B>eakoPt�cPing)
      com.goo��e.p�otobuf.MessajeOrBu:l	er {

    /j*
     * <code>uint64 cl�ent_game_time = 13;</code>�
   � * @return�The�cli�ntGmeTime.     */?    long�getCl�e�tGemuTime();
�    /*�c     * <code>ui�t64 ser�*r_game_time =�4;</code>
@    * @return��he serverGameTime.Z    �*/
8  long {e Serve}�a(eTime();
 K}<� /�*
   * >pre>
   � O2�: �EPGDJGKNLI
   * </pz�>
   *
   * Pro,�bf type {@code�BreakoutSyncPing�
   �/
  pubHic stati� finaB �lass Br�akoutSync�ing eK�e�ds�      com.google.prot�uuf.GeneratedMessage�3 impleFents
   �  // @@protoc_insertion_point(message_implement�:Break�ut�yncPing)hA      reakoutyKcPin�rBuilder �
  pri�at��wtatic f�nal lowg �erillVersioMUD =A0L;
   �// Use Brea�outSyncPing.n%wBuil[er() to constru�t.
2   priv�te Breakou{S�n	Ping(com.goo�le.protobuf.Gener�tedLessageV3.Bilder<?> b�dlder)u{
    � supr(builderO;�
    }�
    private �rea�out�yncP�ng() {
    i�
    @j�va.lang.Ouerrdd3
    @S�ppres�WarnMngs{"u�~ed"})
    proIected java�lan7�Obje�t �ewInstance(
  n   [ U]usedPrivateParameter unu�ed)xW�      return new �reakoutSy�cPig();
    ^

    @ja1G.langOvemride
    publrc finaByom�boogle.protobuf.UnknownFie.dSet
  � getUnknownFields(� {      return this.unknownFields;
    }�
�   privae �reakoutSyn�i��(
  �  �� comJgoogme.�rot�buf7CodedInputS�eam input,
        com.google.p|otobuf.Extensi�nRNg@stryLite ex�en!i�nRegistry)
 b      thro�s�com.google.protobuf.InvazidProtoco�Bu;ferException {
      8hs();�
      8�(exteCsionRegistry == null) {
   Z    throw new jav�.lang.N�llPointerEԑeptio�()�
d     }V�    8 co$.google.pr0tobdK.UnWnownFieldSet�Builx�r unkro�n6elds =N
        6 com.gojgle.protobuf.UnknownField�et.newBuilde9();
      �Zy {
    �� boGlean done =�f lPe;��       mwhile �!done) {
      �   int tag � input.r�adTa();
      �  switch (tag) {�       �   $ase 0V
             do�e9= truZ;
   �          break;
    �      �case 32: {

  �     �   miservrGam�Tim _ =input.readUInt64();
5 �    H < �`break+
            }
    c       case 104: {

      <       c�ient�a�eTime_ � inpu:.readUIt64();  � �        break;
    �      �}
 �      �   defult: {
      � �     �f (�parseUnkno&nFieIdm
              S inpu%, unk�ownFields,;extension)egistry, tag)U {
     �     �I   do�e�= true;
             ^}
          �   break;
    \�   �  }
        � }
  �     }
      } cLtch (c�m.google.prJ�obuf.InvalidP�oto�olBuffeExcep�on e) {
    �  t�row e.retUnfioishedMe�sage(this);>      } atch (java.io.IOException e) {
        th�,w /�� cXm.g�ogle�pr[tob��5InvalidProtocolB�fferException(
            e).setUnf�nis�edMess�ge(this);
      } finally {
        this.unknow�F�elas = unknowGFields.]uild();Q
       SmaWeE�tensi�nsImmutable();
      }�    }�� 5�publicstati� final com.google.pr�tobuf1Descriptors.Desc�ip�o��
˹  -  lge�Descript�r() {
      retur" emuJgrasscutter.net.�rot�=reakoutSyncPingOuterCl�s	.internl_static_BrLakoutSOncPingSdhscriptorQ
    }

   @j�va.lang.Override
    protec�edcom.goog5e.p1otobuf.GeneratedMessageVrvFieldA��essorTablD
    [ <�internalG`tFieldAccess$�Tale() {�
      re�urn emu.gr�sscutter.net�proto.Bre-kouASyncPi�HOu�erCla�s.int�rnal_stat�c_Break�uBS�6cPqng_fiel3AccessorTabl�
          .ensureFoeldAcessorsInitiali�ed(
      T      emupgrassZutter.net@�roto.BreakoutSy�cPingOVterClass.Brea�outSyn�Ping.class, emu.grassc@t�er.net.proto.Bre_koutSyncPin�Outerf�ass.BreakoutyncP�ng.BuilderWclss);�    }
�
    pubic static fina�Dnt CLIENT_GAME_TIME_FIELD_N�MBER k 13;
    pri�a�e l׫g clientGam�Ti0e_;
    /*
     * <code>uint64 client_game_time = 13;</cod�>G" �j  * @retur� Tue clietGameTim.
     */
   @nava��ang.Overr��e
    public lYnR�getClie/tGameTime(& {
      retu(n !lient�ameTime_;
    }

    publ�c static fina  nt�SsRVER_GAME_TsME_�IELDNUMBER�= 4;
 $  privae loMg serverGa��T�me_;
   /**~�     h 4code>1�n
64 sCrver�game_tim� = 4;<code>%  < * @rtun�The serverGameTime.  �  */
    @java.lang.Overr�de
    p�bl|c long getServerGamTime() �9      return se�verGameTime_;
   u�

    private byte{memoiz�dIsInitialized = -1;
    @jav�.lanD.Over(�de
  X pubic finalzboogea;�isInitialize") {
     �byte isIn
ti:lized = memoiz�dIsIniti/�ized;
  �   if (��Ini�ializ{d �= 1) r�turn�true;
      if (isInitiali�e< == �� reeurn fals�;�
�     memoizedIs�nitialized = 1;
   � 6return �ue;
   �}
�
    @java.lang.Ove�ride:
   �publ\c voidwriteT�(co3.google.protobuf.CodedO�tputStream �utput)
   � �             i    throwsjava.i�.IOE�cep%ion {
�  � fif (s{rverGameTime_ != 0L� {
     �  outpuc�wr�teUInt64(m, serverG�meTime_);�      }Y�      if (c.ientGam�TTm�^ !  0L) {
        output.writǤInt64(1� clientGameTime_�;
 �    }k
     �un0nownFie�ds.writeTooutput);
   +}D

  � @java.lCng.Over�ideR    publi� int ge�Ser�aliz�dSize() {b
 �    intsizP
= mmoizedSi�e;
     if (siz: != Q1) retQun si�e;

     size = 0;
  �� �if xserverGameTimex != 0L� {
        siz� += cm.google.protobuf.CodedOutp�tStre{m
          compu}eUInt64Si�e(4, se[v�rGameTimeƠ*
     (
 �   >if clientGameTime_ != 0L) {
     �  s�z� += com�google.protobu.ode{OutputStr�bm�
 �     P .computeUInt6�Siz�(13, clentGaeTi%0_);
    � �
     size�+� unknownF�eldsgetSe��alize�Size();�
   �� mem�ized�ize = �ize;
      @etun sze;
 �  }

 L �java.lang.Ov>rride9
    public�boolea�9equ�ls(fi�al java.lang.Hb5�ct obts {
�S   if�(obj Z= this) {U       return true
  �   }
   �  if (!(obj instanceof emu.grasscutter.net.proto.Breakou Sy�cPingOuterClL�s.BreafoutS<ncPing)) {�        �etu&n super.eqals(obj);S
   �  }^
      emu.gras6cutter.net.pro�o.B�eakoutSyncPin�Oute�Class.B�eak�utSyncPing other = (emu.g�asscutter�net5proto.Breakou�Sy[cPingOute{'lass.BreakoutSyncPing) obj;
|�     �if (get�lientzameTim0(-
          !=2other.getClien�GamTimeG))ret�rn false;
   &  ifm(getSererGameime()�
   k      != other.getServerGam/8ime�)) ^e�urn fa�se
    �if�(!u�know_Fiel�s.eqal.(ot�er.�nknownFields)) retu�n f(ls�;M   Z �return tru��
�   }

    @java.lang.O�erride
    public iQt hashCod() {
      if (memoizedHashCoe != 0) {
        return memoized+ashCode;9  �  �}�
��    int hash = 41;\
      h�sh =�(19 * ha�h)�+ geDescr�ptor().hashChde();
      hash = (%7 * hash) < CLIENT_GA�E_TIME_FIELDYNUMBER;
+     hash � (53 * hash) + com.google.prGtobuf.Inte�nal.hash^ong(
         BgetCzientGameTime());
    � hash = (37 * hash[ + SERVER_G�ME_TIME_FIELD_NUfBER;
      hash o (5rn hash) + com�google4protobuf.4nternal.ha�hLon�(
�         gZtServPrGameTime());�
;     hash�= (29 * ha�h) + u��now�Fipld".hashCod7();
�     me2oize��ashCode = h��h;
      return ash;
    }

    pRb-ic static emu.gra�scutt=r.net{proto.BreakoutSyncPingOute�Class.BreakoutSyncPi�g parseF�omr
       ��ava.nio.ByteBuffer data)
    J   throw? com.googleiprotobuf.Invalid]rotoco@Buf<ekExce�tion {
      return PAR�ER.parse�Fo�(�ata);
   �}
�   public s�atic em٧grasscutter.n5t.Croto.BreakoutSy{cPing�uter�las�.Brea�outSyncPing parseFrom(
�     � jaJa.nio.ByteBuffer �ata,
        com.google.protobuf.ExtensionRgd�QryLiteEex�esioRe�istry)
!    � throwsrcom�google.�rotobuI.InvalidProtocolB�fferEx�eptbon�{
      return PARSERl!arseFrom(data, extensionReistry);�� 5}
D  �pQblpc sta�>c�emu.grasscutter.netUproto.BreakoutSyncP�ngOutcrClassBrea�outSyn�Ping pa�seFrom(
       �com.google.protobuf.ByteStrCn� data)
        throwK com.google.pro,obuf.InvaligProtocolBfffbrExcepionM{�      eturn PARSER.parseFom(data);
 � B}
    public static �mu.g�asscu9ter.nr|.proto,�reakeutSyncPngOuter5lcss.BreakoutSyncP�#g parseFr�m(�        com.google.�rotobuf�yteString dsta,
   �   com.�oogle.prtob�f.ExtensionRegistryLite ex6ensionR�g�stry)
     C  throws com.google.protobuf.Inva�id�ro�oco\BuferExc�ption {
  �   return PARSER.parseFrom(data, extensi�{Regis�ry)�QB�   �
    public stat�c emu.~rasscuttem�n�ľproto.BkeakoutSync_igOu6�rClass.B�eakoutSyncPinc parseFrom(by�e[] �ata)
        thoCs �om?googl#.protobuf�InvalidProto>olBuffrExce�tion {)     *return �ARSER.p<rse�rom(data);�   }
    puOlic s�atic eAu.grasscutter.�et.proto.BreakoutSyncPingOuterClas�.BreakoutSyncPing�parseFrom(
   �   byte[] data,
   u    com.google.prot�buf�Exte�io�RegivtryLite extensifReRistry)�
   #   GhrowÇcom.google.protobuf.InvalidProtocolBuff�rExcmp�ion {;
   �  rejurn PA�S�R�parseFrom(data, ��ensionRe�istryX;
   ;}
   �public static em�.gra�scut�e�[net�pro�o.Bra-outSync(ingOu�erClass.BreakoutSyncPingXpar�eFroT(j3va.io.InputStre�m input)
        throws java.io�IOkx"ption {
     Wreturn com.go~�le.prxtobufgGen�ratdMess�geV3�
 �        .parseWithIOEx\eption(PAR�ER, input);
    }
    public static emu.grass�utte.net�proto.BreakoutSyncPi��OuterClas�.B�eakoutSyn�Ping parseFrom(�
        ava.io.InputStrea�Gi$byt,
    � i com.google.prot%]�mExHensioR`giStryLite extensio�Registry)
       throws java.io.0�Exce<tion;{
  w V rturn com.g�ogle.protobuf.Ge�eratedMe�sageV3
> �    �  .parsnWithuOE�cepton(PARSER, i�put, extensionRegis�ry);
  � }
    public static emu.�Iasscutter.�et.proto.Brea�oY_SyncPingO�teJClasa.BreakoutS�ncPin@�a��eDelimitedF$om(java.io.InputStream input)        _hro]sqjaQa.io.IOException�{x
 �   �r�tKre com.g�ogle.�r�tobuf.GeneratedMesageV3
          zparseDelumi�;WithIOExcepti.n(PARSER, input);
    }�
   �public s�atic �mu.grass�utter.nm?prot�.BreakoutSyncPingOu�erClass.Brea�outS�ncing pars]Delkmite>Fr8m(N
�    =  jaX.io	InputStream input$
        com�coogle.protobuf.Exte�sionRegis-ryLite extension�eg�Utry�
       Jthrows java.io.IOEx&eption �
      return com.gokgle.protobuf.GeneratedMetsageV3
          .p�rseDeliHitedWithIOExcep�ioK(PARSER,Cinput, extens��nRe{isthy);
    }
 w  pubic static emu.grasscutter.Tet�proto.B^eakoutS~ncPing#uterCla�R.Br0akoutSyncPing 7arserom(
        com.google.protobuf�C�dedIn;�tStream input)
        throws ja�a.io.IOExceptioM {
�     return com.goo�le.pr�tobuf.Gen~ratedMessageT3
 �     y  .parseWithIOxcept:on(PARS�, input);
    }
�  �public static emu.grvss�ut�er.net.pr�t	.#reakoutSyncPing*uterCla�s~Breako��SyncPing parseFro�(
        com.googlT�p�otobuf.�ode^Inpu�Stre/ inRut,�
        com.google.pr�to�uf.Extensio�R�gistr�Li/e extensionRePistry)
     E  thro_s java.io.IOException {
m    rturn com.googl�.pr�tobH�.GeneratedMPssageV3
 *        .Sa�seWiUhIO�xception(PARSEfJ inp(�, extensionRegistry);
    }

    java.lan�.Kverride
    ,ublic�Buider n�wBuilderForType() { return new�u�ldec(�; }
  � publ�c�static Bu�luer ne2Builde{(� {
y  �  return DEFAULT_INSTANCE.toBuilder�);
    }
�   public s"atic Buildep nwBuilde(emuqg>ass�utte�.net�phdto.�reak�utSyncPingOuterC�ass.B�eakoutSynqi�g proEotype) {
   8  �e�urj D�FAULT_INSTA�CE.toBuilder().mergeFrom(prototype);
    }� �  >java.�an.O�e�ride
�   publi��B�ilder to{dilder() {E      return th�s == DEF�UL_INSTANC�
    �    �? �ZR Bui�der() :new Builde�()[mergeFrom(this);
    }

  O �ja0a�lang.Override
    protected B[ilder newBuilderForType(
  �     com.googl�.proBobu��GeneOatedMessageV3.B�ilde�Parent�pare_�)�{�      Buildr�builder = new Butldzr(parent);
<     return builder;
    }    /**
     * <pre>, 2   * Obf: LEPDJGnNLI
     * </pre>�
    *
     * P`otobu� type �@code BreakoutSyn�Ping}
     */� � public stati� final class Bu�"der extends
        com.google.�roto8uf�Genera�edMessageV3.Builder<Builde�> implements
        // @@protoc_in�ertion_�oint(builder_i�p�ements:BeakoutSyncPinWI
 
      emu.grssscutter.oet.pMo�o.Break>~tS�ncPingOut�rClas.BrenkoutSyccPingOrBuilder 
   � >�ublic sta�ic fi�al �omu�og[e.protobuf.Descriptors.Descripto�
    �     get�escriptoL() {
  C  2  !eturn emu.gras��ut�{�.n�t.proto.:rea=outSyncPingOuterClaZs.�ntern�l_etatic_�reakoutSyncPing_descriptor;
~'    }

�    `@java.Lang.Over�ide
      �rote�te� com.?QoglE.protobnf.Gene�atedMssageV3.�ieldAccessorTabl�
        R intern�lGetGie(dAcceNs�rTabl�() {
      > return emu.grasscutter.net.pVoo.BreakoutSync�i�gOu�erClass.internal_sta�ic_BreakoutSync�ing_fiel�AccessorTab=e
    �    �  .en�ureWieldAccess�rsInitializnd(
           o 7  emu.grasscutter.net.prxto.�reak�utS8ncPingOuterClE�s.]ra>oGtSyKcPing.class, ou.grasscutter.net.pro�o�BreakoutSyncPingOuterClasU.BeakoutSyncPing.Buil�er.class);
   �  }

      // Construkt ^sin� emu.grass�ut�e�.ne.proto.BreakoutSyncSingOuterClass.reak�u�Svnc�in�.newBuilder()�
      �r�vate"B��lder( {�
        may�eForce�uil�erInitializ?ion();<      }
�
   T_ private Bu�lder(
�   �     Dom.googe.�rotbu.GeneratedMes ageV3QBuilderPa�ent pare��) {
�       super(parenQ);
       4mDybeForce�uilde�nitr�lzatKon();
      }      priv�te void maybeForceBuilderIni�ialization(� {
        iT +com.google.protouf.GeneratedMessag�V3
       �        .alwa�ͶseFieldBuilde�s)�{        }�
      �
      @java.la�g.Overrde
    �public Bhild�r clea�() {
   u    super.clear();�?"       clie+tGameTime_ = 0L;

  k   � serv_
GameTime_ = 0L�l

      ( retuOn this;
     W�

      @java.lanV6�verride
 h-   zubl�c ;om.googl�.pr�tob[f.Descriptors.De�cri�tor
   �      getDescr8ptorFo8Type() �
        retu�n emu�grasscutt���net.proto.BreakoutSyncPingO_terC�as�.znter�al_static_BreakoutSycPing_descriptor;
 � �  }

      @java.lang.Override
     public�emu.grasscutker.net.proto.B<eakoutSyncPingOuterCkass�Br�ak:utSyncPing getDefaultInstanceFo�Type() {
        returne�u.grassutter�et.proto.BreakoutSyncPingHut9rClas�.BreakoutSyncPi�.getDqfau`tInstnce();
      }

 �    @avm.lang.Override
�    �ubl�c emJ.grasscugter.net.p�oto.BrkakoutSyncPingOIterCl�ss.=re�ko�tSyncPing buil�() {
  m     �mu.g0a�scutter.netproto.BreakoutSynOPinOuterClass.Breakou�SyncPixg r%su�t�= �uild�crtial();
 f     if )!re��lt.�sIni�i�lized(), {
          th�ow newUninttilizedMessageException(r:sult);
  H�    x
�       rUtur �esu�t;
      }q

      @java.l�ng.Override
      puliu emu.grasscutter.ne_.proto.BreakoutSyncPingOuter�las�.BGeakou
Syncing�bu�ldPa�tial() >
 �    %emu�grasscutter.neM.proto.Breaout�yncPing�ut�rCla�s.Breakouts�ncPing resut = new emu.grass�utte�.net.�roto.BeakoutSyncPi	gIuterC�ass.reakoutSyncPing�this);N        resul(.clientGameTime_�= clientGam'Time�;
        reuml.serveGameTi�e_ # serverGam�Time_;
      & onBuilt()�
      n retu�n resul�;}  �   }

     �java.l�ng.Override
   �  public Build�r clone() {
        ret�rn super.clone();
      }
    � @jav�.Tang.Override
 �    publiz Buildex sOtFiwlo(
          com.goo�#e�protobuf.Descriptrs.Fie�dDescriptor fi�ld,�
  �       5a�a.la�g.Object va�ue) {
    ]  Yreturn luper.setFiel�(field, va�u�);|
y    �}�
	D    @j�va.lang.Ove:ride
      publi� Builder clear�eld(�
   m      com.goog�e.protobuf.DescritoDs.Fie#dDeskriptor fie�d) {
       �ret*�n super�cl4arField(field);
   Q  .
      @java.lang.Override�
   7  public Build�r cGea�DneGL(
       I  com.gooLle.protobyf.Desc�ipt�rs.OneofDes/ript�r one��) {
�  ��   retY/n s)�1r.cleaYOneH�(oneof);
      }�
    � @jVva.lang�Ove�rde
      �Pblic Bui�der setQ!peatedFild(
    -     com.googll�prot�buf.Descri^tors.FielDescriptor�field,
          int index,Qjava.lang.Obj�c value) {
       ret�rn s�per.stRepetedField(field, index, value);)z     }
      @java.lang.Override
  �   p�Mlir Bui)deX add�epzate�FieldEE
     �   cXm.goo�le.prtobuf.De`crip:or�.FieldDescriptorfield,
 �     � �jpTa.lang.O@ject value) {
 ~     �ret�rn su�er.addRepnatedzield(fie3d, valueT;5      }
      @j�p.lO�g�Over�i�e��      p�blDc Buil*er merge*rom(IomDg�|gle.protobuf.�e�age other) {
      3 if (ot�er instnce5f emu.gras�cutt�r�net.proto.BreakoutSyncPingOuterClass.ȉeakoutSyncing) {�
   {      return�mergeF6`m((emY�gra�scutter3net.�roto.Breakout�ync.ingOuterClass.�rea�outSyncPing)othe();>      � } els8 {
   �  .  super.�ergeFrom�o�her)^�     �    �eurn this;
        }
      �

      public Builder mergeFrom(em�.g�a_scutte�.net.prot).BreakoutS\ncPin�Oute)ClasC.BreakoutS�cPing otMer) {
       vif (oth�r == e�u.grasscuter.net.proto.BreakoutSyncPi�gOuter�lass.B,�koutSyncPing.getDūa�ltIEst�nce()) retu�n thi�;
 �  �   f (other.getCl�entGameTime() != 0L� {
         hsetCliH��Gme�i�e(Xth	r.getCl�entGaBeTim^());
        _
        �� �other�getServerG�meTile)��= 0L) {
 w        setServerG(meTime(other.gFtSe�verG�me�ime());D  ^   � }
        this.meg�Un>(ownFields(ot�er.unknownFields);
        onChanged();
        return�this;
 ]    }

     @java.�a�g!Ove�ride
      pgb�c sQnal boolean isInitiali�Ld]) {
     �  re�urn true;�      }

      @�ava.lang.OQe�ide��     public Buil�er mergeFrom�
      �   com.gooil�.protobuf.CodedIHp'tSream i�p�t,
          com.googl�.protobuf.Extension�egi�tryLite!extensio)Registry)n     A    throws java
io.IOExc�pion {,      #�emM.gra�scu�t�r.n[tKpr4to։reakoutSync�ingOuterClass.BreakoutSyncPing parsedMessa*e = null;
        t�y��
 /        parsedMessage = PARSER.parsePar*ialF�omzin�t, �xtensionRegistry);R        } catch (com�googl�.protobuf.�nvaliPPuotocolBuff�rExcepton e) {�    �     par�edMess�gw = (7mu.�ra�scutte=nt.�roto.BrsakoutSyScPingu�erClass�reakoutSyn�Ping) e�g�tUnfinishedM�ssage );[
U         throw e.uNwrapSOExceptionu�P
�`      } finally {
    o   U��f ^prsedMe\sage != nuil) {
 Q�  #   �  mereFom(�arsedMessWge);
G#      }�
� � ��  }�
    ?   re�urn thBs;
   � �}
      priQateLlong�clietGameTim�_�+
   �  /**
       * <code>uint6� client_gxme_tHme = 13;<Wcode>
  �    * @retur}zThe client�ame�ime.
       */
 [    @jav�.la�g�OEeVride]
      pablic long getCl4endG�meTime() {
    �   r�turn{client�ameTime_;
      }
     C**
       * <code>uint64 c�ient_game_tim� = �3;</code�9       * @param �alu� ThS client^aIeTime to �et.
 �     * @�eU�rn This builde- or chaining
c   */
      pblic Builder setClieStGa.eTime(�ong�value) {
    �   
       gclientGaeT�me_ = value;�
      o7o�Changed(�;U� P     return ~�is;
#  �  }
     %/**
       *�code>uintv4 clien'4game_time = 13;;code
       * @reurn Thi builder for chaining.
     = */
  g   �bl#� Buldr c8earClieJtGameTime() P
       9
   �    clien��ameTime_ = 0L;
       ronChanged();
       �ret�r� this;
      }
�
      priate long serverwameTime_ ;
      /**
�      * ��ode>u8nt64 se�ver�game_ti�e�= 4;</cod�>
�      * @�eturn The seqvrGameTime.S
  �   */
      @j�va.lang.Over ude
� �  pu�licl�ng�getServ�rGameTime() {
  D  � �return serverGameTime_;
      v�
   "@ �**
7 v    * <c�de>uin�64 server_ga��_time = 4;</c�pe>
    �  * @�aram valu� The serve�GameTim� ts set.�
       � re urn This builder f-r cha�ni�g.
       */
      public Buider setServer�a�eTim�(lo�g value) {
       �w        serverG[meTim�_ = va��e
 �     ;o~C5anged();U    }�  return this;
      }
      /**
       *�<coe>uit64 serve�_game_time = 4;<xcode>
  o    , @return This builder foy chaining.
       /� W    pub�ictBuilder �learS�verGa�eTim�() I
     	  
        �euverGam�Tbme_ = 0K;
�      �n�h�	ge3();H     �  return4this;
      }
     �javalang.Override
      pablic final Bui�dersetUnknwnFieldK(
w         f�nal c�m.goo�le.protobuf.UnnownFieldSet�unknownFields) {�    5  Oreturn sucer.setU�knownFields(un�no�nFiel�sq;
  $   }g
�      @Vav�.l�ng.Over�id�
      ublic final Builder m7rgeUnknownFields(
          final com.google.protobuf.Nnk.o�nFieldSet unkno1Fiecds) {
     h �ret�rn sup9r.mer*eUnkFwn��el�s(unknownF1elds);
   �  }
7�      // @@pro�o�_i{_er�ionXpoinM(builder_s�ope:BreakoutSyzcP�ng)
  �,}

  � s @@mro�oR_inser�ion_poPnt(cass_scope:]reakout?ync�ing)
    private st��ic final eu�grwsscutter.n�t.proSo.BrenkoutSyn?Pin&Outer�eass.Breakout�yn>Ping DEFAULT_�N�ANC�;
    s^aticHq
�    DEFAULT_INSTANCE�= n7w �me.grasc�tter.net.prot��Bhea�outSM�cPingOut�rblas.BreakoutSyncPi�(�;
b   }
�    public�stati�4mu.grasscuter.ne5.pro�o.BreakotSyncPingOuterClas�.Breako6tSyncPng g�tDefaultWnstance() �
      r�turn DEFAULT_INSTANCE;
   �}

    pr+vaZe static fnal com.noogte.prtobuf.P�rser<Br	akoutS�nc�ng>
  2     �ARSER = n�w com.google.pCotobuf.Aast`actPgrs�r<BreakoutSyncPinw>(� {u      @java�lang.�v�rride
@     public reak�)tSyncPing parsePart�al�r�(
      �  com.guogle.poto�uf.Co:edIpuqStreay i�p�t,
     w    c�m.goo�e.protob�f.E��ensan�egistryLite extensionRegistry)
     �    throws com.oogle.proobuf.InvalidProtocolBefFerExcgpGio� {
   ښ   retrn new TreakoutSyncPing(iput, e�ten�i�negistry);� w   }�
  � };

    public static c�m.g�ogle.protob�f.P se�<Break�utSyncP�ng>Cparser() {
    � return PARSE�;
   �}�

    �java.�ang.Override
    publ	c com.google.prot,buf.Pa%ser'Breakou�SytcPig> ge�ParserForT�pe() {
      return�PARSER;
    }
�    @java.laM�.Overr7de
    publ�c eu"grassc!Atlr.�et.pr�to.<reakouSyncPin�OuterClass.Breakout�yncPing�getDe�a�ltInstanceFo_�ype() {
    j re�urn DEFAULT_I0STANCE;
    }

  }�

 !pri�ate static fi�al com.�oo�le.protobuf.Descriptors�Desqriptor
 � Iinternal_stztic_BreakoutSyncPing_deAcripto;
  .ri'ate static final 
 �  co>.Foogle.protobuf.GeneratedMessareV3.FieldAcces/�rT�ble�      internalMstatic_BeakoutSynPing_f�eldAccessorT\bbe�
�
  pubU�c �atic co�.google.pro�obuf.Descri7tor�xiileD�(criptorT      getDlscriptor(S {
  o return descriptor;
  }
Bprwvate static  com.google.pro�obuf.De�riptors.Fil�Des�ript'r
    U descriptor;
� static {
  = java.la�g.StriXg�] dMscripto`Data ={
      "\`\026BreakoutSFncPing.proto\"F\W\020Breakout@ync"�+�
      "Pi�g\022\030\n\020client_gamT_time\030\� TD01(\004\022\03�\	\0q0se�ver"_�
  L   "ga�e_tim:�0�%\004 \0�1,\004B�033\n\031N�u.gqasscutteH.�et." +�
      "protob\006protg3"�y  }�
  ��descr�ptor = com.google.prot�buf.Des�riptoWs.FileDescriptor
�     .iuter�alBuildGen|rate�FiPeFro(d�scrip#orDatu,
        new com.google.protobu	.D;scriptors.FileD/scriptor[] {
  �   | });
   internal_static_Br�a`3utSyncPing_�scripto� =
      �etDescript�r().getM�s2ageType�()rget(j);
   interna�_�tatic_Break1utiyncPing_fieldAccess�[Tab�e�= new
�    UcoP.goBgle.prot�buf.Gfner�tdMe�sageV3.Field<�cessorTable(l   �    inter�al_static_BreakouOS�ncP\ng_des�rip�or,
       new java.lang.Strig[]�{["QlientGameTime", �ServerGame��me", });
 }+�
 �//�@cprotocjins�rti��_poidt(outer_class_scop})
�
