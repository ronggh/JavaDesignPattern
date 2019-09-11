package designpattern.strategy.improve;

// WildDuck的具体实现类 ====> WildDuck
public class WildDuck extends AbsDuck {
    //构造器，传入IFlyBehavor 的对象
    public  WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println(" 这是野鸭 ");
    }
}
