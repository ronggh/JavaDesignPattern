package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

// Composite ====> College(学院），可以有多个系
public class College extends OrganizationComponent {
    //List 中 存放的Department
    private List<OrganizationComponent> components = new ArrayList<OrganizationComponent>();

     // 构造器
    public College(String name, String des) {
        super(name, des);
    }

    // 重写add(),remove()方法
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        components.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        components.remove(organizationComponent);
    }

    // College 包含的Department
    @Override
    protected void show() {
        System.out.println("----" + getName() + "-----------------");
        //遍历 organizationComponents
        for (OrganizationComponent component : components) {
            component.show();
        }
    }
}
