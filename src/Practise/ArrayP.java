package Practise;

public class ArrayP {
    public static void main(String[] args) {

        //Initialization array

        String names[]={"Mg Mg","Zaw Zaw","Kyaw Kyaw"};
        System.out.println(names.length);

        //Array declaration

        String [] car=new String[4];
        System.out.println(car[0]);

        //Syntax fo Array

        // Data type  + Variable[] + "=" + new + Data type[array size]

        int num []={1,2,3,4,5};
        System.out.println(num[3]);


//for i loop
        for (int i = 0; i < num.length ; i++) {
            System.out.print(num[i]+ ",");
        }

        System.out.println("this is line break.");
    //for each loop

        for (int num1:num) {
            System.out.print(num1+ ",");
        }
        System.out.println("Another break.");

        //for r loop

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i]+",");
        }

        //Editing array

        num[3]=9;
        System.out.println(num[3]);

    }
}
