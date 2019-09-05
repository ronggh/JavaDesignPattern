package designpattern.facade.subsystem;

// Screen
public class Screen {
    //
    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    // Screen的各类操作
    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }
}
