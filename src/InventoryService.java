import java.util.*;

public class InventoryService {

    private List<Product> products;

    public InventoryService() {
        products = FileUtil.loadProducts();
    }

    public void addProduct(Product product) {
        if (findById(product.getId()) != null) {
            System.out.println("Product ID already exists.");
            return;
        }
        products.add(product);
        FileUtil.saveProducts(products);
        System.out.println("Product added.");
    }

    public void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("ID | Name | Qty | Price");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void updateQuantity(int id, int qty) {
        Product p = findById(id);
        if (p == null) {
            System.out.println("Product not found.");
            return;
        }
        p.setQuantity(qty);
        FileUtil.saveProducts(products);
        System.out.println("Quantity updated.");
    }

    public void deleteProduct(int id) {
        Product p = findById(id);
        if (p == null) {
            System.out.println("Product not found.");
            return;
        }
        products.remove(p);
        FileUtil.saveProducts(products);
        System.out.println("Product deleted.");
    }

    private Product findById(int id) {
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public List<Product> getAllProducts() {
    return products;
}
}
