package abstration;

public class car extends vehicle {

    private int noOfDoors;

    public car(){
        super(4);

    }

    @Override
    public void makeStartSound() {
        System.out.println("Car start");
    }
}
