package designpattern.singleton.type2;

public class SingletonTest02 {
    public static void main(String[] args) {
        //测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2); // true
        System.out.println(" instance1.hashCode = " + instance1.hashCode());
        System.out.println(" instance2.hashCode = " + instance2.hashCode());
    }
}
