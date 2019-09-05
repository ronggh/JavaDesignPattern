package designpattern.facade;

import designpattern.facade.subsystem.*;

// Facade
public class Facade {
    //定义各个子系统对象
    private TheaterLight theaterLight;
    private PopCorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DvdPlayer dvdPlayer;


    //构造器
    public Facade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = PopCorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DvdPlayer.getInstanc();
    }

    //操作分成 4 步
    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
