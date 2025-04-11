package behavioraldesignpatterns.nullobjectpattern;

public class NullObjectPattern {
    public static void main(String[] args) {
        CustomerFactory factory = new CustomerFactory();

        System.out.println(factory.getCustomer("Joe").get());
        System.out.println(factory.getCustomer("Kevin").get());
    }
}
