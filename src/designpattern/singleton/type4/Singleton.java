package designpattern.singleton.type4;

// 懒汉式(线程安全，同步方法)，！！！可用，但效率低！！！
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    //提供一个静态的公有方法，加入同步处理的代码！！！synchronized！！！，解决线程安全问题
    //即懒汉式
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
