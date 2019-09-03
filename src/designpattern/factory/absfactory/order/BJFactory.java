package designpattern.factory.absfactory.order;

import designpattern.factory.absfactory.pizza.BJCheesePizza;
import designpattern.factory.absfactory.pizza.BJPepperPizza;
import designpattern.factory.absfactory.pizza.Pizza;

//这是工厂子类 BJFactory
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        //
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}