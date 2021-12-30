package com.company;
class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius can not be negative";
    }
    @Override
    public String getMessage(){
        return "Radius can not be negative";
    }
}

public class CWH_84_Throw_Throws {
    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }

    public static double area(int r) throws NegativeRadiusException {
        if(r>0){
            return Math.PI*r*r;
        }
        throw new NegativeRadiusException();

    }

    public static void main(String[] args) {
        try{
//            int c = divide(12,0);
//            System.out.println(c);
            System.out.println(area(2));
        }catch(Exception e){
            System.out.println(e);
        }

    }

}
