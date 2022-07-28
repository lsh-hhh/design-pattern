package struction_bridge_pattner.code.mobile.brand;

import struction_bridge_pattner.code.mobile.machinetype.MachineType;

public class NokiaPhone extends Brand{

    private final String brandName;

    public NokiaPhone(MachineType machineType) {
        super(machineType);
        brandName = "诺基亚手机";
    }

    @Override
    public void description() {
        System.out.println("brand: " + brandName);
        System.out.println("type: " + machineType.getType());
    }

    @Override
    public String getBrandName() {
        return brandName;
    }
}
