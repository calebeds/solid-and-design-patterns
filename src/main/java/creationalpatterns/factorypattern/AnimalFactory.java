package creationalpatterns.factorypattern;

public class AnimalFactory {
    public static Animal getAnimal(AnimalType type) {
        if(type == AnimalType.CAT) {
            return new Cat();
        } else if (type == AnimalType.DOG) {
            return new Dog();
        } else if(type == AnimalType.LION) {
            return new Lion();
        } else if(type == AnimalType.TIGER) {
            return new Tiger();
        } else {
            return null;
        }
    }
}
