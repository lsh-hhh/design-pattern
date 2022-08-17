package create_abstract_factory_pattern.code.furniture.component;

public class ESportsChair implements Chair {

    private String name = "电竞椅";

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
