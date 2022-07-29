package struction_decorator_partner.code.milktea;

import struction_decorator_partner.code.milktea.decorator.*;

import java.math.BigDecimal;

public class MilkteaClient {

    public static void main(String[] args) {

        MilkTea milkTea = new PureMilkTea();

        AbstractDecorator milkTeaDecorator = new GrapeDecorator(milkTea);
        BigDecimal additiveMoney = milkTeaDecorator.addSomething(2);

        milkTeaDecorator = new PearlDecorator(milkTeaDecorator);
        additiveMoney = additiveMoney.add(milkTeaDecorator.addSomething(1));

        milkTeaDecorator = new SugarDecorator(milkTeaDecorator);
        additiveMoney = additiveMoney.add(milkTeaDecorator.addSomething(1));
        System.out.println("***** bill *****");
        milkTeaDecorator.billPrint();

        System.out.println("添加的价值：" + additiveMoney);

        System.out.println("总价：" + milkTeaDecorator.worth());
    }
}
