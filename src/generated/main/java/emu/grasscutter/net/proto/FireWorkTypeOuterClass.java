// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FireWorkType.proto

package emu.grasscutter.net.proto;

public final class FireWorkTypeOuterClass {
    private FireWorkTypeOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }
    /** Protobuf enum {@code FireWorkType} */
    public enum FireWorkType implements com.google.protobuf.ProtocolMessageEnum {
        /** <code>FireWorkType_ODJKANKMPPJ = 0;</code> */
        FireWorkType_ODJKANKMPPJ(0),
        /** <code>FireWorkType_EFGLHEIODFN = 1;</code> */
        FireWorkType_EFGLHEIODFN(1),
        /** <code>FireWorkType_JPBBBCFGHAK = 2;</code> */
        FireWorkType_JPBBBCFGHAK(2),
        /** <code>FireWorkType_IDCMGHBHBFH = 3;</code> */
        FireWorkType_IDCMGHBHBFH(3),
        /** <code>FireWorkType_ODDBNNDFMBO = 4;</code> */
        FireWorkType_ODDBNNDFMBO(4),
        /** <code>FireWorkType_AGIDMOGJOBD = 5;</code> */
        FireWorkType_AGIDMOGJOBD(5),
        UNRECOGNIZED(-1),
        ;

        /** <code>FireWorkType_ODJKANKMPPJ = 0;</code> */
        public static final int FireWorkType_ODJKANKMPPJ_VALUE = 0;
        /** <code>FireWorkType_EFGLHEIODFN = 1;</code> */
        public static final int FireWorkType_EFGLHEIODFN_VALUE = 1;
        /** <code>FireWorkType_JPBBBCFGHAK = 2;</code> */
        public static final int FireWorkType_JPBBBCFGHAK_VALUE = 2;
        /** <code>FireWorkType_IDCMGHBHBFH = 3;</code> */
        public static final int FireWorkType_IDCMGHBHBFH_VALUE = 3;
        /** <code>FireWorkType_ODDBNNDFMBO = 4;</code> */
        public static final int FireWorkType_ODDBNNDFMBO_VALUE = 4;
        /** <code>FireWorkType_AGIDMOGJOBD = 5;</code> */
        public static final int FireWorkType_AGIDMOGJOBD_VALUE = 5;

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
        public static FireWorkType valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static FireWorkType forNumber(int value) {
            switch (value) {
                case 0:
                    return FireWorkType_ODJKANKMPPJ;
                case 1:
                    return FireWorkType_EFGLHEIODFN;
                case 2:
                    return FireWorkType_JPBBBCFGHAK;
                case 3:
                    return FireWorkType_IDCMGHBHBFH;
                case 4:
                    return FireWorkType_ODDBNNDFMBO;
                case 5:
                    return FireWorkType_AGIDMOGJOBD;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<FireWorkType> internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<FireWorkType> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<FireWorkType>() {
                    public FireWorkType findValueByNumber(int number) {
                        return FireWorkType.forNumber(number);
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
            return emu.grasscutter.net.proto.FireWorkTypeOuterClass.getDescriptor().getEnumTypes().get(0);
        }

        private static final FireWorkType[] VALUES = values();

        public static FireWorkType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private FireWorkType(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:FireWorkType)
    }

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\022FireWorkType.proto*\302\001\n\014FireWorkType\022\034\n"
                    + "\030FireWorkType_ODJKANKMPPJ\020\000\022\034\n\030FireWorkT"
                    + "ype_EFGLHEIODFN\020\001\022\034\n\030FireWorkType_JPBBBC"
                    + "FGHAK\020\002\022\034\n\030FireWorkType_IDCMGHBHBFH\020\003\022\034\n"
                    + "\030FireWorkType_ODDBNNDFMBO\020\004\022\034\n\030FireWorkT"
                    + "ype_AGIDMOGJOBD\020\005B\033\n\031emu.grasscutter.net"
                    + ".protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
