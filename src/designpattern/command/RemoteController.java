package designpattern.command;

public class RemoteController {
    // 按钮的命令数组
    ICommand[] onCommands;
    ICommand[] offCommands;

    // 执行撤销的命令
    ICommand undoCommand;

    // 构造器，完成对按钮初始化
    public RemoteController() {

        onCommands = new ICommand[5];
        offCommands = new ICommand[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    // 给按钮设置需要的命令
    public void setCommand(int no, ICommand onCommand, ICommand offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    // 按下开按钮
    public void onButtonWasPushed(int no) {
        // 找到按下的开的按钮， 并调用对应方法
        onCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = onCommands[no];

    }

    // 按下关按钮
    public void offButtonWasPushed(int no) { // no 0
        // 找到按下的关的按钮， 并调用对应方法
        offCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = offCommands[no];

    }

    // 按下撤销按钮
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
