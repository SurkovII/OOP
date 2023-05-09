package Sem2;

public abstract class Predator extends Animal {
    public Predator(String name) {
        super(name);
    }

    public String feed() {
        return "meat";
    }

    @Override
    public String toString() {

        return String.format("Predator %s: ", super.toString());
    }

}
