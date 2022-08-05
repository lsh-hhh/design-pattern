package behavior_state_pattern.code.document.doc;

import behavior_state_pattern.code.document.state.DraftState;
import behavior_state_pattern.code.document.state.ModerationState;
import behavior_state_pattern.code.document.state.PublishedState;
import behavior_state_pattern.code.document.state.State;

public class Doc {

    private State state;

    private Author author;

    public Doc() {
        state = new DraftState(this);
    }

    public boolean isDrafting() {
        return state instanceof DraftState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void submit() {
        if (author.getRole().isAdmin()) {
            this.setState(new PublishedState(this));
            return;
        }
        this.setState(new ModerationState(this));
        System.out.println("提交成功");
    }

    @Override
    public String toString() {
        return "Doc{" +
                "state=" + state.getClass().getSimpleName() +
                ", author=" + author +
                '}';
    }
}
