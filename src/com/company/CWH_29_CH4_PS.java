package com.company;
import java.util.Scanner;

public class CWH_29_CH4_PS {
    public static void main(String[] args) {
//        System.out.println("Q1: sum of array numbers");
//        sumOfArray();
//        System.out.println("Q2: check number exists in array");
//        isIntegerPresentInArray();
//        System.out.println("Q2: avg of marks");
//        calculateAvg();
//        System.out.println("Q4: add matrices");
//        addMatrices();
//        System.out.println("Q5: Reverse an array");
//        reverseArray();
//        System.out.println("Q6: Find max element from an array");
//        findMaxElement();
        System.out.println("Q7: Check array is sorted or not");
        IsArraySorted();
    }

    public static void sumOfArray(){
        float [] numbers = {1f,2f,3.0f,4f,5f};
        float sum = 0f;
        for(int i=0; i<numbers.length;i++){
            sum += numbers[1];
        }
        System.out.println(sum);
    }

    public static void isIntegerPresentInArray(){
        Scanner sc = new Scanner(System.in);
        int [] numbers = {1,2,3,4,5,6};
        System.out.print("Enter the number:");
        int n  = sc.nextInt();
        boolean isExist = false;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == n){
                isExist = true;
                break;
            }
        }
        if(isExist){
            System.out.println("Yes, number exist in array");
        }else{
            System.out.println("No, number does not exist in array");
        }
    }

    public static void calculateAvg(){
        float [] marks = {80,90,89,56,78,23,89,56,57};
        float sum = 0;
        for(int i=0;i<marks.length;i++){
            sum += marks[i];
        }
        float avgOfMarks = sum/ marks.length;
        System.out.println(avgOfMarks);
    }

    public static void addMatrices(){
        int [][] arr1 = {{1,2,3}, {4,5,6}};
        int [][] arr2 = {{1,2,3}, {4,5,6}};
        int [][] result = {{0,0,0}, {0,0,0}};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void reverseArray(){
        int [] arr = {2,8,23,56,21,31};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element:arr){
            System.out.println(element);
        }
    }

    public static void findMaxElement(){
        int [] arr = {2,8,23,56,21,31};
        int max = Integer.MIN_VALUE;
        for (int element: arr){
            if(element > max){
                max = element;
            }
        }
        System.out.println("Max element from an array: "+ max);
    }

    public static void IsArraySorted(){
        int [] arr = {2,8,23,56,89,931};
        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }

}
