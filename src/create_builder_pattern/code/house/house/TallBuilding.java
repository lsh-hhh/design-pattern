package create_builder_pattern.code.house.house;

public class TallBuilding implements House {

    private String base;
    private String mainBody;
    private String outDecoration;
    private String inDecoration;

    @Override
    public void setBase(String base) {
        this.base = "建设高楼地基~";
        this.base = base;
    }

    @Override
    public void setMainBody(String mainBody) {
        this.mainBody = "高楼主体建设";
        this.mainBody = mainBody;
    }

    @Override
    public void setOutDecoration(String outDecoration) {
        this.outDecoration = "高楼外装修~";
        this.outDecoration = outDecoration;
    }

    @Override
    public void setInDecoration(String inDecoration) {
        this.inDecoration = "高楼内装修~";
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
        return "TallBuilding{" +
                "base='" + base + '\'' +
                ", mainBody='" + mainBody + '\'' +
                ", outDecoration='" + outDecoration + '\'' +
                ", inDecoration='" + inDecoration + '\'' +
                '}';
    }
}
