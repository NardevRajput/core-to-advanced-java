import java.util.Scanner;

class palindrome_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String to be checked: ");
        String str = input.next();
        System.out.println("Your String is " + ((isPalindrome(str) ? "Palindrome" : "Not Palindrome")));
    }
    public static boolean isPalindrome(String str){
        if (str.length() <= 1){
            return true;
        }
        int LastPosition = str.length() - 1;
        if (str.charAt(0) != str.charAt(LastPosition)) {
            return false;
        }
        String newStr = str.substring(1, LastPosition);
        return isPalindrome(newStr);
    }
}
