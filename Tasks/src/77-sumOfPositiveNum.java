import java.util.Scanner;

class sumOfPositiveNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int[] numArr = new int[num];


        for (int i = 0; i < num; i++) {
            System.out.print("Enter the element number " + (i + 1) + ": ");
            numArr[i] = input.nextInt();
        }
        int sum = 0;
        for (int num1 : numArr) {
            if (num1 < 0) {
                continue;
            }
            sum = sum + num1;
        }
        System.out.println("Sum is " + sum);
    }
}
