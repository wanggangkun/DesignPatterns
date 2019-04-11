package com.kun.decorator.iodecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author kun
 * @data 2019/3/7 21:18
 */
public class UpperCaseInputStream extends FilterInputStream {

    UpperCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException{
        int c = super.read();
        return c == -1 ? c: Character.toUpperCase((char)c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for(int i=0; i<result; i++){
            b[i] = (byte)Character.toUpperCase((char)(b[i]));
        }
        return result;
    }
}
