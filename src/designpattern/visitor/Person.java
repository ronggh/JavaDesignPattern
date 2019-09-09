package designpattern.visitor;

// 抽象元素数据 Element ====> Person
public abstract class Person {
    // 姓名
    private String name;
    // 是否已评价过
    private boolean hasRated;

    // 构造器
    public Person(String name) {
        this.name = name;
    }

    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);

    //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasRated() {
        return hasRated;
    }

    public void setHasRated(boolean hasRated) {
        this.hasRated = hasRated;
    }
}
