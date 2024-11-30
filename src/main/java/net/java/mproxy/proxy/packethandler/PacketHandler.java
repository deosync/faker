package net.java.mproxy.proxy.packethandler;

import io.netty.channel.ChannelFutureListener;
import net.java.mproxy.proxy.session.DualConnection;
import net.raphimc.netminecraft.packet.Packet;
import net.java.mproxy.proxy.session.ProxyConnection;

import java.util.List;

public abstract class PacketHandler {

    protected final ProxyConnection proxyConnection;

    public PacketHandler(final ProxyConnection proxyConnection) {
        this.proxyConnection = proxyConnection;
    }

    public void handleP2S(DualConnection dualConnection, final Packet packet, final List<ChannelFutureListener> listeners) {

    }

    public boolean handleC2P(final Packet packet, final List<ChannelFutureListener> listeners) throws Exception {
        return true;
    }


    public void handleP2S(final Packet packet, final List<ChannelFutureListener> listeners) throws Exception {

    }

}
