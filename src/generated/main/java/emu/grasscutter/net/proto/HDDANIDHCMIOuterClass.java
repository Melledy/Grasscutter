// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HDDANIDHCMI.proto

package emu.grasscutter.net.proto;

public final class HDDANIDHCMIOuterClass {
    private HDDANIDHCMIOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }
    /** Protobuf enum {@code HDDANIDHCMI} */
    public enum HDDANIDHCMI implements com.google.protobuf.ProtocolMessageEnum {
        /** <code>HDDANIDHCMI_GalleryStopNone = 0;</code> */
        HDDANIDHCMI_GalleryStopNone(0),
        /** <code>HDDANIDHCMI_GalleryStopTimeup = 1;</code> */
        HDDANIDHCMI_GalleryStopTimeup(1),
        /** <code>HDDANIDHCMI_GalleryStopClientInterrupt = 2;</code> */
        HDDANIDHCMI_GalleryStopClientInterrupt(2),
        /** <code>HDDANIDHCMI_GalleryStopLuaInterruptSuccess = 3;</code> */
        HDDANIDHCMI_GalleryStopLuaInterruptSuccess(3),
        /** <code>HDDANIDHCMI_GalleryStopLuaInterruptFail = 4;</code> */
        HDDANIDHCMI_GalleryStopLuaInterruptFail(4),
        /** <code>HDDANIDHCMI_GalleryStopOwnerLeaveScene = 5;</code> */
        HDDANIDHCMI_GalleryStopOwnerLeaveScene(5),
        /** <code>HDDANIDHCMI_GalleryStopPlayInitFailed = 6;</code> */
        HDDANIDHCMI_GalleryStopPlayInitFailed(6),
        /** <code>HDDANIDHCMI_GalleryStopOtherPlayerEnter = 7;</code> */
        HDDANIDHCMI_GalleryStopOtherPlayerEnter(7),
        /** <code>HDDANIDHCMI_GalleryStopAvatarDie = 8;</code> */
        HDDANIDHCMI_GalleryStopAvatarDie(8),
        /** <code>HDDANIDHCMI_GalleryStopFinished = 9;</code> */
        HDDANIDHCMI_GalleryStopFinished(9),
        /** <code>HDDANIDHCMI_GalleryStopFungusAllDie = 10;</code> */
        HDDANIDHCMI_GalleryStopFungusAllDie(10),
        /** <code>HDDANIDHCMI_GalleryStopLifeCountZero = 11;</code> */
        HDDANIDHCMI_GalleryStopLifeCountZero(11),
        /** <code>HDDANIDHCMI_GalleryStopActivityClosed = 12;</code> */
        HDDANIDHCMI_GalleryStopActivityClosed(12),
        /** <code>HDDANIDHCMI_GalleryStopLeaveRegionFail = 13;</code> */
        HDDANIDHCMI_GalleryStopLeaveRegionFail(13),
        /** <code>HDDANIDHCMI_GalleryStopHeartBloodUsedOut = 14;</code> */
        HDDANIDHCMI_GalleryStopHeartBloodUsedOut(14),
        /** <code>HDDANIDHCMI_GalleryStopGuardianStoneDie = 15;</code> */
        HDDANIDHCMI_GalleryStopGuardianStoneDie(15),
        UNRECOGNIZED(-1),
        ;

        /** <code>HDDANIDHCMI_GalleryStopNone = 0;</code> */
        public static final int HDDANIDHCMI_GalleryStopNone_VALUE = 0;
        /** <code>HDDANIDHCMI_GalleryStopTimeup = 1;</code> */
        public static final int HDDANIDHCMI_GalleryStopTimeup_VALUE = 1;
        /** <code>HDDANIDHCMI_GalleryStopClientInterrupt = 2;</code> */
        public static final int HDDANIDHCMI_GalleryStopClientInterrupt_VALUE = 2;
        /** <code>HDDANIDHCMI_GalleryStopLuaInterruptSuccess = 3;</code> */
        public static final int HDDANIDHCMI_GalleryStopLuaInterruptSuccess_VALUE = 3;
        /** <code>HDDANIDHCMI_GalleryStopLuaInterruptFail = 4;</code> */
        public static final int HDDANIDHCMI_GalleryStopLuaInterruptFail_VALUE = 4;
        /** <code>HDDANIDHCMI_GalleryStopOwnerLeaveScene = 5;</code> */
        public static final int HDDANIDHCMI_GalleryStopOwnerLeaveScene_VALUE = 5;
        /** <code>HDDANIDHCMI_GalleryStopPlayInitFailed = 6;</code> */
        public static final int HDDANIDHCMI_GalleryStopPlayInitFailed_VALUE = 6;
        /** <code>HDDANIDHCMI_GalleryStopOtherPlayerEnter = 7;</code> */
        public static final int HDDANIDHCMI_GalleryStopOtherPlayerEnter_VALUE = 7;
        /** <code>HDDANIDHCMI_GalleryStopAvatarDie = 8;</code> */
        public static final int HDDANIDHCMI_GalleryStopAvatarDie_VALUE = 8;
        /** <code>HDDANIDHCMI_GalleryStopFinished = 9;</code> */
        public static final int HDDANIDHCMI_GalleryStopFinished_VALUE = 9;
        /** <code>HDDANIDHCMI_GalleryStopFungusAllDie = 10;</code> */
        public static final int HDDANIDHCMI_GalleryStopFungusAllDie_VALUE = 10;
        /** <code>HDDANIDHCMI_GalleryStopLifeCountZero = 11;</code> */
        public static final int HDDANIDHCMI_GalleryStopLifeCountZero_VALUE = 11;
        /** <code>HDDANIDHCMI_GalleryStopActivityClosed = 12;</code> */
        public static final int HDDANIDHCMI_GalleryStopActivityClosed_VALUE = 12;
        /** <code>HDDANIDHCMI_GalleryStopLeaveRegionFail = 13;</code> */
        public static final int HDDANIDHCMI_GalleryStopLeaveRegionFail_VALUE = 13;
        /** <code>HDDANIDHCMI_GalleryStopHeartBloodUsedOut = 14;</code> */
        public static final int HDDANIDHCMI_GalleryStopHeartBloodUsedOut_VALUE = 14;
        /** <code>HDDANIDHCMI_GalleryStopGuardianStoneDie = 15;</code> */
        public static final int HDDANIDHCMI_GalleryStopGuardianStoneDie_VALUE = 15;

        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static HDDANIDHCMI valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static HDDANIDHCMI forNumber(int value) {
            switch (value) {
                case 0:
                    return HDDANIDHCMI_GalleryStopNone;
                case 1:
                    return HDDANIDHCMI_GalleryStopTimeup;
                case 2:
                    return HDDANIDHCMI_GalleryStopClientInterrupt;
                case 3:
                    return HDDANIDHCMI_GalleryStopLuaInterruptSuccess;
                case 4:
                    return HDDANIDHCMI_GalleryStopLuaInterruptFail;
                case 5:
                    return HDDANIDHCMI_GalleryStopOwnerLeaveScene;
                case 6:
                    return HDDANIDHCMI_GalleryStopPlayInitFailed;
                case 7:
                    return HDDANIDHCMI_GalleryStopOtherPlayerEnter;
                case 8:
                    return HDDANIDHCMI_GalleryStopAvatarDie;
                case 9:
                    return HDDANIDHCMI_GalleryStopFinished;
                case 10:
                    return HDDANIDHCMI_GalleryStopFungusAllDie;
                case 11:
                    return HDDANIDHCMI_GalleryStopLifeCountZero;
                case 12:
                    return HDDANIDHCMI_GalleryStopActivityClosed;
                case 13:
                    return HDDANIDHCMI_GalleryStopLeaveRegionFail;
                case 14:
                    return HDDANIDHCMI_GalleryStopHeartBloodUsedOut;
                case 15:
                    return HDDANIDHCMI_GalleryStopGuardianStoneDie;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<HDDANIDHCMI> internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<HDDANIDHCMI> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<HDDANIDHCMI>() {
                    public HDDANIDHCMI findValueByNumber(int number) {
                        return HDDANIDHCMI.forNumber(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalStateException(
                        "Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return emu.grasscutter.net.proto.HDDANIDHCMIOuterClass.getDescriptor().getEnumTypes().get(0);
        }

        private static final HDDANIDHCMI[] VALUES = values();

        public static HDDANIDHCMI valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private HDDANIDHCMI(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:HDDANIDHCMI)
    }

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021HDDANIDHCMI.proto*\256\005\n\013HDDANIDHCMI\022\037\n\033H"
                    + "DDANIDHCMI_GalleryStopNone\020\000\022!\n\035HDDANIDH"
                    + "CMI_GalleryStopTimeup\020\001\022*\n&HDDANIDHCMI_G"
                    + "alleryStopClientInterrupt\020\002\022.\n*HDDANIDHC"
                    + "MI_GalleryStopLuaInterruptSuccess\020\003\022+\n\'H"
                    + "DDANIDHCMI_GalleryStopLuaInterruptFail\020\004"
                    + "\022*\n&HDDANIDHCMI_GalleryStopOwnerLeaveSce"
                    + "ne\020\005\022)\n%HDDANIDHCMI_GalleryStopPlayInitF"
                    + "ailed\020\006\022+\n\'HDDANIDHCMI_GalleryStopOtherP"
                    + "layerEnter\020\007\022$\n HDDANIDHCMI_GalleryStopA"
                    + "vatarDie\020\010\022#\n\037HDDANIDHCMI_GalleryStopFin"
                    + "ished\020\t\022\'\n#HDDANIDHCMI_GalleryStopFungus"
                    + "AllDie\020\n\022(\n$HDDANIDHCMI_GalleryStopLifeC"
                    + "ountZero\020\013\022)\n%HDDANIDHCMI_GalleryStopAct"
                    + "ivityClosed\020\014\022*\n&HDDANIDHCMI_GalleryStop"
                    + "LeaveRegionFail\020\r\022,\n(HDDANIDHCMI_Gallery"
                    + "StopHeartBloodUsedOut\020\016\022+\n\'HDDANIDHCMI_G"
                    + "alleryStopGuardianStoneDie\020\017B\033\n\031emu.gras"
                    + "scutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
