package Operator;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Pratice {
    public static void main(String[] args) {

        char grade;

        System.out.println("Enter your testscore.");

        Scanner score=new Scanner(System.in);
        int testscore=score.nextInt();

        if(testscore>=90){
            grade='A';
        }else if(testscore>=80){
        grade='B';
    }else if  (testscore>=70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        }else{
            grade='F';
                    }
        System.out.println("Grade="+grade);


        System.out.println("What is your teacher name?");

        Scanner userinput= new Scanner(System.in);
        System.out.println("My tr. name is  " +userinput.nextLine());

        System.out.println("Enter your age.");

        Scanner input= new Scanner(System.in);
        System.out.println("Your Age = "+ input.nextInt());



}

}