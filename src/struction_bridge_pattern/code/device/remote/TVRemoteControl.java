package struction_bridge_pattern.code.device.remote;

import struction_bridge_pattern.code.device.device.Device;

public class TVRemoteControl extends RemoteControl {

    public TVRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }

    @Override
    public String toString() {
        return "TVRemoteControl{" +
                "device=" + device +
                '}';
    }
}
