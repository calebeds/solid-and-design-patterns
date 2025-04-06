package singletonpattern;

public class SingletonPatternExample {
    public static void main(String[] args) {
        DatabaseConnector object1 = DatabaseConnector.getInstance();
        DatabaseConnector object2 = DatabaseConnector.getInstance();

        if(object1 == object2) {
            System.out.println("the objects are the same ");
        }
    }
}
