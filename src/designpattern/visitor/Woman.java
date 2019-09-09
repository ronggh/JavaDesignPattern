package designpattern.visitor;

// ConcreteElement ====> Woman
public class Woman extends Person {
    // 构造器
    public Woman(String name) {
        super(name);
    }

    @Override
    public void accept(Action action) {
        // 判断是否已评价过
        if (!isHasRated()) {
            action.getWomanResult(this);
            this.setHasRated(true);
        }
    }
}
