package problem2.after;

public class ExpressShipping implements ShippingMethod {
    public String name() {
        return "EXPRESS";
    }
    public double cost(double weightKg) {
        return 50 + 8 * weightKg;
    };
}