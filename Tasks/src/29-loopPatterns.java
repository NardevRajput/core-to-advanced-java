import java.util.Scanner;

class loopPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number os rows: ");
        int rows = input.nextInt();
        RightHalfPyramid(rows);
        reverseRightHalfPyramid(rows);
        leftHalfPyramid(rows);
    }
    public static void RightHalfPyramid(int maxRows) {
        System.out.println("\nHere is the Right half pyramid");
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while(i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();

            rows++;
        }
    }
    public static void reverseRightHalfPyramid(int NumOfRows) {
        System.out.println("\nHere is the Reverse Right half pyramid");
        int rows = NumOfRows;
        while (rows > 0) {
            int i = 1;
            while (i < rows) {
                System.out.print("* ");
                i++;
            }
            System.out.print("*");
            System.out.println();
            rows--;
        }

    }

    public static void leftHalfPyramid(int MaxRows) {
        System.out.println("\nHere is the Left half pyramid");
        int rows = MaxRows;
        while (rows > 0) {
            int j = 0;
            while (j < rows -1) {
                System.out.print("  ");
                j++;
            }
            int i = 1;
            while(i <= (MaxRows - rows)) {
                System.out.print("* ");
                i++;
            }
            System.out.print("*");
            System.out.println();
            rows--;
        }
    }

}
