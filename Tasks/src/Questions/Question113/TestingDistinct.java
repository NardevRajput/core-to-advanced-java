package Questions.Question113;

import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,8,6,78,8,2);
        List<Integer> DistinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(DistinctNumbers);
    }
}
