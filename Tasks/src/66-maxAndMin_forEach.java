import java.util.Scanner;

class maxAndMin_forEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Element: ");
        int size = input.nextInt();
        int[] arrSize = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element number " + (i + 1) + ": ");
            arrSize[i] = input.nextInt();
        }
        int maxArr = maxNum(arrSize);
        System.out.print("Maximum number is " + maxArr);
    }
    public static int maxNum(int[] arr ) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
}
