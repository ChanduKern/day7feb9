import java.util.ArrayList;

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {

        ArrayList<Product> cart = new ArrayList<>();

        cart.add(new Product("Pen", 10));
        cart.add(new Product("Notebook", 50));
        cart.add(new Product("Bag", 500));

        int total = 0;
        for (int i = 0; i < cart.size(); i++) {
            total = total + cart.get(i).price;
        }

        System.out.println("Total Bill: " + total);
    }
}
