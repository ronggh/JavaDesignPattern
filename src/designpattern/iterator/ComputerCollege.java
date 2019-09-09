package designpattern.iterator;

import java.util.Iterator;

// 具体的聚合类 ====> ComputerCollege
public class ComputerCollege extends College{
    private Department[] departments; // 保存系的数组
    private int numOfDepartment = 0 ;// 保存当前数组的对象个数

    public ComputerCollege(int size) {
        this.departments = new Department[size];
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment++] = department;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
