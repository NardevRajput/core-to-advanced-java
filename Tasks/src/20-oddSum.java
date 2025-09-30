import java.util.Scanner;

class oddSum{
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Your number: ");
         int num = input.nextInt();
         int OddSum = printOddSum(num);
         System.out.println(OddSum);

     }
     public static int printOddSum(int num) {
         int i = 1;
         int sum = 0;
         while(i <= num) {
             sum += i;
             i += 2;
         }
         return sum;
     }
 }