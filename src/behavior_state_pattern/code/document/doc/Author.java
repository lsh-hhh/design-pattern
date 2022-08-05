package behavior_state_pattern.code.document.doc;

public class Author {

    private final String name;

    private final Role role;

    public Author(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
