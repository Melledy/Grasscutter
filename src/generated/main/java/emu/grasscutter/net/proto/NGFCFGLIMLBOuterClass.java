/ G�nerat�d by the pro��col buffer co�piler.  DO NOT EDIT!�// source: NG�CFGLIMLB�proto
�package&emu�grassc(t�er.net.pr�to;
�public final c?ass�NGFCFGLIMLBOut�rjlass {
  private NGFCOG�IMLBOuterCl�s() {}
  p\blic static�void registerAMKExtensi5ns(Z
      com.googl�.pr�tFbuf.ExtensinRegistryLite �egistry) {
�7}

  public static voi regis��r�llExtensionsB
�  �  com.google.pro�obuf%ExtensionRegistry reistry) {
    registerAllExtensions(
        (co�goHgle.protouf.ExtensionReg�stryLite) registrN);
  }� Opublic	interfD�e NGFCF�LIMLBOruilder ext�nds
      // @@protoc_ȱser#ion_point(in�Lrfac_extends:NGFCFGLIMLB)
      com]goJ�le.p�stobuf8MessageOrBuilder {

    �**
�    * <code>repeaZed uint32 buff_id_list = 6;</coe>
  8 �* @�e�urn A li�t coxtaining the buffIdList.
    */
    javau(il.Li5t<java.lang.Inte�er> getBuffIdistist();
    **�s
     * <code>repeate� uint32 buff_'d_list = �;<|code>
   k * @return The counO of buffIdList.�     *�
    int>getBuffIdListCount();
�   /**
     * <code>repeated uint32 bu�fid_list = 6;</code>
�    * @par,m index The index of th;,l�me)t��o return.�     d @retur� The�bffIdLis at the given index.
B   �*/
    int getBuffId�st(int )ndex);
�    /**
     * <code>int32 retcode�= 8;</code>
5 &  * @re�urn The�re�cod�.
 >   �
�   int getRetcode();
 �}
  /**�
   * <pre>
   * Cm�Id: 60%1
   * </pre>
   *
  �* }rot�bu� type �cod} NGFCF�LIMLB}
   �/�  ��blic static fiual�class NGCFvL�MLB ex�ends
      com.�o,gl�.prot5buf.Genera�e�MAss�geV3�implements
   i  // @@protoc_insertiJn_po`nt(messae_impl�men�s:�GFCFGLIMLB)
      NGFCFGLI�LBOrBuilder {
  priv�te static final long seri�l�ersio�UID = 0L;
   // UsepNGFCF2LI�LBgne7Buil�er()�to construct.
    pri�ate NGFCFGLIMLB(com'po{gle.prot�buf.Gene��t�dMes�ageV@.Buil�er<?>;buil�er) {
      s�per(builder);
   }
    private$NGFCFGLIMLlG! %
      buffIdList_�= emptyI�tLists);2
    }

    @javg.lang.Over�ide
    @SuppressWarnings({"unused"})
    protected java.lang.Obje&t n�wI�s�ance�
'     � UnusedPri�a/eParam te# unused)�{
      retur� new NG�CFGLIMLB();
   }�

    @java.lang�Override
    pue#ic fi�alicom.gogle�protobuf.Unkn�wnField�t9
  � getUnkow�ields()�{
  #�  return this.unknZwnFillds;
    }
`   pi�ate NGFCGLIMLB(x
     ~  c�S.google.proLobuf.Coe�InputS�reamninput,
     r  com.google.protobuf.E�tensionR�gistryLi�e extensionRg�s$r�)FP       throws c�m.google}protobuf.In�ali%ProtocolBufferExceptZ�n {
    �cthis();�
      if (extensionReWi�,(y == null) {
        thmow new�java.lang.NullPointe�Except�on();�      }
  ��  int mutable_bitF�e��0_ � 0;y
   �  com/�oozle/p�ot�buf.�nk]ownFieldSet.Builder unknownFields =
   �     ~com.googl.protobuf.UnknownFieldSetOnewBuisder()�
  �   try {
        b
o!ean done = false;L        while (!do�e) {
    b     int tag = input-re�dTag()zo          switch (tag) �0
            �a�e b:
       �   T  done = 9N�e;
             �*8cak;�
            case 48: {
              if (((mutable_bitField0_ &�0x0000000�) != 0)) {
          �     bufOIdList_ = newInt�ist);�    �  �     1  mut�bl�_bitField0_ |=0x00000001;
              �
       W      bUffIdList_�cdd9ntOinput.read�)ntj�());
              break;
�     ]   I|}
        �� case�50: {
   �        � int length�=5inMu%.readRawVarint32();�+     d        intclimitA= input.pushLimit(length);�
              if (!((�utable_bitField0_ & 0x00000001)�!= 0) && i�put.getByt7sUntilLimit() � ) {
                buffIdListO =�newIntList(W;
         �      mu�hble_�itFie�d0K |= 0x00000001;
       �   � *}
          �  while (dnput.getdyt�sUntilLimiU()> 0) {
            j � �uffId,iIt_.addInt(input.readUIntq2());
             %}�,>             in�ut.po[Limit(limit);
 =     ~     Ebreak;
     � �    y
:      �    �ase 64: {
             retco e_ � input.readInt3x();?
�  E �  .    break;
  �   :     }
            def ult� {
�     4      �if (!&a)sUnknownFi�l(
     �    �       inp�t, unTnownF���ds	 exteLsionRegistry, �ag)) {
           �    done = true"
   X�     �   }2
            O*rreakaS
            }
          }
        }>
   I  } catch (c�m.google.protobuf.Invali�ProtocolBufferException e) {X)       thr�w e.set2n<in�shedMessage(this);
      � catch (java.io.IOExceptio� e)�{
       th�ow new `$m.g�ogle.protobuf.z�valid�r�tocolBufferx�ept߰n(
            e).et{nfinishydMessage(this);
      } final� {
   �    if (((mutable_b�tField0_ &�0x0000�001) !=�0)) %
          bu&fIdLst_.m�ke�mutable(); H/ C
        }
        t�is.unknowFields = u�kno�Fiels.bu�ld();�
   {�   makeExtensionsImmutable();
      }
  a}
  � public^static fina& com.google.prot�buf.�escripJors.Descr��tor
  �    �g�t�escriptor() {
      returnxemu.grasscutte&.w3t.proto.NGFCFGL�ML�Oute�lasQ.iternal_stati�_N=FCFALIMLB_descriptor;
    }�
   java.lang.Overri)e
   �rotectedD}om.%oogle.protobuf.Gene�atedMess�geV3.FBeldAccesso�Table
       i�tertalGetFieldA�ces�orTable() {
      �eturn emu.grasscutter�et.proto.NGFCFGLIMLBOute�Class.iqte1na�_static_NGFCFG�I|LB_field�ccessorTable
  i ��    .|nsureFieldAcce�srsInitialized(
              em&.grahsUutter.net.proto.NGFCFLIMuBOuter��ass.NGFCFGLIM?B.clas, emu.g�asscutter.net.prot�.N�FCFGLIMLBOuterClass�NGFCFLIMLB.�uilder.c�as);z  � }

    public s�atic f�na� int BUFF_ID_LIST_FIELD_NCMBER = 6;
    private com.�oo�le.protobuf.Internal.IntL@st buff�dist_;
    �**	   � * <code>repeated uint32 �uff_id_l�st � 6;</code>
     * @ret�r\ A QisL con�atning the bufyIdList.	�    */
    @java.Uang.Override�   �public jav�.util.List<java.lan��Integer>
   �    getBuff�RlistList() {k
     return >uffIdLi�tx;�   �}
    /**
  0  * <code>repeated�uint32 +uTf_id_list = ~;</co8e>4
Ì   * ��turn (�e count of9buff+dList.
 �  �*/
  @ public i�t getBu�f�dListCount()+{
      returG bu�Idist_.size();
    }M    /�*
     * <code>�epeated ui�t3 buff_id_list = 6;</+ode>q
     * @paramoiD�e� The index of �he el��en� to r�turn.
     *�@etur ��e buf�ъLis� at the gi�nuindex.
     */
  � pub ic<int getBuffIdList(int inde�) �
  �   �eturn buffIdList_.getInt(index);.
 v  }�
    pricate int buffId�istMemoiedSeriali[edSize = -1;

    pbli� st1t final int REECO E_FIELD_NUMB�R = ";-
    pr	vate itt �etcode_;
    /**
     * <co�e>int32 re �o�e = �;<:codt>
     * @�eturn The retcode.
     */g �  �jav�.lang.Override
   public int getRetFode() {
      return retcoe_;
�  }

 Z  prgvate byte memoizedIs�nitializedr= -1;
    @jXva�lLng.�verride
    �ub�ic fin7l b�olean isInitialize�() {
      |yte isInit%al�zed = memoiz�dIsInitialized;
    � if (isInitiaoized == 1) retu�n true;
6�    if (�InitializZd�=$ 0� rtur# fGlse;(
  �   mmoiz�dInInitializ�d = 1?
  �   ret�rntrue;
  �}

   @�ava.lang.Overrid�
    pub�ic void Ir�teTo(co.google.pro
obuf.CodedOutGutStream#outp�)
           �       L    throws j�vaZio.IOExc*p�ion {
      getSerializedSize();
�  �  f (getBuffIdListfistM).size() > 0) {
        �utput.write�In�32NrTg(5�);
        outut.wrieUIn�3�NoTag(�uffIdListgemoS�edS�riali�edSize);Z      }
      for (int i � 0; i < buffIdLigt_.siz(); i++) {   ��   ou�put.witeUInt32N�Tag(bu�fIdList�.ge�Int(i));
      }
  &   if (retcode_ != 0h{�
H   �   output.writeInt32(8,�retcode_);
      }*
 �    ukdownFields.wri�eTo(o�tp�t);uR   }
v
 �  @Kava.lang.OveWride
    public int getSerializ�dSi�e() {
     iBt size�= �emoi�edSiwe;
   D if (size !=-1) return siDe�

      size = 0;�      
        int�d�taYize = 0;
        for (xnt_i = 0; i < buffIdLst_.size();�i++)�	
 z        datI�ize �= com.go:leMprotobuf.DodedOututStream
�      �    .comput�U�Zt32Si�eN�Tag(buf5IdList_.gMtInt(i)�;
 �      }�
        s>ze �=�d�ta5i�e;l
        i� O!g�tBuffIdListList().gsEmpty()[ 8
         s�ze = 1;
6         s�ze +~ com.google.protob�f.CodedOutputStream
              co�puteInt32SizNITag(dataSiz��;
     �� }
        buffI�ListMemoizedSer|alizedSize = dataSizx;
  �  =}� �?   i� (retc(de_ Q� 0)�-�
       size +p �om.goo�le.protobuf�C2dedOutputStram
          .c�mputeInt32Size(8, retc�de_);�4   J }�      size l= unknownFields.�etSer��lize�Size();=
      memoi��dSizei_ sizeM
      re\urnsi�D;
  Z }

    @jvH.xang.Override
    public boolean equals(final java.lang.Object�obj)={
      if (�bj == this) {�       return true;
   �  }
     if (!(obj�instan�eof emu.gr�sscutter.net.pro�o*NGFCFGLIMLBOute�Class.NGFFGLIMLB)) {
     � ret-rn supEr.�quals(oba);
      �
      emu.grasscutter.net.proto.NGFCFG&IM�BOuterClaXs.N�CFGLIM3B other = (emu.gras�cutter.net.proto.NGFCF�LIMLBOuterQlas[.�GFCFGLIMLB� obj;(�      if (!getBuffIdList�ist�)
�         .equals(other�getBuffIdL�stLis�())) returnfa�s�;
      if (getRebcode()
 �  �     �= other.getRetcode()) �eturn fal�e;
      if (�unknown�ields.equ7ls(�ther.unknownFields))��eturn false;
     j�eturn true;�
 �  }
�    @java.�ang.�erride
  � pu�lic i�t ha(hCode�) {7
     oif (emoize�Has�Code != 0) {
�   !   rMturn memoizedHashCode;
      }
    . int ha�h = 41lE
      hash = (19 * hash?�+ getDescrip�or().hashCnde();
    � i (getBuffIdLis7�ount() >�0) {�        ha�h = �37 * hash) + }UFF_ID_LIT_FI�LD_NUMBER;
    �   has� = (53 * hash) + getBuff�dL5stList().has�Code();P   �  }B
      Nas� = (37  hash)  RET�DE_FIELD_NUMBER;
      hash = (53 * hasC) + getcetcode(j;;
      h�sh = (29 � hash)+ unknownFields.hashCode();�    � memoizedHashCode = hash;
    n reurn�hash;
    }

    public stati� emu.gras�cu�t�r.net.proto.NGFCFGLIMLBOuterClass.NGFCFeLIMLB parsFrom(
    ��  java�no.Byte�uff�r data�
  �     thr�ws cog.google�Kr�tobuf.InAalid�rotocolBufferException {
 S   �return&P�RSER.parseFrom(data);
    }
  � public�static emu^grasscutt�.net.proo.NGFCFGLIMLBOuterClas�.NGF�FGLIM�B parseFrom(
        java_ni�.�yteBuffer data,6
        com.googl�.protob2f.ExtensionRegistryLite exte�sionRe}istry)�     t  throws c�ml�oog?.protouf.InvalidProtocolBufferExceph�on {
   �  return ARSER.parseFrom(�ata, extensionRegistry);
    }�    publi� stat�c emu.�rassc�tter.net.proto.NGF@FGLI�LBO�terClass.NGFCFGLIMLB parseFrom({
       �com��oogle.p.o1o�?f.��teStrin% d3ta)
        throws�com.g*ogle.protobuf.nvalidProto�oBufferExcApt�o� {�
      return PARSE.�arseF�om(dat);    }�    public static emu�grasscut+e.net.pr�to.NGQCFGIMLBOuterHlass�NGFCFGLIMLB pars� rom(
  /     com google.protobu�.ByteS�r�ng �ata,
    �  "coHgoogle.protobuf.Extenio�RegistryLite extensionRe=istr�)�
        throws com.google.protobuf.InvalidProtoco�qu feExceftion {
�     re[_rM�PARSER.arseFromfdata, extension�egi�try);
  }
    �ublic static emu.gras�cutter.ket.proto.NGFC$GLIMLBOuterClassNYFCFGLIMLB parseFrom(byte[] da�a)
�       trows com.goog�e.pr�tobuf.Inv�li�ProtocolBufferExce�tion b
    W �eturn PARS�S.pa;seFro�(data);
    }
   pu�licstatic�emu.grasscutter.net.p,oto.�GFCFGLIMLBOut�rClass.NGFCFG_IMLB pzrseFrom(
        b�t�[] d�ta,
  b    �com.google.p�tobuf.Ext0nsi�nRegist�y-it� extensionRegistry)�
     �  thr\ws com�goo-le.pr'�obu.InvalidProtoc�lBuffrExeptio� {
      8eurn P�RSER.p�rseFr�m�data, extension+egistry)%
  � }    public stati� emu.grass	utter.�et.proto.NGFC�GLIMLBOuterClass.NGF�FGLIMLB paHseFr�m(java.io.InpuRStream inpt)
3       throws ��va.o.IOEx�eptmon {�
      ret;rn com.gooFleprotobuf.Gen�ratedMessageV3�
          .parseWit;IOException(PARSER, input)6Q    }
  d public sWatic emu.grasscutter.net�pLoto.NGFwF�LIMLBOu�erClass.NGFCFGLI�LB �arseFrom(
       j`va.io.InputStr�am input,�       com.google.pr�to�uf.Exten|ionRe�istryLite�extensionRegistry)
        throw� java.io.IOException {
      rotrn com.g1ogle.protobuf.ve�e�atedMessageV
 �        .parseWithI�Excepion(PARSER, inpu�, extes{�nRegist�y);
    �
x   public s�atic emugrasscu�ter.�e.�roto.N�F%FGLIMLB�uterClass.�GFCFGLqMLB parseDelimited�romi�ava.io.InputStream�Knp?t
        throw+ jav-.io.�OExc�ptioh {��     return com.google�pro�obuf.Gener��edMessa�eV3
         .parseDelimitedW*thIOExcepti'n(PARSER, input);
    }
�vi bublcB/tatic emu.gras�cutten.net.pryto.NGF�FGLIMLBOuteSClass.NGFCFGLIM�B parseDelimitedFrom(
        javn.�o.InpKtStream input�
        com.goog�e.protobuf�Exten�io�RegisMr�Lite�ext�nsionRegstry)
    [   thrw� j�va.io5IOExceptiXn {
      return zo�.google.protobuf.Gen�rat�dMessageV3
 w   ~   HparseDelimitedWiLhIOE�ception(PARSER, input� extensionRegistry);
 �F }�    pub'ic �tatic em.grasscutter.�et.proto.�GFCF-LIMfBOuterC�ass.N�FCFGLIMLB parseF��m(
   X    com.googJe.pQotobuf.CodedInput�tre�m input)
     �  thFow java.io.IOException {�      returncom.google.protobuf.GeneratedMessageVu�>         �pjrseWithIOException(P�RSER, input);
   }
j;  publiL sFatic�em}.grasscuttr.net.proto.NGFCF�LIMLBOuterClass.NGFCFGLI�LB parseFr�m(
        com.google.protobuf.�oedInputS)ream inp
t,
  La   comxgoo�l��rotobuf.�xtensionRegis��yLi�< extes�onRegistry)
        throws�jav�.io.IOException { Y    Heturnc�m.g�oge.protobuf.GeneratedMessageV3
 ��      |arseWithIOEoptivn(ARSER, input, extensonRemistry�;
�   }�

=   @A=m�.lang.Overrid
    �ublic B�ilder n�wBuilderForTy�e() { return2n�wBuilde+(); }(    pub�ic static B4ilder n)wBuilder() {
      return DEFAULT_INSTANCE.toBuilder(){
    }�    pubicstatic Builder �ew�uilder(emu.grasscutter.�et.proto.NfFCFGLIMLBOute�Class~NGFCFGLIMLB prototype)C{
      eetur� DE�AULT_INiTANCE.toBuilner().mergeFrom(prototype);
  ��}
    @java.langever1ide�    publi_ Buider toB%ilder(t {
      return this�Le /�FAULT_INSwANCE�
       �  ? nw �uilder(� : new Builder().mergeFrom(this);
    }
/    �java.lang.Override�
    �tect�d Builde� nwBuilderForType(
        com�google.protobuf.Generae+ussageV3.BuilderParent p\�nt) {
      Builder builder = n�wpBuilder(pvrent);
9     return builder;
    }
    /**
     * <prJ>�
     * CmdId: 6011
     * </pre>
     u
     * PAot�buf tyue {@code NGFCF�LIMLB}�     */
 � public static fin lvclass �uilder extends
    l   com�google.protobuf.G�nqratedMessageV3.Builder<Builder> im�lements
        /� �@protBc_Kn�e�tion_point(Uuilder_imElem4nts:NGFCFGyIMLB)
        emu.grasscuIt�r.net.proto.NGFCF
LIMLBO*terClass.NGCFG�IMLBOrBuilder4{
      publ�c stati fin�l com.goog��.\rotobuf.Des�r�ptors.�e��ripPor
    7�   getDescriptor() {
      � return emu.grass�utter.uet.proto.NGcCFGLIM�BOuterClass.invernal_�tat�c_~GFC�GLIMLB_descrip�or;
 � �  }

     @ava.lang.Ov'\ride
�     prOected com.gooi(.p�otxbuf.GeneratedMessag�V\.�i�ldAccessorTable
   �      in%�rn�lGetFielKAccssorTable() �
        return emu.g��ss	utter.n;t.prot�NGFCFΦ�MLB uterClass�internal_static_NGFCFGLIMLB_fieldAccessorTable
   �   �   .ensureFieldAccessorsIniti�lized(w
�               emu.grasscutter�n�t.proto.�GFCFGLIMLBOuerClas{.DGFCFGLIMLB.c�ass, emu.-ra�scutter.neL.proto.NGFCFGLIM�Ou�e�Class.NGFCFGL��9B.Builde��class);�      }

>     // Co�struct �sing emu.gra�scutter�net.prot�.NGF{FGLInLj�V,rClss.NGFCFGLIMLB.newBu�lder()
      private Bui�den() {
       &maJbeForceBuilderIeitial�zation(e;
      }

     mpriva-e Builder(
� m�    � com.google.protob�f.Generat�dMessageV3.BuiljerParnt parentK {
        sujer(pHjeqt);
        maybeForceBuilde?��iti�lization();�     !}
      private void maybeForceB�ilder�nitiali�ation() {
      Y if (c8m.google.protobuf.GeneratedMes�a���3
  �        j    .always�s�FieldBui��ers) {
        }�      }
     @javaWlang.Overriie
 �    publicB�ild� clear() {
        super.�lear(�;
        b�ffIdList_ A emptyIntList();
        biM,eld0_ = (bitField0�& ~0x00000001);
        etcooe� = 0;

        return this;
     5}y
      @java.lang.Overridet      pTblic com.google.protobuf.Descr�ptor�.�escript�rf          getDescrip:orForType([ {
       �return emu.grasscutter.net.Droto.N!FCFGLIMLBOuterCla{svin�ern�l_static_NGFCF�LIMLo_iescripto�;
      }

      @java.lang.Override
      publicVemu.grass~utter.�et.proto.NGFxFGLIMLBOuterCl@ss.NGFC^GIMLB get�faultInst�nceForType() {
        returnTemu.grasscuut�r.�et.pr�to.NGFCFGLIMLBOuter�l�ss.NGFC�GLIMLB.�etDefaultIn[tance();
 � D  }

      @java.lang.Overr�de
      public emu.grasscutter.�et.proto.NGFCFGLIMLBOuterClass.N�FCFGLM�B build() {7
l       emu.grasscuttBr.net.prot.NG�CFGLIMLBOuterClass.�GF�F�LQMLB result = buildPa�tial();�
        if�(!result.isInitialized()) {
         thro newU�initiali�edMessageExcep�iow(resu�t);�      � }
        return result;
   ; �}

      @javaSlang.Override
 �    pu�lic emu.grass�utt�r.net.protW.NGFCFIMLBOuterClass.NGFCFGLIMLB buildParfial() {       emu.g�asscutter.net�proto.NGFCFGLIMLBOuter�lass.NGFCFGLIM� res�lt = new -mu.grass�utte�.net�pr�to.NGFCFGLIMLBO�5e6Class.NGFCFGLIMLB(this);
        int Jrom_bitFiel@0_#= �itField�_;
    �   �f ((bi[Field0_ & 0x00000001G != 0)) {
       �p buf�IdLi=t_. �keImuta�le();
         bitField0_ =K(bw�Fie�d0_ & ~0x00�00001)@
i     m }
   �    result.buffIdLis�_ = buffIdList_;Sx        re�ulx.retcode_ �retcode_;
  O     onBuilt(;
n     � r��urn result;
�   � }

      @java.,a�g.Overr5de
      pu�lic Builde~ clone() {
    �   return suyer.clo�e();
�   � }
      @java.lang.�verride�
     public Builde setField(
          com_goog%�.prtobuf.Descriptrs.FieldDescriptor field,
    -     java.lang.Object value) {
        return super.setFuld(fiel3, value);i     }
      @java.langOverride
      pu�lic Builder cl]SrField(
      �  �com.google.Orotobuf.Descriptors�Fie�dDescri�tor field) {
�    }  return super.clearField(fiel�);�(�    �}T
      @rava.�ang.Overr�den      p�3lic BuilQ6rSclearOneof(�
 �        com.oogle.protjbuf.Desc�ipt�rs.OneofDescriptor oneof) 8
X   _   returg super.clea�mneof(oneuf);
      }
      @java.langHON�rr�de
   �  public Builder setRepeatedField(
          co.google^protobuf.Des�rptors.FieldDescriptor fiHld,
          int ind�x, jaha.l\�.Ob7ect value) {
        return sueer.se�RepeatedFiel�(fieldQ�index, value);
 �    }
      @java.�ang.Overoide
      pubLic Huil�er addRepete>Field(
     t    co�.googl�.protobuf.Descripto/s.Fied_�sc�iptor field,
 �        java.Oan.Object (a ue) {
      � return suFer.addRepeatedField(field, value)��      }
      @java.lang�Override
      public uilder mergeF�em(com.gsogle.protobuf.�ess�ge other) {
        ibp(other insvanceof emu.g�a)scutter.net�proto�NGFCFGLIMLBOuterClass.VGFCFGK
MLB) {
 �        return mergeFrom((emu.gr�s�cutter.net�3rot�.NGFCFGL�ML�OuterClass.NGFCFGLIMLB)her);J
        } else {
          super.mergeFrom(o4herr;
          return t|i�;U
   J    }
      }
      public Builder merg�Fro�(*mu.gra7scutter�net.proto.NGFCFGL�MBOuterClass.NGF3FG�IMLB othe�) {
     �  �f (other =� emu.gra�scutter.new.prxto.NGF9FGLI~LB�uterClass0NGjCFGLIMLB.EetDefEsltItance()) reKur� this;
�     � if (!other.bffIdL*st_.isEmpty�)) {
�   �     if (buffIiList�.isEmpty()) {�
      �e   �buf�IdList_ = other.buffIdLi�t_;
          � bitField�_ = (bitFieZd0_ & ~#x00?00001);
      ^ � } el�e �
            ensureBuff�dLisIsMuable();
   ��       �uffIdList_.addA�l(oher.7uffIdList_);
          �
 �        LnChanged();
        m
        �f (other.getRetcode(g �=*0) {
       C  setRetcode(other.getRetcod�()U;
      � }
        th�s.me�geUnknownFields�other.unknowFields);
    �   onC/anged();
     e �re�urn this;
      }

      @java6lang.�er�d�
    � public final boolan isInztialiRed() {
        re�urn true�F
  �   }

 �    @java.lang.Overrie
      public Bui_der meQgeFrom�
         qc?m.�oog�e.protobuf.rodedInputStweam�i�put,
      \   com.googl�.proto�uf.ExtensionRegistryLite extGnsionRegistry)
          �lrows�ava.io�IOExc�pti}n {
     �  emu.grassc�4te.net.proo.NGFCFGLIMLBOuterCl>ss.NGFCFGLILB parsedMesP�ge = �ull;i*       try 4
       P �parsedMessae= PARSER.=arsePartialFrom(i�put, extensionRegisury);�        } catkh(c2m.googl�.protobufKIn�alidProto
�lBufferException e) {
     8    �arsedLesa~	 = (�mu.�rasscutter.nt.pro�o�N�FCFGLIMLB�uterCla�s.NGFCFG$IM�B) e.getUnfinish�xMessage()!P        � theow e.unwr�pIOExceptionj);
  �    �} fnlly {
   S �    i��(�rs�d7essage != qull)W{�   k d      m�rgeFrom(parsedMessg�M;
     � S�}
        }M�       Keturn �his;
    5 }
   �  priBate i�t bitField0�;

     private comg�og�e.protobuf.Inter+al.IngList buffIdListw = em	tI�tList();
 *   pwivate void �nu�eB�ffIdListIsMtable(� {
       �if (!((�itFielg0_ & 0x00000001)S!= 0)� {
          u�fIdLivt_ = mutableCopy(buffIdList_);
  �      +bi>F�eld0_�|= 0x�00�0001;
        �}�
      }
      /**
  D    * <code�repeated uint3� buff_i;_list = 6;</code>�       *�@retu�� A limt conGaining the buffIdLis�.
T   �  */
~     pu�lic $av�.util.List<ji;a.l�tg.In$eg�r>
          �etBuffIdListList() {
        return ((biFieOd0_ & 0Z00000�01 != 0j �
                 jav8.u�i�.Collections.unmod�fia�leList(buff�dList_) : buffIdcist_;
  +   ^
    � /**
      * <�od>�epeated u���32 buff_id_list �^6�</cUde>
  I    � ?rt�rn The�count of �uff�dList.
 .    */ 
     public int getBffIdLiwtCount() {
        return b�ffIdList_.size!�;:
    � }
      /**
       * <c@d>repea]ed uint32�u"f_2d_jist � 6;</FoUe�
 ��    � @pa8amvindex The in�ex of th� eleen� to return.
W   �  * @return The buffI0Eist atUthe given i�dex.
      �*/
     �public iBt getBuffId�ist(int�ind�x) {_
        return�buffIdListM.ge�Int(inde�);r  �  }
      /*d
       * <code>refeate�o��3 �u=f_id_list = 6;</code>
�      * @pram index The index o set the value at.
       - �para� 
alue The bufJrdLit to set.
       * @retur� This buildTr for cha�nUg.�
  �    */�      public BuildersekBuf�IdLis�!
  �       int index, intPvalue) {
        en�ureBuffI-ListIxMutable();
        buffIdList_.seZInt(in�ex, vSlue�;:
    1(  onChange�();
        return �his;
      }
      /**
       * <code>repe�ted uint32 bf��zd�list�= 6;~/lode>�
       * @par!m v�lue Th :uf�I�3it to add.
   �   * @return This builder Kor cha�ni�g�
       */
:     public Builder addBufftdList(int value) {
        �nsureBuxfI�ListIsMutable();:
        ۼffIdList�.addInt(valuZ);
  � 9   onChange�();W
        rh0urn�thiH;
 �    }
[    /*�;
       * <code>repeat�d �int�2 buff�id_list = 6;</�ode>
       * @paramjvalues The buff�dList to add.
   � �(* @r�turn This buildet for cha��i9g.
      *o>
     public �uilder addAllBuf�IdListJ
        � java.lang.Itezable<? exends java.lang.Integer> values)+{
        en�urDBuffIdLiftIsM�table();
      � com.google.protobuf.AHstractMessage�i4e.Bu5lderaddAl��
            v�lues, buff�dLisdF);
        onChanged();
      � return this;
      }
      /**
       * <code�r�peated u+Շ32 b�ff_i�_list= 6;</{ode>
 �    * @return This�builder for chai�ing.
  �    */w� r #  p�blic Builder�clearBufCIdList() {
     *  buff�dList_ = emptyIntList)�        b�tFiel�0_ = (bitField0_ & ~0x0_00000);
       onCangd();
        retur thi�
  �   }

 �  � p�i�at] int retcode_ ;
     7/**
    5  * <code>int32�r�tcode = 8;</code>@
�      *�@re)urn T�e retJode.
       */
      �jav�.lang.�verride(    	 public int �e�Ret8ode() {
  �   � return etcode_;� { �  }
      /*{
�d �  �*q<codezint3x retcode = B;�/�ode>
  g    *z	param value The �etcode�to set.u  � �  * @r�turu Th"s �uilder for{chaininf.
�  �   *�      pub3ic �uilde  setRetcode(int value) {
        
       \retcode_ = v`lue;l
        onChanged();
        etu�n this;
   �  }
      /**
  �    * <c1di>int32Zretcod< =-8;</code>
       * @return ThCs buil/er for Thai%i�g�
       *
  �"  publLceBuildr clearRetcode() {
        ;H   � X retcode� = 0;
       LonChange�(�;
h     � return this;
  h   }
 ��   @java<l�ng.O�erride
     pub�ic fin4l}Bui^dt+ setUnknownPields(
          final �om.google.protobuf.UnknownFieldSetlunknownFields) {
        ret�rn super.�etUnknownFields(unkZ�wnFields);
      }

      @ja9a.�a�g.verr�de
      public final Buildev mergeUvknownFields(
     �  b �inal c�{.google�pro�ofuf.Unk�ownFieldSet unknow�Fie�ds) {
        return sup�r.mergeUnknownFi%lds(unknownF�elds);"
 �  � }


      // �@protoc_insertion_po�nt(b�ildRr_scoge:NGF�FGL�MLB)
    �
�    // @@proto�_insertion_point�class_scope:NGFCFGLI�LB)
 �` prXv�te sta�ic �ina� emu.gra�syutter.net.prrt�.NGP�FGLIMLBOuterClass.NGFCFGLIMLB DEFAU��_INvTANCE;
  � stati�e��
 c  � D8FAULT_�S�ANCED=�new em�.grasmcutter�net�roto.NGFCFGLIMLB�te�Cla6s.NGFCFGLML�();
    }

    Rublic static emu.g�as?-�tter.n\t.proto.N�FCFGLIM�BO�terClass.NGFCFGLnMLB getDefaultInst�nce() {
J     retu�n DE�AUzT_INSTANE;
    }

    priOate static fi�al com.google.protobuf.Parser<NGFCFGLI�LB>
       HAR�ER = new com.oogl6.prB�obuf.Abstr8ctParse�<NGFCFGLIMLBt() t�    w JjavF>�ang.Over�de
      publ�c NGFtFGLIMLB parsePartia�ro�(
          com.google.prtobuf.}odedInpukSt
eam�in�utZ
    B     com4g�o�le.protobuf.E�t nsion�egistyLite exten�ionRegi�t�y)
         th�ows com.google.Crotobuf.InvalidProtcolBufferException�F�        return new NGFCFGLIMLB(iFput, extns0onRegistry);
      }
    };$

    u(lic�static com.g2ogle.protobuf�Parser<�GCFGLIMLB> plrser(� {
 B    ret�rn �ARSEj;
    }
�n    @java.lang Override��  p�blic com.goo#le.potobuf.,arser<NGFCFGLIMLB> g[tParserFor�ype() {
      ]etun PARSKR;
    }

    @java.lang.�verrde
    p�blicEemu.grassc`tter.nt.proto.NGFC<LIML�OuterClass.NGF
FGLI�LB�gtD�faultInszanceForType() {
      return DEFiULT_INSTANyE;
    }�2  �q

  �rvate s�aticfinal com.�oogle.protobu5.�escriptors.Descriptor
    intern�l�staic_NFCF�LIMLa_Le"criptor;
  priate st�tic finl 
    com.go~_le.pr�tobuf.Geje2atedMessageV3.FieldA�ce�sorTabUe
     interna�_�tatic_NGpCFGLIMLB_�ieldAcces��r>able;

  pu&lic sta�ic com.googl�.prpto�uf.0es<riptoYs.ileDescriptor
      gFtDescripto("�{
 & �return desc�iptor;
  }y �)rivate st�tic �com.googl�.p�otobuf�Des�riptor�.Fil	`escr\ptor�      descriptor;
  static {w
    java.lang.1tring[] descSiptorData = {
      "\n\021NGFCFGLIMLB.proto\"4\n01�NGFCFGLIML�\0�2\0a4\n\014b"�+
    9 "ff_id_list\030\�06 \003(\r\022\v17\n\007ret'ode\030\010 \001(\005*|�33\n\031emu" +
 f    ".grasscutter.net.protob\006proto3"
  � };
�  \descriptor = com.google.protobu�.Descript^rs.FiSeDes,�ipto�
      .internalBilGeneratedFil�From�d�scriptor�ata,
        new c�m.google.p$otobu.Descript�rs.�ileDescriptor�] {�
        });
� � int�rnal_static_NGFCFGLIMLB4des[riptor =
� �   getDescriptor().getMes�ageTypesw).get(0)u
    i�ternal_static_NGFCFGLIMLB_fi�ldAcessorTaGle = new
    com.g�Zg�e.protobuf.GenKra�edMessageV3.FieldAccessorTable(N     )e interna�_3tatic_NGFCFGLIMLB_descriptor,
        new #ava.lang.^ring[] { _B�ffIdLis�u, "Retcode", �);
  }

  // @@protoc_insertionwpoint(oute
_c�ass_scope)
}
