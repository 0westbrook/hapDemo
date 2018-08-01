package com.demo.test;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("text.txt");
        if(file.exists()){
            try {
                FileInputStream is = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(is,"UTF-8");
                BufferedReader br = new BufferedReader(isr);
                String line;

                while ((line = br.readLine()) !=  null){
                    System.out.println(line);
                }
                br.close();
                isr.close();
                is.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File newFile = new File("newtext.txt");

        try {
            FileOutputStream os = new FileOutputStream(newFile);
            OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
            BufferedWriter ow = new BufferedWriter(osw);

            ow.write("长歌行  汉乐府");

            ow.close();
            osw.close();
            os.close();
            System.out.println("完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
