package designpattern.memento.theory;

import java.util.ArrayList;
import java.util.List;

// 守护者对象 ====> Caretaker
public class Caretaker {
    //在List 集合中会有很多的备忘录对象
    private List<Memento> mementoList = new ArrayList<Memento>();

    // 添加方法
    public void add(Memento memento) {
        mementoList.add(memento);
    }

    //获取到第index个Originator 的 备忘录对象(即保存状态)
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
