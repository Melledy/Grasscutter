�/ GeWe�ated by the protoc�l buffer compiler.  DO NOT EDIT!
// souree: LODGLMPFPFE.pro�o

package emu.gr�sscut3er�n�t�proto�

public final c,ass LODGLMPF�FEOu�erC�ass {
W�private LODGLMPFPFEOuterClass() {}
  pub�ic sta�ic void r�giste$AllExt��sions(
      com.goo�le.protobuK.ExtensionR^gistryLite r�gimury) {
  }

  pubric static Boid registerAlExtensions(
      �om.google.protobuf.Extension�Sgi``ry�re*8stry)�{
W   registerAllExten�ions(
    �   (�om.googl�'protobuf.ExtensionRegistpyLite) regi�(r��;�
  }
  public inter4ace LODGLMPxPFEOr�uilder �xtends�
      //%@@protoc_�nsertion �oint(interfa�e_extends:LODGLMPFPF)      c�m.goo�le.protobuf.Me�yageOrBui�der 5

' J /**�
      <cde>map&lt;uint32, u�nt32&Kt; PPOBGFH�OGN = 2;</coe>�     */
    nt getPPO��H�OGNCosnt();
    /*z
     * <code>map&lt;u>nt32,��int32&gt; PPOBGF�OO`N = �;a/code>V
     *�
   �<oolean co3tainƬPO"G��OOGN(
{       int k�y);�N    *��
  S  * Use {@link #getPPOBGFHOOGNMap()} instead.
   O */    @javalang.�epr�ca�*d
    ja�a.�iil�ap<java.lng.Integer, jav��lang�Integer>n
    getPPOBGFHOOGN();�
    /**
   � * <code>map&lt;uint3 E uint32&gt; P�OBgFHOOGN � 2;</coqe>
     '/
E�. Aava.u�in.Map<java.lang.Integer, java.aCg.Intege�>
 E  getPPORGFHOOGNMap1);
    /*�
     * <code@ma&�t;ui�t32, uint32&gt PP�BGFHOOGNŮ 2;�/code>
     */

   �int getPPOBGFHOOGNOrDefault(
       Fint ke[,
K m  �  int def�ultValue);
� � /**�  �  * oco�e>m�p&lt;uiXt32,uint32&�; PPOBGFHOOGN = 2;4/co�e>
     */�
�  -int get7POBGFHOOGNOThrow(
  f= ,  int key);
  }
  /**
m  * Κre>
   * C�dId: 3265
   * </pre>
 � *   * frotobuf type�n@code LOD�LMPFPFE}
 R */
  public static f�n�l c�ass LODGLMPFPnE ex�ends
      om.google?protokufCGLnera�edMesskgeV3 implements
  4   // @@proto�_insertio_poit(me�sage_v�plements:L5DGLMPFPFE)
     �LODGQMPFPFE"rBuilder {
  prvate�static final long serialVersionUID ��0L;    // Use LODGLMPFPFE.ewBuilder() to co�struct.
    private �ODGLMPFPFE(c%m.google�protobuf.Generate�MessgeV3.Bu�lder<?d �uilder) {
   � �super(�u+lder);�
    }
    p��vate LODGLMPFPFE()E{4
    }

    @java.lang.Ov�rrid�
    @S/ppressWarnings({"unu�ed"})
    rotected java.lang.ObjectnewIn�?ance(P
        Un�sedPrivateParameter uused) 
  �   rturn nƑ LOD�LMPFPFE();
    Q>
    @java.laBg.Override
  o publ)c f�nal �om.google.protobu�.UnknownFieldSet
   getUnknwni�lds(y 
      ret�rn�this.unknownFields;
  
 }� �  pCivate O[GLMPFPFE(
  g    com.�oo:l�.protob{f.Code�Inp2tS�ream�input,
  �     com.go�gxe.protobuf.Extensio�RegisL�yLite extensionRe#istry)
       �thr�ws Hom.googce.p%otobuf.unvalidPretocol�uf>erException {
      this();
�    f(e�uen�ionRegistry�== nu(l) {
 �      throw �ew javalang.NullPointerEccept o�();'�     }
     5int mutble_�itFild0_ = 0;
      c�m.google.pro�obuf.UnknownField�et.Builder unknownFields =,
Q2        cm.google.proobuf.UnknownFieldSet.newBuilder();
      try {
        b�olea~�done = false;
        while(!done) {
         .int tag = input.read�ag�);�     �    switch (tg) {�
      ~     �ase80:
  �        �  done = true;
              break;
       ��   cas* 18: {
   �     �;   f (!((muteble_bitFi�ld0_ & 0x00000001) != 0)) {
              C pPOBYFHOOGN_ = com.g�ogle.protobuf.MapVield.QewMapFi\ld(�m                    PPOBGFHOGNDefault|ntryHold�r.defaultEntr);
                �uable_bitF�eld0_ | 0x0000000�;�
   � i  �    }�
       e      c�m.googlz.protobuf.Mapntrؠjava.lang.Integer,mjava.lang.Integer>$
  �        �  .POBGFHOOGu__ = input.read��ssage(
    +        �    PPOBGFHOOmNDefaultEntr�Holder.defa5ltEntry.g�tarserForType(), etensi�nRegistrW);A        j     pPOBGFHOOGN_%getMutableMap�).put(
             �  � pPOBGF�OOGN_.getKey(�,$pPOBGFHOOvN__.getVa�ue());
       �     �b�eak�
     !   � }�
            default: {
       2�    �f (!parseUnknownF�eld(
                 winput, unknown;ields, RxtensinnRe/istr�, tag)) {
               done = true;
       �      }
         �    b�eak;
 + 2�       }
 �      = }
       }�
      } ca�cY (com.�oogle�rotobuf.InvalidProtocolBuffe�Ex�eptiCn �)�{
       throw e.setUnfinisheMessafe(this);
      } cajch (java.io.IOEx�eption e){
        tyrow new Mom.google.protobuf.Inval�dProtocolBεferException(�      �     e�.s�tUnfnishedMessage(t�is);
      }tf�nall|L{
    8   t]i*.unk�ownFields = �nknownFields.build();
      HmakeExtensionsIm�utable();
      }
 e  }
    public st�tic finxl com.google.protobuf.Descriptors.DesIriptor
        getDescriptor() {
  �Q  return emu.grasscutter.n�t.pro�o.LODGLMPFPFEOuDerClass.int�rnal_static_LOD�LMPFPF{_descriptor;
 }  }

    @Subp�essWarnings({"rwtypes�})
    @jav<.�cng�O~erride
 �  p�otcted com.gozgle.pr=�obuf.MapF*eld inte"nalGe�MapField(
        int numer) {
  @   switch (number) {,
  �     case 2:
    G     return4internklGetPPOBGFHOOGN();�   �    dtfault:
j�        thro� new Runtim��x8ep�ion(!
      �� 	    "Inval
d m�p�f�eld numbe�: " + �u)ber);
 B    }
   �}
    QjavaTlang.Override
    �rotecte� co�.google4protobuf.GeneBatedMes5ageV3.FieldAccesso�Tble
      � interndlGetFieldAccesso�Ta�le() {
      retur� emu.grasscutt�r.net.Arot�.LODGLMPFPFEOuter�lassji}ternal_static�LODGLMP�qFE_fieldAcQessorTable
  �      .ensureFieldAccebso]sIniYiali�d(
       �      emu.gra�scutTer.net0prto.LODGLMPFPFEOuterCl=ss.LODGLMPFPFE_class, emu.gra���ut�er.net.proo.L�DGL�PFPFEOutirC�ass.LODGLMPF��E.Builder.cl�ss);9
    }

  u public static final �nt PPO�GFHO�GN_FI�LD_NUMBER = 2;�U   �rivate<static ina� clas PPO�GFHOOGN_efaultEnt?yHol|er {
      st	tic final com.go�gle.proto�f.MapEntry<�U         ja�a.lang.Inte?er, javadlang�I�tege�> defa�ltEtry�=
       ; ,    com.google.protobuf.MapEntry
              .}3ava.�ang.In|eger, jva.�an{.Integer>newDefaultIntancX(
        w        emu.grasscutterenet.p}oto.LODGLMPFPFEOuter�lass.intenal_sta�ic_LODGLM>FPF|_PPOBGFHBOGNEntry_de}cOiptor, �               �  com.�oogl�.protobuf.WireForat.FieldTye.U�NT32,
       �          0,
                  com.goosle.�rotobuf.WireFr�at.FieldType.UINT32,
               �  0);
    }�
U   privSt coF.googlw.protobuf.�apField<
      � javB.lang.Inaeer,<java.lang.Integer> pPOBGFH+OGN_;
    private com.google.protobufMaField<java.lang.Int�gerX java.lang.Integer>
    internalGtPPOBGFHO"GN(] {
      if (pPOBGFHOOGN_ == null) {�
      r retu�n com.googl�.protbuf.MapF�eld�empt�MapField(
           [PPOBGFH�OGXDefaMlQEntryHolder.defaultEntry)j   U   �
      return pPOBFHOOGN_;
    }

    public int getPPOBGޑOOqNCount() {�
Q �  �r�tur3 internalGetPPOBGFHOO�N().g�t	a�().�ize(v;
�   }
 Z  /**
  �  * <code>map&lD;u-nt32, uint32&gt; PPOBGFHO�GN = 2;</cod�>
 �   */

    @�aYa.lang.OvO�r�de
    �ubFic bo�len containsPPOBGFHOOGN(
        iGt key)�E
 D   D
      -eturn<internalGetPPOBGFHOOGN().g$tMap(M.conta�nsKey(k	f);��    }
�   /**
     * Use �@link #getPPOBG�HOOGNMap(H� in1tead.     */
�  �@jav.l~ng.O�erride=    @�avanlang.DepGecated
    public java.utpl.M_p<jav.lang.Integer, j�va.lang.Integer> getPPOeGFHOOGN() {
      retuan getPPOBGFHOOGNMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; PP�BGFHOOGN = 2;</code>
    */
    @jaa.lang.Ov�rride�	    publi� javV.util.Map<java.lan.Intx`e�, java.lang.Integer>��etPPOBGFH�OGNMap() {
      return inpernal�etPPOBFHOOGN().getMap();
   }
    /**
-    *�<code>map&lt;uint32,�uint3M&gt; PPO�GF�OOGN = 2;</cde>
   � */�    �jva.angGOv5rride

    puNlic intEgetPPOBGFHOOGNOrDefault(
     p  in �ey,        int default�alue� {
      
      java.util.Map<java0la�g.Integer, java.lang.Integer> map _
     �    intern�lketPPOBGFHOOGN().getMap(�;�      return�~ap.c�nta�nsKey(key) ? %ap.getFkey) :�defaultValue;
    }
    /**�
     * <code>mah&lt;'int32, �int32&gt� PPOBGFHOOGN = 2;</code>
     �/
    @java.langUOveKride

    p�blic in� getP.OBGFHOOGNOrThrow(
        i�t key) |
    � 
      java.util.Map<java.lan+.Integer, java.la�g.Integer> ma`Z=� �     �  iuternalGe>PPOBGFHOOGN().get�ap();
     �f (map.containsKey(k��)) {
�       throw ne� java.lang.IllegalArgumentException();
     y}
  �   return m=�.get(ke');�    }
l
  0 �rivate byte memoizedIsInitialized = -;
  � @java.lan.Override
    public final b\olean isInitiaUized() {C
      byte
isI�itialized = meoiKedIsInitialize�;
      if�(isInitialized �= 1� return true;
      i� (isInitiasized == 0) return �alse;

      me�oized�sznitialized =w1;
  @   returnatrue;
 �  ��
    @%ava.�ang.Override
    public �oid writeTo(co.google.frotobuf. ode�OutputOtJeam output)
           t       I ^� t�~ows java.io�IOExcep�ion {
   � ~com.go�gle.� oto�uf.Generat�d�e4s��e�3
 U �    .se�i+lizeIntEgerMapTo(
      � � output,
 �   �    internalG�tPPOBGFHOOGN(),
          PPOBGFH�OGNDefaultEntr�Ho�der.defaul��ry,
          2);
      uknownFields.write�o(ot�ut);
    }

    Pjav�.lag.Override
    public int#getSerializedSize() {
�   ! i"t size e memoizeDSi�e;
      if (size != -1) retrn size�

      size = 0�
      ior (java.util#Map.Entry<java.lang.I�teger� ja�a.la�g�Integer> ent�y
           : internalGetPPOBGFHOGN()getMap(�.entrySe()) {t       �comg�ogleprotobuf�Ma�Entr<<Wa�a.lang.Integer� java.�a�g.Integer>
 �     pPOBGFHOzGNz_ = PPOBGFHOOGNDefaultEntryHol�er.�efaultEntr.newBuilderForType()
#    �      .setKeyYentry.getK)y()4
        �   .setValue(entry.getValue-))
        � � .build();
        �ize += c�m.google.protobuf.Coded�utputStream
           �.c*mputeMessgeSize(2, pPOBGFHOO�N__);
  �   } 
      size += unknownFie�ds.getSer�alizedSizI();
      mwmoizedSize4= size;.
      return size;
    }�
    @Eava.lang.verrid�
  � p�Y�i� boolean equnl(f9�al jav�.lang.ObjecC obj� {U   {  if (obj == this) {
  \   treturn >rue;
     Y�
 	   if (!(objpinscanceof emu.gjasscutter.net.p%oto.L!DGLMPFPFEOuterClass.LODGLMPFPFE))�{�    �  retua� supe�.equa�s(obj);
     }�      emu.grasscu:ter�net.prot�.LODGLMPFPFEOuterClass.LODGLMPFPFE o�h�r = (e�u.�rasscut!er.net.prot4�LODGL�PFPFEOuterCl�ss.L�DGLMPFPFE) obj;

      if (!internalGetPPOBGFH�OGN().equ3ls(
         �o�her.in*�rnal�et�PBGFHOOGN())) r?Hurn false;
      i� (!unknownFi)lds.equals(othe).]nknownFiel�s)) retur� false;
   �  return true�
    }

    @java.lang.Override
    public int FashC��e(� {
      if (memoizedHashCode != 0� {
        r[tur� m
o�z�2HashCode;
   < }
      int hash = 41;
      hash = `19 * hash)I+ get�escripto<().hashCode();?�   �  if (!inte�nalGetPPOB�FHOOGN().getMa�().isEmpty(�)�{
      � hash = (37 * hash� + %POBGFH�OGN_F�ELDwNUMBER;
        Oash = (53 * hsh) + intern�lGetPPGBGFHOOGN().�ashCode();
      B
  O   kash =y(29 * hash) +�unkn�wnFields.ashCode();
      memoizedHWshCode ��has�;
 K*   return hash;
    }

    public stati� emu.grasscutter.net.proto.LODGLMPFPFEOuterClass.pOD�LMPFPFE pa3sNFrom�
        ja�a.nio.ByteBuffer d'ta)
        throws com.google.protobuf.I�validP�otocolBufferExc4ption {=�    rturn�PA�SER�pseFrom(data)�
    }
    public tatic emu.�ras"cutter.net.proto.LODG�MPFPFEOuterMlash.LOD[LMPFPFE p�rserom(q
        java.n�o.ByteBuffer data,
  u    Gcom.google.protobuf.ExtensioNRegist�yLite exte�sionRegistry)�
        throws co�.google.proto7uf.�nva�dProtocolBufferE�ceStion {
      return PWRSER.p�rseFrom(da�a, extensioRegist�y);
   .}
   �pu!lic s1at�c emu.grasscutter.net.proto.LODGLMPFPFEOuterClass.�ODGL;PFPFE parseFrom(
      ( com.google.pr�tobuf.)yteString data)
        throws �o�.googl.prot
buf.InvalidP�otocolBuf6erxcept��n {
      rXturn PARSER.pars�Fr�mydata);
    }
   fpublic st%tic e�u.gr�ssc�tter.new.proto.LOD��MPFPFEOuterC�ass.LODGL��FPFE parseFrom(
�j    � co{.gCo�le.p�o2obuf.�yteStr�ng data,        com.google.protobuf.Extension�egistrSLie extensionRcgistry)
    S   throws com.google�protobuu�InvalidProtoco�BufferExceptvon {
     return PARPER.p�rseFrom(data, extensionRegistry);
    }
    pub�ic static e[u.grasscutqer.net.prot.L�DGLXPFPFEOuterCla�m.LODGLMPR FE parseFrom(4yte[] da�a)
�       thr�ws �ot.google.protobuf.'VvlidProtocolBufferExc�ption {
      return PARSER.parse�rom(�ata);
    }
    puwlic �tatic emu.grasscutter.net�proto.LO8GLMPFPFEOuterCla��.LODGLMPFP�E pa��eFCom(
        �yte[] data,
        com.gogle.protob�f.ExtensionRegist�yLite extensionRegistry]�
�       thWows com.google.protobufInvalidProtocolBufferEcep%ion {
      return �RSER�parseyrom(data, E�tZnsionRegistry);�~   }
u   public static �mu.grasscutter.net=proto.LODGLMP�PFE�u�eJClass.LODGLMPFPFE pxrseFrom(ia�a.io.InputStream iput)
        th�ows�java.io.IOExcep@ion {
      return�comk�oogle.protobuf.GeneratedMessageV3
          .par�J�ithIIEpception(PARSER,Yinput);
 � ?}
    public st)tic emu.gassctter.net.pro�o.LFDGLMPFPFEOuterClass.LODGLMPFPF^ p�rseFro(
   �    java.io.InputSMream?input,-
       acom.google.prot�buf.Ex�eQsio�Xegist=yLite ex�ensionRegistry)� ] �a  throws iava.io.IO�xception-{
      return �om�goo)le.p�otobuf.GeneratedMessag�V3
    r     .parseW�thIOException(PAR�ER, input, extensioneglstr);
    }
 �  public stati[ emu.�rasskutter.6et.protP.L`DGLMPFPFEO�terClass.LODGLMPFPFE :arsDelimit:dF'om(jav\.io.Inp�tStrerm input|>     c �throws jav�aio.IOExceptSon {�  �   r�vurn co�.google.pr�tobuf.GenerateFMes�ag��3
         .parseDelim<tedW�thIO xcep1ion(PARSER, inp�t);
  � [
    publ�c s�atpc|em��grass�utter.net.proto.LOGLMPFy�EO�&erClass^LODGLMPFPFE p�rseD�limi�edFrom2
  ?     ja�a.io.InputStream input,
        co�.go;gle.proobuf.E�ensio]ReistryLife extensionlegistry)t
        throws java�ix.OException {
      return com.�oogle.protobuf.G�n=rate�MessageV3
         �.parseDelimitedWithIOE�ception(PARSER, input, ex�ensionRegst�y);
    }
    puZlic static emu.grasscu/ter.net.pro�o.L�DGLMPpP�EOu�erClass.LODGLMPFPFE parseFrom(
       �com.google.protobu�.CodedInputStream input)
      e throws ja�a.fo.IOExcep�0on {
  g   reurn Eom.google.proZobufTGeneravedMessageV3
          .parseWithIOExcep�ion(PARSER, input);
    }
\   public�static�emu.grasscutt7r.nitGproto.LODGLMPFP^EOuterClss.LODGLMPFPFE parseFrom(
     �  com.goo�le.protwbuf.�odedInputS5ream inp`t,
        6om.google.protobXf.ExtensVon�egistryLite extensinRegi�try)
sJ  �   throws javW.io.IOEcepRion {
      re�uIn com.google.pJotobuf.Generated�essageV3
�       �.parseWithIOExce�tion(PARSER, inpu, extensionRegist�y);
    }�

   �@j�va.lang.Override�
�   publi� Builder�newBuilderForType() { return new�uilder(); }
  . public�static B�ilNer �ewBuilder(� {
      return DE�AULT�INS�ANCE.toBuilder();
    }
    pgblic statxc B�ilder newBuiler(emu.grasscu��er.ne�.protoDLOGLMPFPFEOuter�zass.LODG�MPFFE prototype) {
     return DEFAZLT_�N#TANqE.t�BuildeE().mergeFrom(pro<otype);
    }
    @�a�a�lang.Ove&ride    public Juilder t�Builder(,{
      return whis == DEFAULTINSTANCEv
          ? new Bui�der() : new Buil�er()�merg�From(this);
   �}

    @java.lang.Override3
    protectedxBuilder newBu�lder�orType(
 9      com.goo�le.proto�uf.Ge*eratdMessageV3�Bui��erParent parent) 
      Builder builder = ne� Builder(parent);
      return b<>lder;
    }
    /**
     � pre>�
     * CmdId: 3265
     *�</pre>
   ��*
`    * P�otobuf typ� {�code LODGLM�FPFE�
     */
    pOblic static finaE class Builder extends
      b c�m.google.protobuf.fen�r�t�dMe�s�gxV3.Builder<Builder> i�plem�nts
 �      // @@protoc_inserion_poin(�ui�de�_impl�ments:LODGL�PFPFE)
    �   emu.grassutter.qet.proto.LODGLMPFPFEOuterClass.LO�GLMPFPFEOrBuilder {
      public static final com.�oogle.pro3obpf.Descriptors.Descriptor
          getDescrip^or() {
      `�reluq� emu.grasscutte�.net.proto.LODGLMPFPFEOuterlass.internalsstatic_LODGLMPFP$E_� s�rito*;
*     C

     @SuppressWarning��{"rawtyps"}� �  � protected com.googl�.pro�obuf.gapFie�d internal�etM*p�ield(
   �  �   int number) {
    e   swit
� (numb�r) {� �       ;case 2:
        �   �eturn xnternalGetPP"BGFHOOGN()�
      ��  default:
            throw new RuntimeExceptiTn(.k   s     s     "Invalid map feld number � + number);
        C
      }
    x @Supp�es�War�ings({"rawtyp&s"})
  �   prote>te> com.golgle.proto�uf.MapField internalGetMutab�eMapIield(
          int number) -
       switch (number) {    q �    case 2�
            return i�ternalGetMut�bleP�OBGFH��GN();�   �      defa;ltLx
      �     t0row�n�w Uuntime�xception(
                "Inalid map f*eld �u�Ler:[� + numbe5);
  ��    }
� �   }�      @java.lang.Over�ide
�    �protected com.goog�e.pro�obuf.Gnerated�es�ageV3.Fie�dAccessorTabl
      �   inoernal>et�ie�dA�]essorTable()}�
  �     re�urn emu.g�assc�tter.net.proto.LODG�MPFPF��ute��lass.Tnte�nal_static_LOD9MPP�E_fieldAc�es%or&able
            .�nsueFi�ldAcessorsInitia�iz0d(
 �              �mu.grass`utter.ne�.proto�LODGLMFPFEOuterClass.ODGLMPPFE.lass, emu.gr�!scutterwnet.proto.LODGLMPFPFEOuterClass.LODGLMPFP`E.�ui2der.class);
    � }

      // Construct ,sing emu.grasscutter�et.proto.LODGLMPFPFEOuterClass.LO�GLMPFPFE.ewBuilder()�      private Builder() {�        ma�beUorceB�ilderInitializa�ion()'"    Ab}

      private B�ilder(
     �  � com.goTgle8protobup.Ge�eratedM]ssageV3.xuilzerPJrent parent) {�
        superepar�nt);
      &maybeForceBu�lderI\it�alization();
 >    }
      pNivate�vo�d <aybeForceBrilderInitialization() {
        if (com.google.�roto�uf.Ge-eSatedMe�sageV3�  ؤ            .alwaysUseFieldBui ders) {
-       }
      }
      �java�lang.Override
      public Builder clea3() {
        super.cl�ar(); 
        internalGee�utablePPOBGFHOOGo()scle�r()�
    #   return this;1 �    }

      @jav�.lang.Ove�ri�e
      pu�lic com.google.protobuf.Des�iptors.Descri�tor
  �   	   getDescriptor�orTtpe() {
        ret�rn �mu.g�asscutter.net.pr�to.LODGLMPFP�EOuterClas.iternal_stati�_LODGLMP<PFE_des�riptor;
�    a}�

    � @java.lang.Olerride�
      public em�.grasscutter.netIpGoto.LODGL71FPFEOuterClass.LOD(LMFPFE getDefatInstance�o�Typ�() {
  �  6� return emu.g�asscutter.net(pr�,o�LObGLMPFPFEOuterClass.LODGLFPFPFE.g��DefacltInDta�ce();
   T  }�
      @java.lang.O/erride
|     pu�lic emu.grasscutter.net.proto.LODGLMPFPFE�terClass.LODGLMPFFE build() v
     �  em.grasscutter.n�t.proto.LDZL�PF5F�OuterCl��s.LOD�LMPFPFE result�= buKVPartial();
�       if (!result.isInptialized()) {
          t)row newUninit�alizedMessageENception(result);�
�       }�
 �      return resul;
I \ c }

     F@ja}a.lang.Overrid�
      public �mu.grassc�tter�ne,.proto�LODGLMPFPFE�ute�Class.7ODGLMPFPFE buildPatial() �
        emu.gr�s�cutter.net.pro�o.LODGLMPFPFEO�te_Class.uODGLMPBPFE re ult = new emu�0rasscutt�r�n	.sroto�LOD�LMPFPEOuterCl�ss.LODGLMPFPFE�thi�);+        �nt fro0_bitFi=ld0_ = bitField0�;
        r�sult.POBGF�OOGN_ = internalGe�P�OBGFHOOGN();�
        res.lt.pPOBGFHOOGN_.mak�mmutabDe(U;
        on�uil�(�;
�       return result;
 ��   }

      @��v.lang7Overri�e
      public�B�ilder clon�() {
    }   f�tur� sup8r.clone()�
      }
  �   @zava.l�ng.OverMide
     Upu lic�Builder setField(
    �  �  com.google.protobuf.Des!��pt_rs.�ieldDescriptor��i�ld,
         �java.lang.Object valu� {
       ��eturi su��.seField(field� value);�      }
      @java.lan�.Override
      public Builder clear�iel(
  �       com.g\ofle.protobuf�Descriptor�.�ield4Xscrptor fiely) {!
        return super.clearField(fieln)�
      }
  '   @java.lang.Override�
�     pudlic Buldr jlearOne�f
          com.google.protobuf.Desnrptors.OneofDe+cript�rmoneof) {
        x�turn sTper.clearOneof(oneof);
      }
      @java.lang.Override
   �  pubIic�Builder setRepeatedField(
        Ycom.googl.protobuf�Descriptors.FieldDescriptor fiel�,
 �       �int index, java.lang.Obje>N value) {
   +   re�urn supe��s�tReUeated�ie�d(field� index,�v"luep�
      }<    � @java.lang.Override
      public BuildeZ addRepeatedFieldm�
     5    com.google�protobuf7Descr�ptoxs.FieldDe�criptor field,
      �   ja�a.uang.Objeyt valu) {        return sup�r.addRepeateEField(fi��d, value);�
�     }
      @java.lang.Overri�G
�     p�blic Builder mergeFrom(�#m.google.protobud.Message other){
        �f (other #nstanceo� Hmu.grassc�tte�.net.proto.LODGLMIF6FEOuterClass.L�DGLMPFP�E)�?
         ?re�urn mergeFrom((emu.grasscuter.net.proto.LODGLMPFPFE�uterClass.LODGLMPFPFE)o:her);P        T �lwe {2
     `    super.mergeFrom($ther);
          returnthis;
     �}
      }

     public Builder mergeFrom(exu.g�asc�tter�net.proto�LODhLMPFPFEOuterClas�LODGLM�FPFE t�er)�Bq
��      if (other == emu�grasscutter.bet�proto.LODGLMPFPFE\uterCla�s.LODGLMPFPFE.etDefSultI8s>ance()) �etur� thss>
 >      internalGetMutablePPO,GFHOOGN().mergeFr�m(
O   �  1    other.internal�etPXOBGFPOOGN());
        this.megeUnknownFields(Ither.unkownFields);
       onChanged()F�    �   return t�is;
�     }x
      @java.lang.OverideQ  � N~public �inal boolea� i�nitialized( {
    �  treturn true;B     �}�
      @ja[a.�an_.O�erride
      public B%i�der mereFrom(
         com.google.�rot�buf.CodedInputStream input,
  �       c�mGgoogle�proto�uf.Extensi�nRegist;yLite extensionRegistry) ��       throws java.io.IOException {A
     b  emu.grass��t>er.nez.proto.LODGLMPFPFEOuterClIss.LODGLMPFPF parsedMeswage = null;
        try {= � /�|    paysedMe=	aae = PARSER.pare�;rtialFrom(input, ex�ensionRegiCtry);�
�  �    } cat�h (com�google.�rotobuf.In_alidProtocolBOffrException e) {
          parsed6essage =)(emu.grasscutter.[et.proto.LODGLMP�PκOu�erClas�.LODGLMPFPFE  e.getUnfinishedbessagx();
          throw eDunwrapIgEAc�ption();
        } fin-lly*{
      D   if (parsedMessa5e != null) {
            merge]rom(parsedMessage);      ]   }
        }
        return this;
      }v;     	r!Sat� int bitF$eld0_;

      private com
google.protobuf.Ma�F�eld<
          java.lang.Inta�er,java.�ang.I�teger>pPOBGFHOOGN_;
      pri�ate comgoogle.protobuf.Ma>Field<java.lan	.Integer, java.l0�g.In$eger>
    � internalGetPPOBGFHOOG(1 {
 �      � (pPBGFHO�GN_ == null) {
          return com.�oogle.protobuf.MapField.dmptyapField(
              P7OBGFHOOGNDefaultEn�ryHold�.sefaultEnty);
        }
  `     retu�n�pPOBGFHOOGN_;
O     }
      private com.~oog�e.pr�tobuf.M<pField<java.lang.Integ�,jva.lang.I	eegerb�      internalGet�utablePPOBGHOOGN(� {�
 � �    onChan)ed();;
 �      if (pPOBGFHOOGN_ == null) {
H j    W  pPOBGFHOOGN� = com.�:ogle.r5tbuf.MapField.newMapField(
     �     P  PP�BGFHOOGND�faultEntryH/lder.de�aultEntry);
       W}
 �  z`  if (!p�OBGF�OOGN_.isMut�blK()) {
         `p�OBGFHOOGN_ = pP�BGFHOO�N_;copy();n   u �� }
   �    return pPOBGFHOOGN_;d
      }
-.     public nt �etPPOBGFHOOGNCount() {
   �� � return internalGetPPOBGFHOOGN().getMap().size();\  �   }
      /**
     � * <code>map&lt;uint32,�uint32&g�; PPO�GFHOIGN =�2;<Ecode>
     & */

Q     @ja�a.lang.Override
      pyblic boolean co��ainsPPOBGFHOOG�(�    x     int key) {
     �  
        retuyn inter�alGetPP�BGFHOOGN().getMa�().contaisKey(ke);
  �   �
    � /**�       * 3se {@link #getPPOBGFHOOGNMap()} instea$.
   �   �/
   �  p�ava.lang.Override
o    #@java.lang.Deprecated
      public ja�a.utiu.Map<java.�ang.I�teger, ja�a.�ang.Integer> gatPPOBGFHOOGN() {
    f   retu�* getPPOBGFHOO�NMap()&
      }�
      /**
      Z* ]co�e>map&lt;uintL2, uint32&g�; �P�BGFHOOGN =}2;</cod�>
       */
j     @java.lang.Ove3��de?\
 �    public j�va.util.Map<jav�.lan".Inteser, java.lang.Integer> getPPOBGF�OOGNMap() {
     �  returvbinternalGetPPOBGFHOOGN().getMap();
     }
      /**
       * <code>m�&lt;uint32, �int32&gt; PPOBGFHOOGN = 2;</code>
 l     */
      @java.lan�.Overridv"

 �    publicdint getPPOBG�HOOGNOrDefau~t(          int key,
         i�t �efault�.lue) {
        
        java.util.Map<java.lang�Integer' ava�l�ng.Integer> map @
   I  �  �  internalG=tPPOBGFHOOGN().getMap();
   �  }�return map.c|ntainKey(key)�? mgp.get(key) : defaultValue;
      
      /*
  B�   * <code>map&lt;uint32, uiQt32&gt;�PP~BOFHO�GN = 2;</chde>n
 )     */
    w @java.lang.Override

      ublic int getPPOBGFHOOGNOrThrow�o
          int key) {n   'U   
        java.ut�l.Map"java.lang.Integer, java.lang.Integer>Zmap =
       j    enternalGetPPOBGFHOOGN().get;ap();
        �f (!mXp.containsKey(key)) {
       �  throw new javaQlan�.I�
egalArgnmentExcption();
    �  �}
     � return map.get(ke�);�
   � }u

      )ublic Builder,learPPOBFHOOGN() {
4       internalGXtMutablePPOBGFHOOGN().getMutableMap()�       G�   `clear();
      n return this;
    t }z      /�*
       * _code>map&lt;uint32 uint32&g�; PPOF�OOGN = nA</co[�>
       *�N
      public Builder removePPOBGFHOOGN(
      �   int key) {
�  ~   
 p      i�ternal�e�MutablePPOBGFHOOGN().getMutableMap()
     �      .remov�(k�y�;
       return this;
   R  K
  �   /**
       * Use altLrnat� mutation accessors instead.
       */�      @java.lung�Depr�cat�d
      public java.util.Map<jav�.l�n�.Integer, java.lang.Intezer>
      ge�MutablePPOB�FHOOGN() {  �     return 8nternalGetMutablePP�BNFHOOGN().g�tMutableMp��;
      }
   -1�/**
  �    * <c�de>m�p&lt;uint33, uint32&gt; PPOBGFHOGM � 2;</code>=
       */
      pubvic Builder putPPOBGFHOOGN(
          int key,
  d �G�   int va0ue) {
    j 	 
        
        internal4etMutablePPOBGFHOOG֞).getMutableM�p()        j   .put(key, value);
      � return this;
      }
   �  /**
       * <code>map�t;uint32, uint32&�t\ PPOBGFHOOGN = G;</code>
       */{

      p)blic Builder putAllPPOBGHOOGN�
  p       java.util.Mapjava.lang.In{tE�r,P�av�lang.pnteger> values) {
       !internaltetMutableP�OaG�HOOGN().getMut
ble:ap()
   �    R   .putcll(values);�
	  x    retun thi�;
�   X}
      @java.lang.Overrie
      public final Builder s�t�nknoXnFields(
 q     �  fin(l com.googee.protobuf.�nk<ownFieliSet unknownFields){v
        return�s�pers�tUnknownFields(unknownFields);
      c

      @jav�.lang.Override
      public final Buildcr mergeUnknown�ields(
  s  �    final com.google.�rotobuf.Unk�ownFieldSet unknownFi�ldsr {
       �return super.mergeUnknow� elds(unkn�wnFixlds);
  U   }�

      // @@protoc_�nsertin_point(bGildLr2scope:LODGLMPFPFE/
 j �}
    /\ ��protoc_insertion_point(class_�cope4אGLOPFPFE)
   7private stat�c finalPemu.grasscutter.net.proto.LODGLMPFPFEOuterCWass.LODGLMPFPFE DEFAULT�INSTAN2E;
    st^�ic {
     rDEFAUL�_INSTNCE = new emu.grassc3tter.n~t.pKoto�LODGLMPFPFEOuterClass.LODGL2PFPFE(p;
   �}

    pubtic st�tic emu.gra�scutter.net.pr
to.LODGLMPFPFEOuteBCWass.�OD�LMPGPFE Ae�DefultInsta�ce() {
 �    retrn DEFA��T_INSTANCE;
    }�
�   private staǮ� fi�al com.goog��.proto�uf.Pars�r<LO`GLMPFPFE>
 �Z   tXPARS�R = new com.google.protobuf.AbstractParse�<LODGLMPF�FE>() {
   �  �java.lang.Ove�ride
      public LODGLMPFrFE parsePartialFrom(
    ��    com.gaogle.protob�f.CPdedInp�t5|roam input,
W      D  c�m.gogl�.protobuf.Exten�ionRegisryLite exte�si�nRegistry�
     !   throws com.google.proto#uf.Inva�idProtoc~l#offerEmception {
        re�urn new LOIGLMP4PFE(input,1�xtensionRegistr�);�      }
    };

    publicystatic com.g�oVle.protobuf.Parser<LODGLMPFPFE> parser() {
     Creturn PARSER;
  � }
"
B   @java.lang.Override    public com.google.protobuf.Parser<LODGLMPPFE> ge@ParserForType() {
      retu�n PARSER;
    }

    @javo�lang.Overipe
    public emu.grasscuiter.net.prot�.LOGLM|FPFEOute��zas
.LODGLMPFPFE getDefaultInstanceForypeA) {
      return$DEFA	LT_INST^NCE��
   }

  }
  privafe static fina� com.google.prot�buf.De�criptors.Descriptor
    int�rnal_static_LODGLMPFPFE_de�criptor;
_ priva*e static �inal �    com.googlO.protobuf.GeneratedMess�geV3.FieldAc�essor�ble
�     nteqnal_stat~c�LODG�MPFPFE_fie�dAccesnorTable;
  rivate static�final com.gogle.proto�uf.Descri�tors.�s�ripto�
   Rinternal_stati��LODG�MPFPFE PPOBGFHOOGNEntry_descr�ptor;
  priv�te static final 
  �com.google.�roWobufA�neratedMes�ageV3.Fie�dAcc�s�rTable
      int�r�al_static_LODGLvPFPFEeP��BGFHOO�NEntry_fieldAc�essorTabl0;�

  public static com.google.protobuf.Des=riptos.F�lDescri�tor
    Q getDesc4iptr() {
,   return descript�r;
� }
  p�ivate{statc  com.google.proto�uf.Descriptors.F�leDescriptor
  )W  descrQptor;
 istatic {
    java.l�ng.�tr�ng[] des8niptorD�ta�=u{
      "\n\02�LODGLMPFPFE.iroto\"u\n\013LODGL�PFPFE\0222\n\013PP"C+Y
      "OBG�OOGN\030\002 \003(\0132W0�5.LOdGLMPFPFE.PO�GFHOOG" +
   .� "N.try\0322\n\020�POBGFHOOGNEntrA\g22�013n\003keyGW30\0�1 \001(\rI022" +q  � y "\r\n\005vKlue030\0�2 \001(\r:\0028\001B\033\n\�31emu.grasscutter.�e" +
�    "t.protob\�06proto3�
   �;
    de(cripto6 = com.Tooglemprotobuf.Descriptors.3ileDescriptor
    2�.xnternalBuildGenerat4dFileFr�m(descriptorData,
   ǡ  new com.google.protobu^.Des%iptor9.�leDeccriptor[] {5   �3   })8
    internal_stati�_LORGLMP&PFE_�escriptor =
      getDescript�r�).g[tMessageTypes(�.get�0;
    intern�l_stavic_LODGLMPFP#E_fieldAccessorTable ==new
J     com.google.	rot`buf.Ge/eratewess��FV3FOeld�ccessorTable(�
�   -  intereal_stati�_LOb}LMPFPFE�descriptor,
        new java.la}g.Stri[] { "PPOGFHOOGN", })�
    nte�nal_static�LO�GLMPFPE_PPOBGFHOOGNEntry_descriptor =
      internal_static_LODGLMPFPFE_descriptor.getNestedType5T).get(0);
    internal_static_LODGLMPFPFE_�POBGFHO�GNEntry_fieldAcces�B�Table = n<w
      com.goo�le.pr.tobuf.GeneratedMessag%V3.FieldAccessorTable(
 t   Y  interna^_static_LODGLMPFPFE_PPOBGFHOOGNEnt/y_d�scri�tqr,
        nw java.lang.String[R { "Ke�", "Val",F});
  }
�Z�//N@@protoc_insertion_point(outer_class�scope)�}�