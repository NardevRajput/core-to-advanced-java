import java.util.Scanner;

class GradeBasedMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        float physics = input.nextInt();
        System.out.print("Enter Chemistry marks: ");
        float chemistry = input.nextInt();
        System.out.print("Enter Maths marks: ");
        float maths = input.nextInt();
        System.out.print("Enter English marks: ");
        float english = input.nextInt();
        System.out.print("Enter Computer marks: ");
        float computer = input.nextInt();
        float percentage = ((physics + chemistry + maths + english + computer)/5);
        if (percentage >= 90) {
            System.out.println("You have got A");
        } else if (percentage >= 75) {
            System.out.println("You have got B");
        } else if (percentage >= 60) {
            System.out.println("You have got C");
        } else if (percentage >= 45) {
            System.out.println("You have got D");
        } else {
            System.out.println("You are fail");
        }
    }
}
