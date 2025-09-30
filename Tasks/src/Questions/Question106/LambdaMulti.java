package Questions.Question106;

import java.util.function.BinaryOperator;

public class LambdaMulti {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiplication = (a, b) -> a * b;
        int result = multiplication.apply(2, 8);
        System.out.println(result);
    }
}
