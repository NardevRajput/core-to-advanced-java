package Encapsulation.packages;

import getterSetter.car;

public class GetterTest {

    public static void main(String[] args) {
        car car = new car("red", "maruti", 3, 500);
        System.out.printf("%s %s",car.getColor(), car.getModel());
    }
}
