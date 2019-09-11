package designpattern.interpreter;

import java.util.HashMap;

// 加法解释器
public class AddExpression extends SymbolExpression {
    public AddExpression(AbsExpression left, AbsExpression right) {
        super(left, right);
    }

    //处理相加
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
