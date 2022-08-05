package behavior_observer_pattern.code.java;

import java.util.Observable;
import java.util.Observer;

public class CustomerA implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("\n");
        System.out.println(this.getClass().getSimpleName());
        System.out.println(arg);
    }
}
