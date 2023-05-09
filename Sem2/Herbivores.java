package Sem2;

public abstract class Herbivores extends Animal {
    public Herbivores(String name) {
        super(name);
    }

    public String feed() {
        return "grass";
    }

    @Override
    public String toString() {
        return String.format("Herbivores %s: ", super.toString());

    }
}
