package Week13.Exception;

public class ClassCastException {
    public static void main(String[] args) {
        Object o = new Integer(1);
        String s = (String) o;
        System.out.println(s);
    }
}
