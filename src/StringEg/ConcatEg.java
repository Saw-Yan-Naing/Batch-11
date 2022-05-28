package StringEg;

import java.util.StringJoiner;

public class ConcatEg {
    public static void main(String[] args) {
        //concat
        "Hello".concat( " World.");
       String str= "Hello";
       String str1=" World.";

        System.out.println(str.concat(str1));

        //StringBuilder

      StringBuilder Str2=new StringBuilder("Saw Yan ");
        StringBuilder Str3=new StringBuilder("Naing");

        System.out.println(Str2.append(Str3));

        //space
        System.out.println(String.format("%s%s", str, str1));

        //StringJoiner

        StringJoiner stringJoiner=new StringJoiner(" ");

        stringJoiner.add("Good");
        stringJoiner.add("Morning");

        System.out.println(stringJoiner);

        //SUb string

        String name= "Bo Phyu maung";

        System.out.println(name.substring(3,7));

        //
        System.out.println("My name is Saw Yan Naing".split(" "));

        String [] arr= "myat linn htet naing.".split(" ");
        System.out.println(arr[3]);


    }

}


