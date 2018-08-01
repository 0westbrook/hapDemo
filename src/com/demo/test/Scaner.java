package com.demo.test;

import java.io.File;

public class Scaner {
    public static void main(String[] args) {

    }

    public void printFiles(File dir) {
        if(dir.isDirectory()){
            File next[] = dir.listFiles();
            for (int i = 0; i < next.length; i++) {
                if(next[i].isFile()){
                    System.out.println(next[i].getName());
                }else {

                }
            }
        }
    }
}
