package problem1.after;

public class Test {
    public static void main(String[] args) {
        InvoiceData inv= new InvoiceData("ALAMI Samir");
        inv.addLine("Laptop", 9000);
        inv.addLine("Mouse", 150);
        inv.addLine("USB cable", 50);
        InvoicePrinter printer= new InvoicePrinter();
        System.out.println(printer.print(inv));
    }
}
