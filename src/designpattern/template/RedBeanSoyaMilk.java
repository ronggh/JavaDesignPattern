package designpattern.template;

// 具体实现现 ====> RedBeanSoyaMilk
public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println(" 加入上好的红豆 ");
    }
}
