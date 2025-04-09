package solid.dependencyinversion.webstore;

// low-level modules
public class Payoneer implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paying with payoneer...");
    }
}
