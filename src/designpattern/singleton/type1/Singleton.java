package designpattern.singleton.type1;

// 饿汉式(静态变量),！！！可用，但可能浪费内存！！！
public class Singleton {
    //1. 构造器私有化, 外部能new
    private Singleton() {
    }

    //2.本类内部创建对象实例！！！private final static！！！
    private final static Singleton instance = new Singleton();

    //3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
