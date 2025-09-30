import java.util.Scanner;

public class addTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input Integers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum: " + sum);

        //input String
        System.out.print("Enter your first name: ");
        String firstName = input.next();
        System.out.print("Enter last name: ");
        String lastName = input.next();
        System.out.println("Hello " + firstName + lastName);

    }
}
