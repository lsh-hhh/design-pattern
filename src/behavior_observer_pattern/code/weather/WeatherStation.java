package behavior_observer_pattern.code.weather;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class WeatherStation implements Weather{

    private double[] temperature;
    private double humidity;
    private boolean rain;

    private List<Observable> listeners = new ArrayList<>();

    public void register(Observable listener) {
        listeners.add(listener);
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

    public void takeData() throws InterruptedException {
        int count = 0;
        while (count < 10) {
            TimeUnit.SECONDS.sleep(10);

            temperature = Simulation.getSimulationTemp();
            humidity = Simulation.getSimulationHumidity();
            rain = new Random().nextDouble() > 0.5;

            count++;
            // 通知所有订阅者
            listeners.forEach(Observable::notifyObservers);
        }
    }

    private static class Simulation {

        private static final double[] lowTemp;
        private static final double[] highTemp;

        static {
            double lowBase = 20;
            double highBase = 30;

            lowTemp = new double[10];
            highTemp = new double[10];

            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                double low = randomV(random, lowBase);
                double high = randomV(random, highBase);

                lowTemp[i] = low;
                highTemp[i] = high;
            }
        }

        private static double randomV(Random random, double base) {
            double v = random.nextDouble() * 10 + base;
            return BigDecimal.valueOf(v).setScale(1, RoundingMode.FLOOR).doubleValue();
        }

        public static double[] getSimulationTemp() {
            Random random = new Random(10);
            int i = random.nextInt();

            return new double[] {lowTemp[i], highTemp[i]};
        }

        public static double getSimulationHumidity() {
            Random random = new Random();
            return random.nextInt(80);
        }
    }
}
