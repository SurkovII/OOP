package New_OOP.Sem1;

public class Parfume extends Product {
    public final Integer value;
    public Parfume(String name, Integer cost, Integer value) {
        super(name, cost);
        this.value = value;

    }
    @Override
    public String toString() {
       return String.format("%s, Объем %s", super.toString(),  value);
    }
    
}
