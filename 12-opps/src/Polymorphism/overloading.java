package Polymorphism;

public class overloading {

    overloading(){
        System.out.println("default constructor called");
    }
    overloading(String pop){
        System.out.println(pop);
    }

    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }

    public String add(String a, String b){
        return a + b;
    }

    public static void main(String[] args) {
        overloading overload = new overloading();
        System.out.println(overload.add("a", "b"));
        System.out.println(overload.add(5, 5));
    }
}
