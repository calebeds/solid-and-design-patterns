package behavioraldesignpatterns.nullobjectpattern;

public class RealCustomer extends AbstractCustomer {

    private final String customerName;

    public RealCustomer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String get() {
        return customerName;
    }
}
