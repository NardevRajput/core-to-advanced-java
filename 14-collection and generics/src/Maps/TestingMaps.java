package Maps;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Age", 24);
        map.put("RollNumber", 100);
        map.put("Section", 3);
        map.put("Marks", 100);

        System.out.println(map.size());
        System.out.println(map.get("Marks"));
        System.out.println(map.containsKey("Section"));
        System.out.println(map.containsKey("name"));
        System.out.println(map.remove("Section"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key , map.get(key));
        }
    }
}

