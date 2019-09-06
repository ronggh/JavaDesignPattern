package designpattern.proxy.cglib;

// 目标对象
public class TeacherDao {
    public String teach() {
        System.out.println(" 老师授课中  ， 我是cglib代理，不需要实现接口 ");
        return "hello";
    }

    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
