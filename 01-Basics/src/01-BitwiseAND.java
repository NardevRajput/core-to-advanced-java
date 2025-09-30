import java.util.Scanner;

class And {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise Operator");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int result = num1 & num2;
        System.out.println(result);
    }
}
// "&"  operator perform binary number