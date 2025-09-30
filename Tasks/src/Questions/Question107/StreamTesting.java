package Questions.Question107;

import java.util.List;

public class StreamTesting {
    public static void main(String[] args) {
        List<String> names = List.of("Nardev", "lodhi", "Rajput");
        names.stream().forEach(name -> System.out.println(name));
    }
}
