package com.kun.facade;

import com.kun.facade.hometheater.HomeTheaterFacade;

/**
 * @author kun
 * @data 2019/3/17 16:05
 */
public class MainTest {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
    }
}
