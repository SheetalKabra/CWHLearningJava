package com.company;

public class CWH_10_ResultingDataType {

    public static void main(String[] args) {
        // R = b+s = int
        // R = s+i = int
        // R = c+s = int
        // R = c+i = int
        // R = f+i = float
        // R = f+l = float
        // R = f+d = double
        // R = d+l = double
        //increament and decreament operators
        int i = 57;
        System.out.println(i++); // 57, first use the value and then increament it.
        System.out.println(i); // 58
        System.out.println(++i); //59, first increment the value and then use it.
        System.out.println(i); // 59
        int y=7;
        System.out.println(++y*8); // 8*8 = 64
        char ch = 'a';
        System.out.println(++ch); //b
    }
}
