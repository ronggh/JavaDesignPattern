package designpattern.iterator;

import java.util.Iterator;
import java.util.List;

public class University {
    //学院集合
    private  List<College> collegeList;

    // 构造器
    public University(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //遍历所有学院,然后调用printDepartment 输出各个学院的系
    public void printCollege() {
        //从collegeList 取出所有学院, Java 中的 List 已经实现Iterator
        Iterator<College> iterator = collegeList.iterator();

        while(iterator.hasNext()) {
            //取出一个学院
            College college = iterator.next();
            System.out.println("=== "+college.getName() +"=====" );
            college.printDepartment(college.createIterator()); //得到对应迭代器
        }
    }
}
