import java.util.Scanner;

class swapTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("1st number: " + num1);
        System.out.println("2rd number: " + num2);
    }
}
