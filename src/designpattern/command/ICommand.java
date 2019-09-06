package designpattern.command;

// 命令接口
public interface ICommand {
    //执行动作(操作)
    public void execute();
    //撤销动作(操作)
    public void undo();
}
