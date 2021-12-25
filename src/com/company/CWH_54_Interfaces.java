package com.company;
//1. A interface is a group of methods having empty bodies.
//  Now, we can also give the defination of methods(of default and private) in interface
//2. It is mandate to give the defination of interface methods in the sub class, or make the sub class abstract.
//3. We can implement multiple interfaces into sub class + also extends the class.
//4. Multiple inheritance is not allowed in java, but multiple interface is allowed.
//5. By default all methods of interface are public, and all properties of interface are final.
//6. Now interface can allow default methods and private as well.
//7. We cant create the object the interface.

interface Bicycle{
    int a = 45;
    void applyBreak(int decreament);
    void speedUp(int increament);
}
interface HornBicycle{
    void blowHornK3g();
    void blowHornmhn();
}
class Avon implements Bicycle,HornBicycle{
    int speed = 34;
    void blowHorn(){
        System.out.println("Pee pee poo poo");
    }
    public void applyBreak(int decreament){
        speed = speed - decreament;
        System.out.println("applying break "+ speed);
    }
    public void speedUp(int increament){
        speed = speed + increament;
        System.out.println("spped up "+ speed);
    }
    public void blowHornK3g(){
        System.out.println("pee pee poo poo k3g");
    }
    public void blowHornmhn(){
        System.out.println("pee pee poo poo mhn");
    }
}
public class CWH_54_Interfaces {
    public static void main(String[] args) {
        Avon a = new Avon();
        a.applyBreak(1);
        a.speedUp(2);
        a.blowHorn();
        a.blowHornmhn();
        a.blowHornK3g();
    }

}
