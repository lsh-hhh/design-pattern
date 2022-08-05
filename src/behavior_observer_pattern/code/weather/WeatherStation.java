package behavior_observer_pattern.code.weather;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class WeatherStation extends Observable implements Weather{

    private double[] temperature;
    private double humidity;
    private boolean rain;

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

    public void takeData() {
        new Thread(() -> {
            try {
                extracted();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    private void extracted() throws InterruptedException {
        int count = 0;
        while (count < 10) {
            System.out.println(" ******  " + (count + 1) + "  ****** ");
            temperature = Simulation.getSimulationTemp();
            humidity = Simulation.getSimulationHumidity();
            rain = new Random().nextDouble() > 0.5;

            count++;
            // 通知所有订阅者
            notifyObservers(temperature, humidity, rain);

            TimeUnit.SECONDS.sleep(5);
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
            Random random = new Random();
            int i = random.nextInt(10);

            return new double[] {lowTemp[i], highTemp[i]};
        }

        public static double getSimulationHumidity() {
            Random random = new Random();
            return random.nextInt(80);
        }
    }
}
