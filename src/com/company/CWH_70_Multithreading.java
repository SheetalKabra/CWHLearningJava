package com.company;
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<500){
            System.out.println("Thread1 is cooking the food");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<500){
            System.out.println("Thread2 is chatting on whatsapp");
            i++;
        }
    }
}

public class CWH_70_Multithreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }


}
