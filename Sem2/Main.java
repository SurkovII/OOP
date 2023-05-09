package Sem2;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setRadio(new Radio());
        zoo.addList(new Wolf("Wolf"))
                .addList(new Wolf("Karl"))
                .addList(new Hare("Hare"))
                .addList(new Duck("DonaldDuck"))
                .addList(new Bat("Batman"))
                .addList(new Crocodale("Dandy"))
                .addList(new Fish("Shark"));
        for (var item : zoo.getListAnimal()) {
            System.out.println(item);

        }
        for (var item : zoo.getSayble()) {
            System.out.println(item.say());
        }

        for (var item : zoo.walkables()) {
            System.out.printf("%s - %d\n", item.toString(), item.speedForWalk());
        }

        System.out.println("_____________");
        for (var item : zoo.flyables()) {
            System.out.printf("%s - %d\n", item.toString(), item.speedForFly());
        }

        System.out.println("--------------");
        System.out.println("winner" + zoo.winnerWalk());
        System.out.println("--------------");
        System.out.println("winner" + zoo.winnerFly());

        System.out.println("--------------");
        System.out.println("winner" + zoo.winnerSwim());

    }

}
