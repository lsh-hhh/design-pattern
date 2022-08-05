package behavior_state_pattern.code.document.state;

import behavior_state_pattern.code.document.doc.Doc;

public class ModerationState extends State{

    public ModerationState(Doc doc) {
        super(doc);
    }

    @Override
    public String revocation() {
        if (doc.getState() instanceof ModerationState) {
            doc.setState(new DraftState(doc));
            return "撤回成功";
        }
        return "撤回失败";
    }

    @Override
    public String overruled() {
        if (doc.getState() instanceof PublishedState) {
            return "驳回失败，已经发表";
        }
        doc.setState(new DraftState(doc));
        return "驳回成功";
    }

    @Override
    public String pass() {
        doc.setState(new PublishedState(doc));
        return "发布成功";
    }
}
