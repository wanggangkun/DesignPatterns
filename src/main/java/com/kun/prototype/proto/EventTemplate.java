package com.kun.prototype.proto;

/**
 * @author kun
 * @data 2019/4/8 17:33
 */
public class EventTemplate {
    private String eventSubject, eventContent;
    public EventTemplate(String eventSubject, String eventContent){
        this.eventSubject = eventSubject;
        this.eventContent = eventContent;
    }
    String getEventSubject(){
        return eventSubject;
    }
    String getEventContent(){
        return eventContent;
    }
}
