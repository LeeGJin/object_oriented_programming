package Week9.Practice2;

public class Person {
    private String name;
    private String phone;

    public Person (String n, String ph) {
        name = n;
        phone = ph;
    }
    public String getName() {return name;}
    public String getPhone() {return phone;}
    public String toString() {
        return "Name: " + name + " Phone: " + phone;
    }
}
