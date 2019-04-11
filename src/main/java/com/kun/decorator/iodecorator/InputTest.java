package com.kun.decorator.iodecorator;

import java.io.*;

/**
 * @author kun
 * @data 2019/3/7 21:28
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("D:\\MyJavaWorkSpace\\designPatterns\\src\\main\\resources\\test.txt")));
            while ((c=in.read())>=0){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
