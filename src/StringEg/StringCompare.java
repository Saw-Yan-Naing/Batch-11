package StringEg;

public class StringCompare {
    public static void main(String[] args) {
        String str="konichiwa";
        String str1= "Konbanwa";


        System.out.println(str.equals(str1));


        System.out.println(str.equalsIgnoreCase(str1));


        System.out.println(str.compareTo(str1));


        String str2= "Saw";
        String str3="Saw";
        String str4=new String("Saw ");

        boolean result= str2==str3;
        System.out.println(result);
        boolean result1 = str3==str4;
        System.out.println(result1);

        String str5="ab";
        String str6="bc";

        System.out.println(str5.compareTo(str6));


    }
}
