package shapes;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

public abstract class ShapeDecorator implements Shape {
    private final Shape decorated;    // the object to be decorated

    protected ShapeDecorator(Shape decorated) {
        this.decorated = requireNonNull(decorated);
    }

    public Shape decorated(){ return this.decorated; };

    @Override
    public double perimeter() {
        return decorated.perimeter(); // delegated
    }
    @Override
    public double area() {           // delegated
        return decorated.area();
    }
    @Override
    public String toString() {       // delegated
        return decorated.toString();
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if(obj==null || this.getClass() != obj.getClass())
        {
            return false;
        }
        ShapeDecorator otherBox = (ShapeDecorator) obj;
        return this.decorated.equals(otherBox.decorated());
    }
    @Override
    public int hashCode(){
        return decorated.hashCode();
    }
}