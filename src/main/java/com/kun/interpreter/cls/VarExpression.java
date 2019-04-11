package com.kun.interpreter.cls;

import java.util.HashMap;

/**
 * @author kun
 * @data 2019/4/2 17:21
 */
public class VarExpression extends AbstractExpression {
    private String key;
    public VarExpression(String key){
        this.key = key;
    }
    @Override
    public Float interpreter(HashMap<String, Float> var) {
        return var.get(this.key);
    }
}
