import java.util.Scanner;
class circle {

    double radiusInMm;

    circle(double radiusInMm){
        this.radiusInMm = radiusInMm;
    }

    double getCircumference() {
        return 2 * radiusInMm * Math.PI;
    }

    double getArea(){
        return Math.PI * Math.pow(radiusInMm, 2);
    }
    @Override
    public String toString(){
        return "circle properties: Radius in mm: \n" +radiusInMm
                + ", Circumference in mm: \n" +getCircumference()
                + ", Area in mm2: \n" + getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        circle circle = new circle(radius);
        System.out.println(circle);
    }
}
