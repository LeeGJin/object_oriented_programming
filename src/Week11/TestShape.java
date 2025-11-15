package Week11;

public class TestShape {
    public static void interfaceFunc(IShape s) {
        System.out.println("area = " + s.getArea());
    }

    public static void main(String[] args) {
        IShape i = new ShapeImpl();
        interfaceFunc(i);
    }
}
