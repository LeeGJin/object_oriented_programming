package Week10.Practice3;

public class Point {
    private int x;
    private int y;

    public Point() {
    }
    public Point(int xnew, int ynew) {
        x = xnew;
        y = ynew;
    }
    public int getX() { return x; }
    public int getY() { return y; }

    @Override
    public String toString() {
        return "X: " + x + " Y: " + y;
    }
}
