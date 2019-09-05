package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

// Composite ====> University(大学）,可以有多个学院
public class University extends OrganizationComponent{
    // List 中 College
    private List<OrganizationComponent> components = new ArrayList<OrganizationComponent>();

    // 构造器
    public University(String name, String des) {
        super(name, des);
    }

    // 重写add()
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        components.add(organizationComponent);
    }

    // 重写remove()
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        components.remove(organizationComponent);
    }

    // 输出University 包含的学院
    @Override
    protected void show() {
        System.out.println("==" + getName() + "=====================");
        //遍历 organizationComponents
        for (OrganizationComponent component : components) {
            component.show();
        }
    }
}
