package struction_adapter_partner.code.adapter;

import struction_adapter_partner.code.socket.ChinaPlug;
import struction_adapter_partner.code.socket.EnglandSocket;

public class EnglandSocketAdapter extends EnglandSocket {

    private ChinaPlug chinaPlug;

    public EnglandSocketAdapter(ChinaPlug chinaPlug) {
        this.chinaPlug = chinaPlug;
    }

    @Override
    public Integer getPlugs() {
        System.out.println("经过一系列处理 ...");
        System.out.println("国内标准通过适配器转换，由" + chinaPlug.getPlugs() + "变为3");
        return chinaPlug.getPlugs() + 1;
    }
}
