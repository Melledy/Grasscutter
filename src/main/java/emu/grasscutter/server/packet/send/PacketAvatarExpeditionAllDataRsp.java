package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.expedition.ExpeditionInfo;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.AvatarExpeditionAllDataRspOuterClass.AvatarExpeditionAllDataRsp;

import java.util.*;
import java.util.stream.Collectors;

public class PacketAvatarExpeditionAllDataRsp extends BasePacket {
    public PacketAvatarExpeditionAllDataRsp(Map<Long, ExpeditionInfo> expeditionInfo) {
        super(PacketOpcodes.AvatarExpeditionAllDataRsp);

        List<Integer> openExpeditionList  = new ArrayList<>(List.of(306,305,304,303,302,301,206,105,204,104,203,103,202,101,102,201,106,205));

        this.setData(AvatarExpeditionAllDataRsp.newBuilder()
            .addAllOpenExpeditionList(openExpeditionList)
            .setExpeditionCountLimit(5)
            .putAllExpeditionInfoMap(
                expeditionInfo.entrySet().stream()
                    .collect(Collectors.toMap(
                        e -> e.getKey(),
                        e -> e.getValue().toProto())))
            .build());
    }
}
