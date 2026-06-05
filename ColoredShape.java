package shapes;

import java.awt.Color;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

public class ColoredShape extends ShapeDecorator {

    private final Color color;

    public Color color(){return this.color;}

    public ColoredShape(Shape decorated, Color color) {
        super(decorated);
        this.color = requireNonNull(color);
    }
    @Override
    public String toString() {
        return String.format("%s with color %s", super.toString(), this.color);
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!super.equals(obj)) {
            return false;
        }
        ColoredShape other = (ColoredShape) obj;
        return super.equals(obj) && this.color.equals(other.color) ;
    }
    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(),color);
    }
}