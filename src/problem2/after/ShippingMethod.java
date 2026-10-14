package problem2.after;

public interface ShippingMethod {
    String name();
    double cost(double weightKg);
}
