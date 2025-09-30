import java.util.Scanner;

class deleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to Delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.print("Here is your new Array: ");
        ArrayUtility.displayArray(newArr);
    }
    public static int[] deleteNumber(int[] numArr, int numberToDelete) {
        int occ = Occurrences.numOfOccurrences(numArr, numberToDelete);
        if (occ == 0) {
            return  numArr;
        }
        int newASize = numArr.length - occ;
        int[] newArr = new  int[newASize];

        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numberToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
