package square;

public class Square extends Rectangle {
    public Square(double a) {
        super(a);
    }


    // Длина стороны квадрата


    @Override
    public double getArea() {
        return a * a;
    }
}
