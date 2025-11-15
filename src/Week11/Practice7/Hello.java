package Week11.Practice7;

public abstract class Hello {
    private String toWhom;

    public Hello(String whom) { toWhom = whom; }
    public String getWhom() { return toWhom; }
    public abstract void sayHello();
}
