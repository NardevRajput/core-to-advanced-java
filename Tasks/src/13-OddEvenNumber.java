import java.util.Scanner;

class OddEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter you number: ");
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.println("Your number is Even: " + num);
        }else {
            System.out.println("Your number is Odd: " + num);
        }
    }
}
