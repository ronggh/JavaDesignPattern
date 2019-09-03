package designpattern.factory.factorymethod.order;

import designpattern.factory.factorymethod.pizza.LDCheesePizza;
import designpattern.factory.factorymethod.pizza.LDPepperPizza;
import designpattern.factory.factorymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        //
        return pizza;
    }
}