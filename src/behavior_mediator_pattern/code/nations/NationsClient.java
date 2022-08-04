package behavior_mediator_pattern.code.nations;

import behavior_mediator_pattern.code.nations.country.CH;
import behavior_mediator_pattern.code.nations.country.RS;
import behavior_mediator_pattern.code.nations.country.US;
import behavior_mediator_pattern.code.nations.union.UnitedNations;

public class NationsClient {

    public static void main(String[] args) {

        UnitedNations unitedNations = new UnitedNations();

        CH ch = new CH();
        US us = new US();
        RS rs = new RS();
        unitedNations.register(ch);
        unitedNations.register(us);
        unitedNations.register(rs);

        unitedNations.send("zhun bei wu tong taiwan", ch);

        System.out.println("\n");
        unitedNations.send("敢梧桐我就敢送装备", us);

        System.out.println("\n");
        unitedNations.send("坚决支持兔子", rs);

    }
}
