package Encapsulation.packages;

public class AccessTest {
    public static void main(String[] args) {
        car_publicClass Car = new car_publicClass();
        Car.color = "red";
        Car.model = "swift";
        System.out.println(Car);

        car_publicClass newCar = new car_publicClass("Black", "BMW", 1, 50000);
        System.out.println(newCar);

        Default def = new Default();
    }
}
