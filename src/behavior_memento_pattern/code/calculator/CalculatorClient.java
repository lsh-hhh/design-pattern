package behavior_memento_pattern.code.calculator;

import behavior_memento_pattern.code.calculator.command.AbstractCommand;
import behavior_memento_pattern.code.calculator.command.AddCommand;
import behavior_memento_pattern.code.calculator.command.MultiplyCommand;
import behavior_memento_pattern.code.calculator.command.SubtractCommand;
import behavior_memento_pattern.code.calculator.memento.CommandCareTaker;

public class CalculatorClient {

    public static void main(String[] args) {

        CommandCareTaker commandCareTaker = new CommandCareTaker();

        Calculator calculator = new Calculator();

        int x = 5, y = 6;
        Integer add = calculator.add(x, y, commandCareTaker);
        System.out.println("x + y = " + x + " + " + y + " = " + add);

        x = 55;
        Integer sub = calculator.sub(x, y, commandCareTaker);
        System.out.println("x - y = " + x +  " - " + y + " = " + sub);

        x = 66;
        sub = calculator.sub(x, y, commandCareTaker);
        System.out.println("x - y = " + x +  " - " + y + " = " + sub);

        calculator.restore(commandCareTaker.popMemento());
        System.out.println(calculator);
        System.out.println();

        calculator.restore(commandCareTaker.popMemento());
        System.out.println(calculator);
        System.out.println();

        calculator.execute(x, y, new AddCommand(calculator));
        System.out.println(calculator);
        System.out.println();

        calculator.execute(x, y, new SubtractCommand(calculator));
        System.out.println(calculator);
        System.out.println();

        calculator.execute(x, y, new MultiplyCommand(calculator));
        System.out.println(calculator);
        System.out.println();

    }
}
