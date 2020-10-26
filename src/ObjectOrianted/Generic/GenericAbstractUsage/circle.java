package ObjectOrianted.Generic.GenericAbstractUsage;

public class circle extends Shapes {

    private int radius;
    final double pi = 3.14;

    public circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double circumference() {
        return 2*pi*radius;
    }
}
