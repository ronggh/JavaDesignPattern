package designpattern.iterator;

import java.util.Iterator;

// 统一的访问接口 ====> College
public abstract class College {
    public abstract String getName();

    //增加系的方法
    public abstract void addDepartment(String name, String desc);

    //返回一个迭代器,遍历
    public abstract Iterator createIterator();

    //输出 学院输出 系
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
