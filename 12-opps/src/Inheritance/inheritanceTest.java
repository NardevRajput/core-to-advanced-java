package Inheritance;

public class inheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();


        twoWheeler twoWheeler = new twoWheeler();
        twoWheeler.balance();
        twoWheeler.commute();

        motorCycle motorCycle = new motorCycle();
        motorCycle.commute();
        motorCycle.balance();
        motorCycle.start();
    }
}
