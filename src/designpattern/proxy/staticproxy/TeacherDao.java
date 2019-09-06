package designpattern.proxy.staticproxy;

// 目标对象 ====> TeacherDao
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println(" 老师授课中  。。。。。");
    }
}
