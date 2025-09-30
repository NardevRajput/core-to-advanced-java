public class driver {
    public static void main(String[] args) {
        car myCar = new car();
//        myCar.driver();
//        myCar.addFuel(7);
//        System.out.println(myCar.getCurrentFuel());
//        myCar.driver();
//        System.out.println(myCar.getCurrentFuel());
//        myCar.driver();
//        myCar.addFuel(4);
//        myCar.driver();
//        myCar.driver();
//        myCar.driver();
//        myCar.driver();
//        myCar.driver();
//        myCar.driver();
//        myCar.driver();
//        System.out.println(myCar.getCurrentFuel());
        car swift = new car();
        System.out.println(swift.currentFuelInLiter);
        swift.addFuel(6);
        System.out.println(swift.currentFuelInLiter);
        swift.start();
        swift.driver();


    }
}
