package designpattern.observer;

/**
 * 1. 包含最新的天气情况信息
 * 2. 含有 CurrentCondition对象
 * 3. 当数据有更新时，就主动的调用
 *  CurrentCondition对象update方法(含 display), 这样他们（接入方）就看到最新的信息
 *
 */
public class WeatherData {
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;
    //
    private CurrentCondition currentCondition;

    // 构造器
    public WeatherData(CurrentCondition currentConditions) {
        this.currentCondition = currentConditions;
    }

    //
    public void dataChange() {
        //调用接入方的
        currentCondition.update(temperature,pressure,humidity);
    }

    //当数据有更新时，就调用 setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        //调用dataChange， 将最新的信息 推送给 接入方 currentCondition
        dataChange();
    }
}
