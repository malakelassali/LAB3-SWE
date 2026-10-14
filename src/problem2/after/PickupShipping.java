package problem2.after;

public class PickupShipping implements ShippingMethod {
    public String name() {
        return "PICKUP";
    }
    public double cost(double weightKg) {
        return (weightKg < 5 ? 0 : 10);
    };
}
