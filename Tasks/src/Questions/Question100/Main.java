package Questions.Question100;

public class Main {
    public static void main(String[] args) {
        thread t1 = new thread(1);
        thread t2 = new thread(2);


        t1.start();
        t2.start();
    }
}
