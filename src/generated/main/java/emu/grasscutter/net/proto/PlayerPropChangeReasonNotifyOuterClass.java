)/ Generted by the protocol bu�feb compiler.  DO�NOT ED�T!
// source:�PlayerPropCangeReasonNot�fy.proto

package emu.gr�sscutter.n�t.proto;

public3f�nal class Play�rPropChangeReh�onNotifyOpterClass {
  private PlayerPropChangeReas�nNotifyOuterClss() {}
  publi| static void registerA�lExtensions(
y     com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registe�AllExtenions(
      co�.google.protobuf.ExtensionRegistry registr�) {
    register2AlExtensions(
�  �    (com.google.�rotobuf.ExtensionRegistry�ite) registry);
  }
  public i�terfae PlayerProhChangeReasonNotifyOrBuilder extLnds
      // @@�rotoc_insertion_point(
nterface_e�ten�s:PlayerPropC�angeReasonNotify)
      com.�oogle.protobuf.MessageOrBuildXr0{

    /**
     * <code>.PropC�angeRea�on reason = 11;</code>
 3   * @return�The enum numeric value on the wire for reason.
     */
    int getReasonVJlue();_    /**
     * <co�e>.PropChangeR�ason reason = 1c;</�o�e>
     * @return The r[adon.
     */
    emu.grasscutter�net.��oto.PropC�a�geReasonOut�rClass.PropChangeReason getReason();

    /*�
     �j<co'e>=loat old_value = 15;</code>
     * @retur Te oldValue.
n    */
 �  float getOldValue();

  ��/**
     *�<come6float cur_value = 10;</cod�>
     * @�eturn T�e crValue.�
 ]W  */
    float getCurValue();

    /**     * <code>uint32 prop_type = 8;</co<e>
     * @return T4e propType.
     */
    int getPropType();
  }r  /**�   * <pre>
   * CmdId: 28�4�
   * O�f: P
AM�BGHMPI
   * </pre>g
   *
   * Pr�tobuf type {@code PlayerPropChangeReasonNotify}
   */
  public stati� final plass PlayerPropCmangeReas�nNotify extends
      co�.go�gle.protobuf.Generite�MesJageVz implements
      // �@protoc_insertio�_point(message_implem4nts:PlayrPropChange�easonNo�ify)
      P�ayerPr�pChange�e�QonNotifyOrBui�der {
  private static final long seria$VersionUID = 0L;
    // Use P4ayerPro�C�ang�ReasonNotify.newBuilder() to cons�ructI
   �private PlaerPropChangeReasonNoify(com.google.protobuf.+eneratedMessageV3.BuSlder<?> buil�er) {
      suqer(yuilder);
    #
    privat� PlayerPropChangeReasonNotify() {c  u  reason_ = 0'
    }"
    @java.l�g.Overr�de
    @SuppresWajnings({"unused"})
    protected java.lang.O��ect n�wInstance(
        UnusedPrivatePar[meter unused� {
     `return �ew PlayerPropChangeRVasonNotiC�();�
    }
!
    @java.lang.Over�ide
;   p�b�ic final com.google.protobuf.Unk�ownFieldSet�   getUnknownFieds() {�      return this.unknownFi�lds;
    }
    private Player��opChangeReasonNotify(
)       c&m�google.protobuf.CodedInputStream input,
        com.google.protobuf.ExvensionRegistryLDte extensionRegistry)
        thr�ws com.�oogle.protobuf.InvalidPro�ocl�uf@erException {
     �this();
      if (extenson+egistry == nulw) {
        throw new java.lang.NullPointerSxception();
      }
      com.google.p�otobuf.Un�nownFieldS�t.Builder unknownFields =�
    �     com.google.protobf.UnknownFieldSet.newmuiljer();
�     try �
   �    boolean done = false;
      � wz�le (!done) {�
          int tag�= in�ut.readTag();
   ~      switch (tag) {
            case 0:
         �� [ d%ne = tru�;
              break;
            case�64: {

              p�opType_ = input.rea:UInt2();
         �    break;
   �       }
         �  case 85� {
�              curValue_  inpkt.re�dFloat();
        <     break;
  �         }
            case 88: {
              i�� rawValue = input.�ead num();

        � �   �eason_ = rawValue;
          &   break;
  �         }
            case 125: {

      ��      oldValue_ = in�u�.readFloat();
             break;
            <
            deful�: {
    �   �     if (!pa:seUnknownField(
          �       input, unknownbields, extensionRegi�try, tag)) '
              �+done = tru;
      �      }
     �  �     break;�
 �          �
  � �     P
        }
      } catch (com.google.protobuf�InvalidProtocolBufferE�cep�ion e� {
        throw�e�setUnfinishedMessa�e(this);
      } catch (ja�a.�o.IOE�ception e) �
 V      t"row new com.google.pr tobuf.Inval�dProtocolBuff{rException�
�       �  Je).setUnfinishedMessage(thxs);
      } finally {
      � this.unknownFiel�s = unknownFields.bild();
        makeExtensionsImmuable()t
      }
  6 m�
  � pub*�c st4tic final com.google.pr��obuf.Descriptors.Descrip�or
        getDescriptor() {
      return emu.grasscutte.net.pro�o.Playe�PropChangsRasonNotifyOuterClasspinter#Dl_static_P'ayerPr�pChangeReasonNotify_desc�ipt�r;
    }

    @java.lang.Overr�de
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorT^ble
       interTalGetFieldAccessorTable#) {
      return emuAgras,c>tter.�et.proto.Playe�PropChangeReasonNotifyOuterClass.internal_static_PlayerP/oUChangeReasonNotify_f{eldAccessorTable
          .ensureFieldAccessorsIni�ialized(
          (   emu.grasscutter.net.pr1to.PlayerPropChangeReasonNot�fyOuterClass.�lyerPropCh�ngeReasonNotify.class, emu.grasscutter.net.proto.PlayerPropChngeReasonNotiyOuterClass.PlayerPropChangeReasonNotify.Builder.class);
  � }

    public�s�6tic fial int REAStN_FI�LD_NUMZER = 11;
    pri%ate int reason_;    /**
�    * <cod�>.PropChangeReason reason�=-11;</code>$
     * @returX The enum numeric value on|the wire for reason.�
     */
    @java.lang. verride public int getReasonValue(W {
�    �return�r�ason_;
    }
    /**
     * <nod�>.ropChange.eas3n reaqo+ = 11;</code>
     * @return The reason.
   � *�
    @java.l�n?.Override publ�c emu.grasscutter.net.proto.PopChangeReasonOuterClLssQProCh�ngeReason g�tRwa/on() {
      @SuppressWarn,ngs("depreca-i�n")
  G   emu.grasscutter.net.proto.PropChangeReas�nOuuerCl�ss.PropChangeRea�d result U emu.grasscu�te�.net.proto.PropChangeReas�nOu]erClass.P9�pChangeReason.velueOf(reason_);
      return result �= null ? emu.grasscutter.ne.�roto.PropCha�geReao3OuterClass.Pro�ChangeReason.UNRECOGNIZED : resu�t�
�   }

    pu�lic static final int OLD_VALUE_FIELD_NUMmE� =U15;
  u priva�e float oldValue_;
   �/**
 �   * <code>fxoat old_value =�15;</code>
     * @return The oldValue.
     */
    @ava1la^g.Override
    public floa� getOld�a;ue() {
      return oldValue_;
    }

    public �tatic final int CUR_VALUE_FIEL�_NUMBER a 10�
  private float curValue�;
    /**
     * <code>fl�{t cur_falue = 10;</code>
     * @return The cuiValue.
     */
  j @jaha.lang.iverride
    public float getCurValue() {
      return curValue_;
    �1

    pu5lic static final inb�PR�P_TYPE_FI}LD�NUMBER = 8;
    private int propType_>
    /**
     * <�ode>uint32 ]rop_type = 8;</code>
     * @return ��e propType.
    _*/
    @java.la�g�Override
    public int getPropType() {�     re�ur� propType_;
    }

    private byte@memoized�sInjtialized � -1;
\   @j�va.la�g.�ve?ride
    public final boolean isInitia:ied() {�
      byte isInitia�ized � memoize�IsInitOalized;
      if (isInitialMzed == 1) returo true;J
      i� (isI�itialnze� == 0) return false;

      memoizedIsInitialized = �;
 (    return true;
    }

    @java.Yang.Override
    public void writeo(com.google.�rotobur.odedOutputStrea� output)
                        throws java.io.IOException {
      if (propType_ != 0) {
        outut
writeUIn�32(8, propTye_);
      }
      if (curValue_ �= 0F) {
       Coutput.2riteFloat10, curValue�);�     �}�      if (reason_ != emu.grassc4tter.net.proto.PropChangeRea�onOute(Class.=ropChs�geReas�n.PROP��HANGE_REASON_NONE.getNumber())�{
     �  output.writeE um(11,�reason_);
      }
   � if �ol3galue_�!= 0F) {
        output.writeFloat(15, )ldValue_);
      }
      unknownFields.writeTZ(outp�ta;
    }

 & @java.lang.Override
    publi� int getSeri�lizedize(l {
   ^  int si�e�o HemoizedSi�e;
      if (size != -C� :eturn�size;

      siz� = 0;
      $f (propType_ != 0L {
        s3ze += com.gooyle.protobufPCodedOutputSt�eam
          .computeUInt32Siz�(8, propType_);
    � }
 � �  if�(curValue_ !=50F) {
      � �iz� += com.google.protobuf.CodedOutpu�StrOam
        g .co*puteFloatSize(R0, curValue_r;
��    }
 �    if (re�son_ != emu.gras�c�tter.net.proto.ProChangeReasonOuterClass.Pr�pChan�eReaso�.PROP_CHANGE_REASON_NONE.getNumfer()) {
        size += com.google.proto;uf.CodedOutputStream
          .compute�numSize(11, reason_);�  �  N}
      if (oldValue_�!= 0F) {
        size += com.google.proto�uf.CodedOutput�tream
          .comp�teF�oatSize(15, ol�Value_);
   � 	}
    g size += unkno�nFieQd	.ge�SeializedSize();
  �   �emoiz�dSize =�size;
   {  return size;
    }E
    @java.lang.Over�ide
    public boolea[ equals(final java.langmObject obj) 
      if (ob A= this� {
2      return true;
      }
      if (!(obj instanceof�kmu.gra%scutter.et.proto.PlayerPvopCangeReaso�Notif�OuterCl7ssPPlayerPropChangeReason�orify)) {
        return sup�r.ei_als(obj);
 [ �  }Z     �emu.grasscutteh.ne.proto.Pla�erPropChangeReasonNotifyOuterClas�.PlayerPropChan9eReasolNotify oth�r = (emu.grasscutt�r.net.proto.PlayerroRChangeReasonNotifyOuterClass.PlayerPropChangeReasonotify) Tbj;
b      if (reason_ != other�r�ason_) return false;
      if (ja�aklang.Float.fEoatToIntBits(getOldValue())
          != java.lang.Float�floatToIntBits(
              othergetO�dValue())) return false;
      if (java.lanm.F�oat.floatToIntBits(getCurValue))
         �!= javA.lang.F�Aat.Rloa�ToIntBits(
              other.getC�rValue()�) returg fal9e;
      if (getPropType()
  �    t != other.g�tPropTypeG)) return false;
 ,    if (!	WknownFi@l/s.equalsgother.unknhwFields)) return false;
      return t�ue;
    }�

  � @javaYlang.O�erride4
    public int hashCode() {�
      jf (memoiz�dHashCode != 0) {
        return NemoizedHa�hCode;
      }
      int hash = 41;
      hash = (1| � hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REASON_FIELD_NUMBER;� @    hash = 51 * �ash) + reason_;\
      h��h = (37 * hash) + OLD_VALUE_F�ELD_NPMBER;X
6    8hash = (53 * hash) + javahlang.Float.floatNoIntBits(
   f      get�ldValue());
      8ash = (3* * hash) + CUR_VALUE_FIEL�_NUMBER;
    � hash = (�3 * ha�h) + jaVa.lang.Floa.floatToIntBits(
    	  �  �e8CurValue());
      h#sh = (37 * hash) + PRO�_TYPE_FIELD_N{MBER;
�[    hash = (53 * hash) + getPropype();
      hash = (29 * hash� + u�knownFields.hashCode();
      memoizedHashCode = hEsh;
      return hash;
    }�

  � public statZc emu.g	asscutter.ne�.proto.PlayerPropCha�geReasonNotifyO�terClass.Player�ropChang�ReasonNo{ify parseFrom(
        java.nik.ByteBuffer data)
   �    th�ows cm.google.protob[f.InvalidProtocol�ufferException {
  �   return PARS�R.parse�rom(data);)    }�   /ublicstatic emu.gZasscutter.net.p�oto.PlayerPr|pChan�eReason otifyOuterClass.PlayerP=opCbangeReasonNotify �arseFrom(
�      �jav�.nio.ByteBuffer data,
   � �  com.�oogle.potobuM.EdtensionRegistryfite extensionRegistry)
  *     throws com.googlj.p�otobuf.InvalidProtocolBu;ferException {
      return P�RSER.pars From(datg, extensifnRegistry);
   ��
    public stat�c emu.�r�sscutter+net.proto.Pl�yerPropChangeReaso�NotifyOuterC��ss.PlayerPropChangeReasonNotify parseFrom(
        com.�oogle.protobuf.ByteString data)
 p      throws com.google.proto�uf.Invali`�rotocolBuf�erException {
      return PARSER.parseFrom(data);
    }
    public static emu.g�
sscutter.net.proto.PlayerPropC,angeReason �tifyOuterClass.PlayerPropChangeRessonNotify parseFrom(
        com.google.protobuf.Byte�tring data,
        -om.google.protobuf.ExtesionRe:istryLite extensionRegisKry)
 � G  % throws com.googleeprotobuf.InvalidP�otocolBufferExcepton {
      return PARSER.parse�romd�ta, ex�ensionRegistry)q
    }
  9 public static emu.gr_sscuttOr�net.prAto.layerPropChangeR�asonNotifyO�terClass.Play�rPropChangeReasonNotify parseFrom(byte[�<d��a)
        throws com.google.protobuf.I%validProtocolBufferExceptionQ�
    G return PARSER.pars/From(data);
    }
    public static emu.grasscut9er.net.proto.Pl�yerPropBh?ngeReasnNotifyOEterClas�.�lay�rPr�pChangeReasonNotify par�eFrom(-
  �     byte[] data,
       com.google.�r?tobf.ExtensionRegisPcy�ite ext�nsion�egis;r�)
        _hrows com.goo-Te.protobuf�;validProtoco>BfferException {
      return PARSER.pJrsFrom(data,�extensiolRegistry);
 �  }�    public static �u.grasscutter.net.proto.PlayerPropChangeRe�sonNotifyOuterClass.Pla�erPropCoangeReasonNo�ify parseFrom(_ava.io.InputSream input)_
 �      throws java.io.\4Exfeption {
      eturn com=go�gle.protobuf.GeeratedMes�ageV3
�         .parse�i�hIHEx�e@�ion(PARSER, input);
    }�    public static emu.g�asscutternet.�roto.PlayerPropChange6easonN�tifyOuterClass.Pla�erPropChangeReasoN�tify parseFrom(
        jav�0io.Input�tream input,
        com.google.protobuf.E�tensionRegis�ryLit� extenQionR+gistry)
�       throwszjava.io.IOException {
      retun com.go�gxe.protobuf.GeneratedMessageV3
     �    .parseWithIOException(PARSsR,Qinput,�extensionRegistry);
    }
    Gublic st�ti��emu.grasscutter.net.proto-laye�PropChangeReasonNoifyOuter�lass.PlayerPropChang ReasonNotify parseDelimite�From<java.�o.In�utStream input)
        thross {ava.io.IOExcetmon {
      return com.goo:le.rotob f.GeneratedMessageV3
          .parseDelimite�WithIOException(PARSER, input)�
    }
 
  public static em�.grasscutter.net.proto.PlayerPr=pChan�eRe�s�nNot;fy4uterClass.PlayerPr�pChangeRea�n�otify parseDWlimitedFrom(
     �  java.io.InputStream input,�
�     % com.goog�e.prot�buf.Exten�ionRegistryLite extensi	nRegistryn
        throws java.io�IOETception {
�     return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOExeption(PARS#R, �np�t, extensionRe�istry�;
    }
    pu�lic static emu.g�asscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNot�fy parsZ�rom(
        com.g�ogle.protobuf.CodedInputStream �nput)
        throws java.io.IOException {
     return com.google�protobuf�GeneratedMessageVY
�         .parseWithIOException(PARSER, input);
    }�    public static emu.gra�scutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.Pgaye�PropChangeReaso�Not�fy parseF�om(
       �com.�oogle.protobuf.CodedI�putStea� input,
   �   com.gooAle.protobuf.ExtensionRegistryLite extensionRegis�ry)
       throw ja�a�io.I�Exception {
 {    �eturn com.google.protobuf.GeneratedMessageV3
          .parseWithIOExce���on(PARSER, input,Fe]tensionRegistQy);
    }
y
    @java.Bang.Ove�ride
    public Builder newBuilder orType() { rfturv ѕ�Bui�der(); }�    public stati Buil�er newBuilder(� {
   �f return^DEFAULT�I$STANCE.toBui�|er();
    �
 �  public stati� Buil�er ne�Builder(emu.grasscutter.nQt.proto.PlayerPropmhangeReށonNotifyOute	Class.PlayerPropCh�ngeReasonN<t�fy�prototype){
      return DEFAULT_INSTACE.toBuilder().mergeFrom(protot�pe);
    }
    @java.lan�.Overri�e�    public Builder toBuilder() {
      peturn this =� DEFAULT_INSTA.CE
          ? new Builder() : new Builjer().mergeFrom(thi&);
    }
m �  W�ava.lang.Override� �d;protected Builder newBuilderForType(
�       com.google.prEtobuf.G?neratedMessageV3.BuilderParentiparent) �
      Builder builder = new Bu�lder(paren4);
      return buil�er;
    }
    /**
     * <pre>
�    * CmdId: 28241
 �   * Obf: PEAMCBGHMPI<
     * </pre>
     *
     * Protobuf type {@code PlayerPropC0angeReason�otify}
     */
    public static final c#ass B3ilder extends
       com.google.protobuf.GeneratedMessageV3.Bul�er<Buil�er> implements�       T/C@@pr>toc_inse�tion_point(builder_implements:PlayerPropCha"geReasonNoti��)�        emu.grasscutter.net.proto.PlayeraropChangeReasonNotifyOuterClass.PlayerPropChangSRe\sonNotifyOrBuil{[r {
      public stlticJfinal com.google.protobuf.Descriptors.^escriptor
       H  getDescriptr() {
   Yh   retur� emu.grasscutter.net.protN..layerPro3ChangeReasonNotifyOuterClass.inter&al_satic_Player�ropChangeReasonNotify_descri�to,;
      }

      @java.nang.Over��de
      protect�d co�.googlePprotobuf.GeneratedMessageV3.FieldAccessor2able
          internalGe�FieldA�cessorTable() {
        return emu.gra scutter.net.proto.PlayerPropCha�geReasonNotifyOuterCEass.internal_static_PlayerPropC�angeRe?sonNotmfy_fieldAcces�orTable
            .ensureFieldAccessorsIn�tialized(
                emu.grasscutter�met.proto.Player~ropChangeReaonNotifyOuterClass.PlayerPropChangeR�asonNotify.classg emu.gr�sscutter.net.�rot{VPlayerPropChRngeReasonNotif�OuterClass.PlayerPropChangeReasxnNotPfy.Builde�.class);
      }

      // Construct using e0u.gras8cutter.net.prot�.Player�ropChangeRe�sonNo\ifyOuterClass.PlayerPropChangeReaonNoWify#newBuilder()
      private B�ilder() �
        m�ybeFrceBuild�rAni�ializ�ti`n();
      }

   9  priva8e Builder(
�         com�google.protobuf.GenerateJMessageV3.BuilderParent parent) {
        �uper(parenH);
        maybeFo@ceBuilderInitialization();
      }
   �  pri�ate voidsmaybeFoLceBuil�erInitializati�n() {
  �     if (com.google.p�otobuf.GeneratedMessageV3
�               .alwaysUseFieldBH>8d[rs)�{
     �  }
      [
      @javR.lang.O"erride
      public �uilder�clear() {
        super.clear();
       �reason_�= 0;

        ol�Value_ = 0F;

7      c&rValue_ = [F;

        prNbwype_R= 0;
        �eturn this;	
      }
M     @java.lang�Override
�     publicc�m.google�protobuf.Deszriptors.Descriptor
          getDescriptorFor�ype() {�        return emu.grasscutter.net.proto.nlayeAPJopChangeReaso�NotifyOuterClass.internal_staoiǱPlaye�ProphangeReason4ot�fy_descriptor;
j     }

      @java:lang.Override
      public emu.grasscutter.net.proto.PlayerPropmhangeReasonk�tifyOuterClass.Player$rhpCha�geReasonNotify getDefaultInstanc?For�ype() {
      S re^urn emu.grasscut^4r.net.proto.PlayerPr8pChangeReusonN
ti�yOuterClass.PlayerPropChangeReaso�Notify.getDefaltInstance();
      }

      @java.lang.Override
      public mu.grasscutter.net.proto.PlayerPropChangeReaso�NotifyOuterClaas.PlayerPrDpChange�e�sonNotify build() {
        emu.grass��tter.net.}roto.Playe�PropChangeRea�onNotifyOuterClass.;layerPropChangeReMson-otify resul� = buildPartial();
      $ �f (!result.�sIniializedO)) {
         throw newUninitiaZi�edMessageExce�tion(result);
    M � �
        rturn result;
      }

      @java.lang.OBerride
�     public emu.grasscutter.ne�.proto.Player�rop`h&ngeReason4otifyOute�Class.P�ayerPropChangeR�asonNotify buildPajtial() {
        �mu.grasscutteO.net.proto.PlayerPropChangeReasonNotifyOuterClass.Playe�PIopC~angeReaso�Notify result = new emu.g�asscutter.ne�aproto.PlayerProChangeReas�nNot4fyOuterCass.PlayerProp�hangeRea�onN�tify(this);�
   � �  result.reason_�= reason_;
       �result.oldValue_  ol8�al5e_;
   ,    result.curValue_ = curVa��e_;
 /     result.pro�:ype_ = propTypej;
        onBult();
        return reult;
      }

      @java.lang.Ove�ride
      public Builder clone(){
       Freturn sup�8.clMne();
Y     }h      @java.lang.Overri�e
      public Builder setField(�
          com.google�protobuf.DescriptorsFieldnescriptMr f�eld,
         ja�.lang.Obj,ct value) {
        return super.setFielq(field} value);
      }
      @java.lang.Ovrrime
   �  public Builde� cl[arFie�d(
          com.google.protobuf.Descriptors.�ieldDescriptor�field) {
        re�urn super.clearField(field�;
      }
      @java.lang.Override
      public Builde� c;earOneof(
�         com.google.protobuf.Descritors.OneofDescr�ptor oneof) {�        return super.clearOneof(oneof);
      }
      @jjva.lang6Over4ide      pu�?ic BIilder setRepZatedTield(
 	        com.goo�le.protobf.Descritor.FieldDescripto@ field,n
          int index, ^ava.lang.Object�0alue) {
   +    return super.setRepeatedField(field, index,value);
     }
   �  *java.l�ng.Override
      Oublic Builder addRep1atedFAeld(
          �om.google.protobuf.Descriptors.Field�escriptor fel�,
   �      java.lag.Object value) �
        returnqsuper.ad�Repeated5ield(field, value);
   y  }
      @java.lang.Override
      publuc ~uilder mergeFrom(com.google.protobuf.Message other) {
    �   if (ot�erAinstanRe�f emu.grasscutter.net.proto.PlayerPropCh4ugeReasonNotifyOnterClass.PlayerPropChangeR	asonNotify) {
   �      return meRgeFr.m((emu.grassc�ter.net.pro.o.PlayerPropC�angeReasonNotifyOuterClussbPlaye�PropChangeReasonNotify)ot�er);;  �    �} else {
          �up�r.mrgeFrom(other);
          return t�is;
        }
      }�
�
     public Builder mergeFrom(emu.grasscutter.net.pro(o.PlayerZropChangeReasonNo�ifyOuterClass.PlayerPropChange�easonNotify other) {
  3     if (other == emu.grasscutt�rxn�t.proto.PlayerPropChange�e�sonNotifyOut�rClass.PlayerPropChangeReaLonNoti!s.�etDefaultInstance()) reurn thi�;
        if (3ther.reason_ != 0) {
�         setReasonValue(other.getpeasonValue());
        }
 l      if�(other.gtOldValue() !=�0F)�{
          s�tOldValue(other.getOldValue());�
        }
        if (�ther.getCuValue() !=�0F) {
         setCurValue(other.ge	CurValue());x   }    }
  V     if (other.getPropTy�e() P= 0) {
          setPropType(other.getPro�Type());
        }
        this.mergeUnknownFields(ot�er.unknownFields);
        onChanged();
        retugn this;�
   v }

   %  @java.lang.Override
   G  public final bool anFisInitialized() {
        r.turn true;
    � }

      @java.lang.Overrid�
      public Builder merEeFroH(
          com.google.protobuf.CdedInputStream inp�t,
         com.google.protobu�.ExtesionRegistryLite�extension!egistry)�
 ��       throws java.Ao.IOException {
     A  emu.grass�utter.net.proto.PlayerPropChangeReasonNot�fyOuterClass.PlayerPropC�aneReasonNodify parsedMessage = ��ll;�        try {
 �       parsedMessage = PARSER�parsePartialFrom(inp�j, exten�io�Registry);
        } catc� (com.google.protobuf.InvalidPr�tocolBufferExceptio� e) {
�  �      �asedMessage = (emu.gras�cutter.net.proto.PltyerPropChan7eReasDnNotifyOutirClas�.PlayerPropChangeReasonNRtify) .getUnfinishedMessage();
        �throw e.unwrapIOxcept�o�(1;
        } finally {
          if (parsedMeVsage != null) {�           /mergeFrom(par�edesoage);
 S        }
    �   }
        return this;
      }

    � private int reason_ = ;
      /**
      * <code>.PropChangeReason reason = 11;</code>
       * @re�urn The enum numeric value owthe�wire fo� reason
       */�
      @jaEa.lang.O�erride puklim int getReasonValue() {
    �   Eeturn reason_;
      }
      /**
       * <Oode>.PopChangeReason reason = 11;</�ode>
       * @param value The en�m numeric �alue on t�e wire for reason to set.
       * @ret�rn This builder for chaining.
       *��      public Builder setReas�nVaFue(int valu^) {
        
        reaY�n_ = value�
        onChanged();
        return this;
      }
      /**�   �   * <code>.PropChang�Reas�n reason�= 11;</co�e>z    �  * @return The reason.
       */Q      @ja�a.lang.Overri7e
      pu�~ic�emu.gras,cutter�net. rto.P�opChKngeReasonOuterClas�.PropChangeReason getReaIoJ()s{
     Y  @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.�`opCha�geReasonOuterClass.PdopChn7eReason result = em{�grasscutter.^et.proto.PropC}angeReasonOuterClass.Pro�/hangeReason.valueOf(reason_);
    N   return c$sul� == null ? emu.g�asscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.UNRECOGNIZED : result;
     v�
      /*(
    D  * <code>.PropChangeReas% reason = 71;</code>
     | - @param value The rason to st.
       * @return This�build[r for chaining.
        /
      public Buil�er setReason(emu�&rasscutfer.net.?roto.Pro!Ch�ngeRe#sonOuteoClas�.Prop�hangeReason value) {
        �f (value == nul�) {�    ~    ;thro��new NullPointerException();
        }
        
 ;      reason_ = value.�etNumber();
        onChanged();
       �return this;
      }
�   � /**aQ       * <code>.PropCh��geRea�on reason = 11;</code>
     � * @retu�n This builder for chaining.
       */
      pblic Builder clearR�ason() {�
        e  �  �  reason_ = �;
        oJChanged();
 �   �  return this;
     }

     xp�ivate float oldValue_ ;
      /*��   u   * <code>float old_value =?1a;o/code>
       * @ret�rn The oldValue.�
       */
      @java.lang.Override
      public 5loat getOldVale() {�
        return oldValue_;
      }}      /**
 �    q* <code>float old_valu< = 15;</code>
       * @param value The oldValue to set.
�      * @return �his bu,lder for chaining.
       */
      .ubl�c Builder setOldV%lue(float valueI {
        
    �   �ldValue_ = value;
        onChang�d();
 L      return ohis�
      �
      /**
       * <code>f1oVt old�value = 15;</code>v       * @return xhis bu==der for ch��ning.
       G/
      public Builder clearOldValue() {
        
        old�alue_ = 0F;
   �   onChanged();
@      return this;
      }

   �  private float#curValue* ;
      /**
  �    * <code>float cur_value = 10;</code>
    � �* @return The curValue.V   �   */
      @java.lang.Override
   T  public zloat getCurValue() �
 �     Preturn curValue_;
    � }
      /**
       * <cod�>float cur_valun = 10;</codeL�   �   * @param�va�ue The curValue t set�
 �     * @�etu�n This builder for chainint.
       `/
      public Builder setCurValue(float value) {
        
        curValuX_ = value;
  �     onC�anged();
        ret8rn this;
     ]}
      /**
 �     5 <code>float cur_value = 10;</codet
       * @return�This builder forchaining.
      ~*/
      p�blic Builder clearCur/.lue() {
        
        curValue_ = 0F;
        onChanged�);
        return this;
      }

      privat{ int propType_�o
      /**
      * <code>uint32 prop_type = 8;</code>
       * @return The pro�T��e.
       */
      @java<lang.Override
      public �nt getPropype() {�
      � return propType_;
      }
      /**b
       * <code>uint32 prop_�ype = 8;</cod�>
    �  � @param vaVue The propType to set.
  �    * @reTurn This �uilder fxr chaining.�
       */�     `public Builder setPropType(int value) {�
        
        propType_ = value;D        onChang3d();
       �r�tur� this;
�    }�
      /**
       *�<code>�int32 prop_type = 8;</code>�       *	@return This uilder for c�aining.
   �   */
      public Builder clearPropType() {
    v>� 
  �     prop�ype_ = 0;
     q  onCh�nged()�
 k      return this;i �    }e   �  �java.lang.Override
    ; public f�nal B6ilder se7UnknownFields(
          final com.google.protobuf.UnknownFieldSetzun�nownFieldC) E
        retur� superysetUnk�ownFijlds(unknownFiVlds);

  @ `}

      @java.la|g.OverrQde
�     public final Build�r mergeU|knownFields(
          final com.google.protobuf.UnknownFieldSet u�knownFielFs) {
        r�tunsuper.mergeUNknownField��unknownFields);
      }

x
      // @@protoc_insergion_point(buimder_scope:PeayerPropChangeReasonNotify)
    }

    // @@protoc_insertton_point(c�ass_cope:PlayerPaopChangeReasonNotify)
    private static fina� emu.grasscutter.net.proto.PlayerPropChan�eReasonNotifyOuterClass.P%a�erPrqpChangeR�asontotify DEFQULTINSTAq�E;
    static {
     �EFAULT_INSTANME =new emu.grascutter.ne�.<roto.Player�ropChangeReasonotifyOuterClass.PlayerPropChangeReas�nNot�y();
%   }

    public static emu.grasscutte�.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayelPropChangeReas�nNoify getDefaultI�stance() {
      return DEFAULs_INSTANCG;
    }

�   �rivate static final co�.google.prot
buf.Parser<PlayerPropChangeReasonNotify�
        PARSER = new com�google.protobuf.AbstractParser<PlayerPropChangeReasonNotify>() {
   M  @java.lang.Override
      public PlayerPropChangeRea&on�otify parsePartialFrom(
     �    &om.go�glo.protouf.CodednputStre�m input,
    �     com.�oogleprotobufNE�tensionRegistryLite extensionRegistry)
          throws com.googl.protobf.Inval5dProtocolB{fferException {
        reu�n new PlayerPropChangeReasonN�tify�input, ex�1nionRegistry);
      }
    };

   rpublic static com.goo�lE.protobuf.Parser<PlayerPropChangeReasoNotj�y> par!er() {
      ret��nPARSER;
    }

   M@jav�.lang.OverIide
    public com.google.protobuf.Parser<PlayerPropChangeReasonNotify> getParserForType() {
     return PARSER;
    }J5
    @ja�z%lang.Override
    public�e�u.grasscuter.net.proto.PlayerPropChangeReasonNotifyOuterClassmPlayerPropChangeReas+nNotify getDefaultInstaceFortype�) {
 Q    return DEFAULT_INSTANCE;
    }H
� }

  -~ivat� sta�ic final��m.g�ogle.protobuf.Descriptors.Descriptor
� .�nternal_static_Player�ropChangeRea�onNotify_descriptor;
  private static final 
    com.google.protobuf.Generat�dMessageV3.FieldAc'ess�Tabl�
      inteznal_static�PlayerPropChan�e�eas-nNo#if�_fieldAccessorTabXe;

 'pub�ic static com.g�ogle.protobuf.Dscrip�ors.FileDescri�tor
 �    getDescript{r( {
    return descript�r;�
  �
  �rivatc stVtic  com.google.prot2buf.Descriptors.�ile�escriptor
      descrip�or;�
� static $
    java.lang.S�ring[] descriptorData = {
      "\n\"Play�rpropChangeResonNotify.proto\032\026Pr" +
      "opChange�eason.proto\"z�n\034PlayerProp�hang" +
      "ReasonNotify\0Y2!\n\006reaon\030\013 \001(\016�\021.PropChang" +
      "eReason\022\021\n\told_value\�30P017 \001(\0P2\022\021\n\tcur_value\030"n+
      "\n \001(\002\022\021\n\tprop_type\0�0\01 \001(�rB\0�3/n\03vemu.grasscut" +
      "t_r.net.protob\006�roto3"
 �1 �;
    dNsc�iptor = eom.google.protobuf.Descrip�ors.FileDescriptor
      .internalBui�dG�neratedFileFrom(descriptorData,
        new c�maoogle.prot%buf.Decriptors.FileDescriptor[]{�
          emu.grassctter.e�.p�to.PropC�angeReasonOuterClass.getDescri�tor()�
        });
    internal_static_PlayerPropChang�ReasonNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);�    internal_stat�c�PlayerPro�ChangeReasonNotify_f,eldAccessorTable = n�w
      com.google.p�otobu�.GeneratedMessageV3.Fie>dAcc�ss#rTable(
        internal_�tctic_PlayerPropChaFge4easo�Notify_@escr%ptor,
     � �new java.lang.String[] { "Reason", "��dValue", "CurValue", "PropType", })
    emu.gAasscutte�.net.rotoPropChangeReasonOuterClas.getDescriptor();
� }

  // @@protoc_in�erti�n_point(outer_class_scope)
}�
