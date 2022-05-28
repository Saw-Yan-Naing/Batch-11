package Practise;

public class DuplicateArray {
    public static void main(String[] args) {

        int n[]={1,2,3,4,5,3,7,8,3};

        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j <n.length ; j++) {
                if (n[i]==n[j]){
                    System.out.print(n[i] + "\t");

                }
            }
        }

    }
    }