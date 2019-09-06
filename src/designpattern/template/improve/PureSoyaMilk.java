package designpattern.template.improve;

// 含有钩子实现的模板方法
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        //空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
