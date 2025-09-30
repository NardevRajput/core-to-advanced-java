import java.util.Scanner;

public class arraySearching  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {4, 5, 6, 7, 2, 12, 48, 65, 75, 18, 65, 456, 785, 452};
        System.out.print("Enter the number you want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("Your number is found");
        }else {
            System.out.println("Your number is not found");
        }

    }
    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}