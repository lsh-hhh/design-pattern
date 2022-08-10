package behavior_state_pattern.code.document.doc;

import behavior_state_pattern.code.document.state.DraftState;
import behavior_state_pattern.code.document.state.ModerationState;
import behavior_state_pattern.code.document.state.PublishedState;
import behavior_state_pattern.code.document.state.State;

/**
 * 状态：
 * 	草稿：
 * 		操作：
 * 			提交：
 * 				发表人是管理员： -> 已发布
 * 				发表人是普通用户： -> 审核中
 * 			撤回：
 * 				草稿状态无法撤回
 * 	审核中：
 * 		操作：
 * 			审核：
 * 				管理员审核通过： -> 已发布
 * 				管理员审核失败： -> 草稿
 * 			驳回：
 * 				管理员驳回： -> 草稿
 * 	已发布：
 * 		操作：
 * 			撤回：
 * 				管理员撤回： -> 草稿
 */
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
