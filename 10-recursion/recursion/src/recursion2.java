public class recursion2 {
    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    }
    public static void printNum(int num) {
        if (num == 6) {
            return;
        }
        System.out.println(num);
        printNum( num + 1);
    }
}
