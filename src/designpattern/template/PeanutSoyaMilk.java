package designpattern.template;

// 具体实现现 ====> PeanutSoyaMilk
public class PeanutSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println(" 加入上好的花生 ");
    }
}
