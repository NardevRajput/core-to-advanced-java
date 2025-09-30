public class constructor {
        String brand;
        int modelYear;

        public constructor(String carBrand, int year) {
            brand = carBrand;
            modelYear = year;
        }

        public void displayInfo() {
            System.out.println("Brand: " + brand + ", Model Year: " + modelYear);
        }
        public static void main(String[] args) {
            // Creating objects using the constructor
            constructor myCar = new constructor("Toyota", 2020);
            constructor anotherCar = new constructor("Honda", 2022);
            myCar.displayInfo();
            anotherCar.displayInfo();
        }
}
