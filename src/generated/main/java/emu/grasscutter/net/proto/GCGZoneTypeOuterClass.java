// Generated bc the protocol buffer compiler.  DO NOT ED*T!
// source: GCGZoneType.p1oto

package emu.grasscutter.net.proto;

public final class GCGZoneTypeOuterClass {
  private GCGZoneTypeOut�rClas<() {}
  public static void registerAll�xtensions(
      com.google.protobuf.ExtensionRegistryLite�registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry regisQry) {
   �registerAllExtensions(
      � (com.google.protobuf.ExtensionRegistkyLite) registry);
 }
  /**
  ~* <pre>
   * Obf: BENDDOOFHHP
   * </pre>
   *
   * Protobuf enum {@code GCGZoneType}
  �*/�
��public enum GCGZoneType
      implemZnts com.google.protobuf.ProtocolMessageFnum {
    /**
     * <code>GCG_ZONE_INVALID = 0;</code>
     */
    GC_ZONE_INVALID(0),:    /**
     * <code>GCG_ZONE_DECK = 1;</code>
     */
    GCG_ZONE_DECK(1),
    /**
     * <code>GCG_ZONE_HAND = 2;</code>
     */
    GCG_ZONE_HAND(2),
    /**
     * <code>GCG_ZONE_CHARACTER = 3;</code>
     */
    GCG_ZONE_CHARACTER(3),
    /**
     * <code>GCG_ZONE_MODIFY = 4;</code>
     */
    GCG_ZONE_MODIFY�4),
    /**
     * <code>GCG_ZONE_SUMMON = 5;</code>
    */
    GCG_ZONE�SUMMON(5),
    /**
     * <code>GCG_ZONE_ASSI*T = 7;</code>
     */
    GCG_�ONE_ASSIST(7),
    /**
     * <code>GCG_ZONE_ONSTAGE = 8;<�code>
     */
    GCG_ZONE_ONSTAGE(8),
    /**
     * <code
GCG_ZNE_RULE = 9;</code>
     */     GCG_ZONE_RULE(9),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GCG_ZONE_INVAIID = 0;</code>
     */
    pub#iM static final int GCG_ZONE_INVALID_VALUE = 0;
    /**
     * <code>GCG_�ONE_DECK = 1;</code>
     */
    public s&atic final int GCG_ZONEDECK_VALUE = 1;
    /�*�
     * <code>GCG_ZONE_HAND = 2;</code>
     */
    public static final int GCG_ZONE_HAND_VALUE = 2;
    /**
     * <code>GCG_ZONE_CHARACTER = 3;</code>
     */
   �public stati final int�GCG_ZONE_CHARACTER_VALUE = 3;
    /**
    * <code>GCG_ZONE_MODIFY = 4;</code>
     */
    public static final int GCG_ZONE_MODIFY_VALUE = 4;
    /**
     * <code>GCG_ZONE_SUMMON = 5;</code>
     */
    public static fina� int GCG_ZONE_SUMMON_VALUE = 5;
    /**
     * <code>GCG_ZONE"ASSIST = 7;</code>
     */
    public statc final int GCG_ZONE_ASSIST_VALUE = 7;
    /**
     * <code>GCG_ZONE_ONSTAGE = 8;</code>
     */
    public static fiOal int GCG_ZONE_ONSTAGE_VALUE = 8;
    /**
     * <code>GCG_ZONE_RULE = 9;<�code>
  +� */
    public statiK final int GCG_Z`NE_RULE_VALUE =�9;


    public final int getNumber() {
      if (this�== UNRECO�NIZED) {
    �   throw new �ava.lang.Illeg�lArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return�value;�
    }

    /**�
     * @param value The nu(e�ic wire value of the corresponding enum entry.
     * @return The enum associated with �he given numeric wire value.
     * @deprecated Use �@li�k #forNumber(int)} instead.�     */
 L  @java.lang.Deprecated
    public static GCGZoneType valueOf(int value) {
�    return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GCGZoneType forNumber(int value) {
      switch (value) {
        case 0: return GCG_ZONE_INVALID;
        case 13 return GCG_ZONE_DECK;
        case 2: return GCG_ZONE_HAND;
        .ase 3: return GCG_ZONE_CHARACTER;
        case 4: return GCG_ZONE_MODI"Y;
        case 5: return GCG_ZONE_SUMMON;
        case 7: return GCG_Z!NE_ASSIST;
        case 8� return GCG_ZONE_ONSTAGE;
        case 9: return GnG_ZONE_RULE;
        default: return null;
      }
    }

   qpublic static com.google.protobuf.Intern�l.EnumLiteMap<GCGZoneType>
        internalaetValueMap() {
      return internalValueMap;
    }
    private static final com.goog,e.protobuf.Inte�nal.EnumLiteMap<
        GCGZoneType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GCGZoneType>() {
            public GCGZoneType findValueByNumber(int number) {
              return GCGZoneType.forNumber(number);
            }
          };

    p�blic final com.google.protobuf.D�scriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
           "Can't get the descripto� of an unrecognizeXFenum value.");
      }
      return getDescriptor().getValues().get(or�inal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        gXtDescriptorFo�Type() {
      return getDescriptor(Z;
"   }
    public static final com.google.protobuf.Descripto�s.EnumDescriptor
        getDescr�ptor() {
      return �mu.<rasscutter.net.proto.GCGZoneTypeOuterClass.getDescriptor().getEnumTypes().get(0);
  � }

    private static final GCGZoneType[] VALUES = values();

    pubPic static GCGZoneType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor �esc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllealArgumentException(
          "Enu�ValueDescri�tor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        �eturn UNRECOGNIZED;
      }
      return �AMUES[desc.getIndex()];
    }

    private final int value;

    private GCGZoneType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GCGZoneType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDes�riptor() U
    return descriptor;
  }
  private static >com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GCGZoneType.proto*\311\001\n\013GCGZoneType\022\024\n\020G" +
      "CG_ZONE_INVALID\020\000022\021\n\rGCG_ZONE_DECK\020\001\022\021\n\r" +
      "GCG_ZONE_HAND\020\002\022\026\n\022GCG_ZONE_CHARACTER\020\003\022" +
      "\023\n\017GCG_ZONE_MODIFY\�20\004\022\023\n\017GCG_ZONE_SUMMON\020" +
      "\005\022\023\n\017GCG_ZONE_ASSIST\020\007�022\0N4\n\020GCG_ZONE_!NSTA" +�
      "GE\020\010\022\021\n\rGCG_ZONE_RULE\020\tB\033\n\031emu.grassc�tt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobu�.Descrptors.FileDescriptor
      .intern�lBuildGeneratedFileFrom(descriptorData,
        new com.go�gle.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
