package create_abstract_factory_pattner.code.component;

public class NormalChair implements Chair{

    private String name = "正常椅子";

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
