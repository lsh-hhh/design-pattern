package behavior_state_pattern.code.document.doc;

import behavior_state_pattern.code.document.state.State;

public class Admin extends Author implements Person{

    private Doc doc;

    public Admin(String name, Role role) {
        super(name, role);
    }

    public void setDoc(Doc doc) {
        this.doc = doc;
    }

    @Override
    public void submit(Doc doc) {
        this.doc = doc;
        doc.submit();
    }

    @Override
    public void audit(State state) {
        doc.setState(state);
    }
}
