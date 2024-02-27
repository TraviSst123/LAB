
package View;

import Addition.Validation;
import Model.Circle;
import Model.Rectangle;
import Model.Triangle;

public class View {
        Validation vl = new Validation();
    public void getInput(){
        System.out.println("=====Calculator Shape Program=====");
        double wr = vl.getDoubleAboveZeroFromInput("Please input side width of Rectangle: ");
        double lr = vl.getDoubleAboveZeroFromInput("Please input length of Rectangle: ");
        double rc = vl.getDoubleAboveZeroFromInput("Please input radius of Circle: ");
        double sidea = vl.getDoubleAboveZeroFromInput("Please input side A of Triangle: ");
        double sideb = vl.getDoubleAboveZeroFromInput("Please input side B of Triangle: ");
        double sidec = vl.getDoubleAboveZeroFromInput("Please input side C of Triangle: ");
        Circle circle = new Circle(rc);
        Rectangle rectangle = new Rectangle(lr, wr);
        Triangle triangle = new Triangle(sidea, sideb, sidec);
        System.out.println("\n-----Rectangle-----");
        System.out.println("Width: "+wr);
        System.out.println("Length: "+lr);
        System.out.println("Area: "+ rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("-----Circle-----");
        System.out.println("Radius: " + rc);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("-----Triangle-----");
        System.out.println("Side A: "+sidea);
        System.out.println("Side B: "+sideb);
        System.out.println("Side C: "+sidec);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
       
    }
}
