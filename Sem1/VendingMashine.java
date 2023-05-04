package New_OOP.Sem1;

import java.util.ArrayList;
import java.util.List;

public class VendingMashine {
    List<Product> list = new ArrayList<>();
    private int amount=0;

    public int getAmount() {
        return amount;
    }

    public List<Product> getList() {
        return list;
    }

    public VendingMashine addProuct(Product product){
        list.add(product);
        return this;
    }
    public Product findProuct(String string){
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(string)) {
                return getList().get(i);
            }
        }
        return null;
    }

    public Product selProduct(Product product){
        try {
            Product prodFound = findProuct(product.getName());
            getList().remove(prodFound);
            amount += prodFound.getCost();    
            return prodFound;
            
        } catch (Exception e) {
            throw new RuntimeException("Товар не найден");
        }
    }
}
