package collection;

import java.util.Collection;

public class utility {
//
//    public static void printCollection(Collection collection) {
//        for (Object coll : collection) {
//            System.out.printf("%s ", coll.toString());
//        }
//    }

    public static <E> void printCollection(Collection<E> collection) {
        System.out.print("Collection is: ");
        for (E coll : collection) {
            System.out.printf("%s ", coll);
        }
        System.out.println();
    }
}
