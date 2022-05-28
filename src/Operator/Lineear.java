package Operator;

import java.util.Scanner;

public class Lineear {
    public static void main(String[] args) {
        System.out.println("Enter the year.");
        Scanner K = new Scanner(System.in);
        int year = K.nextInt();

        if (year % 4 == 0) {
            System.out.println("This is linear year.");
        } else {
            System.out.println("This is not Linear year.");

        }
    }}
