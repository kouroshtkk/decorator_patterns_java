package shapes;

public class BorderedShape extends ShapeDecorator {
    private final int borderWidth;
    public int borderWidth(){
        return this.borderWidth;
    }
    public BorderedShape(Shape decorated,int border){
        super(decorated);
        this.borderWidth=border;
    }
    @Override
    public String toString() {
        return String.format("%s with border %s", super.toString(), this.borderWidth);
    }
}
