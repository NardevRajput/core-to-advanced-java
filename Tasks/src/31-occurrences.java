import java.util.Scanner;

class Occurrences {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to Search: ");
        int num = input.nextInt();
        int occurrence = numOfOccurrences(numArray, num);
        System.out.println("Your element is found " + occurrence + " times ");

    }
    public static int numOfOccurrences(int[] numArr, int num) {
        int occ = 0;
        int i = 0;
        while (i < numArr.length) {
            if (numArr[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
