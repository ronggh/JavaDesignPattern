package designpattern.mediator;

// Client
public class Client {
    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建Alarm 并且加入到  ConcreteMediator 对象的HashMap
        AlarmColleague alarm = new AlarmColleague(mediator, "alarm");

        //创建了CoffeeMachine 对象，并  且加入到  ConcreteMediator 对象的HashMap
        CoffeeMachineColleague coffeeMachine = new CoffeeMachineColleague(mediator,
                "coffeeMachine");

        //创建 Curtains , 并  且加入到  ConcreteMediator 对象的HashMap
        CurtainColleague curtain = new CurtainColleague(mediator, "curtain");
        TvColleague tV = new TvColleague(mediator, "TV");

        //让闹钟发出消息
        alarm.sendAlarm(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
    }
}
