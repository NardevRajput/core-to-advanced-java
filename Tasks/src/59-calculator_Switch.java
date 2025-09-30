import java.util.Scanner;

class calculator_Switch {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = userInput.nextInt();
        System.out.print("Enter second number: ");
        int num2 = userInput.nextInt();

        System.out.print("Enter the operator: ");
        String operator = userInput.next();


       int result = switch (operator) {
           case "+" -> num1 + num2;
           case "-" -> num1 - num2;
           case "*" -> num1 * num2;
           case "/" -> num1 / num2;
           case "%" -> num1 % num2;
           default -> -1;
       };
        System.out.println(result);
    }
}
