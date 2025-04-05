package dependencyinversion;

// this is the abstract layer
public interface Database {
    void connect();
    void disconnect();
}
