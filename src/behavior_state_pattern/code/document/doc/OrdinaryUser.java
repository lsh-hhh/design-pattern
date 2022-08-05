package behavior_state_pattern.code.document.doc;

import behavior_state_pattern.code.document.state.State;

public class OrdinaryUser extends Author implements Person{

    public OrdinaryUser(String name, Role role) {
        super(name, role);
    }

    @Override
    public void submit(Doc doc) {
        doc.submit();
    }

    @Override
    public void audit(State state) {

    }
}
