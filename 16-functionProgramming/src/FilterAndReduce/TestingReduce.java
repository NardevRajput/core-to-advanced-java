package FilterAndReduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 9, 8);
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println(sum);

        //by reduce
        int newSum = numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });
        System.out.printf("\nsum using reduce %d\n", newSum);


        //by lambda
        int newSum2 = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("sum using lambda " + newSum2);


        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("max using reduce " + max);
    }
}
