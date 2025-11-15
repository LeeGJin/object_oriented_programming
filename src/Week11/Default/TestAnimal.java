package Week11.Default;

class pig implements IAnimal {
    public String getSpecies() { return "pig"; }
    public String getSound() { return "oink"; }
}

class Chinchillas implements IAnimal {
    public String getSpecies() { return "Chinchillas"; }
}

public class TestAnimal {
    public static void printNameAndVocalization(IAnimal animal) {
        System.out.println("Species: " + animal.getSpecies());
        System.out.println("Vocalization: " + animal.getSound());
    }

    public static void main(String[] args) {
        IAnimal[] animals = { new pig(), new Chinchillas() };

        for (IAnimal animal : animals) {
            printNameAndVocalization(animal);
        }
    }
}
