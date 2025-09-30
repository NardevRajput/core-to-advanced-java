package Questions.Question102;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight red = new TrafficLight(trafficLightColor.RED);
        TrafficLight yellow = new TrafficLight(trafficLightColor.YELLOW);
        TrafficLight green = new TrafficLight(trafficLightColor.GREEN);

        green.start();
        green.join();

        yellow.start();
        yellow.join();

        red.start();

    }
}
