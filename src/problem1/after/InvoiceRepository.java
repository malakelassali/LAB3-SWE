package problem1.after;

import java.io.FileWriter;
import java.io.IOException;

public class InvoiceRepository {
    private InvoicePrinter printer= new InvoicePrinter();

    public void save(InvoiceData data) throws IOException {
        try (FileWriter fw = new FileWriter(data.getCustomer() + ".txt")) {
            fw.write(printer.print(data));
        }
    }
}
