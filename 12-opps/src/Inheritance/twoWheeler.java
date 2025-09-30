package Inheritance;

public class twoWheeler extends Vehicle{

    twoWheeler() {
      setNoOfTires(2);
    }

    public void balance() {
        System.out.println("I am balancing tow tires");
    }

}
