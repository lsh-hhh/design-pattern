package behavior_mediator_pattern.code.introduce;


public class Boy extends Person {

    public Boy(Mediator mediator, String name, int condition) {
        super(mediator, name, condition);
        //注册自己
        mediator.registBoy(this);
    }

    @Override
    public boolean findPartner(Person person) {
        System.out.println("Boy try to find girl.");
        return mediator.findPartner(person);
    }
}
