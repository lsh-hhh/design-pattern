package behavior_visitor_pattern.code.staff.visitor;

import behavior_visitor_pattern.code.staff.staff.Engineer;
import behavior_visitor_pattern.code.staff.staff.Manager;

public interface Visitor {

    void visit(Engineer engineer);

    void visit(Manager manager);

}
