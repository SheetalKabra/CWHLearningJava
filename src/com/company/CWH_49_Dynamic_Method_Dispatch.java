package com.company;

class Parent{
    public void hindi(){
        System.out.println("Yes, parent knows hindi");
    }
    public void english(){
        System.out.println("Yes, parent knows english");
    }
}

class Child extends Parent{
    public void hindi(){
        System.out.println("Yes, child knows hindi");
    }
    public void english(){
        System.out.println("Yes, child knows english");
    }
    public void german(){
        System.out.println("Yes, child also knows german");
    }
}

public class CWH_49_Dynamic_Method_Dispatch {

    //this is also called run time polymorphism(RTP)
    //this is the Liskov's priciple of SOLID
    //we can assign the refrence of parent class into child class
    public static void main(String[] args) {
        //this is called RTP, as object creation happens on run time.
        Parent p = new Child();
        p.english();
        p.hindi();
        //p.german(); //not alllowed
    }

}
