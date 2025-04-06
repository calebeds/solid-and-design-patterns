package singletonpattern;

public class SingletonPatternExample {
    public static void main(String[] args) {
        Database.INSTANCE.connect();
        Database.INSTANCE.disconnect();

        Database object1 = Database.INSTANCE;
        Database object2 = Database.INSTANCE;

        if(object1 == object2) {
            System.out.println("The objects are the same");
        }
    }
}
