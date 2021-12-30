package com.company;

class MarRetiresException extends Exception{
    @Override
    public String toString(){
        return "max retires exception";
    }

    @Override
    public String getMessage(){
        return "max retires exception";
    }
}

public class CWH_86_CH12_PS {

    public static void printExceptionQ3() throws MarRetiresException{
        int [] arr = new int[5];
//        try{
            for(int i=0;i<=6;i++){
                if(i>4){
                    throw new MarRetiresException();
                }
                arr[i] = i;
            }
//        }catch(Exception e){
//            System.out.println("Invalid index");
//            System.out.println(e);
//        }

    }

    public static int printException(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        try{
            printExceptionQ3();
        }catch(Exception e){
            System.out.println(e);
        }

//        try{
//            System.out.println(printException(1,0));
//        }catch(ArithmeticException e){
//            System.out.println("haha");
//        }catch(IllegalArgumentException e){
//            System.out.println("hehe");
//        }
    }

}
