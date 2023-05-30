package square;

public class Rhombus extends Parallelogram {

    private final double h;

    protected Rhombus(double a, double h) {
        super(a);
        this.h = h;
    }


    @Override
    public double getArea() {
        return a * h;
    }
}
