package src.Product2;

public class Product2 {

    private String name;
    private double price;
    private int quantity;

    // Construtor com todos os parâmetros
    public Product2(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Construtor com sobrecarga
    public Product2(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0; // inicializa a quantidade como 0
    }

    public void setName(String name) {
        this.name = name;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f", totalValueInStock());
    }
}
