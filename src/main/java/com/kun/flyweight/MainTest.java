package com.kun.flyweight;

import com.kun.flyweight.fly.PlantManager;

/**
 * @author kun
 * @data 2019/4/3 17:30
 */
public class MainTest {
    public static void main(String[] args) {
        shoeMemInfo();
        PlantManager plantManager;
        plantManager = new PlantManager();
        shoeMemInfo();
        plantManager.displayTrees();
        shoeMemInfo();
    }
    private static void shoeMemInfo(){
        long free = Runtime.getRuntime().freeMemory();
        long total = Runtime.getRuntime().totalMemory();
        long max = Runtime.getRuntime().maxMemory();
        long used = total - free;
        System.out.println("最大内存=" + max);
        System.out.println("已分配内存=" + total);
        System.out.println("已分配内存中的剩余空间=" + free);
        System.out.println("已用空间=" + used);
        System.out.println("时间=" + System.currentTimeMillis());
        System.out.println();
    }
}
