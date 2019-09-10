package designpattern.observer.improve;

// 抽象观察者接口 ====> Observer
public interface Observer {
    public void update(float temperature, float pressure, float humidity);
}
