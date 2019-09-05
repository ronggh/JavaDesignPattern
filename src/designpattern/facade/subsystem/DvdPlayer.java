package designpattern.facade.subsystem;

//使用单例模式, 使用饿汉式
public class DvdPlayer {
    //
    private static DvdPlayer instance = new DvdPlayer();

    public static DvdPlayer getInstanc() {
        return instance;
    }

    // Dvd Player的各类操作
    public void on() {
        System.out.println(" dvd on ");
    }
    public void off() {
        System.out.println(" dvd off ");
    }

    public void play() {
        System.out.println(" dvd is playing ");
    }
    public void pause() {
        System.out.println(" dvd pause ..");
    }
}
