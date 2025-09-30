class SortedArray {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        boolean isSorted = isIncrease(numArr);
        boolean NotSorted = isDecrease(numArr);
        if (isSorted || NotSorted) {
            System.out.println("Your Array is Sorted");
        }else {
            System.out.println("Your array is not Sorted");
        }
    }
    public static boolean isIncrease(int[] numArray) {
        int i = 1;
        while ( i < numArray.length) {
            if (numArray[i] < numArray[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecrease(int[] numArray){
        int i = 1;
        while ( i < numArray.length) {
            if (numArray[i] > numArray[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
