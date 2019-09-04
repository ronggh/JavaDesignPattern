package designpattern.decorator.decorator;

import designpattern.decorator.component.Drink;

// 具体的Decorator(这里就是调味品) ===> Chocolate
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }
}
