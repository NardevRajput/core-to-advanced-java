package FilterAndReduce;

import java.util.List;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Mango", "cherry", "Date");

        System.out.println(fruits.size());

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("\n");

 //       print fruits by function programming
//        fruits.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        //By filter function
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));
    }
}
