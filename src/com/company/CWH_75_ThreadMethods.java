package com.company;
class ThreadMethod1 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am of ThreadMethod1");
            try {
                Thread.sleep(455);
            }catch (Exception e){
                System.out.println(e);
            }
            i++;
        }
    }
}
class ThreadMethod2 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am of ThreadMethod2");
            i++;
        }
    }
}

public class CWH_75_ThreadMethods {
    public static void main(String[] args) {
        ThreadMethod1 tm1 = new ThreadMethod1();
        ThreadMethod2 tm2 = new ThreadMethod2();
        tm1.start();
//        try{
            //this will not run another threads untill tm1 will completed
//            tm1.join();
//        }catch (Exception e){
//            System.out.println(e);
//        }

        tm2.start();
    }
}
