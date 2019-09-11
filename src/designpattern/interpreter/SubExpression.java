package designpattern.interpreter;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {
    public SubExpression(AbsExpression left, AbsExpression right) {
        super(left, right);
    }

    // 处理相减
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
