package behavioraldesignpatterns.nullobjectpattern;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<String> customerNames;

    public Database() {
        this.customerNames = new ArrayList<>();
        this.customerNames.add("Adam");
        this.customerNames.add("Joe");
        this.customerNames.add("Michael");
        this.customerNames.add("Daniel");
        this.customerNames.add("Ana");
    }

    public boolean exist(String name) {
        for (String customer: customerNames) {
            if(customer.equals(name)) {
                return true;
            }
        }

        return false;
    }
}
