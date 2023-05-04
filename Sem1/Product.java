package New_OOP.Sem1;

public class Product {
    private String name;
    public String getName() {
        return name;
    }


    private Integer cost;
    public void setCost(Integer cost) {
        this.cost = cost;
    }
    public Integer getCost() {
        return cost;
    }
    public Product(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }
    @Override
    public String toString() {
        return String.format("Продукт %s цена %d", name, cost);
    }


}
