package problem1.before;

import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;


public class Invoice {
    private final String customer;
    private final List<String> items = new ArrayList<>();
    private final List<Double> prices = new ArrayList<>();
    public Invoice(String customer) { this.customer = customer; }
    public void addLine(String item, double price) {
        items.add(item);
        prices.add(price);
    }
    private double subtotal() {
        double sum = 0;
        for (double p : prices) sum += p;
        return sum;
    }
    public double total() { // 20% VAT
        return subtotal() * 1.20;
    }
    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice for ").append(customer).append("\n");
        for (int i = 0; i < items.size(); i++)
            sb.append(line(items.get(i), prices.get(i)));
        sb.append(line("Subtotal", subtotal()));
        sb.append(line("TOTAL", total()));
        return sb.toString();
    }
    private String line(String label, double value) {
        return String.format("%-12s %8.2f%n", label, value);
    }
    public void save() throws IOException {
        try (FileWriter fw = new FileWriter(customer + ".txt")) {
            fw.write(print());
        }
    }
}