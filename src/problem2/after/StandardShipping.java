package problem2.after;

public class StandardShipping implements ShippingMethod {
    public String name() {
        return "STANDARD";
    }
    public double cost(double weightKg) {
        return 20 + 5 * weightKg;
    };
}
