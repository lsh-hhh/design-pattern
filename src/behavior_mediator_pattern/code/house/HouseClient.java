package behavior_mediator_pattern.code.house;

public class HouseClient {

    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        Renter renter = new Renter();

        RentalAgency rentalAgency = new RentalAgency(landlord, renter);

        renter.contactLandlord();
        renter.askRent();
        renter.askElectricityChargePerHour();
        renter.askWaterChargePerTon();

        renter.signContract();
    }
}
