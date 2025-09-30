public class parameter {
    public static void main(String[] args) {
        int sum = sumTwoNumbers( 7, 5); //arguments
        System.out.println("Total: " + sum);

        System.out.println("Total: " + sumTwoNumbers(78, 45));

        System.out.println(sumTwoNumbers(2, 45));
    }
    public static int sumTwoNumbers(int num1, int num2) { //parameter
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
      //  int sum = num1 + num2;
      //  return sum;
        return num1 + num2;
    }
}
