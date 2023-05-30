package square;

public abstract class Parallelogram implements Figure {

    public final double a;

    protected Parallelogram(double a) {
        this.a = a;
    }

    public abstract double getArea();

}
