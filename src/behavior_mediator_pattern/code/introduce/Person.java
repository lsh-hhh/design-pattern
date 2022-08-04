package behavior_mediator_pattern.code.introduce;

public abstract class Person {

    //姓名
    String name;
    //条件
    int condition;
    //中介者（不管男孩还是女孩，都需要知道中介者，通过中介者去找对象）
    Mediator mediator;

    public Person(Mediator mediator, String name, int condition) {
        this.mediator = mediator;
        this.name = name;
        this.condition = condition;
    }

    public abstract boolean findPartner(Person person);


    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
