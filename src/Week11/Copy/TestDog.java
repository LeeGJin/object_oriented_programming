package Week11.Copy;

public class TestDog {
    public static void main(String[] args) throws CloneNotSupportedException{
        Dog dog1 = new Dog(2, "js", "Poodle");
        Dog dog2 = (Dog) dog1.clone();
        Dog dog3 = dog1;

        dog1.setName("yj");
        dog1.setBreed("Bulldog");
        System.out.println("dog1 name: " + dog1.getName());
        System.out.println("dog1 breed: " + dog1.getBreed());
        System.out.println("dog1 age: " + dog1.getAge());
        System.out.println("dog2 name: " + dog2.getName());
        System.out.println("dog2 breed: " + dog2.getBreed());
        System.out.println("dog2 age: " + dog2.getAge());
        System.out.println("dog3 name: " + dog3.getName());
        System.out.println("dog3 breed: " + dog3.getBreed());
    }
}
