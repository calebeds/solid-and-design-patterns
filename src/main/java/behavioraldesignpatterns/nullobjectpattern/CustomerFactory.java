package behavioraldesignpatterns.nullobjectpattern;

public class CustomerFactory {
    private Database database;

    public CustomerFactory() {
        this.database = new Database();
    }

    public AbstractCustomer getCustomer(String name) {
        if(customerExists(name)) {
            return new RealCustomer(name);
        } else {
            return new NullCustomer();
        }
    }

    private boolean customerExists(String name) {
        return database.exist(name);
    }
}
