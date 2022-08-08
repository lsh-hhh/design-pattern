package behavior_coR_pattern.code.filter.server;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private static final Map<String, String> userPool = new HashMap<>();

    private static final Map<String, Boolean> role = new HashMap<>();

    static {
        userPool.put("a@a.com", "aa");
        userPool.put("b@b.com", "bb");
        userPool.put("c@c.com", "cc");
        userPool.put("d@d.com", "dd");
        userPool.put("e@e.com", "ee");

        role.put("a@a.com", true);
        role.put("b@b.com", false);
        role.put("e@e.com", false);
    }

    public boolean existUser(String email) {
        return userPool.containsKey(email);
    }

    public boolean validUser(String email, String password) {
        if (userPool.containsKey(email)) {
            return userPool.get(email).equals(password);
        }
        return false;
    }

    public boolean isAdmin(String email) {
        return role.containsKey(email) && role.get(email);
    }

}
