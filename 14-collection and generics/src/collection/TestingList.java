package collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("nardev");
        strList.add("rajput");
        strList.add(1, "lodhi");

//        strList.add(45);  add in the list

        strList.remove(1);

//        System.out.println(strList.get(0));

        if (strList.contains("rajput")) {
            System.out.println(strList.indexOf("rajput"));
        }

        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i));
        }
        for (String str : strList) {
            System.out.print(str);
        }
    }
}
