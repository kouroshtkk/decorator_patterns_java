package shapes;

public record CircleRec(int radius) implements Shape {
    public CircleRec{
        Shape.checkIsPositive(radius);
    }
    @Override
    public double perimeter(){
        return 2 * Math.PI * this.radius;
    }
    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
    @Override
    public String toString(){
        return String.format("a circle of radius %d",radius);
    }
}
