package ExecutorService.Future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        FetchName task1 = new FetchName("Nardev");
        FetchName task2 = new FetchName("Lodhi");
        FetchName task3 = new FetchName("Rajput");

       Future<String> name1 = service.submit(task1);
       Future<String> name2 = service.submit(task2);
       Future<String> name3 = service.submit(task3);

        System.out.printf("\nFull name is %s ", name1.get());
        System.out.printf("\nFull name is %s ", name2.get());
        System.out.printf("\nFull name is %s ", name3.get());

        service.shutdown();
    }
}
