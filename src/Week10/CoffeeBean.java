package Week10;

class CoffeeBean {
    String species = "Coffee";
    void print() {
        System.out.println(species);
    }
    void setSpecies(String s) {
        species = s;
    }
}

class Arabica extends CoffeeBean {
    @Override
    void print() {
        System.out.println("Arabica coffee..");
    }

    void print(String s) {
        System.out.printf("%s: %s\n", species, s);
    }
}

class Robusta extends CoffeeBean {
    String species = "Robusta";
}