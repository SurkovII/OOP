package New_OOP.Sem1;

public class Yogurt extends Product {

    public final String flavor;
    public Yogurt(String name, Integer cost, String flavor) {
        super(name, cost);
        this.flavor = flavor;
        
    }
    @Override
    public String toString() {

        return super.toString() + " Вкус " + flavor;
    }
    
}
