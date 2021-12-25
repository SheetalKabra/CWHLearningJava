package com.company;
interface MySampleInterface{
    void meth1();
    void meth2();
}
interface MySampleInterfaceChild extends MySampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements MySampleInterfaceChild{
    public void meth1(){
        System.out.println("meht1");
    }
    public void meth2(){
        System.out.println("meht2");
    }
    public void meth3(){
        System.out.println("meht3");
    }
    public void meth4(){
        System.out.println("meht4");
    }
}
public class CWH_58_inheritace_interface {
    public static void main(String[] args) {
        MySampleClass msc = new MySampleClass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();
    }
}
