package create_builder_partner.code.house.house;

public class Cottage implements House{

    private String base;
    private String mainBody;
    private String outDecoration;
    private String inDecoration;

    @Override
    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public void setMainBody(String mainBody) {
        this.mainBody = mainBody;
    }

    @Override
    public void setOutDecoration(String outDecoration) {
        this.outDecoration = outDecoration;
    }

    @Override
    public void setInDecoration(String inDecoration) {
        this.inDecoration = inDecoration;
    }

    public String getBase() {
        return base;
    }

    public String getMainBody() {
        return mainBody;
    }

    public String getOutDecoration() {
        return outDecoration;
    }

    public String getInDecoration() {
        return inDecoration;
    }

    @Override
    public String toString() {
        return "Cottage{" +
                "base='" + base + '\'' +
                ", mainBody='" + mainBody + '\'' +
                ", outDecoration='" + outDecoration + '\'' +
                ", inDecoration='" + inDecoration + '\'' +
                '}';
    }
}
