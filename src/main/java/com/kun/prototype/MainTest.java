package com.kun.prototype;

import com.kun.prototype.proto.EventTemplate;
import com.kun.prototype.proto.Mail;

import java.util.Random;

/**
 * @author kun
 * @data 2019/4/8 17:38
 */
public class MainTest {
    public static void main(String[] args) {
        int i = 0;
        int maxCount = 10;
        EventTemplate et = new EventTemplate("9月份信用卡账单", "国庆抽奖活动...");
        Mail mail = new Mail(et);
        while (i < maxCount){
            Mail cloneMail = mail.clone();
            cloneMail.setContent(getRandString(5) + ",先生（女士）:你的信用卡账单..." + mail.getTail());
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            sendMail(cloneMail);
            i++;
        }
    }

    private static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t内容："
            + mail.getContent() + "\t...发送成功");
    }

    private static String getRandString(int maxLength){
        String source = "abcdefghijklmnopqrstuvwxyzABCDDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        for (int i=0; i<maxLength; i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }

}
