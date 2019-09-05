package designpattern.facade.subsystem;

// TheaterLight
public class TheaterLight {
    //
    private static TheaterLight instance = new TheaterLight();
    public static TheaterLight getInstance() {
        return instance;
    }

    // TheaterLight的各类操作
    public void on() {
        System.out.println(" TheaterLight on ");
    }

    public void off() {
        System.out.println(" TheaterLight off ");
    }

    public void dim() {
        System.out.println(" TheaterLight dim.. ");
    }

    public void bright() {
        System.out.println(" TheaterLight bright.. ");
    }
}
