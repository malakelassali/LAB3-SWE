package problem1.after;

import java.util.List;

public class InvoicePrinter {
    private InvoiceCalculator calculator= new InvoiceCalculator();

    public String print(InvoiceData data) {
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice for ").append(data.getCustomer()).append("\n");
        List<InvoiceLine> lines= data.getLines();
        for (int i = 0; i < lines.size(); i++)
            sb.append(line(lines.get(i).item(), lines.get(i).price()));
        sb.append(line("Subtotal", calculator.subtotal(data)));
        sb.append(line("TOTAL", calculator.total(data)));
        return sb.toString();
    }

    private String line(String label, double value) {
        return String.format("%-12s %8.2f%n", label, value);
    }
}
