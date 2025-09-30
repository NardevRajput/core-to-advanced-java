import java.util.Scanner;

class multiPlicationTable{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number: ");
        int num = input.nextInt();
        printMultiTable(num);
    }
    public static void printMultiTable(int num){
        int i = 1;
        while(i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }
}