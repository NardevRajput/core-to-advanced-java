package collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);


//        for (Integer i : queue) {
//            System.out.print(i);
//        }

        utility.printCollection(queue);

        System.out.println(queue.peek());
        System.out.println(queue.element());

        System.out.println(queue.remove());
        utility.printCollection(queue);
        System.out.println(queue.peek());

        System.out.println(queue.poll());
        utility.printCollection(queue);

        System.out.println(queue.poll());
    }
}
