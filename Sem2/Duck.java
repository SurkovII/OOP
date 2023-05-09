package Sem2;

public class Duck extends Herbivores implements Flyable, Walkable {

    public Duck(String name) {
        super(name);

    }

    @Override
    public String say() {
        return "Krya - krya";
    }

    @Override
    public int speedForWalk() {
        return 5;
    }

    @Override
    public int speedForFly() {
        return 80;
    }

}
