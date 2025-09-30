public class array {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        arr[0] = 4;
//        arr[1] = 5;
//        arr[2] = 3;
//        arr[3] = 7;
//        arr[4] = 10;

        int[] arr = {4, 5, 3, 7, 10};

//         int index = 2;

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[index]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

        int index = 0;
        while (index < arr.length) {
            System.out.println(arr[index]);
            index++;
        }
    }
}
