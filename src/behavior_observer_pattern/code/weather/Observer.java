package behavior_observer_pattern.code.weather;

public interface Observer {

    void notifyNew(double[] temperature, double humidity, boolean rain);
}
