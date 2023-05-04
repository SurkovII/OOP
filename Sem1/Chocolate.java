package New_OOP.Sem1;

public class Chocolate extends Product {
    public final Integer weight;
    public Chocolate(String name, Integer cost, Integer weight) {
        super(name, cost);
        this.weight = weight;


    }
    @Override
    public String toString() {

        return String.format("%s, Вес %s грамм", super.toString(),  weight);
    }


}