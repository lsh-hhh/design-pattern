package behavior_visitor_pattern.code.staff;

import behavior_visitor_pattern.code.staff.staff.Engineer;
import behavior_visitor_pattern.code.staff.staff.Manager;
import behavior_visitor_pattern.code.staff.staff.Staff;

public class ReportUtil {

    public void visit(Staff staff) {

        if (staff instanceof Manager) {

            Manager manager = (Manager) staff;
            System.out.println("经理: " + manager.name + ", KPI: " + manager.kpi +
                    ", 新产品数量: " + manager.getProducts());

        } else if (staff instanceof Engineer) {

            Engineer engineer = (Engineer) staff;
            System.out.println("工程师: " + engineer.name + ", KPI: " + engineer.kpi);

        }
    }

}
