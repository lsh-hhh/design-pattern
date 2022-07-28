package struction_composite_pattner.code.college;

import java.util.ArrayList;
import java.util.List;

public class FirstLevelCollege extends College {
    private final List<College> colleges = new ArrayList<>();

    public FirstLevelCollege(String name) {
        this.name = name; // "清华大学";
        level = "大学";
    }

    @Override
    public void add(College college) {
        colleges.add(college);
    }

    @Override
    public void print() {
        System.out.println(level + "：" + name);
        colleges.forEach(College::print);
    }
}
