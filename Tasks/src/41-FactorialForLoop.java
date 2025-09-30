import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int userNum = input.nextInt();
        long factorial =fact(userNum);
        System.out.println("your factorial is " + factorial);
    }
    public static long fact(int num) {
        long factValue = 1;
        for (int i = num; i >= 1; i-- ) {
            factValue = factValue * i;
        }
        return factValue;
    }
}
