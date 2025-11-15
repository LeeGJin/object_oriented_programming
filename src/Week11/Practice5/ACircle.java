package Week11.Practice5;

public class ACircle extends Shape {
    private double radius;

    public ACircle(double radius) { this.radius = radius; }
    @Override
    public double getArea() { return Math.PI * radius * radius; }
    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
}
