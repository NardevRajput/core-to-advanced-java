import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of triangle: ");
        float length = input.nextFloat();
        System.out.print("Enter Breath of Triangle: ");
        float breath = input.nextFloat();
        float result = ((length * breath)/2);
        System.out.println("Result: " + result);

    }
}
