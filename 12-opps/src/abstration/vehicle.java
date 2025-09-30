package abstration;

public abstract class vehicle implements Interfaces {

    private int noOfTires;

//    public abstract void makeStartSound(){
//
//    }
    public abstract void makeStartSound();

    @Override
    public void getSetGo() {
        System.out.println("Going into place");
    }

    public vehicle(int noOfTires){
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires(){
        return noOfTires;
    }
    public void setNoOfTires(int noOfTires){
    }
    public void commute(){
        System.out.println("going..");
    }
}
