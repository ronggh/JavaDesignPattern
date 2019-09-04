package designpattern.decorator.decorator;

import designpattern.decorator.component.Drink;

// 具体的Decorator(这里就是调味品) ===> Soy
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDes(" 豆浆  ");
        setPrice(1.5f);
    }
}
