package ExecutorService;

import MultiThreding.runnable.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SingleThreadExecutorService {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        PrintTask task1 = new PrintTask('*');

        service.submit(task1);
        service.shutdown();
    }
}