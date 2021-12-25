package com.company;
//1. A abstract class is class that is declared as Abstract.
//2. A abstract method is a method that is declared without implementation.
//3. It can include abstract and non-abstract methods.
//3. It is possible to create the refrence of abstract class, and object of this sub class.(concept of dynamic method dispatching)
//4. It is not possible to create the object of abstract classes
//5. If you extends the absract class into subclass, then either you should make the sub class abstract or give the defination of abstract method

abstract class Parent1{
    public Parent1(){
        System.out.println("I am the constructor or abstract class Parent1");
    }
    public void sayHello(){
        System.out.println("Say, hello!!!");
    }
    abstract public void greet();
}
class Child1 extends Parent1{
    @Override
    public void greet(){
        System.out.println("Hi, GM");
    }
}
abstract class Child2 extends Parent1{
    public void th(){
        System.out.println("th");
    }
}

public class CWH_53_AbstractClasses {
    public static void main(String[] args) {
        //Parent1 p1 = new Parent1(); // --error
        Child1 c1 = new Child1();
        c1.greet();
        //Child2 c2 = new Child2() ; // --error
    }

}
