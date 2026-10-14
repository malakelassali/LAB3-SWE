package problem2.after;

public class DroneShipping implements ShippingMethod {
    public String name() {
        return "DRONE";
    }
    public double cost(double weightKg) {
        if (weightKg > 2) throw new IllegalArgumentException("Too heavy");
        return 80;
    };
}