import java.util.Scanner;

class compoundInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal Amount: ");
        float p = input.nextFloat();
        System.out.print("Enter Rate of interest per Annum: ");
        float r = input.nextFloat();
        System.out.print("Enter Time Period in year: ");
        float t = input.nextFloat();
        float compInt = (p*t)*(1 + (r/100));
        System.out.println("Compound Interest is " + compInt);

    }
}
