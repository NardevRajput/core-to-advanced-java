package src;

import java.util.Scanner;

public class example_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Driving License portal");
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to drive");
        } else {
            System.out.println("You are not drive a car");
        }
    }
}