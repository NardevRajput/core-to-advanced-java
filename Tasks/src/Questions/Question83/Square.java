package Questions.Question83;

public class Square extends Shape {

    private final double sideInCm;

    public Square(double sideInCm) {
        this.sideInCm = sideInCm;
    }
    @Override
    public double calculateArea(){
        return Math.pow(sideInCm, 2);
    }


}
