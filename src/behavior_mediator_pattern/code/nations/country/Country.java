package behavior_mediator_pattern.code.nations.country;

import behavior_mediator_pattern.code.nations.union.Nations;

public abstract class Country {

    protected Nations nations;

    public Nations getNations() {
        return nations;
    }

    public void setNations(Nations nations) {
        this.nations = nations;
    }

    public abstract String getName();

    public void send(String message) {
        getNations().send(message, this);
    }

    public void notify(String message) {
        System.out.println(getCountryName() + "收到消息，" + message);
    }

    public abstract String getCountryName();
}
