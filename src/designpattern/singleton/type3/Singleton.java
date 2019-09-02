package designpattern.singleton.type3;

// 线程不安全懒汉式，！！！不能用！！！
// ！！！在多线程环境中可能会失败！！！
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    //提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    //即懒汉式
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
