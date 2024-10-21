package com.killerqu.network;

import com.killerqu.QConstants;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;

public class QNetworking {
    private static SimpleChannel CHANNEL;
    private static int packetId = 0;
    private static int id() {
        return packetId++;
    }

    public static void register() {
        CHANNEL = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(QConstants.MODID, "network"))
                .networkProtocolVersion(() -> "0")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();
    }

    public static <MSG> void sendToServer(MSG message) {
        CHANNEL.sendToServer(message);
    }

    public static <MSG> void sendToPlayer(MSG message, ServerPlayer player) {
        CHANNEL.send(PacketDistributor.PLAYER.with(() -> player), message);
    }

    public static <MSG> void sendToClients(MSG message) {
        CHANNEL.send(PacketDistributor.ALL.noArg(), message);
    }
}
