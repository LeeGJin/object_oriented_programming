package Week13.ExceptionPractice1;

public class Hello {
    void sayHello(String name) throws HelloException {
        System.out.println("Hello " + name);
        throw new HelloException("Hello Exception...");
    }

    public static void main(String[] args) {
        Hello h = new Hello();
        try {
            h.sayHello("Hong Gil Dong");
        } catch (HelloException e) {
            System.out.println(e.getMessage());
        }
    }
}
