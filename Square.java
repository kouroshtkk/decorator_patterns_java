package shapes;

public class Square implements Shape {

    private final int side;

    public Square(int side) {
        this.side = Shape.checkIsPositive(side);
    }

    public int side() {
        return this.side;
    }

    @Override
    public double perimeter() { return 4 * this.side; }
    @Override
    public double area() {
        return this.side * this.side;
    }
    @Override
    public String toString() {
        return String.format("a square of side %d",this.side);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Square s)
            return side == s.side;
        return false;
    }

    @Override
    public final int hashCode() {
        return side;
    }

}
