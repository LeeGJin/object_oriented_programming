package Week10;

public class TestParentChild {
    void showNameAndValue(Parent base) {
        System.out.println(base.getName());
        //System.out.println(base.getValue);
    }

    public static void main (String[] args) {
        TestParentChild tpc = new TestParentChild();
        Child derived = new Child("child", 0);
        tpc.showNameAndValue(derived);
    }

    Parent base2 = new Parent("parent");
    Child derived3 = (Child) base2;
}
