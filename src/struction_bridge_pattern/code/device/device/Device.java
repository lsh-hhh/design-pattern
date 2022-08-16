package struction_bridge_pattern.code.device.device;

import java.util.ArrayList;
import java.util.List;

public interface Device {

    boolean isEnabled();

    // 开
    void enable();

    // 关
    void disable();

    // 音量
    int getVolume();

    // 设置音量
    void setVolume(int percent);

    // 频道
    String getChannel();

    // 设置频道
    void setChannel(String channel);

    List<String> channelList();

}
