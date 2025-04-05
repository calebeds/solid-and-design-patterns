package dependencyinversion;

public class DependencyInversionExample {
    public static void main(String[] args) {
        DatabaseController databaseController = new DatabaseController(new MySQLDatabase());
        databaseController.connect();
    }
}
