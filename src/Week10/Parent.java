package Week10;

public class Parent {
    private String name;

    public Parent() {
        System.out.println("Parent constructor (null)");
        name = null;
    }

    public Parent(String n) {
        System.out.println("Parent constructor");
        name = n;
    }
    public String getName() { return name; }
    public void setName(String n) { name = n; }
}
