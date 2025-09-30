import java.util.Scanner;

class studentScore_Ternary {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter marks number: ");
        int marks = UserInput.nextInt();
        String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println("Your category is " + category);
    }
}
