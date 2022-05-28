package OOP;

import java.util.Scanner;
import java.util.concurrent.Callable;


public class Constructor1 {

    int id;
    String name;

    Constructor1(int i,String n){
    this.id=i;
    this.name=n;
        System.out.println("Your id number is "+i+".");
        System.out.println("Your name is " + n + ".");
    }

    public static void main(String[] args) {

        System.out.println("Enter your age.");

        Scanner scanner=new Scanner(System.in);
        int i= scanner.nextInt();

        System.out.println("Enter your name.");

        Scanner scanner1=new Scanner(System.in);
        String n=scanner1.nextLine();



   new Constructor1(i,n);


    }
}
