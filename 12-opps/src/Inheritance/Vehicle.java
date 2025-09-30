package Inheritance;

public class Vehicle {

    private int noOfTires;

    public void setNoOfTires(int noOfTires){
        this.noOfTires = noOfTires;
    }

    public void commute() {
        System.out.printf("I am going from place A to place B using %d tires \n", noOfTires);

    }
}
