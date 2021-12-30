package com.company;

public class CWH_85_Finally {
    public static int calculate(int a, int b){
        try{
            return a/b;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is the end of the program");
        }
        return 0;
    }

    public static void greet(){
        for(int i=0;i<10;i++){
            if(i==4){
                System.out.println("break");
                break;
            }
            try{
               int c = 10/i;
            }catch (Exception e){
                System.out.println(e);
                System.out.println("catch break");
                break;
            }
            finally{
                System.out.println("finally block for i:" +i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(calculate(2,3));
        System.out.println(calculate(2,0));
        greet();
    }
}
