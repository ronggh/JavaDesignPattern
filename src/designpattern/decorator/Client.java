package designpattern.decorator;

import designpattern.decorator.component.DeCafCoffee;
import designpattern.decorator.component.Drink;
import designpattern.decorator.component.LongBlackCoffee;
import designpattern.decorator.decorator.Chocolate;
import designpattern.decorator.decorator.Milk;

// Client
public class Client {
    public static void main(String[] args) {
        // 装饰者模式下的订单：一份牛奶的LongBlack + 2份巧克力

        // 1. 点一份 LongBlack
        Drink order = new LongBlackCoffee();
        System.out.println("费用 = " + order.cost());
        System.out.println("描述 = " + order.getDes());

        // 2. order 加入一份牛奶
        order = new Milk(order);
        System.out.println("order 加入一份牛奶 费用 = " + order.cost());
        System.out.println("order 加入一份牛奶 描述 = " + order.getDes());

        // 3. order 加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order 加入一份牛奶 加入一份巧克力  费用 = " + order.cost());
        System.out.println("order 加入一份牛奶 加入一份巧克力 描述 = " + order.getDes());

        // 3. order 加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order 加入一份牛奶 加入2份巧克力   费用 = " + order.cost());
        System.out.println("order 加入一份牛奶 加入2份巧克力 描述 = " + order.getDes());

        System.out.println("===========================");

        // 订单2：无因咖啡 + 一份牛奶
        Drink order2 = new DeCafCoffee();
        System.out.println("order2 无因咖啡  费用 = " + order2.cost());
        System.out.println("order2 无因咖啡 描述 = " + order2.getDes());

        order2 = new Milk(order2);
        System.out.println("order2 无因咖啡 加入一份牛奶  费用 = " + order2.cost());
        System.out.println("order2 无因咖啡 加入一份牛奶 描述 = " + order2.getDes());
    }
}
