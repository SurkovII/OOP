package New_OOP.Sem1;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello");

        VendingMashine vendingMashine = new VendingMashine();
        vendingMashine.addProuct(new Product("chesse", 500))
        .addProuct(new Product("wine", 1000))
        .addProuct(new Product("bread", 100))
        .addProuct(new Yogurt("Danone", 100, "Chery"))
        .addProuct(new Parfume("Chanel", 2000, 200))
        .addProuct(new Milk("Milk", 200, 3.2))
        .addProuct(new Chocolate("Аленка", 100, 90));
        for (int i = 0; i < vendingMashine.getList().size(); i++) {
            System.out.println(vendingMashine.getList().get(i));
        }
        System.out.println("Поиск");
        Product find = vendingMashine.findProuct("Danone");
        System.out.println(find);
        System.out.println("Купили");
        Product sold = vendingMashine.selProduct(find);
        System.out.println(sold);
        System.out.println(vendingMashine.getAmount());
        for (int i = 0; i < vendingMashine.getList().size(); i++) {
            System.out.println(vendingMashine.getList().get(i));
        }
        System.out.println("____________");
        try {
            Product soldSec = vendingMashine.selProduct(vendingMashine.findProuct("Chavnel"));
            System.out.println(soldSec);
            System.out.println(vendingMashine.getAmount());
            
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < vendingMashine.getList().size(); i++) {
            System.out.println(vendingMashine.getList().get(i));
        }





    }
}
