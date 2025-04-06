package singletonpattern;

public class DatabaseConnector {
    // eager version
    private static DatabaseConnector INSTANCE = new DatabaseConnector();

    // we are not able to instantiate the class
    private DatabaseConnector() {

    }

    public static DatabaseConnector getInstance() {
        return INSTANCE;
    }

    public void connect() {
        System.out.println("Connecting to the databse");
    }

    public void disconnect() {
        System.out.println("Disconnecting...");
    }
}
