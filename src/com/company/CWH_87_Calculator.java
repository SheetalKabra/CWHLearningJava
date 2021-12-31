package com.company;
//You have to create a custom calculator with following operations:
//        1. + -> Addition
//        2. - -> Subtraction
//        3. * -> Multiplication
//        4. / -> Division
//        which throws the following exceptions:
//        1. Invalid input Exception ex: 8 & 9
//        2. Cannot divide by 0 Exception
//        3. Max Input Exception if any of the inputs is greater than 100000
//        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000

class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "invalid input";
    }
    @Override
    public String getMessage(){
        return "invalid input";
    }
}
class DivideByZero extends Exception{
    @Override
    public String toString(){
        return "divide by zero";
    }
    @Override
    public String getMessage(){
        return "divide by zero";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "max input";
    }
    @Override
    public String getMessage(){
        return "max input";
    }
}
class MaxMultiplierException extends Exception{
    @Override
    public String toString(){
        return "max multiplier";
    }
    @Override
    public String getMessage(){
        return "max multiplier";
    }
}

public class CWH_87_Calculator {
    public static int add(int a, int b){
        return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b) throws MaxMultiplierException{
        if(a>7000 || b>7000){
            throw new MaxMultiplierException();
        }
        return a*b;
    }
    public static int divide(int a, int b) throws DivideByZero{
        if(b == 0){
            throw  new DivideByZero();
        }
        return a/b;
    }

    public static void main(String[] args) throws MarRetiresException {
        int a = 100000;
        int b = 9;
        if(a > 100000 || b> 100000){
            throw new MarRetiresException();
        }
        try{
           // divide(1,0);
            //mul(8000,2323);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
