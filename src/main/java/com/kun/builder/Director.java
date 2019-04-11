package com.kun.builder;

import com.kun.builder.builder.AbstractBuilder;

/**
 * @author kun
 * @data 2019/3/28 19:00
 */
class Director {
    private AbstractBuilder builder;
    Director(AbstractBuilder builder){
        this.builder = builder;
    }
    void setBuilder(AbstractBuilder builder){
        this.builder = builder;
    }
    void construct(){
        builder.buildVacation();
        builder.getVocation().showInfo();
    }
}
