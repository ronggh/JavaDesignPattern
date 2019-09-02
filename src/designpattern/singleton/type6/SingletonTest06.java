package designpattern.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2); // true
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

    }
}
