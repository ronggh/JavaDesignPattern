package designpattern.bridge;

// RefinedAbstraction ===> UpRightPhone
public class UpRightPhone extends Phone {
    public UpRightPhone(IBrand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println(" 直立样式手机 ");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println(" 直立样式手机 ");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println(" 直立样式手机 ");
    }
}
