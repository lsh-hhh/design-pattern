package behavior_observer_pattern.code.weather;

public interface Weather {

    double[] getTemperature();

    double getHumidity();

    boolean isRain();
}
