public class MethodBasics {

    // Method with no parameters and no return value
    public static void greetUser() {
        System.out.println("Hello, welcome to Java methods!");
    }

    // Method with parameters and no return value
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // Method with parameters and return value
    public static int multiply(int x, int y) {
        return x * y;
    }

    // Main method where execution starts
    public static void main(String[] args) {
        // Calling method without parameters
        greetUser();

        // Calling method with parameters
        printSum(5, 10);

        // Calling method with return value
        int result = multiply(4, 6);
        System.out.println("Multiplication Result: " + result);
    }
}
