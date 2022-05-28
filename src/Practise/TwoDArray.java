package Practise;

public class TwoDArray {
    public static void main(String[] args) {

        //declaration 2D Array

        String str[][]=new String[2][4];

        //initialization 2D Array

        String str1[][]={{"Mg Mg","Zaw Zaw","Naing Naing"},
                {"Aung Aung","Aye Thein","Thida"},
                {"Saw Yan","Yan Naing","Chue😍"}
                };

        System.out.println(str1[2][2]);

        int num[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};

        //using for each loop

        for ( int[]num1:num) {
            for ( int num2 :num1) {
                System.out.print(num2+ "\t");
            }
        }

        System.out.println();

        //for double loop

        for (int i = 0; i < num.length; i++) {
            for (int i1 = 0; i1 < num[i].length; i1++) {
                System.out.print(num[i][i1]+",");
            }
        }

        }

    }