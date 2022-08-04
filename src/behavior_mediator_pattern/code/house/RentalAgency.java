package behavior_mediator_pattern.code.house;

public class RentalAgency {

    private Landlord landlord;

    private Renter renter;

    public RentalAgency(Landlord landlord, Renter renter) {
        this.landlord = landlord;
        this.renter = renter;
        this.landlord.setRentalAgency(this);
        this.renter.setRentalAgency(this);
    }

    public void contact(String message, Renter renter) {
        System.out.println(renter + ":" + message);
    }

    public void askRent(Renter renter) {
        System.out.println(renter.getName() + "在询问租金");
        System.out.println(landlord.getName() + ": 房租一个月 " + landlord.getRent() + " 元");
    }

    public void askWaterChargePerTon(String message, Renter renter) {
        System.out.println(renter.getName() + ": " + message);
        System.out.println(landlord.getName() + "：每吨水 " + landlord.getWaterChargePerTon() + " 元");
    }

    public void askElectricityChargePerHour(String message, Renter renter) {
        System.out.println(renter.getName() + ": " + message);
        System.out.println(landlord.getName() + "：每度电 " + landlord.getElectricityChargePerHour() +  " 元");
    }

    public void signContract(String message, Renter renter) {
        System.out.println(renter.getName() + ": " + message);
        landlord.signContract();
    }
}
