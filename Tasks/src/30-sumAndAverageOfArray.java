class sumAndAverageOfArray {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        int avg = average(numArray);
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements:  " + avg);

    }
    public static long sum(int[] myArr) {
        long sum = 0;
        int i = 0;
        while (i < myArr.length) {
            sum += myArr[i];
            i++;
        }
        return sum;
    }
    public static int average(int[] MyArr) {
        long sum = sum(MyArr);
        return (int) sum/ MyArr.length;
    }
}
