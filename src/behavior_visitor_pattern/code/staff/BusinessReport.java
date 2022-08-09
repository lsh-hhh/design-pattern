package behavior_visitor_pattern.code.staff;

import behavior_visitor_pattern.code.staff.staff.Engineer;
import behavior_visitor_pattern.code.staff.staff.Manager;
import behavior_visitor_pattern.code.staff.staff.Staff;
import behavior_visitor_pattern.code.staff.visitor.Visitor;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {

    private List<Staff> mStaffs = new LinkedList<>();

    public BusinessReport() {
        mStaffs.add(new Manager("经理A"));
        mStaffs.add(new Engineer("工程师A"));
        mStaffs.add(new Engineer("工程师B"));
        mStaffs.add(new Engineer("工程师C"));
        mStaffs.add(new Manager("经理B"));
        mStaffs.add(new Engineer("工程师D"));
    }

    /**
     * 为访问者展示报表
     * @param visitor 公司高层，如CEO、CTO
     */
    public void showReport(Visitor visitor) {
        for (Staff staff : mStaffs) {
            staff.accept(visitor);
        }
    }

}
