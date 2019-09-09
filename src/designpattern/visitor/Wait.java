package designpattern.visitor;

// 具体访问者 ConcreteVisitor ====> Wait
public class Wait extends Action {
    @Override
    public void getManResult(Man man) {
        //
        System.out.println(" 男人==>" + man.getName() +"给的评价是该歌手待定 ..");

    }

    @Override
    public void getWomanResult(Woman woman) {
        //
        System.out.println(" 女人==>" + woman.getName() +"给的评价是该歌手待定 ..");

    }
}
