package com.company;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("Fountain pen can write");
    }
    public void refill(){
        System.out.println("Fountain pen can refill");
    }
    public void changeNib(){
        System.out.println("Fountain pen can change the nib");
    }
}

interface Animal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("can jump");
    }
    public void bite(){
        System.out.println("can bite");
    }
}
class Human extends Monkey implements Animal{
    public void speak(){
        System.out.println("Hello sir, hello mam");
    }
    public void eat(){
        System.out.println("Can eat");
    }
    public void sleep(){
        System.out.println("Can sleep");
    }
}

abstract class Telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnected();
}
class SmartTelephone extends Telephone{
    public void wireless(){
        System.out.println("smart telephone can we wireless");
    }
    public void ring(){
        System.out.println("ring ring");
    }
    public void lift(){
        System.out.println("lift");
    }
    public void disconnected(){
        System.out.println("disconnected");
    }
}

interface TvRemote{
    void onTV();
    void offTv();
}
interface SmartTvRemote extends TvRemote{
    void changeChannel();
    void changeVolume();
}

class Tv implements TvRemote{
    public void onTV(){
        System.out.println("TV is On");
    }
    public void offTv(){
        System.out.println("TV is OFF");
    }
}

public class CWH_60_CH10_PS{
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();
        Human h = new Human();
        h.speak();
        Monkey m = new Human(); //q5. implements polymorphism
        m.bite();
        m.jump();
        //m.speak(); -- error, as this is not the method of monkey class
        Telephone t = new SmartTelephone();
        // t.wireless() -- error, can use only telephone methods
        t.lift();

    }
}
