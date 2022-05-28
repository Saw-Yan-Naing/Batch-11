package Operator;

import java.util.Scanner;

public class EventOne {
    public static void main(String[] args) {
        System.out.println("Enter any number within8" + 10) ;
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();

        if (num % 4==0)
        System.out.println("Your number is even.");
     else
            System.out.println("Your number is odd.");

    }
}
