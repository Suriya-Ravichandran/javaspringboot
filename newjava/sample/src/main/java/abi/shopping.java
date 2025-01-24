package abi;
import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class ShoppingCart {
    ArrayList<Product> items = new ArrayList<>();

    void addToCart(Product product, int quantity) {
        // Check if the product is already in the cart
        for (Product item : items) {
            if (item.name.equals(product.name)) {
                item.quantity += quantity;
                return;
            }
        }

        // If not
        Product cartItem = new Product(product.name, product.price, quantity);
        items.add(cartItem);
    }

    double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.price * item.quantity;
        }
        return total;
    }
}

public class shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        // Sample products
        Product laptop = new Product("Laptop", 30000, 5);
        Product smartphone = new Product("Smartphone", 10000, 10);

        // Sample usage
        System.out.println("Welcome to the Online Shopping App!");

        // Simulate user adding items to the cart
        cart.addToCart(laptop, 2);
        cart.addToCart(smartphone, 3);

        // Display the cart and total
        System.out.println("Shopping Cart:");
        for (Product item : cart.items) {
            System.out.println(item.name + " - $" + item.price + " x " + item.quantity);
        }
        System.out.println("Total: $" + cart.calculateTotal());

        // Simulate the checkout process
        System.out.println("Proceed to checkout? (yes/no)");
        String proceed = scanner.next();

        if (proceed.equalsIgnoreCase("yes")) {
            // Implement payment
            System.out.println("Thank you for shopping with us!");
        } else {
            System.out.println("Shopping cart not processed. Have a great day!");
        }

        scanner.close();
    }
}