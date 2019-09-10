package designpattern.observer.improve;

import java.util.ArrayList;

// 具体的Subject ====> WeatherDataSubject
public class WeatherDataSubject implements Subject {
    //
    private float temperatrue;
    private float pressure;
    private float humidity;
    //观察者集合
    private ArrayList<Observer> observers;

    //加入新的第三方
    public WeatherDataSubject() {
        observers = new ArrayList<Observer>();
    }

    // 数据变化时，通知所有已注册的观察者
    public void dataChange() {
        //调用 接入方的 update
        notifyObservers();
    }

    //当数据有更新时，就调用 setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息 推送给 接入方 currentConditions
        dataChange();
    }

    //注册一个观察者
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    //移除一个观察者
    @Override
    public void removeObserver(Observer observer) {
        if(observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    //遍历所有的观察者，并通知
    @Override
    public void notifyObservers() {
        for(Observer observer:observers) {
            observer.update(this.temperatrue, this.pressure, this.humidity);
        }
    }
}
