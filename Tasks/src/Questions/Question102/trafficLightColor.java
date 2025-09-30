package Questions.Question102;

public enum trafficLightColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private final int onTimeMills;

    public int getOnTimeMills() {
        return onTimeMills;
    }

    trafficLightColor(int onTimeMills) {
        this.onTimeMills = onTimeMills;
    }
}
