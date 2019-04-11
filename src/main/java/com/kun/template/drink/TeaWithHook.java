package com.kun.template.drink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kun
 * @data 2019/3/18 17:32
 */
public class TeaWithHook extends AbstractHotDrinkTemplate {
    @Override
    public void brew(){
        System.out.println("Brewing tea");
    }
    @Override
    public void addCondiments(){
        System.out.println("Adding lemon");
    }

    @Override
    public boolean wantCondimentsHook() {
        System.out.println("Condiments yes or no? Please input(y/n):");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {
            result = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return !"n".equals(result);
    }
}
