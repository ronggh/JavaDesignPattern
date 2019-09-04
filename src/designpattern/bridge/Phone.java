package designpattern.bridge;

// Abstraction抽象类 ====> Phone
public abstract class Phone {
    //组合品牌
    private IBrand brand;

    //构造器
    public Phone(IBrand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }
    protected void close() {
        brand.close();
    }
    protected void call() {
        brand.call();
    }
}
