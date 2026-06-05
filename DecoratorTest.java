package shapes;

import java.awt.*;

public class DecoratorTest {

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        ColoredShape coloredCircle = new ColoredShape(circle, Color.blue);
        ColoredShape coloredCircle2 = new ColoredShape(circle, Color.red);
        assert !coloredCircle2.equals(coloredCircle);
        Square square = new Square(5);
        ColoredShape coloredSquare = new ColoredShape(square,Color.black);
        BorderedShape borderedSquare = new BorderedShape(square,3);
        BorderedShape borderedColoredSquare = new BorderedShape(new ColoredShape(square,Color.white),4);
        System.out.println(circle);
        // a circle of radius 4
        System.out.println(coloredCircle);
        // a circle of radius 4 with color java.awt.Color[r=0,g=0,b=255]
        System.out.println(coloredSquare);
        System.out.println(borderedSquare);
        System.out.println(borderedColoredSquare);
        assert circle.area() == coloredCircle.area();
        assert circle.perimeter() == coloredCircle.perimeter();
//        circle = coloredCircle; // error: ColoredShape not subtype of Circle
        Shape shape1 = circle; // ok
        Shape shape2 = coloredCircle; // ok

    }
}