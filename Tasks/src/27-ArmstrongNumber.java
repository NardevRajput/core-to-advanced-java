import java.util.Scanner;

class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

    }
    public static int isArmstrong(int num) {
        return 0;
    }
    public static int digits(int num) {
        int i = 0;
        while (num > 0) {
             i++;
             num = num / 10;
        }
        return num;
    }
    public static int pow(int num){
        int sum = 0;
        int i = 1;
        while (num > 0) {
            sum  = (sum * i) + i;
            num = num / 10;
        }
        return sum;
    }
}