package behavior_mediator_pattern.code.house;

import java.math.BigDecimal;

/**
 * 房东
 */
public class Landlord {
    private String name = "房东";
    private RentalAgency rentalAgency;

    /**
     * 获取租金
     *
     * @return
     */
    public BigDecimal getRent() {
        return BigDecimal.valueOf(1500L);
    }

    /**
     * 水费
     *
     * @return
     */
    public BigDecimal getWaterChargePerTon() {
        return BigDecimal.valueOf(5);
    }

    /**
     * 电费
     *
     * @return
     */
    public BigDecimal getElectricityChargePerHour() {
        return BigDecimal.valueOf(1.2);
    }

    /**
     * 签合同
     */
    public void signContract() {
        System.out.println("签合同");
    }

    public void setRentalAgency(RentalAgency rentalAgency) {
        this.rentalAgency = rentalAgency;
    }

    public String getName() {
        return name;
    }
}
