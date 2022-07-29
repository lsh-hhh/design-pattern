package struction_adapter_partner.code.socket;

/**
 * 中国标准的插头
 */
public class ChinaPlug {

    private Integer plugs = 2;

    private String desc = "中国国内标准插头";

    public Integer getPlugs() {
        return plugs;
    }

    public String getDesc() {
        return desc;
    }

    public void setPlugs(Integer plugs) {
        this.plugs = plugs;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
