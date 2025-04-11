package structuraldesignpatterns.decorator;

public class DecoratorExample {
    public static void main(String[] args) {
        Beverage beverage = new Capuccino(new Sugar(new Sugar(new Milk(new PlainBeverage()))));
        System.out.println(beverage.getCost());
        System.out.println(beverage.getDescription());
    }
}
