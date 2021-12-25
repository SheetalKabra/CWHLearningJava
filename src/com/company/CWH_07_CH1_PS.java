package com.company;
import java.util.Scanner;
public class CWH_07_CH1_PS {

    public static void main(String[] args) {
        sum();
        calculateCgpa();
        greeting();
        kmToMiles();
        checkNumberIsInteger();
    }

    public static void sum(){
        int a = 12;
        int b = 13;
        int c = 14;
        int sum = a + b + c;
        System.out.println("Sum of "+a+","+b+","+c+" is :"+sum);
    }

    public static void calculateCgpa(){
        float marks1 = 23;
        float marks3 = 63;
        float marks2 = 43;
        float cgpa = (marks1 + marks2 + marks3)/30;
        System.out.println("CGPA of "+marks1+","+marks2+","+marks3+" is :"+cgpa);
    }

    public static void greeting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("Hello "+ name + ",have a good day!");
    }

    public static void kmToMiles(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in KM to convert into miles");
        double valueInKm = sc.nextFloat();
        double valueInMiles = valueInKm*0.621371;
        System.out.println(valueInKm+" KM in miles is "+ valueInMiles);
    }

    public static void checkNumberIsInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether it is integer or not:");
        boolean check = sc.hasNextInt();
        System.out.println(check);
    }
}
