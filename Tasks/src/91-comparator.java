import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class comparator {
    public static void main(String[] args) {
        List<String> List = Arrays.asList("Bear", "Lion", "Ant");
        sortInDescending(List);
        System.out.println(List);
        System.out.println(List);
    }
    public static void sortInDescending(List<String> StringList) {
//        Collections.sort(StringList);
        Collections.sort(StringList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.equals(s2)) {
                    return 0;
                } else if (s1.charAt(0) < s2.charAt(0)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
}
