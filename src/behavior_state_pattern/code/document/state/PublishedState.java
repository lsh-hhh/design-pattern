package behavior_state_pattern.code.document.state;

import behavior_state_pattern.code.document.doc.Doc;

public class PublishedState extends State{

    public PublishedState(Doc doc) {
        super(doc);
    }

    @Override
    public String revocation() {

        return "已经发布，无法撤回";
    }

    @Override
    public String overruled() {
        doc.setState(new DraftState(doc));
        return "驳回成功";
    }

    @Override
    public String pass() {
        return "已经发布，无需审批";
    }
}
