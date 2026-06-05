package shapes;

public class Circle implements Shape {

    private final int radius;

    protected Circle(int radius) {
        this.radius = Shape.checkIsPositive(radius);
    }

    public int radius() {
        return this.radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
    @Override
    public String toString() {
        return String.format("a circle of radius %d",this.radius);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Circle c)
            return this.radius == c.radius;
        return false;
    }

    @Override
    public final int hashCode() {
        return  this.radius;
    }

}