public class recursionFactorial {
    public static  int factorial(int num) {
        if (num == 1 || num == 0){
            return 1;
        }
        int factNum =factorial(num - 1);
        int factNum2 = num * factNum;
        return factNum2;
    }
    public static void main(String[] args) {
        int num = 5;
        int ans = factorial(num);
        System.out.println(ans);

    }
}
