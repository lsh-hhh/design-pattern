package behavior_coR_pattern.code.filter.util;

import behavior_coR_pattern.code.filter.Request;
import behavior_coR_pattern.code.filter.server.Server;

public class ThreadLocalUtil {

    private volatile static ThreadLocal<Request> USER_THREAD_LOCAL;

    private volatile static ThreadLocal<Server> SERVER_THREAD_LOCAL;

    private ThreadLocalUtil () {}

    public static ThreadLocal<Request> getThreadLocal() {
        if (USER_THREAD_LOCAL == null) {
            synchronized (ThreadLocalUtil.class) {
                if (USER_THREAD_LOCAL == null) {
                    USER_THREAD_LOCAL = new ThreadLocal<>();
                }
            }
        }
        return USER_THREAD_LOCAL;
    }

    public static ThreadLocal<Server> getServerThreadLocal() {
        if (SERVER_THREAD_LOCAL == null) {
            synchronized (ThreadLocalUtil.class) {
                if (SERVER_THREAD_LOCAL == null) {
                    SERVER_THREAD_LOCAL = new ThreadLocal<>();
                }
            }
        }
        return SERVER_THREAD_LOCAL;
    }

    public static void removeThreadLocal() {
        if (SERVER_THREAD_LOCAL != null) {
            SERVER_THREAD_LOCAL.remove();
        }
        if (USER_THREAD_LOCAL != null) {
            USER_THREAD_LOCAL.remove();
        }
    }
}
