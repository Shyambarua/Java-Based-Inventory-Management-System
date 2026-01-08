import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InventoryService service = new InventoryService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Quantity");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Quantity: ");
                        int qty = sc.nextInt();
                        System.out.print("Price: ");
                        double price = sc.nextDouble();

                        service.addProduct(new Product(id, name, qty, price));
                        break;

                    case 2:
                        service.viewProducts();
                        break;

                    case 3:
                        System.out.print("Product ID: ");
                        service.updateQuantity(sc.nextInt(), sc.nextInt());
                        break;

                    case 4:
                        System.out.print("Product ID: ");
                        service.deleteProduct(sc.nextInt());
                        break;

                    case 5:
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input.");
                sc.nextLine();
            }
        }
    }
}
