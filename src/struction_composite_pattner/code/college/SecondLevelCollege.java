package struction_composite_pattner.code.college;

import java.util.ArrayList;
import java.util.List;

public class SecondLevelCollege extends College {
    private final List<College> colleges = new ArrayList<>();

    public SecondLevelCollege(String name) {
        this.name = name; // "清华大学-信息学院";
        level = "学院";
    }

    @Override
    public void add(College college) {
        colleges.add(college);
    }

    @Override
    public void print() {
        System.out.println(" ************ ");
        System.out.println(" " + level + "：" + name);
        colleges.forEach(College::print);
    }
}
