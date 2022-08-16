package struction_bridge_pattern.code.device;

import struction_bridge_pattern.code.device.device.TV;
import struction_bridge_pattern.code.device.remote.TVRemoteControl;

public class DeviceClient {

    public static void main(String[] args) {
        TVRemoteControl tvRemoteControl = new TVRemoteControl(new TV());
        tvRemoteControl.togglePower();

        tvRemoteControl.channelDown();

        tvRemoteControl.mute();
        System.out.println(tvRemoteControl);

        tvRemoteControl.channelUp();
        tvRemoteControl.channelUp();
        tvRemoteControl.channelUp();
        System.out.println(tvRemoteControl);

        tvRemoteControl.volumeDown();
        tvRemoteControl.volumeUp();
        System.out.println(tvRemoteControl);
    }
}
