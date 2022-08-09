package behavior_visitor_pattern.code.staff;

import behavior_visitor_pattern.code.staff.visitor.CEOVisitor;
import behavior_visitor_pattern.code.staff.visitor.CTOVisitor;

public class StaffClient {

    public static void main(String[] args) {
        // 构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());
        System.out.println();

        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());
    }
}
