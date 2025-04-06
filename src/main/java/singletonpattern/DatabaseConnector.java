package singletonpattern;

public class DatabaseConnector {
    // lazy version
    private static DatabaseConnector INSTANCE;

    // we are not able to instantiate the class
    private DatabaseConnector() {

    }

    public static DatabaseConnector getInstance() {
        // we just instantiate the class if necessary
        if(INSTANCE == null) {
            INSTANCE = new DatabaseConnector();
        }

        return INSTANCE;
    }

    public void connect() {
        System.out.println("Connecting to the databse");
    }

    public void disconnect() {
        System.out.println("Disconnecting...");
    }
}
