package designpattern.strategy.improve;

// 聚合策略接口的抽象类 ====> AbsDuck
public abstract class AbsDuck {
    //属性, 策略接口
    IFlyBehavior flyBehavior;
    //其它属性，策略接口
    IQuackBehavior quackBehavior;

    public AbsDuck() {
    }

    public abstract void display();//显示鸭子信息

    public void quack() {
        System.out.println("鸭子嘎嘎叫~~");
    }

    public void swim() {
        System.out.println("鸭子会游泳~~");
    }

    public void fly() {
        //改进
        if(flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
