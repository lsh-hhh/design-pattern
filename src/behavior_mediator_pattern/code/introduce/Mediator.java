package behavior_mediator_pattern.code.introduce;

public class Mediator {

    Boy boy;
    Girl girl;

    //男孩注册
    public void registBoy(Boy boy) {
        this.boy = boy;
    }

    //女孩注册
    public void registGirl(Girl girl) {
        this.girl = girl;
    }

    //根据各自的条件匹配
    public boolean findPartner(Person person) {
        if (person instanceof Boy) {
            this.boy = (Boy) person;
        } else {
            this.girl = (Girl) person;
        }

        boolean ret = this.boy.getCondition() == this.girl.getCondition();

        System.out.println(this.boy.getName() + " & " + this.girl.getName() + " is partner: " + ret);

        return ret;
    }
}
