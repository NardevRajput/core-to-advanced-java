import java.util.Scanner;

class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        System.out.print("Fibonacci series is: ");
        printFibonacciSeries(num);

    }
    public static void printFibonacciSeries(int num) {
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");

        int first = 0;
        int second = 1;
        while(first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }

}
