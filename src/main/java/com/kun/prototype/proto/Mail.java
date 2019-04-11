package com.kun.prototype.proto;

/**
 * @author kun
 * @data 2019/4/8 17:32
 */
public class Mail implements Cloneable{
    private String receiver;
    private String subject;
    private String content;
    private String tail;
    public Mail(EventTemplate et){
        this.tail = et.getEventContent();
        this.subject = et.getEventSubject();
    }
    @Override
    public Mail clone(){
        Mail mail = null;
        try {
            mail = (Mail)super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTail() {
        return tail;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }
}
