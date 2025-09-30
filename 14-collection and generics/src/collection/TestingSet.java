package collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        System.out.println(names.add("Nardev"));
        System.out.println(names.add("Rajput"));
        utility.printCollection(names);

        System.out.println(names.add("Nardev"));

        System.out.println(names.size());

        System.out.println(names.contains("Rajput"));

        System.out.println(names.remove("Rajput"));
        System.out.println(names.size());
        utility.printCollection(names);
    }
}
