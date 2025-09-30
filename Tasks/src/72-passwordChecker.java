import java.util.Scanner;

class passwordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.print("Enter your password: ");
            password = input.next();
        }while (!isValid(password));
        System.out.println("Thank for entering a valid password");
    }
    public static boolean isValid(String password){
        return password.length() > 6;
    }
}
