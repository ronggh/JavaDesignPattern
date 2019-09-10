package designpattern.mediator;

//具体的同事类 ====> TvColleague
public class TvColleague extends Colleague {
    //构造器
    public TvColleague(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void startTv() {
        System.out.println("It's time to Start Tv!");
    }

    public void stopTv() {
        System.out.println("Stop Tv!");
    }
}
