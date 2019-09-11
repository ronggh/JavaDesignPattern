package designpattern.interpreter;

import java.util.HashMap;

// NonTerminalExpression ====> SymbolExpression
// 抽象运算符号解析器 这里，每个运算符号，都只和自己左右两个数字有关系，
// 但左右两个数字有可能也是一个解析的结果，无论何种类型，都是AbsExpression类的实现类
public class SymbolExpression extends AbsExpression {
    //
    protected AbsExpression left;
    protected AbsExpression right;

    //
    public SymbolExpression(AbsExpression left, AbsExpression right) {
        this.left = left;
        this.right = right;
    }

    //因为 SymbolExpression 是让其子类来实现，因此 interpreter 是一个默认实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
