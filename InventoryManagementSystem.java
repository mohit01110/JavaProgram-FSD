import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        String[] productNames = {
                "Mobile",
                "Laptop",
                "Tablet",
                "Portable HDD",
                "Bluetooth Headphone",
                "Smart-watch",
                "Digital Camera",
                "Portable Power bank",
                "Printer",
                "Wireless Router"
        };

        String[] specifications = {
                "Specifications for Mobile",
                "Specifications for Laptop",
                "Specifications for Tablet",
                "Specifications for Portable HDD",
                "Specifications for Bluetooth Headphone",
                "Specifications for Smart-watch",
                "Specifications for Digital Camera",
                "Specifications for Portable Power bank",
                "Specifications for Printer",
                "Specifications for Wireless Router"
        };

        double[] costs = {
                100.0,
                1000.0,
                500.0,
                80.0,
                50.0,
                200.0,
                300.0,
                30.0,
                150.0,
                80.0
        };

        int[] quantities = {
                10,
                5,
                20,
                15,
                30,
                25,
                8,
                12,
                7,
                10
        };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------------------------------------------------------------");
            System.out.println("Welcome to the SmartPoint Electronics Store");
            System.out.println("------------------------------------------------------------");
            System.out.println("1. View the complete list of our products");
            System.out.println("2. Check the available count for a specific product");
            System.out.println("3. View the specifications and details of a specific product");
            System.out.println("4. Modify the details of a specific product");
            System.out.println("5. Update the inventory for a specific product");
            System.out.println("6. Exit");
            System.out.print("Please choose an option from the above menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("------------------------------------------------------------");
                    System.out.println("List of all Products");
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Product ID   Product Name");
                    for (int i = 0; i < productNames.length; i++) {
                        System.out.printf("%10d   %s%n", (i + 101), productNames[i]);
                    }
                    break;
                case 2:
                    System.out.print("Enter the Product ID: ");
                    int productId = scanner.nextInt();
                    if (productId >= 101 && productId <= 110) {
                        int index = productId - 101;
                        System.out.println("------------------------------------------------------------");
                        System.out.printf("%d%s%n", productId, productNames[index]);
                        System.out.println("Total available count: " + quantities[index]);
                    } else {
                        System.out.println("Invalid Product ID!");
                    }
                    break;
                case 3:
                    System.out.print("Enter the Product ID: ");
                    productId = scanner.nextInt();
                    if (productId >= 101 && productId <= 110) {
                        int index = productId - 101;
                        System.out.println("------------------------------------------------------------");
                        System.out.printf("%d%s%n", productId, productNames[index]);
                        System.out.println("Total available count: " + quantities[index]);
                        System.out.println(specifications[index]);
                    } else {
                        System.out.println("Invalid Product ID!");
                    }
                    break;
                case 4:
                    System.out.print("Enter the Product ID: ");
                    productId = scanner.nextInt();
                    if (productId >= 101 && productId <= 110) {
                        int index = productId - 101;
                        System.out.println("------------------------------------------------------------");
                        System.out.printf("%d%s%n", productId, productNames[index]);
                        System.out.println("Total available count: " + quantities[index]);
                        System.out.print("Enter new specifications: ");
                        scanner.nextLine();
                        String newSpecifications = scanner.nextLine();
                        specifications[index] = newSpecifications;
                        System.out.println("Specifications updated successfully!");
                    } else {
                        System.out.println("Invalid Product ID!");
                    }
                    break;
                case 5:
                    System.out.print("Enter the Product ID: ");
                    productId = scanner.nextInt();
                    if (productId >= 101 && productId <= 110) {
                        int index = productId - 101;
                        System.out.println("------------------------------------------------------------");
                        System.out.printf("%d%s%n", productId, productNames[index]);
                        System.out.println("Total available count: " + quantities[index]);
                        System.out.println("1. Add inventory");
                        System.out.println("2. Subtract inventory");
                        System.out.print("Please choose an option from the above menu: ");
                        int option = scanner.nextInt();
                        if (option == 1) {
                            System.out.print("Current available inventory for " + productNames[index] + ": " + quantities[index]);
                            System.out.print("Please enter the count to be added: ");
                            int countToAdd = scanner.nextInt();
                            quantities[index] += countToAdd;
                            System.out.println("Inventory updated successfully!");
                        } else if (option == 2) {
                            System.out.print("Current available inventory for " + productNames[index] + ": " + quantities[index]);
                            System.out.print(" Please enter the count to be subtracted: ");
                            int countToSubtract = scanner.nextInt();
                            if (countToSubtract <= quantities[index]) {
                                quantities[index] -= countToSubtract;
                                System.out.println("Inventory updated successfully!");
                            } else {
                                System.out.println("Insufficient inventory to subtract!");
                            }
                        } else {
                            System.out.println("Invalid option!");
                        }
                    } else {
                        System.out.println("Invalid Product ID!");
                    }
                    break;
                case 6:
                    System.out.println("Thank you for visiting SmartPoint!");
                    return;
                default:
                    System.out.println("Invalid option!");
                    break;
            }

            System.out.println("------------------------------------------------------------");
            System.out.print("Enter 'Y' to return to the main menu or 'N' to Exit: ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("N")) {
                System.out.println("Thank you for visiting SmartPoint!");
                break;
            }
        }
    }
}