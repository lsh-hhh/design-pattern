package behavior_state_pattern.code.document.doc;

public enum Role {

    ADMIN("admin", true),
    ORDINARY_USER("ordinary", false),

    ;

    Role(String name, boolean admin) {
        this.name = name;
        this.admin = admin;
    }

    private final String name;
    private final boolean admin;

    public String getName() {
        return name;
    }

    public boolean isAdmin() {
        return admin;
    }
}
