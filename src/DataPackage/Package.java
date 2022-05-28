package DataPackage;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Package {
    public static void main(String[] args) {

        System.out.println("Enter 12 to buy package.");

        Scanner input=new Scanner(System.in);
        int tw=input.nextInt();

        if(tw==12){

            System.out.println("Choose option between 1 to 3.");
            System.out.println("If you want to buy data package choose 1.");
            System.out.println("If you want to know about information how to top up choose 2.");
            System.out.println("If you want to know emergency number choose 3.");
            System.out.println("If you have got any error contact call center. ");


            Scanner input1=new Scanner(System.in);
            char second=input1.next().charAt(0);


            switch(second){

                case'1':
                    System.out.println("Choose 1 or 2 for data package");
                    Scanner input3=new Scanner(System.in);
                    char c1= input3.next().charAt(0);

                    System.out.println("You can choose data package.");
                    System.out.println("1.499Mb=1000Ks");
                    System.out.println("2.999Mb=1500Ks" );



                    switch(c1){

                        case '1':


                           Scanner in=new Scanner(System.in);
                           int op1=in.nextInt();
                            System.out.println("You have successfully bought 499Mb package.");
                        break;

                        case'2':

                            Scanner in1=new Scanner(System.in);
                            int op2=in1.nextInt();
                            System.out.println("You have successfully bought 999Mb package.");
                            break;

                        default:
                            System.out.println("You are option is invalid.");
                            break;


                    }
                case '2':
                    System.out.println("Type any number to get information.");

                    Scanner in2=new Scanner(System.in);
                    int op2=in2.nextInt();

                    System.out.println("You can top up the bill by 2 ways.");
                    System.out.println("If you want to top up online,you may scan Qr code which is in the bill card.");
                    System.out.println("If you want to top up offline you may dial *123*pin number#.");
                     break;

                case '3':
                    System.out.println("You can type any number to get to another state.");

                    Scanner in3=new Scanner(System.in);
                    int op3=in3.nextInt();

                    System.out.println("If you have got any problem for any process you contact us by dailing 09-789433659.You can ask between 9a.m to 6p.m.");
                    break;

                default:
                    System.out.println("Your option is wrong please choose.");

            }
         }else{
            System.out.println("Your input is invalid.");
        }


    }
}
