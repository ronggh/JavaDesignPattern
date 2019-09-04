package designpattern.decorator.decorator;

import designpattern.decorator.component.Drink;

// 具体的Decorator(这里就是调味品) ===> Chocolate
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDes(" 巧克力 ");
        setPrice(3.0f); // 调味品 的价格
    }
}
