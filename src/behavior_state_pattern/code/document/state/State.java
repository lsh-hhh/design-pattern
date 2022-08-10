package behavior_state_pattern.code.document.state;

import behavior_state_pattern.code.document.doc.Doc;

public abstract class State {

    protected Doc doc;

    public State(Doc doc) {
        this.doc = doc;
    }

    public String submit() {
        throw new RuntimeException("请用子类实现");
    }

    /**
     * 撤回
     *
     * @return
     */
    public abstract String revocation();

    /**
     * 驳回
     *
     * @return
     */
    public abstract String overruled();

    /**
     * 审核通过
     *
     * @return
     */
    public abstract String pass();

}
