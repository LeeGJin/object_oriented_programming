package Week11.Copy;

public class Dog implements Cloneable {
    int age;
    String name;
    String breed;

    public Dog(int age, String name, String breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public String getName() { return name; }
    public void setName(String n) { name = n; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getBreed() { return breed; }
    public void setBreed(String b) { breed = b; }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Dog dog = (Dog) super.clone();
        dog.age = age;
        dog.name = name;
        dog.breed = breed;
        return dog;
    }

}
