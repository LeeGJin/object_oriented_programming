package Week10;

public class TestGetClass {
    public static void main(String[] args) {
        CoffeeBean c = new CoffeeBean();
        System.out.println("c의 클래스는: " + c.getClass());
        Arabica a = new Arabica();
        System.out.println("a의 클래스는: " + a.getClass());
        Robusta r = new Robusta();
        System.out.println("r의 클래스는: " + r.getClass());

        Arabica coffeeBean = new Arabica();
        coffeeBean.print();
        coffeeBean.print("wow");
    }
}
