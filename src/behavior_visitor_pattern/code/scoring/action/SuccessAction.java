package behavior_visitor_pattern.code.scoring.action;

import behavior_visitor_pattern.code.scoring.judges.Judge;

public class SuccessAction implements Action{

    @Override
    public void visit(Judge judge) {
        System.out.println("评委 " + judge.getName() + "老师 判定晋级成功");
    }
}
