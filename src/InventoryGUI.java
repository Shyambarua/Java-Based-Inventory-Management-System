import javax.swing.*;
import java.awt.*;

public class InventoryGUI extends JFrame {

    private InventoryService service = new InventoryService();

    private JTextField idField, nameField, qtyField, priceField;
    private JTextArea outputArea;

    public InventoryGUI() {
        setTitle("Inventory Management System");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ---------- Input Panel ----------
        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 10, 10));

        idField = new JTextField();
        nameField = new JTextField();
        qtyField = new JTextField();
        priceField = new JTextField();

        inputPanel.add(new JLabel("Product ID"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Name"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Quantity"));
        inputPanel.add(qtyField);
        inputPanel.add(new JLabel("Price"));
        inputPanel.add(priceField);

        // ---------- Button Panel ----------
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 10, 10));

        JButton addBtn = new JButton("Add");
        JButton viewBtn = new JButton("View");
        JButton updateBtn = new JButton("Update Qty");
        JButton deleteBtn = new JButton("Delete");

        buttonPanel.add(addBtn);
        buttonPanel.add(viewBtn);
        buttonPanel.add(updateBtn);
        buttonPanel.add(deleteBtn);

        // ---------- Output Area ----------
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // ---------- Layout ----------
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(inputPanel, BorderLayout.CENTER);
        topPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // ---------- Button Actions ----------
        addBtn.addActionListener(e -> addProduct());
        viewBtn.addActionListener(e -> viewProducts());
        updateBtn.addActionListener(e -> updateQuantity());
        deleteBtn.addActionListener(e -> deleteProduct());
    }

    private void addProduct() {
        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            int qty = Integer.parseInt(qtyField.getText());
            double price = Double.parseDouble(priceField.getText());

            service.addProduct(new Product(id, name, qty, price));
            outputArea.setText("Product added successfully.");

        } catch (Exception e) {
            outputArea.setText("Invalid input.");
        }
    }

    private void viewProducts() {
        outputArea.setText("");
        for (Product p : service.getAllProducts()) {
            outputArea.append(p + "\n");
        }
    }

    private void updateQuantity() {
        try {
            int id = Integer.parseInt(idField.getText());
            int qty = Integer.parseInt(qtyField.getText());
            service.updateQuantity(id, qty);
            outputArea.setText("Quantity updated.");
        } catch (Exception e) {
            outputArea.setText("Invalid input.");
        }
    }

    private void deleteProduct() {
        try {
            int id = Integer.parseInt(idField.getText());
            service.deleteProduct(id);
            outputArea.setText("Product deleted.");
        } catch (Exception e) {
            outputArea.setText("Invalid input.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new InventoryGUI().setVisible(true);
        });
    }
}
