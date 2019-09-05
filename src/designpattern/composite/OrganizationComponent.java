package designpattern.composite;

// Component ====> OrganizationComponent,做成抽象类
// Department(系），College（学院），University（大学）都继承自该类
public abstract class OrganizationComponent {
    // 属性
    private String name; // 名字
    private String des; // 说明

    //构造器
    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    // get/set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    // add()默认实现
    protected  void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    // remove()默认实现
    protected  void remove(OrganizationComponent organizationComponent) {
        //
        throw new UnsupportedOperationException();
    }


    //show()方法, 做成抽象的, 子类都需要实现
    protected abstract void show();
}
