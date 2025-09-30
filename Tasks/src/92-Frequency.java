import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Frequency {
    public static void main(String[] args) {
        List<Integer> List = Arrays.asList(1,2,4,5,6,1,7,58,5,62);
        System.out.println(Collections.frequency(List, 1));
        System.out.println(Collections.frequency(List, 5));
        System.out.println(Collections.frequency(List, 6));
        System.out.println(Collections.frequency(List, 78));
        System.out.println(Collections.frequency(List, 3));
    }
}
