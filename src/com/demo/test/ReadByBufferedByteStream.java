package com.demo.test;

import java.io.*;

public class ReadByBufferedByteStream {
    public static void main(String[] args) {
        try {
            FileInputStream is = new FileInputStream("movie.mp4");
            BufferedInputStream bis = new BufferedInputStream(is);
            FileOutputStream os = new FileOutputStream("new_movie.mp4");
            BufferedOutputStream bos = new BufferedOutputStream(os);

            byte[] input = new byte[100];
            int count = 0;
            long before = System.currentTimeMillis();
            while ((bis.read(input)) != -1){
                bos.write(input);
                count ++;
            }
            bos.close();
            os.close();
            bis.close();
            is.close();
            System.out.println(System.currentTimeMillis()-before+"mms");
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
