public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double CalculateArea() {
        return Shape.PI*r*r;
    }

    @Override
    public double CalculatePerimeter() {
        return 2*Shape.PI*r;
    }
}
