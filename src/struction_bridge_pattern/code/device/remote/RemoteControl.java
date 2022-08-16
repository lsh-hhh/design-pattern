package struction_bridge_pattern.code.device.remote;

import struction_bridge_pattern.code.device.device.Device;

import java.util.List;

public class RemoteControl {

    protected final Device device;
    private final List<String> channelList;

    public RemoteControl(Device device) {
        this.device = device;
        channelList = device.channelList();
    }

    protected void checkBeforeInvoke() {
        if (!device.isEnabled()) {
            throw new RuntimeException("设备未启动");
        }
    }

    public void togglePower() {
        String msg = "";
        if (device.isEnabled()) {
            device.disable();
            msg = "===============设备关闭\n";
        } else {
            device.enable();
            msg = "===============设备启动\n";
        }
        System.out.println(msg);
    }

    public void volumeDown() {
        checkBeforeInvoke();
        System.out.print("音量-  ");
        int volume = device.getVolume();
        if (volume > 0) {
            device.setVolume(volume - 1);
        }
        System.out.println("当前音量：" + device.getVolume() + "\n");
    }

    public void volumeUp() {
        checkBeforeInvoke();
        System.out.print("音量+  ");
        int volume = device.getVolume();
        device.setVolume(volume + 10);
        System.out.println("当前音量：" + device.getVolume() + "\n");
    }

    public void channelDown() {
        checkBeforeInvoke();
        String channel = device.getChannel();
        int channelIndex = getChannelIndex(channel);
        int nexChannelIndex = channelIndex == 0 ? (channelIndex - 1 + channelList.size()) : channelIndex - 1;
        String nextChannel = channelList.get(nexChannelIndex % channelList.size());
        device.setChannel(nextChannel);
        System.out.println("由[" + channel + "]切换到上一个节目：[" + nextChannel + "]\n");
    }

    public void channelUp() {
        checkBeforeInvoke();
        String channel = device.getChannel();
        int channelIndex = getChannelIndex(channel);
        int nexChannelIndex = channelIndex + 1;
        String nextChannel = channelList.get(nexChannelIndex % channelList.size());
        device.setChannel(nextChannel);
        System.out.println("由[" + channel + "]切换到下一个节目：[" + nextChannel + "]\n");
    }

    private int getChannelIndex(String channel) {
        for (int i = 0; i < channelList.size(); i++) {
            if (channelList.get(i).equals(channel)) {
                return i;
            }
        }
        return 0;
    }
}
