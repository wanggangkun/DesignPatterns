package com.kun.builder;

import com.kun.builder.builder.Builder3d;
import com.kun.builder.builder.Builder4d;
import com.kun.builder.builder.BuilderSelf;

/**
 * @author kun
 * @data 2019/3/28 19:02
 */
public class MainTest {
    public static void main(String[] args) {
        Director director = new Director(new Builder4d("2015-12-29"));
        director.construct();
        director.setBuilder(new Builder3d("2015-8-30"));
        director.construct();

        testSelf();
    }
    private static void testSelf(){
        BuilderSelf builder = new BuilderSelf("2015-9-29");
        builder.addTicket("Plane Ticket").addEvent("Fly to Destination").addEvent("Supper").addHotel("Hilton");
        builder.addDay().addTicket("Zoo Ticket").addEvent("Bus to Zoo").addEvent("Feed animals").addHotel("Home Inn");
        builder.addDay();
        builder.addTicket("Beach");
        builder.addEvent("Swimming");
        builder.addHotel("Home Inn");
        builder.addDay().addTicket("Plane Ticket").addEvent("Fly to Home");
        builder.getVocation().showInfo();
    }
}
