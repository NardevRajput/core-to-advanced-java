import java.util.Scanner;

class Month {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter your month number: ");
        int num = UserInput.nextInt();
        String month = getMonth(num);
        System.out.println(month);

    }
    public static String getMonth(int MonthNum) {
        return switch (MonthNum) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Mars Month";
        };
    }
}
