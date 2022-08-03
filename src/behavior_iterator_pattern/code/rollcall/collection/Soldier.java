package behavior_iterator_pattern.code.rollcall.collection;

public class Soldier {

    private String name;

    private String troops;

    public Soldier(String name, String troops) {
        this.name = name;
        this.troops = troops;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTroops() {
        return troops;
    }

    public void setTroops(String troops) {
        this.troops = troops;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                ", troops='" + troops + '\'' +
                '}';
    }
}
