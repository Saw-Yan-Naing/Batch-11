package Operator;

import java.util.Scanner;

public class CelsiusToFeriheit {
    public static void main(String[] args) {
        System.out.println("Enter the valuue you want to change.");
        Scanner chg=new Scanner(System.in);
        int f=chg.nextInt();

        double changing= (f*1.8)+32;
        System.out.println(changing);

    }
}
