package Week10.Practice3;

public class TestCircle {
    public static void main(String[] args) {
        Circle myCircle = new Circle(10, 10, 5);
        double myArea = myCircle.getArea();
        double myCircumference = myCircle.getCircumference();

        System.out.printf("원 면적: %.2f\n", myArea);
        System.out.printf("원 둘레: %.2f\n", myCircumference);

        Point p = new Point(10, 10);
        Circle myCircle2 = new Circle(p, 5);
        double myArea2 = myCircle2.getArea();
        double myCircumference2 = myCircle2.getCircumference();

        System.out.printf("원2 면적: %.2f\n", myArea);
        System.out.printf("원2 둘레: %.2f\n", myCircumference);
    }
}
