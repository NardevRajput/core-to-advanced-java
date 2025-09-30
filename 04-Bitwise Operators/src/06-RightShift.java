import java.util.Scanner;

class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise Operator");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int result = num >> 1;  // places / "integer division"
        System.out.println(result);
    }
}
