package struction_adapter_partner.code;

import struction_adapter_partner.code.adapter.EnglandSocketAdapter;
import struction_adapter_partner.code.socket.ChinaPlug;

public class AdapterClient {

    public static void main(String[] args) {

        ChinaPlug chinaPlug = new ChinaPlug();
        EnglandSocketAdapter adapter = new EnglandSocketAdapter(chinaPlug);
        System.out.println(adapter.getPlugs());
    }
}
