package creationalpatterns.abstractfactory;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory("ELECTRIC");
        factory.getCar("FORD").assemble();
    }
}
