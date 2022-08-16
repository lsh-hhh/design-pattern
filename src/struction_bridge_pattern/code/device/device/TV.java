package struction_bridge_pattern.code.device.device;

import java.util.ArrayList;
import java.util.List;

public class TV extends AbstractDevice{

    public TV() {
        channel = "CCTV1";
    }

    public List<String> channelList() {
        ArrayList<String> channelList = new ArrayList<>();
        channelList.add("CCTV1");
        channelList.add("CCTV2");
        channelList.add("CCTV3");
        channelList.add("CCTV4");
        channelList.add("CCTV5");
        channelList.add("CCTV6");
        channelList.add("CCTV7");
        channelList.add("湖南卫视");
        channelList.add("浙江卫视");
        channelList.add("东南卫视");
        channelList.add("泉州一套");
        return channelList;
    }

    @Override
    public String toString() {
        return "TV{" +
                "status=" + status +
                ", volume=" + volume +
                ", channel='" + channel + '\'' +
                '}';
    }
}
