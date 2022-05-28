package Practise;

public class Practise {
    public static void main(String[] args) {

         int numbers[]={1,2,3,4,1,6,5,7,8,9,9};

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = i+1; j < numbers.length ; j++) {

                //Same number

                if(numbers[i]==numbers[j]){
                    System.out.println(numbers[j]);
                }
            }

           }

        //largest number in an array.

        int large=0;
        for (int i1 = 0; i1 < numbers.length; i1++) {
            if (large<numbers[i1]){
                large=numbers[i1];
            }

        }
        System.out.println("Therefore the largest number is "+ large+".");

        //Smallest number.

        int small=9;
        for (int i = 0; i < numbers.length; i++) {
            if (small>numbers[i]){
                small=numbers[i];

        }
        }
        System.out.println("Therefore the smallest number is "+small+".");

        //Coustom array copy.

        int copy[]=new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            copy[i]=numbers[i];
            System.out.print(copy[i]+"\t");
        }

    }
}
