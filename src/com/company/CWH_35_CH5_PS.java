package com.company;

public class CWH_35_CH5_PS {
    public static void main(String[] args) {
//        System.out.println(sumOfNaturalNumbers(5));
//        printPattern(5);
        //printPatternRec(5);
        System.out.println(convertCelsisToF(12));
    }

    static int sumOfNaturalNumbers(int n){
        if(n==1) {
            return 1;
        }
        return n + sumOfNaturalNumbers(n-1);
    }

    static void printPattern(int rows){
        for(int i=rows;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void printPatternRec(int rows){
        if(rows > 0){
            for(int i=rows;i>0;i--){
                System.out.print("*");
            }
            System.out.println("");
            printPatternRec(rows-1);
        }
    }

    static float avgofNumbers(float [] arr){
        float sum = 0;
        for(float ele:arr){
            sum += ele;
        }
        float avg = sum/arr.length;
        return avg;
    }

    static float convertCelsisToF(int celsius){
        float valueInF = (celsius*(9/5f))+32;
        return valueInF;
    }
}
