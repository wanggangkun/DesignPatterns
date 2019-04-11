package com.kun.interpreter.cls;

/**
 * @author kun
 * @data 2019/4/2 17:23
 */
public abstract class SymbolExpression extends AbstractExpression{
    protected AbstractExpression left;
    protected AbstractExpression right;
    public SymbolExpression(AbstractExpression left, AbstractExpression right){
        this.left = left;
        this.right = right;
    }
}
