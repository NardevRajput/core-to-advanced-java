import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.next();

        //String catenation
        System.out.println("Hello " + name);

        System.out.print("Also enter your age: ");
        int age = input.nextInt();
        System.out.println("Your age is " + age);
    }
}
