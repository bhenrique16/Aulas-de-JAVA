package entities;

public class CurrencyConverter {
    public double dolarPrice;
    public double dolarQuantity;
    public double TAX = 0.06;

    public double Conversor() {
        double total = dolarPrice * dolarQuantity;
        return total + (total * TAX);
    }
}
