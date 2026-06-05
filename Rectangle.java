package shapes;

import static java.util.Objects.hash;

public class Rectangle implements Shape {

    private final int width, height;

    public Rectangle(int width, int height) {
        this.width = Shape.checkIsPositive(width);
        this.height = Shape.checkIsPositive(height);
    }

    public int height() {
        return this.height;
    }

    public int width() {
        return this.width;
    }

    @Override
    public double perimeter() {
        return 2 * (this.width + this.height);
    }
    @Override
    public double area() {
        return this.width * this.height;
    }
    @Override
    public String toString() {
        return String.format("a rectangle of width %d and height %d", this.width, this.height);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Rectangle r)
            return this.width == r.width && this.height == r.height;
        return false;
    }

    @Override
    public final int hashCode() {
        return hash(this.width,this.height);
    }
}
