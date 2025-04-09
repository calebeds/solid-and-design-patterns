package solid.dependencyinversion;

// low-level module
public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to a MYSQL database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting the MYSQL database...");
    }
}
