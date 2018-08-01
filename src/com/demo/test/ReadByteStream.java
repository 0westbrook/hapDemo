package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadByteStream {
    public static void main(String[] args) {
        try {
            FileInputStream is = new FileInputStream("test.txt");
            byte input[] = new byte[22];
            is.read(input);
            String inputString = new String(input);
            System.out.println(inputString);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
