package com.company;
import java.util.Scanner;

public class CWH_06_calculatePercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter below details to get the percentage");
        System.out.println("Marks are out of : ");
        int marksOutOf = sc.nextInt();
        System.out.println("How many subjects you have?");
        byte noOfSubjects = sc.nextByte();
        int totalMarksOutOf = marksOutOf*noOfSubjects;
        double totalMarks = 0;
        for(int i=1;i<=noOfSubjects; i++){
            System.out.println("Enter sub marks:");
            totalMarks = totalMarks + sc.nextInt();
        }
        System.out.println("Total marks : ");
        System.out.println(totalMarks);
        System.out.println("Percentage :");
        double percentage = (totalMarks/totalMarksOutOf)*100;
        System.out.println(percentage);


    }
}
