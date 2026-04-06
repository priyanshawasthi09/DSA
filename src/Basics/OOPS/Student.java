package Basics.OOPS;

class Info {
    private String address;
    private String name;
    private int age;

    public Info(int age, String name, String address){
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }

}

public class Student{
    public static void main(String[] args) {
        Info info = new Info(19, "Priyansh", "Address");
        System.out.println(info. getName());
        System.out.println(info.getAge());
        System.out.println(info.getAddress());
    }
}