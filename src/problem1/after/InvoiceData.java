package problem1.after;

import java.util.ArrayList;
import java.util.List;

public class InvoiceData {
    private final String customer;
    private final List<InvoiceLine> lines;
    public InvoiceData(String customer) {
        this.customer = customer;
        this.lines= new ArrayList<>();
    }

    public void addLine(String item, double price) {
        lines.add(new InvoiceLine(item, price));
    }

    public String getCustomer() {
        return customer;
    }
    public List<InvoiceLine> getLines() {
        return List.copyOf(lines);
    }


}