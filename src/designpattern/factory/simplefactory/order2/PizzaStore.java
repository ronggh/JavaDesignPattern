package designpattern.factory.simplefactory.order2;

public class PizzaStore {
    public static void main(String[] args) {
        //使用简单工厂模式1
//        new OrderPizza1(new SimpleFactory());
//        System.out.println("~~退出程序~~");

        //使用简单工厂模式2
        new OrderPizza2();
    }
}
