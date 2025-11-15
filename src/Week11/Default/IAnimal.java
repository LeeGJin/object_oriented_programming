package Week11.Default;

public interface IAnimal {
    public String getSpecies();
    default public String getSound() {
        return "squeak";
    }
}
