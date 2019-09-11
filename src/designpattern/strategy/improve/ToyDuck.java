package designpattern.strategy.improve;

// ToyDuck的具体实现类 ====> ToyDuck
public class ToyDuck extends AbsDuck {
    //
    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }
}
