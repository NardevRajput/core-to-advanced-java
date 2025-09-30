import java.util.Scanner;

class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("Your number is positive: " + num);
        }else if (num < 0) {
            System.out.println("Your number is negative: " + num);
        }else {
            System.out.println("Your number is zero: " + num);
        }
    }
}
