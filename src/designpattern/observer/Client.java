package designpattern.observer;

public class Client {
    public static void main(String[] args) {
        //创建接入方 currentCondition
        CurrentCondition currentCondition = new CurrentCondition();
        //创建 WeatherDataSubject 并将 接入方 currentConditions 传递到 WeatherData中
        WeatherData weatherData = new WeatherData(currentCondition);

        //更新天气情况
        weatherData.setData(30, 150, 40);

        //天气情况变化
        System.out.println("============天气情况变化=============");
        weatherData.setData(40, 160, 20);
    }
}
