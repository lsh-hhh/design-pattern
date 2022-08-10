package behavior_state_pattern.code.document.state;

import behavior_state_pattern.code.document.doc.Doc;

public class DraftState extends State{

    public DraftState(Doc doc) {
        super(doc);
    }

    @Override
    public String submit() {
        if (doc.getAuthor().getRole().isAdmin()) {
            doc.setState(new PublishedState(doc));
            return "发表成功";
        }
        doc.setState(new ModerationState(doc));
        return "提交成功";
    }

    @Override
    public String revocation() {
        return "当前已是草稿状态，无需撤回";
    }

    @Override
    public String overruled() {
        return "当前已是草稿状态，驳回失败";
    }

    @Override
    public String pass() {
        return "当前状态为草稿，无法审核";
    }
}
