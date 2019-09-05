package designpattern.composite;

// 叶子节点 ====> Department(系）
public class Department extends OrganizationComponent {
    // 构造器
    public Department(String name, String des) {
        super(name, des);
    }

    //add , remove 就不用写了，因为他是叶子节点

    @Override
    protected void show() {
        System.out.println("\t" + getName());
    }
}
