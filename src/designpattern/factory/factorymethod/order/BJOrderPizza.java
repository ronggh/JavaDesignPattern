package designpattern.factory.factorymethod.order;

import designpattern.factory.factorymethod.pizza.BJCheesePizza;
import designpattern.factory.factorymethod.pizza.BJPepperPizza;
import designpattern.factory.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        //
        return pizza;
    }

}