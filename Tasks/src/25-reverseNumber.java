import java.util.Scanner;

class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int num1 = printReverseNum(num);
        System.out.println(num1);


    }
    public static  int printReverseNum(int num) {
        int i = 0;
        while(num > 0) {
            int digit = num % 10;
            i = (i * 10) + digit;
            num = num / 10;
        }
        return i;
    }
}
