package behavior_mediator_pattern.code.house;

public class Renter {

    private RentalAgency rentalAgency;

    private final String name = "jay";

    public void contactLandlord() {
        rentalAgency.contact("联系房东...", this);
    }

    public void askRent() {
        rentalAgency.askRent(this);
    }

    public void askWaterChargePerTon() {
        rentalAgency.askWaterChargePerTon("询问水费每吨多少钱", this);
    }

    public void askElectricityChargePerHour() {
        rentalAgency.askElectricityChargePerHour("询问电费每度多少钱", this);
    }

    public void signContract() {
        rentalAgency.signContract("来签合同", this);
    }

    public void setRentalAgency(RentalAgency rentalAgency) {
        this.rentalAgency = rentalAgency;
    }

    public String getName() {
        return name;
    }
}
