import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int size = input.nextInt();
        int[] numArr = new int[size];

        for (int i = 0; i < size; i++) {
            numArr[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println( numArr[i]);
        }
    }
}
