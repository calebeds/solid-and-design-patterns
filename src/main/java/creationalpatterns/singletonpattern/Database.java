package creationalpatterns.singletonpattern;

public enum Database {
    // acquiring the instance is thread-safe
    INSTANCE;

    public void connect() {
        System.out.println("Connecting to the database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting the database...");
    }
}
