package behavior_coR_pattern.code.filter.filter;

import behavior_coR_pattern.code.filter.Request;
import behavior_coR_pattern.code.filter.server.Server;
import behavior_coR_pattern.code.filter.util.ThreadLocalUtil;

public class RoleFilter implements Filter{
    @Override
    public void doPre() {
        ThreadLocal<Request> threadLocal = ThreadLocalUtil.getThreadLocal();
        ThreadLocal<Server> serverThreadLocal = ThreadLocalUtil.getServerThreadLocal();

        Request request = threadLocal.get();

        Server server = serverThreadLocal.get();

        boolean b = server.isAdmin(request.getEmail());
        if (!b) {
            System.out.println("非管理员，执行 xx 操作");
        } else {
            System.out.println("管理员，拥有最高权限");
        }
    }

    @Override
    public void handle() {

    }

    @Override
    public void doPost() {
        System.out.println("RoleFilter --> doPost");
    }
}
