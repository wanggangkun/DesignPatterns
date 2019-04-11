package com.kun.interpreter.cls;

import java.util.HashMap;

/**
 * @author kun
 * @data 2019/4/2 17:19
 */
public abstract class AbstractExpression {
    /**
     * 解释
     * @param var 数据
     * @return 数据
     */
    public abstract Float interpreter(HashMap<String, Float> var);
}
