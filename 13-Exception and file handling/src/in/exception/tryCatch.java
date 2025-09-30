package in.exception;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator");
        System.out.println("Enter your two numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();

        try {
            int result = first / second;
            System.out.printf("Result is %d ", result);
        } catch (ArithmeticException exception) {
            System.out.printf("%s , enter valid values", exception.getMessage());
        } catch (Throwable th){
            System.out.println("general Exception");
            throw th;
        }
    }
}
