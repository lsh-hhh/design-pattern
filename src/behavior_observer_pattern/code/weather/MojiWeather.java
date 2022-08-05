package behavior_observer_pattern.code.weather;

public class MojiWeather implements Observer, Weather{

    private double[] temperature;
    private double humidity;
    private boolean rain;

    @Override
    public void notifyNew(double[] temperature, double humidity, boolean rain) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.rain = rain;

        System.out.println("moji天气~");
        String weather = rain? "下雨，出门请记得带伞" : "多云";
        System.out.printf("今天%s \n", weather);
        System.out.printf("气温%s℃ ~ %s℃\n", temperature[0], temperature[1]);
        System.out.printf("空气湿度为：%s ", humidity);
        System.out.println("\n");
    }

    @Override
    public double[] getTemperature() {
        return temperature;
    }

    @Override
    public double getHumidity() {
        return humidity;
    }

    @Override
    public boolean isRain() {
        return rain;
    }
}
