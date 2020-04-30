public class Prism implements Shape, OjectShape {
    private double a,b,h;

    public Prism(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double VolumeCalculate() {
        return CalculateArea()*h;
    }

    @Override
    public double CalculateArea() {
        return a*b;
    }

    @Override
    public double CalculatePerimeter() {
        return 2*a+2*b;
    }
}
