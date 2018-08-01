package com.test.thread;

class MyThreadDemo implements Runnable {

    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int b = tell();
            System.out.println(b);
        }
    }

    public synchronized int tell() {
        if (ticket > 0) {
            try {
                Thread.sleep(500);
                return 1314;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println(1111);
            }
            System.out.println("车票：" + ticket--);
        }
        return -1;
    }
}

public class ThreadDemo05 {

    public static void main(String[] args) {
        MyThreadDemo m = new MyThreadDemo();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);
        t1.start();
        t2.start();
        t3.start();
    }
}
