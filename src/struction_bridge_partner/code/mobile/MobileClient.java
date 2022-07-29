package struction_bridge_partner.code.mobile;

import struction_bridge_partner.code.mobile.brand.MiPhone;
import struction_bridge_partner.code.mobile.brand.NokiaPhone;
import struction_bridge_partner.code.mobile.machinetype.BarMachineType;
import struction_bridge_partner.code.mobile.machinetype.FoldingMachineType;

public class MobileClient {

    public static void main(String[] args) {
        new MiPhone(new BarMachineType()).description();
        System.out.println();
        new NokiaPhone(new FoldingMachineType()).description();

        new MiPhone(new FoldingMachineType()).description();
        System.out.println();
        new NokiaPhone(new BarMachineType()).description();
    }
}