package designpattern.mediator;

//具体的同事类 ====> CurtainColleague
public class CurtainColleague extends Colleague {
    //构造器
    public CurtainColleague(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void upCurtains() {
        System.out.println("I am holding up curtains!");
    }
}
