package com.company;
//make parent, child and grandChild class
//overload constructor
//use super keyword
class Base1{
    Base1(){
        System.out.println("I am constructor of Base1 with no values");
    }
    Base1(int x){
        System.out.println("I am constructor of Base1 with value of x:"+x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am constructor of Derived1 with no values");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am constructor of Derived1 with value of x:"+x+" and y:"+y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am constructor of ChildOfDerived with no values");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am constructor of ChildOfDerived with value of x:"+x+" and y:"+y+" and z:"+z);
    }
}
public class CWH_46_ConstructorInInheritance {
    public static void main(String[] args) {
        ChildOfDerived cd = new ChildOfDerived();
        System.out.println("===============");
        ChildOfDerived cd1 = new ChildOfDerived(1,2,3);

    }


}
