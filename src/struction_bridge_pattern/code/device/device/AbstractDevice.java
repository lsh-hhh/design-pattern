package struction_bridge_pattern.code.device.device;

import java.util.List;

public abstract class AbstractDevice implements Device{

    protected boolean status = false;
    protected int volume = 0;
    protected String channel = "CCTV1";

    @Override
    public boolean isEnabled() {
        return status;
    }

    @Override
    public void enable() {
        status = true;
    }

    @Override
    public void disable() {
        status = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
    }

    @Override
    public String getChannel() {
        return channel;
    }

    @Override
    public void setChannel(String channel) {
        this.channel = channel;
    }

}
