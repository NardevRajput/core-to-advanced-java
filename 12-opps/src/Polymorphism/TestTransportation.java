package Polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();

//        castTest(v);
        castTest(c);

        Vehicle vCar = new Car();
//        Car cVeh = new Vehicle();
//        Car cVehicle = (Car) new Vehicle();
        Object ref = new Vehicle();
    }

    private static void castTest(Vehicle veh){
        veh.start();
        Car cVeh = (Car) veh;
        ((Car) veh).numOfDoors();

        if (veh instanceof Car){

        }
    }
}
