package square;

public class Rectangle extends Parallelogram {
    // Длины сторон прямоугольника
    private final double b;

    protected Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public Rectangle(double a) {
        super(a);
        b = 0;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
