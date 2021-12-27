package com.company;
class ThreadPri extends Thread{
    ThreadPri(String name){
        super(name);
        System.out.println("I am constructor of Thread : "+ name);
    }
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am run of ThreadPri, name:"+this.getName());
            i++;
        }

    }
}

public class CWH_74_ThreadPriorities {
    public static void main(String[] args) {
        ThreadPri tp1 = new ThreadPri("a1");
        ThreadPri tp2 = new ThreadPri("a2");
        ThreadPri tp3 = new ThreadPri("a3");
        ThreadPri tp4 = new ThreadPri("a4");
        ThreadPri tp5 = new ThreadPri("a5, top priorityyyyyy");
        tp5.setPriority(Thread.MAX_PRIORITY);
        tp4.setPriority(Thread.MIN_PRIORITY);
        tp3.setPriority(Thread.MIN_PRIORITY);
        tp2.setPriority(Thread.MIN_PRIORITY);
        tp1.setPriority(Thread.MIN_PRIORITY);


        tp1.start();
        tp2.start();
        tp3.start();
        tp4.start();
        tp5.start();

    }
}
