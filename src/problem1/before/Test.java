package problem1.before;

public class Test {

    public static void main(String[] args) {
        Invoice inv= new Invoice("ALAMI Samir");
        inv.addLine("Laptop", 9000);
        inv.addLine("Mouse", 150);
        inv.addLine("USB cable", 50);
        System.out.println(inv.print());
    }
}
