package behavior_visitor_pattern.code.staff.visitor;

import behavior_visitor_pattern.code.staff.staff.Engineer;
import behavior_visitor_pattern.code.staff.staff.Manager;

public class CTOVisitor implements Visitor{


    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.name + "，代码数量：" + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.name + "，新品数量：" + manager.getProducts());
    }
}
