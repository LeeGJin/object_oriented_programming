package Week10.Practice2;

public class Circle extends Point {
    private double radius;

    public Circle(int xnew, int ynew, int rnew) {
        super(xnew, ynew);
        radius = rnew;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
