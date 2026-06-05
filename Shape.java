package shapes;

public interface Shape {
    static int checkIsPositive(int length){
        if(length<=0)
            throw new IllegalArgumentException("Non positive argument");
        return length;
    }

    double perimeter();

    double area();
}
