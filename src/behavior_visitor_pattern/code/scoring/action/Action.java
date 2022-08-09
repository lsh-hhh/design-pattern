package behavior_visitor_pattern.code.scoring.action;

import behavior_visitor_pattern.code.scoring.judges.Judge;

public interface Action {

    void visit(Judge judge);


}
