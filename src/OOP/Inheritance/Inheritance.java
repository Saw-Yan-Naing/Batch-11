package OOP.Inheritance;

class Parent{
    static int a = 12;

    void parent(){
        System.out.println("Parent class method is working.");
        System.out.println(a);
    }

}

//extend mean inheritance

class Child extends Parent{

     static double b=a;// Type casting

    void child(){
        System.out.println("Child class method is working.");
        System.out.println(b);
    }

    //Method overriding
    @Override
    void parent() {
        super.parent();
    }

    void child1(){
        System.out.println("Child1 method is working.");
    }

}

public class Inheritance {
    public static void main(String[] args) {

        //Type casting

        Child child=new Child();
        Parent parent=child;


        child.child();
        child.child1();

    }
}
