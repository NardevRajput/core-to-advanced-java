package enums;

public enum TrafficLight {

    RED("Stop"), GREEN("GO"), YELLOW("Caution");

    private final String action;

    TrafficLight(String action) {
        this.action = action;
    }
}
