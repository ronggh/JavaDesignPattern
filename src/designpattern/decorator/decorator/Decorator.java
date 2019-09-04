package designpattern.decorator.decorator;

import designpattern.decorator.component.Drink;

// 装饰者类 ===> Decorator
// 继承并组合一个Drink
public class Decorator extends Drink {
    // 组合一个Drink
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        // getPrice() 自己的价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        // drink.getDes() 输出被装饰者的信息
        return des + " " + getPrice() + " && " + drink.getDes();
    }
}
