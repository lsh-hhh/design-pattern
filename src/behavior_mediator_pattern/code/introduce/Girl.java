package behavior_mediator_pattern.code.introduce;


public class Girl extends Person {
    public Girl(Mediator mediator, String name, int condition) {
        super(mediator, name, condition);
        //注册自己
        mediator.registGirl(this);
    }

    @Override
    public boolean findPartner(Person person) {
        System.out.println("Girl try to find boy.");
        return mediator.findPartner(person);
    }
}
