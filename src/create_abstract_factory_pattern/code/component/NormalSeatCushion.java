package create_abstract_factory_pattern.code.component;

public class NormalSeatCushion implements SeatCushion{

    private String name = "普通坐垫";

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
