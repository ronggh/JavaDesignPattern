package designpattern.strategy.improve;

// 策略接口的具体实现 ====> NoFlyBehavior
public class NoFlyBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println(" 不会飞翔  ");
    }
}
