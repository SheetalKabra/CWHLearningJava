package com.company;
class MyRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("I am runnable thread 1");
            i++;
        }
    }
}

class MyRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("I am runnable thread 2");
            i++;
        }
    }
}

public class CWH_71_Runnable {
    public static void main(String[] args) {
        MyRunnable1 r1 = new MyRunnable1();
        Thread t1 = new Thread(r1);
        MyRunnable2 r2 = new MyRunnable2();
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

    }
}
