package designpattern.strategy.improve;

// 策略接口的具体实现 ====> GoodFlyBehavior
public class GoodFlyBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println(" 飞翔技术高超 ~~~");
    }
}
