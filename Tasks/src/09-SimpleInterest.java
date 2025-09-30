import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner simpleInt = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double p = simpleInt.nextDouble();
        System.out.print("Enter Time Period in year: ");
        double t = simpleInt.nextDouble();
        System.out.print("Enter Rate of interest per annum: ");
        double r = simpleInt.nextDouble();
        double simpleInterest = (p*t*r)/100;
        System.out.println("simple Interest is "+ simpleInterest);
    }
}
