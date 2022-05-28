package Practise;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {

        int a= 10;

        //condition is true
        if (a<11){
            System.out.println(a+" is less than 11.");
        }
        //condition is false
        if (a>11){
            System.out.println(a+ " is greater than 11.");
        }

        //if else statement

        int b=12;
        int c=13;

        if (b>c){
            System.out.println("Your statement is true.");
        }else {
            System.out.println("invalid");
        }

        //If else if  statement

        //User input

        System.out.println("Enter your test score in decimal");
        Scanner in=new Scanner(System.in);
        double r=in.nextDouble();


        if (r<=3.0){
            System.out.println("Your grade is C.");
        } else if (r<=5.0) {
            System.out.println("Your grade is B.");
        } else if (r<=8.0) {
            System.out.println("Your grade is A.");
        }else {
            System.out.println("You got distinction.");
        }
    }
}
