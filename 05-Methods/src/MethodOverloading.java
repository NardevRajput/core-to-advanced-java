public class MethodOverloading {

    // Method with 1 int parameter
    public static void display(int a) {
        System.out.println("Method with 1 int: " + a);
    }

    // Method with 2 int parameters
    public static void display(int a, int b) {
        System.out.println("Method with 2 ints: " + a + ", " + b);
    }

    // Method with 1 double parameter
    public static void display(double a) {
        System.out.println("Method with 1 double: " + a);
    }

    // Method with String parameter
    public static void display(String message) {
        System.out.println("Method with String: " + message);
    }

    // Main method
    public static void main(String[] args) {
        // Method Overloading in action
        display(5);
        display(10, 20);
        display(3.14);
        display("Hello Java!");
    }
}
