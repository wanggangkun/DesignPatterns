package com.kun.flyweight.fly;

import java.util.HashMap;

/**
 * @author kun
 * @data 2019/4/3 17:21
 */
class PlantFactory {
    private HashMap<Integer, AbstractPlant> plantHashMap = new HashMap<Integer, AbstractPlant>();
    PlantFactory(){

    }
    AbstractPlant getPlant(int type){
        if (!plantHashMap.containsKey(type)){
            switch (type){
                case 0:
                    plantHashMap.put(0, new Tree());
                    break;
                case 1:
                    plantHashMap.put(1, new Grass());
                    break;
                default:
            }
        }
        return plantHashMap.get(type);
    }
}
