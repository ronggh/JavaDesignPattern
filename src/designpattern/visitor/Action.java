package designpattern.visitor;

// 抽象访问者Visitor ====> Action
public abstract class Action {
    //得到男性的测评
    public abstract void getManResult(Man man);

    //得到女的测评
    public abstract void getWomanResult(Woman woman);
}
