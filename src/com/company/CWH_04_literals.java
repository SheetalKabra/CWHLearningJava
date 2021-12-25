package com.company;

public class CWH_04_literals {

    public static void main(String[] args) {
        //below are primitive data types
        byte age = 37; // 1byte, default: 0
        short num = 123; //2byte, default: 0
        int number = 100; //4byte, default: 0
        float b = 10.0f; //4byte, default: 0.0f
        double d = 10.0; //8byte, default: see docs
        long e = 12312321312l; //8byte, default: see docs
        boolean f = true; //depends on JVM, default: false
        char c = 'A'; //2byte, 0 to 65535
        System.out.println(age);
    }
}
