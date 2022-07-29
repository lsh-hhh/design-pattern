package struction_composite_partner.code.college;

public class FourthLevelCollege extends College{

    public FourthLevelCollege(String name) {
        this.name = name; // "清华大学-信息学院-计算机系" + grade;
        level = "班";
    }

    @Override
    public void add(College college) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        System.out.println("    " + level + "：" + name + "班");
    }
}
