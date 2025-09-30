import java.util.Scanner;

class palindromeNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("Your number is palindrome");
        }else {
            System.out.println("Your number is not palindrome");
        }
    }
    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }
    public static int reverse(int num){
        int num1 = 0;
        while (num > 0){
            int digit = num % 10;
            num1 = num1 * 10 + digit;
            num = num / 10;
        }
        return num1;
    }
}