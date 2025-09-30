public class car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiter;
    int noOfSheets;



    public car start() {
        if (currentFuelInLiter == 0) {
            System.out.println("car is out of fuel, can not start");
        } else if (currentFuelInLiter < 5) {
            System.out.println("car is reserved model, please refuel");
            currentFuelInLiter--;
        } else {
            System.out.println("car is started");
            currentFuelInLiter--;
        }
        return this;
    }

    //method 2 driver
    public void driver() {
        currentFuelInLiter--;
        System.out.println("Car is driving");
    }


    //method 2 addFuel
    public void addFuel(float fuel) {
        currentFuelInLiter = currentFuelInLiter + fuel;
    }

    //method 3 getCurrentFuel
    public float getCurrentFuel() {
        return currentFuelInLiter;
    }
}
