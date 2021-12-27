package com.company;

import sun.awt.windows.ThemeReader;

class WelcomeThread extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Welcome!!!");
            try {
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println(e);
            }
            i++;
        }

    }
}
class GMThread extends Thread{
    public void run(){
        int i=0;
        while(i<10) {
            System.out.println("Good morning!!!");
            i++;
        }
    }
}

public class CWH_76_CH11_PS {
    public static void main(String[] args) {
        WelcomeThread wt = new WelcomeThread();
        GMThread gmt = new GMThread();
        wt.setPriority(Thread.MAX_PRIORITY);
        gmt.setPriority(Thread.MIN_PRIORITY);
        wt.start();
        gmt.start();
        System.out.println("Priority of Welcome Thread:"+wt.getPriority());
        System.out.println("Priority of GM Thread:"+gmt.getPriority());
        System.out.println("State of Welcome Thread:"+wt.getState());
        System.out.println("State of GM Thread:"+gmt.getState());
        System.out.println("Refrence of Welcome Thread:"+wt.currentThread());
        System.out.println("Refrence of GM Thread:"+gmt.currentThread());

    }
}
