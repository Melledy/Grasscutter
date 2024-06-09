package emu.grasscutter.server.event.internal;

import emu.grasscutter.server.event.types.ServerEvent;
import lombok.Getter;

import java.time.OffsetDateTime;

@Getter
public final class ServerStopEvent extends ServerEvent {
    private final OffsetDateTime stopTime;

    public ServerStopEvent(Type type, OffsetDateTime stopTime) {
        super(type);

        this.stopTime = stopTime;
    }

}
