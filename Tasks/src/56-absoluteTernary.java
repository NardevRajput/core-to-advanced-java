import java.util.Scanner;

class absoluteTernary {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = UserInput.nextInt();
        int result = num >= 0 ? num : -num;
        System.out.println("Absolute value is: " + result);
    }
}
