package behavior_coR_partner.code.authvalid.middleware;

/**
 * 检查请求数量限制
 */
public class ThrottlingMiddleware extends Middleware{
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * 请注意，在此方法的开头和结尾都不能插入checkNext()调用。
     *
     * 这比在所有中间件对象上进行简单循环提供了更大的灵活性。
     * 例如，链中的某个元素可以通过在所有其他检查之后运行其检查来更改检查顺序。
     */
    public boolean check(String email, String password) {
        // 如果当前时间和类对象初始化时间相差超过1分钟，则请求数量置为0，初始化时间等于当前时间
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request ++;

        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            Thread.currentThread().stop();
        }
        return checkNext(email, password);
    }
}
