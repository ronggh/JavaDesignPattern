package designpattern.decorator.component;

// 各个单品咖啡的共同特征
public class Coffee extends Drink {
    @Override
    // 各个单品咖啡的价格
    public float cost() {
        return super.getPrice();
    }
}
