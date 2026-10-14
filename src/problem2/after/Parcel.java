package problem2.after;

public class Parcel {
    private double weightKg;
    public Parcel(double weightKg) {
        this.weightKg= weightKg;
    }
    double shippingCost(ShippingMethod method) {
        return method.cost(weightKg);
    }
}
