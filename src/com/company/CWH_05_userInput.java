package com.company;
import java.util.Scanner;

public class CWH_05_userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//System.in means taking input from keyboard
        System.out.println("Getting input from user:");
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of above numbers are:");
        System.out.println(sum);
        System.out.println("Enter string to read");
        String str = sc.next();
        String wholeStr = sc.nextLine();
        System.out.println(str);
        System.out.println(wholeStr);


    }
}
