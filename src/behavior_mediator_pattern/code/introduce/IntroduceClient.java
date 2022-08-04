package behavior_mediator_pattern.code.introduce;

public class IntroduceClient {

    public static void main(String[] args) {

        //婚姻中介所开张了
        Mediator mediator = new Mediator();

        //一个名为Zhangshan的男孩，条件为80
        Boy zhangshan = new Boy(mediator, "Zhangshan", 80);
        Girl lili = new Girl(mediator, "Lili", 80);

        //如果条件符合，则partner成立
        zhangshan.findPartner(lili);

        //一个名为lanlan的女孩，条件为90
        Girl lanlan = new Girl(mediator, "lanlan", 90);
        lanlan.findPartner(zhangshan);
    }
}
