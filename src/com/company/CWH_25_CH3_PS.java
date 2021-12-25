package com.company;
import java.util.Scanner;

public class CWH_25_CH3_PS {
    public static void main(String[] args) {
        System.out.println("Q1: ");
        pattern();
        System.out.println("Q2:");
        sumNNumbers();
        System.out.println("Q3:");
        tableOfNNumber();
        System.out.println("Q4:");
        tableOfNNumberInRevOrder();
        System.out.println("Q5:");
        factorialOfNumber();
    }

    public static void pattern(){
        for(int i=4;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void sumNNumbers(){
        int n= 10;
        int sum = 0;
        while(n>0){
            sum += n;
            n--;
        }
        System.out.println("sum of N numbers from 1 to 100: "+sum);
    }

    public static void tableOfNNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number you want to print the table:");
        int n = sc.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(n +"*"+i+"="+n*i);
        }
    }

    public static void tableOfNNumberInRevOrder(){
        int n =10;
        System.out.println("Table of 10 in reverse order:");
        for(int i=10;i>=1;i--){
            System.out.println(n +"*"+i+"="+n*i);
        }
    }

    public static void factorialOfNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number you want to factorial:");
        int n = sc.nextInt();
        int factorial = 1;
        for(int i=n;i>1;i--){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
