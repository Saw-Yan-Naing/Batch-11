package Operator;

import java.util.Scanner;

public class Calaulator {
    public static void main(String[] args) {

        System.out.println("Enter your 1st number.");
        Scanner one=new Scanner(System.in);

        double num1= one.nextInt();

        System.out.println("Enter your 2nd number.");
        Scanner two=new Scanner(System.in);

        double num2=two.nextInt();

        System.out.println("Choose your operator in +,-,*,/,%.");
        Scanner operate=new Scanner(System.in);

        char operator= operate.next().charAt(0);


        switch(operator){
            case'+':
                double result=num1 + num2;
                System.out.println( num1 + "+" +num2+ "=" + result );
                break;

            case'-':
                double R=num1-num2;
                System.out.println(num1+"-"+num2+"="+R);
                break;

            case'*':
                double R1=num1 * num2;
                System.out.println(num1+"*"+num2+"="+R1);
                break;

            case'/':
                double R2= num1/num2;
                System.out.println(num1+"/"+num2+"="+R2);
                break;

            default:
                System.out.println("Invalid Operator.");
                break;

        }


    }
}