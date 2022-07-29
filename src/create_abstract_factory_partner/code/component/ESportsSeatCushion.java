package create_abstract_factory_partner.code.component;

public class ESportsSeatCushion implements SeatCushion{
    private String name = "电竞坐垫";
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
