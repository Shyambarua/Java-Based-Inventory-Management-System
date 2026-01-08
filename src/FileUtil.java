import java.io.*;
import java.util.*;

public class FileUtil {

    private static final String FILE_PATH = "data/inventory.txt";

    public static List<Product> loadProducts() {
        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;

            while ((line = br.readLine()) != null) {
                products.add(Product.fromFileString(line));
            }
        } catch (IOException e) {
            System.out.println("No previous data found.");
        }

        return products;
    }

    public static void saveProducts(List<Product> products) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Product p : products) {
                bw.write(p.toFileString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving data.");
        }
    }
}
