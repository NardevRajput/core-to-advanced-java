import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter side A: ");
        float a = input.nextFloat();
        System.out.print("enter side B: ");
        float b = input.nextFloat();
        System.out.print("enter side C: ");
        float c = input.nextFloat();
        System.out.print("enter side D: ");
        float d = input.nextFloat();
        float per = a+b+c+d;
        System.out.println("Perimeter of rectangle is " + per);

    }
}
