package Sem2;

public class Hare extends Herbivores implements Walkable, Flyable {

    public Hare(String name) {
        super(name);

    }

    @Override
    public String say() {
        return "Ffff";
    }

    @Override
    public String toString() {
        return String.format("Hare %s: ", super.toString());

    }

    @Override
    public int speedForWalk() {
        return 50;
    }

    @Override
    public int speedForFly() {
        return 0;
    }

}
