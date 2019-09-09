package designpattern.visitor;

// 具体访问者 ConcreteVisitor ====> Fail
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        //
        System.out.println(" 男人--->" + man.getName() + "给的评价该歌手失败 !");
    }

    @Override
    public void getWomanResult(Woman woman) {
        //
        System.out.println(" 女人-->" + woman.getName() +"给的评价该歌手失败 !");
    }
}
