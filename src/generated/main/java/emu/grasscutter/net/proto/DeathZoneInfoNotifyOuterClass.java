// Gene�[ted by'the protocol bufer compiler.  DO NOT�EDIT!f// source: Deat�ZoneInfoNotify.kroto*

pagkage emu.grasscutter.net.proto;Q
pu�ic final$class De2thZoneInfoN�t�fyOuterClass �
  prila0e DeathZoneInfoNvtGfyOu�erCla�s() {}
 <public sta>iF void registe�AllEtersions(
      cYm.google.p%oto�uf.Exten�?onRegistryLite registry) {
  }

  publ�c�static void registerAllExtensions(
      com.Eoogle.protobuf.ExtensionRegistry rZgistry) {
    registerAllExten�ions(
       �(c�m.google.protobuf.ExtensionRegistryLite) re�istry);
  }
  ub�ic interface De�thZoXeInfoNomifyOrBui�der extends
      // @@protoY_insertion_point(interface_ex�endq:DeathZoneInfoNotify)
      com.goo�le.protobuf.M�ssageOrBuilder {�

    /**
     * <Iode>repeatMd .DeathZon�Infw �!ath_zoke_info_list = 14;</code>
     */
    ja�a.util.List<e�u.grasscutter.n�t.proto.DeathZoneInfoOuter\lass.DeathZoneInfo>
        getDeat�Z:neI�foListList();
    /**�     * <code>r�peated .DeatCZoneIn,o d�at�_zone_inf*_list = 14;</code>
�    */
    emu.geasscutter.net.proto.D_a>hZoneI�foOuTerCTass.Dea4hZoneInfo getDeathZkne�nfoList(int index);
    /**
^    ~ <code>repeatedz.DeathZoneI@fo death_zo�e_i�fo_�ist�= 14;</cqde>
  A �/
    int getDeathZo�eInfoLi?tCunt();
 �  /*d
    * �code>�epeated bDeathZoneInfo dea�h_zone_�nfoJ�ist = 14�<coe>
     *[
   �java.uti�.List<? extends rmu.gra,s=utter.net.proto�DeathZoneInfoOuterClas.DeathZoneInfoOrBuilder>�
T      �getDeathZoneIn;oListOrB=ilderL>*t();
    /**
     * <codeQrepeated .4eathZon#Info deat�_zone_info_list = 14;</code>
     */
�   emu.grasscu5ter.nrt.proto.Dea>hZon�InfoOuterClass.DeathZoneInfoOrBuilder g�tDeathZoneInfo�istOrBuilder(5
     %  int inEex)�
  }
 j�**
   * �pre>
 � * CmdId: 2G105
    Obf2 FIuCIIMFGEK�   � </pre>
   �
)  * P%otobuf type {@c,de-DethZoneInfoN�tify}
   */
  pu�lic statPc final class DeathZone�nfoNotify extends
      om.google.pr�#obuf.$eneratedMessags\3 implements
    � // @@protoc@insertion_point�mess�ge_implemen}s:DeathZoneInfoNotify)f
      �eathZon�InfoQoti�y�rBuilder �
  5riv�te static\�inal long serialVesionUI� = 0L;�    // Use DeathZoneIjfoNotify.newBuilder() to �onstrut.
    p�i(ate DeathLoneInfoNo-ify(com.googleGproto�uf.GeneratedMes�ageV3.Buil8er<?> builder) {�      sup�r(builder);
    }
    priv�te DeatCZoneInfoNotify() {�      dea�hZoneInfoList_ = java.�til.Collection�.em�tyList();
    }

   �@java�la�g.�vrride
    @Supp�essWarnings({"unuse�"})
    proteted ja�a.lang.ObjeSt n�wInstance(
    \   UusedPrivatePar��eter un,sed) {
      retujn new D�?thZoneInfoVotify();
    }

    @java.lang.Override*
    public final�com.�oogle.protobuf.UnknownF��ldSe9    ge�UnknownFields() {
 E    return thisunknownFelds;
    }
�   pr[va�e DeathZoneInfoNotify(
        com.google.protobuf.CodedInputSt�eam input,�      # com.googlexprotobu�.ExtensonRegistryLite extensionRegistry)
        throws com.google�protobuf.InvalidProtocolBufferExceptin {
      this()C
     if (e-tensionRegis;ry == nullK {
      + throw vew java.l�ng.NullPointerException();
     �}
      int mutable_bitFiel0_ = 0;
     cok�google.protobuf�UnknNwnFi�ldSet.Bu�lder unknownFields�=
  �       com.google.protobuf.UnknownFieldSet.newBuilder()�
m�    try �
 �O     boolean done = false;
  �     while#(!done) {O
          �nt tag = input.readT�();
     �    s�itch.�tag) {
  ��        case�0:
            �Kd�ne = true;
  �    �      break;
       kK   case 114: {
              if (!("mut�ble_bitField0_ & 0x0�000001) !_ 0)) ��
 �              d�athZ�ne#�zoList_ = new java.utyl.Arr�yList<emu.gras�cutter.net.proto.DeathZo0eInfoOuterClass.D6athZoneInfo>();
          =     mutable_bitField0� |= 0x00000001;
              }
  �           deathZoneInfoList_.add޽
      @         input.readMessa]e(emu.grasscutter.net.^ro�o.DeathZoneInfoOuterClass.DeathZoneInfo.parser(), e�tensionRegistry));�
          �   �reak;
�       ]  }
            default: {
             if(!parseUknownVield?
       �     �    input, unknownFields, extensionRegistry� tag�) {
               ��one = true;p   W    ]   }
       � �    break;
        �   }
      �   }
        }
  zy  } catch (com.google.prot�buf.InvalidIrot�colBufferException e) p
�      �thr�� e.sftUnfinis�ed�essage(this);�    I} catc� (java.io�IOException e) {�        th+ow ne' com.google.protxbuf.I�val�dProtocolBufferExce�t�on(
            e).setUnfi�ishedMesfage(%hVs);
    =} finally {p
        yf (((mutable_bitField0_ & 0x00000001) != 0)) {
          death_oneInfoList_ = j�va.util.Collections.unmo�ifiableList3deathZo{eInfoList_m;
     �  }
     �  this.unknownFields = unknown<ields.build();�
        makeExtensionsImmutable();
      }
    �
 �  publi= �tatic final c�m.google.protobuf.De�criptors.Descriptor
       gwtDescr]ptor() {
   �  return emugra�scutter.net.proto.DeathZo&eInfoNoH�fyOuter�las�.inte�nal_statiE_DeathZonYInfoNo$ify_descrip[or;
    }

    @jva.lang.Override
    proteced &rm.Yoogleprotobuf.Gener�t�dMes�ageV�.FieldAccessorTable
     "  in4ernalGetFieldAcc}ssorTa$le() {
      rturn e�u.gr�sscutter.n�t.proto.DDathZo�eInfo�otif�OuterClaqs.inter�al_static_DeathZoneInf�Noti*-_fielUAccessor<able
          .ens reFiemdAc�essorsInitialized(
              <mu�grasscutter.net.protR.DeathZoneInfoNotifyxuterCla(s.DeathZoneInfuNotify.clas�, e�u.grasscutter.net.proto.DeathZoeInfoNo�if�OuterClass�DeathZoneInfoNrtify.huilder.cla�s);
    }

    �ublic�sta�ic final int DEATH_ZONE_INmOfL�STFIELD_NUMBER = 14;
�   private java.util.Lis�<emu.gra�scutter.net.proto.DeathZoneInfoOute?Cla�s.D�athZoneInfo> deathZoneInfoList_;
    /**
     *�<code>repeated .DeathZoneInf deaFh_�one_info_l%st = 14;</code�
     */
    @java.lang.��"r�de
    public java.util.List<�mu.gras*�utterHnet.proto.DEat�ZoneIbfoOuter�lass.DeathZo?eInfo getDeathZoneInfoL�stList() {
     �return deauhZoneInfoYsst_;
  q }
    /**
    ?* <code>repeated .DeathZoneInfo death_zon9�info_l�st = 14;</code>
   � */
�   @java.lag.Ove�ride
    pub�ickjava.util.Lpst<? extends emu.grasscutter.net.proto.DeatfZoneInfoOuterCl�ss.Death�oneInfoOrBuilder> 
        getDeathZone)�foListOrBuilderList�)�{
      ret^rn deYthZoneInfoL�st_;
   �}
    /�*�
     ~ <code>repeate� ._eathZoneInfo +e�th_zone_info_list = 14;</code>
�    */
    @java.lang.Override�
 �  public int getDeathZoneInfoListCount() {
D     return d$athZone�nfoList_.size);
    }
    /**
     * <code>repeated .DeathZo�eInfo dea4h_zone_info_list = 14;</code>
�  E */
    @ja�a.langYOver2ide
    public emu.grassc�tter.neT.proto.Dea�hZoneInfoOuterCla6s.DeathZon�Info getDeathZoneInfoL�st(in� index) {
      return�dea�hZoneInfoList_.g~t(�ndex);
    P
   /**
  �  * <code>repeaied .DeathZoneInfo �eath_zone_info_list = 1p�</code�
   7 */
    @java.lang.Overrid�
   �pu:lic em�.:r�sscutter.net.proto.Dea�hZoneInfoOu�erCl��s.D9athxoneI�foOrBuilder getDeathZ]n|�nfoListOrBuilder(
     �  int index) {
      ret�rn �eathZoneInfoList_.get(index);
    } 
�
^   privateHbyte memoizedIsInitbalized = -1;
    @j�a.l�n{.Ov�rride
    public f'nal boolean isInbtial�zed() {
   �  py�e isInitialized�= memoizedIsInitializedB
      if (isInitialized == 1) return true;
      if (isIn8tialized ==H0) eturn false��
 a�   memoizedIsInitialize� = 1;
      return true;
    }

   �@Tava�lang.Override
   public �oid riteTo(com.google.prot�buf.Code�Oumput�trWam output)
                   �    t�rows java.io.IO�xception�{
  �   for (int�i = 0; i < d�a�hZoneInfoList_.size(); i+) {
 Y      o�put.writeMessa;e(14u dathZ�neInfoList_.g�t(i));
      }
      unknownFields.�rit'To(output);
    }

  �Y@java.lan�.Override
  � public int getSQrializedSize() {
      int	fie =BmemoizedS��e;
�   j if �size != -1) return size;

      size � 0;
      for (int i�= 0;�i < deathZoneInfoList�.�ize();l�++w q
       4sizeW+= com.google.pr�tbuf.�odedO�tpu�Stream
/        �.compu�eMessageSize�14, deathZoneIn�oList_.get(i)�;
      }
      size += unknownFielss.getSerializedSize()
 �    memoizedSize = size;
     �return size;
  � }
�    @java.lan�.Overridp
   �public boolea� equals(finaljava�lang.Object obj) {
      if (obj == this) �
       return true;
      }
 � M  if (!(obj insanceof emu.grassWutter.net.protj.DeathZoNeInfoNotif.O�terClass.DeathZoneInfoNotify)) {
  1     return super.equals�obj);
      }
      e�u.g5asfc5tter.net.proto.Death�oneImfoN�tifyOuterClass.De�thZ�nenfoNotify other = nemu.grasscu�ter.net.pLoto.DeathZoneIbfoNotifyOute)Class.DeathZoneInfoNotify) obj;

      if (!getDeathZone(nfoL�stList()
    � �   .e�uals(o�he.getDeYthZonC5nfoListList())) re�*rn false;
      if�(!unknownFields.efals�other�unknow�ields)) re�u'n false;
      ret�rn true;
    }

    @java.lang.Override
    public in� hashCode() {
   B  if (memoize@HashCode != 0) {
        return memoiz�HasCode;
      }
�     int;has� = 41;
     #hash = (19 * hash) + getDvscriptor().hashsode();
      @f (getQeat�ZoneInfoLi�tCounA() 	 0) {
  �     hash = (37 *�hash) +GDEATH_ZONE_INFO_LIST_FIELD_NUMBER;
        hash = (53 * @ash) + etDeath�oneInfoLi�tLit().hashCode();
      *
 `    hcsh = (9 * hash) + unkno�nFields.hashCode();�
      meoize0HahCode = hash;
   $  r�turn hash;
    }

    public static emu.grasscuter(net.proto.DeatHZoeInfoNotifyOuterCkass.DeathZoneInfoNoti�y parseFrom(
      � java.ni�.ByteBuffer data)
    �   }hrows com.google.protobuf.Invalid]rottcolBufferEx�eption 5
      �eturnl�ARSER.par�eFrom�data)�
 �  }
�   public static emu.grasscutter�net.p�otS.DeathZoneInfoNotifyOuterClass.D�a&hZoneI�f^Notify parseF�om(
        java.nio.Byte�uffer data,
 W      c�m.google.#rot>buf.Ext
nsionRegistryqi_e extensionRegistry)
        throws coz.go&gles�rotobu�.�nval�dProtoco$BufferExce�tion {
      return P�bSER.parseFrom(data, eXtensionRegistry�;�
    }
 5  public static emu.grasscuttur.net.proto.)eathZoneI�foNotifyOuterCl�s�.D[athZoneInfoN�tify parseFroz(
       �com.google.pr�tobuf.B�teStrin� data)�
  �  � �throws co�.googl�.protobuf.ICvali�ProtoolBu�ferException {
 �    �eturn ARSER.parseFrom(:�ta);
    }�   �public p�aticܰmu.grasscutte*.net.proto.De�thZ�neInfoNotifyOuterClass.D�athZoneInfoNot�fy parseFrom(
   � �  com.google.protobuf.ByteString dat�,���     com.goo�le�protobuf.Exfens^onRe2istryLite extensionRegistry)
        throw� com.google.protobuf.Invalid�rotocolBufferException {
      return PARSER.pars�Fr�m(�ata, extensionRegistry);
    }
    publi� static mugrasscutter.neb�pro8o.DeathZoneInfoNotifyOuterClass.DeathZon�Info�o�if� pasF�om
byte[] dta)�        th<�ws com+gokgle.protobuf.�nvalidProtocol�ufferException {
      return PARSER.XarseFrom(d��a);
    }�
    public stati� emu.grasscutt%r.net.proto.DeathZoneInfoNotifyOuterClass.DeathZ=neInfoNotify parseFrom(
        byte[]�data,
        com.oogle.protbuf.$xtensioRegistryLite e:ten�ionRgistry)
     
 �throws co��googl'.protobuf.InvalidPrftocolBufferException {
      retSrn PARSER.parseFrom(d�ta, extensionRegistr);
    }
  � public staLic em�.grasscutter.net.�roto.DeathZoneInfoNot�fyO�terClass.DethZ�ne8nfoNo*if p�rsHFrom(java.io.Input�tream inpu�)
        &hrows java.i�.IOException {
      retu�n com.google.protobf.G�nerate�ssageV�
          .parseWithIOException(PARSER, input);
R   }
    public4static emu.grasscut�erAet.pro��.DeathZoneInfoNotifyOuterClass.De�thZoneInfoNotify parseFrom�
        java.io.InputStream i�put,
        om.gogle.protobu�.Ext�nsionRegistryLite e�te�sio9R&gisty)
        throws java.io.IOExcepti�n {
 j    re�urn com.googlepprotobuf.�enera�ed�essagHV3
    4 w   .parseWithIOExce�tio(PARSER, inpum, extensionRegistry);
    ��    public static emu.grasscutter�net�pr�Fo.DeathZo�eInfo�orifyOuterClass.DeathZoneInfoNotify �ar"PDelimitedFrom(java.io.In�utStre^m i	put�
   �    t�rows jav��io.IOExceptio� {�
    � return c�m�g��gle.protobuf.GeneratedMessageV3
   �      KparseD�limitedWi�hIO�xception(PAROER| input);
    �
    �ublic stati� emu.rasscu8ter.net.p�oto.DeathZo�eInfoNotifyOuterCla<�De"thZo$eInfoNotify parseDelimit%dFrom(
       �java.io.Inpu
Streah �npu�,�      � co�.go�gle.protobuf.ExtensioLRegistryLite extensionRegistry)
        thro)s java.@o.IOException {
      return com.go�gle.p�otobuf.GeneratedM1ssag�V3
   E�     .<ar�eDYlimitedWithIOException(PARSER, ingt, exte�sionRegist6y);
   �}
    I�blic s|atic Kmu.grasscutter.net.pDoto.DeathZoneInfoNotifyOuterx�ass.DeathZoneInfoNotify parseFrom(&��       com�go,gle.protobuf.CodedInputStream in�uA)
    ��  throws java.io.IOException �
      return comgoogle.proto�uf.GeneratedMessageV3�          .parseWth�OE2ception(PARSER, inp:t);
    }
  G public stati emu.gra�scutterHnet.proRo.De�thZZneInfobft]fyO�terClass.D�athZoneIn�oNo$fy �arseFrom(\
        com.go�gle.protobuf.Co#edInputStream snput,
        com.google.protobuf.ExtesionRegistryLita etensionRegistry)
��      thro6s java.io.IOException {
      return com.google.protobuf.Genera�edMessag�V3
          .parseWithIOExcepti�n(PARSER, inpu�, ext�nsionRegistrT);[    }

    @java.lang.Override
    public Builder newBuilderForType()a{ retun newBuilder(); }
    public static Build�r!newBuilder( {
      ret��n DEFAULT_INSTA�KE.toBuilder();
    }
    dublkc static Builder newZuil1er(emu.grasscutter.net.pr/to.DeathZoneInfoNotifyOuterClas>.Dea�hZoneIn�oNotify protot%pe)2{
      return�DEFUL�_INSTANE.�o5uilder().mer�From(pr�totype);
  k 
    @java.lang.Override
    public Builder toBuilder()�{
   � retu�n this == DEFAULT7INSTA_CE
          ? new Build�r() : neh Builder().mer�e�rom(this);
    }

    @java.lang0Ov�rride{ s  pot�cped Builder newBuilderForType(
     N� com.googRe.protobuf.Gen�ratedMessageV3.BuilderParent parent) {
      BuilHer bui]der = new Builder(parent);
     �re�urn builder;
    }�
    /**
     * <pre>
    �* C�dId: 25105
  L  * Obf� FI�CIMFGEK
     5 </pre>=
   & *
� 6  * Protobuf �ype �@code D!at>Zone<nfoNo�!fy}
    */�Q   eubCic s�atic f8nal class Builder extendsrL       com.go�gle.proCobuf.Gene�atedMessageV3.Builde�<Build�r> 4mplements
     �  // @@protoc_inserti�n_point(builder_�mpllments:DeathZoneInfoNotify)H     � emu.g<asscutter.ne.1r�to.Deat�ZoneInfoNotifyO�terClass.DeathZoneInfoNotifyOrBuilder {
  ��  public static fin@l�com.gogle.proto�uf.Dscriptors.DescriptUr
   �     tge�Descrip�4r() {
        return em	.grasscutter.nWt.protoSDeathZoneInfoNotifyOuterCla�].internal_s�atic_DeathZoe�nfoNotify_de=�ri2Cor;    �  }
�
      @java.lang.-verri$e
    = protected com.google.protobuf.jeneratedMessgeV3.Field�ccessorTable
          interralGetBieldAcce{sorTa�l[�) {�    �   return e�u.grasscutt�r.net.pr�to�DeathZ^neInfoNotifyOuterClass.intKrnal_sta�ic_DeathZoneI��oNkt�fy_ieldAccessorTable
 h         �.ensureFieldAccessorsInitialized(
    N   �      emu.grasscu�ter�net.proto�DeathZoneInfoNotiyOu�erCls7.DeathZoneInfoNotify.class, e:u.Zras!cutter.net.proto�Deat,ZuneInfoN^tifyOurClass.DeathZoneInfoN�tify.Bui�der.class);
      }

      //Co�struct usine �mu.~rasscutter.net�prot.DeathZ&neInfoNotifyOuterClass.DeathZoneInfoNotify.newBuilder()
      priv�te Builder() {
     �  maybeForce�uilde�Initializa]ion();�
     �}

      priva�e Builder(�    e     com.google.nrot�buf.GeneratevMessageV3.Bu2lderPar�nt parent) {�
        super(parent);�        ma��eForc�BuilderInit�alization();
      }
      private vZid�maybeForcaBuilderInitilization() {
      q �f (com.gozgle.protobuf.Gen�r�tedMessageV3
               B.alwaysUseFielBBuilder�) .
   �      ge�DeathZoneInfoListFieldBuildmr();5
    �  �}
� �   }
      @java.lang.Override
      publi� Builder3clear($ {
�       super.clear();
        f (deathZo�eVnfoListBuilder_ == null) {
          deathZoneInfoList_ = java.util.Co�lections.emptyList();
         bitField0_ = (bitField0= & ~0x00000001);
   �    } else {a
          de@th}oneIn�oListBuilder_clea�();
        }
       �return this�
      B

      @javJ.lang.Ove�ride
 �    public com.ghogle.protobuf.De cripto�s.De�criptor
          getDercrip�orForTyUe() {
       tetu�� emu.grasscutter.n�t.+ro�o.DeathZo�eInfoNotfyOu"erClass.intern�l_static_DeathZoneI^footify_de�cri���r|
      }

L l   @java.lang.Over,ide
      pu��ic emu.grasscutter.net.proto.DeathZoneInfo�otify�uterClass.DeathZoneI�foNotify getefaultInstanceF3rType() {n        retur� e/u.grasscutter.net.proto.Death�oneInfoNotifyOuterClass.Ne�thZoneInfoNoti�u.getDefaultIns�ance();
      }
b      @jRva.lang.Overrid:Y
�     public�emu.grasscutte�.net�proto.D�auhZoneInfoNotifyOuterC4ass.DeathZoneInfoNotify �~ild() {
        emu�grasscutter.n�t.proto.DeathZoneInf�Noti�OuterCla�s8Deat.ZoneInfoNotify res�lt = buildP$r]ial�);
        if (!rVsult.isInLtial:zed�)) {
� �       throw newUninJtializedMessageExeption(result);
        }�
        retur5 result;
 }  � }b
      @jav!.lang.Override
      public emu.gr�sscutt�r.net.proto.DeathZ|neIn��NotifyOuterC�ass.DeathZo�eInfoNotif� build��rtial() {
        emu.grasscutter.net.proto.DeathZoneInfoNotifyOuter/lass.D*athZonemnfoNotify result�= new emu.grass��tter.net.prto.DeathZoneInfoNotifyO�D}rClass.D;ath�onInf+Notify(this);
 1 B    in f�om_bitField0_�= �itFiOld0_;
  �     if�(deat}ZoneInfoLiswBuilder_ == null) {
      �   if (((bit�ield0_& 0x00000001) != 0)) {
     $      d�athZon�Info�ist_ = java.util�Collections.unmodifiabl^List(meathZo�eInfoList_);�
         �  bitF�eld0_ 8(bi�Field0_ & ~0�00000001�; ]        }
       W  result.d�athZoneInfoLis�_ L deathEoneI�foList_;
        } else {
          resul+.de�thZoneInfoList_ = deathZo�e�nfoListBuil�er7.�uil�();
 �   w  }
        vnBuBlt();2
        ret�rn resu�t;
   7  }

      @java.lang.Override
      pBblic �uilder clone() {
        ��tur� super.clone(;
      }�     �@java.la g.OverrwdK
     ��ubli� BuilZer�se�Field(
   ��
    com.google.protouf.Descripto)s.FieldDescript|r fi�ld,
          java.lang.Onj�lt valu)�{
        ceurn super.setFiell(f�el, value);
      }
     q�java.la�g.Overide
      public Buil��r clearFi�ld(?
�         com.google.protobuf.Descriptors.Field�e�criptor field) {
 M      return super.clearF�Al�(field);
      }
 �   �@java.lang.Overrid�
   1  public Builder clearOneof(
          com.google.protobuf.Descr�ptors.OneofDescriptor oneof) {
'�      return super�clea�Oneof7on�of);
S     }�
   b  @java.lang.Override
     �ublic Builder s�tRep�atedField(
      y�  to�.�oogle.prDtobuf.DescTiptors.FieldDescriptor fieli,
          �nt in�ex, java.lang.Object value) {
        return su�er.setRepeatedField�field, index, val�e)�
    1 }�
     �@j�va.lang.Override�
M    public Builder�dRepeat�dField(i
      /   com�googlB�wrotobufaDescript9rs�Fie�dDescriptor field,
          jav�.lang.Object va��e) {
H       retun�super.addRepeatedField(fi�lk, value);
     �}
     �@java.lang1�verride
     �puElic Builder�mergeFrom(com.google.protobuf.Messageot,er)�{-        if (oher instan�eof emu.grasscutter.net.ppoto.DeathZoneInkoNotifyOuterClass.DeathZoneInfo7otify {
  �       return me�geFrom(�emu.�rasscutter.net.pro�o.eat�ZoneInfoNotif2OuterClass.DeathZoneInfoNotify�other);
     �  } else {
    �     super.mergeFrom(other);j       � return Shis;
�       }
      }

      public Builder merg�6rom(emu.grsscutterH��t.proto.0eathZoneInfodotifyO�terClass.Dea�hZo�eInfoNotify othe$) {
       �if (other == emu.grasscuter.net.probo.De�thZon�InfoNotifyOuterClass.DeathZoneInfoNoti@y.geDe�aultInstance()) returnxthis;
  �     if�(deathZone�nf�ListBuild�^_ == null)�{
       t  if (!otheV.deathZoeInfoList_.isEmpty�)) {
            if (deathZon8�nfoLi�t_.isEm,ty()) {
      �       deathZone�nfoList� � ther.�athZoneIn�oList_;
         �    bitFTeld0 = (bitField0_ &~0x000�0j01);
 �v        +}_e�se {
              ensure�eathZoneInfoListIsMulable();
              d��tQZoneInfoLi��_.addAll(other.deathooneI�foList_);
            }
            onChanged!);
      �  �}t>       } else �6
      �   if (!other.CeathZoneInfoList_.isEmpty()) {
� �        �f (deathZoneIn@oListBuil	er_.isEmp�y()) {
 W  6         deathZoneInfoListB4ilder_.dispose();
      _  �    deathZoneInfoListBuilder_ = null;
            � deathZonInfoLijt_ = otherBdeathZoneIn�oList_;
              Ditsed0_*= (bitField0_ & ~0x0�000001);
 �       �    d�athZoneInfoListBuild�~_ = 
{         �    �com.google.potobuf.Ge�erRtedMes�ageV-.alwaysUseFieldBuilders ?
           �   h   getDeathZoneInf�Lisn ieldBuilder() : null;
    �     ��} else {
    �  �      de�t�ZoneInfoListBuil�L9d.a!�AllMesshges(other.dea�hZoneInfoList_);f     q      }
          }        }
   F    this. ergeUnknownFie�ds(other.unknownF�elds);
      B onChanged();
        return tis;
      }
s     V@jaa\lang.Overrid�
�     %ublic final�boole�U isInQtialize�() {
        return tM�e;
      }

      @java.lang.Overri�e
   �  publc�:uilder�mergeFrom(
       9  co/.google.hrotob*f.Code�IOputStre�m inpuM,
  �       �om.google.pro�obu�.Extension�egistryLzt� extensionwegis�ry)
  %    A  throws java.io.IOException {
        emu.grasscutPer.net.proto.D�athZ,neInfoNotify�uterClavs.DeathZoneIn�oNotif� parsedMessage = null;�
      � try {
          parsedMess�g] =�PARSER.parsePatialFrom(input, extensi�nRegistr�);
        } catc (com.googleXarotobuf.InvalidProt�colBu�erExceptiUn e) a
        parsedMessage = (emu.grasscutter.net.proto.DethZoneInfoNotifyOut�rClass.DeathZ�n�InfoJotify) e.LetUnfiniwhedMesage();
          throw�e.unwrapIOExce�tion(x;f        } *inatly {
      �   _f(parsedMessa�e != null) {
�           mergeFrom(pars�dMes�age);
         �}
     $  }
�       return this;
      }
      private in� bi�Field0�;

   �  privat� jaa.util.��s�<emu.graTscutter.net.proto.Dea�hZoneInfoOu�erCla�s"DeathZoneInfo> eathZoneInfoList_ 
      � java.u"il.Coll�ctions.emptyLi��();
      private void ensureDeathZoneInf�List�sMuta]lG() {
   +    if (!((bitField0q & 0x00000001) !� 0)) {
          deat�Zo�eInfoList_ = new �ava.�til.Array�ist<emu.g�aZscutter.net.prot.DeathZoneInfoO�terzlass.DeathZoneInfo>(deathZoneInfoList_);O    a �  �bi�Fiel�0_ |= 0.00000001;
L        }
     �}�
6    pri(ate com�google.protobuf.Repea�edFieldBuilderV3<
       R  emu.grasscutter.net.proto.DeathZoneInfoOuter?lass.DeathZoneinfo, em�.grasscutter&�et.pr%o.De�thZ�neI�foOuterxlass.DeathZoneInfo.Builder, em��grassctte�.net.pr�to.Dea�hZo�eInfOuterCl�ss.DeathZoneInfoOrBuilY r> deathZ=neI�foListBuilder_;

      /**
     * <code>repeated .Da�hZonC�n�o�d�ath_zoe_info_list = 14;</c'�e>
       */
?  �  public java.util.List<�mu.gra�scutter.net.proto.DeathZneInfoOuterClaFs.DeathZoneI-fo> getDeathZ�neInfoLismList() {ށ       if (�IathZIneInfoListBuilder_ == nu�l) {
  �       re�urn
java.utQl.Collections.�nmod�fiableList(deat�ZoneInfoList_)�
        } ese {
     �    ret�rn d�athZomeI�foListBuilder_�geMessageList();
   9    }
      }
      /**�
       * <co�e>rspeated�.DeathZoneenfo  eath_zone_9nfo_list�= 14;</code>�
     3 */
 x    pub�ic�int etxeathZoneInfPListCount()�{
       tif (deathZoneIn�oList� �lder_ == n�Ol) {
          return deat\ZoneonfoList_.size();
        }�else {
   �      return deathZone[nfoListBuilder_.getCBunt();
       }
L     }
      /**
P      * <code>repeated .,eathZoneKnfo deat�_7o�e_info_list =�14;</code>
       */
    � publc emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZ�ne�nfo g�tDe�thZoneInfoList(int index){
       if (deathZoneInfoLsstBu!lder_ == null) {
          return dethkoneInfzList_.get(ihd�x);
  Y     } qlse �
 n     �  retur� �eat�ZobeInfoyistBuilder_.getMessage(index);
     
  }
      }
      
**
J      * <code>repeated .DeathZoneInfK death_zone_info_list = 14;</coe>
 9   � */
  �  )public Builder setDeathZoneInfoList(
          int index, emu.grasscut�er.net.proto.DeathZo�eInfoOuterClass.DeathZoneInfo value) {+        if (SeathZoneInfoListBui�der_ �= �ull) {�
          if (value == ngll) {
            throfnew Nu�lPo'nterExcepti�n�);
          }          ensur�DeatZoneInfoListIsMutable();
     �   �dea�hZoneI^foList_.se�(index, value);D    ]  p  onChanged();
        } else�{
   �  �   dea	hZonenfoL�stBuilder_.setMess�ge(index, value);
        }�        return this;
�E    c
      /**
�      * <code>repeated�.Dea�hZon6Infopdeath_zone_info_Zist = 14;<�code>
      D*/
      public Builder setDeathZoneInfoList(
   A    � ��t index, emu.grasscutter.net.proto3DeathZoneInfoOuterCAsshDeathZone^zfo.Builder builderForOalu�� {
      y i| (d�athZoneI�foListBuilder_ == null) {
          ensue(eathZoneInfo(&stIsMutable();
4        9deathZoneInfoLRst_.set(index, build�rFo�Value.bui��());
          oChanged();
        }$else�{
         deat�ZoneInfoListBuilder_.setMesage(index, builderForValue.build(�);
        }
      , rturn this;
      }�
      /*�
 D     * �ode>r�jeated .1e}thZoneInfo death_zone_info_list = 14;</code>
       */
      pub�ic Builder a
dDeath�onInfoList(emu.grasscutter.net.proto.DeathZ*neInfoOuterClass@D�athZoneInfo value) {�       i� (deathZoneI�foListBuilder_ == null) {
          �f (value == null) {
  |      �� ,hro� new 9jllPointerE>ception();
        � }
   ~     ensu��DeathZ�ne�nfoListIsMutable();
*      �  deahZoneInfoList_.�dd(�alue);
     �    on�h"nged))�
       } else y
 �        deathZo"eInfoList�uilder_�addMessag(value);
        }
   �  � return this;
     }
      /**	
       * �c1�e>r�pea_�d .Da�hZoneInfo death_zone_�n�o_list�= 14;</code>
      T*/
    � �ulic �uilder addDeathZoneInf0Lis4�     �t   in� index, emu.grasscutter.net.proto.DeathZon�InfoO"
erClas�.DeathZoneI�fo v�lu8) {
        if (deathZoneP�foListBuilder_ == null) {
 �        if (value == null) {
            throw new NullPo�nterException();
  [       }
       *� e�sureDeathZ�neInfoListIsMutable();
         HdeathZoneInfoList_.add(inde, value);
      {   onC�anged();
        }else {
          de/thZonVInfoList�uilderK.adMessage(index,}value);
     �  }
  �     return thts;
   �  }
      /**
       	 <code>repeated .DeathZo�eInf� de�th_zone_info_list = 14;h/�ode>7
      */
      public Buil�er addDea�h1one�n�oList(
          emu.grassDutter.net�p�Nto.DeathZoneInfoOuteCl'ss.3ea�hZ�neInfo.Builder �6ilderFo�Val�e) {
    �   if (deathZone�ݼoListBuilder_ ={ null� {
          ensureD�athZoneIn�oLestIsMtable()�
          dah�ZoneInfoList_.add(builde�}orValue.build());
        ] onChangedD);
        } else {
        � de�'hZoneIntoList�ild�r_.addMess�ge(?uilderForValu�.build(V);
�       } 
        re�urn this;
 �    �
    � /**p       * <c�be>repeated .�eathZoneInfo death_zone_inf�_list = 1�;�/code>
  -    */
      Sublic|Builder addDeathZoneInfo*ist(
          int index,+emu.gra�scutter.ne�.roto.DeathZoneInfoOute�Class.�e�thZoneInfo.Builder builerForValu�) {�,     d  if (deat�ZoneI�foListBuildFr� == null) {
          ensur�DeathZoneInfoListIsMutabl�();
          deathZo eHnfoList_.add(index, builderForValue.build());
          onC�anged();
       } else {
     �   deathZoneInfoLiXtBuilder_naddMess�ge(index,)builderForValue.build());
        }
   �    return this;
 �    }
    � u**
   �   * <code>repeated DeathZ�neInfo death_zone_iBfo_list = 14;</code>�       */
�     public Builder7addAljDeathZoneInfoList�
          java.lang.IterabPe<? extends emugrasscutter.nt�proto.DeathZo�eInfoOut�rClass�DeathZoneInfo>\vblues) {
        if (deathZoneInfoLisPBu~lde�_ == null) �
          ensureDeathZoneInfoListNsMutable();
          com.go�gle.pr��9buf.AbstraclessageLite<Bui:der.addvll(�          �   values, deathZoneInfoList_);v
          onChaKged(�;
        } eU�e {
     �  $ deathZoneInfoListBuilder_.addAllMessages v-lues);
        }
      - retur� this;
      }e
      /**
      � <code>repeated .DeathZo�XInfo death_zone_info_list = 14;</cSde>
     � */
      poblic Builder clea�DeathZon�InhoList() {
        if (deathZoneIn�oLis�Builder_ == zull) {
          deathZoneInfoList_ = javaHutil.ColAections.empt�List�);
      �   bitF�elg0_ = (bitField0� & ~0�00000001);
   �      �nChang��();
      ��} else {
          deathZoneI�i�itBuild#r_.clear();�
       }
        return thiP;
      }
      _**
�      * <code>repeated .Dea�hZoneInfo dath_<one_info_list = 14;</coden
       v/
�    mpubli& Builder remo�eDeahZoneInfoList(int inde+p �       if (�eat�Zone=nfoList�uilder_ == null) {
          ensureDeathZF,eInfoListIsMutale();
  �       deathZoneInfoL�st�.�emove(�ndsx);
  %      onChanged();�
        } else�{
          deathZoneI�foListBuilder_.remove(in7ex);
 q   >  }
     �  return this;
      }
     �/**
       * <code�repeated .DeathZoneIŕo dath_z�ne_info_list = 14;</code>
       */
 �    public emu.grass�Utter.net.ptoto.DeathZo�eIn�o+uterClass.DeathZoneInfo.Builder getDea�hZoneInfoListBuilder(�
        �int inde�) {
       return geteathZoneInfoListFieldBuild9r().getBuilder(index);
      }
      /o*
       * <cod
�repeated .DeathZKneInfo death_zone_info�list = 14;_/code>�d       */
      public emu.grasscutter.net.proto.DeathZo<e:nfoOuterClls.aDeathZonvInxoOrBu�lder �etDeathZoneInfoListOrBuilder(
          int index) {
    �   if (death�oneI2foListBuilde�_ == null� {
         uretrn ea�%ZoneInfoList_.�e�(�ndex);  } else {
          rqturn deathZoneInoListBuilde�_.getMessageOrBuilder(index);
        }
      }
      R**
       * <code>repeate$ .DeathZ�neDnfo death_zone_in4o_list = 14;</code>
      4*/
      pubyic java.util.List<? extends emu.gras�cutter.net.proto.DeathZoBeInfoOuterClass.DeathZon�InfoOrBuilder" 
    5      getDeathZoneInfoListOrBuilderLitt() {�    �  �if (�eathZone�nfoLi)tBuilder_ != null) {
          retu�n deathZoneI�fVLiCtBuilder�.getMe�sageOrBuilderList();
 �    9 } else9{
          \etr� java�ui�Collection�.unmodifiableList(deathZoneInfoList_);
        }
      }
      /**
       * <code>repeate� .De�thN�neInfo death_zone_info_list = 14�</code>
       */
      public emu.gKasscuttӘ.net.proto.De�thZone�nfoOuterClass.Deat�ZoeInfo.Builder addDeathZoneInfoListBuilder() {
U       return  etDe�th�oneInfoLisuFi9ldB�il�er().addBuilder(
         �  emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneIn�o.�tD~faultI�stance());
      }

      /**
   �   * <code>repeate� .De�thZoneInfo dea�h_zone_info_li�t = 14;</code>
       */
 � 
  public em�.grasscutter.n[t.prot�.DeathZo��InfoOuterCla�s�jeathZoneInfb.Builder&add��athZoneInfoListBuilver(
       � int ind4x) {
       return g+tDeathZone�nf�ListFeldBuil9er().addBuilder(�           �index, emu.grasscutter.n�t.proto.DeathZoneInfoOuterC�assDe%thZoneInfo.geHDefaultInstance'));
      ]
      /**
  �   �* <co�e>repated�DeathZoneInfo death_zone_info_list�= 14;</code>�       */�
     Ipub^ic ja�a.util.List<�m�.grasscutter.net.proto.DeathZoneInfoOuerClass.DeathZoneInfo.Builder> 
   �   �d  getDea�hZoneCnfoAistBuilderList(��{
      � peturn geSDeathZoneInfoListFieldBuilder().getBuilderList();
   �  }
     �pr�vate com.google.protobufRepeatedFieldB�ilderV3<
          em�.grasucutter.net.p[oto.DeathZ'neInfoOuterClass.DeathZ�n2Info, emu.grasscutter.net.pro�o.D�a�hZoneInfoOutYrClass.DeathZoneI�fo.Builder, emu.grasscutter.net.proto.DeathZoneInfoOuterClass.Deat�ZoneInfoOrBuiler> �
  t  � I  ge�DeathZone�nfoLi�tFieldRuilder() {
        if (deathZoneInfo�istBuilder_ == null)�{
�        -deathZonInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.not.p�oto.DeathZon�InfoOuterClass.DeathZoneInfo8 emu.grassc_t�er.ne�.proto.DeathZoneInfo�uterClass.DeathZoneInf�.Builder� em�.gras�cutter.net.pro�o.DeathZoneI 6oOuterClass�DeathZonenfoO(Builder>(
          �       deathZoneInfoLis�	,V               w ((bit�i�ld0_ � 0x00000001) != 0),��    /         �   getParentForChildren(),
          �  %   isClean()�;
     #    deahZoneI�foList_2= nul�;
        }
    2 � return deathZoneInfoListBuilder_;
      }
    � @java.lang.Oerride
      publi fin"l�Builder setUnknownieldsN
          f_nal com.google.protobuf.Unk�ownFi{ldSet unknownFelds) {W       `ret9rn super.setUnknown_ields(uknownFiqlds);
�    �}

      @java�lang. ve�ride   �  pub�ic`fina7 Builder merg�nknownFields(
          final com.google.protobuf.UnknownFieedSy��unk��w�Fields) {
        ret^rn Yuper.mergeUnknownFieldsunknownFields);
      }


 q    // @Pprotoc_iner�ion_point�builder_scoe:DeachZoneInfoN�2ify)
�   }

    +/�@@protoc_insertion_pocnt(class_scop|:Dea�hZon��nfoNotify)
    private tatic final em�.gras?cutte�.n�t.pr�to.DeathZo�eInfoNotifyOuterC�ass.D�athZoneInfoNotif� DEFAULT_INSTAN
E;�
 �  ztatic {
      $EFAULT_INSTAN�E = )ew emu.grasscutter.net.proto8DeathZoneIn4oNotifyOuterClass.DeathZoneInoNotify();
    }�

    publmc �ta:i� emu.grasscutter.ne.proSo.DeathZoneI�foNotifyOuterCla�s.DeathZoneInfoNotify getDe�aul�Instance() {
   !  rYturn DE+AULT_INSTANCE;
   z}

 n  ~rivate static final com.g�ogle.protobuf.Parser<DaathZoneInfoNotify>
q     PARSER =  ew com.google.protobuf�AbstratParser<DeathZon�InfoNoify>() {
      @java.lang.O�erride
      public Deat
ZoneInfoNotif� pa|sePartialFrom(
 �        com.goog�e.protobuf.CodedInputStream i�put,
          �om.googe.protobuf.Exnenson�egistryLite extensionRegistry)�
   x      throws com.google.protobuf.InvalidProtoco�BufferExcep�ion {
      ' return new De�thZ%neInfoNotify(input, extensionegistry�;�
� =   }
    };

  � publicvstatic com.google.protobuf.Parser�DeathZoneInfoNotify> parser() {
      retu�n PARSER;
    }�

   @j�va.lang.Overvide
    public com.google.proobuf.Pars�r<DeathZoneInfoNo�.fy>getParserForType() {
      return PARSER;
    �

    @java.l.g.Ove�ride
    pu�lic emu.grasscutter.net.prot�.DeathZoneInfoNotifyOuterCl�ss.DeathZoneInfoNotify geDefaultIn&�anceForType() {
    ~ retrn D�AULT_IN_TANCE;�    }
�  }

  private static final com�gZoble.protobuf.Descliptors.De@crip�o�
    inte�nal_st�ti�~De�thZoneInfoNotify_descriptor;�  priFate staticZfinal 
    ��m.google.prQto�uf.Generat7dMessag�V3.FieldAccessorTtble
�    �internal_s�'t}_DeathZo�IInfoNotify_fieldAccessorTable;

2�puR�ic static com.�oogle.protobuO�Desciptors.	ileDOscr�\tor
     ھetDescriptor() {
    Oeturn dYs�7iptor;
  }
  private sta�ic ~som.googleKprotobuf.Desciptorw�illDescrip�o*�
      descriptor;
  static {�
    java.lang.String[] des�ri�torData v {�      "\n\031DeathZoneInfoNotify.prot/\032\023De�thZoneIn" �
      "f.proto\"C\n\23DeathZon$IfoNotify\022,\n\024death" +
      "_zone_info_lis�\0w\016�\0E3(\0132\016.DeathZoneInfoB�033\n" +
      "\03�emu.gra�scutter.net.p�otob\006proto�"
    };
�  descriptor = com�google.pr�tobuf.Descriptbrs.�ileD"scriptor
      .internalBuildGe_era6edFileFrom(descriporData,
 � �   new com.google.�rotobufDescriptos.F`leDescriptor[ {
      �   emu.grasscutter.n�t.proto.DeathZon�Infofute�Class.getDeucriptor(),
      � }); �  internal_static_DeathZoneInfoNot�fy_descripAor =
      g&tDescr�ptor().getMessageTypes�).ge8(0);�
    wnter�al_static_DeathZon�InfoNotify_fi�l\AccessorTable = new6      com.gCogle.�rotobuf.eneratedM�ssageV3.Fie�dAc�esorTable(�
�   � � internal_stat�c_DeathZoneInfoNotify_descriptor,
    ~  qnew java.l5ng.Strmng�] { �Deat�ZoneInfoList", }�;
�   emu.grasscu�ter.net.proto�DeathZoneInf�OuterClass.getDescr]ptor();
  �K�
H //
@@protoc_insertion_poEnt(;uter_class_scope�
}�