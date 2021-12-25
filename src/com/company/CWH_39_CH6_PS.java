package com.company;

class Employee{
    int salary;
    String name;

    public void setName(String setName){
        name = setName;
    }

    public String getName(){
        return name;
    }

    public void setSalary(int setSalary){
        salary = setSalary;
    }
    public int getSalary(){
        return salary;
    }
}

class CellPhone{

    public void callFriend(){
        System.out.println("Calling a friend....");
    }

    public void ring(){
        System.out.println("Ringing....");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }
}

class Square{
    int side;
    public void setSide(int setSide){
        side = setSide;
    }
    public int calculateArea(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int l;
    int w;
    public void setLength(int setL){
        l = setL;
    }
    public void setWidth(int setW){
        w = setW;
    }
    public int calculateArea(){
        return l*w;
    }
    public int perimeter(){
        return 2*(l+w);
    }
}

class TommyVecetti{
    public void hit(){
        System.out.println("hitting...");
    }
    public void run(){
        System.out.println("running...");
    }
    public void fire(){
        System.out.println("firing...");
    }
}

public class CWH_39_CH6_PS {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Sheetal");
        System.out.println(emp.getName());
        emp.setSalary(3000000);
        System.out.println(emp.getSalary());

        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.ring();
        asus.vibrate();

        Square sq = new Square();
        sq.setSide(5);
        System.out.println(sq.calculateArea());
        System.out.println(sq.perimeter());

        Rectangle rec = new Rectangle();
        rec.setLength(5);
        rec.setWidth(4);
        System.out.println(rec.calculateArea());
        System.out.println(rec.perimeter());

        TommyVecetti tv = new TommyVecetti();
        tv.fire();
        tv.hit();
        tv.run();

    }

}
