package shapes;

public record SquareRec(int side) implements Shape {
    public SquareRec{
        Shape.checkIsPositive(side);
    }
    @Override
    public double perimeter(){
        return 4 * side;
    }
    @Override
    public double area(){
        return side * side;
    }
    @Override
    public String toString(){
        return String.format("a square of side %d",side);
    }
}
