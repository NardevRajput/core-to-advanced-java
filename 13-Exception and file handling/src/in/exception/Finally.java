package in.exception;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        try {

            int result = first / second;
            System.out.printf("Result is %d", result);
        } catch (ArithmeticException exception) {
            System.out.println("Enter valid value");
        } finally {
            System.out.println("I am in finally");
        }

    }
}
