package behavior_coR_pattern.code.authvalid.middleware;

/**
 * 角色校验
 */
public class RoleCheckMiddleware  extends Middleware {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
