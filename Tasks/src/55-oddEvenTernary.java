import java.util.Scanner;

class oddEvenTernary {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = userInput.nextInt();
        String result = num % 2 == 0? "Even" : "Odd";
        System.out.println("Your number is " + result);
    }
}
