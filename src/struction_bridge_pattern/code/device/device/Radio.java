package struction_bridge_pattern.code.device.device;

import java.util.ArrayList;
import java.util.List;

public class Radio extends AbstractDevice{

    public Radio() {
        channel = "90.4频道";
    }

    public List<String> channelList() {
        ArrayList<String> channelList = new ArrayList<>();
        channelList.add("90.4频道");
        channelList.add("福州 89.3 福州广播二台");
        channelList.add("福州 90.6 海峡之声广播电台");
        channelList.add("福州 92.6 中央人民广播电台音乐台 ( 福州转播 )");
        channelList.add("福州 94.0 福州广播二台");
        channelList.add("福州 94.4 福州广播二台");
        channelList.add("福州 96.1 福建经济广播电台");
        channelList.add("福州 97.6 福建人民广播电台交通音乐台");
        channelList.add("泉州 95.5 福建人民广播电台经济台");
        channelList.add("泉州 103.9 福建人民广播电台");
        channelList.add("厦门 90.9 厦广音乐广播电台");
        channelList.add("厦门 98.6 福建人民广播电台经济台");
        return channelList;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "status=" + status +
                ", volume=" + volume +
                ", channel='" + channel + '\'' +
                '}';
    }
}
