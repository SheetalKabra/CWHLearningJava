package com.company;

public class CWH_09_PrecedenceAsso {
    public static void main(String[] args) {
        //x-y/2
        int x = 12;
        int y = 2;
        int c = 3;
        int b = 2;
        int a = 4;
        int v = 3;
        int u = 2;
        int d = 4;
        int exp1 = (x-y)/2;
        System.out.println(exp1);
        //(b2-4ac)/2a;
        int exp2 = (b*b - 4*a*c)/(2*a); // (4 - 48)/8
        System.out.println(exp2);
        //v2-u2
        int exp3 = v*v - u*u;
        System.out.println(exp3);
        //a*b-d
        int exp4 = a*b-d;
        System.out.println(exp4);




    }
}
