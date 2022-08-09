package behavior_visitor_pattern.code.scoring;

import behavior_visitor_pattern.code.scoring.action.Action;
import behavior_visitor_pattern.code.scoring.action.FailAction;
import behavior_visitor_pattern.code.scoring.action.SuccessAction;
import behavior_visitor_pattern.code.scoring.action.UndeterminedAction;
import behavior_visitor_pattern.code.scoring.judges.Judge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ScoringClient {

    private static List<Action> actions = new ArrayList<>();
    static {
        actions.add(new FailAction());
        actions.add(new SuccessAction());
        actions.add(new UndeterminedAction());
    }

    public static void main(String[] args) {

        Judge female = new Judge("那英");
        Judge female1 = new Judge("韩红");

        Judge jay = new Judge("周杰伦");
        Judge eason = new Judge("陈奕迅");

        female.accept(randomAction());
        female1.accept(randomAction());
        jay.accept(randomAction());
        eason.accept(randomAction());

    }

    private static Action randomAction() {
        Random random = new Random();
        int i = random.nextInt(3);
        return actions.get(i);
    }
}
