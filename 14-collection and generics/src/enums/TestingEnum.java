package enums;

public class TestingEnum {

    public static void main(String[] args) {

        TrafficLight color = TrafficLight.RED;
        color = TrafficLight.GREEN;

        Grade grade = Grade.valueOf("D");

        for (Grade value : grade.values()) {
            System.out.println(value);
        }
    }
}
