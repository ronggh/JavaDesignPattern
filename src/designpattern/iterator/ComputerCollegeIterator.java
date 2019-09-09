package designpattern.iterator;


import java.util.Iterator;

// 具体的迭代器 ====> ComputerCollegeIterator
public class ComputerCollegeIterator implements Iterator {
    // 计算机学院以数组方式保存系
    Department[] departments;
    int position = 0; //遍历的位置

    // 构造器
    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断是否还有下一个元素
    @Override
    public boolean hasNext() {
        if(position >= departments.length || departments[position] == null) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position++];
        return department;
    }

    //删除的方法，默认空实现
    @Override
    public void remove() {

    }
}
