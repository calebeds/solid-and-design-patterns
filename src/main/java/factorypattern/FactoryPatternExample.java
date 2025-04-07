package factorypattern;

public class FactoryPatternExample {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(AnimalType.LION);
        animal.eat();
    }
}
