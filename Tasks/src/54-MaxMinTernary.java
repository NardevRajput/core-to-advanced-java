import java.util.Scanner;

class MaxMinTernary {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = userInput.nextInt();
        System.out.print("Enter second number: ");
        int num2 = userInput.nextInt();
        MaxMinTernary ternary = new MaxMinTernary();
        int min = ternary.isMaxMin(num1, num2);
        System.out.println(min);
    }
    public int isMaxMin(int num1, int num2){
        return num1 > num2? num1:num2;
    }
}
