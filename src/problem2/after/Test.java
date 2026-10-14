package problem2.after;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<ShippingMethod> methods= new ArrayList<>();
        methods.add(new StandardShipping());
        methods.add(new ExpressShipping());
        methods.add(new DroneShipping());
        methods.add(new PickupShipping());

        Parcel parcel= new Parcel(2);

        for (ShippingMethod method : methods) {
            System.out.println(
                    method.name() + ": "  +
                    parcel.shippingCost(method) + " MAD");
        }
    }
}