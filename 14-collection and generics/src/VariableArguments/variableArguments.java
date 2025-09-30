package VariableArguments;

public class variableArguments {
    public static void main(String... args) {
        System.out.println(sum(4, 5, 5, 8, 9));
        System.out.println(sum(5, 5, 4, 4, 2, 8));
    }

    public static int sum(int first, int second, int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
//    public static int sum(int a, int b) {
//        return a + b;
//    }
}
