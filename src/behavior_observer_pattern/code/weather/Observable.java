package behavior_observer_pattern.code.weather;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    private List<Observer> observers = new ArrayList<>();

    public void register(Observer o) {
        observers.add(o);
    }

    public Observer remove(Observer o) {
        boolean remove = observers.remove(o);
        return o;
    }

    public void notifyObservers(double[] temperature, double humidity, boolean rain) {
        observers.forEach(o -> o.notifyNew(temperature, humidity, rain));
    }
}
