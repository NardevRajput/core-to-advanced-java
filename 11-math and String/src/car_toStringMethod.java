public class car_toStringMethod {
        int noOfWheels;
        int noOfDoors;
        int maxSpeed;
        String name;
        String modelNumber;
        String company;



        car_toStringMethod(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
            this.noOfDoors = noOfDoors;
            this.noOfWheels = noOfWheels;
            this.maxSpeed = maxSpeed;
            this.name = name;
            this.modelNumber = modelNumber;
            this.company = company;



        }


        @Override
        public String toString() {
            return "My car name is: " + name;
        }

        public static void main(String[] args) {
            car_toStringMethod swift = new car_toStringMethod(4, 5, 180, "swift", "isv456", "maruti");
            System.out.println(swift);
        }
}
