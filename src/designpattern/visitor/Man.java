package designpattern.visitor;

// 具体  ConcreteElement ====> Man
public class Man extends Person {
    // 构造器
    public Man(String name) {
        super(name);
    }

    @Override
    public void accept(Action action) {
        //判断是否已评价过
        if (!isHasRated()) {
            action.getManResult(this);
            this.setHasRated(true);
        }
    }
}
