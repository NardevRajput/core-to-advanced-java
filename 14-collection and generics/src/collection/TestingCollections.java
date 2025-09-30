package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();

        numList.add(8);
        numList.add(99);
        numList.add(78);
        numList.add(56);
        numList.add(63);

        Collections.sort(numList);
        utility.printCollection(numList);

        Collections.reverse(numList);
        utility.printCollection(numList);


//        UnsupportedOperationException
//        List<Integer> unmodifiable = Collections.unmodifiableList(numList);
//        unmodifiable.add(45);

    }
}
