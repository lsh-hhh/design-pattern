package struction_bridge_pattner.code.mobile.brand;

import struction_bridge_pattner.code.mobile.machinetype.MachineType;

public abstract class Brand {

    protected MachineType machineType;

    public Brand(MachineType machineType) {
        this.machineType = machineType;
    }

    public abstract void description();

    public abstract String getBrandName();
}
