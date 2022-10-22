package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.avatar.Avatar;
import emu.grasscutter.game.entity.EntityAvatar;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.world.Scene;
import emu.grasscutter.game.world.World;
import emu.grasscutter.server.packet.send.*;
import emu.grasscutter.utils.Position;

import java.util.List;

@Command(
    label = "setConst",
    aliases = {"setconstellation"},
    usage = {
        "<constellation level>",
        "all <constellation level>"
    },
    permission = "player.setconstellation",
    permissionTargeted = "player.setconstellation.others")
public final class SetConstCommand implements CommandHandler {
    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (args.size() < 1) {
            sendUsageMessage(sender);
            return;
        }

        if (args.get(0).equalsIgnoreCase("all")) {
            if (args.size() < 2) {
                sendUsageMessage(sender);
                return;
            }
            try {
                int constLevel = Integer.parseInt(args.get(1));
                if (constLevel < -1 || constLevel > 6) {
                    CommandHandler.sendTranslatedMessage(sender, "commands.setConst.range_error");
                    return;
                }
                this.setAllConstellation(targetPlayer, constLevel);
                CommandHandler.sendTranslatedMessage(sender, "commands.setConst.successall", constLevel);
            } catch (NumberFormatException ignored) {
                CommandHandler.sendTranslatedMessage(sender, "commands.setConst.level_error");
            }
            return;
        }

        try {
            int constLevel = Integer.parseInt(args.get(0));
            if (constLevel < -1 || constLevel > 6) {
                CommandHandler.sendTranslatedMessage(sender, "commands.setConst.range_error");
                return;
            }

            EntityAvatar entity = targetPlayer.getTeamManager().getCurrentAvatarEntity();
            if (entity == null) return;
            Avatar avatar = entity.getAvatar();

            this.setConstellation(targetPlayer, avatar, constLevel);

            CommandHandler.sendTranslatedMessage(sender, "commands.setConst.success", avatar.getAvatarData().getName(), constLevel);
        } catch (NumberFormatException ignored) {
            CommandHandler.sendTranslatedMessage(sender, "commands.setConst.fail");
        }
    }

    private void setConstellation(Player player, Avatar avatar, int constLevel) {
        int currentConstLevel = avatar.getCoreProudSkillLevel();
        avatar.forceConstellationLevel(constLevel);

        // force player to reload scene when necessary
        if (constLevel < currentConstLevel) {
            this.reloadScene(player);
        }

        // ensure that all changes are visible to the player
        avatar.recalcConstellations();
        avatar.recalcStats(true);
        avatar.save();
    }

    private void setAllConstellation(Player player, int constLevel) {
        player.getAvatars().forEach(avatar -> {
                avatar.forceConstellationLevel(constLevel);
                avatar.recalcConstellations();
                avatar.recalcStats(true);
                avatar.save();
        });
        // Just reload scene once, shorter than having to check for each constLevel < currentConstLevel
        this.reloadScene(player);
    }

    private void reloadScene(Player player) {
        World world = player.getWorld();
        Scene scene = player.getScene();
        Position pos = player.getPosition();
        world.transferPlayerToScene(player, 1, pos);
        world.transferPlayerToScene(player, scene.getId(), pos);
        scene.broadcastPacket(new PacketSceneEntityAppearNotify(player));
    }
}
