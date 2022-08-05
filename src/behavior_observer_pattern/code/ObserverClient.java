package behavior_observer_pattern.code;

import behavior_observer_pattern.code.weather.MojiWeather;
import behavior_observer_pattern.code.weather.WeatherStation;
import behavior_observer_pattern.code.weather.XiaomiWeather;

public class ObserverClient {

    public static void main(String[] args) throws InterruptedException {
        WeatherStation weatherStation = new WeatherStation();

        MojiWeather mojiWeather = new MojiWeather();
        XiaomiWeather xiaomiWeather = new XiaomiWeather();
        weatherStation.register(mojiWeather);
        weatherStation.register(xiaomiWeather);

        weatherStation.takeData();

    }
}
