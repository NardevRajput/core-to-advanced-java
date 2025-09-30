import java.util.Scanner;

class fibonacci_forLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many fibonacci number to print: ");
        int num = input.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int position){
        if (position == 0){
            return 0;
        }if (position == 1) {
            return 1;
        }
        return fibonacci(position - 1) + fibonacci(position - 2);
    }
}
