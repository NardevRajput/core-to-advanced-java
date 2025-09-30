package Questions.Question77.utils;

import Questions.Question77.geomerty.circle;
import Questions.Question77.geomerty.rectangle;

public class calculator {
    public static void main(String[] args) {
        circle cir = new circle(5.5);
        rectangle rect = new rectangle(5, 70);
        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rect.breath * rect.breath;
        System.out.printf("Area of circle %f , and Area of rectangle is %f", cirArea, rectArea);
    }
}
