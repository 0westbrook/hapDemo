package com.test.thread;

class RunnableDemo implements Runnable{

    private String name;

    public RunnableDemo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(name+":"+i);
            if(i == 10){
                System.out.println("礼让");
                Thread.yield();
            }
        }
    }
}

public class ThreadDemo03 {
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("A");
        RunnableDemo r2 = new RunnableDemo("B");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
    }
}
