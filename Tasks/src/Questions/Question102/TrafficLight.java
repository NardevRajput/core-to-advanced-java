package Questions.Question102;

public class TrafficLight extends Thread{

    private final trafficLightColor color;


    public TrafficLight(trafficLightColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s active\n ", color );
        try {
            Thread.sleep(color.getOnTimeMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive\n ", color );
    }
}
