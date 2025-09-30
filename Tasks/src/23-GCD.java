import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int GCD = gcd(num1, num2);
        System.out.println(GCD);

    }
    public static int gcd(int first, int second) {
        int gcd = 1;
        int i = 2;
        int smallNum = smallNum(first , second);
        while (i <= smallNum) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static int smallNum(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
