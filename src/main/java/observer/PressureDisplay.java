package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-01-25
 * @time 16:30
 */
public class PressureDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float pressure;

    public PressureDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("气压公告牌通知\n当前气压 ：" + pressure);
    }
}
