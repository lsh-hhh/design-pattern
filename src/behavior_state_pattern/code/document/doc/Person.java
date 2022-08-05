package behavior_state_pattern.code.document.doc;

import behavior_state_pattern.code.document.state.State;

public interface Person {

    void submit(Doc doc);

    void audit(State state);
}
