package designpattern.proxy.staticproxy;

// 客户端 ====> Client
public class Client {
    public static void main(String[] args) {
        // 1. 创建目标对象(被代理对象)
        TeacherDao teacherDao = new TeacherDao();
        // 不直接调用TeacherDao的方法
        // teacherDao.teach();

        //2. 创建代理对象, 同时将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        // 3. 通过代理对象，调用到被代理对象的方法
        // 即：执行的是代理对象的方法，代理对象再去调用目标对象的方法
        // 可以在代理对象方法中增加功能
        teacherDaoProxy.teach();
    }
}
