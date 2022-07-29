package struction_composite_partner.code.college;

import java.util.ArrayList;
import java.util.List;

public class ThirdLevelCollege extends College{

    private final List<College> colleges = new ArrayList<>();

    public ThirdLevelCollege(String name) {
        this.name = name; // "清华大学-信息学院-计算机系";
        level = "系";
    }

    @Override
    public void add(College college) {
        colleges.add(college);
    }

    @Override
    public void print() {
        System.out.println("  " + level + "：" + name);
        colleges.forEach(College::print);
    }
}
