package designpattern.singleton.type5;

public class SingletonTest05 {
    public static void main(String[] args) {
        System.out.println("同步代码块，不推荐使用，不有保证单例");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2); // true
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }

}
