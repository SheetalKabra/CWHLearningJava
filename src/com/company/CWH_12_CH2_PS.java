package com.company;
import java.util.Scanner;

public class CWH_12_CH2_PS {

    public static void main(String[] args) {
        evaluateExpression();
        showGrade();
        System.out.println(isNumberGreater());
        calculateExp();
    }

    public static void evaluateExpression(){
        float result = 7/4.0f*9/2.0f;
        System.out.println(result);
    }

    public static void showGrade(){
        char grade = 'B';
        char encryptedGrade = encryptGrade(grade);
        char decryptedGrade = decryptGrade(encryptedGrade);
        System.out.println("Encrypted grade: "+ encryptedGrade);
        System.out.println("Decrypted grade: "+ decryptedGrade);
    }

    public static char encryptGrade(char grade){
        return (char)(grade+8);
    }

    public static char decryptGrade(char grade){
        return (char)(grade-8);
    }

    public static boolean isNumberGreater(){
        Scanner sc = new Scanner(System.in);
        int givenNumber = 8;
        System.out.println("Enter number:");
        int enteredNumber = sc.nextInt();
        boolean check = givenNumber > enteredNumber;
        System.out.println("Given Number " + givenNumber + " is greater than entered number " + enteredNumber + " === " + check);
        return check;
    }

    public static void calculateExp(){
        int x = 7;
        int a = 7*49/7+35/7;
        System.out.println(a);
    }
}
