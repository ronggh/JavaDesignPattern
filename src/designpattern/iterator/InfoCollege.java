package designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 具体的聚合类 ====> InfoCollege
public class InfoCollege extends College{
    private List<Department> departmentList;

    public InfoCollege() {
        this.departmentList = new ArrayList<>();
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(departmentList);
    }
}
