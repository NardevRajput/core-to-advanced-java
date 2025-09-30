package Questions.Question83;

public class testShapes {
    public static void main(String[] args) {
        circle circle = new circle(2.5);
        Square square = new Square(4);
        System.out.println(circle.calculateArea());
        System.out.println(square.calculateArea());
    }
}
