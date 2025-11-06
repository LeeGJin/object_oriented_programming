package Week10.Practice3;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point p, int rnew) {
        center = p;
        radius = rnew;
    }
    public Circle(int xnew, int ynew, int rnew) {
        center = new Point(xnew, ynew);
        radius = rnew;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
