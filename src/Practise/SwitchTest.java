package Practise;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {

        System.out.println("Choose your character +,-,*,/ or %");
        Scanner in1=new Scanner(System.in);
        char a=in1.next().charAt(0);

        switch (a){
            case '+':
                System.out.println("Your assignment is additive.");
                break;
            case '-':
                System.out.println("Your assignment is subtraction.");
                break;
            case '*':
                System.out.println("Your assignment is multiplication.");
                break;
            case '/':
                System.out.println("Your assignment is division.");
                break;
            case'%':
                System.out.println("Your assignment is remainder.");
                break;

            default:
                System.out.println("Your input is something wrong.");

        }

    }
}
