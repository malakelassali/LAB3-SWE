package problem2.after;

public class Parcel {
    private double weightKg;
    double shippingCost(ShippingMethod method) {
        return method.cost(weightKg);
    }
}
