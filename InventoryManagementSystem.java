import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private String specification;
    private double cost;
    private int quantity;

    public Product(String name, String specification, double cost, int quantity) {
        this.name = name;
        this.specification = specification;
        this.cost = cost;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Specification: " + specification);
        System.out.println("Cost: " + cost);
        System.out.println("Quantity: " + quantity);
    }
}

class Inventory {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getProductCount(String productName) {
        int count = 0;
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                count += product.getQuantity();
            }
        }
        return count;
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // Sample data
        Product product1 = new Product("Laptop", "15-inch, 8GB RAM, 256GB SSD", 999.99, 5);
        Product product2 = new Product("Smartphone", "6.5-inch, 128GB storage", 499.99, 10);
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        while (!exit) {
            System.out.println("========= Inventory Management System =========");
            System.out.println("1. Product List");
            System.out.println("2. Product Count");
            System.out.println("3. View Product Details");
            System.out.println("4. Edit Product");
            System.out.println("5. Update Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("===== Product List =====");
                    List<Product> productList = inventory.getProducts();
                    for (Product product : productList) {
                        System.out.println(product.getName());
                    }
                    break;

                case 2:
                    System.out.print("Enter product name: ");
                    scanner.nextLine(); 
                    String productName = scanner.nextLine();
                    int productCount = inventory.getProductCount(productName);
                    System.out.println("Total quantity of " + productName + ": " + productCount);
                    break;

                case 3:
                    System.out.print("Enter product name: ");
                    scanner.nextLine(); 
                    productName = scanner.nextLine();
                    Product product = null;
                    for (Product p : inventory.getProducts()) {
                        if (p.getName().equalsIgnoreCase(productName)) {
                            product = p;
                            break;
                        }
                    }
                    if (product != null) {
                        product.displayDetails();
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter product name: ");
                    scanner.nextLine(); /
                    productName = scanner.nextLine();
                    product = null;
                    for (Product p : inventory.getProducts()) {
                        if (p.getName().equalsIgnoreCase(productName)) {
                            product = p;
                            break;
                        }
                    }
                    if (product != null) {
                        System.out.print("Enter new product specification: ");
                        String specification = scanner.nextLine();
                        System.out.print("Enter new product cost: ");
                        double cost = scanner.nextDouble();
                        product.setSpecification(specification);
                        product.setCost(cost);
                        System.out.println("Product details updated successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter product name: ");
                    scanner.nextLine(); // Consume newline character
                    productName = scanner.nextLine();
                    product = null;
                    for (Product p : inventory.getProducts()) {
                        if (p.getName().equalsIgnoreCase(productName)) {
                            product = p;
                            break;
                        }
                    }
                    if (product != null) {
                        System.out.print("Enter quantity to add (positive) or delete (negative): ");
                        int quantityChange = scanner.nextInt();
                        int newQuantity = product.getQuantity() + quantityChange;
                        if (newQuantity < 0) {
                            System.out.println("Invalid operation. Quantity cannot be negative.");
                        } else {
                            product.setQuantity(newQuantity);
                            System.out.println("Inventory updated successfully.");
                        }
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 6:
                    exit = true;
                    System.out.println("Exiting Inventory Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
