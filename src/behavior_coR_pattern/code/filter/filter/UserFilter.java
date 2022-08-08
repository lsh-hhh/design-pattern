package behavior_coR_pattern.code.filter.filter;

import behavior_coR_pattern.code.filter.Request;
import behavior_coR_pattern.code.filter.server.Server;
import behavior_coR_pattern.code.filter.util.ThreadLocalUtil;

public class UserFilter implements Filter{
    @Override
    public void doPre() {
        ThreadLocal<Request> threadLocal = ThreadLocalUtil.getThreadLocal();
        ThreadLocal<Server> serverThreadLocal = ThreadLocalUtil.getServerThreadLocal();

        Request request = threadLocal.get();

        Server server = serverThreadLocal.get();

        boolean b = server.existUser(request.getEmail());
        if (!b) {
            throw new RuntimeException("无此用户");
        }
    }

    @Override
    public void handle() {

    }

    @Override
    public void doPost() {
        System.out.println("UserFilter --> doPost");
    }
}
