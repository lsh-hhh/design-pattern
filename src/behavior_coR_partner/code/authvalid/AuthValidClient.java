package behavior_coR_partner.code.authvalid;

import behavior_coR_partner.code.authvalid.middleware.Middleware;
import behavior_coR_partner.code.authvalid.middleware.RoleCheckMiddleware;
import behavior_coR_partner.code.authvalid.middleware.ThrottlingMiddleware;
import behavior_coR_partner.code.authvalid.middleware.UserExistsMiddleware;
import behavior_coR_partner.code.authvalid.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AuthValidClient {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // 所有认证检查链条初始化，并且按顺序关联
        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        // 模拟的服务器，设置过滤链
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }

}
