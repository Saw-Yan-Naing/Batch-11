package Practise;

import java.util.Scanner;

public class PraticeHome {
    public static void main(String[] args) {

        System.out.println("Welcome.You may choose data package.");

        System.out.println("1. 499 Mb = 1000Ks.");
        System.out.println("2. 999 Mb = 1500Ks.");
        System.out.println("3. 1.5 Gb =2000 Ks.");

        String[] data={"1. 499 Mb = 1000Ks.",
        "2. 999 Mb = 1500Ks.",
        "3. 1.5 Gb =2000 Ks."};

        System.out.println("Enter number between 0 to 2 to buy data package.");
        Scanner input=new Scanner(System.in);
        int in1=input.nextInt();


       if(in1==0){

           System.out.println(data[0]);

       }else if(in1==1){

           System.out.println(data[1]);

       }else if(in1==2){

           System.out.println(data[2]);

       }else{

           System.out.println("Your input is invalid.");
       }
        System.out.println("If you want to buy type 1 or if you want to leave type 2.");

       Scanner in2= new Scanner(System.in);
       int input1=in2.nextInt();


       String[] buy ={"1. You have bought data package.",
       "2. You have canceled the plan.Thanks for using our operator."};

       switch(input1){
           case 1 :
               System.out.println(buy[0]);
               break;

           case 2:
               System.out.println(buy[1]);
               break;

           default:
                   System.out.println("Something was wrong." +
                           "ERROR.");
       }

        System.out.println("Thank you for using,we are always with you.");

            }
        }