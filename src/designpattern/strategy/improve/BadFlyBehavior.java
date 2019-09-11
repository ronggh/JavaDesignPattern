package designpattern.strategy.improve;

// 策略接口的具体实现 ====> BadFlyBehavior
public class BadFlyBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println(" 飞翔技术一般 ");
    }
}
