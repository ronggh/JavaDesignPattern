package designpattern.visitor;

// 具体访问者 ConcreteVisitor ====> Success
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        //
        System.out.println(" 男人：" + man.getName() + "给的评价该歌手很成功 !");
    }

    @Override
    public void getWomanResult(Woman woman) {
        //
        System.out.println(" 女人:"  + woman.getName() + "给的评价该歌手很成功 !");
    }
}
