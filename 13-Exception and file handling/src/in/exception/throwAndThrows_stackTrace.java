package in.exception;

import java.util.Scanner;

class throwAndThrows {
    public static void main(String[] args) {
        a();
    }
    private  static void a(){
        b();;
    }
    private  static void b(){
        c();;
    }
    private  static void c(){
        d();
    }
    private  static void d(){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator");
        System.out.println("Enter your two numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();

        try {
            int[] a = new int[5];
            System.out.printf("result is %d ", a[6]);
            a[6] = first / second;
            System.out.printf("result is %d ", a[6]);
        } catch (ArithmeticException exception) {
            System.out.printf("%s , enter valid values", exception.getMessage());
        } catch (Throwable th){
            System.out.println("general Exception");
            throw th;
        }
    }
}
