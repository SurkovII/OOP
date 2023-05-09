package Sem2;

public class Bat extends Predator implements Flyable {

    public Bat(String name) {
        super(name);

    }

    @Override
    public String say() {
        return "Pi-pi-pi";
    }

    @Override
    public int speedForFly() {
        return 90;
    }

}
