package designpattern.observer.improve;

// 客户端====> Client
public class Client {
    public static void main(String[] args) {
        //创建一个WeatherData
        WeatherDataSubject weatherData = new WeatherDataSubject();

        //创建观察者
        Observer currentCondition = new CurrentConditionObserver();
        Observer baiduSite = new BaiduSiteObserver();

        //注册到weatherData
        weatherData.registerObserver(currentCondition);
        weatherData.registerObserver(baiduSite);

        //测试
        System.out.println("通知各个注册的观察者, 看看信息");
        weatherData.setData(10f, 100f, 30.3f);


        weatherData.removeObserver(currentCondition);
        //测试
        System.out.println();
        System.out.println("通知各个注册的观察者, 看看信息");
        weatherData.setData(10f, 100f, 30.3f);
    }
}
