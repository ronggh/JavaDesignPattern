package designpattern.observer.improve;

// 具体观察者 ====> CurrentConditionObserver
public class CurrentConditionObserver implements Observer {
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
    // 显示
    public void display() {
        System.out.println("***Today Temperature: " + temperature + "***");
        System.out.println("***Today Pressure: " + pressure + "***");
        System.out.println("***Today Humidity: " + humidity + "***");
    }
}
