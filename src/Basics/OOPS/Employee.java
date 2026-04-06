package Basics.OOPS;

interface sourav{
    private void show(){
        System.out.println("This method must be called for a change in exisitng function");
    }

    default void show1(){
        show();
    }

    default void show2(){
        show();
    }
}
public class Employee implements sourav{
    public static void main(String[] args) {

    }

    private void hello(){
        show1();
    }
}
