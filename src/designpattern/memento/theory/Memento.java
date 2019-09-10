package designpattern.memento.theory;

// 备忘录对象 ====> Memento
public class Memento {
    // 状态
    private String state;

    //构造器
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
