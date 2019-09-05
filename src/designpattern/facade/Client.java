package designpattern.facade;

// Client
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        // 调用
        facade.ready();
        facade.play();
        facade.end();
    }
}
