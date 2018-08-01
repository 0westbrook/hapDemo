package com.test.thread;

import sun.plugin.javascript.navig.Link;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.test(11);
    }

    public void test(int n){
        int sum;
        int b = n/2;
        for (int i = 1; i <= b; i++) {
            for (int j = (b+1); j < n; j++) {
                sum = i+j;
                if(sum == n){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }

    public void foundString() {
        String s = "abcdefghiahsd";
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    return;
                }
            }
        }
    }

    public int second() {
        int a[] = {11, 21, 31, 41, 51, 61, 71, 81, 91, 110};
        int max = a.length - 1;
        int min = 0;
        int b = 0;
        int val = 31;
        if ((val > a[max]) || (val < a[min])) {
            return -1;
        }
        while ((val != a[max]) || (val != a[min])) {
            b = (max + min) / 2;
            if (val > a[b]) {
                min = b;
            } else if (val < a[b]) {
                max = b;
            } else {
                while (val == a[b]) {
                    b--;
                }
                b = b + 2;
                break;
            }
            if ((max == min) || (max < min) || (b == 0)) {
                b = -1;
                break;
            }
        }
        return b;
    }


}
