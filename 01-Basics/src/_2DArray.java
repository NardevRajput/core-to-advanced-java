import java.util.Scanner;

public class _2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows  = input.nextInt();
        System.out.print("Enter the columns: ");
        int cols  = input.nextInt();
        int[][] num = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                num[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(num[i][j] );
            }
        }
        System.out.println();
    }
}
