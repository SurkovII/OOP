package New_OOP.Sem1;

public class Milk extends Product {
    public final Double fatContent;

    public Milk(String name, Integer cost, Double fatContent) {
        super(name, cost);
        this.fatContent = fatContent;

    }

    @Override
    public String toString() {
        return String.format("%s, жирность %s", super.toString(), fatContent);
    }
    
}
