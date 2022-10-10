package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.Unk2700BEDLIGJANCJClientReq;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketChangeHomeBgmNotify;
import emu.grasscutter.server.packet.send.PacketChangeHomeBgmRsp;
import emu.grasscutter.server.packet.send.PacketHomeGetArrangementInfoRsp;
import emu.grasscutter.server.packet.send.PacketUnlockedHomeBgmNotify;

import java.util.Collections;

@Opcodes(PacketOpcodes.Unk2700_BEDLIGJANCJ_ClientReq)
public class HandlerChangeHomeBgmReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = Unk2700BEDLIGJANCJClientReq.Unk2700_BEDLIGJANCJ_ClientReq.parseFrom(payload);

        int homeBgmId = req.getUnk2700BJHAMKKECEI();
        var home = session.getPlayer().getHome();
        var info = home.getUnlockedHomeBgmListInfo();
        if (!info.contains(homeBgmId)) {
            home.addUnlockedHomeBgm(homeBgmId);
            session.send(new PacketUnlockedHomeBgmNotify(session.getPlayer()));
        }

        home.getHomeSceneItem(session.getPlayer().getSceneId()).setHomeBgmId(homeBgmId);
        home.save();

        for (Player player : session.getPlayer().getScene().getPlayers()) {
            //Notify all players in the scene that home bgm was changed.
            player.sendPacket(new PacketHomeGetArrangementInfoRsp(player, Collections.singletonList(player.getSceneId())));
        }

        session.send(new PacketChangeHomeBgmNotify(homeBgmId));
        session.send(new PacketChangeHomeBgmRsp());
    }
}