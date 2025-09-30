import java.util.Scanner;

class numberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5, guess ;
        do {
            System.out.print("Please guess the number: ");
            guess = input.nextInt();
        } while (num != guess);
        System.out.println("you have successfully guess the number");
    }
}
