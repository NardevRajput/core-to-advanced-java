package abstration;

public class testAbs {
    public static void main(String[] args) {
//        vehicle car = new vehicle(4);
        car car = new car();
        car.commute();   //vehicle class method used throw child class
        car.makeStartSound();
    }
}
