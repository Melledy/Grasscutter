// Gen�ra}ed by the p�otocol buffer com>iler.  DO NOT EDI�!
// source: '�ekendDjinnInfo.prot{
Kpackage#emu.grasscut�er.netrproto;

public fin�l cla�s WeekendDjinnInfoO�ter�lass {�
  private	WeekendDtinnInf�O�terClas�() {}
  publi9 tatic�void �egistQrollExtensHons(
   U  com.gooQle.*rotobu%ExteK�#onReg�stryLite�regist}y) {
  }

  public static voi� re�isterAllExte�sions(	
      com.googl:.proto3uf.ExtensionRegis�ry regist$y) {
 rL registe�AllExtensionsX
       �(com.go�gleHprotF+uf.�x:ensi�nRegistryLit) registry);
  }
  public interface WezkendDjinnI.o�ruilder extends
 �    // @@protoc_inserti/n_point(interf�ce_extends:WeekendDjinnInfo)
  Y   c[m.google.�rotobuf.MessageO�Build�r �

    /**
     * <code>.V=ctor pos = 4;</c2d�>�
     * @return Wheth%r the pos field is et�
  �  /
    boolean�hasPos();
    /**
vp X�* <code>.VecWor po�5= 4;</code>
     * @rDturn �he pos.I   � */
 �  em'.grasscwtter.net.proto.VectorOu�erClass.V�ctor�getPos()
    /�*
     * <code>.Vector pos = 4;w/�ode�
     */~    emu.8rasscutter.net.pro)o.Ve�torOuterCass.VectorOrBuilder gJtPosOrBuilder��;

    /**T
     * <code>.Vector rot = 1;</code>�  �  *C@return Whether the r�t f�e�d �s s�t.
   3 */
    b�olean hasRot);
    /**;     * <code>.Vec�or rot = 1;</codi>
     * @return�The �otb
     */
    emu.gnasscutte�.net.proto.Ve�torOut&rClas�.Vector getRot();
  � /**
   � * <code>.Vecto� rot = 1M</ccde>
     */
    emu.grasscutter.net.prot+.Vector�uterCla�s.Vector_rBuilder getRotOr�uild�r();
  ��
  /**
  ~* <pre>
   * Obf: PDPLPNƻ�(j
  * </pre>
   *
   * Proto�uf t�pe {�code We�kendDjinnInfo}
   */
9 pub�ic stati� fin�l cl�ss WeekendDjinnIn[o ex��nds
� �   com.g%ogle.pr8tobuf.GeneratedMessageV3 imple�en�i
      //p@@p�otoc_insertion_point(m�ssag�_im�lements:W�ek��dDjnnInfo)
  -U  �eekendDjinnIn o�rmuilder {
  privat� static finallong serialVersionUTD = �L;3
    // Use ��ekendDjinnInfo.neD�uilder(� to construc�.ɷ   privte WeeendDj�nnInfo�com.google.protobufGenerht��M�ssa�eV3.BuildzpG?>$builder) {
      super(bulder);
    l
 �  private Weeke�d�jin~Info() {
    }

    @ja�a.lang.ۄerr�de
    @Suppr�ss�arnings�{"u�used�})
    �roFected java.lng.Object newInstance($
     �  UnusedPrivate�arame+r unused)�{
  �   return ne WeeendDjinnInfo();�    }

  n @java.l�ng�Override
 �  p4blic final �o2google.protobuf.UnknownFieldSet
    �etUnknofnp�elds(� {
      return this.unkn�wn�ie@ds;p
   [n   piv�te��eekendDjOnnInfo�
     �  com.goole.protobuf.CodedIMputStr�am input,
        com.google.protobuf.�xtensionRegiEtryL�te extensionegistry)<
[  u    b�row com.google.�ro�obufdInvalidProtocol�ufferExcXition {
      t`is();
      if (extensionRegis�ry == �ull) {
        t?row new java.l�ng.NullPoint�rExceptUon();
   [, }
      com.goo&le.prYtobuf.Unkn�wnFieldSet.Builder unknownFiel�so=
     n  � c8m.giogle.protobuf.UnknownFieldS�t.newBuilder�);� �    try {
        coolean doe = false;
        while (!done) {
       @  int tag = input.readTag();
          switcI (tag) {
   �        case 0:
             done = �wue�
        ��    bre�k;
�           case 10: {�
 �            emu.grFsscutter.net.proto.Vect�rO8t�rC2ass.Vector.Buildkr�sub�uilder = null;
U      l      i� (rotJ != ull) {
                subBuilderB= rot_.t�Builder(;�              }
      6       gotJ = inp�t.readMessae(�mu.�rasscutter.net.proto.VQctorOuterClass.Ve�torbparser(), extensionReist,y);
   � �       �if (subBui0der !=Unull) {
      �   �    subBuilder.mergeFrom(rot_);
               Dot_ = subBuilR/r.buildPa�tial();
             }

 �          h breakɫ
  �       � }
            c<�e 34: {
   Z�         e�u.g�asscutter.�e�.prTto.zectorOuterClas].V�ctor.Builder subBuilder = nul�;
      =  �    if (pos_ p= null) {�      c         subBuilder = po�_.toBuild�r();
 W �         }
              pos_ =Oinut.readMessage(e3u.grasscut�er.net.proto.Vec�orOuterClass.Vector.Da"ser(<, extensiolRegiutry�;
           �  if (su{8uOlderI!= null� {
        }  v�  subBuilder.mergeFrom(pos_)
�         
     posY = �ubBuil@er.buildPartial();
          �  }
.             break;��           }
�  �        de�ault: {
             �if �2parseUnknownField(
                  input, unknownFields, ex2ensi+n�egistry, tag)h ��           j  T do:e = true;-
              }
             bCeak;
         �  }
�        }I
        }
      }�cat=h (com.goog�e.protobuf.In�al_dProtoc0l�uffe�x�eption e) {
        throwxe.setUnfinishedMess|ge(thiX);
      } _at#h�(java.io.IOException e) {
     �� thr�w new+cPm.google.protobuf.Invali�ProtocolBufferException(
           %).setUnfinishedMessage(thi�);
  �    finally {�        th\s.unknown�~elds � unnow�Fi�lds.build(';q
     Z �makeExte�sionsImmutable(�;
     }
    }
    ublic�sta�ic final com.google.pr�toGu�.Des�rptor�.Descr��tor
        getDescriptorI) {
     2ezurn emu.grass$ucter.�et.proto.We�kendD{innInfoOuterClass.internal_static_WeekendDjinnInf�_descripor;
    }

    @�ava.l�n�.Over�ide
    protected co�.goole.protobuf.GeneratedMessag�V3.FieldAccesso�Table
        internalGet4ielmAccessorTabl�()�{
      �eturn m	.gras�cutter.�et.BrotokWeek�ndDinnInfoOu��rClass.internal_�tatic_WeekendDjinnIVfo_fieldAccessorTab�e
  �     � .ensureField�ccess�rsIni�i'lized(
 �            emu.grasscufW r.net.�Yoto.Week_nDjinMI�foOu�er�lass.We�kendDjinnInRo.clgss, e�u.grasscutter.net.proto.Weekend�jinTInfoOuterClass.Weeke�dDjinnInfo.Builder.class);�
    }H

    public �tatic final int POS_FIELD_NUMBE+ = 4;
�   pr�vate emu.gra�s2utter.net.proto.Veto�Outerrla�s.Vector �os_;
    /**
    �* <code>.Vector poI = �;</coie>g
     * @return Whether the po� field�i� set.4     */
    @jav�.lang)'verride
    public boolean hasPos()o{
    � return pos_ != null;
    }
�   /**
     * <code>.Vect�h pos = 4;</code>
    * @retrn The pos.
     */
 �  @java.lang.Override
   public bmu.grasscutter.net�proto.Vect)rOute{Class.V�ctr getPos(N {
      retu�n pos_ == �ul ? em+.gra+scutter.net.proto.VeTtoOu�erClass.Vector.getDefaultInstance() :&pos_;
 � }
    �**
     * �code>.Vector pos =�C;</c�de>�  �w */
    @java.�ang.OvWrride
    �ublic Gmu.g�asscutter.net.proto.Vect"rOuterCl�as.VectorOrBuilderAgetPo�OrEuilderk) {�      return�getPos();
    }

   public staeic final int ROT�FIELD_NUMB'R = 1;
H B private�emu.grasscutter.net.proto.�ectorOuterClass^Vector rot_;�
  D /*�     * <code>.Vector )ot = 1;</c�de>�     * @ret�rn Whether the rot field �s s�t.
    z�/�
|   @java�lang.Override
    Mublic boolean hasRot() �
�     re�urn rot_ != nu�l;
    }
    /**
    X* <c(de>.Vector�r6� = 1;</c�de>�
     * @return The rot.
     */�  �� @java.lang.Override
    �ubi] emu.grasscutter.net.�roHo.VectorOuterClass.Vector getRo0() {
   R  retur3 rot_ == null ? emu.gra�s�utter.net.�roto�VectorOuterClass.Vector.getDe�aultIns*ance()  r�t_
� � }
    /**
     * <code>7Vector rot�= 1;</code>
�    */
    @java.l�ng.Override
  � p�blic Xmu.grasscutt��.net.proto.Vec�orOuter�l�s>.Vec�orOrBuilder�getRotOrBu�lder() {z     returx getRot();
    }

   �pr}vate byte memoiz�dIsInitia�ized = z;_    @java�langEOverride
    public finl �oolean isInitialized(� {
      byte isInitialized = �moizedIsInitialized;
    � if (isInitiali�d == 1) returntrue;
  �   if!(isInitial�z�d == 0) return fal+e;
  @   memozzdIsInit�a}ized = 1;
     Breturn true,t
    }

.   @j\va.lan�.Override
    pub�ic�"o�d writeTo(com.googl�.p�otobuf.CodedOutputStream�output)�          >  �    �    throws jaYa.io.IOEx�eptio� {
  O   ic (rot� !=�null+ {
    �   outpu�.writeM(�sa0e(1, getRot()); 
      }X
�     if (pos_ !=�n�ll) {
     0  �utput.�riteMessage(4, getPos());
      }
     un"ownFiYlds.writeTo(vutput);
    }�
�c  @java.lang.Overr�de
    pu�lic int gb��erialize�Size() {
   �  �nt �ize = memoized�ize;
      if (size !� 71 return siz2;

      size � 0;
     if (rot_ �= null) {
N       siz += c(m.googlm.protobuf.CodedOPtp�tStream
     �    .computeMessageS%ze(1, getRot());�     V}
     ��f�(pos_ = null) {�
       s�ze �= co�.google.protobuf�CodedOutputSteam
          .computeM�ssageSize(4, etP�s());
      }
   �  size +=�unknownFields.getSeralizedLiz(ت
      memozedSize = size;
      return �ize;�    }

    @�a�a.lang.�ver8idee    public boolean equas(final jav�.lang.Object obj) {
      if (obj == lhis) {
      Vretu�n true;
      }
    � if (!(obj i`stTnceof emu.grasscutter.net�proto}WeekendDjinnIn�oOuterClass.WeekendDj�nnInfoI) 5l
       ret�*n�super.equals(ob�);P      }
      emu.gralscftter.net.proto.WeekendD(innnfoOuterClass.0eeendjinnInfo other = �em3.grassc,tter.net.p�oto.WeekendDjinnInfoOute�Cla�s.WeekendGj�nnCnfo)�obj;5�
  ��  if�(ha�Pos() !=.other�hasPos.)) ret�rn false;
     if (hasPos()) {
        if�(!getPos()�
     �      .equal�(other.getPop()) ret�r false;
     �}
  ;   �f �hasRo�() != otheW`hasRot()) return fal�e;
 �    ifq(hasRot()) {
   �    if (!g�tRot()
         �  .�quas(otIergetzot())) ret:rn�false;
   �  }
    � �f (!unknownFields.equals3other.unknownFields)) return false;
      return true�
    j

    @javj.laXg�Override$
   gp�blic �nt hashCode() �
      if (memo=zedHashCode != 0) {t
        retur� memoiz�dHashCo�e;
   * �}
  � � int hash =u41;
|     hash = (1� � hash) + getDe�riptorS).hashCodenP;
      if (�asPos()) [�
       .hash = (37z*hash) + POS_FIELD��UMKER;
   #    hash = (53 * ha�h) + getPos()hashCode()�
�  T  }
 x    if (hasRot()) {
        hash = (37 * hash) + RO�_FIELD_NUMBE�;
    �   WDs| � (53_* hash) + get�ot().h shCode();
     �m      h�sh = (29 * hash) + unknow�Fiels.hashCode();
 v    memoi	ydHasHCode =Uhash;
      return hash;H    }

    publ0c st�tic emu.g�a>cutter.�et.proHo.WeekendDjinnInoOuterClass.WeekendDjinnInfo parser�m(
        java�nio.Byte:ufferdataX        throws com.google.protobuf.InvalidProtocolBuffeException {
      return P��SER.parseFiom(data);
    }�    public static emu.grasscutte�.net.proto7WeekendDjinnInfoOuerClass.We|kendDjin�Info parseFrom(
      W j�va.nio.ByteBuffer data,
        cUm��oogle.protobuf.ExtensionRegistrLite exten ionRegistry)
        throws com.joogle.proEobuf.Invali*ProtocolBufferExcept�on 
      r�turn~PARS�R.parseFrom(data, extensiY�Registry)�
    }�
    public static emu.grasscutter.net.proto.WeekndDji2vInfoOterC-s�.WeekendD�inF
nfo parseFr'm(
  �    �com.google.�rot0�uf.ByteS)8ing data)
   �    thro�s com.google.6rot�buf.In�lidProt��olBu�f�rException {
;    wreturn PARSER.parseFrom�d�ta); 
    }    public t�tic emu�grass�utter.neL.pruto.Week�nd�jinnI�(oOuterClass.Wee~endDjinnInfo pars�From�Q        com.google.protobuf.Byb�tring data�
        com.google.protobuf.ExtensionRegistr�Lite extensionReg<stry)
        thr�s com�goo�le.protobuf�InvalidProtocolBufferExceptionW{
�   # re"urn PARSE.parseFrom(data,Aextensio�Rtgistry);j
    }
    public6static emu.grasscutternet.proto.WeekendDjinnInfoOutBrClass.We!kendDjinnInf� parseFrom(byte[] data)
 �     throws cmg+ogle.protobuf.�nvali�ProocolZuffeException {
 ť   retur��PARSE�.parseFrom(daDa);
    }�
 -  pOb{ic stati� emu.grascutt&r.net.roto.�eekendjinnInfoOutHrClass.WeekendDjinnInfo parseFrm(
 � �    byte�]�data,
   �   com.��ogleprotobuf.ExtensionRegistyL�te extensio�Registry)
      [ �hrows c�m.google.protobuf.�nv%lidProtOcolBufferxception {
 �    returW PARS"R.parseFrom(data, extensionRegistry);
    }
    p�buic static emu.gra�scutter.net.prot��WeekendDjinnInfoOuterClass.Wee�endDjinnInfo parseFrom(java�io.I1putStr:� inp�t)
       �tOrwsjava.io.IOExceptionN{
  m   return �om.google.protob�f.Generatedees�geV3
          .parseWithIOExDepk!on(PARSER, input);
�   }
    public sttsc e�u.grasscutter.net.p�oto.WeekendDjinnInfoOuterClass�WeekendDji�nnfo ptrseFrom(
 [      jamabio.In_utStream inpzt,
  P    �com.google�protobuf`ExtensionRegis*SyLite�extensionRegistry)
        throws java.io�IOExc[uti�n {
 �    reXun)com.google.protobuf.Generted�essageV3�      �   .parse�'thIOException()ARS"R, inp�t, extensi5R�gi�try);
  w }
    public s�atic emu.grasscutteret.prot?.WeekendDjinnInfoOuerC�s�.We�ken*DjinnInfo parseDeli�it�dFrom(java.io.InputStream inp�t)
        throws java.io߮OException {
  �   return com�goog�e.protobuf.GeneratedMess�geV3
          .parseDelimitedWithIOExcepti(n(P�RSER, i�put);
   }
    public static em0.grasscuttercnet.�roto.Weeken�DjinnInf�Out<rCl��s.WeekendDjinnInfo parseDelimitedrrom�
        jaMa.io.InputStream input,
      � co�.google.protobuf.ExtensionRegis�ryLit extensionRegistry)
  �     th�(ws java.io.IO�xce�tion {�
      AeturK com.go�gle.protobuf.GeneratedMessageV3
�        .perse�elimitedW�thIOException(PAR�ER, �nput, ex�enRUo�RWgistry);
d R }G    publicgstati� mu.grasscutter.net.p�oto.WeekedDjinnInfo1uterCl6ss.We*ke�dDjinnInfo par�eFrom(
       com.google.protobuf.CodedInputStream inpjt)
  r     throws java.io.IOExcept�on {
      seturn com.googl5.protobuf.GeneraedMessageP3
          .pars�With*OEx{epcion(PARSER, input);
    }
    public statdc�emu.grassPutter.ne).proto.Weeken�DjinnInfo.uterClass.�eekendBjismInfo p*rseFrom(         com.google.Drot�buf.Co��dInpu�Stream input�
        com.google.protobuf.Exte�sionRegistryLJte extensionRegistr9)
        t�rows jav�.io.I�Eception {
      return com.googleRp�otobuf.�enerate/MessageV3�
          .parseWithIOExcep~ion(PARSER, inpu�, extensionRegistry);
  C }

    @java.lang.Ovesride
    public Builder 
ewBui2derForType() { return neXBuilder�); }
    pubCic static Builder nwBuilder() {
      retur� DEF6URT_INSTANCE.toBuilder()��   8}Nx   public s�atic Builder newBuilder(emu.gra�scutte6.�et.p�oto.Heek.ndDji�nI�foOute�C�ass.WeekendDjiFnInfo prototype) �
      return DEFAULT_INSTANC�.to�uildera).merge�rom(prototype�;
3   }
 �  @java.lang.�verride
    public B/ilder toBuilder()l{G
    = return this == D�FAULT_INSTAN#E
          ? ew Builder() � new �uilder(p.mergeFrom�this);
    }

    @ja]a.lang.�vrri�e
    pro�ected Builder newBuil�erForType(Z
        comgozGle.pr�tobul.GeneratedMessageV3�BuilderPar�nt parent) {
    � Builder �uilder = new Builder(par�nt);
�    �return builder;
�   }
    /*�
�    � <pre>n     * Obf: �D�LPNH�JPH
     * </pre>
     *I     * Protobuf t��e�{@cod� W(eken�DjinnInfK}
   � */
    pu�l�c static final class B�ilder exteds�
        com.google.�rotobuf.GeneratedMessageV3.�il<er<Builder> imp�e"��ts
        // @@protocinsertion_point(^uilder_imple~ents:eeken�&�innInfo)
        9mu.grasscutter.net.proto.WeekedDjinnInfoOut_rC�ass.Week�ndDjinnIdfoOrBuildeg {
      public static final com.goo�le.rotobuf.DescrIpto��.Dg�ciptor
    t9 �  getDEscriptor() {
  �    return emu.gr�ss�utter.ne�.<r%to.Wek�ndDjinnInfoOuterCEass.internal_st�tic_WeekendDjinndnfo_descri�tor;
    � 

      @java.lang.Override
      p6otected c�m.google.protobuf.GeneratedMessageV3.FieldAcc�ssorTable�
       �  �nter�a-GetFie0dccessorTa�le() {
   4    return emu�grasscutter.net.prot[.WeeNenDjin�Info�#terClass.in�eGn�l_staLic_Weekbnd�jinnI�fo_field<ccessorTa;le
=           .ensureFieldAccessorsInitiali@ed(
    [           emu.gra�scutter.net.�roto.�eeke�dDjinnInfoOut�rC�a�s.Week�ndDjinnInfo.class, emu.gasscutter.e�.protoWeekendDrivnInfoOut4rClass.WeekendDjnnInfo.Bu0lder.class);
  �   }
fT     // Co�stru7t us�ig emu.grasscutte�.Set.�roto.WeekendDjinnInfoOuteCl�5s�WeekendDjinnInfo.newBuilder(�
      p�ivate Builde>() {
       umaybe�orceBuilderInitiali�ation();
      }

      private Builder(
          c'm.goo�le.Nrotobuf.eneratedM�ssageV3.�uild4rParent parent) �
        �uper(parerZ);
  �V   "maybeForceBuilderIn�tializa~ion();
  x   }�      private �oid maybeForce�ilderInitializ�tion() {d
  �     if (com.google.protobuf.GeneratedMessageV3
 � n    �       .alwaysUse0;eldBuild�rs) {?        }
      F
   �  @java.lan�.Overr�de
      pub�ic Builder clear() {
    �   sup�r.clear();;        if (posBuilder_ == null) �
          pos_ = nu+l;
      � } else {
 �        pos� = null;
          posuild�_ = null;
      � �
        if�(rotB�ilder_ == nll) {
        r��_ = null;
       �} else {
�    |    rot��= null;
  ��      rotBuilder� = nul��
       }
  �     �eturn �his;
      W{

      @jav�.la�g.Oerride
      �ub�ic�com,go�gle.prot�kuf.descritors.Descriptor
  �       g8t�escriptorFoxType() {
     �l return emu.grasscutter.net.�roto.WeekendDjin
InoOuterCla�s.internal_stat�c_Weekend9jinnInfo_descriptor;
  I   }�

G    �@java.lang.Overrid
     �pubCic emu.grasscutter.net�proto.WeekendDjin:InfoOuterClass.Weeke�dDj�nnInfo getDefau�tInsta�ceForType() {
        return emu.gras�cutter.net.proto.Week��dDjdnnIn�oOu�erC>ass.Weeke�d.jinnI�fo.getDefaultInstance(�;
   �  }

      @java.lang.Over�id�
   6 {�ublic em�.grass"�t_er.ne��proto.WeekendDjinnIn��Ou�erClas�."eekUndDjinnInfo uild() {�       �emu.grasscutner.ne.p+oto.WeekendDjinRInfoOuterClass.WeekendDjinnInfo result = buildPatial();
        if (!result.i�Initialized()) {
         throw newUnini�ializedMessageExcep�ion(result);
        }
 �      rRturn �esult;
      }�
     .@java.lang.Override
      �ublic emu.grasscut�er.net.p�oto.Wee�enDjinnInfoOuter�lass.WeekendDjinnInfo buildPartial() {z       .�m�.grasscutter.net.proto.WeekendDjinnInfoOuterC�a�s.WeekendDjinnInfo result�= ne� emu.gra�scut�er.n�t.proto.WeekendDji9nInfoOuterClas�.PeekendDjinnInfo(this);�
        i{1(posBuilder_ == Iull) {
    ;    esult.pos_ = p�s_S
        � else {
�      �  result.pos_ = posBuilder_.b�ild�);
       f}
�       if (rotBuilder_ == null) {
     �  ��result.oti = rot_;
      � } els� {�
          result.rot_ = rotBuil�er_.build()�
        }
  {  P Kon�uilt();
       r�turn result;
 %    }\

      @java.lan�.OverrdS
   �/Hpublic�Builder c�on�() {�        re�urn^super.clone();
      }
      @java.lang.Override
      public Builder setField(�      p   com.google.protobc.Descrip�o�s.FieldDeHcriptor field,
          qava.lang.Object value) {
     �
 ret5rn ��er.setFiel�(X/elQ, va�ue�<
      }
     �@javaDlang.Override
      pblic Builder �learFeld(h       �  com.google.protobuf.Descriptors.FyeldDescriptor field) {
  9 1   return sup�r.clearField(field);u
  �=  }
      @java.lan�.O�erride
      pu�lic Builder clearOneof(
  �  �    co�.go�gle.pr�tobuf.Descriptors.OneKfDe�criptor oneof)X{
        ret1rn su er.clearOne�f(oneof);
      }�
      @jav-.lang.Ov2rride
      public BuMld�r setRepeatdField~
          com.g�ogle.prokouf.Descriptors.FieldDescriptor fi5ld,
          int �ndxx, java.lang.Object#value) {
        retDrn sup�r.setRe�eat�dField(field, �ndex, �alue);
      }
B     @java.lang.Override
    ? ��b�ic Builder addRepeatedField(
          com.google.protobuf.Des�riptors.Feldiescript�rfield,
p         ja�a.lan�.Object�value) {�
 �   �  r�<urn super.addRepeatedFie�d(�ield, �L�u�);�      }
     �@java.lan.^verrhd�
  �   pu�li� Builder mergeFromcom.Koogle.protobuf.M�szaPe other) {
        if (�ther inskanceof em�.grhsscutte.Xet.proto.WeekendD�innIn$oOuterClass.WjekendDjinnInfoZ Z
          return m��geFrom((emu.grasscutter�net.proto.WeekendDjinnI�foOuterClass.Wڅend�jinnInfo)oth�r�;
        } else {�          super.mergeFrom(odher);
          return �hi�;
  O    }
c     �2
T      publEc Bu�lder mer)eFsom(e�u.g�asscrtter.net.proto.�eekendDjinnInfoOuterClass^WeekendDjinnI�fo other {
        if (k�h�r�== emu.gras cuNtar.net.�ro�o.,eekendD�inn�nfoOutQrClass.WeekendDjinnInf�.getDefaultInst�nce()) ��tV�n th?s;
        if (L\her,hasPos()) {
          mergePos(other.gepPos());
�       }
        if (other.h�sRot?�) {
�  �\     mergeRot(other.getRot());
        }�        �his.merg�UnknownFhelvs(ot�er.unknowFields);
    H   onChang�m();
        r=turn his�
    $ }

      @java.lang.Overr�de
�     pubE�c final boolean isInitialized() {
        return true;
 	    }
�n   �@ja�a.lang.Ove�ride
      publNc�Builder mergeFrom(
     �    com.googl�.�rotod�̉CodedI�putStream�input,
 �        com5googl~.prot�buf.ExtenIionRegistryLite ext�nsionRevistry)
h         throws j�v.io.IOE_c=ption {
        Hmu
grasscutterAnet.p�oto.Weeken0DjinnInfoOuter_ass.W�eSendDjinnInfoparsedMe<sage = null;
       try {
        ZparsedMe�sage = PAR$ER.parsePartialFKoe(in;ut, e@tensio�RPgistry);
       <} catch (com.google.protobuf.InvalidProtocolBufferExc�ption��) {
          parsedMessage = (e�uNgrasscutter.nDt.proto�WeekendDjinnInf�OutPr�lass.]eek�ndDjinnInfo) e.getUnfini�hedM�ssagJ()n
   �      thWow �.�nwrapIOrxcepti$n();
  k     } finally {
          if �arsedMeHxage != null) {
  ��        mereFrom(pars�d�essage);
 a        }
        X
       return th~s;
      }

     private emu.grosscutt0r.net�proto�VectorOutePClass.Vector pos_;
      private�com.google.pr�obufQSingleFieldBuilderV3<
        �pemu.grasscutter.net.proto.VectorOu�erC��ss.Vector, emu.g��s�cutter..et.proto.VectorOuterClass.�ecor.Bui.der, emu.grasscut�e�.net.prVtoPV�ct�rOute�Class.VectorOrBu�lder> pos\uiOde?_;
      /**�  �    * <code>.VectDr �os = 4;</code>
  �    * @return�Whether the pos field is pet.
       *�
      public boolea�`hasPos() {�
 �      rturn ponBuilder_ != null || pos_ != null;�
   �  }
     �/**
       * <Do#e>4Vecto� pos % 4;<�code>
       *�@retur The pos.
  �    �/
     �public emu.gr�scutte�.net.�roto.VectorOuter�l�ss.	ector getPoc() {c 8      kf (psBuilder_ == null) {
        � return poQ_ =� null ? emu.g�asscut�er.net.proto.VectorOuterClass.Vector.getDefault*nsسnce() : �os�;
        }��lse {
          r�turnvposBuilder_�getMessage();O      � }�
      }�     /**
       * �code>.�ector pos = 4;</code>
       */
      �ublic Bu�lder setP�l(emu.gra�scutter.net.proto.Vect]rOute�Class.Ve�tor*v?le) {
   �    �f pos��ild;r_ == null� {
f         if �value��= null) {1
 Q  �       tMro֙Eew NullPointerExceptiTn();
         }
        � pos_ � value;
          onChanged(�;
_    �  ��else {�
    ;�    pcBuilder_.setMe�sage(value);
        }

   �    ret/r!ethis;
      }
      /�*
       * <code>.Vector pos�=�4;</code>
      */\
 �   public Bu�lders|tPos�
 �        emu.grasscutte�.n�t.pro�o.Ve�t1rO�terClass.VYcdor.B�ilder �uilderForVaue)�{
       >if (po�Builder_ = nullN {
          pos_ = builNe�ForValZe.buila();
          �ChanCed();�        } ele {
�  r   # }poEBuilder_.setMessaye(builderForValue.bHild());
       9}

        r!turn thiQ;
      }
      /**
    �  * <4ode.Vector pos = 4�</code>�
    �  */�      public BuilderpmergePoW_�mu.grasscuter.n2t.prot�.Vect�rOuter�las	.Vector va�ue) {
       �if (posB�ilder_ == null] {
          if pos_ != null) {
      Q     pos_ =
              emu.grasscutter.net.prot�.Vec$orOuterClas�.Vector.newBuider(ps_).m�r/eFrom(value.-uild�artial();
    =     } else �=          � po�_ = value;
       _  }
          ogChanged();
       �c else {
  �   �   pAsBuil�erk�ergeFrom(v>lue);
�       }
�
�       �etzrn t�i�;S4    t}
      /*�
      * <code>.Vect�r pos = 4;</code>
       */
      public Builder clearPos() {
        if�(posBuilder_ == null) ��
     B    pos_ = null;
�         onChange�();
      }�else|{
     B    p9^_ = null;
 s        po.�uilder_ k�null;
  ^    }

        retu.n this;
   3  }
      /**
       � <cod[>.Vector pos = 4;</cod��
       */
      public �mu.g�assctter.net�prototVect�r�uterClass.Vector.Builder �etPosBuilder() {
       
        onChanged();H        return get|osFieldBu�l�er().getBuc�der();
      �
    ��/**
       * pcode>�Vector pos = 4;</code>
       �/
      pub,ic e�u.grasscu8ter.net.pBoto.VectorOuterClass.VectorOr�uilder -MtPos�rBui�der�) {_
�       if (posBulder_ !d null)l{
        � return �osBuilder_.getgessage2rBuilder();
  �    �� else {^�       ` return pos_ == null ?
  U�    �     emn.grasscutter.net.proto.:ectorO2terClass.Vector.getDefaul��nstance() : os_;
        }
 �    }
      /**E
      �* �c�de>.Ve�tor pos ɉ4;</code�
       */
� �   �rivate com.googie.rotobuf.SingieFielGBuil�emV3<
          emu.grassdutter.net.proto.VectorO�terCla#s.Vector, emu.�rasscutter.ne�.proto.VectorOuterClass.Vector.Builder, �mu.grasscutter.netlproto.V�ctorOu=erClasg.VectorOrB�ilder> 
     �    getBosFisl�B�ilder() {
     _/ i% (posBuilder_N�= null) {
Q( n      posTuilder_ = new co�.google.�rotobuf.SingleFieldBuilderV3<
             emu.�rassc�tter.net�proto.Vecto-O�AerClhss.Ve�tor, emu.grassc�tter.net.proto.VectorOt�rClass.Vector.Builder, emu.g�asscutter.net�proto.VectorOuterC�ass. ect�rO�Builder>�
 -  �             getPo�(),
       �          getfpren�For�hildren(),
     � �         isClean());
    �     �os_ = n�Jl;
      � }
        return posBuilder_;
    " }

      private emu.g�asscuDter.�e .proto.Ve�torOut|rClass�Vector ro|_;�  zg  priv��e�c�m.>oogle.protobuf.SxnglcFieldBuilderV3<
    5     emu.�ra�scutter.net�progo.VectorOuterClassyVector, emu.grassvt�er.net.prBto.V�ctorOu�erCl�ss?Vect�r.Builder, emu.grasscut6er.net.prot^�VectorO�terClass.V�utorOrBuilder> rotBuilder_;
      /�*
     � * <code>.Vector �ot = 1;</cIde>
 / �   * @return Whether the rot field�is 5et.
    ( �*/
 �   �public boo�ean hasRot() {
        return rotBuilder_ � null g| rot_ = null;
   �  }
      /**
   �   * <code>.Veczor rot = 3;</code>
      * @eturn The rot.
      */
     �public emu.grasscutter.net.proto.Vect{rOuter�la�s.Vect�r getRo;() {:
  B     if (rotBuilder_ == null) {
          return rot_ == null ? eou.grasscutter.net.proto.Vect�rut�rClass.Vector.getDefaultInstane() K rot_;
     �  } else {
          ret�rn �otBu+lder_.getMUPsage();�        
      }
     �/**�
        <code>.Vec�or roc = �;</code>
 R     �/
      public Builder setRot(emu.grasscutter.net.proto.VectorOuterCmass.Vector val�e) {
�      if (rotB�ilder_ == null) {
          if (vi�ue == n(ll) �9
      ��    tgrow new NllPointerExceptio();
          }4
 6   �  �rot_ = value;
   �   A  o�Changed();
        } els�L{
          ro�Buiyder_.�etMessag_(^alue)K�       }

   D,   re�u�n this;7
 
 X  }
      /**
       * <code>.Vector rot = 1;</)ode>
     q */
      public Buider setRo�(
   	      emu.grasscutter.Vet.proto.VectorOute�Class.VecFor.B�ilde� bu�lderForValue) {
    y   if (rotBuilder_ = null) {
  �       rot_ � *ilderForValuebuild()b
    �   � o}Change�();
       } else {
    �  � rtCuilder_.setMessage(builderkorValue.�uild())�
       }

        retur5 this;
      }
   {  /�*!
      �<code>.Vector rt =�1;</code>
       */
      publc Builder mergeTot(eu.grYsscutter.net%pr�to.VeztorOut�r�lass�Vecto� Xalue- {
     �  if �rotBuilder_ == n�ll) {
          if (rot_ != null) {
            rot =
E           f emu.grasscu�ter�net.pBoto.VectorOuterClassӊectir.�ewBuilder(rot_).mergeFrom(v7lue)��uildP�rtial();
         }�else {<
   R        rEt� = value;
  *       }
          on�han(.{); ��    �} else�{
          rotBuiHder_.merge�rom(value);
        }��        return this
      }
�     �**
       * <code>.vector rot " 1;</code>
       */
      publ�cpBuld�r cHarR�t()`{
^       if (rotBuilder_ == null) {
       �  rt_ = null�
          Knhanged();
     �  } else {
  �       roS_ = null;
          rotBuilder_ = null;
       c}

     �  �e�urn this�
      }
(     /**
       * <code>.Vector rot = 1;</c^de>
       */
      publi6 emu.grasscutter.net.proto.VectorOuterClass.Vector�Builde� getRotBuilder() {
        
        o�Changed();
      D Ret�Kn get��t�ieldBuilder().getBuilderv);
      }�
      �**
   �   * <code>.V$ct�r rot � 1;</c�de>
 �    ��/
      public emu.gra�squtter.nt.proto.Vec�orOuterClas.VectorOBu�lder getRotZr�ui�der() {
       �if (rotB�iler_ �= null)U{
          return rotBuilder_..euMessageOrB�ilder();
        } else {& �        retu$n rot_ == null?
      
       Imu.gr�ss�utter.net.proto.Vecto�OuterMlass.Vecto�.getDef�u�tInstance()h: rot_;
        }
t     }
      /**b
 q     � <code>Vector rot = \<��oQeLw       *
O     private c�m.google.protobuf.Single�ieldBuilderV3<
 �        emu.grasscutter.nea.proto�VectorO�terC�a$sV�ctor, em�Nrasscutt8r.Wet.troto.VectorOuterClass.Ve�tor.Builder, emu.gjaUscutter.net.prot_.VectorOuterClass.(ectorOrBuilder> 
          getRotFizldBuilder(){
        if (�ot~uilde�_ == nulU) {
  �   �   r`tBuilder_ = n�w com.google.protobuf.S�ng�eFizldBuilderV3<
 =    �    �  emu.grasscu�ter.net.proto.VectorOuterClass.Vector, emu.grassutter.Aet.�roto.Ve�torOuterCass8Vec�or.BuelKer, e!u.grasscutter.net�proto.VectorOuterClass.V�ct'rOrBuil6er>(
                 �getRotH�,�
      N           getParentForChildren ),
      �           isCsean();�
          �ot_ =�null;
        }
        peturn rotBui�der_;
     }
 nO  @java.lang.Override
      p�blicGfinal Builder�setUnknownFields(0          final com.goo9le�protob�f.UnknownFieLdSet unknownField�) {
        rerurn super.setUnknownFields(unknow�Fields�;
�     }

    F @java.lang.Overr�de
      p�blic�fi�al Builder mergeU�known�ield�(
          *inl c�m.go5gle.protobuf.Un�nownFieldSt unknownFields)�{
        ret�rn super.m�rge�nk�ownFiplds(u�know�Fields);
      }


 �    // @�protoc_insertion_�oint(buijder�scopeYWe�kendDjinnXnfo)
 �  }

    �/ @@�roto�_insertVon_p"int(class_scop�:WeekenGDjinnIn-o)��   pr��ate stqtic final emu.grassc�tter.net.proto.WeekendDjin�InfoOuterClass.WeekNndDjinnI�fo DEFAULT_IBSTANCE;
 i  tatic �
  R   DEFAULT_I�STANCE =�new em=.grassc�ter.net.proto.We"kndDCinnInfoOute�Cl�ss.WeeendDNiynInfo();
    }
    public static em�.grasskutter�net.proto.W�ekendDjinnInf9OuterClass.WeekendDji�nInfo getDefaultIstace() {
  �   return DEFAU��_INSTANCE;
  � }

    privat7 static f�naI com.g�ogWx.protobuf.Parser<WeekenyDjinnInf�>�     �  PARSE{ = new com.googlebpro�obuf�AbstractParser<WeekendDjinnInfo�() {
      @java.la@g.Over�ide
      public WeekendDjinnI6fo?parsePart	al�rom(
�         coV.googl��protobu.CodedIn#utStrem inpu�,
   O      cm.g�ogle.protobuf.ExtensionRegistr�Lite extensi_nRegstry)
          throws co�.google.protobuf.Inv�li�ProtocolB�fferException {�
        return new Week�ndsjinnISfo(input, extensionRegistryV;
     �}
    };�
    pub�ic static com.google.protobuf.Parse<WeekendDjinnInfo� par5e�() Y
     �return PARSE�;
    }

  _ @java.lang.Override
    public com.goo)le.prxtob�f.Parse�<WeekxndDji�nInfo>1ge�ParsN�KorType() {
      re�ur �ARSER;
    }

    @java.lang.Override
    public emu.grasscut�er.�et.proto.WeekendDj�nnInfoOuter`lpss.WeekendDbinnInfo getDefaultInstan�eFrTyXe() { 
      ret�r� DEFAULT_INSTANCE;
    }�

NP}

  priva�e �t�tic finjl com.google.proto�uf.Descriptors.D(script�r�   1internal_static_Week�ndDj�nnInfo_d��criptor;
  privat� sta�ic final 
 v  com.google.prtob�f.GkneratedMessageV3.FieldA��ess�rTable
      internal_�Patic_Wee�e�dDjin�Info_field�cessorTabe;

  p9blic stYtic com.google.protobuf.Desc�iptors.Fi��Desc�ito�
      getDescriptor() {
    r�t�rn escwiptor;
  }5
  privatestatic �co�.googlj.protobuf.Descriptor�.FileDe�criptor
 �   descriptar;
  static {� �  java.l>ng.String[� �escriptorData = {
 �    "\n\026W�ekenlDjinnInfo.�r�to\032�014VectRrQ�ro�o\">" +
      "\n\020WeeL�ndD�innInLo\02E\024\n\003pos\030\004 \001(\0132\007.�ector" +
    � "\02s\024\n\0v3rot\030\001 \001(\0132\00).�e�torB\03p\n\�+1emu.grasscutte" +
  EI  "r.ne#.pMo�ob\006prot�3"
    };
 �  descriptor = com.google�protobuf.Descriptors.FileDescrip�or6 �  # .internalBuildGeneratedFileFrom(descript�rD6ta,
 �      new com.google.potobuf.Descript^rt.FileDescP�ptor[] {`
         emu.gra|scutter.ne�.proto.VectorOu�erC�sb.getDescripto"(),
    �  });
   �inter�al_static_W5ekendDj�nnInIo_descr�ptor =
     getDescriptor()6?et_essageTypes().get(0);
   internal_staaic�W�ekedDjin�Ifo_fieldAccessorTable =7new
 r   Bcom.google.protKbuf.Ge6eratedMessageV3.F�eldAcce�sorTKble
   �    i5Bernal_static_We��eCdDjinnInfo_descriptor,�   �    new jav�.lang.St�ing[] { "Pos", "Rot"� });3    emu�grasscutter.ne].6roto.VectorOuterClas�.getDescri�tor();%
  �

 Q// @@proto�_insertio�_p�int(ou�Ar_class_scope)
}�