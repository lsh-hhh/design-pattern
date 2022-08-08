package behavior_coR_pattern.code.filter;

import behavior_coR_pattern.code.filter.filter.FilterContext;
import behavior_coR_pattern.code.filter.filter.PasswordFilter;
import behavior_coR_pattern.code.filter.filter.RoleFilter;
import behavior_coR_pattern.code.filter.filter.UserFilter;
import behavior_coR_pattern.code.filter.server.Server;
import behavior_coR_pattern.code.filter.util.ThreadLocalUtil;

public class FilterClient {

    public static void main(String[] args) {
        String email = "a@a.com";
        String password = "aaa";
        Request request = new Request(email, password);
        ThreadLocal<Request> threadLocal = ThreadLocalUtil.getThreadLocal();
        threadLocal.set(request);

        ThreadLocal<Server> serverThreadLocal = ThreadLocalUtil.getServerThreadLocal();
        serverThreadLocal.set(new Server());

        // 设置链条
        FilterContext filterContext = new FilterContext();
        filterContext.addFilters(new UserFilter());
        filterContext.addFilters(new PasswordFilter());
        filterContext.addFilters(new RoleFilter());

        filterContext.doPreFilter(request);
        filterContext.doPostFilter(request);
    }
}
