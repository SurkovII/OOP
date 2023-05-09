package Sem2;

public class Crocodale extends Predator implements Swimmable, Walkable {

    public Crocodale(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Crocodale %s", super.toString());
    }

    @Override
    public String say() {
        return "Rrrrr";
    }

    @Override
    public int speedForSwim() {
        return 50;
    }

    @Override
    public int speedForWalk() {
        return 10;
    }
    
}
