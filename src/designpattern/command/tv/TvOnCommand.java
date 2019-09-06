package designpattern.command.tv;

import designpattern.command.ICommand;

// ConcreteCommand ====> TvOnCommand
public class TvOnCommand implements ICommand {
    // 聚合TVReceiver
    TvReceiver tv;

    // 构造器
    public TvOnCommand(TvReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        tv.on();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        tv.off();
    }
}
