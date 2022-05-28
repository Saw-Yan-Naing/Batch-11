package Wrapper;

public class Wrapper {

   static String name="HELLO WORLD.";


    public static void main(String[] args) {

        //Wrapper class
        int a =12;
        Integer num1=a;//autoboxing

        Integer num2= Integer.valueOf(a);//explicit

        Wrapper wrapper=new Wrapper();

        //unboxing

        Integer num3=new Integer(4);


        //unboxing
        int b=num3;
        //explicit unboxing
        int c=num3.intValue();



        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
