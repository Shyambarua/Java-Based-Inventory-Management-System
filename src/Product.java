public class Product {

    // DATA MEMBERS (STATE)
    private int id;
    private String name;
    private int quantity;
    private double price;

    // CONSTRUCTOR
    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // GETTER
    public int getId() {
        return id;
    }

    // SETTER
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // DISPLAY FORMAT
    public String toString() {
        return id + " | " + name + " | " + quantity + " | " + price;
    }

    // FILE SAVE FORMAT
    public String toFileString() {
        return id + "," + name + "," + quantity + "," + price;
    }

    // FILE READ FORMAT
    public static Product fromFileString(String line) {
        String[] data = line.split(",");
        return new Product(
                Integer.parseInt(data[0]),
                data[1],
                Integer.parseInt(data[2]),
                Double.parseDouble(data[3])
        );
    }
}
