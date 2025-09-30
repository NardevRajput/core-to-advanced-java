import java.util.Scanner;

class multiTable_forLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to print multiplication table: ");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + (i * num));
        }
    }
}
