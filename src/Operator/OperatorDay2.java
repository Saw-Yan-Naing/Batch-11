package Operator;

import jdk.swing.interop.SwingInterOpUtils;

public class OperatorDay2 {
    public static void main(String[] args) {
        int a = 16;
        int b = 5;


        ;
        int result = a / b;
        System.out.println(result);


        int result2 = a % b;
        System.out.println(result2);

//Conditional and
        int i = 1;
        int j = 3;
        boolean result4 = i < j;
        System.out.println(result4);


        boolean result5 = i>j;
        System.out.println(result5);

        System.out.println(result4 || result5);
        //Conditional And exclusive OR
        int k = 3;
        int l = 6;
        int result8 = k * 3 + l * 2;
        System.out.println(result8);

//Boolean
        int m = 5;
        int n = 7;

        boolean result1 = m < n;
        System.out.println(result1);


        boolean result9 = m > n;
        System.out.println(result9);


        System.out.println(result1 && result9 ^ result1);

        //Shift


        int Re = 10 >> 2;
        System.out.println(Re);

        //ternary
        int c = 9;
        int v = 5;
        int R=(c>v)? c : v ;
        System.out.println(R);

        //If statement


        int score=48;
        if(score>=50)
            System.out.println("PASS");

        else
            System.out.println("FAIL");


    }
}

