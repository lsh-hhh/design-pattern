package behavior_visitor_pattern.code.scoring.judges;

import behavior_visitor_pattern.code.scoring.action.Action;

public class Judge {

    private final String name;

    public Judge(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(Action action) {
        action.visit(this);
    }
}
