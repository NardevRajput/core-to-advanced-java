import java.util.Scanner;

class occurrences_forEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = ArrayUtility.inputArray();
        System.out.print("enter the number you want to search: ");
        int element = input.nextInt();
        int occ = countOcc(num, element);
        System.out.println(occ);

    }
    public static int countOcc(int[] nums, int element){
        int occ = 0;
        for (int num : nums) {
            if (num == element) {
                occ++;
            } else {
                return -1;
            }
        }
        return occ;
    }
}
