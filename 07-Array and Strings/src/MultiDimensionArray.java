public class MultiDimensionArray {
    public static void main(String[] args) {

        //2D Array
        int[][] arr = new int[3][3];

        //row 1
        arr[0][0] = 989;
        arr[0][1] = 103;
        arr[0][2] = 452;

        //row 2
        arr[1][0] = 456;
        arr[1][1] = 421;
        arr[1][2] = 254;
         //row 3
        arr[2][0] = 278;
        arr[2][1] = 264;
        arr[2][2] = 789;

//        System.out.println(arr[0][0]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr[2][2]);

//        int[][] arr1 = {{1,2,3},{4,5,6}, {7,8,9}};
//        System.out.println(arr1.length);
//        System.out.println(arr1[0][0]);

        int i = 0;
        while (i < arr.length){
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
