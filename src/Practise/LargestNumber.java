package Practise;

public class LargestNumber {
    public static void main(String[] args) {

         int[] numbers={1,2,3,4,5,6,7,8,9};
         int largenum=1;

        for (int i = 0; i <numbers.length; i++) {
            if (largenum <numbers[i]){
                largenum=numbers[i];

            }

        }

        System.out.println(largenum);
        System.out.println("Therefore the largest number is "+ largenum+".");

        int smallnum=9;

        for (int i = 0; i < numbers.length; i++) {
            if (smallnum>numbers[i]){
                smallnum=numbers[i];
            }

        }
        System.out.println(smallnum);
        System.out.println("Threrefore the smallest number is "+smallnum+ ".");
    }
}
