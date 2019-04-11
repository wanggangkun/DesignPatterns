package com.kun.interpreter.cls;

import java.util.HashMap;

/**
 * @author kun
 * @data 2019/4/2 17:25
 */
public class MultiExpression extends SymbolExpression{
    public MultiExpression(AbstractExpression left, AbstractExpression right){
        super(left, right);
    }
    @Override
    public Float interpreter(HashMap<String, Float> var) {
        return super.left.interpreter(var) * super.right.interpreter(var);
    }
}
