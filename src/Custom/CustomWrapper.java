package Custom;

class Custom{
 public int num;

    //constructor

    Custom(int num){
        this.num=num;
    }

public String toString(){
        return "seven";
}

}

 public class CustomWrapper {
     public static void main(String[] args) {
         Custom obj = new Custom(7);

         System.out.println(obj.equals(7));
//         System.out.println(obj.num);

         obj.toString();
         System.out.println(obj.toString());


     }
 }
