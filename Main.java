import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void printItems() {
        System.out.println("Shopping Cart Items:");
        for (Product item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Product 1", 10.99);
        Product product2 = new Product("Product 2", 5.99);
        Product product3 = new Product("Product 3", 7.49);

        ShoppingCart cart = new ShoppingCart();

        cart.addItem(product1);
        cart.addItem(product2);
        cart.addItem(product3);

        cart.printItems();

        double total = cart.calculateTotal();
        System.out.println("Total: $" + total);

        cart.removeItem(product2);

        total = cart.calculateTotal();
        System.out.println("Updated Total: $" + total);
    }
}
