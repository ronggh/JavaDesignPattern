package designpattern.singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("懒汉式1 ， 线程不安全~");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2); // true
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());

        // 多线程

    }
}
