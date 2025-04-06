package singletonpattern;

public class SingletonPatternExample {
    public static void main(String[] args) {
        DatabaseConnector.getInstance().connect();
    }
}
