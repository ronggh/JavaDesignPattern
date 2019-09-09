package designpattern.iterator;

import java.util.Iterator;
import java.util.List;

// 具体的迭代器 ====> InfoColleageIterator
public class InfoColleageIterator implements Iterator {
    // 假定：信息工程学院是以List方式存放系
    List<Department> departmentList;
    int index = -1;//索引

    // 构造器
    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //判断list中还有没有下一个元素
    @Override
    public boolean hasNext() {
        if(index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    //空实现
    @Override
    public void remove() {

    }
}
