import java.util.Scanner;

class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first decimal number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second decimal number: ");
        double num2 = input.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }
}
