package Week11.Polymorphism;

public class TestTag {
    public static void main(String[] args) {
        ShapeTag s1 = new ShapeTag("shape1");
        System.out.println("Shape1 Tag : " + s1);

        ShapeTag s2 = new ShapeTag("shape2");
        System.out.println("Shape2 Tag: " + s2);

        RectangleTag r = new RectangleTag("shape", "rectangle");
        System.out.println("Rectangle Tags: " + r);

    }
}
