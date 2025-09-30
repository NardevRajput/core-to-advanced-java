import java.util.Scanner;

class FahrenheitToCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit: ");
        float temp = input.nextFloat();
        float cel = ((temp - 32)*5) / 9;
        System.out.println("Celsius: "+ cel);
    }
}
