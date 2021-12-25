package com.company;

import java.util.Locale;

public class CWH_13_Strings {
    public static void main(String[] args) {
        //two ways to define strings
        String str = new String("Sheetal");
        String str1 = "Sheetal Kabra"; // used as %s
        int a = 4; //used as %d
        float b = 3.4f; //used as %f
        char ch = 'b'; // used as %c
        System.out.println(str);
        System.out.println(str1);
        //we have 4 ways to print
        System.out.println("hii, this is println, which is used to go into next line");
        System.out.print("hii, this in only print, which will not go into next line");
        System.out.printf("hii, this printf to format the string, values %d, %f", a, b);
        System.out.format("hii, this format which is same as printf, values %d, %.2f", a, b);
        stringMethods();
    }

    public static void stringMethods(){
        String name = "Sheetal";
        String untrimmedName = "     Sheetal    ";
        System.out.println("String: "+name);
        System.out.println("Length: "+name.length());
        System.out.println("Lowercase: "+name.toLowerCase());
        System.out.println("Uppercase: "+name.toUpperCase());
        System.out.println("Trim: "+untrimmedName.trim());
        System.out.println("Substring 3: " +name.substring(3));
        System.out.println("Substring 3, 5: " +name.substring(3, 5));
        System.out.println("repalce e with i: "+name.replace("e", "i"));
        System.out.println("Starts with Sh:"+ name.startsWith("Sh"));
        System.out.println("Starts with sh:"+ name.startsWith("sh"));
        System.out.println("Ends with Sh:"+ name.startsWith("al"));
        System.out.println("Ends with Al:"+ name.startsWith("Al"));
        System.out.println("char at 2: "+name.charAt(2));
        System.out.println("index of e: "+name.indexOf("e"));
        System.out.println("index of p: "+name.indexOf("p"));
        System.out.println(" last index of e: "+name.indexOf("e"));
        System.out.println("equals : Sheetal: "+name.equals("Sheetal") );
        System.out.println("equals ignores case: sheEtal: "+name.equalsIgnoreCase("sheEtal") );

        //ch3_ps
        String a = "My name is Sheetal";
        System.out.println("Replace spaces with underscores: "+ a.replace(" ", "_"));
        String letter = "Dear <|name|>, thanks a lot!";
        System.out.println("Replace with name: "+ letter.replace("<|name|>", "Sheetal"));
        String b = "detect    double or   triple    spaces    ";
        System.out.println("detect double spaces " + b.indexOf("  "));
        System.out.println("detect triple spaces " + b.indexOf("   "));
        String c = "Dear Sheetal, \n\tThis java course is nice. \n\tThanks!";
        System.out.println(c);

    }

}
