package Operator;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.println("Enter the value of 'a'");

        Scanner cm= new Scanner(System.in);
        int a=cm.nextInt();

        System.out.println("Enter the value of 'b'.");
       Scanner K= new Scanner(System.in);
       int b=K.nextInt();

       int area=a*b;
        System.out.println(area);
    }
}
