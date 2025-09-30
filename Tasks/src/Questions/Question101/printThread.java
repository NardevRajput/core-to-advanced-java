package Questions.Question101;

public class printThread extends Thread {
    private final int threadNumber;

    public printThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
            System.out.printf("%s  Thread starting-%d\n",
                    Thread.currentThread().getName(),
                    threadNumber);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            System.out.printf("%s  Thread Ended-%d\n",
                    Thread.currentThread().getName(),
                    threadNumber);
    }
}
