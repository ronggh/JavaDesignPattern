package designpattern.mediator;

// 抽象的同事类 ====> Colleague
public abstract class Colleague {
    // 持有一个媒介者对象
    private Mediator mediator;
    public String name;

    // 构造器
    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);
}
