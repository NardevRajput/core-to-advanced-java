package Questions.Question100;

public class thread extends Thread {
    private final int threadNumber;

    public thread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("(%d) %sHello from Thread %d\n",
                    (i + 1),
                    Thread.currentThread().getName(),
                    threadNumber);
        }
    }
}
