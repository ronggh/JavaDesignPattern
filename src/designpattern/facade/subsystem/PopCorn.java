package designpattern.facade.subsystem;

// PopCorn
public class PopCorn {
    //
    private static PopCorn instance = new PopCorn();

    public static PopCorn getInstance() {
        return instance;
    }

    // PopCorn的各类操作
    public void on() {
        System.out.println(" popcorn on ");
    }

    public void off() {
        System.out.println(" popcorn ff ");
    }

    public void pop() {
        System.out.println(" popcorn is poping  ");
    }
}
