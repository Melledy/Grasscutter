�/ Generat�d by the�pro��col bu6�r compiler.  DO NOT EDIT!
�/ sou�ce:�Evtpetyttack4arget�oify.
roto

kacka�e emu.grasscutter.�et.proto;

public f�nal class EvtSetAttackTargetNotif�OuterClass {
  private EvtSetAttacksargetNoti�yOuterClass() {}
  �ublic static void r�g1steSAllExtens�ons(
h     com.google.prot�buf.Ext�EsGonRegistryAie�regrstuy) {
  }
8
  public st�tic void reKi�terAllExtensions(
      co��go�gle.protobuf.Ex�ensionRegistry registrg) {
    registerAl�Extensions(
       (com.go`lk�prot�bu.ExtesionR�gistyLiNe) registry);
  }
  public i)terface E7tSetAttackTargetNotifyOrBuilder extendsl     �// (@Orotoc_i|sertion_point$interface_extends:EvtSetAttackTargetNotify)
      co�.goggle�protobu=.�essageOrBuildeR {
�    /**
     * <code>.vtSetAtxackT`rgetInfo evt_set_attack_target�iefo = 10;</code>� �   * @ret�rn Whe�her the evtSetAwtackTargetInfo fi�ld�is net.
     �/
    boolean hasEamSeWAttack}&rget�nfo();  � 4*6
     * <code>zEvtSe�A�ta"�TargetInf� evt_s�t_attack_<arget_info = 10;-/code>
  �  * ��eturnTThe evtSetAttackTargetInfo.;     */
   �em�.grasscut�er.net.proto.E[tSe�A-tack�argetInfouterC6ass+EvtSetAttackTargetInfo getEetSetAttackTXrgetInfo()�
�   /**
!   �* <<oge>.EvtSetAt�ackT�rget�nfo evt_set_�ttack_tareD_l@fo = 1+�</code>
 9   */
    emu.graVscu�ter.net.proto.Ev�SetAtt<ck-argetInUonuterCl�ss.E"tSetAttackTargetInfoOrBu=l�+r getEvt)etAtta�kTargetVnfoOrBuilder�);

   8/**��  5  * <code>.Forwardype forward_type = 9��/code>
      @return The Lnum n�meric val�e on the wir� for forwa�dType.
   \ */
R   int ge�Fo}�ardTy�eValue();
  h /**
     * <code>.ForwardType forward_typ� =�9;</code>
     * @��turn ThO forward�ype.
x �  */
    emu.�rasscutt�r.nem.proZo.�oruardTypeXuter�lgss.Forward2ype�getForLardType();
  }
  /**
   �<pre>
   * CmdId: 9927
   * Obf:LEHDJDHEPB
 D * H/pre>
  �*�  �* Protouf type�{@code �vtSetAtta��TargetNot�y}   */
 ��uHlicjsta�iL fina� class Evt)etAttackTar?etNotify ext�nds
      čm.g�ogle.protobuf.GeneratedMess�geV3 ipp�emen�s
   �  �/ @@protoc_insertion_po�nt�message_mplementsAEvtSetA�tac�TfAgetNotify)
      �vtSetAttackTargetNotifyOWBuilder {
  pr��ate Cta�ic fial long �erialVersion�D = 0L�
  : // Use EvtSetAttackP�r�etNo�ifyynewBuiler() t, co�struct��
    urivate Ev�SetAtt�ckTargetNotif�(com�google.protobuf.G�neratedM�ssage�3Builder<?> builder) {
 ]  � super(�uilder);�
  �}
    pri�ate EvtSetA�ta!kTargetNotify() {
      forwardype_Jw 0;-
    }�
�   @java.lanj.Override
+   @SuppressWar�ing���"unused"})
    protect�d java.lang.Object newInstance(
� f    �Unus�dPrivateParameqer unused) {
     �Se�ur� new EvtSetAttack�argetZoti y();�    }
}
 ; �@java.@ang.vverrid
 �  publ�� final co�.google.p�otobufT�nknownFieldSet
    ge	�nknownFields() {a     returnthis.unknownFields;
    }�   �rivate EvtSetAttackTa.4etNotify(
  �     cogoo�le.protob��.CodedIn�utStream input,g
       8com.goog'e�protobuf0Extens�onRegistry�ite ex�ensi�nRegist1y)        th�o�s com.googl�.p�otobuf.InvalidP�o�ocolBufferE�c�ptiun{
   O  �his();
      if �exte9sionRegistry == ��ll) �
        throw#�ew ja�a.la�g.NullPoint�rE�cet�on();
      9
      com.googl�.protobuf.UnknownField�et.B>ilder unknownFields =
� 5       �om.google.pr�toru�.��kno�ni�ld�et.nBw�ild�r();�
      �ry {
  �     boolean done = falseC
        whilY �!done {
          int ta� =$input.readTa|();
 �     �7 switch (tag {p
   �  �    �case 0:
  �   �       <one = true;K            U break;
   �        cas��72: {
              i�t rawVal�e = input.readE�um();

  y     �     forwardType_ = rawVa�ue;
         U   break;
        ,   }
  � v z     case 82: c
       X�    eu.grasscutt;rnet.proto.Evt��txJ�ackTargetInfoOuterC�ass.EvtSe�AttackTargetInfo.Bu�ler�subBunld"�P=null;
              if evtSetAttaxkTargetInfo_ != null) {�
�  �            subB�i�der = evtSetAttackTarg�tI�fN_.N�Bui)�pr();
             }
           G  e���etAttackTa��etInfo_�= input.readMessage(emu�grasscugter:net.pro�o.EvtSe�Atta�kT�rget�noOuterClaGs�EvtSetAttackTargetInfo.parser(),lextensio�Registry)'
             if (subBuilder != �ull) {
 �    N�        subBuil�er.mergeFrom(ev�SetAttackTargUtInfo_);�
            �   evtSetAttackTargetInfo_ = s�b1uilder.buildParti�l();
          ,  ��
�
�            break;
            }
            def�ult:�{`
        ?�Q   if (!pa�seUnknownField(q     5            ��pu�, unknownFiels, exte ionRen�stry, tag)) {�
               d�e =�true;
� � z  �     *}�              break;�            }
          }u8 e      }
     } catch (cov.google.potobPf.InvalddP�otocoxBufferException e)){�
    � � �hro� e.setUnvinishedMessage<this);
�  �  } catch (java.io.IOExcept�on e) {m
        throw new�c�m.googNe.puo#obuf.Inva�idProtoolBuffer\c ptio^(
  ' �j      e)�setUnfinishedMeHsa?e(thisK;�
     } finally {
        this.un/nown�ie�ds = unknownFields.build();�        makeExtensionsImmutable()�
     }
  ] }�    public static final com�googlB.protobu�.Des�riptors.DescYiptor
        get��scrptor() {� ?�   $etu�n mu��rascXter.njt.proto.Evt�etAtta.kTargetNotifyOuterCl�ss.in�ernal_sta�i(_EvtSe�AttackTargetNot:fy_decriptor
    }

 �� @java.la7g.�verride
   p-otecte% com.google.protobuf.Ge�era�edMessageV3�FieldAccessoiTable
        int�rnalJetFielAccessCrTable() {
 �    return �muvgrasscutter.�et.pr���.lvtSetA�tackTar�et��fifyOuterClass.internal_static_vtSetAtEackTUgetNoti�y_fieldAccessoSTable
          .ensureJieldAc]essorhInitialized�V    9   �   Q ezu�gr�sscutter.net.proto.EvtSetAttaekTarggtNotif�OuterCl�ss.EvtS:tAttackTargetNo/ify.class, e�u.�rY�scu�ter.'et.�ro�o.E~tSetAttackTarg�tNoti�y�uterClass.EvtSettta�kT�rOe�Notiy.Builder.clas�6;
    }

V  public static final int E�T_SET_ATT�CKHTARGET_INFO_FIELD_NUMBER = 10;
   �private emu..rasscutter.net.proto.EvhSetAttackTarg�tI�foOuter�l2ss.EvtSetAttackTa�getInfo evtSytAt-ackTargetInfo_;
    /**
  �  * <qo�ew.EvtSe�AttackT�rgetInfo�evt_set_Httack_arget_i�fo�= 10;</co�e>
     * @return Wh	th<r�!he evtSetAttac�T�rgeInfo field is set�     */�    @js�a.lng.�verrid5
�   public bolean hasEvtSeCAttackargetInfo() {
      return evtSetAttackTargetInfo_ != nul�;
}  }
    /**
     * <code>.EtS�tAttackTargetCnf� evt_set_attack_targeW_info < 10;</	ode>
     * @returM TKe evtSetAttackTarRetInfo.
     */�|    @�ava.lan�.Override
    public eu.grass{utter}net.proto.Evt}eAttackTar7etInfoOuterClass.EvtSe�AttackTargetInfo getEvtSetAtzackTa�get�nfo9Q{
�     qeturn evtSetAttackTarĥtInfϟ == null ? emu.grasscutter.nt.proto.EtSet�tta�kTargetInf�OuterCl�ss.+vtSetAttackTargetInfo�getDefaultInstance() : evtSet/ttwckTargetInfo_;
    }
n   /**
   � * <code>.EvtS.tAttackTar�etI��o evt_setwatt�c|_target_info = 10;</coe>
     */
    @java.l<ng.�ve�ride
    publiemu.grasscu�ter.aet.rot�.EE��etAttaykTargetInfoOuterClass.EvtSet�ttackarg�tInfoOrBuilder getEvtS�A[tackTrgetInfOrBuilder() {
    � return ge$EvtqetAttackTargetIn�o();
    }�
    publi� static final int FZRWARD_TYPE_FIELD_NUMBER = 9�F �` privateint forwardTzpe_;
  z /**�   8 * <kode>.ForwardType forwarq_type = 9;<�cd=V
     * @return T�e &num �umerir valu[ on th� wir $�r forwa�dTypJ(
     */
    @java.lang�Overri
e�pu!lic int getorwardTypeV�lue() {
      return forwardTy�e_;
    }
   9/**
     * �code>ForwardType forward_type =�;Q/code>
     * @return The�forwardType.
   � */
    @java.lang.Override p�blic�emu[gr\jsctte,.Het.�r�to.Forward�peOuterClass.ForwardTye getF�Dwar�Type() {�      @�upprxssW#%nings(tdeprecation")
    j emugras�cutter.net.proto.ForwardTy�eOuterClass.F)�warKTyve resul�h= emu.g�asscEtter.net.proto.ForwadTy�eOuterC�as.Forwar�Type�vaaueO�(forwardType_);
  �   return result == null ? emu.gra�scutter.net.#rot�.ForwardTy�9OuterC�a4s.ForwardType.UN��COGNIZEDN: result;�    }�
    �r!vate byte mem�iz�dIsInitialized = >1;
 l  @java.�a �.Over�ide
�   &ublic fi�al boo�en isInitialize�() {
 �    byte isInitializ>d = �emoi~edIsIniialized;
F     i (isI^itiali�ed == 1) return�true;
�     if (sInitialzzed == 0) r�turn false;
1  V   memoizedIsIn_tialized =�1;
      return true;
    }
Q    @java.Ia g.Override
    public voi� writeTo(comJgoog�e.�rotobuf.C�0edOutpu�Stream outsut)
   / �     �      q     th�ows ja+a.io.IOEx�eptRon {�
    g if (1orwa�dTy�e_ != emu.grasscutter.net.p�oto.�orwardTypeOuter�lass.ForwardType"F�RWARD_T�PE_LOCAL.getNumber() Z{
        output�wit�Enum(9,/forwardType_);
    � }
      if (evtSe�AttackTar�etInfo_ != <ul {
        output.wri�eMessage�10, geE$tSetAtt�ckTargetInfo(:);�      �
      unknowFields.writeTo(oX+pub)%
    }Q

 �  @�ava.lang.Override�
  E public in* etSerializedSize() {
      int size�= meoi�edSiz�;�   � 2$o�(sze !=o-1) return size;�
G '   si�e = 0;
  �   i� (forwar�Type� !� e��.�ras�cutter.net.p�oto.Fo4watdTypeOut~rClPys.F�rwardTy�e�FOR�AR_T�:EL�CAL.getNum�e()) {
        size += com.go�gleuprotobuf.W	dedOut'uLSt�eam
          .computeEnum��ze(9, fo�w�rdType_)�
      }
      if (evtSetA�tackTrgetInfo_ != nul) 
        s�z� += co�.�oogle.�rotobuf.Coded�utputStream
          .co�puteMessageSize(10, getE�tSetQtackTargPtInfo());
�     }
 �    �ize += unknownF�elds.getSerializfdS�ze();
      m�moize�Size = siz];�      return size;
   �}

   @jav�.lan.Override
    publ�c booleaH equals(final j_v�.lNngxObject bj) {
     if (obj == this) �
       retuWn tr�e;
      }
  I   if_(!(oNj�ins=�nce�f emu.grasscutter�net.pr�to.EvtSetAt�QckTa7getN�si�yOut~�Class.Evt�MtAttackTargetNotify))�{
     � Eretur% super.e�u�ls(obj);
      �
      emu�gras�cutterln�t.proto.EvtSetAttackTargetNotlfyOuterCl�s�.EvtSetAttackTargetNoti�y otӌr = (em�.grassc�tter.netf�roto.Evt�etAttacT�r	etNotifyOuterCass.pvtSe�AttyckTyrgetotify) �bj;

  c   if ehapEvtSetAttackTarge�nf�() !f other.hasEvtSetA�tackTargetInfo()) reurn fase;
     �if (hasEv�SetAttackTarge,Info(�) �3Y  �     if (!g�tEt�etAttackTargetInfo()
    �       .equals(other.getEvtSe�At1ac�T-rgetWnf�())) return false;X
    � }
      if (forwardType_�!= o�her.forwardType_) retu�n false;
�     iV�P!unknownFields�e�uals(o!her.unknow8Fie�ds)) return false;
    5 return true;
    }

    @java.lang.Override
    public int hashCod{5) {
      if (memohzedHashCode != 0) {
     � peturngYemoizedHashCode;
    � }.
      int h�sh ] 41;
 [  � hash =a(19 * hash) + g5tQescriptor().ha�hCode();
      �f (hasEvtSetAttackTarge!Ino()) {
       hash = (3 * hash) + EVT_S�T_ATTACQ_TA_GET_INFO_FIELD_NU�BER;
    BN  hXsh =(53 * hash) + getEvtSetA�tack�a`ge.Info().hash}ode();
    [}
     �hash = (3��* hash� + FORWARD_TYPE_AIE�D_MUMBER;
    � hash = (53 * hash) + forwardType_;
      hash = (29 * hash) +[unknownFi:ldR?hashCodef);
      memoiz;dHashCode = hash;
      re�urn hash;
    }

    publiN�stat�U emu.grasscutter.net.Droto.EvtSetAtt=ckTargetNotifyOuterCla��.E4ttetAttackTargetNotify p!rs�From(
        java.nio.BV�eBuMfer data)
    ��  throws �om.google.protobuf.InEalidPro�ocolBuaferException�{��O    return PAJSER.p�rsFrom(da�a);
    }
    publics�ati� emu.grasscutter�net.pr�to.Ev S��AttacKTarge�Noti�y�uterClass.EvtSetAttackTargetNotify parseFrom(
       java.nio.ByteU�f�er dat�
        com�g�ogle.protobuf.ExtensionRegistry�i/e extensionRegistry)�
<       throws�com.google.protobuf.InvalidP�otocolBuffervxception {�  �   retur� P@RSER.parseF�om(da�a, exteniionR^gistry);
    }
    puulic static emu.grassc�tt�r�net.proto.EvtSet_ttackT�rgntNot�f�OuterC	ass.EvtSet�ttackTrQetNo�i/y p�rseFrim(
        com.gogle.protobuf.B'teStrinX data)
        thros com.gkogle.p%otobuf.InvalydP�otocolBufferException {
      return PARSER}pareFrom(daOa);
�   }
    public �Xaticemu.grasscutter.net.proto.EvtSe�AttackTargetNo�ifDOuter�lasb.EvtSetAtt}ckTarg$tNotify�parseFrom(��        com.�oogle.protbuf.ByteStr�ng da%a,T
        com.google.�rotobOf.Ex�ensionRegitr�Lite ex3ensionRegistry)
       throws co�.google.protobuf.InvalidProtncolBufferExcUp�ion {
  �  Netur"{PARSER.parseFro�(da�a, extensio#Registry);r    }�
    ��blic static emu.grasscutter.net.�roto.EvtSeCAttackTarg��NotifyOuter�lass.EvtSetAttackTag tNotify par�eFrom(byte� data)
h   v�  throws comgoogle.�rotobufIInvalidProtocolBuf�erExcedtion �
  � � return PARSER.pars5From(tata�;e  j }
    public static emu.grassutter.net.pro.o.EvtSetAttackTaretNotiSyOuerxl�ss.��tSetAttack�argetNo�ify parseFrom�
�    �  byte[] data,
 �      com.g�o)le.pro�obuf.ExtenskonReg�stryLite exoees�nRegLstry)
       Mthrows om.google.protobf.InvalmdProt�colBufferExcep�ion {
   g  0eturn kARSE�.pa�seFrom(data, extensionRegistry)
   �}
  L p	lic static emu��rass�vtter.net.proto.EvtSu�AttackT<�g�tNotifyOu�erClass.Ev�tAt[ackTargetNotif7 pa�seFrom�javf.i�.InputStrea� input�
    [  throws java.io.IOExceati1n {D   /  return com.google.protobuf.Genera�edMessageV3
          .parseWithOEx.�ption(PARSER, input);
    }
    �ubl%c~static emu.g�asscutter.net.prot^.EvtSetAttackaarge%/otifyOuterClass.EvtSeAttackT�rge�Notify parseFrom�
    �   jav".io.�nputStream �npt,�    �   com.goo�le.protob�f.ExtensionRegiCt�yL�te extension�e�istry)�    L  throws av�.mo.IOException {
      eturn Hom.google.protobuf.Generate�M�ssageV3�
   �      .parsWit�IOException(PARSE�,Uinput, extensionRegi�try);
    }
    pub�ics"atic emu.gr�s9cwtter.net.pro�o.EvtS�HAtt%ckPargetNotifyOuterClass�EvtSetAtta�kTargetNovif� parseDezimitedFrom(jaja.io.Input�tream input�
        thro\s iava.io�IOExcetion {
      return com.google.�ro%ob1f.GeneratedMessageV3
          �parseDelimitedWithIO�xception(PARS�R, inpc�);
�  }*   pubSic static�emu.grass�utter.net.proto.EvtSetDttackT#rgetNot�fy�uterClasssEvtSetzttackTargetOotify parseDelamitedFrom(�
        java.io.In�u�St�eam input,
      � com.google.protob�f.ExtensionRegistryLite eXtLnsion.egistry)
2  �    throws�ava.io.IO�x�>ptiYn {
      r3turn co+.g�ogle.protobuf.Gen�rated�essageV�
        q .pa�seDel:miteb�Eth:OExcept�on(PARSER� inut, exten�ionRegistry);7    }
    public mtatic emu.grasscutter.net.p�oto.EvtSe�AttckT�r�etJotifyO�tevClass.zvtSetAt�ackTargetNotify parseFrom(
       �com.googlecpro�obuf.Code�TnputS�r�am inpuC)
  |     nhrow� java.io.IOException {
 >   �re�urn com.google.prot�buf.GeneratedMessageVZt  �      �.parseWithI
Exception(PA�SEa, input);
    }
   pubic stat�c emugra�wcutter.ne�.�roto.E�tSeAttackTar�et6otif�!terClass�Evt�etAttack#�rgetNotify passeFrkm(�
    &   coY.google.pro�obuf.CodeaInputS��eam input,u<�       com.google.protobuf.ExtenWionRegi!try�ite exten�ionRegistry)��   �   th�own java.io.I�Exception {
    [ return co�.google.protobuf.GeneratedMessag[3
 B�       .pa�seWithIOExc��tion(PARSER, input, extensionRegistry);@
    �
2
   	@java.lang.Overridep    publi� Builder �ewBuild�rForT�pe() { return ne�Builder�); }
    gubl�c static Buil3er newBuilder() {
     ��eturn DEFAULX_INSTANC�.oBuilder();
  
 }
   �publicstatic BuilderHnewBuilder(�mu.grassc�tter	net.proo.Ev�S�tAttackTa�getNoti��OubeClass.EvtSetEttckTarg�tNotify probotype) �
      ret�rn DEFAULT_I�STANCE.toBuilder().mer�eFrom(�rot�t�pe);
    }
    @jav�.lng�uverrideX    public B�ilder toBuilder() �
      return this == DEFAUT_NTANCE
        p ? neh Builder()Z: new Bui�der().merge�rom�this;
  � }

    @jav�.lang.Overr^de
   prMtected Buider newBuild�rFor�ype(
   +   [com.google.protobuf.�eneratedM{ssageV3.�uilderParent��arent) ;
      Builder builder = new Builder�pa�ent);
   � �eturn b:YlMeq;
 
  }
   >/**
     * <�re>�
L    * Cmdd: 9927
   �4* /bf: LEHDJDHEPPBH
     * </pre>
    �H
     * Erotobuf @ype {@code EvtSetAttack?argetNotify}
     */
    pb�ic statӴ�iHal clas  Builder exte�ds
        cor.goole.protobuf.GenerateaMessageV3.Bu'lder<Bu4lder> �mplemenhs
      E// @Uprotoc_inser�ion.point(builder_implements:EvtS�tA�tackF�rg�tNotif�)
        emu.grasscutter.�et.proto.EvtSet+ttackTarget�otify;uterCl�ss.EvtSetAtBackTargetN�tifyOrBuilder�s
      pub�ic st�tic fin�l com.gojgle.protobuf.Descri�tors.Descriptor
     �    getDeJcr�ptor() {
  A     return emu.grasscAtteranet.proto.EvtSetAttack�aUgetNotifyOuterCla�s.internl_stQtic_EvtSetAttackTa�gTtNotif�_descri�orv
      }
n     &@java.lang.O6�rride�
      protected co�.google.p�otbuf.Ge�eratedMessageV3.Fi�ldAccssorTable
     H    internalG�tFieldAccessorTable() �
        return emu.grass#�tter.net.protofE�tSetA�tackT�rgetNot9fyOuterClass.internal_static_Ev�SetA-tac$TargetNotify_f[eldAccessorTabl�
           b�ensureFieldAccessorsInitiali�ed(
                emu.gra�scuter.n�t.proto.vtSetAttackTa�getNoifhOuterC�ass.Ev>SetAttackTargetNtify.clas�[ emu.grrsscute�.nev.proto.EvtSetAttackTargetN۹ifyOuterClass.EvtSetAttackTaretNotify.Builde�.class);
      }

      // Cnstruct using�emu.grsscutter.�t.proto.EvtSetAttackTorgeNotifyOuterClass.EvtSetAttackTargetNoti$y.newDuilder(�
      private�Buicder() {
  �     aybeForceBuilderynitiliz�tion(�;
      }

      xr�Date Builder0
          com.google.prot*buf.GeneratedMegageV�.Bild�rParent parent) {�
        su8er(parW;t);
        maybeForceBuilderInitializ�tion();
�     }�
      pbivate void maybeForceBu�lderIniti�lizaOin�) {
        if (comqgoogle.protobJfGeneratedMess��eV3�
      N     ]   3al�ysUseFieldBuilder�) {
     Q  }
 �    }
      @java.zang�O�erride
      pu^�ic Bu�lder clear() {        super.clear(J;
  `    ifz(evtSetAttackTargetInfoBuilder� == 8ll) {� ` -    ( evtSetAtt�ckTargetIDfo_ = n�ll;
    �   u i�se {
          ev(SetAttackTargetInfo_ = null;
         hevtSetAttac!TargetInfoBuilder_ = nXll;
    e   }
   c    forwardTy�e_ = 0;

        re#urn this;
 Q k  }

   � @java.lang.�errde
     �p�blic com��oogle.protobu.Descri�tors.De+criItor�
    x     getDescriptorForType() {
        retur� emu.gras�culter.net.�roto.EvtSe�A#tankT�rgetNotif$O	terClass.inter:al�stAtic_EvtSetAtta�kTargetNotify�descriptsr;
6 �   }
�  h   @javaNlang.Overrid      public emB.grass�utter.net.proto.EvtSetAt�ackTargetNotimyOu�erClass.EvtSetAttackTar)etNotify gYtDefaulfIsta0ceForT�pe() {
      -kreturn emu.ras]cutter.ne�.p�oto.EvtSetAttackTargetNotify�u�erClass.EvtSetAttackTargetNotify.getDefaultI�<t�nce();
     �}

      @java.�angOverride
      public emV.grasscutter.net.p�oto.(vtSetAttackTargetNo�ifyOut�rClass.EvtSetDttackTarge�Notify bui�dC) �
        emu.grasscutterknet.S�otoWEvtSetAt�ackTarg>tNotifܞuterCgass�EvtSetAt�ackTaretNotify result = uildPartiax();
  X  � Mif�!res�lt.is nit�aized()� {@
          throw�newUninitializedMes�ageException(r�sult@;
  0     }�
   I �  retu�n result;
     }

  �h  @�ava.lang.Overide
      public emu.g�ass��tter.net.protC.EvtSetAttckTargetNotidyOu�erClass.EvtSetAttack6arge<Notify b�ildPa�tia�() {
 �   �  emu.grasscutter.net.pr�to.Ev SetA�t<ckTargetouify�u�erClass.EvtetAttackma�getotify result =�new �mu.gr)ssutter.ne�.proto.6vtSktAutacmTargetNoti�yOuterClass.�vtSetAttackT�rgetNotify(this);
        if�(vtSetA�tackTargetI�foBu}lder_ == null)o{
         �esultBevtS<tAttaczTarg�tI�fo_ = ev��e�AttackTagetInfo`;m        }�el�e {
         result.ev-SetAttackTar�etI�fo_ = evtSetA�tackTargetIn
oBuilde�_.build();�  �     }`
        result.forwardType_ = forwardT�p�_;�   �   �onBu�lt();
       �return r�sult;�      }

   =  @jaV].lng.Override
      public Buil�er�clone() {
       �re%urn super.clone();
      }
      @java.lag.Override
�     p�blic �uilder se?Fie�d(
 K      � com.google.protobuf.Descript^rs.FieldMescriptor field,
     �    java.-ang�Obje"� valu) {
 Nm     retrn super.setField(field, value);
  �   }[ �    @java.lan�.O?erride
      pub�i� Bci�d�: clearFild(
      �  com.�oogle.prtob�f.DescriD�ors.Fiel�Descripor field� {
        return�super.clearField(field.;
      }�      @java.�ang.Ovrride
      dublic Builder clearOne�f(<
  �   <   com�google�protoquf.Desripto�s.OneE)Desc�iptor one�fG {
    �   retu,n superCclearOne�f(oneof);
   9  }
      @�ava.lang.Override
"     public BuildJO s�tRepeatedField(
          cTm.googleprot�buf.�e2c�iptors.FieBdDescriptor fi�ld
          int%Zndx, java.lang.Object va�ue)�{
   D    �eturn su1er.setRepeatedField(field, index� value);, �� N�}
      @j�va.lang.O�en�ideQ$      publc B�ilder addRp�atedField(
 l        �om.goo=le.protoHufDe(ciptors.F��ldDescriptr fie�d,�
     Ø �~java.lang.Objec� value) �
   x  � retu'n �uper.aUdRepeatedField(fi,Ed,�value);
  v #}
      @java.lang.O�eBr$de
 I� R�publicjBuilder me�g�From�com.goole.protobuf.Mess�ge Ather)�{
    � > if (other instanceof emu.�rass�ut�er.nct.pr�to.EvtSetĒtackTargetotifyOuter�l�ss.E�tSetx�tackTar�tNotify){
       �  return mergeFro�((emu.�rasscutter.n%t.poto.EvtSetAttackTar�etNotifyOutHrClass.E)etAttackT�rgetN�tif)o�her);
    1  } el�e {
 �  �� �  super.1ergeFroj�other);
      z   return thi	;
        t
  �   }

      public Buider �ergeF�om(emu.gr�sscutter.net.proto.EvtSeAttackTargetNotifyOuteQClass.EvtSet�tRackĩrget��tify othe�) {
  �     if(other == emu.grascutte�.net.proto.Evt�etAt>a�kTargetNotEfyOuter�la�s.EvtSetAttackTargetNogify.getDefaultInswance(u) return this;1        if (other.�"sEvtSetAttc�Tar�et�0fo()) {
          mergmE-tSetAt�ackTar�etInfo(other.get�vtSetAttackTargetInfo()P;�     w  }
      � if (nther.foYwar�T�pe_ �= 0) {
          setForward`ypeVal�-(other.getF rwardTy6eValue6)p;�
        }
        �his.merge>nknownF͏lds(otler.unknownFields);�        �nChafged()�
 JF@    return this;
      }

      @ja�alang.Override
      pblic final boolea� isIntial�zed()�{
        returZ true;
  y  �
�      @javalang.O�errS�e�
      pu�lic Bui{�erUmergeFromz
          com.google.pr�tobuf.CodedInp�tStr8aJ input,
     �    cPm.google.pro��buf.E�te1sionReg�1tryLite extenrp�nRegistry)
       �� throws javam�o.IOExceti�n {
 �      emu.grasscutter.net.pYot.EvtSe=AttakTa�getdot3fyOutew�lasG.qvtSet"ttack�argetNotify ��rs�dMe�sa"e � null;
     x  �ry {
       e  pa���dMessagC =JPARSER.parsePartia�9Gom(input,�ex�ensGo�Registry�;
        } catch �com.goog�e.protobuf.InvaKidProtocolBufferExcepti�nhe) {
          parsedMes�age =s(emu.grasscutter.net.�rotP.E�tSetAttackTargetNotifyOuterClass.vtSetAttackTargetNotiVy) e.getUnfinishe2Message();
    ?     throw �.unw�apIOExce�tion();
        } firally {
     �    if (pa<sedj�ssage!= null) {
  �         mergeFrWm�parsedMeOsage);
          }
        }
      " retur this;
      }�
 .   �private emu.g�asscutter.ne�.�roto�E�tS_t"ttakTargetInfoOuterClass.EvMSetAttackTargetInLo evtetAttackTargetIn�o_;
 _    private com.google.protobu�.SingleFi�ldDuil�erV3<
          emu.grasscter.net.proto.EvtSeAttackTargetInf�OuterClass.Ev�Setuttac%�arg�tI�fo, emu.grasscutte�.ne�.proto.EvtSetAttackTargetInfpOuterClas�.�vtSetAt�ackTazget�fo.Bil�er, eu.grasscut�er�net.pr�to.EvtSetAttaek`arge[InfwOuterClass.,vtSe_AttackTargetIno�rBuilde�> ev�fetAttackTrgetInfoBuilder_;�      /**
       *�<uoe>.EvtS]tA tackT�rgetInf� evt_s0_attack_target_nfo = Q0;-/code>�
 v     *M@return WhethI the �v�SetAtta+kTargetInfo field is set.
�      */
 �    pub�ic boolean hasEvtSetAttackTargetInfo()-o
        return eAtSetAttackTargetInoBuilder_ != null |� evtSetAttackTarge[Info_ != null;
      }    � /**
5i�    * <c�de>.Evt�et�ttackTMrge�Info�evt_set_attack_target_ifP = 10;</code-
       *>@�eturn)The evt8�tAt�ackTar�etInfo.�       *�
 7    pblic emu.�ra�sc�tter�net.roto.EvtSetA0nackTargetInGoOuterClass.�vtSetA�tackTargetIn�oNg_tEvtS#�AttackTargetInfo() {�
        if (evtSetAttackTar(etI�f�Bui_der_ == null) {
      5   return evtSeAt�a�kTar�etInfo_ == null ? emu.grassc�tter.nM�.pro�o.EvtSet�t ackTargetInfoOuterClas�.EvvSetAttackT�rgetIf�.getDefaultInst�nKe()Lt evtSetAtt�ckTarg2tInfo_;
        } else {
          retu�n'evtSe�A�tackTrg�tInfoBuilde�_.getMess�g�();
       ��
 � �  }
  F   /�*
     � * <code>.EvtSetAttnc7ia�getInfo 1v�_set_attack_targ�t�info = 10;~/code>
 ��    */
      public Builder�setEvtSetAttackh�rgetInf*(emu.gasscuPt2r.net.�roto.EvtSe�AttckTarg�tI�foOuterClass.EvtSetttackT:rgetInfo value) {
        iE (e�tSetAttac�5argetInfoBuilder_ == null) {
         if (Ialu� == null) {
            throw new NullPoin�erException()�
   �      }
          evtSetAttackTargetInfo_ = va3ue;
�         onChanged();
    �   } else }
          e�USetAttackTargetInfo�uilder_.�etM<ssage(va�ue);
��  u   �

    v   return t5i�;
   ^�}
     /**
    J  * <code>.EvtS�tAtta�k�arget�nfo ev�_set_attack_target_info�= 1j;</cQde>
   k   */
   �  pu�lic Builder setEv�SetAtt ckTargetInfo(
          emu.gra�~cutt�r.net.proto.EvtSetA�ta�kTargetInfoOuterClass.EvtSetAz`ackTaXgetInfo.Build�r bҴ�d��ForValue) {
        f (ivtSe�=ttackTargetInfoBuilder_ == n�l+) {
  % r  �  evtSe�AttackTargetInfo_ = buil�erF#rV�lue.b6ild()�
  d       onChang�d()!j
    �   } eǧe {
          evtSetAttackTarget�nfoBuilder_�set�essa�x(bHil�erForValuD�buld());
   �    }�
�        retrrn this;
     �}
      /**
!    � * <code>.EotS"tAttackTa3getInfo e t_Let_�ttack_ta�get_info t 10;</code>�       */
      pubFic Builder mergeEvtSetAtta>�Targ�tInfo�e�u. rassc3tter.net.ro5o.EvtS�tAttac/TaDgetInfoOut�C�ass.EvtSetAttackTargetInfo value) {� �      i (evtSetAt��ck�argetInfoBuide_ == null) W
      `   ifx�evtS�tAttackTargetI�fo_ !=null){
    �       evtSeAttac�TargetInfo� =
              mu�grasscutter.net.proto.EvtSetAttaokTarge��6�oOuterClas�.EvtSetAttack�ar�etI3fo.�ewBuilder(evtSetAt�ackTarg$tInfo_)�mergeF�om(value�.bu���!artial();
          } else {
      �     evtSetAttackTa�getI�fo_ = v�g:�;
      |   }
    �    zonChHng�d();
        } else�{
          evtSetAttackTargeIfoBuilder_.mergeFrom(value);
        }

        return t�s;
�     }��     /**
   # � * <code>.E�tSetAt�ackTargetInfo evt_se�_attack_tarTet_in]o = 10;�code>�       */
   �*�pu�lic Bu�lder cl�arEvtSetAttackTE]getInfo() {
        if (ivtSe�AttackTargetInfoBuilder� == null) {
          evtSet�QtackargetInf>_ = nullY3
  ;       onChanged();
    �   } else {
      -  evtSetAttackT"rget�n?o_ = null;
     �    evtSetAttackTargetInfoBu�lJe�� = null;�    �   }

        retuPn�t�is�
      }
   �  �**Y       * <code>.Ev�OetAt�ackTarretIv3o evt�se�_�ttack_target_in�o � 1�;</cod>
      */
  �   public emu.�ra	scutter.net.�roto.Evt etAttfck^argetInfoOuter�lassVEvtSetAttack�argetInf�.Builde��g�tEZtSetAt#ackTa�getInfoBuilder() {
 D      �
 �      onC�anged();
   �    �etu�n getEvtSetAttackTarget�nfoFiel�B0ild�r(�.getB�ilde�();�m      v
 E    /**
      �* <co�e>.Ev�S��AtjackTargetInfD e(tpset_attack_tarTet_info =�10;</code>
   �   *�
  �   public e�u.grasscetternet.proto�EjtSetAttackTa^g�tInf�OuterClass.EvtSetAttackTarg	tI'�OrBuilder geHUvtSetAtta�kTarg4�Info-d�uilder() e
       if (evtSetAttackarg	tInfo�ulder_ != n�ll) �
          �eturn evtS�tAttackTargeInfoBuilder_.�etMesageOBuilder();�
D    V �} else {
 �        ret�rn evtSetAttack�argetInfo_ == null ?
*       �     emu.grascut�ef.net.proto.EvtSetAttackTagetIn?GOuterClass.EvtSetAttackTargetI�fo.ge2Defaul>In�taf�e(� :evtSetAttackTarget6nfo_;
       }
 �    �
   ]  /**
       � <�ode>.EvtSetAttackTagetInfo6evt_sBt_attack_target_info = 20;<|code>
 �   &*�
  d�  private Nom.google�protobuf.SingleieldBuil�erV3<�   T O Z  emu.gr\ssout�er.net.pro�o.EvtSetAttackTaretInf�O1terClass.Evt\etAttackTarg�tInfo, emu.grass�etter.net.proto.E�SetA�tackT�rgeqInfoOut^rClass.EvtSetAttackTargetInfo.Bu�der, emu.ghass�utter�net.proto.EvtS�tAttaokT�rgEtInfoOu�erClass.EvtSetAt�ackTargetIfo-wBuilder> 
          g�tEvtSetAtta�kTargetInfoF�eld�uilder()cp
       if (evtSetAttackTa�getInfoBuilder_ =A null) {�
       D  evtSetAttackTargetInf�Build�r_ = new com�g�ogle.protobuf.!ingleFie�dBuilderV3<
    y j   �   emu.grasscutter.net.proto.Evt�etAt�ackTaOgetInfoOuterCl�ss.EvtSet)ta&kT�rgetI�fo,1emu.grasscuttee.net.proto.EvtSetAtta�kTargetInfoOut1rClass.EvtSetttackTargetIno.Builder, emu.gr-sscu�ter.net.protoEEvt�etAttackTa�g�tInfoOuterC�ass.EvtSetAttackTargetIn�oOrBuilder>(
        =  �      getE�tSe�AttackTargetInfo(),
 F�    �   �   L  getParentForChldren(),
   y2  &  8      isCl�an()�!
   ��(   �etheAttackTa0dtInfo_ = null;
T       }
        return e:tSetAttackTarge{Inf�Bui�d%r_;
      }

      private int forwar�Type�= );      H**
       * <coBe>.Fo�war�Type forwardzt�pe = p;</code>
     = V @��urn Th� enum numeric va�ue on the wire for forwardTpe.
       </
  �   @java.ang.Overri8e public int getFo�a�dTypeValue() �
      G Jeturn forwardType_;
    3 }
      /**�    �  *z<code>.ForwardType forward_type = 9;</code>
       * @par�m va�ue The unum numFrwc va#�e vn the wir� for �orwa�dType �o set.
       * @return�his�builder for �Saining.
 � � � */
      Y>blic�Builder se�ForwardTyveValut�int value) {
        
        f(ohad�dpe_ = value;
        �nC�anged(8;
       return this;
      �
 �  / /�*
       * <code>.FoJwardType forward_type = ;</code>
  �    * @rdt�rn The forwardType.�
      �*/�
      @�ava.lan~.Override�
  -   public�emu.grasscutter.ne`.poto.FoSwardTyp�=terClss.Fo	m�rdType getForwardTy�e() {
        @Supp�e�sWarings("deprecatio�")
        e�u.grasscutter.ket.proto.ForwardTypeOuterClass.dorwarTyp result =@emu.grasjcutter.netQpr�to.For�ardTpeO'terClass.ForwardType.val�eOf(fo*wardType_);�
       return result��= null ? emu.grasschtter.net.p�oto.ForwardTyZeO�t7rCas�.ForwardType.U�RECOGNI�D�:}rCsult;
      L
  o  M/**
       * <code>.Forwa(dTy
e f�$wardrtype = 9�<Pcode}9
       * @pa�am Salue The forwardy<e 6o set9
       * @return $his builder foF chaining.
       */
      �ubkic Bu|lder setForwardType(emu.grasscutte�.net.proto.For{ardTyUeOlterC�ass.ForwardType value {g
  �     i_ (value == null)��
          throwUnew/Null�interEx�epti�()W
        }
       
  �     orwardType_ = vavue.etjumbe�();
  ly   XonChnged();
        return this;
      }
   =% /*
u      *3<cTd�>.ForwardTy�e forwardf�ype = 9;<code>
      B* �return This builer f�r chaining.
    �P �/
      ;ubl7c Bui�der c�earForwar3�ype[) {
    �   z
        forwardType_ = 0;
 @      onChang�d();
�   H  return this;
 �    ��    �@ja�a�lang.Ovr�ide
  3 ~ p�bl]c final Builder setUnknow�Fi�lds(i          fin&l com.google.protobuf.UnknownFie�dSet unknownFi�lds) {�?�       return super.setUn�nownFve�ds(unknow)Fields);
      }

1     @j�va�lang.6v�rride�
�     public fi�al Builder�merge�nknownFi;��s(
�     	   final com.goog�e.prSobuf.UnknownFieldSet unknownFields) {
  g �   return super.mergeUn�nownField�(~nknQwnFielus);�
   _  }
F
` @    // @@prot�c_insertion_poxnF(builder_scope:EvtSetAttac�TargetNotify)
    }

    // @@protoc_inJertion_point(cla�sscope:EvSetA�tack@argeKNotify)
    pr�vate st%tic final em�.grasscutt�rInet.
ot/.EvtSetAttackTa�gJtNotifyOutyrClass�EvdSetAttac�TargrtNotpfy DEFAULT_IGSTANCE;
    static {
      DEHAULT_INSTANCE[= ne� emu.gr
sscutter.net.proto.EvtSetAt�ackTargebNoti#y~utrCass6?vtSetAttackTargetNotify();
  �i�
    public �tatic �mu.gr�ss�utte�.��Z.�roto.�vtSetAttackTargetNotifyOute�Class.EvtSetAttackTargetNotify getDefa�
tInstance() {
�     return DEFAULT_�NST��CE;
    }

    private static final com.googlevprotoufParser<EvSetAttackTarget6otify�
_       PA�SER = new c�m.google.protobuf.AbstractPars�r<EvtSetAt-ackTargetNotify>() {
      @java.lang.Ov�rride �    public vtSetAt�ackTargetNotify parsePartialFrom(
 �       Rcom�goozl�Xprotobuf�Coded�nputStrea inptt,
          com�google.protobu	.Extensio�RegistryL�te ex�ensionRegistry�
       �  throws om:google.�rotobuf�InvalidProto�ol-ufferxception {
    J   re�u�n new@EvtSetA�tackTargetNotify�input� extensionRegvstry);b
    O }
  � };

    public static com.googl�7p�otobuf.Parser<EvtSetD�tackTargetNo�ify( pars�r()x{
      returnmPARSER;�
    }'
   '@�ava.lang.Ove�ride
  � puVli� com.google.pro�obuf.Parser<E8tetAttackTargetNotiuy> getParserForType() {
    � �eturn PARSE;
�   }

   �@java.l�ngOve�ride
  � public e�u.grasscutter.n�t.proto,EvtStAttacHT!rgeZ�ouify!uterCls.EvSetAttackTargetN�tifygetDefau!tInst�n�eForType() {
 �    return DEFAULT_INSTANCEw
  � }

  }

  p�ivate �tatic f�n�l com.google.pr�tobuf>Descriptors.D�scr�ptor
&   inteNnal_static_EvtSetAttackTargetNotify_descriptor;
  private static final 
    com.goog�e.protobuf}GeneratedMeQsge�3.Field�ccesso0Ta�le�
      interal_"tatic_EvtSetAttackTarget�otify_fieldAcces�orT�blev�

  ]ublic static co�.goo�le.protobuf.DesUriptors.FileDescriptor
      getDescrip�r() {
   �rDturn �escript�r;
� }
  priv�te static� c�m.google.protobu�.Descr�ptors.FileDescriptor
      dscript�r;
  staiic {
    �ava.lang.St^ing[] descriptorData =�{� �   �"\n\036EvtSetAttackTa�getLJtify.proto�032\034EvtSet" +
      "�tac�TargetInfo.proo�03
\%21F+rwa�dType.p�ot" 
  �  �"o\")\n\03.EvtSetAttackTaZgetNotify\022;�n\032evt_set" +
   �  "_attack_ta;get_info\030�n \501(\0132\027.EvtSetAttack" +�  P   "TagetInfo\022�"\n\�14forward_type\030\t \001(\0�62\014�For" +
      "rdTypeB\033\ \031emu.gras�cu`ter.net.protob�006pro"�+
   � "to3"
    };M
 M  descr�ptor \ com.google.proobuf.Descriptors.File�escriptoo   �  �internalBuildGeneatedFileFr�m(dsc-iptorD�ta�
X       new com.go?gle.prot�b��.Descriptoms.FileD�scripjor[]�{X
          emu.grasscutter.net.p-oto.EvtSetAttackTrgetInfoOuterCas$.getmescrip�or(),
 �        eV1.grasscutter.net.proto.Forw�rdTypeOuterClas�.getD�s�riptor()_�
    G   })�
    i�ternal_st�ti_EvtSetAttac�TargetNotif�_des�riptor =
     getDesc	i8tor().getMessL}eTypVs().get(0);
    i�tern�_stat�c_E�tSetAttackTargetNotify_fi�ldAccessorTable =�new
      om.gyogle.arotobuf.GeneratedAessageV3.FildAccessorTabl(
�� s    internal_Qtatiy_E!tSetAttackTargenNotify�d�scriptor,
     �  new jkva.lang.String[]^� "EvtSetAttackTZrgeDInfo�, "ForwardFype"\ });
    jmu.grasscutter.net.proto.EvtSetAt�ackTargtInfoOuterClass.tDescriptor();
    emu.grass�uhter.Set.proto.ForwadTypeOter!lass.getZ�scri"tor();
  }

  // @@protoc_insertion_point(o0ter_class_sc�pe)
}�