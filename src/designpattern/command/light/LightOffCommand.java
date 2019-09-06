package designpattern.command.light;

import designpattern.command.ICommand;

public class LightOffCommand implements ICommand {
    // 聚合LightReceiver
    LightReceiver light;

    // 构造器
    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        light.off();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        light.on();
    }
}
