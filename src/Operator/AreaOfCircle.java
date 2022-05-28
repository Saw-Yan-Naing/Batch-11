package Operator;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter the value of r.  ");
        Scanner cir=new Scanner(System.in);
        int r=cir.nextInt();

        double area1= 3.14*(r*r);
        System.out.println(area1);
    }
}
