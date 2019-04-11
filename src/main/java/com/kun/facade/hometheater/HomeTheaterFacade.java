package com.kun.facade.hometheater;

/**
 * @author kun
 * @data 2019/3/17 16:00
 */
public class HomeTheaterFacade {
    private TheaterLights theaterLights;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DvdPlayer dvdPlayer;
    public HomeTheaterFacade(){
        theaterLights = TheaterLights.getInstance();
        popcorn = Popcorn.getInstance();
        stereo = Stereo.getInstance();
        projector = Projector.getInstance();
        screen = Screen.getInstance();
        dvdPlayer = DvdPlayer.getInstance();
    }
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        dvdPlayer.setDvd();
        theaterLights.dim(10);
    }
    public void end(){
        popcorn.off();
        theaterLights.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.setDvd();
        dvdPlayer.off();
    }
    public void play(){
        dvdPlayer.play();
    }
    public void pause(){
        dvdPlayer.pause();
    }
}
