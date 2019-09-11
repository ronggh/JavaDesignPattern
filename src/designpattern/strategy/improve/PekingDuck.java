package designpattern.strategy.improve;

// PekingDuck 的具体实现类 ====> PekingDuck
public class PekingDuck extends AbsDuck {
    //假如北京鸭可以飞翔，但是飞翔技术一般
    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("~~北京鸭~~~");
    }
}
