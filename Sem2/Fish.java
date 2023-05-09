package Sem2;

public class Fish extends Predator implements Swimmable {

    public Fish(String name) {
        super(name);

    }

    @Override
    public String toString() {
        return String.format("Fish %s", super.toString());
    }
    @Override
    public String say() {
        return "bul - bul";
    }

    @Override
    public int speedForSwim() {
        return 15;

    }

}
