package com.company;

public class CWH_34_Recursion {
    public static void main(String[] args) {
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(9));

    }

    static int fibonacci(int n){
        if(n <= 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
