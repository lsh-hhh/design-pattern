package behavior_coR_partner.code.authvalid.middleware;

public abstract class Middleware {

    private Middleware next;

    /**
     * 设置职责链链
     */
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    /**
     * 检查的逻辑，由子类实现
     */
    public abstract boolean check(String email, String password);

    /**
     * 调用下一个执行器进行校验
     */
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
