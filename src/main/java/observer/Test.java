package observer;

import java.io.FilterOutputStream;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-01-25
 * @time 16:24
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionDisplay(weatherData);
        new PressureDisplay(weatherData);
        weatherData.setMeasurements(1,1,1);

    }
}
