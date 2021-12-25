package com.company;

class Employee1{
    private int salary;
    public Employee1(){
        salary = 7800000;
    }
    public Employee1(int setSalary){
        salary = setSalary;
    }
    public int getSalary() {
        return salary;
    }
}

public class CWH_42_Constructor {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        System.out.println(emp.getSalary());
        Employee1 emp1 = new Employee1(12121112);
        System.out.println(emp1.getSalary());

    }
}
