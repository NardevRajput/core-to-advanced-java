package Lambda;

public class TestingLambda {
    public static void main(String[] args) {
        System.out.println("Hello world");
        TestingLambda test = new TestingLambda();
        int sum = test.sum(6,9);
        test.printString("this is java course");


        //  lambda
        //  toPrint -> System.out.println(toPrint);


        // single line function
        //(a, b) -> a + b;


        //multi line function
        //(a, b) -> {
        // int sum = a + b;
        // System.out.print(sum);
        // }


    }
    public void printString(String toPrint) {
        System.out.println(toPrint);
    }

    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
