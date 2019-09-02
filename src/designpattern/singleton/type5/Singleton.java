package designpattern.singleton.type5;

// 懒汉式(线程安全，同步代码块，！！！不能使用！！！)
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    //同时保证了效率, 推荐使用

    public static Singleton getInstance() {
        if(instance == null) {
            //
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }

        return instance;
    }
}
