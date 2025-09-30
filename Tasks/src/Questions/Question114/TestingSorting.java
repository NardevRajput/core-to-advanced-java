package Questions.Question114;

import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employee = List.of(
                new Employee("Prashant", 1000),
                new Employee("Mohan", 2000),
                new Employee("sohan", 500),
                new Employee("ram", 10000),
                new Employee("Mohan", 600)
        );
        employee.stream()
                .sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEachOrdered(System.out::println);
    }
}
