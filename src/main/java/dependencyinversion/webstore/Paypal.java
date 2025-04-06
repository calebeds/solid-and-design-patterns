package dependencyinversion.webstore;

// low-level modules
public class Paypal implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paying with paypal...");
    }
}
