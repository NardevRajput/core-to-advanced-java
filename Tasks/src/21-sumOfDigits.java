import java.util.Scanner;

class sumOfDigits{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum = printSum(num);
        System.out.println(sum);

    }
    public static int printSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;

        }
        return sum;
    }

}