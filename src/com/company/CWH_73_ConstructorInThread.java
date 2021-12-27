package com.company;
class MyTh1 extends Thread{
    public MyTh1(String name){
        super(name);
        System.out.println("I am constructor of myth1");
    }
    public void run(){
        System.out.println("I am run metd of myth1");
    }
}

class MyTh2 implements Runnable{
    public MyTh2(){
        System.out.println("I am constructor of myth2");
    }
    public void run(){
        System.out.println("I am run metd of myth2");
    }
}

public class CWH_73_ConstructorInThread {
    public static void main(String[] args) {
        MyTh1 t1 = new MyTh1("Sheetal");
        t1.start();
        System.out.println("Thread name is "+t1.getName());
        System.out.println("Thread id is "+t1.getId());

        MyTh1 t2 = new MyTh1("ABC");
        t2.start();
        System.out.println("Thread name is "+t2.getName());
        System.out.println("Thread id is "+t2.getId());

        MyTh2 t22 = new MyTh2();
        Thread thread = new Thread(t22, "asdd");
        thread.start();
        System.out.println("Thread name is "+thread.getName());
        System.out.println("Thread id is "+thread.getId());
    }
}
