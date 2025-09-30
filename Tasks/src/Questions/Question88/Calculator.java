package Questions.Question88;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();

        try {
            int sum = firstNum / secondNum;
            System.out.printf("Sum is %d", sum);
        } catch (ArithmeticException exception) {
            if (exception.getMessage().equals("/ by zero")){
                System.out.println("Divide by zero occurred.");
            } else {
                throw exception;
            }
        }
    }
}
